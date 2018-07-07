package org.sgx.yuigwt.yuigallery.yui3treeviewng;

import org.sgx.yuigwt.yui.widget.ext.WidgetExtConfig;
/**
 * 
 * @author sg
 *
 */
public class TreeNodeConfig extends WidgetExtConfig {
	protected TreeNodeConfig() {
	}
	
	public static final native TreeNodeConfig create()/*-{
		return {};
	}-*/;

	/**
	 * Canonical label for the node. You can set it to anything you like and use later with your external tools.
	 * 
	 * @return
	 */
	public native final String clabel() /*-{
		return this.clabel;
	}-*/;

	/**
	 * Canonical label for the node. You can set it to anything you like and use later with your external tools.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeNodeConfig clabel(String val) /*-{
		this.clabel = val;
		return this;
	}-*/;

	/**
	 * Represents current treenode state - whether its collapsed or extended
	 * 
	 * @return
	 */
	public native final boolean collapsed() /*-{
		return this.collapsed;
	}-*/;

	/**
	 * Represents current treenode state - whether its collapsed or extended
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeNodeConfig collapsed(boolean val) /*-{
		this.collapsed = val;
		return this;
	}-*/;

	// /**
	// *
	// * @return
	// */
	// public native final String defaultChildType() /*-{
	// return this.defaultChildType;
	// }-*/;
	//
	// /**
	// *
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final TreeNodeConfig defaultChildType(String val) /*-{
	// this.defaultChildType = val;
	// return this;
	// }-*/;

	/**
	 * Signifies whether this node is the last child of its parent.
	 * 
	 * @return
	 */
	public native final boolean isLast() /*-{
		return this.isLast;
	}-*/;

	/**
	 * Signifies whether this node is the last child of its parent.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeNodeConfig isLast(boolean val) /*-{
		this.isLast = val;
		return this;
	}-*/;

	/**
	 * Signifies whether this node is a leaf node. Nodes with loadOnDemand set to true are not considered leafs.
	 * 
	 * @return
	 */
	public native final boolean isLeaf() /*-{
		return this.isLeaf;
	}-*/;

	/**
	 * Signifies whether this node is a leaf node. Nodes with loadOnDemand set to true are not considered leafs.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeNodeConfig isLeaf(boolean val) /*-{
		this.isLeaf = val;
		return this;
	}-*/;

	/**
	 * TreeNode node label
	 * 
	 * @return
	 */
	public native final String label() /*-{
		return this.label;
	}-*/;

	/**
	 * TreeNode node label
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeNodeConfig label(String val) /*-{
		this.label = val;
		return this;
	}-*/;

	/**
	 * Whether children of this node can be loaded on demand (when this tree node is expanded, for example). Use with gallery-yui3treeview-ng-datasource.
	 * 
	 * @return
	 */
	public native final boolean loadOnDemand() /*-{
		return this.loadOnDemand;
	}-*/;

	/**
	 * Whether children of this node can be loaded on demand (when this tree node is expanded, for example). Use with gallery-yui3treeview-ng-datasource.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeNodeConfig loadOnDemand(boolean val) /*-{
		this.loadOnDemand = val;
		return this;
	}-*/;

	/**
	 * Signifies id of this node. You can set it to anything you like and use later with your external tools.
	 * 
	 * @return
	 */
	public native final String nodeId() /*-{
		return this.nodeId;
	}-*/;

	/**
	 * Signifies id of this node. You can set it to anything you like and use later with your external tools.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeNodeConfig nodeId(String val) /*-{
		this.nodeId = val;
		return this;
	}-*/;
}
