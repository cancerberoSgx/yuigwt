package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.widget.Widget;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
/**
 * The ChartBase class is an abstract class used to create charts.
 * This class represents ChartBase
 * @see http://yuilibrary.com/yui/docs/api/classes/ChartBase.html
 * @author sg
 *
 */
public class ChartBase extends Widget {
protected ChartBase(){}

/**
 * Visualizes quantitative data with a fill between an axis and relevant data points.
 */
public static final String TYPE_AREA="area"; 
/**
 * An Area ChartBase in which data points are connected by a curve.
 */
public static final String TYPE_AREASPLINE="areaspline"; 
/**
 * Visualizes bars positioned vertically along a category or time axis. The bars' lengths are proportional to the values they represent along a horizontal axis.
 */
public static final String TYPE_BAR="bar"; 
/**
 * Visualizes bars positioned vertically along a category or time axis. The bars' lengths are proportional to the values they represent along a horizontal axis.
 */
public static final String TYPE_COLUMN="column"; 
/**
 * Visualizes bars positioned vertically along a category or time axis. The bars' lengths are proportional to the values they represent along a horizontal axis.
 */
public static final String TYPE_COMBO="combo"; 
/**
 * A combo chart in which the data points are connected by a curve.
 */
public static final String TYPE_COMBOSPLINE="combospline"; 
/**
 * Visualizes quantitative data on a graph by connecting relevant data points.
 */
public static final String TYPE_LINE="line";
/**
 * Visualizes quantitative data on a graph by connecting relevant data points.
 */
public static final String TYPE_MARKERSERIES="markerseries";
/**
 * A circular chart divided into wedges which represent data as a percentage of a whole.
 */
public static final String TYPE_PIE="pie";
/**
 * Visualizes quantitative data on a graph by connecting relevant data points with a curve.
 */
public static final String TYPE_SPLINE="spline";

/**
 * Returns an Axis instance by key reference. If the axis was explicitly set through the axes attribute, the key will be the same as the key used in the axes object. For default axes, the key for the category axis is the value of the categoryKey (category). For the value axis, the default key is values.
 * @param Key reference used to look up the axis.
 * @return self for method chaining
 */
public native final Axis getAxisByKey(String val) /*-{
return this.getAxisByKey(val);
}-*/;

/**
 * Returns the category axis for the chart.
 * @return
 */
public native final Axis getCategoryAxis() /*-{
return this.getCategoryAxis();
}-*/;
/**
 * Returns a series instance by index or key value.
 * @return
 */
public native final CartesianSeries getSeries(int index) /*-{
return this.getSeries(index);
}-*/;
/**
 * Returns a series instance by index or key value.
 * @return
 */
public native final CartesianSeries getSeries(String key) /*-{
return this.getSeries(key);
}-*/;
/**
 * Hides the default tooltip
 * @return self for method chaining
 */
public native final CartesianSeries hideTooltip() /*-{
this.hideTooltip();
return this; 
}-*/;

//TODO toggleTooltip() - not sure 



//attributes
/**
 * Sets the aria description for the chart.
 * @return the attribute
 */
public final native String ariaDescription()/*-{
return this.get("ariaDescription");
}-*/;

/**
 * Sets the aria description for the chart.
 * @param val
 * @return self for method chaining
 */
public final native ChartBase ariaDescription(String val)/*-{
this.set("ariaDescription", val);
return this; 
}-*/;
/**
 * The key value used for the chart's category axis.Default: category
 * @return the attribute
 */
public final native String categoryKey()/*-{
return this.get("categoryKey");
}-*/;

/**
 * Sets the aria-label for the chart.
 * @return the attribute
 */
public final native String ariaLabel()/*-{
return this.get("ariaLabel");
}-*/;

/**
 * Sets the aria-label for the chart.
 * @param val
 * @return self for method chaining
 */
public final native ChartBase ariaLabel(String val)/*-{
this.set("ariaLabel", val);
return this; 
}-*/;

/**
 * 
 * @return the attribute
 */
public final native JsArray<Axis> axesCollection()/*-{
return this.get("axesCollection");
}-*/;

/**
 * 
 * @param val
 * @return self for method chaining
 */
public final native ChartBase axesCollection(JsArray<Axis> val)/*-{
this.set("axesCollection", val);
return this; 
}-*/;
/**
 * 
 * @param val
 * @return self for method chaining
 */
public final native ChartBase axesCollection(Axis[] val)/*-{
this.set("axesCollection", @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val));
return this; 
}-*/;

/**
 * The key value used for the chart's category axis.Default: category
 * @param val
 * @return self for method chaining
 */
public final native ChartBase categoryKey(String val)/*-{
this.set("categoryKey", val);
return this; 
}-*/;

/**
 * Indicates the type of axis to use for the category axis.
 * @return
 */
public native final String categoryType() /*-{
return this.categoryType; 
}-*/;

/**
 * Indicates the type of axis to use for the category axis.
 * @param val
 * @return this - for setter chaining
 */
public native final ChartBase categoryType(String val) /*-{
this.categoryType = val; 
return this; 
}-*/;
/**
 * Reference to graph instance.
 * @return the attribute
 */
public final native Graph graph()/*-{
return this.get("graph");
}-*/;

/**
 * Reference to graph instance.
 * @param val
 * @return self for method chaining
 */
public final native ChartBase graph(Graph val)/*-{
this.set("graph", val);
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
public final native ChartBase groupMarkers(boolean val)/*-{
this.set("groupMarkers", val);
return this; 
}-*/;
/**
 * Indicates the the type of interactions that will fire events.
<br/>
marker
    Events will be broadcasted when the mouse interacts with individual markers.
    <br/>
planar
    Events will be broadcasted when the mouse intersects the plane of any markers on the chart.
    <br/>
none
    No events will be broadcasted.
<br/>
Default: marker
 * @return the attribute
 */
public final native String interactionType()/*-{
return this.get("interactionType");
}-*/;

/**
 * 
Indicates the the type of interactions that will fire events.
<br/>
marker
    Events will be broadcasted when the mouse interacts with individual markers.
    <br/>
planar
    Events will be broadcasted when the mouse intersects the plane of any markers on the chart.
    <br/>
none
    No events will be broadcasted.
<br/>
Default: marker
 * @param val
 * @return self for method chaining
 */
public final native ChartBase interactionType(String val)/*-{
this.set("interactionType", val);
return this; 
}-*/;

/**
 * A collection of keys that map to the series axes. If no keys are set, they will be generated automatically depending on the data structure passed into the chart.
 * @return the attribute
 */
public final native JsArrayString seriesKeys()/*-{
return this.get("seriesKeys");
}-*/;

/**
 * A collection of keys that map to the series axes. If no keys are set, they will be generated automatically depending on the data structure passed into the chart.
 * @param val
 * @return self for method chaining
 */
public final native ChartBase seriesKeys(JsArrayString val)/*-{
this.set("seriesKeys", val);
return this; 
}-*/;

/**
 * attribute added when using module chart-legend
 * @return the attribute
 */
public final native ChartLegend legend()/*-{
return this.get("legend");
}-*/;

/**
 * attribute added when using module chart-legend
 * @param val
 * @return self for method chaining
 */
public final native ChartBase legend(ChartLegend val)/*-{
this.set("legend", val);
return this; 
}-*/;
}
