package org.sgx.yuigwt.yui.resize;

import org.sgx.yuigwt.yui.base.Base;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * A base class for Resize, providing: <br/>
 * Basic Lifecycle (initializer, renderUI, bindUI, syncUI, destructor) <br/>
 * 
 * Applies drag handles to an element to make it resizable <br/>
 * 
 * Here is the list of valid resize handles: [ 't', 'tr', 'r', 'br', 'b', 'bl',
 * 'l', 'tl' ]. You can read this list as top, top-right, right, bottom-right,
 * bottom, bottom-left, left, top-left. <br/>
 * 
 * The drag handles are inserted into the element and positioned absolute. Some
 * elements, such as a textarea or image, don't support children. To overcome
 * that, set wrap:true in your config and the element willbe wrapped for you
 * automatically.</br>
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
public class Resize extends Base {
	protected Resize() {
	}

	public static interface EachCallback {
		void call(String handleName, int index);
	}

	/**
	 * Loop through each handle which is being used and executes a callback.
	 * Example:
	 * 
	 * <pre>
	 * instance.eachHandle(
	 *      function(handleName, index) { ... }
	 *  );
	 * </pre>
	 * 
	 * @param c
	 * @return
	 */
	public final native boolean eachHandle(EachCallback c)/*-{
		this
				.eachHandle($entry(function(handleName, index) {
					c.@org.sgx.yuigwt.yui.resize.Resize.EachCallback::call(Ljava/lang/String;I)(handleName, index);
				}));
		return this;
	}-*/;

	/**
	 * False to ensure that the resize handles are always visible, true to
	 * display them only when the user mouses over the resizable borders.
	 * Default: false
	 * 
	 * @return the attribute
	 */
	public final native boolean autoHide()/*-{
		return this.get("autoHide");
	}-*/;

	/**
	 * False to ensure that the resize handles are always visible, true to
	 * display them only when the user mouses over the resizable borders.
	 * Default: false
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Resize autoHide(boolean val)/*-{
		this.set("autoHide", val);
		return this;
	}-*/;

	/**
	 * The default minimum height of the element. Only used when
	 * ResizeConstrained is not plugged. Default: 15
	 * 
	 * @return the attribute
	 */
	public final native int defMinHeight()/*-{
		return this.get("defMinHeight");
	}-*/;

	/**
	 * The default minimum height of the element. Only used when
	 * ResizeConstrained is not plugged. Default: 15
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Resize defMinHeight(int val)/*-{
		this.set("defMinHeight", val);
		return this;
	}-*/;

	/**
	 * The default minimum width of the element. Only used when
	 * ResizeConstrained is not plugged.Default: 15
	 * 
	 * @return the attribute
	 */
	public final native int defMinWidth()/*-{
		return this.get("defMinWidth");
	}-*/;

	/**
	 * The default minimum width of the element. Only used when
	 * ResizeConstrained is not plugged.Default: 15
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Resize defMinWidth(int val)/*-{
		this.set("defMinWidth", val);
		return this;
	}-*/;

	/**
	 * The handles to use (any combination of): 't', 'b', 'r', 'l', 'bl', 'br',
	 * 'tl', 'tr'. Can use a shortcut of All.Default: all
	 * 
	 * @return the attribute
	 */
	public final native JsArrayString handles()/*-{
		return this.get("handles");
	}-*/;

	/**
	 * The handles to use (any combination of): 't', 'b', 'r', 'l', 'bl', 'br',
	 * 'tl', 'tr'. Can use a shortcut of All.Default: all
	 * 
	 * @return the attribute
	 */
	public final native String handlesString()/*-{
		return this.get("handles");
	}-*/;

	/**
	 * The handles to use (any combination of): 't', 'b', 'r', 'l', 'bl', 'br',
	 * 'tl', 'tr'. Can use a shortcut of All.Default: all
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Resize handles(JsArrayString val)/*-{
		this.set("handles", val);
		return this;
	}-*/;

	/**
	 * The handles to use (any combination of): 't', 'b', 'r', 'l', 'bl', 'br',
	 * 'tl', 'tr'. Can use a shortcut of All.Default: all
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Resize handles(String[] val)/*-{
		this
				.set("handles",
						@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val));
		return this;
	}-*/;

	/**
	 * Node to wrap the resize handles.
	 * 
	 * @return the attribute
	 */
	public final native Node handlesWrapper()/*-{
		return this.get("handlesWrapper");
	}-*/;

	/**
	 * Node to wrap the resize handles.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Resize handlesWrapper(Node val)/*-{
		this.set("handlesWrapper", val);
		return this;
	}-*/;

	/**
	 * True when the element is being Resized.Default: false
	 * 
	 * @return the attribute
	 */
	public final native boolean resizing()/*-{
		return this.get("resizing");
	}-*/;

	/**
	 * True when the element is being Resized.Default: false
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Resize resizing(boolean val)/*-{
		this.set("resizing", val);
		return this;
	}-*/;

	/**
	 * True to wrap an element with a div if needed (required for textareas and
	 * images, defaults to false) in favor of the handles config option. The
	 * wrapper element type (default div) could be over-riden passing the
	 * wrapper attribute.Default: false
	 * 
	 * @return the attribute
	 */
	public final native boolean wrap()/*-{
		return this.get("wrap");
	}-*/;

	/**
	 * True to wrap an element with a div if needed (required for textareas and
	 * images, defaults to false) in favor of the handles config option. The
	 * wrapper element type (default div) could be over-riden passing the
	 * wrapper attribute.Default: false
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Resize wrap(boolean val)/*-{
		this.set("wrap", val);
		return this;
	}-*/;

	/**
	 * Element to wrap the wrapTypes. This element will house the handles
	 * elements. Default: div
	 * 
	 * @return the attribute
	 */
	public final native Node wrapper()/*-{
		return this.get("wrapper");
	}-*/;

	/**
	 * Element to wrap the wrapTypes. This element will house the handles
	 * elements. Default: div
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Resize wrapper(Node val)/*-{
												this.set("wrapper", val);
												return this; 
												}-*/;

	// TODO: wrapper String
	/**
	 * Elements that requires a wrapper by default. Normally are elements which
	 * cannot have children elements. Default:
	 * /canvas|textarea|input|select|button|img/i
	 * 
	 * @return the attribute
	 */
	public final native JavaScriptObject wrapTypes()/*-{
													return this.get("wrapTypes");
													}-*/;

	/**
	 * Elements that requires a wrapper by default. Normally are elements which
	 * cannot have children elements. Default:
	 * /canvas|textarea|input|select|button|img/i
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Resize wrapTypes(JavaScriptObject val)/*-{
																this.set("wrapTypes", val);
																return this; 
																}-*/;

	/**
	 * 
	 * @return the attribute
	 */
	public final native Node node()/*-{
									return this.get("node");
									}-*/;

	/**
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Resize node(Node val)/*-{
												this.set("node", val);
												return this; 
												}-*/;
}
