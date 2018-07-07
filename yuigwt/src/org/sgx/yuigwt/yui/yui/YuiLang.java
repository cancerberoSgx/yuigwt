package org.sgx.yuigwt.yui.yui;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * overlay for Y.Lang
 * @see http://yuilibrary.com/yui/docs/yui/lang.html
 * @author sg
 *
 */
public class YuiLang extends JavaScriptObject {
protected YuiLang(){}
/**
 * Determines whether or not the provided item is an array. Returns false for array-like collections such as the function arguments collection or HTMLElement collections. Use Y.Array.test() if you want to test for an array-like collection.
 * @param o The object to test. 
 * @return
 */
public native final boolean isArray(JavaScriptObject o)/*-{
	return this.isArray(o); 
}-*/;
/**
 * Determines whether or not the provided item is a boolean.
 * @param o The object to test.
 * @return
 */
public native final boolean isBoolean(JavaScriptObject o)/*-{
return this.isBoolean(o); 
}-*/;
/**
 * Determines whether or not the supplied item is a date instance.
 * @param o The object to test.
 * @return
 */
public native final boolean isDate(JavaScriptObject o)/*-{
return this.isDate(o); 
}-*/;
/**
 * Determines whether or not the provided item is a function. Note: Internet Explorer thinks certain functions are objects:
<pre>
var obj = document.createElement("object");
Y.Lang.isFunction(obj.getAttribute) // reports false in IE

var input = document.createElement("input"); // append to body
Y.Lang.isFunction(input.focus) // reports false in IE
</pre>
You will have to implement additional tests if these functions matter to you.

 * @param o The object to test.
 * @return
 */
public native final boolean isFunction(JavaScriptObject o)/*-{
return this.isFunction(o); 
}-*/;
/**
 * Determines whether or not the provided item is null.
 * @param o The object to test.
 * @return
 */
public native final boolean isNull(JavaScriptObject o)/*-{
return this.isNull(o); 
}-*/;
/**
 * Determines whether or not the provided item is a legal number.
 * @param o The object to test.
 * @return
 */
public native final boolean isNumber(JavaScriptObject o)/*-{
return this.isNumber(o); 
}-*/;
/**
 * Determines whether or not the provided item is of type object or function. Note that arrays are also objects, so Y.Lang.isObject([]) === true.
 * @param o The object to test.
 * @param failfn fail if the input is a function.
 * @return
 */
public native final boolean isObject(JavaScriptObject o, boolean failfn)/*-{
return this.isObject(o, failfn); 
}-*/;
/**
 * Determines whether or not the provided item is of type object or function. Note that arrays are also objects, so Y.Lang.isObject([]) === true.
 * @param o The object to test.
 * @return
 */
public native final boolean isObject(JavaScriptObject o)/*-{
return this.isObject(o); 
}-*/;
/**
 * Determines whether or not the provided item is a string.
 * @param o
 * @return
 */
public native final boolean isString(JavaScriptObject o)/*-{
return this.isString(o); 
}-*/;
/**
 * Determines whether or not the provided item is undefined.
 * @param o
 * @return
 */
public native final boolean isUndefined(JavaScriptObject o)/*-{
return this.isUndefined(o); 
}-*/;
/**
 * A convenience method for detecting a legitimate non-null value. Returns false for null/undefined/NaN, true for other values, including 0/false/''
 * @param o
 * @return
 */
public native final boolean isValue(JavaScriptObject o)/*-{
return this.isValue(o); 
}-*/;
/**
 * Returns the current time in milliseconds.
 * @return
 */
public native final int now()/*-{
	return this.now();
}-*/;
/**
 * Lightweight version of Y.substitute. Uses the same template structure as Y.substitute, but doesn't support recursion, auto-object coersion, or formats.
 * @param s
 * @param o
 * @return
 */
public native final String sub(String s, JavaScriptObject o)/*-{
return this.sub(s, o);
}-*/;
/**
 * Returns a string without any leading or trailing whitespace. If the input is not a string, the input will be returned untouched.
 * @param s the string to trim.
 * @return the trimmed string
 */
public native final String trim(String s)/*-{
return this.trim(s);
}-*/;
/**
 * Returns a string without any leading whitespace.
 * @param s the string to trim.
 * @return the trimmed string
 */
public native final String trimLeft(String s)/*-{
return this.trimLeft(s);
}-*/;
/**
 * Returns a string without any trailing whitespace.
 * @param s the string to trim.
 * @return the trimmed string
 */
public native final String trimRight(String s)/*-{
return this.trimRight(s);
}-*/;
/**
 * Returns one of the following strings, representing the type of the item passed in:  "array",   "boolean",    "date",    "error",    "function",    "null",    "number",    "object",    "regexp",    "string",    "undefined"
 * <br/><br/>
 * Known issues:   typeof HTMLElementCollection returns function in Safari, but Y.Lang.type() reports "object", which could be a good thing -- but it actually caused the logic in Y.Lang.isObject to fail.
 * @param o the item to test.
 * @return the detected type. 
 */
public native final String type(JavaScriptObject o)/*-{
return this.type(o);
}-*/;
/**
 * Returns one of the following strings, representing the type of the item passed in:  "array",   "boolean",    "date",    "error",    "function",    "null",    "number",    "object",    "regexp",    "string",    "undefined"
 * <br/><br/>
 * Known issues:   typeof HTMLElementCollection returns function in Safari, but Y.Lang.type() reports "object", which could be a good thing -- but it actually caused the logic in Y.Lang.isObject to fail.
 * @param o the item to test.
 * @return the detected type. 
 */
public native final String type(Object o)/*-{
return this.type(o);
}-*/;



    
}
