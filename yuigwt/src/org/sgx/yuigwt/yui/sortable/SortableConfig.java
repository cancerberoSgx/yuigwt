package org.sgx.yuigwt.yui.sortable;

import org.sgx.yuigwt.yui.base.BaseConfig;

import com.google.gwt.core.client.JavaScriptObject;

public class SortableConfig extends BaseConfig {
	protected SortableConfig() {
	}
	
	public static final native SortableConfig create()/*-{
		return {};
	}-*/;

	/**
	 * The opacity to change the proxy item to when dragging.
	 * 
	 * @return
	 */
	public native final String opacity() /*-{
		return this.opacity;
	}-*/;

	/**
	 * The opacity to change the proxy item to when dragging.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final SortableConfig opacity(String val) /*-{
		this.opacity = val;
		return this;
	}-*/;

	/**
	 * A selector query to get the container to listen for mousedown events on.
	 * All "nodes" should be a child of this container.
	 * 
	 * @return
	 */
	public native final String container() /*-{
		return this.container;
	}-*/;

	/**
	 * A selector query to get the container to listen for mousedown events on.
	 * All "nodes" should be a child of this container.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final SortableConfig container(String val) /*-{
		this.container = val;
		return this;
	}-*/;

	/**
	 * Drag handles to pass on to the internal DD.Delegate instance.
	 * 
	 * @return
	 */
	public native final JavaScriptObject handles() /*-{
		return this.handles;
	}-*/;

	/**
	 * Drag handles to pass on to the internal DD.Delegate instance.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final SortableConfig handles(JavaScriptObject val) /*-{
		this.handles = val;
		return this;
	}-*/;

	/**
	 * The id of this Sortable, used to get a reference to this Sortable list
	 * from another list.
	 * 
	 * @return
	 */
	public native final String id() /*-{
		return this.id;
	}-*/;

	/**
	 * The id of this Sortable, used to get a reference to this Sortable list
	 * from another list.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final SortableConfig id(String val) /*-{
		this.id = val;
		return this;
	}-*/;

	/**
	 * A selector string to test if a list item is invalid and not sortable
	 * 
	 * @return
	 */
	public native final String invalid() /*-{
		return this.invalid;
	}-*/;

	/**
	 * A selector string to test if a list item is invalid and not sortable
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final SortableConfig invalid(String val) /*-{
		this.invalid = val;
		return this;
	}-*/;

	/**
	 * How should an item move to another list: insert, swap, move, copy.
	 * Default: insert
	 * 
	 * @return
	 */
	public native final String moveType() /*-{
		return this.moveType;
	}-*/;

	/**
	 * How should an item move to another list: insert, swap, move, copy.
	 * Default: insert
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final SortableConfig moveType(String val) /*-{
		this.moveType = val;
		return this;
	}-*/;

	/**
	 * A selector query to get the children of the "container" to make draggable
	 * elements from.
	 * 
	 * @return
	 */
	public native final String nodes() /*-{
		return this.nodes;
	}-*/;

	/**
	 * A selector query to get the children of the "container" to make draggable
	 * elements from.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final SortableConfig nodes(String val) /*-{
		this.nodes = val;
		return this;
	}-*/;

	/**
	 * The node to set opacity on when dragging (dragNode or currentNode).
	 * Default: currentNode.
	 * 
	 * @return
	 */
	public native final String opacityNode() /*-{
		return this.opacityNode;
	}-*/;

	/**
	 * The node to set opacity on when dragging (dragNode or currentNode).
	 * Default: currentNode.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final SortableConfig opacityNode(String val) /*-{
		this.opacityNode = val;
		return this;
	}-*/;
}
