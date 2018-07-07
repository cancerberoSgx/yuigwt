package org.sgx.yuigwt.yuitest1.gallery.test.uibinder.userguide;

import java.util.LinkedList;
import java.util.List;

import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.panel.Panel;
import org.sgx.yuigwt.yui.widget.tabview.TabConfig;
import org.sgx.yuigwt.yui.widget.tabview.TabView;
import org.sgx.yuigwt.yui.widget.tabview.TabViewConfig;
import org.sgx.yuigwt.yuitest1.gallery.GalleryUtil;
import org.sgx.yuigwt.yuitest1.gallery.test.Test;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ResourceCallback;
import com.google.gwt.resources.client.ResourceException;
import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;

/** 
 * a widget that shows some test sources in a tabview and a button to run the test in a new panel.
 * @author sg
 * 
 */
public class SourceCodeViewer extends YUIBinded {

	interface MyUiBinder extends UiBinder<Widget, SourceCodeViewer> {
	}

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);	

	@UiField Element panel1El; 
	@UiField Element buttonEl;
	@UiField Element acceptButtonEl; 
	@UiField Element tabviewEl; //not YUIBinded
	String testName; 
	
	public SourceCodeViewer(YuiContext y) {
		super(y); 
	}

	@Override
	public void yuiBinded() {
		final String testName = getTestName(); 
		if(testName==null)
			return;
		
		final GalleryUtil galleryUtil = GalleryUtil.getDefaultInstance();
		final Test test = galleryUtil.getTestByName(testName); 
		
		 //new GalleryUtil(null); 
		
		final Button button1 = getYUIBinder().getWidget(buttonEl).cast();
		final Button acceptButton = getYUIBinder().getWidget(acceptButtonEl).cast();
		final Panel panel1 = getYUIBinder().getWidget(panel1El).cast();
		
		button1.on("click", new EventCallback<EventFacade>() {
			@Override
			public void call(EventFacade e) {
				//cannot work directly in panel1.getStdModNode("body") because we cannot call asHTMLPanel() if the node is already inside a GWT Widget. 
//				test.test(panel1.getStdModNode("body")); 	
				Node p = y.one("body").appendChild("<div></div>");
//				p.generateID(); 
				test.test(p); 	
				
				panel1.setStdModContent("body", p); 
//				panel1.render(); 
				panel1.show(); 
			}
		}); 
		acceptButton.on("click", new EventCallback<EventFacade>() {
			@Override
			public void call(EventFacade e) {
				panel1.hide(); 
			}
		}); 
		 
		
		
		Node parent = y.one(tabviewEl);//getElement()).appendChild("");
		
		final List<String> headers = new LinkedList<String>();
		final List<String> bodies = new LinkedList<String>();
		
		for(final String resName : test.getTestResources().keySet()) {
			ResourcePrototype res = test.getTestResources().get(resName);
			galleryUtil.getText(res, new ResourceCallback<TextResource>() {
				
				@Override
				public void onSuccess(TextResource resource) {
					String scapedContent = y.Escape().html(resource.getText().replace("\t", "  "));
					String header = resName; 
					String body = "<pre style=\"width: 100%; overflow: scroll; height: 350px\" class=\"prettyprint\">" + scapedContent + "</pre>";

					headers.add(header);
					bodies.add(body);
				}
				
				@Override
				public void onError(ResourceException e) {
					// TODO Auto-generated method stub					
				}
			}); 
		}
		
		TabConfig[] tabConfig = new TabConfig[headers.size()];

		for (int i = 0; i < tabConfig.length; i++) {
			String header = headers.get(i); // [i];
			String body = bodies.get(i); // [i];
			tabConfig[i] = TabConfig.create().label(header).content(body);
		}
		final TabView tb = y.newTabView(TabViewConfig.create(tabConfig));
		tb.render(parent);
		UIBinderUserGuide.prettyPrint(); 
	}

	@Override
	public UiBinder getUIBinder() {
		return uiBinder;
	}

	@Override
	public Element[] getYUIBindedEls() {
		return new Element[]{buttonEl, panel1El, acceptButtonEl};
	}
	
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
}
