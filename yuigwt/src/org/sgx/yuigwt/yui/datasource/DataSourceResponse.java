package org.sgx.yuigwt.yui.datasource;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * DataSourceEvent.response() object
 * 
 * @author sg
 * 
 */
public class DataSourceResponse extends JavaScriptObject {
	protected DataSourceResponse() {
	}

	// results, meta

	/**
	 * <p>
	 * The jsarray of data.
	 * </p>
	 * 
	 * <p>
	 * In the case of YQL, just cast the return value to
	 * org.sgx.yuigwt.yui.yql.api.Result and start YQLing in java:
	 * </p>
	 * 
	 * <pre>
	 * JsArray&lt;JsObject&gt; results = e.response().results().cast();
	 * Result result = results.get(0).cast();
	 * </pre>
	 * 
	 * // console1.log("success2: "+JsUtil.dumpObj(e.response().meta())+ //
	 * " - "+JsUtil.dumpObj(results.get(0).objGetObj("error"), true));
	 * console1.log("success2: "+Y.dump(results.get(0))
	 * 
	 * @return
	 */
	public native final JavaScriptObject results() /*-{
		return this.results;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataSourceResponse results(JavaScriptObject val) /*-{
		this.results = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final JavaScriptObject meta() /*-{
		return this.meta;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataSourceResponse meta(JavaScriptObject val) /*-{
		this.meta = val;
		return this;
	}-*/;
}
