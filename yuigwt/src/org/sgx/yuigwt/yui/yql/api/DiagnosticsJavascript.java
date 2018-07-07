package org.sgx.yuigwt.yui.yql.api;

import com.google.gwt.core.client.JavaScriptObject;

public class DiagnosticsJavascript extends JavaScriptObject {
	protected DiagnosticsJavascript() {
	}

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
	public native final DiagnosticsJavascript executionTime(String val) /*-{
		this["execution-time"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String instructionsUsed() /*-{
		return this["instructions-used"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DiagnosticsJavascript instructionsUsed(String val) /*-{
		this["instructions-used"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String tableName() /*-{
		return this["table-name"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DiagnosticsJavascript tableName(String val) /*-{
		this["table-name"] = val;
		return this;
	}-*/;
}
