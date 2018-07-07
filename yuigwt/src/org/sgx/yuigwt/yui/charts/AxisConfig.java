package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.widget.ext.WidgetExtConfig;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.Element;
/**
 * this java class contains both Axis and AxisType classes APIs
 * The Axis class. Generates axes for a chart.
 * @see http://yuilibrary.com/yui/docs/api/classes/Axis.html
 * AxisType is an abstract class that manages the data for an axis.
 * @see http://yuilibrary.com/yui/docs/api/classes/AxisType.html
 * @author sg
 *
 */
public class AxisConfig extends WidgetExtConfig {
protected AxisConfig(){}
public static final native AxisConfig create()/*-{
return {}; 
}-*/;

//TODO: appendLabelFunction, appendTitleFunction, labelFunction, labelFunctionScope

/**
 * Distance determined by the tick styles used to calculate the distance between the axis line in relation to the bottom of the axis.
 * @return
 */
public native final int bottomTickOffset() /*-{
return this.bottomTickOffset; 
}-*/;

/**
 * Distance determined by the tick styles used to calculate the distance between the axis line in relation to the bottom of the axis.
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig bottomTickOffset(int val) /*-{
this.bottomTickOffset = val; 
return this; 
}-*/;

//TODO: graphic ? not here...

///**
// * 
// * @return
// */
//public native final double height() /*-{
//return this.height; 
//}-*/;
//
///**
// * 
// * @param val
// * @return this - for setter chaining
// */
//public native final AxisConfig height(double val) /*-{
//this.height = val; 
//return this; 
//}-*/;
///**
/** alias for height (widget already contain a height attr) 
 * @param val
 * @return this - for setter chaining
*/
public native final AxisConfig axisHeight(double val) /*-{
this.height = val; 
return this; 
}-*/;
/**
 * Style properties used for drawing an axis.
 * @return
 */
public native final AxisStyle styles() /*-{
return this.styles; 
}-*/;

/**
 * Style properties used for drawing an axis.
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig styles(AxisStyle val) /*-{
this.styles = val; 
return this; 
}-*/;
/**
 * Collection of labels used to render the axis.
 * @return
 */
public native final JsArray labels() /*-{
return this.labels; 
}-*/;

/**
 * Collection of labels used to render the axis.
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig labels(JsArray val) /*-{
this.labels = val; 
return this; 
}-*/;
/**
 * Distance determined by the tick styles used to calculate the distance between the axis line in relation to the left of the axis.
 * @return
 */
public native final double leftTickOffset() /*-{
return this.leftTickOffset; 
}-*/;

/**
 * Distance determined by the tick styles used to calculate the distance between the axis line in relation to the left of the axis.
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig leftTickOffset(double val) /*-{
this.leftTickOffset = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final Element node() /*-{
return this.node; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig node(Element val) /*-{
this.node = val; 
return this; 
}-*/;




//AxisType 

/**
 * Hash of array identifed by a string value.
 * @return
 */
public native final JsArrayString keys() /*-{
return this.keys; 
}-*/;

/**
 * Hash of array identifed by a string value.
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig keys(JsArrayString val) /*-{
this.keys = val; 
return this; 
}-*/;
/**
 * Hash of array identifed by a string value.
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig keys(String[] val) /*-{
this.keys = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val); 
return this; 
}-*/;
/**
 * The maximum value that will appear on an axis.
 * @return
 */
public native final double maximum() /*-{
return this.maximunValue; 
}-*/;

/**
 * The maximum value that will appear on an axis.
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig maximum(double val) /*-{
this.maximunValue = val; 
return this; 
}-*/;
/**
 * The minimum value that will appear on an axis.
 * @return
 */
public native final double minimun() /*-{
return this.minimun; 
}-*/;

/**
 * The minimum value that will appear on an axis.
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig minimun(double val) /*-{
this.minimun = val; 
return this; 
}-*/;
/**
 * Indicates how to round unit values
 * 
niceNumber
    Units will be smoothed based on the number of ticks and data range.<br/>
auto
    If the range is greater than 1, the units will be rounded.<br/>
numeric value
    Units will be equal to the numeric value.<br/>
null
    No rounding will occur.<br/>

Default: niceNumber
 * @return
 */
public native final String roundingMethod() /*-{
return this.roundingMethod; 
}-*/;

/**
 * Indicates how to round unit values
 * niceNumber
    Units will be smoothed based on the number of ticks and data range.<br/>
auto
    If the range is greater than 1, the units will be rounded.<br/>
numeric value
    Units will be equal to the numeric value.<br/>
null
    No rounding will occur.<br/>

Default: niceNumber
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig roundingMethod(String val) /*-{
this.roundingMethod = val; 
return this; 
}-*/;
/**
 * Determines whether the maximum is calculated or explicitly set by the user.
 * @return
 */
public native final boolean setMax() /*-{
return this.setMax; 
}-*/;

/**
 * Determines whether the maximum is calculated or explicitly set by the user.
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig setMax(boolean val) /*-{
this.setMax = val; 
return this; 
}-*/;
/**
 * Determines whether the minimum is calculated or explicitly set by the user.
 * @return
 */
public native final boolean setMin() /*-{
return this.setMin; 
}-*/;

/**
 * Determines whether the minimum is calculated or explicitly set by the user.
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig setMin(boolean val) /*-{
this.setMin = val; 
return this; 
}-*/;
/**
 * Returns the type of axis data  <br/>
 * 
time
    Manages time data <br/>
stacked
    Manages stacked numeric data <br/>
numeric
    Manages numeric data <br/>
category
    Manages categorical data <br/>
 * @return
 */
public native final String axisType() /*-{
return this.type; 
}-*/;

/**
 * Returns the type of axis data <br/> Alias for type(), supertype EventTarget.type() can be used but this is more confortable in java. 
 * 
time
    Manages time data <br/>
stacked
    Manages stacked numeric data <br/>
numeric
    Manages numeric data <br/>
category
    Manages categorical data <br/>
 * @param val
 * @return this - for setter chaining
 */
public native final AxisConfig axisType(String val) /*-{
this.type = val; 
return this; 
}-*/;
}
