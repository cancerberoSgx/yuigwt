package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_NODE;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_RESIZE;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.resize.Resize;
import org.sgx.yuigwt.yui.resize.ResizeConfig;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
/**
 * Node Resize utility test. TODO:resize-constrain, resize-plugin, resize-proxy  
 * @author sg
 *
 */
public class ResizeTest1 extends AbstractTest {

public ResizeTest1() {
	super("resize1", "Node Resize utility test", 
		new String[]{TAG_NODE, TAG_RESIZE}, 
		TestResources.instance.ResizeTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"resize", "resize-plugin", "button"}, new YUICallback() {	
	
	public void ready(final YuiContext Y) {
		Node n = parent.appendChild("<div id=\"resizable1\">hello</div>"); 
		n.setStyles(Style.create().height("100px").position("relative").
				width("80px").backgroundColor("red").margin("30px")); 
		Resize r = Y.newResize(ResizeConfig.create().node("#resizable1"));
		
		//and now a resizable button using Resize plugin
		Widget button = Y.newButton(ButtonConfig.create().label("resizable button").on("click", new EventCallback<EventFacade>() {
			
			public void call(EventFacade e) {
			}
		})).render(parent); 
		button.plug(Y.Plugin().Resize()); 
	}
}); 
}

}
