package org.sgx.yuigwt.yui.widget.scrollview;

import org.sgx.yuigwt.yui.widget.WidgetConfig;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollView.Flick;

public class ScrollViewConfig extends WidgetConfig {
protected ScrollViewConfig(){}
public static final native ScrollViewConfig create()/*-{
	return {}; 
}-*/;

//attrs
/**
 * Contains the distance (postive or negative) in pixels by which the scrollview was last scrolled. This is useful when setting up click listeners on the scrollview content, which on mouse based devices are always fired, even after a drag/flick.Touch based devices don't currently fire a click event, if the finger has been moved (beyond a threshold) so this check isn't required, if working in a purely touch based environment
 * @return the attribute
 */
public final native int lastScrolledAmt()/*-{
return this.get("lastScrolledAmt");
}-*/;

/**
 * Contains the distance (postive or negative) in pixels by which the scrollview was last scrolled. This is useful when setting up click listeners on the scrollview content, which on mouse based devices are always fired, even after a drag/flick.Touch based devices don't currently fire a click event, if the finger has been moved (beyond a threshold) so this check isn't required, if working in a purely touch based environment
 * @param val
 * @return self for method chaining
 */
public final native ScrollViewConfig lastScrolledAmt(int val)/*-{
this.set("lastScrolledAmt", val);
return this; 
}-*/;


/**
 * Drag coefficient for intertial scrolling at the upper and lower boundaries of the scrollview. Set to 0 to disable "rubber-banding".Default: 0.1
 * @return
 */
public native final double bounce() /*-{
return this.bounce; 
}-*/;

/**
 * Drag coefficient for intertial scrolling at the upper and lower boundaries of the scrollview. Set to 0 to disable "rubber-banding".Default: 0.1
 * @param val
 * @return this - for setter chaining
 */
public native final ScrollViewConfig bounce(double val) /*-{
this.bounce = val; 
return this; 
}-*/;

/**
 * Drag coefficent for inertial scrolling. The closer to 1 this value is, the less friction during scrolling.Default: 0.93
 * @return
 */
public native final double deceleration() /*-{
return this.deceleration; 
}-*/;

/**
 * Drag coefficent for inertial scrolling. The closer to 1 this value is, the less friction during scrolling.Default: 0.93
 * @param val
 * @return this - for setter chaining
 */
public native final ScrollViewConfig deceleration(double val) /*-{
this.deceleration = val; 
return this; 
}-*/;
/**
 * Enable/Disable dragging the ScrollView content (note: flick support is enabled/disabled separately)Default: true
 * @return
 */
public native final boolean drag() /*-{
return this.drag; 
}-*/;

/**
 * Enable/Disable dragging the ScrollView content (note: flick support is enabled/disabled separately)Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final ScrollViewConfig drag(boolean val) /*-{
this.drag = val; 
return this; 
}-*/;

/**
 * The minimum distance and/or velocity which define a flick. Can be set to false, to disable flick support (note: drag support is enabled/disabled separately). Default: Object with properties minDistance = 10, minVelocity = 0.3.
 * @return
 */
public native final Flick flick() /*-{
return this.flick; 
}-*/;

/**
 * The minimum distance and/or velocity which define a flick. Can be set to false, to disable flick support (note: drag support is enabled/disabled separately). Default: Object with properties minDistance = 10, minVelocity = 0.3.
 * @param val
 * @return this - for setter chaining
 */
public native final ScrollViewConfig flick(Flick val) /*-{
this.flick = val; 
return this; 
}-*/;

/**
 * The scroll position in the x-axis. Default: 0
 * @return
 */
public native final double scrollX() /*-{
return this.scrollX; 
}-*/;

/**
 * The scroll position in the x-axis. Default: 0
 * @param val
 * @return this - for setter chaining
 */
public native final ScrollViewConfig scrollX(double val) /*-{
this.scrollX = val; 
return this; 
}-*/;

/**
 * The scroll position in the y-axis. Default: 0
 * @return
 */
public native final double scrollY() /*-{
return this.scrollY; 
}-*/;

/**
 * The scroll position in the y-axis. Default: 0
 * @param val
 * @return this - for setter chaining
 */
public native final ScrollViewConfig scrollY(double val) /*-{
this.scrollY = val; 
return this; 
}-*/;

}
