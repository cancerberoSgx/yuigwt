package org.sgx.yuigwt.yui.yql.api;

import com.google.gwt.core.client.JavaScriptObject;

public class DiagnosticsQuery extends JavaScriptObject {
	protected DiagnosticsQuery() {
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
	public native final DiagnosticsCache executionStartTime(String val) /*-{
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
	public native final DiagnosticsCache executionStopTime(String val) /*-{
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
	public native final DiagnosticsCache executionTime(String val) /*-{
		this["execution-time"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String params() /*-{
		return this.params;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DiagnosticsQuery params(String val) /*-{
		this.params = val;
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
	public native final DiagnosticsQuery content(String val) /*-{
		this.content = val;
		return this;
	}-*/;

}
