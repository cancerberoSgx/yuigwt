package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

/**
 * The ChartBase class comes with a built-in simple tooltip. This tooltip can be customized or disabled with the tooltip attribute
 * @see http://yuilibrary.com/yui/docs/charts/#usingtooltip
 * 
 * TODO: all the function props like setTextFunction, planarLabelFunction, planarEventHandler, etc
 * @author sg
 *
 */
public class Tooltip extends JavaScriptObject {
protected Tooltip(){}
public static final native Tooltip create()/*-{
	return {}; 
}-*/;

/**
 * @see http://yuilibrary.com/yui/docs/charts/charts-customizedtooltip.html
 *
 */
public static interface MarkLabelFunction {
	/**
	 * function used to format a marker event triggered tooltip's text. The method contains the following arguments: 
	 * @param categoryItem
	 * @param valueItem
	 * @param itemIndex The index of the item within the series.
	 * @param series The CartesianSeries instance of the item.
	 * @param seriesIndex The index of the series in the seriesCollection.
	 * @return The method returns an HTMLElement which is written into the DOM using appendChild. If you override this method and choose to return an html string, you will also need to override the tooltip's setTextFunction method to accept an html string. 
	 */
	Element call(Item categoryItem, Item valueItem, int itemIndex, CartesianSeries series, int seriesIndex); 
}
/**
 * registers a markerLabelFunction
 * @param fn
 * @return self for method chaining
 */
public native final Tooltip markerLabelFunction(MarkLabelFunction fn) /*-{
	var f = $entry(function(categoryItem, valueItem, itemIndex, series, seriesIndex){
		return fn.@org.sgx.yuigwt.yui.charts.Tooltip.MarkLabelFunction::call(Lorg/sgx/yuigwt/yui/charts/Item;Lorg/sgx/yuigwt/yui/charts/Item;ILorg/sgx/yuigwt/yui/charts/CartesianSeries;I)(categoryItem, valueItem, itemIndex, series, seriesIndex); 
	}); 
	this.markerLabelFunction=f;
	return this;  
}-*/;





/**
 * @see http://yuilibrary.com/yui/docs/charts/charts-customizedtooltip.html
 *
 */
public static interface PlanarLabelFunction {
	/**
	 * function used to format a marker event triggered tooltip's text. The method contains the following arguments: 
	 * @param categoryItem
	 * @param valueItem
	 * @param itemIndex The index of the item within the series.
	 * @param series The CartesianSeries instance of the item.
	 * @param seriesIndex The index of the series in the seriesCollection.
	 * @return The method returns an HTMLElement which is written into the DOM using appendChild. If you override this method and choose to return an html string, you will also need to override the tooltip's setTextFunction method to accept an html string. 
	 */
	Element call(Item categoryItem, Item valueItem, int itemIndex, CartesianSeries series, int seriesIndex); 
}





/**
 * Event that hides the tooltip. This allows you to specify which mouse event(s) hides the tooltip. You can also pass this an array of events and each event in the array will hide the tooltip. The default value is mouseout.
 * @return
 */
public native final String hideEvent() /*-{
return this.hideEvent; 
}-*/;

/**
 * Event that hides the tooltip. This allows you to specify which mouse event(s) hides the tooltip. You can also pass this an array of events and each event in the array will hide the tooltip. The default value is mouseout.
 * @param val
 * @return this - for setter chaining
 */
public native final Tooltip hideEvent(String val) /*-{
this.hideEvent = val; 
return this; 
}-*/;

/**
 * Reference (read-only) to the actual dom node of the tooltip.
 * @return
 */
public native final Node node() /*-{
return this.node; 
}-*/;

/**
 * Reference (read-only) to the actual dom node of the tooltip.
 * @param val
 * @return this - for setter chaining
 */
public native final Tooltip node(Node val) /*-{
this.node = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final boolean show() /*-{
return this.show; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Tooltip show(boolean val) /*-{
this.show = val; 
return this; 
}-*/;

/**
 * Event that triggers the tooltip. This allows you to specify which mouse event will cause the tooltip to display. The default value is mouseover
 * @return
 */
public native final String showEvent() /*-{
return this.showEvent; 
}-*/;

/**
 * Event that triggers the tooltip. This allows you to specify which mouse event will cause the tooltip to display. The default value is mouseover
 * @param val
 * @return this - for setter chaining
 */
public native final Tooltip showEvent(String val) /*-{
this.showEvent = val; 
return this; 
}-*/;

/**
 * Hash of CSS styles that are applied to the tooltip's node.
 * @return
 */
public native final Style styles() /*-{
return this.styles; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Tooltip styles(Style val) /*-{
this.styles = val; 
return this; 
}-*/;
}
