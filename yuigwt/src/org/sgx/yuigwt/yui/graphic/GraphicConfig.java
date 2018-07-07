package org.sgx.yuigwt.yui.graphic;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.Region;

import com.google.gwt.dom.client.Element;

/**
 * http://yuilibrary.com/yui/docs/api/classes/Graphic.html#attrs
 * 
 * @author sg
 * 
 */
public class GraphicConfig extends JsObject {
	protected GraphicConfig() {
	}

	public static final native GraphicConfig create()/*-{
		return {};
	}-*/;

	/**
	 * Determines how the size of instance is calculated. If true, the width and
	 * height are determined by the size of the contents. If false, the width
	 * and height values are either explicitly set or determined by the size of
	 * the parent node's dimensions.Default: false
	 * 
	 * @return
	 */
	public native final boolean autoSize() /*-{
		return this.autoSize;
	}-*/;

	/**
	 * Determines how the size of instance is calculated. If true, the width and
	 * height are determined by the size of the contents. If false, the width
	 * and height values are either explicitly set or determined by the size of
	 * the parent node's dimensions.Default: false
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GraphicConfig autoSize(boolean val) /*-{
		this.autoSize = val;
		return this;
	}-*/;

	/**
	 * Object containing size and coordinate data for the content of a Graphic
	 * in relation to the coordSpace node.
	 * 
	 * @return
	 */
	public native final Region contentBounds() /*-{
		return this.contentBounds;
	}-*/;

	/**
	 * Object containing size and coordinate data for the content of a Graphic
	 * in relation to the coordSpace node.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GraphicConfig contentBounds(Region val) /*-{
		this.contentBounds = val;
		return this;
	}-*/;

	/**
	 * Indicates the height of the Graphic.
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
	public native final GraphicConfig height(double val) /*-{
		this.height = val;
		return this;
	}-*/;

	/**
	 * Unique id for class instance.
	 * 
	 * @return
	 */
	public native final String id() /*-{
		return this.id;
	}-*/;

	/**
	 * Unique id for class instance.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GraphicConfig id(String val) /*-{
		this.id = val;
		return this;
	}-*/;

	/**
	 * The html element that represents to coordinate system of the Graphic
	 * instance.
	 * 
	 * @return
	 */
	public native final Element node() /*-{
		return this.node;
	}-*/;

	/**
	 * The html element that represents to coordinate system of the Graphic
	 * instance.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GraphicConfig node(Element val) /*-{
		this.node = val;
		return this;
	}-*/;

	/**
	 * Whether or not to render the Graphic automatically after to a specified
	 * parent node after init. This can be a Node instance or a CSS selector
	 * string.
	 * 
	 * @return
	 */
	public native final Node render() /*-{
		return this.render;
	}-*/;

	/**
	 * Whether or not to render the Graphic automatically after to a specified
	 * parent node after init. This can be a Node instance or a CSS selector
	 * string.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GraphicConfig render(Node val) /*-{
		this.render = val;
		return this;
	}-*/;

	/**
	 * The contentBounds will resize to greater values but not to smaller
	 * values. (for performance) When resizing the contentBounds down is
	 * desirable, set the resizeDown value to true.
	 * 
	 * @return
	 */
	public native final boolean resizeDown() /*-{
		return this.resizeDown;
	}-*/;

	/**
	 * The contentBounds will resize to greater values but not to smaller
	 * values. (for performance) When resizing the contentBounds down is
	 * desirable, set the resizeDown value to true.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GraphicConfig resizeDown(boolean val) /*-{
		this.resizeDown = val;
		return this;
	}-*/;

	// TODO shapes

	/**
	 * Indicates whether the Graphic and its children are visible.
	 * 
	 * @return
	 */
	public native final boolean visible() /*-{
		return this.visible;
	}-*/;

	/**
	 * Indicates whether the Graphic and its children are visible.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GraphicConfig visible(boolean val) /*-{
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
	public native final GraphicConfig width(double val) /*-{
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
	public native final GraphicConfig x(double val) /*-{
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
	public native final GraphicConfig y(double val) /*-{
this.y = val; 
return this; 
}-*/;
}
