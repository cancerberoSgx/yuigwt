package org.sgx.yuigwt.yui.resize;

import org.sgx.yuigwt.yui.base.BaseConfig;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * A base class for Resize, providing: <br/>
 * Basic Lifecycle (initializer, renderUI, bindUI, syncUI, destructor) <br/>
 * Applies drag handles to an element to make it resizable <br/>
 * Here is the list of valid resize handles: [ 't', 'tr', 'r', 'br', 'b', 'bl', 'l', 'tl' ]. You can read this list as top, top-right, right, bottom-right, bottom, bottom-left,
 * left, top-left. <br/>
 * The drag handles are inserted into the element and positioned absolute. Some elements, such as a textarea or image, don't support children. To overcome that, set wrap:true in
 * your config and the element willbe wrapped for you automatically.
 * 
 * Quick Example:
 * 
 * <pre>
 * var instance = new Y.Resize({
 *     node: '#resize1',
 *     preserveRatio: true,
 *     wrap: true,
 *     maxHeight: 170,
 *     maxWidth: 400,
 *     handles: 't, tr, r, br, b, bl, l, tl'
 * });
 * </pre>
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Resize.html
 * @see http://yuilibrary.com/yui/docs/resize/
 * @author sg
 * 
 */
public class ResizeConfig extends BaseConfig {
	protected ResizeConfig() {
	}

	public static final native ResizeConfig create()/*-{
		return {};
	}-*/;

	/**
	 * False to ensure that the resize handles are always visible, true to display them only when the user mouses over the resizable borders. Default: false
	 * 
	 * @return
	 */
	public native final boolean autoHide() /*-{
		return this.autoHide;
	}-*/;

	/**
	 * False to ensure that the resize handles are always visible, true to display them only when the user mouses over the resizable borders. Default: false
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig autoHide(boolean val) /*-{
		this.autoHide = val;
		return this;
	}-*/;

	/**
	 * The default minimum height of the element. Only used when ResizeConstrained is not plugged. Default: 15
	 * 
	 * @return
	 */
	public native final int defMinHeight() /*-{
		return this.defMinHeight;
	}-*/;

	/**
	 * The default minimum height of the element. Only used when ResizeConstrained is not plugged. Default: 15
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig defMinHeight(int val) /*-{
		this.defMinHeight = val;
		return this;
	}-*/;

	/**
	 * The default minimum width of the element. Only used when ResizeConstrained is not plugged.Default: 15
	 * 
	 * @return
	 */
	public native final int defMinWidth() /*-{
		return this.defMinWidth;
	}-*/;

	/**
	 * The default minimum width of the element. Only used when ResizeConstrained is not plugged.Default: 15
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig defMinWidth(int val) /*-{
		this.defMinWidth = val;
		return this;
	}-*/;

	/**
	 * The handles to use (any combination of): 't', 'b', 'r', 'l', 'bl', 'br', 'tl', 'tr'. Can use a shortcut of All.Default: all
	 * 
	 * @return
	 */
	public native final JsArrayString handles() /*-{
		return this.handles;
	}-*/;

	/**
	 * The handles to use (any combination of): 't', 'b', 'r', 'l', 'bl', 'br', 'tl', 'tr'. Can use a shortcut of All.Default: all
	 * 
	 * @return
	 */
	public native final String handlesString() /*-{
		return this.handles;
	}-*/;

	/**
	 * The handles to use (any combination of): 't', 'b', 'r', 'l', 'bl', 'br', 'tl', 'tr'. Can use a shortcut of All.Default: all
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig handles(JsArrayString val) /*-{
		this.handles = val;
		return this;
	}-*/;

	/**
	 * The handles to use (any combination of): 't', 'b', 'r', 'l', 'bl', 'br', 'tl', 'tr'. Can use a shortcut of All.Default: all
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig handles(String[] val) /*-{
		this.handles = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val);
		return this;
	}-*/;

	/**
	 * The handles to use (any combination of): 't', 'b', 'r', 'l', 'bl', 'br', 'tl', 'tr'. Can use a shortcut of All.Default: all
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig handles(String val) /*-{
		this.handles = val;
		return this;
	}-*/;

	/**
	 * The selector or element to resize. Required.
	 * 
	 * @return
	 */
	public native final Node handlesWrapper() /*-{
		return this.handlesWrapper;
	}-*/;

	/**
	 * The selector or element to resize. Required.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig handlesWrapper(Node val) /*-{
		this.handlesWrapper = val;
		return this;
	}-*/;

	/**
	 * True when the element is being Resized.Default: false
	 * 
	 * @return
	 */
	public native final boolean resizing() /*-{
		return this.resizing;
	}-*/;

	/**
	 * True when the element is being Resized.Default: false
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig resizing(boolean val) /*-{
		this.resizing = val;
		return this;
	}-*/;

	/**
	 * True to wrap an element with a div if needed (required for textareas and images, defaults to false) in favor of the handles config option. The wrapper element type (default
	 * div) could be over-riden passing the wrapper attribute.Default: false
	 * 
	 * @return
	 */
	public native final boolean wrap() /*-{
		return this.wrap;
	}-*/;

	/**
	 * True to wrap an element with a div if needed (required for textareas and images, defaults to false) in favor of the handles config option. The wrapper element type (default
	 * div) could be over-riden passing the wrapper attribute.Default: false
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig wrap(boolean val) /*-{
		this.wrap = val;
		return this;
	}-*/;

	/**
	 * Element to wrap the wrapTypes. This element will house the handles elements. Default: div
	 * 
	 * @return
	 */
	public native final String wrapper() /*-{
		return this.wrapper;
	}-*/;

	/**
	 * Element to wrap the wrapTypes. This element will house the handles elements. Default: div
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig wrapper(String val) /*-{
		this.wrapper = val;
		return this;
	}-*/;

	// TODO: wrapper Node

	/**
	 * Elements that requires a wrapper by default. Normally are elements which cannot have children elements. Default: /canvas|textarea|input|select|button|img/i
	 * 
	 * @return
	 */
	public native final JavaScriptObject wrapTypes() /*-{
		return this.wrapTypes;
	}-*/;

	/**
	 * Elements that requires a wrapper by default. Normally are elements which cannot have children elements. Default: /canvas|textarea|input|select|button|img/i
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig wrapTypes(JavaScriptObject val) /*-{
		this.wrapTypes = val;
		return this;
	}-*/;

	/**
	 * The selector or element to resize. Required.
	 * 
	 * @return
	 */
	public native final Node node() /*-{
		return this.node;
	}-*/;

	/**
	 * The selector or element to resize. Required.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig node(Node val) /*-{
		this.node = val;
		return this;
	}-*/;

	/**
	 * The selector or element to resize. Required.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ResizeConfig node(String val) /*-{
		this.node = val;
		return this;
	}-*/;
}
