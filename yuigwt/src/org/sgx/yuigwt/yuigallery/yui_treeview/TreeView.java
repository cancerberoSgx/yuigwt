package org.sgx.yuigwt.yuigallery.yui_treeview;

import org.sgx.yuigwt.yui.widget.ext.WidgetExt;

/**
 * Treeview visually represent a hierarchical list of elements and provides interactivity for showing and hiding subsections of that list.
 * 
 * <br/>
 * Example usage:
 * 
 * <pre>
 * var tree = new Y.TreeView({
 *     label : "This my tree",
 *     children: [
 *         { label: "Leaf One" },
 *         { label: "Leaf Two" },
 *         { type: "TreeView", label: "Subtree", children: [
 *            {  label: "Subtree - Leaf One" },
 *            {  label: "Subtree - Leaf Two" },
 *            {  label: "Subtree - Leaf Three" },
 *            {  label: "Subtree - Leaf Four" }
 *         ]}
 *     ]
 * });
 * tree.render("#mytree");
 * </pre>
 * 
 * @see http://allenrabinovich.github.com/gallery-yui-treeview/apidocs/classes/TreeView.html
 * @see http://yuilibrary.com/gallery/show/yui-treeview
 * @author sg
 * 
 */
public class TreeView extends WidgetExt {
	protected TreeView() {
	}

	/**
	 * Attribute to indicate whether a tree is in a collapsed state or not.Default: true
	 * 
	 * @return the attribute
	 */
	public final native boolean collapsed()/*-{
		return this.get("collapsed");
	}-*/;

	/**
	 * Attribute to indicate whether a tree is in a collapsed state or not. Default: true
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native TreeView collapsed(boolean val)/*-{
		this.set("collapsed", val);
		return this;
	}-*/;
}
