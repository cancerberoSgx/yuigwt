package org.sgx.yuigwt.yui.charts;
/**
 * The MarkerSeries class renders quantitative data by plotting relevant data points on a graph.
 * @author sg
 *
 */
public class MarkerSeries extends CartesianSeries {
protected MarkerSeries(){}
/**
 * 
 * @return the attribute
 */
public final native MarkerSeriesStyle styles()/*-{
return this.get("styles");
}-*/;

/**
 * 
 * @param val
 * @return self for method chaining
 */
public final native MarkerSeries styles(MarkerSeriesStyle val)/*-{
this.set("styles", val);
return this; 
}-*/;
}
