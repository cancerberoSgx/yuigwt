package org.sgx.yuigwt.yui.cache;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;
/**
 * 
 * @author sg
 *
 */
public class CacheEntry extends JavaScriptObject {
protected CacheEntry(){}
/**
 * the cache key
 * @return
 */
public native final String request() /*-{
return this.request; 
}-*/;


/**
 * the cached value
 * @return
 */
public native final String responseString() /*-{
return this.response+""; 
}-*/;
/**
 * the cached value
 * @return
 */
public native final double responseDouble() /*-{
return this.response; 
}-*/;
/**
 * the cached value
 * @return
 */
public native final boolean responseBoolean() /*-{
return this.response; 
}-*/;
/**
 * the cached value
 * @return
 */
public native final JavaScriptObject responseObj() /*-{
return this.response; 
}-*/;

/**
 * 
 * @return
 */
public native final JsDate cached() /*-{
return this.cached; 
}-*/;
/**
 * 
 * @return
 */
public native final JsDate expires() /*-{
return this.expires; 
}-*/;
}
