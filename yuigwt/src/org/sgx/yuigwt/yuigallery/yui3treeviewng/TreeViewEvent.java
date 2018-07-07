package org.sgx.yuigwt.yuigallery.yui3treeviewng;

import org.sgx.yuigwt.yui.widget.ext.WidgetExtEvent;

/**
 * 
 * @author sg
 * 
 */
public class TreeViewEvent extends WidgetExtEvent {
	protected TreeViewEvent() {
	}

	/**
	 * tree node event target
	 * 
	 * @return
	 */
	public native final TreeNode treenode() /*-{
		return this.treenode;
	}-*/;

	/**
	 * tree node event target
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeViewEvent treenode(TreeNode val) /*-{
		this.treenode = val;
		return this;
	}-*/;
}
