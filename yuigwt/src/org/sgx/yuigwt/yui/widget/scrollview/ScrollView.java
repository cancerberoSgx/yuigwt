package org.sgx.yuigwt.yui.widget.scrollview;

import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.widget.Widget;

/**
 * ScrollView provides a scrollable widget, supporting flick gestures, across
 * both touch and mouse based devices.
 * 
 * <br/>
 * ScrollView's main use case is to provide a scrollable content widget for
 * touch devices on which overflow scrollbars are not natively supported.
 * However, it is built on top of YUI's cross-platform/browser gesture and
 * transition layers, so it can also be used to provide flickable scrolling on
 * mouse-based devices across on all the A-grade browsers.
 * 
 * <br/>
 * The ScrollViewScrollbars plugin can be added to the base scrollview to
 * provide a scroll indicator. The ScrollViewPaginator plugin can be added to
 * provide a cross-platform paginated scrolling implementation (a simple
 * carousel).
 * 
 * @see http://yuilibrary.com/yui/docs/scrollview/
 * @see http://yuilibrary.com/yui/docs/api/classes/ScrollView.html
 * @author sg
 * 
 */
public class ScrollView extends Widget {
protected ScrollView(){}

public static final String EVENT_SCROLLXCHANGE = "scrollXChange", EVENT_SCROLLYCHANGE="scrollYChange", 
	EVENT_FLICKCHANGE = "flickChange", EVENT_DRAGCHANGE = "dragChange", 
	EVENT_DECELERATIONCHANGE = "decelerationChange", EVENT_BOUNCECHANGE="bounceChange"; 

/**
 * 
 */
public native final ScrollViewScrollbars scrollbars() /*-{
return this.scrollbars;
}-*/;

/**
 * 
 */
public native final ScrollViewPaginator pages() /*-{
return this.pages;
}-*/;


/**
 * Scroll the element to a given xy coordinate
 * @param x The x-position to scroll to
 * @param y The y-position to scroll to
 * @param duration Duration, in ms, of the scroll animation (default is 0)
 * @param easing An easing equation if duration is set
 * @return self for method chaining
 */
public native final ScrollView scrollTo(double x, double y, int duration, String easing) /*-{
this.scrollTo(x, y, duration, easing); 
return this; 
}-*/;
/**
 * Scroll the element to a given xy coordinate
 * @param x The x-position to scroll to
 * @param y The y-position to scroll to
 * @return self for method chaining
 */
public native final ScrollView scrollTo(double x, double y) /*-{
this.scrollTo(x, y); 
return this; 
}-*/;
/**
 * Drag coefficient for intertial scrolling at the upper and lower boundaries of the scrollview. Set to 0 to disable "rubber-banding".Default: 0.1
 * @return the attribute
 */
public final native double bounce()/*-{
return this.get("bounce");
}-*/;

/**
 * Drag coefficient for intertial scrolling at the upper and lower boundaries of the scrollview. Set to 0 to disable "rubber-banding".Default: 0.1
 * @param val
 * @return self for method chaining
 */
public final native ScrollView bounce(double val)/*-{
this.set("bounce", val);
return this; 
}-*/;

/**
 * Drag coefficent for inertial scrolling. The closer to 1 this value is, the less friction during scrolling.Default: 0.93
 * @return the attribute
 */
public final native double deceleration()/*-{
return this.get("deceleration");
}-*/;

/**
 * Drag coefficent for inertial scrolling. The closer to 1 this value is, the less friction during scrolling.Default: 0.93
 * @param val
 * @return self for method chaining
 */
public final native ScrollView deceleration(double val)/*-{
this.set("deceleration", val);
return this; 
}-*/;

/**
 * Enable/Disable dragging the ScrollView content (note: flick support is enabled/disabled separately)Default: true
 * @return the attribute
 */
public final native boolean drag()/*-{
return this.get("drag");
}-*/;

/**
 * Enable/Disable dragging the ScrollView content (note: flick support is enabled/disabled separately)Default: true
 * @param val
 * @return self for method chaining
 */
public final native ScrollView drag(boolean val)/*-{
this.set("drag", val);
return this; 
}-*/;
/**
 * The minimum distance and/or velocity which define a flick. Can be set to false, to disable flick support (note: drag support is enabled/disabled separately). Default: Object with properties minDistance = 10, minVelocity = 0.3.
 * @author sg
 *
 */
public static class Flick extends JsObject {
	protected Flick(){}
	public static final native Flick create()/*-{
		return {};
	}-*/;
/**
 * 
 * @return
 */
public native final String axis() /*-{
return this.axis; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final ScrollView.Flick axis(String val) /*-{
this.axis = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final double minDistance() /*-{
return this.minDistance; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final ScrollView.Flick minDistance(double val) /*-{
this.minDistance = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double minVelocity() /*-{
return this.minVelocity; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final ScrollView.Flick minVelocity(double val) /*-{
this.minVelocity = val; 
return this; 
}-*/;

}
/**
 * The minimum distance and/or velocity which define a flick. Can be set to false, to disable flick support (note: drag support is enabled/disabled separately). Default: Object with properties minDistance = 10, minVelocity = 0.3.
 * @return the attribute
 */
public final native Flick flick()/*-{
return this.get("flick");
}-*/;

/**
 * The minimum distance and/or velocity which define a flick. Can be set to false, to disable flick support (note: drag support is enabled/disabled separately). Default: Object with properties minDistance = 10, minVelocity = 0.3.
 * @param val
 * @return self for method chaining
 */
public final native ScrollView flick(Flick val)/*-{
this.set("flick", val);
return this; 
}-*/;

/**
 * 
 * @return the attribute
 */
public final native double scrollX()/*-{
return this.get("scrollX");
}-*/;

/**
 * 
 * @param val
 * @return self for method chaining
 */
public final native ScrollView scrollX(double val)/*-{
this.set("scrollX", val);
return this; 
}-*/;

/**
 * 
 * @return the attribute
 */
public final native double scrollY()/*-{
return this.get("scrollY");
}-*/;

/**
 * 
 * @param val
 * @return self for method chaining
 */
public final native ScrollView scrollY(double val)/*-{
this.set("scrollY", val);
return this; 
}-*/;


}
