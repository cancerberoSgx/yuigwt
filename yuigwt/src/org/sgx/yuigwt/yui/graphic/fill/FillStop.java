package org.sgx.yuigwt.yui.graphic.fill;

import org.sgx.yuigwt.yui.util.JsObject;
/**
 * controls opacity, color and distance of each gradien "stop". @see http://yuilibrary.com/yui/docs/graphics/graphics-gradients.html
 * @author sg
 *
 */
public class FillStop extends JsObject {
protected FillStop(){}
public static final native FillStop create()/*-{
	return {}; 
}-*/;
public static final native FillStop create(String color)/*-{
	return {"color": color}; 
}-*/;
/**
 * The color of the stop.
 * @return
 */
public native final String color() /*-{
return this.color; 
}-*/;

/**
 * The color of the stop.
 * @param val
 * @return this - for setter chaining
 */
public native final FillStop color(String val) /*-{
this.color = val; 
return this; 
}-*/;

/**
 * DataTypeNumber between 0 and 1 that indicates the opacity of the stop. The default value is 1. Note: No effect for IE 6 - 8
 * @return
 */
public native final double opacity() /*-{
return this.opacity; 
}-*/;

/**
 * DataTypeNumber between 0 and 1 that indicates the opacity of the stop. The default value is 1. Note: No effect for IE 6 - 8
 * @param val
 * @return this - for setter chaining
 */
public native final FillStop opacity(double val) /*-{
this.opacity = val; 
return this; 
}-*/;

/**
 * DataTypeNumber between 0 and 1 indicating where the color stop is positioned.
 * @return
 */
public native final double offset() /*-{
return this.offset; 
}-*/;

/**
 * DataTypeNumber between 0 and 1 indicating where the color stop is positioned.
 * @param val
 * @return this - for setter chaining
 */
public native final FillStop offset(double val) /*-{
this.offset = val; 
return this; 
}-*/;
}
