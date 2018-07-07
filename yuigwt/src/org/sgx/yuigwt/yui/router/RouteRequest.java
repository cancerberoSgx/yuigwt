package org.sgx.yuigwt.yui.router;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * this is the overlay type for Request object passed to the callback of Router:route(path, callback)
 * 
 * @author sg
 * 
 */
public class RouteRequest extends JsObject {
	protected RouteRequest() {
	}

	/**
	 * Captured parameters matched by the route path specification. If a string path was used and contained named parameters, then this will be a key/value hash mapping parameter
	 * names to their matched values. If a regex path was used, this will be an array of subpattern matches starting at index 0 for the full match, then 1 for the first subpattern
	 * match, and so on.
	 * 
	 * @return
	 */
	public native final JsObject params() /*-{
		return this.params;
	}-*/;

	/**
	 * Captured parameters matched by the route path specification. If a string path was used and contained named parameters, then this will be a key/value hash mapping parameter
	 * names to their matched values. If a regex path was used, this will be an array of subpattern matches starting at index 0 for the full match, then 1 for the first subpattern
	 * match, and so on.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final RouteRequest params(JavaScriptObject val) /*-{
		this.params = val;
		return this;
	}-*/;

	/**
	 * The current URL path.
	 * 
	 * @return
	 */
	public native final String path() /*-{
		return this.path;
	}-*/;

	/**
	 * The current URL path.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final RouteRequest path(String val) /*-{
		this.path = val;
		return this;
	}-*/;

	/**
	 * DataTypeNumber of matching routes after this one in the dispatch chain.
	 * 
	 * @return
	 */
	public native final int pendingRoutes() /*-{
		return this.pendingRoutes;
	}-*/;

	/**
	 * DataTypeNumber of matching routes after this one in the dispatch chain.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final RouteRequest pendingRoutes(int val) /*-{
		this.pendingRoutes = val;
		return this;
	}-*/;

	/**
	 * Query hash representing the URL query string, if any. Parameter names are keys, and are mapped to parameter values.
	 * 
	 * @return
	 */
	public native final JavaScriptObject query() /*-{
		return this.query;
	}-*/;

	/**
	 * Query hash representing the URL query string, if any. Parameter names are keys, and are mapped to parameter values.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final RouteRequest query(JavaScriptObject val) /*-{
		this.query = val;
		return this;
	}-*/;

	/**
	 * The full URL.
	 * 
	 * @return
	 */
	public native final String url() /*-{
		return this.url;
	}-*/;

	/**
	 * The full URL.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final RouteRequest url(String val) /*-{
		this.url = val;
		return this;
	}-*/;

	/**
	 * What initiated the dispatch. In an HTML5 browser, when the back/forward buttons are used, this property will have a value of "popstate".
	 * 
	 * @return
	 */
	public native final String src() /*-{
		return this.src;
	}-*/;

	/**
	 * What initiated the dispatch. In an HTML5 browser, when the back/forward buttons are used, this property will have a value of "popstate".
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final RouteRequest src(String val) /*-{
		this.src = val;
		return this;
	}-*/;
}
