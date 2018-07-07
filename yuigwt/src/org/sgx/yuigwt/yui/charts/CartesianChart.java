package org.sgx.yuigwt.yui.charts;

import com.google.gwt.core.client.JsArray;

public class CartesianChart extends ChartBase{
protected CartesianChart(){}

/**
 * @param series Reference to a series.
 * @param index Index of the specified item within a series.
 * @return Returns an object literal containing a categoryItem and a valueItem for a given series index. Below is the structure of each:
 */
public native final CartesianSeriesItem getSeriesItem(CartesianSeries series, int index) /*-{
return this.getSeriesItem(series, index);
}-*/;



//attrs
/**
 * Indicates whether axis labels are allowed to overflow beyond the bounds of the chart's content box.
 * @return the attribute
 */
public final native boolean allowContentOverflow()/*-{
return this.get("allowContentOverflow");
}-*/;

/**
 * Indicates whether axis labels are allowed to overflow beyond the bounds of the chart's content box.
 * @param val
 * @return self for method chaining
 */
public final native CartesianChart allowContentOverflow(boolean val)/*-{
this.set("allowContentOverflow", val);
return this; 
}-*/;

/**
 * Axes to appear in the chart. This can be a key indexed hash of axis instances or object literals used to construct the appropriate axes.
 * @return the attribute
 */
public final native JsArray axes()/*-{
return this.get("axes");
}-*/;

/**
 * Axes to appear in the chart. This can be a key indexed hash of axis instances or object literals used to construct the appropriate axes.
 * @param val
 * @return self for method chaining
 */
public final native CartesianChart axes(JsArray<AxisConfig> val)/*-{
this.set("axes", val);
return this; 
}-*/;
}
