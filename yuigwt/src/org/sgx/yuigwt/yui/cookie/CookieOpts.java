package org.sgx.yuigwt.yui.cookie;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;
/**
 * overlay the parameter opts in Y.Cookie.get(name, opts) and Y.Cookie.set() <br/><br/>
 * 
 * for get(): 
 * An object containing one or more cookie options: raw (true/false) and converter (a function). The converter function is run on the value before returning it. The function is not used if the cookie doesn't exist. The function can be passed instead of the options object for backwards compatibility. When raw is set to true, the cookie value is not URI decoded.
 * <br/><br/>
 * for set():  
 * An object containing one or more cookie options: path (a string), domain (a string), expires (a DataTypeDate object), secure (true/false), and raw (true/false). Setting raw to true indicates that the cookie should not be URI encoded before being set.
 * 
 * 
 * @author sg
 *
 */
public class CookieOpts extends JavaScriptObject{
protected CookieOpts(){}
/**
 * if is set to true, the cookie value is not URI decoded.
 * @return
 */
public native final boolean raw() /*-{
return this.raw; 
}-*/;

/**
 * if is set to true, the cookie value is not URI decoded.
 * @param val
 * @return this - for setter chaining
 */
public native final CookieOpts raw(boolean val) /*-{
this.raw = val; 
return this; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CookieOpts converter(CookieConverter<?> c) /*-{
	var f = $entry(function(){
		$wnd.alert(arguments.length); 
		return c.@org.sgx.yuigwt.yui.cookie.CookieConverter::convert(*)();
	}); 
	this.converter = f; 
	return this; 
}-*/;


//properties fo Y.Cookie.set() only : An object containing one or more cookie options: path (a string), domain (a string), expires (a DataTypeDate object), secure (true/false), and raw (true/false). Setting raw to true indicates that the cookie should not be URI encoded before being set.

/**
 * 
 * @return
 */
public native final String path() /*-{
return this.path; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CookieOpts path(String val) /*-{
this.path = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String domain() /*-{
return this.domain; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CookieOpts domain(String val) /*-{
this.domain = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final JsDate expires() /*-{
return this.expires; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CookieOpts expires(JsDate val) /*-{
this.expires = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final boolean secure() /*-{
return this.secure; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CookieOpts secure(boolean val) /*-{
this.secure = val; 
return this; 
}-*/;
}
