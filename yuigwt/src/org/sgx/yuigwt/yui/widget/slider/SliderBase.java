package org.sgx.yuigwt.yui.widget.slider;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.Widget;

/**
 * Create a slider to represent an input control capable of representing a
 * series of intermediate states based on the position of the slider's thumb.
 * These states are typically aligned to a value algorithm whereby the thumb
 * position corresponds to a given value. Sliders may be oriented vertically or
 * horizontally, based on the axis configuration.
 * 
 * @author sg
 * 
 */
public class SliderBase extends Widget {
	protected SliderBase() {
	}
	
	//TODO: renderRail, renderThumb, syncUI, RAIL_TEMPLATE, THUMB_TEMPLATE
	
/**
 * The Node instance of the Slider's rail element. Do not write to this property.
 * @return
 */
public native final Node rail() /*-{
return this.get("rail"); 
}-*/;

/**
 * The Node instance of the Slider's thumb element. Do not write to this property.
 * @return
 */
public native final Node thumb() /*-{
return this.get("thumb"); 
}-*/;

/**
 * Axis upon which the Slider's thumb moves. "x" for horizontal, "y" for vertical.
 * @return
 */
public native final String axis() /*-{
return this.get("axis"); 
}-*/;

/**
 * Axis upon which the Slider's thumb moves. "x" for horizontal, "y" for vertical.
 * @param val
 * @return this - for setter chaining
 */
public native final SliderBase axis(String val) /*-{
this.set("axis", val); 
return this; 
}-*/;
	
/**
 * The length of the rail (exclusive of the end caps if positioned by CSS). This corresponds to the movable range of the thumb. Default: 150px
 * @return
 */
public native final String length() /*-{
return this.get("length"); 
}-*/;

/**
 * The length of the rail (exclusive of the end caps if positioned by CSS). This corresponds to the movable range of the thumb. Default: 150px
 * @param val
 * @return this - for setter chaining
 */
public native final SliderBase length(String val) /*-{
this.set("length", val); 
return this; 
}-*/;

/**
 * Path to the thumb image. This will be used as both the thumb and shadow as a sprite. Defaults at render() to thumb-x.png or thumb-y.png in the skin directory of the current skin.Default: thumb-x.png or thumb-y.png in the sam skin directory of the current build path for Slider
 * @return
 */
public native final String thumbUrl() /*-{
return this.get("thumbUrl"); 
}-*/;

/**
 * Path to the thumb image. This will be used as both the thumb and shadow as a sprite. Defaults at render() to thumb-x.png or thumb-y.png in the skin directory of the current skin.Default: thumb-x.png or thumb-y.png in the sam skin directory of the current build path for Slider
 * @param val
 * @return this - for setter chaining
 */
public native final SliderBase thumbUrl(String val) /*-{
this.set("thumbUrl", val); 
return this; 
}-*/;


}
