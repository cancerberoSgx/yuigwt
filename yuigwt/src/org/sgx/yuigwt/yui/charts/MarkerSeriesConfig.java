package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.util.JsObject;
/**
 * The MarkerSeries class renders quantitative data by plotting relevant data points on a graph.
 * @author sg
 *
 */
public class MarkerSeriesConfig extends CartesianSeriesConfig {
protected MarkerSeriesConfig(){}
//public static final native MarkerSeriesConfig create()/*-{
//	return {}; 
//}-*/;
/**
 * 
 * @return
 */
public native final MarkerSeriesStyle styles() /*-{
return this.styles; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final MarkerSeriesConfig styles(MarkerSeriesStyle val) /*-{
this.styles = val; 
return this; 
}-*/;

///**
// * alias for type
// * @return
// */
//public native final String seriesType() /*-{
//return this.type; 
//}-*/;
//
///**
// * alias for type
// * @param val
// * @return this - for setter chaining
// */
//public native final MarkerSeriesConfig seriesType(String val) /*-{
//this.type = val; 
//return this; 
//}-*/;
}
