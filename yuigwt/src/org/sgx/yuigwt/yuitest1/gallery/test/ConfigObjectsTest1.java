package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_EXT;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_SLIDER;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_YUI;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.widget.slider.SliderConfig;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
/**
 * Shows different ways of creating native javascript objects from java. 
 * this example shows that in yuigwt config objects are always native 
 * javascript objects, and as such they can be created using different technics. 
 * Config classes are helpful but optional.  
 * @author sg
 *
 */
public class ConfigObjectsTest1 extends AbstractTest {

public ConfigObjectsTest1() {
	super("configobjects1", "this example shows that in yuigwt config objects are always native javascript objects, and as such they can be created using different technics. Config classes are helpful but optional.", 
			new String[]{TAG_WIDGET, TAG_SLIDER, TAG_EXT, TAG_YUI}, TestResources.instance.ConfigObjectsTest1());
}


public void test(final Node parent) {
	YUI.YUI().use(new String[]{"slider"}, new YUICallback() {
	
		
		public void ready(YuiContext Y) {
			parent.append("<p><b>These are sliders with the same configuration values, but the configuration objects are created using different technics for showing that after configuration objects are only javascript objects. </b></p>");
			
			parent.append("<p>Slider configured using SliderConfig object (recommended!)</p>");
			Y.newSlider(SliderConfig.create().axis("x").min(1).max(5).value(3).length(200)).render(parent);
			
			parent.append("<p>Slider configured using a JSON string</p>");
			Y.newSlider(JsonUtils.unsafeEval("{axis: 'x', min: 1, max: 5, value: 3, length: 200}")).render(parent);
			
			parent.append("<p>Slider configured using JsUtil.obj to build a Js object from java varargs method</p>");			
			Y.newSlider(JsUtil.obj("axis", "x", "min", 1, "max", 5, "value", 3, "length", 200)).render(parent);
						
			parent.append("<p>using a native javascript object given by third party javascript code</p>");
			Y.newSlider(getNativeConfig()).render(parent);
			
			parent.append("<p>using yuigwt Java JsObject class for making javascript objects in java code</p>");
			Y.newSlider(JsObject.one("axis", "x")._("min", 1)._("max", 5)._("value", 3)._("length", 200)).render(parent);
		}
	}); 
}

/**
 * returns a native slider config object - simulate interaction with 3rd party javascript code. 
 * @return
 */
public native final JavaScriptObject getNativeConfig()/*-{
	return {axis: 'x', min: 1, max: 5, value: 3, length: 200};
}-*/;


}
