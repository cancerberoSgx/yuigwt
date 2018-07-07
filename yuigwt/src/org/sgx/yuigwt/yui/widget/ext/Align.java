package org.sgx.yuigwt.yui.widget.ext;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Point;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * overlay for the align type used http://yuilibrary.com/yui/docs/api/classes/WidgetPositionAlign.html#attr_align
 * The alignment configuration for this widget.The align attribute is used to align a reference point on the widget, with the reference point on another Node, or the viewport. The object which align expects has the following properties:
 * @author sg
 *
 */
public class Align extends JavaScriptObject {
protected Align(){}
public static final native Align create()/*-{
	return {}; 
}-*/;

/**
 * The Node to which the widget is to be aligned. If set to null, or not provided, the widget is aligned to the viewport.
 * @return
 */
public native final Node node() /*-{
return this.node; 
}-*/;

/**
 * The Node to which the widget is to be aligned. If set to null, or not provided, the widget is aligned to the viewport.
 * @param val
 * @return this - for setter chaining
 */
public native final Align node(Node val) /*-{
this.node = val; 
return this; 
}-*/;

/**
 * A two element Array, defining the two points on the widget and Node/viewport which are to be aligned. The first element is the point on the widget, and the second element is the point on the Node/viewport. Supported alignment points are defined as static properties on WidgetPositionAlign.
 * @return
 */
public native final JsArray<Point> points() /*-{
return this.points; 
}-*/;

/**
 * A two element Array, defining the two points on the widget and Node/viewport which are to be aligned. The first element is the point on the widget, and the second element is the point on the Node/viewport. Supported alignment points are defined as static properties on WidgetPositionAlign.
 * @param val
 * @return this - for setter chaining
 */
public native final Align points(JsArray<Point> val) /*-{
this.points = val; 
return this; 
}-*/;
/**
 * A two element Array, defining the two points on the widget and Node/viewport which are to be aligned. The first element is the point on the widget, and the second element is the point on the Node/viewport. Supported alignment points are defined as static properties on WidgetPositionAlign.
 * @param val
 * @return this - for setter chaining
 */
public native final Align points(Point[] val) /*-{
this.points = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;
}
