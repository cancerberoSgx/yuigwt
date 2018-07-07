package org.sgx.yuigwt.yuitest1.gallery;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Callback;
import org.sgx.yuigwt.yui.util.Util;
import org.sgx.yuigwt.yui.yui.Timer;
import org.sgx.yuigwt.yuitest1.gallery.test.AnimTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.AutoCompleteTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.AyncQueueTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.ButtonTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.CacheTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.CalendarTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.ChartsTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.ChartsTest2;
import org.sgx.yuigwt.yuitest1.gallery.test.CollectionTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.ConfigObjectsTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.ConsoleTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.CookieTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.CssGridsTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.DataSchemaArrayTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.DataSchemaXMLTable1;
import org.sgx.yuigwt.yuitest1.gallery.test.DataSourceTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.DataTableTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.DataTableTest2;
import org.sgx.yuigwt.yuitest1.gallery.test.DataTableTest3;
import org.sgx.yuigwt.yuitest1.gallery.test.DataTypeTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.DialTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.DragAndDropTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.EditorBaseTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.EventDelegateTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.EventSimulateTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.FunctionsInJavaTest;
import org.sgx.yuigwt.yuitest1.gallery.test.GWTWidgetTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.GetTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.HandlebarsTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.HistoryTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.IOTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.ImageLoaderTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.IntlTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.JSONTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.MenuNavTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.NodeFocusManagerTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.NodeLoadTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.NodeTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.OverlayTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.PJaxTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.PanelTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.ResizeTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.RouterTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.ScrollViewTest;
import org.sgx.yuigwt.yuitest1.gallery.test.ScrollViewTest2;
import org.sgx.yuigwt.yuitest1.gallery.test.SliderTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.SortableTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.StyleSheetTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.SubstituteTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.TabViewTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.Test;
import org.sgx.yuigwt.yuitest1.gallery.test.TestTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.TransitionTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.UploaderTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.YUIUtilTest1;
//import org.sgx.yuigwt.yuitest1.gallery.test.editors.BeanEditorTest1;
//import org.sgx.yuigwt.yuitest1.gallery.test.editors.BooleanEditorTest1;
//import org.sgx.yuigwt.yuitest1.gallery.test.editors.CrudExample1;
//import org.sgx.yuigwt.yuitest1.gallery.test.editors.PropertyHaverEditorTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.gal.AccordionTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.gal.ColorPickerTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.gal.DeferredTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.gal.FormTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.gal.ITSASelectlistTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.gal.ImageCropperTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.gal.NodeTransform2dTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.gal.TokenInputPluginTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.gal.TreeViewTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.gal.TreeViewTest2;
import org.sgx.yuigwt.yuitest1.gallery.test.gal.TreeViewTest3_yui3treeviewng;
import org.sgx.yuigwt.yuitest1.gallery.test.graphic.GraphicTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.jyui.JYuiTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.jyui.JYuiTest2;
import org.sgx.yuigwt.yuitest1.gallery.test.uibinder.ApplyDifferentXMLTest;
import org.sgx.yuigwt.yuitest1.gallery.test.uibinder.UIBinderAloneAutocompleteTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.uibinder.NestedWidget1Test;
import org.sgx.yuigwt.yuitest1.gallery.test.uibinder.UIBinderAloneButtonTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.uibinder.UIBinderComposingTest;
import org.sgx.yuigwt.yuitest1.gallery.test.uibinder.UsingCompositeDirectlyTest;
import org.sgx.yuigwt.yuitest1.gallery.test.uibinder.UIBinderTest2;
import org.sgx.yuigwt.yuitest1.gallery.test.uibinder.gwt.GwtWidgetsTest2;
import org.sgx.yuigwt.yuitest1.gallery.test.uibinder.userguide.UIBinderUserGuideTest;
import org.sgx.yuigwt.yuitest1.gallery.test.yql.YQLDescTableTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.yql.YQLStorageTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.yql.YQLTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.yql.YQLYuiGalleryTest1;
import org.sgx.yuigwt.yuitest1.gallery.test.yuigwtmanual.MainPanelTest;

import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.resources.client.ExternalTextResource;
import com.google.gwt.resources.client.ResourceCallback;
import com.google.gwt.resources.client.ResourceException;
import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.Window;

public class GalleryUtil {
	private static GalleryUtil _instance;
	Set<Test> tests;
	Test currentTest;
	private Gallery g;
	protected YuiContext Y;
	private static Timer timer;

	public static GalleryUtil getDefaultInstance() {
		if (_instance == null)
			_instance = new GalleryUtil(null);
		return _instance;
	}

	public GalleryUtil(Gallery g) {
		this.g = g;
		tests = new HashSet<Test>();

		// YUI modules

		tests.add(new ButtonTest1());
		tests.add(new YUIUtilTest1());
		tests.add(new MenuNavTest1());
		tests.add(new EventDelegateTest1());
		tests.add(new SliderTest1());
		tests.add(new PanelTest1());
		tests.add(new OverlayTest1());
		tests.add(new GetTest1());
		tests.add(new DataTableTest1());
		tests.add(new TabViewTest1());
		tests.add(new ConfigObjectsTest1());
		tests.add(new EventSimulateTest1());
		tests.add(new PJaxTest1());
		tests.add(new AnimTest1());
		tests.add(new ConsoleTest1());
		tests.add(new StyleSheetTest1());
		tests.add(new SubstituteTest1());
		tests.add(new CacheTest1());
		tests.add(new CookieTest1());
		tests.add(new ImageLoaderTest1());
		tests.add(new CalendarTest1());
		tests.add(new AutoCompleteTest1());
		tests.add(new DataSchemaArrayTest1());
		tests.add(new DataTypeTest1());
		tests.add(new AyncQueueTest1());
		tests.add(new IOTest1());
		tests.add(new CollectionTest1());
		tests.add(new TransitionTest1());
		tests.add(new EditorBaseTest1());
		tests.add(new HistoryTest1());
		tests.add(new ChartsTest1());
		tests.add(new ChartsTest2());
		tests.add(new NodeFocusManagerTest1());
		tests.add(new ScrollViewTest());
		tests.add(new ScrollViewTest2());
		tests.add(new NodeLoadTest1());
		tests.add(new ResizeTest1());
		tests.add(new JSONTest1());
		tests.add(new FunctionsInJavaTest());
		tests.add(new DataTableTest2());
		tests.add(new HandlebarsTest1());
		tests.add(new DataSourceTest1());
		tests.add(new IntlTest1());
		tests.add(new SortableTest1());
		tests.add(new DragAndDropTest1());
		// tests.add(new BaseExtendTest1());
		tests.add(new TestTest1());
		tests.add(new GWTWidgetTest1());
		tests.add(new CssGridsTest1());
		tests.add(new DataTableTest3());
		// tests.add(new DataSourceTest2());
		tests.add(new DialTest1());
		// tests.add(new GWTWidgetTest2());
		tests.add(new NodeTest1());
		tests.add(new DataSchemaXMLTable1());
		tests.add(new RouterTest1());
		tests.add(new UploaderTest1());
		
		
		// graphic example
		tests.add(new GraphicTest1());

		
		// uibinder
		tests.add(new UsingCompositeDirectlyTest());
		tests.add(new UIBinderTest2());
		tests.add(new UIBinderAloneButtonTest1());
		tests.add(new UIBinderUserGuideTest());
		tests.add(new NestedWidget1Test());
		tests.add(new UIBinderComposingTest());
		tests.add(new MainPanelTest());
		tests.add(new UIBinderAloneAutocompleteTest1());
		tests.add(new ApplyDifferentXMLTest());
		
		
		
		
		// YUI gallery modules
		tests.add(new AccordionTest1());
		tests.add(new TreeViewTest1());
		tests.add(new FormTest1());
		tests.add(new TokenInputPluginTest1());
		tests.add(new NodeTransform2dTest1());
		tests.add(new ImageCropperTest1());
		tests.add(new ColorPickerTest1());
		tests.add(new DeferredTest1());
		tests.add(new TreeViewTest2());
		tests.add(new ITSASelectlistTest1());
		// tests.add(new DataTableColumnResizeTest1());
		// tests.add(new BootstrapDropdown1());
		tests.add(new TreeViewTest3_yui3treeviewng());

		// YQL
		tests.add(new YQLTest1());
		tests.add(new YQLDescTableTest1());
		tests.add(new YQLYuiGalleryTest1());
		tests.add(new YQLStorageTest1());

		// editor
//		tests.add(new BooleanEditorTest1());
//		tests.add(new PropertyHaverEditorTest1());
//		tests.add(new BeanEditorTest1());
//		tests.add(new CrudExample1());

		// jyui
		tests.add(new JYuiTest1());
		tests.add(new JYuiTest2());
		
		tests.add(new GwtWidgetsTest2());
		

		_instance = this;
	}

	/**
	 * return a mapJavaToJs tagName -> Set of test Test - test grouped by tag.
	 * 
	 * @return
	 */
	public Map<String, Set<Test>> getTestsByTag() {
		Map<String, Set<Test>> m = new HashMap<String, Set<Test>>();
		for (Test test : tests) {
			for (int i = 0; i < test.getTags().length; i++) {
				String tag = test.getTags()[i];
				if (!m.containsKey(tag))
					m.put(tag, new HashSet<Test>());
				m.get(tag).add(test);
			}
		}
		return m;
	}

	public Set<Test> getTests() {
		return tests;
	}

	public Test getCurrentTest() {
		return currentTest;
	}

	public void setCurrentTest(Test currentTest) {
		this.currentTest = currentTest;
	}

	public void setTests(Set<Test> tests) {
		this.tests = tests;
	}

	/**
	 * check for a test=testName paraemter passed in the url and show that test if that is the case.
	 */
	public void checkUrl() {
		String url = Util.getCurrentAddressUrl(); 
		Map<String, String> urlParams = Util.parseUrlParams(url);
		boolean found = false;
		if (urlParams.containsKey("test")) {
			String paramTestName = urlParams.get("test"); //, anchor = null;
			for (Test t : tests) {
//				if (paramTestName.contains("#")) {
//					String[] a = paramTestName.split("#");
//					paramTestName = a[0];
//					anchor = a[1];
//				}
				if (t.getName().equals(paramTestName)) {
					found = true;
					g.setCurrentTest(t);
					
						
					break;
				}
			}
			if (!found) {
				Window.alert("test " + urlParams.get("test") + " not found. ");
				return;
			}
			
			checkAnchors(Y); 
			
			
			if (urlParams.containsKey("showSources")) {
				g.doShowCurrentTestSources2();
			}
		}

	}

	public static void checkAnchors(final YuiContext Y) {
		String url = Util.getCurrentAddressUrl(); 
//		url = Util.parseUrlParams(url); 
		int l = url.lastIndexOf("#"); 
		if(l!=-1) {
			final String anchor = url.substring(l, url.length()); 
//			Node n = Y.one("#" + anchor);
//			Callback fn = ; 
			timer = Y.later(2000, new Callback() {
				
				
				public void call(JsArrayMixed args) {
					Node n = Y.one(anchor);
//					System.out.println("later: "+anchor+" - "+n);
					if(n!=null) {
//						System.out.println("anchored: "+n);
						n.scrollIntoView(true);
//						n.setStyle("background-color", "red"); 
						timer.cancel(); 
					}
				}
			}, JsArrayMixed.createArray(), true); 
		}
	}

	public void loadYui(final YUICallback c) {

		YUI.YUI(
		// YuiConfig.create().
		// base(GalleryConstants.YUI_BUILD_PATH).
		// gallery(GalleryConstants.LATEST_BUILD)
		).use(GalleryConstants.GALLERY_MODULES, new YUICallback() {
			
			public void ready(YuiContext Y) {
				GalleryUtil.this.Y = Y;
				c.ready(Y);
			}
		});

		// YUI.YUI(YuiConfig.create().base(AlloyuiGalleryConstants.YUI_BUILD_PATH)).
		// use(AlloyuiGalleryConstants.GALLERY_MODULES, c);

	}

	public Test getTestByName(String name) {
		for (Test t : tests) {
			if (t.getName().equals(name))
				return t;
		}
		return null;
	}

	public void getText(ResourcePrototype res, ResourceCallback<TextResource> c) {
		if (res instanceof TextResource) {
			c.onSuccess((TextResource) res);
		}
		if (res instanceof ExternalTextResource) {
			try {
				((ExternalTextResource) res).getText(c);
			} catch (ResourceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public Gallery getGallery() {
		return g;
	}

	public static native final void prettyPrint()/*-{
		$wnd.prettyPrint();
	}-*/;

}
