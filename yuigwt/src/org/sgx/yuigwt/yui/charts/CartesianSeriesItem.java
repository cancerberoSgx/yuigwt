package org.sgx.yuigwt.yui.charts;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * object returned by cartesianChart.getseriesItem()
 * @author sg
 *
 */
public class CartesianSeriesItem extends JavaScriptObject {
protected CartesianSeriesItem(){}

/**
 * Object containing the following data related to the category axis of the series. 
 * @return
 */
public native final Item categoryItem() /*-{
return this.categoryItem; 
}-*/;

/**
 * Object containing the following data related to the category axis of the series. 
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesItem categoryItem(Item val) /*-{
this.categoryItem = val; 
return this; 
}-*/;

/**
 * Object containing the following data related to the category axis of the series. 
 * @return
 */
public native final Item valueItem() /*-{
return this.valueItem; 
}-*/;

/**
 * Object containing the following data related to the category axis of the series. 
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesItem valueItem(Item val) /*-{
this.valueItem = val; 
return this; 
}-*/;
}
