package org.sgx.yuigwt.yui.sortable;

import org.sgx.yuigwt.yui.base.BaseClass;
import org.sgx.yuigwt.yui.node.Node;

public class SortableClass extends BaseClass {

	protected SortableClass() {
	}

	/**
	 * Get a Sortable instance back from a node reference or a selector string.
	 * 
	 * @param node
	 *            The node instance or selector string to use to find a Sortable
	 *            instance.
	 * @return a Sortable instance back from a node reference or a selector
	 *         string.
	 */
	public native final Sortable getSortable(String node) /*-{
		return this.getSortable(node);
	}-*/;

	/**
	 * Get a Sortable instance back from a node reference or a selector string.
	 * 
	 * @param node
	 *            The node instance or selector string to use to find a Sortable
	 *            instance.
	 * @return a Sortable instance back from a node reference or a selector
	 *         string.
	 */
	public native final Sortable getSortable(Node node) /*-{
		return this.getSortable(node);
	}-*/;

	/**
	 * Register a Sortable instance with the singleton to allow lookups later.
	 * 
	 * @param s
	 *            A Sortable instance.
	 * @return
	 */
	public native final SortableClass reg(Sortable s) /*-{
		this.reg(s);
		return this;
	}-*/;

	/**
	 * Unregister a Sortable instance with the singleton.
	 * 
	 * @param s
	 *            A Sortable instance.
	 * @return
	 */
	public native final SortableClass unreg(Sortable s) /*-{
		this.unreg(s);
		return this;
	}-*/;
}
