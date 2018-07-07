package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.graphic.Shape;
import org.sgx.yuigwt.yui.widget.WidgetConfig;
import org.sgx.yuigwt.yui.widget.ext.WidgetExtConfig;

public class ChartLegendConfig extends WidgetConfig{
protected ChartLegendConfig(){}
public static native final ChartLegendConfig create()/*-{
	return {}; 
}-*/;

/**
 * Background for the legend. Must be a Rect shape
 * @return
 */
public native final Shape background() /*-{
return this.background; 
}-*/;

/**
 * Background for the legend. Must be a Rect shape
 * @param val
 * @return this - for setter chaining
 */
public native final ChartLegendConfig background(Shape val) /*-{
this.background = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final String position() /*-{
return this.position; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final ChartLegendConfig position(String val) /*-{
this.position = val; 
return this; 
}-*/;

/**
 * Indicates the direction in relation of the legend's layout. The direction of the legend is determined by its position value.
 * @return
 */
public native final String direction() /*-{
return this.direction; 
}-*/;

/**
 * Indicates the direction in relation of the legend's layout. The direction of the legend is determined by its position value.
 * @param val
 * @return this - for setter chaining
 */
public native final ChartLegendConfig direction(String val) /*-{
this.direction = val; 
return this; 
}-*/;



///**
//* 
//* @return
//*/
//public native final int width() /*-{
//return this.width; 
//}-*/;
//
///**
//* 
//* @param val
//* @return this - for setter chaining
//*/
//public native final ChartLegend width(int val) /*-{
//this.width = val; 
//return this; 
//}-*/;
//
///**
//* 
//* @return
//*/
//public native final int height() /*-{
//return this.height; 
//}-*/;
//
///**
//* 
//* @param val
//* @return this - for setter chaining
//*/
//public native final ChartLegend height(int val) /*-{
//this.height = val; 
//return this; 
//}-*/;
}
