package org.sgx.yuigwt.yui.sortable;

import org.sgx.yuigwt.yui.base.Base;
import org.sgx.yuigwt.yui.dd.Delegate;
import org.sgx.yuigwt.yui.util.Callback;
import org.sgx.yuigwt.yui.util.JsFunction;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Sortable Utility allows you to create a sortable list from a container
 * and a group of children. It also allows you to join lists together in various
 * ways.. This class allows you to create a Drag & Drop reordered list.
 * 
 * @see http://yuilibrary.com/yui/docs/sortable/
 * @see http://yuilibrary.com/yui/docs/api/classes/Sortable.html
 * @author sg
 * 
 */
public class Sortable extends Base {
	protected Sortable() {
	}

	public static final String JOIN_FULL = "full", JOIN_INNER = "inner",
			JOIN_OUTER = "outer", JOIN_NONE = "none";
	
	public static final String MOVE_INSERT = "insert", MOVE_SWAP = "swap",
			MOVE_MOVE = "move", MOVE_COPY = "copy";

	/**
	 * A custom callback to allow a user to extract some sort of id or any other
	 * data from the node to use in the "ordering list" and then that data
	 * should be returned from the callback.
	 * 
	 * @param callback
	 * @return Array
	 */
	public native final JavaScriptObject getOrdering(JsFunction callback) /*-{
		return this.getOrdering(callback);
	}-*/;
	
	public native final Delegate delegate() /*-{
		return this.delegate || null; 
	}-*/;

	/**
	 * A custom callback to allow a user to extract some sort of id or any other
	 * data from the node to use in the "ordering list" and then that data
	 * should be returned from the callback.
	 * 
	 * @param callback
	 * @return Array
	 */
	public native final JavaScriptObject getOrdering(Callback callback) /*-{
		var f = $entry(function() {
			return callback.@org.sgx.yuigwt.yui.util.Callback::call(Lcom/google/gwt/core/client/JsArrayMixed;)(arguments);
		});
		return this.getOrdering(f);
	}-*/;

	/**
	 * <p>
	 * Join this Sortable with another Sortable instance.
	 * </p>
	 * <p>
	 * <b>full</b>: Exchange nodes with both lists.
	 * </p>
	 * <p>
	 * <b>inner</b>: Items can go into this list from the joined list.
	 * </p>
	 * <p>
	 * <b>outer</b>: Items can go out of the joined list into this list.
	 * </p>
	 * <p>
	 * <b>none</b>: Removes the join.
	 * </p>
	 * 
	 * @param sel
	 *            The Sortable list to join with
	 * @param type
	 *            The type of join to do: full, inner, outer, none. Default:
	 *            full
	 * @return self for method chaining
	 */
	public native final Sortable join(Sortable sel, String type) /*-{
		this.join(sel, type);
		return this;
	}-*/;

	/**
	 * Passthrough to the DD.Delegate.ddplug method
	 * 
	 * @param cls
	 *            The class to plug
	 * @param config
	 *            The class config
	 * @return
	 */
	public native final Sortable plug(JavaScriptObject cls,
			JavaScriptObject config) /*-{
		this.plug(cls, config);
		return this;
	}-*/;

	/**
	 * Passthrough to the DD.Delegate syncTargets method.
	 * 
	 * @return self for method chaining
	 */
	public native final Sortable sync() /*-{
		this.sync();
		return this;
	}-*/;

	// attrs
	/**
	 * A selector query to get the container to listen for mousedown events on.
	 * All "nodes" should be a child of this container.
	 * 
	 * @return the attribute
	 */
	public final native String container()/*-{
		return this.get("container");
	}-*/;

	/**
	 * A selector query to get the container to listen for mousedown events on.
	 * All "nodes" should be a child of this container.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Sortable container(String val)/*-{
		this.set("container", val);
		return this;
	}-*/;

	/**
	 * Drag handles to pass on to the internal DD.Delegate instance.
	 * 
	 * @return the attribute
	 */
	public final native JavaScriptObject handles()/*-{
		return this.get("handles");
	}-*/;

	/**
	 * Drag handles to pass on to the internal DD.Delegate instance.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Sortable handles(JavaScriptObject val)/*-{
		this.set("handles", val);
		return this;
	}-*/;

	/**
	 * The id of this Sortable, used to get a reference to this Sortable list
	 * from another list.
	 * 
	 * @return the attribute
	 */
	public final native String id()/*-{
		return this.get("id");
	}-*/;

	/**
	 * The id of this Sortable, used to get a reference to this Sortable list
	 * from another list.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Sortable id(String val)/*-{
		this.set("id", val);
		return this;
	}-*/;

	/**
	 * A selector string to test if a list item is invalid and not sortable
	 * 
	 * @return the attribute
	 */
	public final native String invalid()/*-{
		return this.get("invalid");
	}-*/;

	/**
	 * A selector string to test if a list item is invalid and not sortable
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Sortable invalid(String val)/*-{
		this.set("invalid", val);
		return this;
	}-*/;

	/**
	 * How should an item move to another list: insert, swap, move, copy.
	 * Default: insert
	 * 
	 * @return the attribute
	 */
	public final native String moveType()/*-{
		return this.get("moveType");
	}-*/;

	/**
	 * How should an item move to another list: insert, swap, move, copy.
	 * Default: insert
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Sortable moveType(String val)/*-{
		this.set("moveType", val);
		return this;
	}-*/;

	/**
	 * A selector query to get the children of the "container" to make draggable
	 * elements from.
	 * 
	 * @return the attribute
	 */
	public final native String nodes()/*-{
		return this.get("nodes");
	}-*/;

	/**
	 * A selector query to get the children of the "container" to make draggable
	 * elements from.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Sortable nodes(String val)/*-{
		this.set("nodes", val);
		return this;
	}-*/;

	/**
	 * The opacity to change the proxy item to when dragging.
	 * 
	 * @return the attribute
	 */
	public final native String opacity()/*-{
		return this.get("opacity");
	}-*/;

	/**
	 * The opacity to change the proxy item to when dragging.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Sortable opacity(String val)/*-{
		this.set("opacity", val);
		return this;
	}-*/;

	/**
	 * The node to set opacity on when dragging (dragNode or currentNode).
	 * Default: currentNode.
	 * 
	 * @return the attribute
	 */
	public final native String opacityNode()/*-{
		return this.get("opacityNode");
	}-*/;

	/**
	 * The node to set opacity on when dragging (dragNode or currentNode).
	 * Default: currentNode.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Sortable opacityNode(String val)/*-{
		this.set("opacityNode", val);
		return this;
	}-*/;
}
