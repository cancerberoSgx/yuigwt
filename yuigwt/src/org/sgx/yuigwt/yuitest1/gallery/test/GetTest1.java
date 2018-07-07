package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.*;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.event.NodeEventCallback;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.get.GetCallback;
import org.sgx.yuigwt.yui.get.GetError;
import org.sgx.yuigwt.yui.get.GetConfig;
import org.sgx.yuigwt.yui.get.GetOptionsCallback;
import org.sgx.yuigwt.yui.get.Transaction;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.overlay.Overlay;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.Window;
/**
 * shows how to use the Get utility  http://yuilibrary.com/yui/docs/get
 * I will load files that I left on a public folder of this demo (yuitest1/gallery-public/testfiles)
 * so I get the full path like this GWT.getModuleBaseURL()+"testfiles/script1.js"
 * @author sg
 *
 */
public class GetTest1 extends AbstractTest {

protected Overlay overlay;
protected Node xInput;
protected Node yInput;

public GetTest1() {
	super("get1", "shows how to use the Get utility  http://yuilibrary.com/yui/docs/get", 
		new String[]{TAG_GET, TAG_UTILS}, 
		TestResources.instance.GetTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"get", "button", "console"}, new YUICallback() {	
		
	
	public void ready(final YuiContext Y) {
		final Console console1 = Y.newConsole(ConsoleConfig.create());
		console1.render(); 
		
		Button b1 = Y.newButton(ButtonConfig.create().label("loadScript1")).render(parent).cast(); 
		b1.on("click", new EventCallback() {			
			
			public void call(EventFacade e) {
				Y.Get().js(GWT.getModuleBaseURL()+"testfiles/script1.js");
			}
		}).cast();
		
		Button b2 = Y.newButton(ButtonConfig.create().label("loadcss1")).render(parent).cast(); 
		b2.on("click", new EventCallback() {			
			
			public void call(EventFacade e) {
				Y.Get().css(GWT.getModuleBaseURL()+"testfiles/css1.css"); 
			}
		});		
		
		//now try to load a non existing file - catch the error using the normal callback for accessing the error 
		Button b3 = Y.newButton(ButtonConfig.create().label("nonExisting1")).render(parent).cast(); 
		b3.on("click", new EventCallback() {			
			
			public void call(EventFacade e) {
				Y.Get().css(GWT.getModuleBaseURL()+"testfiles/jsNotExists123.css", GetConfig.create(), new GetCallback() {					
					
					public void call(JsArray err_, Transaction tx) {
						JsArray<GetError> err = (JsArray<GetError>)err_; 
						Window.alert("error count: "+err.length()+" - first error: "+
								err.get(0).error()); 
					}
				}); 
			}; 
		});
		
		//or, the same as as above but using the Get's options object for registering an onFailure listener:  
		Button b4 = Y.newButton(ButtonConfig.create().label("nonExisting2")).render(parent).cast(); 
		b4.on("click", new EventCallback() {			
			
			public void call(EventFacade e) {
				Y.Get().css(GWT.getModuleBaseURL()+"testfiles/jsNotExists123.css", GetConfig.create().onFailure(new GetOptionsCallback() {
					
					
					public void call(Transaction tx) {						
						Window.alert("error count: "+tx.errors().length()+". first error: "+
								tx.errors().get(0).error()); 
					}
				})); 
			}; 
		});
		
		
		
//		Button b5 = Y.newButton(ButtonConfig.create().label("loadJsonData")).render(parent).cast(); 
//		b5.on("click", new EventCallback() {			
//			
//			public void call(EventFacade e) {
//				Y.Get().js(GWT.getModuleBaseURL()+"testfiles/data1.json", GetConfig.create().onEnd(new GetOptionsCallback() {
//					
//					
//					public void call(Transaction tx) {
//						Node n = Y.one(tx.requests().get(0).node()); 
//						console1.log(" "+
////							JsUtil.dumpObj(tx)+
////							JsUtil.dumpArr(tx.requests())
//							n.get("innerHTML")+n.text()
//						); 
//					}
//				}).onFailure(new GetOptionsCallback() {
//					
//					
//					public void call(Transaction tx) {						
//						Window.alert("error count: "+tx.errors().length()+". first error: "+
//								tx.errors().get(0).error()); 
//					}
//				})); 
//
////				Y.Get().js(GWT.getModuleBaseURL()+"testfiles/data1.json");
//			}
//		}).cast();
	}
}); 
}

}
