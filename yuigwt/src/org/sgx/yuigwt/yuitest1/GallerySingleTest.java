package org.sgx.yuigwt.yuitest1;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventHandle;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeBase;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yuitest1.gallery.GalleryUtil;
import org.sgx.yuigwt.yuitest1.gallery.test.Test;

import com.google.gwt.user.client.Window;

public class GallerySingleTest implements YUICallback {
private GalleryUtil galleryUtil;
private Test test;
private String testName;
private Node parent;
private Node toolbar;
private Node main;
public GallerySingleTest(String testName) {
	this.testName = testName; 
	galleryUtil = GalleryUtil.getDefaultInstance();
	test = galleryUtil.getTestByName(testName);		
}
public void draw() {
	YUI.YUI().use(new String[]{"button"}, this);
	
//	new YUICallback() {
//		private EventHandle handle1;
//
//		@Override
//		public void ready(final YuiContext Y) {
//			
//			Node p = Y.one("body");
//			p.empty(); 
//			Node toolbar = p.appendChild("<div></div>");
//			
//			//another way of register an event listener, this time passing it to the config object
//			Y.newButton(ButtonConfig.create().label("Show Sources").render(parent).
//				on("click", new EventCallback<ButtonEvent>() {				
//					@Override
//					public void call(ButtonEvent e) {
//						console.log("button pressed at x  ="+e.domEvent().getClientX()); 
//					}
//				})
//			); 		
//
//			//and the last example, an html node plugged with a button plugin		
//			Node el1 = parent.appendChild("<button>from html</button>"); 
//			el1.plug(Y.Plugin().Button()); 
//			
////			beanToJSOTest(Y); 
//		}
//	}); 
}
@Override
public void ready(YuiContext Y) {
	parent = Y.one("body");
	parent.addClass("yui3-skin-sam"); 
	parent.empty(); 
	toolbar = parent.appendChild("<div></div>");
	main = parent.appendChild("<div></div>");
	if(test==null) {
		Window.alert("Test named "+testName+" not found !");
		return ;		
	}	
	Y.newButton(ButtonConfig.create()
		.label("Show Sources")
		.render(toolbar).
		on("click", new EventCallback<ButtonEvent>() {				
			@Override
			public void call(ButtonEvent e) {
				Window.alert("todo"); 
			}
		})
	); 	
	
	test.test(main); 
	
	GalleryUtil.checkAnchors(Y); 
	
	
}

}
