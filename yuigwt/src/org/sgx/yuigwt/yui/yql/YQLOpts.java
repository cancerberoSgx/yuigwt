package org.sgx.yuigwt.yui.yql;

import org.sgx.yuigwt.yui.util.JsObject;
/**
 * 
 * @author sg
 *
 */
public class YQLOpts extends JsObject {
	protected YQLOpts() {
	}

	public static final native YQLOpts create()/*-{
		return {};
	}-*/;

	/**
	 * http|https
	 * 
	 * @return
	 */
	public native final String proto() /*-{
		return this.proto;
	}-*/;

	/**
	 * http|https
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YQLOpts proto(String val) /*-{
		this.proto = val;
		return this;
	}-*/;

	/**
	 * base url
	 * 
	 * @return
	 */
	public native final String base() /*-{
		return this.base;
	}-*/;

	/**
	 * base url
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YQLOpts base(String val) /*-{
		this.base = val;
		return this;
	}-*/;
}
