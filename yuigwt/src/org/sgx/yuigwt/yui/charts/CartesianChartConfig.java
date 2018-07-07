package org.sgx.yuigwt.yui.charts;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class CartesianChartConfig extends ChartBaseConfig{
protected CartesianChartConfig(){}

/**
 * Indicates whether axis labels are allowed to overflow beyond the bounds of the chart's content box.
 * @return
 */
public native final boolean allowContentOverflow() /*-{
return this.allowContentOverflow; 
}-*/;

/**
 * Indicates whether axis labels are allowed to overflow beyond the bounds of the chart's content box.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig allowContentOverflow(boolean val) /*-{
this.allowContentOverflow = val; 
return this; 
}-*/;

/**
 * Axes to appear in the chart. This can be a key indexed hash of axis instances or object literals used to construct the appropriate axes.
 * @return
 */
public native final JavaScriptObject axes() /*-{
return this.axes; 
}-*/;

/**
 * Axes to appear in the chart. This can be a key indexed hash of axis instances or object literals used to construct the appropriate axes.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig axes(JavaScriptObject val) /*-{
this.axes = val; 
return this; 
}-*/;
/**
 * add a new axe style config - internally it perform this.axes[name]=val
 * @param name
 * @param val
 * @return
 */
public native final CartesianChartConfig axe(String name, AxisConfig val) /*-{
if(!this.axes)
	this.axes={}; 
this.axes[name]=val; 
return this; 
}-*/;
/**
 * add a new axe style config - internally it perform this.axes[name]=val
 * @param name
 * @param val
 * @return
 */
public native final CartesianChartConfig axe(String name, JavaScriptObject val) /*-{
if(!this.axes)
	this.axes={}; 
this.axes[name]=val; 
return this; 
}-*/;
/**
 * Indicates the key value used to identify a category axis in the axes hash. If not specified, the categoryKey attribute value will be used.
 * @return
 */
public native final String categoryAxisName() /*-{
return this.categoryAxisName; 
}-*/;

/**
 * Indicates the key value used to identify a category axis in the axes hash. If not specified, the categoryKey attribute value will be used.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig categoryAxisName(String val) /*-{
this.categoryAxisName = val; 
return this; 
}-*/;

/**
 * Direction of chart's category axis when there is no series collection specified. Charts can be horizontal or vertical. When the chart type is column, the chart is horizontal. When the chart type is bar, the chart is vertical.
 * @return
 */
public native final String direction() /*-{
return this.direction; 
}-*/;

/**
 * Direction of chart's category axis when there is no series collection specified. Charts can be horizontal or vertical. When the chart type is column, the chart is horizontal. When the chart type is bar, the chart is vertical.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig direction(String val) /*-{
this.direction = val; 
return this; 
}-*/;

/**
 * Reference to the horizontalGridlines for the chart.
 * @return
 */
public native final boolean horizontalGridlines() /*-{
return this.horizontalGridlines; 
}-*/;

/**
 * Reference to the horizontalGridlines for the chart.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig horizontalGridlines(boolean val) /*-{
this.horizontalGridlines = val; 
return this; 
}-*/;

/**
 * Collection of series to appear on the chart. This can be an array of Series instances or object literals used to construct the appropriate series.
 * @return
 */
public native final JsArray seriesCollection() /*-{
return this.seriesCollection; 
}-*/;

/**
 * Collection of series to appear on the chart. This can be an array of Series instances or object literals used to construct the appropriate series.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig seriesCollection(JsArray val) /*-{
this.seriesCollection = val; 
return this; 
}-*/;
/**
 * Collection of series to appear on the chart. This can be an array of Series instances or object literals used to construct the appropriate series.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig seriesCollection(CartesianSeries[] val) /*-{
this.seriesCollection = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;
/**
 * Collection of series to appear on the chart. This can be an array of Series instances or object literals used to construct the appropriate series.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig seriesCollection(CartesianSeriesConfig[] val) /*-{
this.seriesCollection = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;
/**
 * Indicates whether or not an area is filled in a combo chart.
 * @return
 */
public native final boolean showAreaFill() /*-{
return this.showAreaFill; 
}-*/;

/**
 * Indicates whether or not an area is filled in a combo chart.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig showAreaFill(boolean val) /*-{
this.showAreaFill = val; 
return this; 
}-*/;

/**
 * Indicates whether to display lines in a combo chart.
 * @return
 */
public native final boolean showLines() /*-{
return this.showLines; 
}-*/;

/**
 * Indicates whether to display lines in a combo chart.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig showLines(boolean val) /*-{
this.showLines = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final boolean showMarkers() /*-{
return this.showMarkers; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig showMarkers(boolean val) /*-{
this.showMarkers = val; 
return this; 
}-*/;

/**
 * Indicates whether or not the chart is stacked.
 * @return
 */
public native final boolean stacked() /*-{
return this.stacked; 
}-*/;

///**
// * Indicates whether or not the chart is stacked.
// * @param val
// * @return this - for setter chaining
// */
//public native final CartesianChartConfig stacked(boolean val) /*-{
//this.stacked = val; 
//return this; 
//}-*/;
//
///**
// * 
// * @return
// */
//public native final CartesianChartStyle styles(String ) /*-{
//return this.styles; 
//}-*/;

///**
// * Type of chart when there is no series collection specified.
// * @return
// */
//public native final String type() /*-{
//return this.type; 
//}-*/;
//
///**
// * Type of chart when there is no series collection specified.
// * @param val
// * @return this - for setter chaining
// */
//public native final CartesianChartConfig type(String val) /*-{
//this.type = val; 
//return this; 
//}-*/;

/**
 * Indicates the key value used to identify a the series axis when an axis not generated.
 * @return
 */
public native final String valueAxisName() /*-{
return this.valueAxisName; 
}-*/;

/**
 * Indicates the key value used to identify a the series axis when an axis not generated.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig valueAxisName(String val) /*-{
this.valueAxisName = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final boolean verticalGridlines() /*-{
return this.verticalGridlines; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig verticalGridlines(boolean val) /*-{
this.verticalGridlines = val; 
return this; 
}-*/;
}
