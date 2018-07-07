package org.sgx.yuigwt.yui.graphic;

import org.sgx.yuigwt.yui.graphic.fill.Fill;
import org.sgx.yuigwt.yui.util.Point;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * this class contains all concrete shapes properties (circle, path, etc)
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Shape.html
 * @author sg
 * 
 */
public class ShapeConfig extends JavaScriptObject {
	protected ShapeConfig() {
	}

	public native static final ShapeConfig create()/*-{
		return {};
	}-*/;

	/**
	 * shortcut for create().type(Shape.TYPE_CIRCLE).
	 * 
	 * @return
	 */
	public native static final ShapeConfig createCircle()/*-{
		return {
			"type" : "circle"
		};
	}-*/;

	/**
	 * shortcut for create().type(Shape.TYPE_RECT).
	 * 
	 * @return
	 */
	public native static final ShapeConfig createRect()/*-{
		return {
			"type" : "rect"
		};
	}-*/;

	/**
	 * shortcut for create().type(Shape.TYPE_PATH).
	 * 
	 * @return
	 */
	public native static final ShapeConfig createPath()/*-{
		return {
			"type" : "path"
		};
	}-*/;

	/**
	 * shortcut for create().type(Shape.TYPE_ELLIPSE).
	 * 
	 * @return
	 */
	public native static final ShapeConfig createEllipse()/*-{
		return {
			"type" : "ellipse"
		};
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final double height() /*-{
		return this.height;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig height(double val) /*-{
		this.height = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String id() /*-{
		return this.id;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig id(String val) /*-{
		this.id = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final Element node() /*-{
		return this.node;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig node(Element val) /*-{
		this.node = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final Stroke stroke() /*-{
		return this.stroke;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final Fill fill() /*-{
		return this.fill;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig fill(Fill val) /*-{
		this.fill = val;
		return this;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig stroke(Stroke val) /*-{
		this.stroke = val;
		return this;
	}-*/;

	/**
	 * <p>
	 * A string containing, in order, transform operations applied to the shape
	 * instance. The <code>transform</code> string can contain the following
	 * values:
	 * </p>
	 * <dl>
	 * <dt>rotate</dt>
	 * <dd>Rotates the shape clockwise around it transformOrigin.</dd>
	 * <dt>translate</dt>
	 * <dd>Specifies a 2d translation.</dd>
	 * <dt>skew</dt>
	 * <dd>Skews the shape around the x-axis and y-axis.</dd>
	 * <dt>scale</dt>
	 * <dd>Specifies a 2d scaling operation.</dd>
	 * <dt>translateX</dt>
	 * <dd>Translates the shape along the x-axis.</dd>
	 * <dt>translateY</dt>
	 * <dd>Translates the shape along the y-axis.</dd>
	 * <dt>skewX</dt>
	 * <dd>Skews the shape around the x-axis.</dd>
	 * <dt>skewY</dt>
	 * <dd>Skews the shape around the y-axis.</dd>
	 * </dl>
	 * <p>
	 * Applying transforms through the transform attribute will reset the
	 * transform matrix and apply a new transform. The shape class also contains
	 * corresponding methods for each transform that will apply the transform to
	 * the current matrix. The below code illustrates how you might use the
	 * <code>transform</code> attribute to instantiate a recangle with a
	 * rotation of 45 degrees.
	 * 
	 * <pre>
	 * var myRect = new Y.Rect({
	 *    type:"rect",
	 *    width: 50,
	 *    height: 40,
	 *    transform: "rotate(45)"
	 * };
	 * </pre>
	 * <p>
	 * The code below would apply translate and rotate to an existing shape.
	 * </p>
	 * 
	 * <pre>
	 * myRect.set(&quot;transform&quot;, &quot;translate(40, 50) rotate(45)&quot;);
	 * </pre>
	 * 
	 */
	public native final String transform() /*-{
		return this.transform;
	}-*/;

	/**
	 * <p>
	 * A string containing, in order, transform operations applied to the shape
	 * instance. The <code>transform</code> string can contain the following
	 * values:
	 * </p>
	 * <dl>
	 * <dt>rotate</dt>
	 * <dd>Rotates the shape clockwise around it transformOrigin.</dd>
	 * <dt>translate</dt>
	 * <dd>Specifies a 2d translation.</dd>
	 * <dt>skew</dt>
	 * <dd>Skews the shape around the x-axis and y-axis.</dd>
	 * <dt>scale</dt>
	 * <dd>Specifies a 2d scaling operation.</dd>
	 * <dt>translateX</dt>
	 * <dd>Translates the shape along the x-axis.</dd>
	 * <dt>translateY</dt>
	 * <dd>Translates the shape along the y-axis.</dd>
	 * <dt>skewX</dt>
	 * <dd>Skews the shape around the x-axis.</dd>
	 * <dt>skewY</dt>
	 * <dd>Skews the shape around the y-axis.</dd>
	 * </dl>
	 * <p>
	 * Applying transforms through the transform attribute will reset the
	 * transform matrix and apply a new transform. The shape class also contains
	 * corresponding methods for each transform that will apply the transform to
	 * the current matrix. The below code illustrates how you might use the
	 * <code>transform</code> attribute to instantiate a recangle with a
	 * rotation of 45 degrees.
	 * 
	 * <pre>
	 * var myRect = new Y.Rect({
	 *    type:"rect",
	 *    width: 50,
	 *    height: 40,
	 *    transform: "rotate(45)"
	 * };
	 * </pre>
	 * <p>
	 * The code below would apply translate and rotate to an existing shape.
	 * </p>
	 * 
	 * <pre>
	 * myRect.set(&quot;transform&quot;, &quot;translate(40, 50) rotate(45)&quot;);
	 * </pre>
	 * 
	 * @return self for method chaining
	 */
	public native final ShapeConfig transform(String val) /*-{
		this.transform = val;
		return this;
	}-*/;

	/**
	 * An array of x, y values which indicates the transformOrigin in which to
	 * rotate the shape. Valid values range between 0 and 1 representing a
	 * fraction of the shape's corresponding bounding box dimension. The default
	 * value is [0.5, 0.5].
	 * 
	 * @return
	 */
	public native final Point transformOrigin() /*-{
		return this.transformOrigin;
	}-*/;

	/**
	 * An array of x, y values which indicates the transformOrigin in which to
	 * rotate the shape. Valid values range between 0 and 1 representing a
	 * fraction of the shape's corresponding bounding box dimension. The default
	 * value is [0.5, 0.5].
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig transformOrigin(Point val) /*-{
		this.transformOrigin = val;
		return this;
	}-*/;

	/**
	 * one of TYPE_ constants
	 * 
	 * @return
	 */
	public native final String type() /*-{
		return this.type;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig type(String val) /*-{
		this.type = val;
		return this;
	}-*/;

	/**
	 * Indicates whether the shape is visible.
	 * 
	 * @return
	 */
	public native final boolean visible() /*-{
		return this.visible;
	}-*/;

	/**
	 * Indicates whether the shape is visible.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig visible(boolean val) /*-{
		this.visible = val;
		return this;
	}-*/;

	/**
	 * Indicates the width of the shape
	 * 
	 * @return
	 */
	public native final double width() /*-{
		return this.width;
	}-*/;

	/**
	 * Indicates the width of the shape
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig width(double val) /*-{
		this.width = val;
		return this;
	}-*/;

	/**
	 * Indicates the x position of shape.
	 * 
	 * @return
	 */
	public native final double x() /*-{
		return this.x;
	}-*/;

	/**
	 * Indicates the x position of shape.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig x(double val) /*-{
		this.x = val;
		return this;
	}-*/;

	/**
	 * Indicates the y position of shape.
	 * 
	 * @return
	 */
	public native final double y() /*-{
		return this.y;
	}-*/;

	/**
	 * Indicates the y position of shape.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig y(double val) /*-{
		this.y = val;
		return this;
	}-*/;

	// circle properties

	/**
	 * Radius of the circle. only valid for circle
	 * 
	 * @return
	 */
	public native final double radius() /*-{
		return this.radius;
	}-*/;

	/**
	 * Radius of the circle. only valid for circle
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig radius(double val) /*-{
		this.radius = val;
		return this;
	}-*/;

	// path properties
	/**
	 * Indicates the path used for the node.
	 * 
	 * @return
	 */
	public native final String path() /*-{
		return this.path;
	}-*/;

	/**
	 * Indicates the path used for the node.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ShapeConfig path(String val) /*-{
		this.path = val;
		return this;
	}-*/;
}
