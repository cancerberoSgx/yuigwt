package org.sgx.yuigwt.yui.handlebars;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sg
 *
 */
public class CompilerOptions extends JsObject {
	protected CompilerOptions() {
	}

	public static native final CompilerOptions create()/*-{
		return {};
	}-*/;

	/**
	 * Helper functions.
	 * 
	 * @return
	 */
	public native final JavaScriptObject helpers() /*-{
		return this.helpers;
	}-*/;

	/**
	 * Helper functions.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CompilerOptions helpers(JavaScriptObject val) /*-{
		this.helpers = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final JavaScriptObject partials() /*-{
		return this.partials;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CompilerOptions partials(JavaScriptObject val) /*-{
		this.partials = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final JavaScriptObject data() /*-{
		return this.data;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CompilerOptions data(JavaScriptObject val) /*-{
		this.data = val;
		return this;
	}-*/;
}
