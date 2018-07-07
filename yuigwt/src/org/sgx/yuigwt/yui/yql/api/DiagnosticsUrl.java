package org.sgx.yuigwt.yui.yql.api;

import com.google.gwt.core.client.JavaScriptObject;

public class DiagnosticsUrl extends JavaScriptObject {
	protected DiagnosticsUrl() {
	}

	/**
	 * 
	 * @return
	 */
	public native final String executionStartTime() /*-{
		return this["execution-start-time"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DiagnosticsUrl executionStartTime(String val) /*-{
		this["execution-start-time"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String executionStopTime() /*-{
		return this["execution-stop-time"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DiagnosticsUrl executionStopTime(String val) /*-{
		this["execution-stop-time"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String executionTime() /*-{
		return this["execution-time"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DiagnosticsUrl executionTime(String val) /*-{
		this["execution-time"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String proxy() /*-{
		return this.proxy;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DiagnosticsUrl proxy(String val) /*-{
		this.proxy = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String content() /*-{
		return this.content;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DiagnosticsUrl content(String val) /*-{
		this.content = val;
		return this;
	}-*/;

}
