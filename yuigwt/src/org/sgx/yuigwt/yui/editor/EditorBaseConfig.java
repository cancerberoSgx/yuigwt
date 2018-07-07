package org.sgx.yuigwt.yui.editor;

import org.sgx.yuigwt.yui.base.BaseConfig;

public class EditorBaseConfig extends BaseConfig {
	protected EditorBaseConfig() {
	}

	public static final native EditorBaseConfig create()/*-{
		return {};
	}-*/;

	/**
	 * The content to load into the Editor Frame
	 * 
	 * @return
	 */
	public native final String content() /*-{
		return this.content;
	}-*/;

	/**
	 * The content to load into the Editor Frame
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseConfig content(String val) /*-{
		this.content = val;
		return this;
	}-*/;

	/**
	 * The default tag to use for block level items, defaults to: p
	 * 
	 * @return
	 */
	public native final String defaultblock() /*-{
		return this.defaultblock;
	}-*/;

	/**
	 * The default tag to use for block level items, defaults to: p
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseConfig defaultblock(String val) /*-{
		this.defaultblock = val;
		return this;
	}-*/;

	/**
	 * The value of the dir attribute on the HTML element of the frame. Default:
	 * ltr
	 * 
	 * @return
	 */
	public native final String dir() /*-{
		return this.dir;
	}-*/;

	/**
	 * The value of the dir attribute on the HTML element of the frame. Default:
	 * ltr
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseConfig dir(String val) /*-{
		this.dir = val;
		return this;
	}-*/;

	/**
	 * A string of CSS to add to the Head of the Editor
	 * 
	 * @return
	 */
	public native final String extracss() /*-{
		return this.extracss;
	}-*/;

	/**
	 * A string of CSS to add to the Head of the Editor
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseConfig extracss(String val) /*-{
		this.extracss = val;
		return this;
	}-*/;

	/**
	 * An array of url's to external linked style sheets
	 * 
	 * @return
	 */
	public native final String linkedcss() /*-{
		return this.linkedcss;
	}-*/;

	/**
	 * An array of url's to external linked style sheets
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseConfig linkedcss(String val) /*-{
		this.linkedcss = val;
		return this;
	}-*/;

}
