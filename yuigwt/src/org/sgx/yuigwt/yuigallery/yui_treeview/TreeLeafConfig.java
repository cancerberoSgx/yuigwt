package org.sgx.yuigwt.yuigallery.yui_treeview;

import org.sgx.yuigwt.yui.widget.ext.WidgetExtConfig;

import com.google.gwt.core.client.JsArray;

/**
 * This serves both for treeview and treeleaf configurations
 * 
 * @author sg
 * 
 */
public class TreeLeafConfig extends WidgetExtConfig {
	protected TreeLeafConfig() {
	}

	public static final native TreeLeafConfig create()/*-{
		return {};
	}-*/;

	/**
	 * The label for the tree leaf.
	 * 
	 * @return
	 */
	public native final String label() /*-{
		return this.label;
	}-*/;

	/**
	 * The label for the tree leaf.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeLeafConfig label(String val) /*-{
		this.label = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final JsArray<TreeLeafConfig> children() /*-{
		return this.children;
	}-*/;

	/**
	 * Attribute to indicate whether a tree is in a collapsed state or not.Default: true
	 * 
	 * @return
	 */
	public native final boolean collapsed() /*-{
		return this.collapsed;
	}-*/;

	/**
	 * Attribute to indicate whether a tree is in a collapsed state or not.Default: true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TreeLeafConfig collapsed(boolean val) /*-{
		this.collapsed = val;
		return this;
	}-*/;

	// /**
	// *
	// * @param val should be a JsArray<TreeLeafConfig>
	// * @return this - for setter chaining
	// */
	// public native final TreeLeafConfig children(JavaScriptObject val) /*-{
	// this.children = val;
	// return this;
	// }-*/;

	// public native final TreeLeafConfig children(TreeLeafConfig [] val) /*-{
	// this.children = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val);
	// return this;
	// }-*/;
	// public native final TreeLeafConfig children(JavaScriptObject [] val) /*-{
	// this.children = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val);
	// return this;
	// }-*/;

	// /**
	// * The class type of the tree child nodes. Default: "TreeLeaf"
	// * @return
	// */
	// public native final String defaultChildType() /*-{
	// return this.defaultChildType;
	// }-*/;
	//
	// /**
	// * The class type of the tree child nodes. Default: "TreeLeaf"
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final TreeLeafConfig defaultChildType(String val) /*-{
	// this.defaultChildType = val;
	// return this;
	// }-*/;
}
