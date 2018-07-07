package org.sgx.yuigwt.yui.yql.api;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JsArray;

public class Diagnostics extends JsObject {
	protected Diagnostics() {
	}

	/**
	 * true|false
	 * 
	 * @return
	 */
	public native final String publiclyCallable() /*-{
		return this.publiclyCallable;
	}-*/;

	/**
	 * true|false
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Diagnostics publiclyCallable(String val) /*-{
		this.publiclyCallable = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String userTime() /*-{
		return this["user-time"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Diagnostics userTime(String val) /*-{
		this["user-time"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String serviceTime() /*-{
		return this["service-time"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Diagnostics serviceTime(String val) /*-{
		this["service-time"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String buildVersion() /*-{
		return this["build-version"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Diagnostics buildVersion(String val) /*-{
		this["build-version"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final JsArray<DiagnosticsUrl> url() /*-{
		return this.url || null;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Diagnostics url(JsArray<DiagnosticsUrl> val) /*-{
		this.url = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final JsArray<DiagnosticsCache> cache() /*-{
		return this.cache || null;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Diagnostics cache(JsArray<DiagnosticsCache> val) /*-{
		this.cache = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String log() /*-{
		return this.log;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Diagnostics log(String val) /*-{
		this.log = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final DiagnosticsQuery query() /*-{
		return this.query;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Diagnostics query(DiagnosticsQuery val) /*-{
		this.query = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final DiagnosticsJavascript javascript() /*-{
		return this.javascript;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Diagnostics javascript(DiagnosticsJavascript val) /*-{
		this.javascript = val;
		return this;
	}-*/;

}
