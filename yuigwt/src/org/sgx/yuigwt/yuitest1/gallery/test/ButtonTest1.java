package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_BUTTON;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_EVENT;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventHandle;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.BeanToJSO;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Window;
/**
 * button tests
 * @author sg
 *
 */
public class ButtonTest1 extends AbstractTest {

public ButtonTest1() {
	super("button1", "button tests", new String[]{TAG_BUTTON, TAG_WIDGET, TAG_EVENT}, 
			TestResources.instance.ButtonTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"button", "button-plugin", "node-screen", "dump", "console"}, new YUICallback() {
	private EventHandle handle1;

	
	public void ready(final YuiContext Y) {
		final Console console = Y.newConsole(); 
		console.render(); 
		Widget button1 = Y.newButton(
			ButtonConfig.create().label("a simple button 123")
		).render(parent);	
		//register a click listener that will unregister itself after the first event
		handle1 = button1.on("click", new EventCallback<ButtonEvent>() {			
			
			public void call(ButtonEvent e) {
				console.log("button pressed at x  ="+e.domEvent().getClientX()+".\n And this will be THE LAST TIME !!!");
				handle1.detach(); //unregister this event listener!
			}
		});
		console.log("button's region is : " + button1.boundingBox().region().print()); 
		button1.boundingBox().setStyles(Style.create().border("3px solid green")); 
		
		//another way of register an event listener, this time passing it to the config object
		Button b2 = Y.newButton(ButtonConfig.create().label("another button").render(parent).
			on("click", new EventCallback<ButtonEvent>() {				
				
				public void call(ButtonEvent e) {
					console.log("button pressed at x  ="+e.domEvent().getClientX()); 
				}
			})
		); 		

		//and the last example, an html node plugged with a button plugin		
		Node el1 = parent.appendChild("<button>from html</button>"); 
		el1.plug(Y.Plugin().Button()); 
		
		b2.set("label", "lacañada"); 
	}
}); 
}

}
