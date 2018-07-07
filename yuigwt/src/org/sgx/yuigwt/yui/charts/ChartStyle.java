package org.sgx.yuigwt.yui.charts;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * Style properties for the chart.  
 * @see http://yuilibrary.com/yui/docs/api/classes/CartesianChart.html#attr_styles
 * @author sg
 *
 */
public class ChartStyle extends JavaScriptObject{
protected ChartStyle(){}

/**
 * A key indexed hash containing references to the styles attribute for each series in the chart.  Specific style attributes vary depending on the series class. 
 * @return
 */
public native final JavaScriptObject series() /*-{
return this.series; 
}-*/;

/**
 * A key indexed hash containing references to the styles attribute for each series in the chart.  Specific style attributes vary depending on the series class. 
 * @param val
 * @return this - for setter chaining
 */
public native final ChartStyle series(JavaScriptObject val) /*-{
this.series = val; 
return this; 
}-*/;
/**
 * A key indexed hash containing references to the styles attribute for each series in the chart.  Specific style attributes vary depending on the series class. 
 * @param val
 * @return this - for setter chaining
 */
public native final ChartStyle series(String name, JavaScriptObject val) /*-{
	if(!this.series)
		this.series={}; 
	this.series[name]=val; 
	return this; 
}-*/;
/**
 * A key indexed hash containing references to the styles attribute for each axes in the chart. Specific style attributes can be found in the Axis class (http://yuilibrary.com/yui/docs/api/classes/Axis.html#attr_styles).
 * @return
 */
public native final JavaScriptObject axes() /*-{
return this.axes; 
}-*/;

/**
 * A key indexed hash containing references to the styles attribute for each axes in the chart. Specific style attributes can be found in the Axis class (http://yuilibrary.com/yui/docs/api/classes/Axis.html#attr_styles).
 * @param val
 * @return this - for setter chaining
 */
public native final ChartStyle axes(AxisStyle val) /*-{
this.axes = val; 
return this; 
}-*/;
/**
 * A key indexed hash containing references to the styles attribute for each axes in the chart. Specific style attributes can be found in the Axis class (http://yuilibrary.com/yui/docs/api/classes/Axis.html#attr_styles).
 * @param val
 * @return this - for setter chaining
 */
public native final ChartStyle axes(String name, AxisStyle val) /*-{
if(!this.axes)
	this.axes={}; 
this.axes[name]=val; 
return this; 
}-*/;
/**
 * A reference to the styles attribute in the chart. Specific style attributes can be found in the Graph class (http://yuilibrary.com/yui/docs/api/classes/Graph.html#attr_styles).
 * @return
 */
public native final JavaScriptObject graph() /*-{
return this.graph; 
}-*/;

/**
 * A reference to the styles attribute in the chart. Specific style attributes can be found in the Graph class (http://yuilibrary.com/yui/docs/api/classes/Graph.html#attr_styles).
 * @param val
 * @return this - for setter chaining
 */
public native final ChartStyle graph(JavaScriptObject val) /*-{
this.graph = val; 
return this; 
}-*/;
}
