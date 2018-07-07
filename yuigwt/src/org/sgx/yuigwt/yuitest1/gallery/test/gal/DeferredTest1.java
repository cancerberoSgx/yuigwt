package org.sgx.yuigwt.yuitest1.gallery.test.gal;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_DEFERRED;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GALLERY;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GET;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiConfig.Module;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.Transition;
import org.sgx.yuigwt.yui.util.Callback;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.colorpicker.ColorPicker;
import org.sgx.yuigwt.yuigallery.deferred.IODeferredEvent;
import org.sgx.yuigwt.yuigallery.deferred.NodeDeferred;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayMixed;
/**
 * gallery-deferred module test @see http://yuilibrary.com/gallery/show/deferred.
 * This contains two examples: doDeferred1: It uses galler-deferred module for making transitions syncronically and loading 
 * content with node-load. and doDeferred2: loads several resources using IO and wait till all are loaded using deferred.-  
 * @author sg
 *
 */
public class DeferredTest1 extends AbstractTest {

protected Console console;
protected ColorPicker cp1;

public DeferredTest1() {
	super("deferred1", "gallery-deferred module test @see http://yuilibrary.com/gallery/show/deferred."+
		" This contains two examples: doDeferred1: It uses galler-deferred module for making transitions syncronically and loading"+ 
		" content with node-load. and doDeferred2: loads several resources using IO and wait till all are loaded using deferred.-", 
		new String[]{TAG_WIDGET, TAG_GALLERY, TAG_GET, TAG_DEFERRED}, 
		TestResources.instance.gal_DeferredTest1());
}


public void test(final Node parent) {
	
	YUI.YUI(
		YuiConfig.create()
		.gallery(GalleryConstants.LATEST_BUILD)
		
//		this module needs to be configured, see getModuleConfig() - module bug ? 
		.module("gallery-deferred", Module.create()
			.fullpath("http://juandopazo.github.com/yui3-gallery/build/gallery-deferred/gallery-deferred.js")
			.requires(new String[]{"event-custom"})
		)			
	).use(new String[]{"node", "node-load", "transition", "plugin", "get","io",
			"gallery-deferred", "io", "console", "button", "json", "io-base"}, new YUICallback() {
		
	
	public void ready(YuiContext Y_) {
		
		final YuiGalleryContext Y = Y_.cast(); 		
		console = Y.newConsole().render().cast(); 
		
		Y.newButton(ButtonConfig.create().label("do deferred 1").on("click", new EventCallback<EventFacade>() {
			
			public void call(EventFacade e) {
				doDeferred1(parent, Y); 
			}
		})).render(parent); 
		
		Y.newButton(ButtonConfig.create().label("do deferred 2").on("click", new EventCallback<EventFacade>() {
			
			public void call(EventFacade e) {
				doDeferred2(parent, Y); 
			}
		})).render(parent); 
	}
}); 
}


protected void doDeferred1(Node parent, YuiGalleryContext Y) {
	//we work with NodeDeferred (extends Node) that adds the augmented "deferred" property
	NodeDeferred n1 = Y.one(parent.getDOMNode()).appendChild("<div>deferred1!</div>")
			.plug(Y.NodeDeferred()).cast(); 
	
	n1.setStyles(Style.create().
		backgroundColor("red").position("absolute").
		width("50px").height("40px").top("100px").left("10px")); 
	
	n1 = n1.plug(Y.NodeDeferred()).cast(); 
	
	console.log(n1.deferred()+""); 		
	
	n1.deferred().transition(Transition.create().width("200px"))
		.transition(Transition.create().top("200px"))
		.transition(Transition.create().height("200px"))
		.transition(Transition.create().left("300px").fontSize("30px").duration(2))
		.load(GWT.getModuleBaseURL()+"testfiles/page1.html"); 
}


protected void doDeferred2(Node parent, YuiGalleryContext Y) {
	// make multiple IO requests and deal with them when they are all completed
	Y.when(
		Y.ioDeferred().get(GWT.getModuleBaseURL()+"testfiles/page1.html"), 
		Y.ioDeferred().get(GWT.getModuleBaseURL()+"testfiles/json1.json"),
		Y.ioDeferred().getJSON(GWT.getModuleBaseURL()+"testfiles/json1.json") //do not work
	).then(new Callback() {		
		
		public void call(JsArrayMixed args) {

			JsArrayMixed a = args.getObject(0);
			JsArrayMixed b = args.getObject(1); 
			
			// args is an array with 2 arrays a and b
			// a and b are arrays with the arguments received by deferred.resolve() in each case,
		    // so the first element in each array is an EventFacade with responseText and data properties
			IODeferredEvent resp1 = a.getObject(0).cast(); 
			IODeferredEvent resp2 = b.getObject(0).cast();
			console.log("resp1 : "+resp1.responseText()+" - resp2 : "+resp2.responseText()); 
		}
	}, new Callback() {		
		
		public void call(JsArrayMixed args) {
			console.log("Some resources cannot be loaded."); 
		}
	}); 
}


}
