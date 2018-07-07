package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.widget.WidgetConfig;

import com.google.gwt.core.client.JsArray;
/**
 * 
 * this class represents ChartBase config object
 * @see http://yuilibrary.com/yui/docs/api/classes/ChartBase.html
 * @author sg
 *
 */
public class ChartBaseConfig extends WidgetConfig {
protected ChartBaseConfig(){}
public static final native ChartBaseConfig create()/*-{
	return {}; 
}-*/;

/**
 * Sets the aria description for the chart.
 * @return
 */
public native final String ariaDescription() /*-{
return this.ariaDescription; 
}-*/;

/**
 * Sets the aria description for the chart.
 * @param val
 * @return this - for setter chaining
 */
public native final ChartBaseConfig ariaDescription(String val) /*-{
this.ariaDescription = val; 
return this; 
}-*/;

/**
 * Sets the aria-label for the chart
 * @return
 */
public native final String ariaLabel() /*-{
return this.ariaLabel; 
}-*/;

/**
 * Sets the aria-label for the chart
 * @param val
 * @return this - for setter chaining
 */
public native final ChartBaseConfig ariaLabel(String val) /*-{
this.ariaLabel = val; 
return this; 
}-*/;

///**
// * 
// * @return
// */
//public native final JavaScriptObject axes() /*-{
//return this.axes; 
//}-*/;
//
///**
// * 
// * @param val
// * @return this - for setter chaining
// */
//public native final ChartBaseConfig axes(JavaScriptObject val) /*-{
//this.axes = val; 
//return this; 
//}-*/;
///**
// * 
// * @param val
// * @return this - for setter chaining
// */
//public native final ChartBaseConfig axes(JavaScriptObject val) /*-{
//this.axes = val; 
//return this; 
//}-*/;

/**
 * Reference to all the axes in the chart.
 * @return
 */
public native final JsArray<Axis> axesCollection() /*-{
return this.axesCollection; 
}-*/;

/**
 * Reference to all the axes in the chart.
 * @param val
 * @return this - for setter chaining
 */
public native final ChartBaseConfig axesCollection(JsArray<Axis> val) /*-{
this.axesCollection = val; 
return this; 
}-*/;
/**
 * Reference to all the axes in the chart.
 * @param val
 * @return this - for setter chaining
 */
public native final ChartBaseConfig axesCollection(Axis[] val) /*-{
this.axesCollection = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;

/**
 * The key value used for the chart's category axis.Default: category
 * @return
 */
public native final String categoryKey() /*-{
return this.categoryKey; 
}-*/;

/**
 * The key value used for the chart's category axis.Default: category
 * @param val
 * @return this - for setter chaining
 */
public native final ChartBaseConfig categoryKey(String val) /*-{
this.categoryKey = val; 
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
public native final ChartBaseConfig categoryType(String val) /*-{
this.categoryType = val; 
return this; 
}-*/;

/**
 * Data used to generate the chart.
 * @return
 */
public native final JsArray dataProvider() /*-{
return this.dataProvider; 
}-*/;

/**
 * Data used to generate the chart.
 * @param val
 * @return this - for setter chaining
 */
public native final ChartBaseConfig dataProvider(JsArray val) /*-{
this.dataProvider = val; 
return this; 
}-*/;

/**
 * Reference to graph instance
 * @return
 */
public native final Graph graph() /*-{
return this.graph; 
}-*/;

/**
 * Reference to graph instance
 * @param val
 * @return this - for setter chaining
 */
public native final ChartBaseConfig graph(Graph val) /*-{
this.graph = val; 
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
public native final ChartBaseConfig groupMarkers(boolean val) /*-{
this.groupMarkers = val; 
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
 * @return
 */
public native final String interactionType() /*-{
return this.interactionType; 
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
 * @param val
 * @return this - for setter chaining
 */
public native final ChartBaseConfig interactionType(String val) /*-{
this.interactionType = val; 
return this; 
}-*/;


/**
 * 
 * @return
 */
public native final Tooltip tooltip() /*-{
return this.tooltip; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final ChartBaseConfig tooltip(Tooltip val) /*-{
this.tooltip = val; 
return this; 
}-*/;

/**
 * attribute added when using module chart-legend
 * @return
 */
public native final ChartLegendConfig legend() /*-{
return this.legend; 
}-*/;

/**
 * attribute added when using module chart-legend
 * @param val
 * @return this - for setter chaining
 */
public native final ChartBaseConfig legend(ChartLegendConfig val) /*-{
this.legend = val; 
return this; 
}-*/;

}
