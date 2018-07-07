package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.base.BaseConfig;

import com.google.gwt.core.client.JsArray;

public class CartesianSeriesConfig extends BaseConfig{
protected CartesianSeriesConfig(){}
public static native final CartesianSeriesConfig create()/*-{
return {}; 
}-*/;

/**
 * Name used for for displaying category data
 * @return
 */
public native final String categoryDisplayName() /*-{
return this.categoryDisplayName; 
}-*/;

/**
 * Name used for for displaying category data
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig categoryDisplayName(String val) /*-{
this.categoryDisplayName = val; 
return this; 
}-*/;

/**
 * Reference to the Chart application
 * @return
 */
public native final ChartBase chart() /*-{
return this.chart; 
}-*/;

/**
 * Reference to the Chart application
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig chart(ChartBase val) /*-{
this.chart = val; 
return this; 
}-*/;

/**
 * Direction of the series
 * @return
 */
public native final String direction() /*-{
return this.direction; 
}-*/;

/**
 * Direction of the series
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig direction(String val) /*-{
this.direction = val; 
return this; 
}-*/;

/**
 * Order of the instance
 * @return
 */
public native final int graphOrder() /*-{
return this.graphOrder; 
}-*/;

/**
 * Order of the instance
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig graphOrder(int val) /*-{
this.graphOrder = val; 
return this; 
}-*/;

/**
 * Indicates whether or not markers for a series will be grouped and rendered in a single complex shape instance.
 * @return
 */
public native final boolean groupMarkers() /*-{
return this.groupMarkers; 
}-*/;

/**
 * Indicates whether or not markers for a series will be grouped and rendered in a single complex shape instance.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig groupMarkers(boolean val) /*-{
this.groupMarkers = val; 
return this; 
}-*/;
/**
 * Returns the height of the parent graph
 * @return
 */
public native final int height() /*-{
return this.height; 
}-*/;

/**
 * Returns the height of the parent graph
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig height(int val) /*-{
this.height = val; 
return this; 
}-*/;

/**
 * Order of this instance of this type
 * @return
 */
public native final int order() /*-{
return this.order; 
}-*/;

/**
 * Order of this instance of this type
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig order(int val) /*-{
this.order = val; 
return this; 
}-*/;


/**
 * Indicates whether the Series has been through its initial set up.
 * @return
 */
public native final boolean rendered() /*-{
return this.rendered; 
}-*/;

/**
 * Indicates whether the Series has been through its initial set up.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig rendered(boolean val) /*-{
this.rendered = val; 
return this; 
}-*/;

/**
 * Read-only attribute indicating the type of series. Default: cartesian
 * @return
 */
public native final String seriesType() /*-{
return this.type; 
}-*/;

/**
 * Read-only attribute indicating the type of series. Default: cartesian
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig seriesType(String val) /*-{
this.type = val; 
return this; 
}-*/;

/**
 * Name used for for displaying value data
 * @return
 */
public native final String valueDisplayName() /*-{
return this.valueDisplayName; 
}-*/;

/**
 * Name used for for displaying value data
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig valueDisplayName(String val) /*-{
this.valueDisplayName = val; 
return this; 
}-*/;

/**
 * Indicates whether to show the series
 * @return
 */
public native final boolean visible() /*-{
return this.visible; 
}-*/;

/**
 * Indicates whether to show the series
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig visible(boolean val) /*-{
this.visible = val; 
return this; 
}-*/;

/**
 * Reference to the Axis instance used for assigning x-values to the graph.
 * @return
 */
public native final Axis xAxis() /*-{
return this.xAxis; 
}-*/;

/**
 * Reference to the Axis instance used for assigning x-values to the graph.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig xAxis(Axis val) /*-{
this.xAxis = val; 
return this; 
}-*/;

/**
 * x coordinates for the series.
 * @return
 */
public native final JsArray xcoords() /*-{
return this.xcoords; 
}-*/;

/**
 * x coordinates for the series.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig xcoords(JsArray val) /*-{
this.xcoords = val; 
return this; 
}-*/;

/**
 * Array of x values for the series.
 * @return
 */
public native final JsArray xData() /*-{
return this.xData; 
}-*/;

/**
 * Array of x values for the series.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig xData(JsArray val) /*-{
this.xData = val; 
return this; 
}-*/;

/**
 * Name used for for displaying data related to the x-coordinate.
 * @return
 */
public native final String xDisplayName() /*-{
return this.xDisplayName; 
}-*/;

/**
 * Name used for for displaying data related to the x-coordinate.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig xDisplayName(String val) /*-{
this.xDisplayName = val; 
return this; 
}-*/;

/**
 * Indicates which array to from the hash of value arrays in the x-axis Axis instance.
 * @return
 */
public native final String xKey() /*-{
return this.xKey; 
}-*/;

/**
 * Indicates which array to from the hash of value arrays in the x-axis Axis instance.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig xKey(String val) /*-{
this.xKey = val; 
return this; 
}-*/;

/**
 * Collection of area maps along the xAxis. Used to determine mouseover for multiple series.
 * @return
 */
public native final JsArray xMarkerPlane() /*-{
return this.xMarkerPlane; 
}-*/;

/**
 * Collection of area maps along the xAxis. Used to determine mouseover for multiple series.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig xMarkerPlane(JsArray val) /*-{
this.xMarkerPlane = val; 
return this; 
}-*/;
/**
 * Distance from a data coordinate to the left/right for setting a hotspot.
 * @return
 */
public native final double xMarkerPlaneOffset() /*-{
return this.xMarkerPlaneOffset; 
}-*/;

/**
 * Distance from a data coordinate to the left/right for setting a hotspot.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig xMarkerPlaneOffset(double val) /*-{
this.xMarkerPlaneOffset = val; 
return this; 
}-*/;

/**
 * Reference to the Axis instance used for assigning y-values to the graph.
 * @return
 */
public native final Axis yAxis() /*-{
return this.yAxis; 
}-*/;

/**
 * Reference to the Axis instance used for assigning y-values to the graph.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig yAxis(Axis val) /*-{
this.yAxis = val; 
return this; 
}-*/;

/**
 * y coordinates for the series
 * @return
 */
public native final JsArray ycoords() /*-{
return this.ycoords; 
}-*/;

/**
 * y coordinates for the series
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig ycoords(JsArray val) /*-{
this.ycoords = val; 
return this; 
}-*/;

/**
 * Array of y values for the series.
 * @return
 */
public native final JsArray yData() /*-{
return this.yData; 
}-*/;

/**
 * Array of y values for the series.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig yData(JsArray val) /*-{
this.yData = val; 
return this; 
}-*/;

/**
 * Name used for for displaying data related to the y-coordinate.
 * @return
 */
public native final String yDisplayName() /*-{
return this.yDisplayName; 
}-*/;

/**
 * Name used for for displaying data related to the y-coordinate.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig yDisplayName(String val) /*-{
this.yDisplayName = val; 
return this; 
}-*/;

/**
 * Indicates which array to from the hash of value arrays in the y-axis Axis instance.
 * @return
 */
public native final String yKey() /*-{
return this.yKey; 
}-*/;

/**
 * Indicates which array to from the hash of value arrays in the y-axis Axis instance.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig yKey(String val) /*-{
this.yKey = val; 
return this; 
}-*/;

/**
 * Collection of area maps along the yAxis. Used to determine mouseover for multiple series.
 * @return
 */
public native final JsArray yMarkerPlane() /*-{
return this.yMarkerPlane; 
}-*/;

/**
 * Collection of area maps along the yAxis. Used to determine mouseover for multiple series.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig yMarkerPlane(JsArray val) /*-{
this.yMarkerPlane = val; 
return this; 
}-*/;

/**
 * Distance from a data coordinate to the top/bottom for setting a hotspot.
 * @return
 */
public native final double yMarkerPlaneOffset() /*-{
return this.yMarkerPlaneOffset; 
}-*/;

/**
 * Distance from a data coordinate to the top/bottom for setting a hotspot.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianSeriesConfig yMarkerPlaneOffset(double val) /*-{
this.yMarkerPlaneOffset = val; 
return this; 
}-*/;
}
