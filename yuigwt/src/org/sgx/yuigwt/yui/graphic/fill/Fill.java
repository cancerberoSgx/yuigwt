package org.sgx.yuigwt.yui.graphic.fill;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JsArray;

/**
 * <p>
 * Contains information about the fill of the shape.
 * </p>
 * <dl>
 * <dt>color</dt>
 * <dd>The color of the fill.</dd>
 * <dt>opacity</dt>
 * <dd>DataTypeNumber between 0 and 1 that indicates the opacity of the fill. The
 * default value is 1.</dd>
 * <dt>type</dt>
 * <dd>Type of fill.
 * <dl>
 * <dt>solid</dt>
 * <dd>Solid single color fill. (default)</dd>
 * <dt>linear</dt>
 * <dd>Linear gradient fill.</dd>
 * <dt>radial</dt>
 * <dd>Radial gradient fill.</dd>
 * </dl>
 * </dd>
 * </dl>
 * <p>
 * If a <code>linear</code> or <code>radial</code> is specified as the fill
 * type. The following additional property is used:
 * </p>
 * <dl>
 * <dt>stops</dt>
 * <dd>An array of objects containing the following properties:
 * <dl>
 * <dt>color</dt>
 * <dd>The color of the stop.</dd>
 * <dt>opacity</dt>
 * <dd>DataTypeNumber between 0 and 1 that indicates the opacity of the stop. The
 * default value is 1. Note: No effect for IE 6 - 8</dd>
 * <dt>offset</dt>
 * <dd>DataTypeNumber between 0 and 1 indicating where the color stop is positioned.</dd>
 * </dl>
 * </dd>
 * <p>
 * Linear gradients also have the following property:
 * </p>
 * <dt>rotation</dt>
 * <dd>Linear gradients flow left to right by default. The rotation property
 * allows you to change the flow by rotation. (e.g. A rotation of 180 would make
 * the gradient pain from right to left.)</dd>
 * <p>
 * Radial gradients have the following additional properties:
 * </p>
 * <dt>r</dt>
 * <dd>Radius of the gradient circle.</dd>
 * <dt>fx</dt>
 * <dd>Focal point x-coordinate of the gradient.</dd>
 * <dt>fy</dt>
 * <dd>Focal point y-coordinate of the gradient.</dd>
 * <dt>cx</dt>
 * <dd>
 * <p>
 * The x-coordinate of the center of the gradient circle. Determines where the
 * color stop begins. The default value 0.5.
 * </p>
 * <p>
 * <strong>Note: </strong>Currently, this property is not implemented for
 * corresponding <code>CanvasShape</code> and <code>VMLShape</code> classes
 * which are used on Android or IE 6 - 8.
 * </p>
 * </dd>
 * <dt>cy</dt>
 * <dd>
 * <p>
 * The y-coordinate of the center of the gradient circle. Determines where the
 * color stop begins. The default value 0.5.
 * </p>
 * <p>
 * <strong>Note: </strong>Currently, this property is not implemented for
 * corresponding <code>CanvasShape</code> and <code>VMLShape</code> classes
 * which are used on Android or IE 6 - 8.
 * </p>
 * </dd>
 * </dl>
 * 
 * @author sg
 * 
 */
public class Fill extends JsObject {
	protected Fill() {
	}

	public static final String TYPE_SOLID="solid", TYPE_LINEAR="linear", TYPE_RADIAL="radial"; 
	
	
	public static final native Fill create()/*-{
		return {}; 
	}-*/;
	/**
	 * fill color
	 * @return
	 */
	public native final String color() /*-{
		return this.color;
	}-*/;

	/**
	 * fill color
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Fill color(String val) /*-{
		this.color = val;
		return this;
	}-*/;

	/**
	 * fill opacity a number between 0.0 and 1.0
	 * @return
	 */
	public native final double opacity() /*-{
		return this.opacity;
	}-*/;

	/**
	 * fill opacity a number between 0.0 and 1.0
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Fill opacity(double val) /*-{
	this.opacity = val; 
	return this; 
	}-*/;

	/**
	 * one of TYPE_* constants
	 * @return
	 */
	public native final String type() /*-{
	return this.type; 
	}-*/;

	/**
	 * one of TYPE_* constants
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Fill type(String val) /*-{
	this.type = val; 
	return this; 
	}-*/;
/**
 * angle of linear gradients in degrees
 * @return
 */
public native final double rotation() /*-{
return this.rotation; 
}-*/;

/**
 * angle of linear gradients in degrees
 * @param val
 * @return this - for setter chaining
 */
public native final Fill rotation(double val) /*-{
this.rotation = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final JsArray<FillStop> stops() /*-{
return this.stops; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Fill stops(JsArray<FillStop> val) /*-{
this.stops = val; 
return this; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Fill stops(FillStop[] val) /*-{
this.stops = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;
}
