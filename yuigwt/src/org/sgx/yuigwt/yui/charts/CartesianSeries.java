package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.base.Base;

import com.google.gwt.core.client.JsArray;

/**
 * The CartesianSeries class creates a chart with horizontal and vertical axes.
 * @see http://yuilibrary.com/yui/docs/api/classes/CartesianSeries.html
 * @author sg
 *
 */
public class CartesianSeries extends Base {
protected CartesianSeries(){}
public static final native CartesianSeries create()/*-{
	return {}; 
}-*/;

/**
 * Returns the sum of all values for the series.
 * @return self for method chaining
 */
public native final double getTotalValues() /*-{
return this.getTotalValues();
}-*/;


/**
 * Name used for for displaying category data
 * @return the attribute
 */
public final native String categoryDisplayName()/*-{
return this.get("categoryDisplayName");
}-*/;

/**
 * Name used for for displaying category data
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries categoryDisplayName(String val)/*-{
this.set("categoryDisplayName", val);
return this; 
}-*/;

/**
 * Reference to the Chart application
 * @return the attribute
 */
public final native ChartBase chart()/*-{
return this.get("chart");
}-*/;

/**
 * Reference to the Chart application
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries chart(ChartBase val)/*-{
this.set("chart", val);
return this; 
}-*/;

/**
 * Direction of the series
 * @return the attribute
 */
public final native String direction()/*-{
return this.get("direction");
}-*/;

/**
 * Direction of the series
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries direction(String val)/*-{
this.set("direction", val);
return this; 
}-*/;

/**
 * Reference to the Graph in which the series is drawn into.
 * @return the attribute
 */
public final native Graph graph()/*-{
return this.get("graph");
}-*/;

/**
 * Reference to the Graph in which the series is drawn into.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries graph(Graph val)/*-{
this.set("graph", val);
return this; 
}-*/;

/**
 * Order of the instance
 * @return the attribute
 */
public final native int graphOrder()/*-{
return this.get("graphOrder");
}-*/;

/**
 * Order of the instance
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries graphOrder(int val)/*-{
this.set("graphOrder", val);
return this; 
}-*/;

/**
 * Indicates whether or not markers for a series will be grouped and rendered in a single complex shape instance.
 * @return the attribute
 */
public final native boolean groupMarkers()/*-{
return this.get("groupMarkers");
}-*/;

/**
 * Indicates whether or not markers for a series will be grouped and rendered in a single complex shape instance.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries groupMarkers(boolean val)/*-{
this.set("groupMarkers", val);
return this; 
}-*/;

/**
 * Returns the height of the parent graph
 * @return the attribute
 */
public final native int height()/*-{
return this.get("height");
}-*/;

/**
 * Returns the height of the parent graph
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries height(int val)/*-{
this.set("height", val);
return this; 
}-*/;

/**
 * Order of this instance of this type
 * @return the attribute
 */
public final native int order()/*-{
return this.get("order");
}-*/;

/**
 * Order of this instance of this type
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries order(int val)/*-{
this.set("order", val);
return this; 
}-*/;

/**
 * Indicates whether the Series has been through its initial set up.
 * @return the attribute
 */
public final native boolean rendered()/*-{
return this.get("rendered");
}-*/;

/**
 * Indicates whether the Series has been through its initial set up.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries rendered(boolean val)/*-{
this.set("rendered", val);
return this; 
}-*/;

/**
 * Read-only attribute indicating the type of series. Default: cartesian
 * @return the attribute
 */
public final native String type()/*-{
return this.get("type");
}-*/;

/**
 * Read-only attribute indicating the type of series. Default: cartesian
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries type(String val)/*-{
this.set("type", val);
return this; 
}-*/;

/**
 * Name used for for displaying value data
 * @return the attribute
 */
public final native String valueDisplayName()/*-{
return this.get("valueDisplayName");
}-*/;

/**
 * Name used for for displaying value data
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries valueDisplayName(String val)/*-{
this.set("valueDisplayName", val);
return this; 
}-*/;

/**
 * Indicates whether to show the series
 * @return the attribute
 */
public final native boolean visible()/*-{
return this.get("visible");
}-*/;

/**
 * Indicates whether to show the series
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries visible(boolean val)/*-{
this.set("visible", val);
return this; 
}-*/;

/**
 * Reference to the Axis instance used for assigning x-values to the graph.
 * @return the attribute
 */
public final native Axis xAxis()/*-{
return this.get("xAxis");
}-*/;

/**
 * Reference to the Axis instance used for assigning x-values to the graph.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries xAxis(Axis val)/*-{
this.set("xAxis", val);
return this; 
}-*/;

/**
 * x coordinates for the series.
 * @return the attribute
 */
public final native JsArray xcoords()/*-{
return this.get("xcoords");
}-*/;

/**
 * x coordinates for the series.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries xcoords(JsArray val)/*-{
this.set("xcoords", val);
return this; 
}-*/;

/**
 * Array of x values for the series.
 * @return the attribute
 */
public final native JsArray xData()/*-{
return this.get("xData");
}-*/;

/**
 * Array of x values for the series.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries xData(JsArray val)/*-{
this.set("xData", val);
return this; 
}-*/;

/**
 * Name used for for displaying data related to the x-coordinate.
 * @return the attribute
 */
public final native String xDisplayName()/*-{
return this.get("xDisplayName");
}-*/;

/**
 * Name used for for displaying data related to the x-coordinate.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries xDisplayName(String val)/*-{
this.set("xDisplayName", val);
return this; 
}-*/;

/**
 * Indicates which array to from the hash of value arrays in the x-axis Axis instance.
 * @return the attribute
 */
public final native String xKey()/*-{
return this.get("xKey");
}-*/;

/**
 * Indicates which array to from the hash of value arrays in the x-axis Axis instance.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries xKey(String val)/*-{
this.set("xKey", val);
return this; 
}-*/;

/**
 * Collection of area maps along the xAxis. Used to determine mouseover for multiple series.
 * @return the attribute
 */
public final native JsArray xMarkerPlane()/*-{
return this.get("xMarkerPlane");
}-*/;

/**
 * Collection of area maps along the xAxis. Used to determine mouseover for multiple series.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries xMarkerPlane(JsArray val)/*-{
this.set("xMarkerPlane", val);
return this; 
}-*/;

/**
 * Distance from a data coordinate to the left/right for setting a hotspot.
 * @return the attribute
 */
public final native double xMarkerPlaneOffset()/*-{
return this.get("xMarkerPlaneOffset");
}-*/;

/**
 * Distance from a data coordinate to the left/right for setting a hotspot.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries xMarkerPlaneOffset(double val)/*-{
this.set("xMarkerPlaneOffset", val);
return this; 
}-*/;

/**
 * Reference to the Axis instance used for assigning y-values to the graph.
 * @return the attribute
 */
public final native Axis yAxis()/*-{
return this.get("yAxis");
}-*/;

/**
 * Reference to the Axis instance used for assigning y-values to the graph.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries yAxis(Axis val)/*-{
this.set("yAxis", val);
return this; 
}-*/;

/**
 * y coordinates for the series
 * @return the attribute
 */
public final native JsArray ycoords()/*-{
return this.get("ycoords");
}-*/;

/**
 * y coordinates for the series
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries ycoords(JsArray val)/*-{
this.set("ycoords", val);
return this; 
}-*/;

/**
 * Array of y values for the series.
 * @return the attribute
 */
public final native JsArray yData()/*-{
return this.get("yData");
}-*/;

/**
 * Array of y values for the series.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries yData(JsArray val)/*-{
this.set("yData", val);
return this; 
}-*/;

/**
 * Name used for for displaying data related to the y-coordinate.
 * @return the attribute
 */
public final native String yDisplayName()/*-{
return this.get("yDisplayName");
}-*/;

/**
 * Name used for for displaying data related to the y-coordinate.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries yDisplayName(String val)/*-{
this.set("yDisplayName", val);
return this; 
}-*/;

/**
 * Indicates which array to from the hash of value arrays in the y-axis Axis instance.
 * @return the attribute
 */
public final native String yKey()/*-{
return this.get("yKey");
}-*/;

/**
 * Indicates which array to from the hash of value arrays in the y-axis Axis instance.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries yKey(String val)/*-{
this.set("yKey", val);
return this; 
}-*/;

/**
 * Collection of area maps along the yAxis. Used to determine mouseover for multiple series.
 * @return the attribute
 */
public final native JsArray yMarkerPlane()/*-{
return this.get("yMarkerPlane");
}-*/;

/**
 * Collection of area maps along the yAxis. Used to determine mouseover for multiple series.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries yMarkerPlane(JsArray val)/*-{
this.set("yMarkerPlane", val);
return this; 
}-*/;
/**
 * Distance from a data coordinate to the top/bottom for setting a hotspot.
 * @return the attribute
 */
public final native double yMarkerPlaneOffset()/*-{
return this.get("yMarkerPlaneOffset");
}-*/;

/**
 * Distance from a data coordinate to the top/bottom for setting a hotspot.
 * @param val
 * @return self for method chaining
 */
public final native CartesianSeries yMarkerPlaneOffset(double val)/*-{
this.set("yMarkerPlaneOffset", val);
return this; 
}-*/;
}
