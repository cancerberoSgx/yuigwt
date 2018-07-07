package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_DD;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_OVERLAY;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_PLUGIN;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.event.NodeEventCallback;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Point;
import org.sgx.yuigwt.yui.widget.overlay.Overlay;
import org.sgx.yuigwt.yui.widget.overlay.OverlayConfig;
import org.sgx.yuigwt.yui.yui.PluginBase;
/**
 * the equivalent example at http://yuilibrary.com/yui/docs/overlay/overlay-xy.html
 * @author sg
 *
 */
public class OverlayTest1 extends AbstractTest {

protected Overlay overlay;
protected Node xInput;
protected Node yInput;

public OverlayTest1() {
	super("overlay1", 
			"an example using overlay equivalent to the JavaScript's  http://yuilibrary.com/yui/docs/overlay/overlay-xy.html", 
		new String[]{TAG_OVERLAY, TAG_WIDGET, TAG_PLUGIN, TAG_DD}, TestResources.instance.OverlayTest1());
}


public void test(final Node parent) {
	YUI.YUI(YuiConfig.create().fetchCSS("force")).use(
new String[]{"overlay", "dd-plugin"}, new YUICallback() {
	
	public void ready(YuiContext Y) {
		
		/**
		 * overlay widget is somekind abstract and do not automatically include its CSS files - according to YUI docs: 
		 * 
		 * he overlay.css Sam Skin file (build/overlay/assets/skins/sam/overlay.css) provides the default functional CSS for the overlay. 
		 * 
		 * so we have to explicitly set its style - in this case we set it inline like in the example: 
		 */
		
		//create some markup 
		parent.append(
			"<style>" +
				"/* Hide overlay markup while loading, if js is enabled */\n"+
				".yui3-js-enabled .yui3-overlay-loading {\n"+
				"    top: -1000em;\n"+
				"    left: -1000em;\n"+
				"    position: absolute;\n"+
				"}\n"+
				"/* Overlay Look/Feel */\n"+
				".yui3-overlay-content {\n"+
				"    background-color: #ECEFFB;  \n"+
				"    border: 1px solid #9EA8C6;\n"+
				"    border-radius: 3px;\n"+
				"    box-shadow: 3px 3px 5px rgba(0, 0, 0, 0.25);\n"+
				"}\n"+
				".yui3-overlay-content .yui3-widget-hd {\n"+
				"    background-color: #B6BFDA;  \n"+
				"    color: #30418C;\n"+
				"    font-size: 120%;\n"+
				"    font-weight: bold;\n"+
				"    padding: 0.2em 0.5em 0.3em;\n"+
				"    border-radius: 2px 2px 0 0;\n"+
				"}\n"+
				".yui3-overlay-content .yui3-widget-bd {\n"+
				"    padding: 0.4em 0.6em 0.5em;\n"+
				"}\n"+
				".yui3-overlay-content .yui3-widget-ft {\n"+
				"    background-color:#DFE3F5;\n"+
				"    padding: 0.4em 0.6em 0.5em;\n"+
				"    border-radius: 0 0 2px 2px;\n"+
				"}"+
			"</style>" +
			"<div class=\"overlay-example\" id=\"overlay-position\">\n"+
			"    <label>X: <input type=\"text\" id=\"x\" value=\"0\" ></label>\n"+
			"    <label>Y: <input type=\"text\" id=\"y\" value=\"0\" ></label>\n"+
			"    <button type=\"button\" id=\"move\">Move</button>\n"+
			"    <button type=\"button\" id=\"hide\">Hide</button>\n"+
			"    <button type=\"button\" id=\"show\">Show</button>\n"+
			"    <div id=\"overlay\" class=\"yui3-overlay-loading\">\n"+
			"        <div class=\"yui3-widget-hd\">Overlay Header</div>\n"+
			"        <div class=\"yui3-widget-bd\">Overlay Body</div>\n"+
			"        <div class=\"yui3-widget-ft\">Overlay Footer</div>\n"+
			"    </div>\n"+
			"    <p class=\"filler\">\n"+
			"        <select class=\"needs-shim\">\n"+
			"            <option>Prevent IE6 Bleedthrough</option>\n"+
			"        </select>\n"+
			"        Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nunc pretium quam eu mi varius pulvinar. Duis orci arcu, ullamcorper sit amet, luctus ut, interdum ac, quam. Pellentesque euismod. Nam tincidunt, purus in ultrices congue, urna neque posuere arcu, aliquam tristique purus sapien id nulla. Etiam rhoncus nulla at leo. Cras scelerisque nisl in nibh. Sed eget odio. Morbi elit elit, porta a, convallis sit amet, rhoncus non, felis. Mauris nulla pede, pretium eleifend, porttitor at, rutrum id, orci. Quisque non urna. Nulla aliquam rhoncus est. \n"+
			"    </p>\n"+
			"</div>"); 

//		Window.alert( Y.one("#overlay-position")+" - "+Y.one("#overlay-position").getXY()); 
		Point xy = Y.one("#overlay-position").getXY(); 
		overlay = Y.newOverlay((OverlayConfig) OverlayConfig.create().
			xy(xy.x()+30, xy.y()+40).
			height("13em").
			width("200px").
			srcNode("#overlay").
			plugins(new PluginBase[]{Y.Plugin().Drag()})
		); 
		overlay.render(); 
		
		xInput = Y.one("#x"); 
		yInput = Y.one("#y");
		
		// Using round to round sub-pixel values for FF3 just 
	    // to make the text box values prettier.
	    xInput.set("value", overlay.getInt("x"));
	    yInput.set("value", overlay.getInt("y"));
	    
	    Y.on("click", new EventCallback() {			
			
			public void call(EventFacade e) {
				double x = Double.parseDouble(xInput.getString("value")), 
					y = Double.parseDouble(yInput.getString("value")); 
				overlay.move(x, y); 
			}
		}, "#move"); 
	    
	    Y.one("#hide").on("click", new NodeEventCallback() {			
			
			public void call(YuiEvent e) {
				overlay.hide(); 
			}
		}); 
	    
	    Y.one("#show").on("click", new NodeEventCallback() {			
			
			public void call(YuiEvent e) {
				overlay.show(); 
			}
		});
	    
	}
}); 
}

}
