package org.sgx.yuigwt.yui.widget.scrollview;

import org.sgx.yuigwt.yui.widget.WidgetClass;

import com.google.gwt.core.client.JavaScriptObject;

public class ScrollViewClass extends WidgetClass {
protected ScrollViewClass(){}

// BOUNCE_RANGE static CLASS_NAMES static EASING static FRAME_STEP static SNAP_EASING static UI_SRC stati

/**
 * @return The default bounce distance in pixels
 */
public native final int BOUNCE_RANGE() /*-{
return this.BOUNCE_RANGE; 
}-*/;
/**
 * @param val The default bounce distance in pixels
 * @return self for method chaining
 */
public native final ScrollViewClass BOUNCE_RANGE(int val) /*-{
this.BOUNCE_RANGE = val; 
return this; 
}-*/;


/**
 * @return List of class names used in the scrollview's DOM
 */
public native final JavaScriptObject CLASS_NAMES() /*-{
return this.CLASS_NAMES; 
}-*/;
/**
 * @param val List of class names used in the scrollview's DOM
 * @return self for method chaining
 */
public native final ScrollViewClass CLASS_NAMES(JavaScriptObject val) /*-{
this.CLASS_NAMES = val; 
return this; 
}-*/;

/**
 * @return The default easing used when animating the flick. Default: 'cubic-bezier(0, 0.1, 0, 1.0)'
 */
public native final String EASING() /*-{
return this.EASING; 
}-*/;
/**
 * @param val The default easing used when animating the flick. Default: 'cubic-bezier(0, 0.1, 0, 1.0)'
 * @return self for method chaining
 */
public native final ScrollViewClass EASING(String val) /*-{
this.EASING = val; 
return this; 
}-*/;

/**
 * @return The interval used when animating the flick. Default: 30
 */
public native final int FRAME_STEP() /*-{
return this.FRAME_STEP; 
}-*/;
/**
 * @param val The interval used when animating the flick. Default: 30
 * @return self for method chaining
 */
public native final ScrollViewClass FRAME_STEP(int val) /*-{
this.FRAME_STEP = val; 
return this; 
}-*/;


/**
 * @return The default easing to use when animating the bounce snap back. Default: 'ease-out'
 */
public native final String SNAP_EASING() /*-{
return this.SNAP_EASING; 
}-*/;
/**
 * @param val The default easing to use when animating the bounce snap back. Default: 'ease-out'
 * @return self for method chaining
 */
public native final ScrollViewClass SNAP_EASING(String val) /*-{
this.SNAP_EASING = val; 
return this; 
}-*/;

///**
// * @return Flag used to source property changes initiated from the DOM. Default: "ui"
// */
//public native final String UI_SRC() /*-{
//return this.UI_SRC; 
//}-*/;

}
