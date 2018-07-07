package org.sgx.yuigwt.yui.editor;

import org.sgx.yuigwt.yui.base.BaseEvent;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

public class EditorBaseEvent extends BaseEvent {
	protected EditorBaseEvent() {
	}

	// frame stuff
	/**
	 * The original frame's event
	 * 
	 * @return
	 */
	public native final YuiEvent frameEvent() /*-{
		return this.frameEvent;
	}-*/;

	/**
	 * The original frame's event target
	 * 
	 * @return
	 */
	public native final Node frameTarget() /*-{
		return this.frameTarget;
	}-*/;

	/**
	 * The original frame's event current target
	 * 
	 * @return
	 */
	public native final Node frameCurrentTarget() /*-{
		return this.frameCurrentTarget;
	}-*/;

	/**
	 * The event that caused the nodeChange
	 * 
	 * @return
	 */
	public native final EventFacade changedEvent() /*-{
		return this.changedEvent;
	}-*/;

	/**
	 * The event that caused the nodeChange
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseEvent changedEvent(EventFacade val) /*-{
		this.changedEvent = val;
		return this;
	}-*/;

	/**
	 * The node that was interacted with
	 * 
	 * @return
	 */
	public native final Node changedNode() /*-{
		return this.changedNode;
	}-*/;

	/**
	 * The node that was interacted with
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseEvent changedNode(Node val) /*-{
		this.changedNode = val;
		return this;
	}-*/;

	/**
	 * The type of change: mousedown, mouseup, right, left, backspace, tab,
	 * enter, etc..
	 * 
	 * @return
	 */
	public native final String changedType() /*-{
		return this.changedType;
	}-*/;

	/**
	 * The type of change: mousedown, mouseup, right, left, backspace, tab,
	 * enter, etc..
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseEvent changedType(String val) /*-{
		this.changedType = val;
		return this;
	}-*/;

	/**
	 * The list of execCommands that belong to this change and the dompath
	 * that's associated with the changedNode
	 * 
	 * @return
	 */
	public native final JsArray<? extends JavaScriptObject> commands() /*-{
		return this.commands;
	}-*/;

	/**
	 * The list of execCommands that belong to this change and the dompath
	 * that's associated with the changedNode
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseEvent commands(JsArray<? extends JavaScriptObject> val) /*-{
		this.commands = val;
		return this;
	}-*/;

	/**
	 * An array of classNames that are applied to the changedNode and all of
	 * it's parents
	 * 
	 * @return
	 */
	public native final JsArrayString classNames() /*-{
		return this.classNames;
	}-*/;

	/**
	 * An array of classNames that are applied to the changedNode and all of
	 * it's parents
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseEvent classNames(JsArrayString val) /*-{
		this.classNames = val;
		return this;
	}-*/;

	/**
	 * A sorted array of node instances that make up the DOM path from the
	 * changedNode to body.
	 * 
	 * @return
	 */
	public native final JsArray<Node> dompath() /*-{
		return this.dompath;
	}-*/;

	/**
	 * A sorted array of node instances that make up the DOM path from the
	 * changedNode to body.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseEvent dompath(JsArray<Node> val) /*-{
		this.dompath = val;
		return this;
	}-*/;

	/**
	 * The cascaded backgroundColor of the changedNode
	 * 
	 * @return
	 */
	public native final String backgroundColor() /*-{
		return this.backgroundColor;
	}-*/;

	/**
	 * The cascaded backgroundColor of the changedNode
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseEvent backgroundColor(String val) /*-{
		this.backgroundColor = val;
		return this;
	}-*/;

	/**
	 * The cascaded fontColor of the changedNode
	 * 
	 * @return
	 */
	public native final String fontColor() /*-{
		return this.fontColor;
	}-*/;

	/**
	 * The cascaded fontColor of the changedNode
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseEvent fontColor(String val) /*-{
		this.fontColor = val;
		return this;
	}-*/;

	/**
	 * The cascaded fontFamily of the changedNode
	 * 
	 * @return
	 */
	public native final String fontFamily() /*-{
		return this.fontFamily;
	}-*/;

	/**
	 * The cascaded fontFamily of the changedNode
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseEvent fontFamily(String val) /*-{
		this.fontFamily = val;
		return this;
	}-*/;

	/**
	 * The cascaded fontSize of the changedNode
	 * 
	 * @return
	 */
	public native final String fontSize() /*-{
		return this.fontSize;
	}-*/;

	/**
	 * The cascaded fontSize of the changedNode
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseEvent fontSize(String val) /*-{
		this.fontSize = val;
		return this;
	}-*/;
}
