package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_BUTTON;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_EVENT;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_JSINJAVA;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Callback;
import org.sgx.yuigwt.yui.util.JsFunction;
import org.sgx.yuigwt.yui.util.JsFunctionBuilder;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;

import com.google.gwt.core.client.JsArrayMixed;
/**
 * This test try to show the different ways supported by yuigwt of working with native JavaScript functions from Java code using a button click handler. 

 * @author sg
 *
 */
public class FunctionsInJavaTest extends AbstractTest {

public FunctionsInJavaTest() {
	super("functions1", "This test try to show the different ways supported by yuigwt of working with native JavaScript functions from Java code using a button click handler.", 
		new String[]{TAG_BUTTON, TAG_JSINJAVA, TAG_EVENT}, 
		TestResources.instance.FunctionsInJavaTest());
}


public void test(final Node parent) {
YUI.Use(new String[]{"button", "console"}, new YUICallback() {

	
	public void ready(final YuiContext Y) {
final Console console = Y.newConsole().render().cast();

Widget button1 = Y.newButton(
	ButtonConfig.create().label("button1")
).render(parent);

//using "normal" yuigwt infrastructure
button1.on(new String[]{"click", "mouseover"}, new EventCallback<ButtonEvent>() {
	
	public void call(ButtonEvent e) {
		console.log("1 "+e.type()+" at X="+e.domEvent().clientX()); 
	}
}); 

Widget button2 = Y.newButton(
	ButtonConfig.create().label("button2")
).render(parent);
//using util.Callback generic callback definition
button2.on("click", new Callback() {			
	
	public void call(JsArrayMixed args) {
		ButtonEvent e = args.getObject(0).cast();
		console.log("2 clicked at X="+e.domEvent().clientX()); 
	}
});
		
Widget button3 = Y.newButton(
	ButtonConfig.create().label("button3")
).render(parent);
//creating a native javascript function
JsFunction fn = new JsFunctionBuilder() {			
	
	public native final JsFunction buildFunction()/*-{
		return function(e) {
			$wnd.alert("3 "+e.type+" at: "+e.domEvent.clientX); 
		}
	}-*/;
}.buildFunction();
button3.on(new String[]{"mouseover", "mouseout"}, fn);
	}
}); 
}

}
