package org.sgx.yuigwt.yui.charts;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class PieChartConfig extends ChartBaseConfig {
protected PieChartConfig(){}

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
 * Collection of series to appear on the chart. This can be an array of Series instances or object literals used to describe a Series instance.
 * @return
 */
public native final JavaScriptObject seriesCollection() /*-{
return this.seriesCollection; 
}-*/;

/**
 * Collection of series to appear on the chart. This can be an array of Series instances or object literals used to describe a Series instance.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig seriesCollection(JsArray val) /*-{
this.seriesCollection = val; 
return this; 
}-*/;

/**
 * Collection of series to appear on the chart. This can be an array of Series instances or object literals used to describe a Series instance.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig seriesCollection(PieSeries[] val) /*-{
this.seriesCollection = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;

/**
 * Collection of series to appear on the chart. This can be an array of Series instances or object literals used to describe a Series instance.
 * @param val
 * @return this - for setter chaining
 */
public native final CartesianChartConfig seriesCollection(PieSeriesConfig[] val) /*-{
this.seriesCollection = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;
}
