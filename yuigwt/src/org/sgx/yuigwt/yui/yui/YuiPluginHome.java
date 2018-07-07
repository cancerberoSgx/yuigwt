package org.sgx.yuigwt.yui.yui;

import org.sgx.yuigwt.yui.editor.EditorBidi;

import com.google.gwt.core.client.JavaScriptObject;

public class YuiPluginHome extends JavaScriptObject {
	protected YuiPluginHome() {
	}

	public final native PluginBase NodeMenuNav()/*-{
		return this.NodeMenuNav;
	}-*/;

	public final native PluginBase Pjax()/*-{
		return this.Pjax;
	}-*/;

	// public final native PluginBase Drag()/*-{
	// return this.Drag;
	// }-*/;

	public final native PluginBase AutoComplete()/*-{
		return this.AutoComplete;
	}-*/;
	public final native PluginBase Button()/*-{
		return this.Button;
	}-*/;
	public final native PluginBase DataSourceArraySchema()/*-{
		return this.DataSourceArraySchema;
	}-*/;

	public final native PluginBase DataSourceJSONSchema()/*-{
		return this.DataSourceJSONSchema;
	}-*/;

	public final native PluginBase DataSourceTextSchema()/*-{
		return this.DataSourceTextSchema;
	}-*/;

	public final native PluginBase DataSourceXMLSchema()/*-{
		return this.DataSourceXMLSchema;
	}-*/;

	public final native EditorBidi EditorBidi()/*-{
		return this.EditorBidi;
	}-*/;

	public final native PluginBase NodeFocusManager()/*-{
		return this.NodeFocusManager;
	}-*/;

	public final native org.sgx.yuigwt.yui.widget.scrollview.ScrollViewPaginator ScrollViewPaginator()/*-{
		return this.ScrollViewPaginator;
	}-*/;

	public final native org.sgx.yuigwt.yui.widget.scrollview.ScrollViewScrollbars ScrollViewScrollbars()/*-{
		return this.ScrollViewScrollbars;
	}-*/;

	public final native PluginBase Resize()/*-{
		return this.Resize;
	}-*/;

	// Drag & Drop
	public final native PluginBase DDConstrained()/*-{
		return this.DDConstrained;
	}-*/;

	public final native PluginBase DDNodeScroll()/*-{
		return this.DDNodeScroll;
	}-*/;

	public final native PluginBase DDProxy()/*-{
		return this.DDProxy;
	}-*/;

	public final native PluginBase DDWindowScroll()/*-{
		return this.DDWindowScroll;
	}-*/;

	public final native PluginBase Drag()/*-{
		return this.Drag;
	}-*/;

	public final native PluginBase Drop()/*-{
		return this.Drop;
	}-*/;

}
