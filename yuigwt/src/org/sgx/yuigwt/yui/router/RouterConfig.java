package org.sgx.yuigwt.yui.router;

import org.sgx.yuigwt.yui.base.BaseConfig;
import org.sgx.yuigwt.yui.resize.ResizeConfig;

import com.google.gwt.core.client.JsArray;

/**
 * 
 * @see http://yuilibrary.com/yui/docs/router/#to-dispatch-or-not-to-dispatch
 * @see http://yuilibrary.com/yui/docs/api/classes/Router.html
 * @author sg
 * 
 */
public class RouterConfig extends BaseConfig {
	protected RouterConfig() {
	}

	public static final native RouterConfig create()/*-{
		return {};
	}-*/;
	
	/**
	 * Overrides the default capability detection and forces this router to use (true) or not use (false) HTML5 history.
	 * 
	 * @return
	 */
	public native final boolean html5() /*-{
		return this.html5;
	}-*/;

	/**
	 * Overrides the default capability detection and forces this router to use (true) or not use (false) HTML5 history.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final RouterConfig html5(boolean val) /*-{
		this.html5 = val;
		return this;
	}-*/;

	/**
	 * Root path from which all routes should be evaluated.
	 * 
	 * @return
	 */
	public native final String root() /*-{
		return this.root;
	}-*/;

	/**
	 * Root path from which all routes should be evaluated.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final RouterConfig root(String val) /*-{
		this.root = val;
		return this;
	}-*/;

	/**
	 * Array of route definition objects.
	 * 
	 * @return
	 */
	public native final JsArray routes() /*-{
		return this.routes;
	}-*/;

	/**
	 * Array of route definition objects.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final RouterConfig routes(JsArray<Route> val) /*-{
		this.routes = val;
		return this;
	}-*/;
	
	/**
	 * Array of route definition objects.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final RouterConfig routes(Route... val) /*-{
		this.routes = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val);
		return this;
	}-*/;
}
