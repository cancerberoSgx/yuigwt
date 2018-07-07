package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class MarkerSeriesStyle {
	protected MarkerSeriesStyle(){}
	public static final native MarkerSeriesStyle create()/*-{
		return {}; 
	}-*/;
	

public static class Fill extends JsObject {
	protected Fill(){}
	public static final native Fill create()/*-{
	return {}; 
	}-*/;
	/**
	 * Color of the fill. The default value is determined by the order of the series on the graph. The color will be retrieved from the below array:
	["#6084d0", "#eeb647", "#6c6b5f", "#d6484f", "#ce9ed1", "#ff9f3b", "#93b7ff", "#e0ddd0", "#94ecba", "#309687"]
	 * @return
	 */
	public native final JsArrayString color() /*-{
	return this.fill; 
	}-*/;
	
	/**
	 * Color of the fill. The default value is determined by the order of the series on the graph. The color will be retrieved from the below array:
	["#6084d0", "#eeb647", "#6c6b5f", "#d6484f", "#ce9ed1", "#ff9f3b", "#93b7ff", "#e0ddd0", "#94ecba", "#309687"]
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MarkerSeriesStyle.Fill color(JsArrayString val) /*-{
	this.fill = val; 
	return this; 
	}-*/;
	/**
	 * Color of the fill. The default value is determined by the order of the series on the graph. The color will be retrieved from the below array:
	["#6084d0", "#eeb647", "#6c6b5f", "#d6484f", "#ce9ed1", "#ff9f3b", "#93b7ff", "#e0ddd0", "#94ecba", "#309687"]
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MarkerSeriesStyle.Fill color(String[] val) /*-{
		this.fill = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val);
	}-*/;
	
	/**
	 * Number from 0 to 1 indicating the opacity of the marker fill. The default value is 1.
	 * @return
	 */
	public native final double alpha() /*-{
	return this.alpha; 
	}-*/;
	
	/**
	 * Number from 0 to 1 indicating the opacity of the marker fill. The default value is 1.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MarkerSeriesStyle.Fill alpha(double val) /*-{
	this.alpha = val; 
	return this; 
	}-*/;
}

public static class Border {
	protected Border(){}
	public static final native Border create()/*-{
	return {}; 
	}-*/;
	
	/**
	 * Color of the fill. The default value is determined by the order of the series on the graph. The color will be retrieved from the below array:
	["#6084d0", "#eeb647", "#6c6b5f", "#d6484f", "#ce9ed1", "#ff9f3b", "#93b7ff", "#e0ddd0", "#94ecba", "#309687"]
	 * @return
	 */
	public native final JsArrayString color() /*-{
	return this.fill; 
	}-*/;
	
	/**
	 * Color of the fill. The default value is determined by the order of the series on the graph. The color will be retrieved from the below array:
	["#6084d0", "#eeb647", "#6c6b5f", "#d6484f", "#ce9ed1", "#ff9f3b", "#93b7ff", "#e0ddd0", "#94ecba", "#309687"]
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MarkerSeriesStyle.Border color(JsArrayString val) /*-{
	this.fill = val; 
	return this; 
	}-*/;
	/**
	 * Color of the fill. The default value is determined by the order of the series on the graph. The color will be retrieved from the below array:
	["#6084d0", "#eeb647", "#6c6b5f", "#d6484f", "#ce9ed1", "#ff9f3b", "#93b7ff", "#e0ddd0", "#94ecba", "#309687"]
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MarkerSeriesStyle.Border color(String[] val) /*-{
		this.fill = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val);
	}-*/;
	
	/**
	 * Number from 0 to 1 indicating the opacity of the marker fill. The default value is 1.
	 * @return
	 */
	public native final double alpha() /*-{
	return this.alpha; 
	}-*/;
	
	/**
	 * Number from 0 to 1 indicating the opacity of the marker fill. The default value is 1.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MarkerSeriesStyle.Border alpha(double val) /*-{
	this.alpha = val; 
	return this; 
	}-*/;
	/**
	 * 
	 * @return
	 */
	public native final int weight() /*-{
	return this.weight; 
	}-*/;
	
	/**
	 * Number indicating the width of the border. The default value is 1.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MarkerSeriesStyle.Border weight(int val) /*-{
	this.weight = val; 
	return this; 
	}-*/;
	
	/**
	 * indicates the width of the marker. The default value is 10.
	 * @return
	 */
	public native final int width() /*-{
	return this.width; 
	}-*/;
	
	/**
	 * indicates the width of the marker. The default value is 10.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MarkerSeriesStyle.Border width(int val) /*-{
	this.width = val; 
	return this; 
	}-*/;
	
	/**
	 * indicates the height of the marker The default value is 10.
	 * @return
	 */
	public native final int height() /*-{
	return this.height; 
	}-*/;
	
	/**
	 * indicates the height of the marker The default value is 10.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MarkerSeriesStyle.Border height(int val) /*-{
	this.height = val; 
	return this; 
	}-*/;
	
	/**
	 * hash containing styles for markers when highlighted by a mouseover event. The default values for each style is null. When an over style is not set, the non-over value will be used. For example, the default value for marker.over.fill.color is equivalent to marker.fill.color.
	 * @return
	 */
	public native final JavaScriptObject over() /*-{
	return this.over; 
	}-*/;
	
	/**
	 * hash containing styles for markers when highlighted by a mouseover event. The default values for each style is null. When an over style is not set, the non-over value will be used. For example, the default value for marker.over.fill.color is equivalent to marker.fill.color.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MarkerSeriesStyle.Border over(JavaScriptObject val) /*-{
	this.over = val; 
	return this; 
	}-*/;
}
}
