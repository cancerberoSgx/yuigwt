package org.sgx.yuigwt.yuigallery.yui3treeviewng;

import org.sgx.yuigwt.yui.widget.ext.WidgetExt;
import org.sgx.yuigwt.yuigallery.yui_treeview.TreeLeafConfig;

import com.google.gwt.core.client.JsArrayString;

/**
 * TreeNode widget. Provides a tree style node widget. It extends WidgetParent and WidgetChild, please refer to it's documentation for more info.
 * 
 * @author sg
 * 
 */
public class TreeNode extends WidgetExt {
	protected TreeNode() {
	}


	
	//methods
	
	/**
	 * Collapses the tree
	 * @return
	 */
	public native final TreeNode collapse() /*-{
		this.collapse(); 
		return this; 
	}-*/;
	/**
	 * Expands the tree
	 * @return
	 */
	public native final TreeNode expand() /*-{
		this.expand(); 
		return this; 
	}-*/;
	
	/**
	 * Returns breadcrumbs path of labels from root of the tree to this node (inclusive)
	 * @param labelAttr Attribute name to use for node representation. Can be any attribute of TreeNode
	 * @param reverse Return breadcrumbs from the node to root instead of root to the node
	 * @return array of node labels 
	 */
	public native final JsArrayString path(String labelAttr, boolean reverse) /*-{
		return this.path(labelAttr, reverse);
	}-*/;
	/**
	 * Toggle current expaned/collapsed tree state
	 * @return
	 */
	public native final TreeNode toggleState() /*-{
		this.toggleState(); 
		return this; 
	}-*/;
	
	//attributes
	
	/**
	 * Canonical label for the node. You can set it to anything you like and use later with your external tools.
	 * 
	 * @return
	 */
	public native final String clabel() /*-{
		return this.get("clabel");
	}-*/;

	/**
	 * Canonical label for the node. You can set it to anything you like and use later with your external tools.
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final TreeNode clabel(String val) /*-{
		this.set("clabel", val);
		return this;
	}-*/;

	/**
	 * Represents current treenode state - whether its collapsed or extended
	 * 
	 * @return
	 */
	public native final boolean collapsed() /*-{
		return this.get("collapsed");
	}-*/;

	/**
	 * Represents current treenode state - whether its collapsed or extended
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final TreeNode collapsed(boolean val) /*-{
		this.set("collapsed", val);
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String defaultChildType() /*-{
		return this.get("defaultChildType");
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final TreeNode defaultChildType(String val) /*-{
		this.set("defaultChildType", val);
		return this;
	}-*/;

/**
 * Signifies whether this node is the last child of its parent.
 * @return
 */
public native final boolean isLast() /*-{
return this.get("isLast"); 
}-*/;

/**
 * Signifies whether this node is the last child of its parent.
 * @param val
 * @return this - for method chaining
 */
public native final TreeNode isLast(boolean val) /*-{
this.set("isLast", val); 
return this; 
}-*/;

/**
 * Signifies whether this node is a leaf node. Nodes with loadOnDemand set to true are not considered leafs.
 * @return
 */
public native final boolean isLeaf() /*-{
return this.get("isLeaf"); 
}-*/;

/**
 * Signifies whether this node is a leaf node. Nodes with loadOnDemand set to true are not considered leafs.
 * @param val
 * @return this - for method chaining
 */
public native final TreeNode isLeaf(boolean val) /*-{
this.set("isLeaf", val); 
return this; 
}-*/;

/**
 * TreeNode node label
 * @return
 */
public native final String label() /*-{
return this.get("label"); 
}-*/;

/**
 * TreeNode node label
 * @param val
 * @return this - for method chaining
 */
public native final TreeNode label(String val) /*-{
this.set("label", val); 
return this; 
}-*/;

/**
 * Whether children of this node can be loaded on demand (when this tree node is expanded, for example). Use with gallery-yui3treeview-ng-datasource.
 * @return
 */
public native final boolean loadOnDemand() /*-{
return this.get("loadOnDemand"); 
}-*/;

/**
 * Whether children of this node can be loaded on demand (when this tree node is expanded, for example). Use with gallery-yui3treeview-ng-datasource.
 * @param val
 * @return this - for method chaining
 */
public native final TreeNode loadOnDemand(boolean val) /*-{
this.set("loadOnDemand", val); 
return this; 
}-*/;

/**
 * Signifies id of this node. You can set it to anything you like and use later with your external tools.
 * @return
 */
public native final String nodeId() /*-{
return this.get("nodeId"); 
}-*/;

/**
 * Signifies id of this node. You can set it to anything you like and use later with your external tools.
 * @param val
 * @return this - for method chaining
 */
public native final TreeNode nodeId(String val) /*-{
this.set("nodeId", val); 
return this; 
}-*/;
}
