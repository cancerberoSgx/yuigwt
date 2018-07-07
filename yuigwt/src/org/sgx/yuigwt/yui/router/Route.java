package org.sgx.yuigwt.yui.router;

import org.sgx.yuigwt.yui.util.JsFunction;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * Route objects
 * 
 * @author sg
 * 
 */
public class Route extends JavaScriptObject {
	protected Route() {
	}
	
	public static final native Route create()/*-{
		return {};
	}-*/;
	

	/**
	 * A function or a string representing the name of a function this router that should be executed when the route is triggered.
	 * 
	 * @return
	 */
	public native final JsFunction callback() /*-{
		return this.callback;
	}-*/;

	/**
	 * artificial method for java. Since in yuigwt Y.Router callback is always a function
	 * this methods facilitates calling its callback. 
	 */
	public native final void save()/*-{
		this.callback(); 
	}-*/;

	
	/**
	 * A function or a string representing the name of a function this router that should be executed when the route is triggered.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Route callback(JavaScriptObject val) /*-{
		this.callback = val;
		return this;
	}-*/;
	/**
	 * A function or a string representing the name of a function this router that should be executed when the route is triggered.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Route callback(RouteCallback val) /*-{
		var f = $entry(function(req, res, next){
//			var f2 = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/SimpleCallback;)(next); 
			return val.@org.sgx.yuigwt.yui.router.RouteCallback::call(Lorg/sgx/yuigwt/yui/router/RouteRequest;Lorg/sgx/yuigwt/yui/router/RouteResponse;Lorg/sgx/yuigwt/yui/util/SimpleCallback;)(req, res, null); 
		}); 
		this.callback = f;
		return this;
	}-*/;
	

	/**
	 * 
	 * @return
	 */
	public native final JsArrayString keys() /*-{
		return this.keys;
	}-*/;

	/**
	 * An array of strings representing the named parameters defined in the route's path specification, if any.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Route keys(JsArrayString val) /*-{
		this.keys = val;
		return this;
	}-*/;

	/**
	 * An array of strings representing the named parameters defined in the route's path specification, if any.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Route keys(String[] val) /*-{
		this.keys = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(val);
		return this;
	}-*/;

	/**
	 * the route's path specification, which may be either a string or a regex.
	 * 
	 * @return
	 */
	public native final String path() /*-{
		return this.path;
	}-*/;

	/**
	 * the route's path specification, which may be either a string or a regex.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Route path(String val) /*-{
		this.path = val;
		return this;
	}-*/;

	/**
	 * A regular expression version of the route's path specification. This regex is used to determine whether the route matches a given path.
	 * 
	 * @return
	 */
	public native final JavaScriptObject regex() /*-{
		return this.regex;
	}-*/;

	/**
	 * A regular expression version of the route's path specification. This regex is used to determine whether the route matches a given path.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Route regex(JavaScriptObject val) /*-{
		this.regex = val;
		return this;
	}-*/;

	
}
