package org.sgx.yuigwt.yui.charts;
/**
 * PieSeries visualizes data as a circular chart divided into wedges which represent data as a percentage of a whole.
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/PieSeries.html
 * @author sg
 *
 */
public class PieSeries extends MarkerSeries{
protected PieSeries(){}

/**
 * Indicates which array to from the hash of value arrays in the category Axis instance.
 * @return the attribute
 */
public final native String categoryKey()/*-{
return this.get("categoryKey");
}-*/;

/**
 * Indicates which array to from the hash of value arrays in the category Axis instance.
 * @param val
 * @return self for method chaining
 */
public final native PieSeries categoryKey(String val)/*-{
this.set("categoryKey", val);
return this; 
}-*/;

/**
 * 
 * @return the attribute
 */
public final native String legend()/*-{
return this.get("legend");
}-*/;

/**
 * 
 * @param val
 * @return self for method chaining
 */
public final native PieSeries legend(String val)/*-{
this.set("legend", val);
return this; 
}-*/;

///**
// * Order of this instance of this type.
// * @return
// */
//public native final int order() /*-{
//return this.order; 
//}-*/;
//
///**
// * 
// * @param val
// * @return this - for setter chaining
// */
//public native final PieSeries order(int val) /*-{
//this.order = val; 
//return this; 
//}-*/;

/**
 * Reference to the Axis instance used for assigning category values to the graph
 * @return the attribute
 */
public final native Axis categoryAxis()/*-{
return this.get("categoryAxis");
}-*/;

/**
 * Reference to the Axis instance used for assigning category values to the graph
 * @param val
 * @return self for method chaining
 */
public final native PieSeries categoryAxis(Axis val)/*-{
this.set("categoryAxis", val);
return this; 
}-*/;
}
