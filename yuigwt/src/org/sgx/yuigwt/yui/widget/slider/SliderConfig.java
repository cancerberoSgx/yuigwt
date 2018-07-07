package org.sgx.yuigwt.yui.widget.slider;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.WidgetConfig;
/**
 * 
 * @author sg
 *
 */
public class SliderConfig extends WidgetConfig {
protected SliderConfig(){}
public static final native SliderConfig create()/*-{
	return {}; 
}-*/;

/**
 * Axis upon which the Slider's thumb moves. "x" for horizontal, "y" for vertical. Default : x
 * @return
 */
public native final String axis() /*-{
return this.axis; 
}-*/;

/**
 * 
 * @param val Axis upon which the Slider's thumb moves. "x" for horizontal, "y" for vertical.
 * @return this - for setter chaining
 */
public native final SliderConfig axis(String val) /*-{
this.axis = val; 
return this; 
}-*/;

/**
 * The length of the rail (exclusive of the end caps if positioned by CSS). This corresponds to the movable range of the thumb. Default: 150px
 * @return
 */
public native final int length() /*-{
return this.length; 
}-*/;

/**
 * The length of the rail (exclusive of the end caps if positioned by CSS). This corresponds to the movable range of the thumb. Default: 150px
 * @param val
 * @return this - for setter chaining
 */
public native final SliderConfig length(int val) /*-{
this.length = val; 
return this; 
}-*/;

/**
 * Path to the thumb image. This will be used as both the thumb and shadow as a sprite. Defaults at render() to thumb-x.png or thumb-y.png in the skin directory of the current skin. Default: thumb-x.png or thumb-y.png in the sam skin directory of the current build path for Slider
 * @return
 */
public native final String thumbUrl() /*-{
return this.thumbUrl; 
}-*/;

/**
 * Path to the thumb image. This will be used as both the thumb and shadow as a sprite. Defaults at render() to thumb-x.png or thumb-y.png in the skin directory of the current skin. Default: thumb-x.png or thumb-y.png in the sam skin directory of the current build path for Slider
 * @param val
 * @return this - for setter chaining
 */
public native final SliderConfig thumbUrl(String val) /*-{
this.thumbUrl = val; 
return this; 
}-*/;

//SliderValueRange stuff
/**
 * amount to increment/decrement the Slider value when the page up/down keys are pressed. Default: 10
 * @return
 */
public native final int majorStep() /*-{
return this.majorStep; 
}-*/;

/**
 * amount to increment/decrement the Slider value when the page up/down keys are pressed. Default: 10
 * @param val
 * @return this - for setter chaining
 */
public native final SliderConfig majorStep(int val) /*-{
this.majorStep = val; 
return this; 
}-*/;

/**
 * The value associated with the farthest bottom, right position of the rail. Can be less than the configured min if you want values to increase from right-to-left or bottom-to-top.
 * @return
 */
public native final int max() /*-{
return this.max; 
}-*/;

/**
 * The value associated with the farthest bottom, right position of the rail. Can be less than the configured min if you want values to increase from right-to-left or bottom-to-top.
 * @param val
 * @return this - for setter chaining
 */
public native final SliderConfig max(int val) /*-{
this.max = val; 
return this; 
}-*/;

/**
 * The value associated with the farthest top, left position of the rail. Can be greater than the configured max if you want values to increase from right-to-left or bottom-to-top. Default 0
 * @return
 */
public native final int min() /*-{
return this.min; 
}-*/;

/**
 * The value associated with the farthest top, left position of the rail. Can be greater than the configured max if you want values to increase from right-to-left or bottom-to-top. Default 0
 * @param val
 * @return this - for setter chaining
 */
public native final SliderConfig min(int val) /*-{
this.min = val; 
return this; 
}-*/;

/**
 * amount to increment/decrement the Slider value when the arrow up/down/left/right keys are pressed. Default 1
 * @return
 */
public native final int minorStep() /*-{
return this.minorStep; 
}-*/;

/**
 * amount to increment/decrement the Slider value when the arrow up/down/left/right keys are pressed. Default 1
 * @param val
 * @return this - for setter chaining
 */
public native final SliderConfig minorStep(int val) /*-{
this.minorStep = val; 
return this; 
}-*/;

/**
 * The value associated with the thumb's current position on the rail. Defaults to the value inferred from the thumb's current position. Specifying value in the constructor will move the thumb to the position that corresponds to the supplied value. Default: (inferred from current thumb position)
 * @return
 */
public native final int value() /*-{
return this.value; 
}-*/;

/**
 * The value associated with the thumb's current position on the rail. Defaults to the value inferred from the thumb's current position. Specifying value in the constructor will move the thumb to the position that corresponds to the supplied value. Default: (inferred from current thumb position)
 * @param val
 * @return this - for setter chaining
 */
public native final SliderConfig value(int val) /*-{
this.value = val; 
return this; 
}-*/;

/**
 * Clicking on the rail moves the thumb to that point
 * @return
 */
public native final boolean clickableRail() /*-{
return this.clickableRail; 
}-*/;

/**
 * Clicking on the rail moves the thumb to that point
 * @param val
 * @return this - for setter chaining
 */
public native final SliderConfig clickableRail(boolean val) /*-{
this.clickableRail = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final Node rail() /*-{
return this.rail; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final SliderConfig rail(Node val) /*-{
this.rail = val; 
return this; 
}-*/;

/**
 * The Node instance of the Slider's rail element. Do not write to this property.
 * @return
 */
public native final Node thumb() /*-{
return this.thumb; 
}-*/;

/**
 * The Node instance of the Slider's thumb element. Do not write to this property.
 * @param val
 * @return this - for setter chaining
 */
public native final SliderConfig thumb(Node val) /*-{
this.thumb = val; 
return this; 
}-*/;
}
