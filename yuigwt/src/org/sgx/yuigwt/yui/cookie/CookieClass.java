package org.sgx.yuigwt.yui.cookie;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * The Cookie utility. All cookie methods are static so they go here. 
 * @see http://yuilibrary.com/yui/docs/api/classes/Cookie.html
 * @see http://yuilibrary.com/yui/docs/cookie/cookie-simple-example.html
 * @author sg
 *
 */
public class CookieClass extends JavaScriptObject {
protected CookieClass(){}
/**
 * Determines if the cookie with the given name exists. This is useful for Boolean cookies (those that do not follow the name=value convention).
 * @param name The name of the cookie to check.
 * @return True if the cookie exists, false if not. 
 */
public native final boolean exists(String name)/*-{
	return this.exists(name); 
}-*/;

/**
 * Returns the cookie value for the given name.
 * @param name
 * @return
 */
public native final String getString(String name)/*-{
return this.get(name)+""; 
}-*/;
/**
 * Returns the cookie value for the given name.
 * @param name
 * @return
 */
public native final String getString(String name, CookieOpts c)/*-{
return this.get(name, c)+""; 
}-*/;
/**
 * Returns the cookie value for the given name.
 * @param name
 * @return
 */
public native final JavaScriptObject getObj(String name, CookieOpts c)/*-{
	return this.get(name, c); 
}-*/;
/**
 * Sets a cookie with a given name and value.
 * @param name The name of the cookie to set.
 * @param value The value to set for the cookie.
 * @return The created cookie string. 
 */
public native final String set(String name, String value) /*-{
	return this.set(name, value); 
}-*/;
/**
 * Sets a cookie with a given name and value.
 * @param name The name of the cookie to set.
 * @param value The value to set for the cookie.
 * @param opts (Optional) An object containing one or more cookie options: path (a string), domain (a string), expires (a DataTypeDate object), secure (true/false), and raw (true/false). Setting raw to true indicates that the cookie should not be URI encoded before being set.
 * @return The created cookie string. 
 */
public native final String set(String name, String value, CookieOpts opts) /*-{
	return this.set(name, value, opts); 
}-*/;



}
