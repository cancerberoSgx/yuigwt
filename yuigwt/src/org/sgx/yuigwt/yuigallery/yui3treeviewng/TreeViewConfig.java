package org.sgx.yuigwt.yuigallery.yui3treeviewng;

import org.sgx.yuigwt.yui.widget.ext.WidgetExtConfig;

/**
 * <p>
 * config object for treeview
 * </p>
 * 
 * @see http ://haizaar.github.com/yui3-gallery/gallery-yui3treeview-ng/example-tree .html
 * 
 * @see http ://haizaar.github.com/yui3-gallery/gallery-yui3treeview-ng/api/classes /TreeView.html
 * 
 * @author sg
 * 
 */
public class TreeViewConfig extends WidgetExtConfig {
	protected TreeViewConfig() {
	}
	public static final native TreeViewConfig create()/*-{
		return {};
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
	public native final TreeViewConfig loadOnDemand(boolean val) /*-{
		this.loadOnDemand = val;
		return this;
	}-*/;

	/**
	 * Whether to render tree nodes expanded or collapsed by default
	 * 
	 * @return
	 */
	public native final boolean startCollapsed() /*-{
		return this.startCollapsed;
	}-*/;

	/**
	 * Whether to render tree nodes expanded or collapsed by default
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeViewConfig startCollapsed(boolean val) /*-{
		this.startCollapsed = val;
		return this;
	}-*/;

	/**
	 * whether to toogle tree state on label clicks with addition to toggle control clicks
	 * 
	 * @return
	 */
	public native final boolean toggleOnLabelClick() /*-{
		return this.toggleOnLabelClick;
	}-*/;

	/**
	 * whether to toogle tree state on label clicks with addition to toggle control clicks
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeViewConfig toggleOnLabelClick(boolean val) /*-{
		this.toggleOnLabelClick = val;
		return this;
	}-*/;
}
