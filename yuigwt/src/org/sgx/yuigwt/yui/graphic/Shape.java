package org.sgx.yuigwt.yui.graphic;

import org.sgx.yuigwt.yui.graphic.fill.Fill;
import org.sgx.yuigwt.yui.util.Point;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * this class contains all concrete shapes properties (circle, path, etc). Since
 * Path inherith from Drawing
 * (http://yuilibrary.com/yui/docs/api/classes/Drawing.html), Drawing methods
 * goes here too.
 * <p>
 * <code>Shape</code> is an abstract class and is not meant to be used directly.
 * The following classes extend <code>Shape</code>.
 * </p>
 * <ul>
 * <li><a><code>Circle</code></a></li>
 * <li><a><code>Ellipse</code></a></li>
 * <li><a><code>Rect</code></a></li>
 * <li><a><code>Path</code></a></li>
 * </ul>
 * <code>Shape</code> can also be extended to create custom shape classes.
 * 
 * 
 * <br/>
 * <br/>
 * <h2>Path documentation:</h2>
 * 
 * <p>
 * The Path class creates a shape through the use of drawing methods. The Path
 * class has the following drawing methods available: clear, curveTo, drawRect¸
 * drawRoundRect, end, lineTo, moveTo, quadraticCurveTo
 * </p>
 * 
 * <p>
 * Like other shapes, Path elements are created using the addShape method of the
 * Graphic class. The method's cfg argument contains a type attribute. Assigning
 * "path" or Y.Path to this attribute will create a Path instance. After
 * instantiation, a series of drawing operations must be performed in order to
 * render a shape. The below code instantiates a path element by defining the
 * type attribute as "path":</o>
 * 
 * <pre>
 *    var myPath = myGraphic.addShape({
 *        type: "path",
 *        fill: {
 *            color: "#9aa"
 *        },
 *        stroke: {
 *            weight: 1,
 *            color: "#000"
 *        }
 *    });
 * </pre>
 * 
 * <p>
 * Below a Path element with the same properties is instantiated by defining the
 * type attribute with a class reference:
 * </p>
 * 
 * <pre>
 *    var myPath = myGraphic.addShape({
 *        type: Y.Path,
 *        fill: {
 *            color: "#9aa"
 *        },
 *        stroke: {
 *            weight: 1,
 *            color: "#000"
 *        }
 *    });
 * </pre>
 * <p>
 * After instantiation, a shape or segment needs to be drawn for an element to
 * render. After all draw operations are performed, the end method will render
 * the shape. The code below will draw a triangle:
 * </p>
 * 
 * <pre>
 * myPath.moveTo(35, 5);
 * myPath.lineTo(65, 65);
 * myPath.lineTo(5, 65);
 * myPath.lineTo(35, 5);
 * myPath.end();
 * </pre>
 * 
 * @author sg
 * 
 */
public class Shape extends JavaScriptObject {
	protected Shape() {
	}

	public static final String TYPE_CIRCLE = "circle", TYPE_ELLIPSE = "ellipse", TYPE_RECT = "rect", TYPE_PATH = "path";

	/**
	 * Add a class name to each node.
	 * 
	 * @param className
	 *            the class name to add to the node's class attribute
	 * @return self for method chaining
	 */
	public native final Shape addClass(String className) /*-{
		this.addClass(className);
		return this;
	}-*/;

	// TODO compareTo(), contains()

	/**
	 * Destroys the instance.
	 * 
	 * @return self for method chaining
	 */
	public native final Shape destroy() /*-{
		this.destroy();
		return this;
	}-*/;

	/**
	 * @return the bounds for a shape. Calculates the a new bounding box from
	 *         the original corner coordinates (base on size and position) and
	 *         the transform matrix. The calculated bounding box is used by the
	 *         graphic instance to calculate its viewBox.
	 */
	public native final JavaScriptObject getBounds() /*-{
		return this.getBounds();
	}-*/;

	/**
	 * Gets the current position of the node in page coordinates.
	 * 
	 * @return Array The XY position of the shape.
	 */
	public native final Point getXY() /*-{
		return this.getXY();
	}-*/;

	/**
	 * Removes a class name from each node.
	 * 
	 * @param className
	 *            the class name to remove to the node's class attribute
	 * @return self for method chaining
	 */
	public native final Shape removeClass(String className) /*-{
		this.removeClass(className);
		return this;
	}-*/;

	/**
	 * Rotates the shape clockwise around it transformOrigin.
	 * 
	 * @return self for method chaining
	 */
	public native final Shape rotate(double deg) /*-{
		this.rotate(deg);
		return this;
	}-*/;

	/**
	 * Specifies a 2d scaling operation.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public native final Shape scale(double val) /*-{
		this.scale(val);
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param attrs
	 *            an object of key value pairs can be passed in to set multiple
	 *            attributes at once.
	 * @return self for method chaining
	 */
	public native final Shape set(JavaScriptObject attrs) /*-{
		this.set(attrs);
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param name
	 *            The name of the attribute.
	 * @param val
	 *            The value to set the attribute to.
	 * @return self for method chaining
	 */
	public native final Shape set(String name, String val) /*-{
		this.set(name, val);
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param name
	 *            The name of the attribute.
	 * @param val
	 *            The value to set the attribute to.
	 * @return self for method chaining
	 */
	public native final Shape set(String name, int val) /*-{
		this.set(name, val);
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param name
	 *            The name of the attribute.
	 * @param val
	 *            The value to set the attribute to.
	 * @return self for method chaining
	 */
	public native final Shape set(String name, double val) /*-{
		this.set(name, val);
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param name
	 *            The name of the attribute.
	 * @param val
	 *            The value to set the attribute to.
	 * @return self for method chaining
	 */
	public native final Shape set(String name, boolean val) /*-{
		this.set(name, val);
		return this;
	}-*/;

	/**
	 * Set the position of the shape in page coordinates, regardless of how the
	 * node is positioned.
	 * 
	 * @param p
	 *            x & y values for new position (coordinates are page-based)
	 * @return self for method chaining
	 */
	public native final Shape setXY(Point p) /*-{
		this.setXY(p);
		return this;
	}-*/;

	/**
	 * Skews the shape around the x-axis and y-axis.
	 * 
	 * @param x
	 *            The value to skew on the x-axis.
	 * @param y
	 *            The value to skew on the y-axis.
	 * @return self for method chaining
	 */
	public native final Shape skew(double x, double y) /*-{
		this.skew(x, y);
		return this;
	}-*/;

	/**
	 * Skews the shape around the x-axis.
	 * 
	 * @param x
	 *            x-coordinate
	 * @return self for method chaining
	 */
	public native final Shape skewX(double x) /*-{
		this.skewX(x);
		return this;
	}-*/;

	/**
	 * Skews the shape around the y-axis.
	 * 
	 * @param y
	 *            y-coordinate
	 * @return self for method chaining
	 */
	public native final Shape skewY(double y) /*-{
		this.skewY(y);
		return this;
	}-*/;

	/**
	 * Test if the supplied node matches the supplied selector.
	 * 
	 * @param sel
	 *            The CSS selector to test against.
	 * @return Wheter or not the shape matches the selector.
	 */
	public native final boolean test(String sel) /*-{
		return this.test(sel);
	}-*/;

	/**
	 * Specifies a 2d translation.
	 * 
	 * @param x
	 *            The value to transate on the x-axis.
	 * @param y
	 *            The value to transate on the y-axis.
	 * @return self for method chaining
	 */
	public native final Shape translate(double x, double y) /*-{
		this.translate(x, y);
		return this;
	}-*/;

	/**
	 * Translates the shape along the x-axis. When translating x and y
	 * coordinates, use the translate method.
	 * 
	 * @param x
	 *            The value to translate.
	 * @return self for method chaining
	 */
	public native final Shape translateX(double x) /*-{
		this.translateX(x);
		return this;
	}-*/;

	/**
	 * Translates the shape along the y-axis. When translating x and y
	 * coordinates, use the translate method.
	 * 
	 * @param y
	 *            the value to translate
	 * @return self for method chaining
	 */
	public native final Shape translateY(double y) /*-{
		this.translateY(y);
		return this;
	}-*/;

	// attr accessors

	/**
	 * the fill of the shape.
	 * 
	 * @return the attribute
	 */
	public final native Fill fill()/*-{
		return this.get("fill");
	}-*/;

	/**
	 * the fill of the shape.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape fill(Fill val)/*-{
		this.set("fill", val);
		return this;
	}-*/;

	// /**
	// * @return Reference to the parent graphic instance
	// */
	// public native final Graphic getGraphic()/*-{
	// return this.getAttribtue("graphic");
	// }-*/;
	// public native final double getHeight()/*-{
	// return this.getAttribtue("height");
	// }-*/;
	/**
	 * Reference to the parent graphic instance
	 * 
	 * @return the attribute
	 */
	public final native Graphic graphic()/*-{
		return this.get("graphic");
	}-*/;

	/**
	 * Reference to the parent graphic instance
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape graphic(Graphic val)/*-{
		this.set("graphic", val);
		return this;
	}-*/;

	/**
	 * Indicates the height of the shape
	 * 
	 * @return the attribute
	 */
	public final native double height()/*-{
		return this.get("height");
	}-*/;

	/**
	 * Unique id for class instance.
	 * 
	 * @return the attribute
	 */
	public final native String id()/*-{
		return this.get("id");
	}-*/;

	/**
	 * Unique id for class instance.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape id(String val)/*-{
		this.set("id", val);
		return this;
	}-*/;

	/**
	 * Dom node for the shape.
	 * 
	 * @return the attribute
	 */
	public final native Element node()/*-{
		return this.get("node");
	}-*/;

	/**
	 * Dom node for the shape.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape node(Element val)/*-{
		this.set("node", val);
		return this;
	}-*/;

	/**
	 * Indicates the height of the shape
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape height(double val)/*-{
		this.set("height", val);
		return this;
	}-*/;

	/**
	 * stroke of the shape.
	 * 
	 * @return the attribute
	 */
	public final native Stroke stroke()/*-{
		return this.get("stroke");
	}-*/;

	/**
	 * stroke of the shape.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape stroke(Stroke val)/*-{
		this.set("stroke", val);
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
	 * 
	 * <p>
	 * The code below would apply translate and rotate to an existing shape.
	 * </p>
	 * 
	 * <pre>
	 * myRect.set(&quot;transform&quot;, &quot;translate(40, 50) rotate(45)&quot;);
	 * </pre>
	 * 
	 * @return the attribute
	 */
	public final native String transform()/*-{
		return this.get("transform");
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
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape transform(String val)/*-{
		this.set("transform", val);
		return this;
	}-*/;

	/**
	 * An array of x, y values which indicates the transformOrigin in which to
	 * rotate the shape. Valid values range between 0 and 1 representing a
	 * fraction of the shape's corresponding bounding box dimension. The default
	 * value is [0.5, 0.5].
	 * 
	 * @return the attribute
	 */
	public final native Point transformOrigin()/*-{
		return this.get("transformOrigin");
	}-*/;

	/**
	 * An array of x, y values which indicates the transformOrigin in which to
	 * rotate the shape. Valid values range between 0 and 1 representing a
	 * fraction of the shape's corresponding bounding box dimension. The default
	 * value is [0.5, 0.5].
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape transformOrigin(Point val)/*-{
		this.set("transformOrigin", val);
		return this;
	}-*/;

	/**
	 * Indicates whether the shape is visible.
	 * 
	 * @return the attribute
	 */
	public final native boolean visible()/*-{
		return this.get("visible");
	}-*/;

	/**
	 * Indicates whether the shape is visible.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape visible(boolean val)/*-{
		this.set("visible", val);
		return this;
	}-*/;

	/**
	 * Indicates the width of the shape
	 * 
	 * @return the attribute
	 */
	public final native double width()/*-{
		return this.get("width");
	}-*/;

	/**
	 * Indicates the width of the shape
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape width(double val)/*-{
		this.set("width", val);
		return this;
	}-*/;

	/**
	 * Indicates the x position of shape.
	 * 
	 * @return the attribute
	 */
	public final native double x()/*-{
		return this.get("x");
	}-*/;

	/**
	 * Indicates the x position of shape.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape x(double val)/*-{
		this.set("x", val);
		return this;
	}-*/;

	/**
	 * Indicates the y position of shape.
	 * 
	 * @return the attribute
	 */
	public final native double y()/*-{
		return this.get("y");
	}-*/;

	/**
	 * Indicates the y position of shape.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape y(double val)/*-{
		this.set("y", val);
		return this;
	}-*/;

	// path - Drawing methods: - some defined in
	// http://yuilibrary.com/yui/docs/api/classes/Drawing.html

	/**
	 * Clears the path.
	 * 
	 * @return self for method chaining
	 */
	public native final Shape clear() /*-{
		this.clear();
		return this;
	}-*/;

	/**
	 * Draws a bezier curve.
	 * 
	 * @param cp1x
	 *            x-coordinate for the first control point.
	 * @param cp1y
	 *            y-coordinate for the first control point.
	 * @param cp2x
	 *            x-coordinate for the second control point.
	 * @param cp2y
	 *            y-coordinate for the second control point.
	 * @param x
	 *            x-coordinate for the end point.
	 * @param y
	 *            y-coordinate for the end point.
	 * @return self for method chaining
	 */
	public native final Shape curveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y) /*-{
		this.curveTo(cp1x, cp1y, cp2x, cp2y, x, y);
		return this;
	}-*/;

	/**
	 * Draws a rectangle.
	 * 
	 * @param x
	 *            x-coordinate
	 * @param y
	 *            y-coordinate
	 * @param w
	 *            width
	 * @param h
	 *            height
	 * @return self for method chaining
	 */
	public native final Shape drawRect(double x, double y, double w, double h) /*-{
		this.drawRect(x, y, w, h);
		return this;
	}-*/;

	/**
	 * Draws a rectangle with rounded corners.
	 * 
	 * @param x
	 *            x-coordinate
	 * @param y
	 *            y-coordinate
	 * @param w
	 *            width
	 * @param h
	 *            height
	 * @param ew
	 *            width of the ellipse used to draw the rounded corners
	 * @param eh
	 *            height of the ellipse used to draw the rounded corners
	 * @return self for method chaining
	 */
	public native final Shape drawRoundRect(double x, double y, double w, double h, double ew, double eh) /*-{
		this.drawRoundRect(x, y, w, h, ew, eh);
		return this;
	}-*/;

	/**
	 * Completes a drawing operation.
	 * 
	 * @return
	 */
	public native final Shape end() /*-{
		this.end();
		return this;
	}-*/;

	/**
	 * Draws a line segment using the current line style from the current
	 * drawing position to the specified x and y coordinates.
	 * 
	 * @param x
	 *            x coordinate for the end point.
	 * @param y
	 *            y coordinate for the end point.
	 * @return
	 */
	public native final Shape lineTo(double x, double y) /*-{
		this.lineTo(x, y);
		return this;
	}-*/;

	/**
	 * Moves the current drawing position to specified x and y coordinates.
	 * 
	 * @param x
	 *            x coordinate for the end point.
	 * @param y
	 *            y coordinate for the end point.
	 * @return
	 */
	public native final Shape moveTo(double x, double y) /*-{
		this.moveTo(x, y);
		return this;
	}-*/;

	/**
	 * Draws a quadratic bezier curve.
	 * 
	 * @param cpx
	 *            x coord of the control point
	 * @param cpy
	 *            y coord of the control point
	 * @param x
	 *            x coordinate for the end point.
	 * @param y
	 *            y coordinate for the end point.
	 * @return
	 */
	public native final Shape quadraticCurveTo(double cpx, double cpy, double x, double y) /*-{
		this.quadraticCurveTo(cpx, cpy, x, y);
		return this;
	}-*/;

	// circle attributes

	/**
	 * Radius of the circle
	 * 
	 * @return the attribute
	 */
	public final native double radius()/*-{
		return this.get("radius");
	}-*/;

	/**
	 * Radius of the circle
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape radius(double val)/*-{
		this.set("radius", val);
		return this;
	}-*/;

	// path attributes

	/**
	 * 
	 * @return the attribute
	 */
	public final native String path()/*-{
		return this.get("path");
	}-*/;

	/**
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Shape path(String val)/*-{
		this.set("path", val);
		return this;
	}-*/;

	// public native final double radius() /*-{
	// return this.radius();
	// }-*/;
	// TODO: other attr accessors.
}
