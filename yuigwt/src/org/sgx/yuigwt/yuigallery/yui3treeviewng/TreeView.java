package org.sgx.yuigwt.yuigallery.yui3treeviewng;

import org.sgx.yuigwt.yui.widget.ext.WidgetExt;

/**
 * <p>
 * TreeView widget. Provides a tree style widget, with a hierachical representation of it's components. It extends WidgetParent and WidgetChild, please refer to it's documentation
 * for more info.
 * </p>
 * 
 * <p>
 * This widget represents the root cotainer for TreeNode objects that build the actual tree structure. Therefore this widget will not usually have any visual representation. Its
 * also responsible for handling node events.
 * </p>
 * 
 * @see http://haizaar.github.com/yui3-gallery/gallery-yui3treeview-ng/example-tree.html
 * 
 * @see http://haizaar.github.com/yui3-gallery/gallery-yui3treeview-ng/api/classes/TreeView.html
 * 
 * @author sg
 * 
 */
public class TreeView extends WidgetExt {
	protected TreeView() {
	}

	/**
	 * Fires when node is clicked
	 */
	public static final String EVENT_NODECLICK = "nodeClick";
	/**
	 * Fires when node is collapsed
	 */
	public static final String EVENT_NODECOLLAPSE = "nodeCollapse";
	/**
	 * Fires when node is expanded
	 */
	public static final String EVENT_NODEEXPAND = "nodeExpand";
	/**
	 * Fires when node is expanded / collapsed
	 */
	public static final String EVENT_NODETOGGLE = "nodeToggle";

	/**
	 * Whether children of this node can be loaded on demand (when this tree node is expanded, for example). Use with gallery-yui3treeview-ng-datasource.
	 * 
	 * @return
	 */
	public native final boolean loadOnDemand() /*-{
		return this.get("loadOnDemand");
	}-*/;

	/**
	 * Whether children of this node can be loaded on demand (when this tree node is expanded, for example). Use with gallery-yui3treeview-ng-datasource.
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final TreeView loadOnDemand(boolean val) /*-{
		this.set("loadOnDemand", val);
		return this;
	}-*/;

	/**
	 * Whether to render tree nodes expanded or collapsed by default
	 * 
	 * @return
	 */
	public native final boolean startCollapsed() /*-{
		return this.get("startCollapsed");
	}-*/;

	/**
	 * Whether to render tree nodes expanded or collapsed by default
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final TreeView startCollapsed(boolean val) /*-{
		this.set("startCollapsed", val);
		return this;
	}-*/;

	/**
	 * whether to toogle tree state on label clicks with addition to toggle control clicks
	 * 
	 * @return
	 */
	public native final boolean toggleOnLabelClick() /*-{
		return this.get("toggleOnLabelClick");
	}-*/;

	/**
	 * whether to toogle tree state on label clicks with addition to toggle control clicks
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final TreeView toggleOnLabelClick(boolean val) /*-{
		this.set("toggleOnLabelClick", val);
		return this;
	}-*/;
}
