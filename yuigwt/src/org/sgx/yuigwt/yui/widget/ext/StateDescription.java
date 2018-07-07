package org.sgx.yuigwt.yui.widget.ext;

import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * overlay for config objects of http://yuilibrary.com/yui/docs/api/classes/WidgetAutohide.html#attr_hideOn, 
 * http://yuilibrary.com/yui/docs/api/classes/WidgetModality.html#attr_focusOn, etc
 * 
 * 
 * @author sg
 *
 */
public class StateDescription extends JavaScriptObject {
	protected StateDescription(){}; 
	public static final native StateDescription create()/*-{
		return {}; 
	}-*/;

	/**
	 * required): The eventName to listen to.
	 * @return
	 */
	public native final String eventName() /*-{
	return this.eventName; 
	}-*/;

	/**
	 * required): The eventName to listen to.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final StateDescription eventName(String val) /*-{
	this.eventName = val; 
	return this; 
	}-*/;

	/**
	 * optional): The Y.Node that will fire the event (defaults to the boundingBox of the widget)
	 * @return
	 */
	public native final Node node() /*-{
	return this.node; 
	}-*/;

	/**
	 * optional): The Y.Node that will fire the event (defaults to the boundingBox of the widget)
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final StateDescription node(Node val) /*-{
	this.node = val; 
	return this; 
	}-*/;

	/**
	 * optional): If listening for key events, specify the keyCode
	 * @return
	 */
	public native final String keyCode() /*-{
	return this.keyCode; 
	}-*/;

	/**
	 * optional): If listening for key events, specify the keyCode
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final StateDescription keyCode(String val) /*-{
	this.keyCode = val; 
	return this; 
	}-*/;
}
