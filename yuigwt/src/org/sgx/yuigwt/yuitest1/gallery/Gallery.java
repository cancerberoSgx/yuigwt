package org.sgx.yuigwt.yuitest1.gallery;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.dd.DragConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.io.IO;
import org.sgx.yuigwt.yui.io.IOConfig;
import org.sgx.yuigwt.yui.io.IOEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.stylesheet.StyleSheet;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteEvent;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.panel.Panel;
import org.sgx.yuigwt.yui.widget.panel.PanelConfig;
import org.sgx.yuigwt.yui.widget.tabview.TabConfig;
import org.sgx.yuigwt.yui.widget.tabview.TabView;
import org.sgx.yuigwt.yui.widget.tabview.TabViewConfig;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.accordion.Accordion;
import org.sgx.yuigwt.yuigallery.accordion.AccordionConfig;
import org.sgx.yuigwt.yuigallery.accordion.AccordionItem;
import org.sgx.yuigwt.yuigallery.accordion.AccordionItemConfig;
import org.sgx.yuigwt.yuitest1.gallery.intl.GalleryIntlConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.GalleryResource;
import org.sgx.yuigwt.yuitest1.gallery.test.Test;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourceCallback;
import com.google.gwt.resources.client.ResourceException;
import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.Window;

/**
 * yuigwt example gallery - a pure yuigwt web application (not gwt widgets or
 * gwt dom at all). This class shows the yuigwt example gallery. It uses YUI in
 * java thanks to yuigwt. In particular are used buttons, cssgrids, panel and
 * node.
 * 
 * @author sg
 * 
 */
public class Gallery implements YUICallback {
	private static Gallery _instance = null;

	/**
	 * please use only for dirty stuff...
	 * 
	 * @return
	 */
	public static Gallery instance() {
		return _instance;
	}

	private Node mainPanel, mainContent, navContent, extraContent, footer;
	private GalleryUtil util;
	private StyleSheet ssheet1;
	private YuiGalleryContext Y;
	public static final GalleryIntlConstants constants = GWT.create(GalleryIntlConstants.class);

	public Gallery() {
		_instance = this;
		util = new GalleryUtil(this);
	}

	public void draw() {
		util.loadYui(this);
	}

	@Override
	public void ready(final YuiContext Y_) {
		this.Y = Y_.cast();

		Node body = Y.one("body");
		// Document.get().getBody().addClassName("yui3-skin-sam");
		body.addClass("yui3-skin-sam");

		// create a dyn stylesheet
		ssheet1 = Y.newStyleSheet();

		// set the YUI skin to use
		body.addClass("yui3-skin-sam");

		mainPanel = body.one("#layout");
		navContent = body.one("#nav>.content");
		mainContent = body.one("#main>.content");
		mainContent.getDOMNode().setId("main-example-panel");
		extraContent = body.one("#extra>.content");
		footer = body.one("#ft");

		drawTestNav(Y);

		// //java source button
		Button showJavaButton = Y.newButton(Button.config().label(constants.showJava()).render(extraContent).on("click", new EventCallback() {
			@Override
			public void call(EventFacade e) {
				doShowCurrentTestSources2();
			}
		}));
		showJavaButton.srcNode().setStyles(Style.create().fontSize("1.2em").fontWeight("bolder").textDecoration("underline").margin("10px 0px"));

		// test description button
		Button descrButton = Y.newButton(Button.config().label("Test description")).render(extraContent).on("click", new EventCallback() {
			@Override
			public void call(EventFacade e) {
				showCurrentTestDescription(Y);
			}
		}).cast();
		// descrButton.contentBox().setStyle("width", "100%");

		// this gallery sources button
		Button showSurceButton = Y.newButton(Button.config().label(constants.thisExampleGallerySources())).render(extraContent).on("click", new EventCallback() {
			@Override
			public void call(EventFacade e) {
				Map<String, ResourcePrototype> r = new HashMap<String, ResourcePrototype>();
				r.put(constants.thisExampleGallerySources(), TestResources.instance.Gallery());
				doShowSources2(r);
				// showJavaSource2(Y, TestResources.instance.Gallery(),
				// constants.thisExampleGallerySources(), 0);
			}
		}).cast();
		// showSurceButton.contentBox().setStyle("width", "100%");

		Button aboutButton = Y.newButton(Button.config().label("About")).render(extraContent).on("click", new EventCallback() {
			@Override
			public void call(EventFacade e) {
				showAboutThisApplication(Y);
			}
		}).cast();
		// aboutButton.contentBox().setStyle("width", "100%");

		util.checkUrl();

		installHeightHack(Y);
	}


	public void doShowSources2(Map<String, ResourcePrototype> r) {
		List<GalleryResource> resources = new LinkedList<GalleryResource>();

		for (String resName : r.keySet()) {
			ResourcePrototype res = util.getCurrentTest().getTestResources().get(resName);
			resources.add(new GalleryResource(res, resName));
		}
		showJavaSource2(Y, resources);
	}

	public void doShowCurrentTestSources2() {
		doShowSources2(util.getCurrentTest().getTestResources());
	}

	private void drawTestNav(YuiGalleryContext Y) {

		String[] allTestNames = new String[util.getTests().size()];
		int i = 0;
		for (Test t : util.getTests()) {
			allTestNames[i] = t.getName();
			i++;
		}
		getNavContent().append("<span>Filter by name: </span><br/>");
		final Node inputEl = getNavContent().appendChild("<input type=\"text\"></input>");

		inputEl.setStyles(Style.create().width("90%"));
		AutoComplete ac = Y.newAutoComplete(AutoCompleteConfig.create().resultHighlighter("phraseMatch").resultFilters("phraseMatch").inputNode(inputEl).source(allTestNames)
				.render(true));
		ac.after(AutoComplete.EVENT_SELECT, new EventCallback<AutoCompleteEvent>() {
			@Override
			public void call(AutoCompleteEvent e) {
				Test test = util.getTestByName(inputEl.get("value"));
				setCurrentTest(test);
			}
		});

		TabView tb = Y.newTabView(TabViewConfig.create(new TabConfig[] {
				// TabConfig.create().label("Categories TreeView").content("<div id=\"testcategoriesTreeView\"></div>"),
				TabConfig.create().label("Categories Accordion").content("<div id=\"testcategories\"></div>"),
				TabConfig.create().label("all").content("<div id=\"testall\"></div>") }));
		tb.render(getNavContent());

		getNavContent().setStyles(Style.create().overflow("scroll"));

		drawAccordionTest(Y, Y.one("#testcategories"));
		drawAllTest(Y, Y.one("#testall"));

		tb.selectChild(0);

	}

	private void drawAllTest(YuiGalleryContext Y, Node parent) {

		for (final Test test : util.getTests()) {
			Y.newButton(Button.config().label(test.getName()).render(parent).on("click", new EventCallback() {
				@Override
				public void call(EventFacade e) {
					setCurrentTest(test);
				}
			}));
		}
	}

	private void drawAccordionTest(YuiGalleryContext Y, Node parent) {
		Accordion acc1 = Y.newAccordion(AccordionConfig.create().useAnimation(true).reorderItems(true));
		acc1.render(parent);

		Map<String, Set<Test>> testByTag = util.getTestsByTag();

		for (int i = 0; i < GalleryConstants.ALL_TAGS.length; i++) {
			String tag = GalleryConstants.ALL_TAGS[i];
			Set<Test> tests = testByTag.get(tag);
			if (tests == null)
				continue;
			AccordionItem item1 = Y.newAccordionItem(AccordionItemConfig.create().label(tag).contentHeight("fixed", 80));
			String parentId = "parent-" + tag;
			item1.set("bodyContent", "<div class=\"parent-tag\" id=\"" + parentId + "\"></div>");

			acc1.addItem(item1);

			Node testParent = Y.one("#" + parentId);
			for (final Test test : tests) {
				Y.newButton(Button.config().label(test.getName()).render(testParent).on("click", new EventCallback() {
					@Override
					public void call(EventFacade e) {
						setCurrentTest(test);
					}
				}));
			}
		}
	}

	private void drawTreeviewTest(YuiGalleryContext Y, Node parent) {

		// testcategoriesTreeView

	}

	// dialog helpers usng panel

	// /**
	// * shows the java source panel
	// * @param Y
	// * @param resName
	// */
	// public void showJavaSource(final YuiContext Y, ResourcePrototype res,
	// final String resName, final int index) {
	// util.getText(res, new ResourceCallback<TextResource>() {
	// @Override
	// public void onError(ResourceException e) {
	// e.printStackTrace(); //TODO
	// Window.alert("show java source error: "+e);
	// }
	// @Override
	// public void onSuccess(TextResource resource) {
	// String scapedContent = Y.Escape().html(resource.getText().replace("\t",
	// "  "));
	// String header = resName+"&nbsp;<b>Source Code File</b>";
	// String body =
	// "<pre style=\"width: 100%; overflow: scroll; height: 360px\" class=\"prettyprint\">"+
	// scapedContent+"</pre>";
	//
	// Panel panel = showPanel(Y, header, body);
	// Node pn = panel.srcNode();
	// pn.setX(pn.getX()+(80*index));
	// pn.setY(pn.getY()+(50*index));
	//
	// // now make this panel draggable by its header
	// panel.plug(Y.Plugin().Drag(), DragConfig.create().handles(new String[] {
	// ".yui3-widget-hd" }));
	//
	// }
	// });
	//
	// util.prettyPrint();
	// }

	// boolean showJavaSourceError=false;
	/**
	 * shows the java source panel
	 * 
	 * @param Y
	 * @param resName
	 */
	public void showJavaSource2(final YuiContext Y, List<GalleryResource> resources) {
		// showJavaSourceError=false;
		final List<String> headers = new LinkedList<String>();
		final List<String> bodies = new LinkedList<String>();

		// for (int i = 0; i < resources.size(); i++) {
		for (GalleryResource resource : resources) {
			// final GalleryResource resource = resources[i];
			final String resName = resource.getName();
			ResourcePrototype res = resource.getResource();

			util.getText(res, new ResourceCallback<TextResource>() {
				@Override
				public void onError(ResourceException e) {
					// showJavaSourceError=true;
					e.printStackTrace(); // TODO
					Window.alert("show java source error: " + e);
				}

				@Override
				public void onSuccess(TextResource resource) {
					String scapedContent = Y.Escape().html(resource.getText().replace("\t", "  "));
					String header = resName; // + "&nbsp;<b>Source Code File</b>";
					String body = "<pre style=\"width: 100%; overflow: scroll; height: 350px\" class=\"prettyprint\">" + scapedContent + "</pre>";

					headers.add(header);
					bodies.add(body);

					// Panel panel = showPanel(Y, header, body);
					// Node pn = panel.srcNode();
					// pn.setX(pn.getX()+(80*index));
					// pn.setY(pn.getY()+(50*index));
					//
					// // now make this panel draggable by its header
					// panel.plug(Y.Plugin().Drag(),
					// DragConfig.create().handles(new String[] {
					// ".yui3-widget-hd" }));

				}
			});

		}

		Panel panel = showPanel2(Y, headers, bodies);
		// Node pn = panel.srcNode();
		// pn.setX(pn.getX()+(80*index));
		// pn.setY(pn.getY()+(50*index));

		// now make this panel draggable by its header
		// panel.plug(Y.Plugin().Drag(), DragConfig.create().handles(new
		// String[] { ".yui3-widget-hd" }));

		util.prettyPrint();
	}

	/**
	 * shows the test deescription panel
	 * 
	 * @param Y
	 */
	public void showCurrentTestDescription(YuiContext Y) {
		showPanel(Y, "<b>" + util.getCurrentTest().getName() + "</b> description",
				"<div style=\"width: 100%; overflow: scroll; height: 360px\">" + Y.Escape().html(util.getCurrentTest().getDescription()) + "</div>");
	}

	/**
	 * shows the "about this app" panel
	 * 
	 * @param Y
	 */
	public void showAboutThisApplication(final YuiContext Y) {
		String aboutUri = GWT.getModuleBaseURL() + "galleryfiles/about.fragment.html";
		Y.newIO().send(aboutUri, IOConfig.create().on(IO.EVENT_SUCCESS, new EventCallback<IOEvent>() {
			@Override
			public void call(IOEvent e) {
				showPanel(Y, "About This Application " + constants.hello(), e.data().responseText());
			}
		}));
	}

	public Panel showPanel(YuiContext Y, String headerContent, String bodyContent) {
		Node parent = Y.one("body");
		Node parentBody = parent.appendChild("<p></p>");
		final Panel panel1 = Y.newPanel((PanelConfig) PanelConfig.create()
		// .centered(true)
				.srcNode(parentBody).width("70%").height("400px").render(true));

		panel1.headerContent(headerContent);
		panel1.bodyContent(bodyContent);
		panel1.contentBox().setStyle("zIndex", 99999);
		panel1.contentBox().setY(10).setX(10);// Math.max(panel1.contentBox().getY()-100,
												// 5));
		return panel1;
	}

	public Panel showPanel2(YuiContext Y, List<String> headerContent, List<String> bodyContent) {

		// how to put a tabview inside a panel ? create two anidated html els,
		// first render the tb in the
		// most inner one and then render the panel in the outer one and set
		// bodyContent to the tabview's element.
		// see http://jsfiddle.net/cancerbero_sgx/uEPvq/6/

		Node parent = Y.one("body");
		Node panelEl = parent.appendChild("<div></div>");
		Node tbEl = panelEl.appendChild("<div></div>");

		// first, render the tabview
		TabConfig[] tabConfig = new TabConfig[headerContent.size()];

		for (int i = 0; i < tabConfig.length; i++) {
			String header = headerContent.get(i); // [i];
			String body = bodyContent.get(i); // [i];
			tabConfig[i] = TabConfig.create().label(header).content(body);
		}
		final TabView tb = Y.newTabView(TabViewConfig.create(tabConfig));
		tb.render(tbEl);

		// now render the panel
		PanelConfig panelConfig = (PanelConfig) PanelConfig.create().centered(true).srcNode(panelEl).width("80%").height("450px");
		panelConfig.headerContent("Example Sources");
		panelConfig.bodyContent(tbEl);
		final Panel panel1 = Y.newPanel(panelConfig);
		// panel1.contentBox().setY(0);
		panel1.render();

		// make it draggable by the header.
		panel1.plug(Y.Plugin().Drag(), DragConfig.create().handles(new String[] { ".yui3-widget-hd" }));
		return panel1;
	}

	// a helper for updating the layout height on window resize.

	final static int vdiff = 105;
	final static String sel = "#nav .content, #main .content, #extra .content";

	private void installHeightHack(final YuiContext Y) {
		Y.on("windowresize", new EventCallback() {
			@Override
			public void call(EventFacade e) {
				ssheet1.set(sel, Style.create().height((getMainContent().winHeight() - vdiff) + "px"));
			}
		});
		ssheet1.set(sel, Style.create().height((getMainContent().winHeight() - vdiff) + "px"));
	}

	// run all test together in the same container
	public void runAllTestTogether(Node parent) {
		int counter = 0;
		for (Test test : util.getTests()) {
			// first add some test information
			parent.append("<h3>Test named " + test.getName() + "</h3>" + "<p><b>Description</b>: " + test.getDescription() + "<div id=\"test-container-" + counter + "\"></div>");
			counter++;
		}
	}

	// accessors

	public void setCurrentTest(Test test) {
		getMainContent().empty();
		test.test(Gallery.this.getMainContent());
		util.setCurrentTest(test);
	}

	public Node getMainContent() {
		return mainContent;
	}

	public void setMainContent(Node mainContent) {
		this.mainContent = mainContent;
	}

	public Node getNavContent() {
		return navContent;
	}

	public GalleryUtil getUtil() {
		return util;
	}

}
