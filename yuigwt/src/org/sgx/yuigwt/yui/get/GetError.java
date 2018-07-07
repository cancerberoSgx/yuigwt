package org.sgx.yuigwt.yui.get;

import com.google.gwt.core.client.JavaScriptObject;

public class GetError extends JavaScriptObject {
	protected GetError(){}
/**
 * 
 * @return
 */
public native final String error() /*-{
return this.error; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetError error(String val) /*-{
this.error = val; 
return this; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetRequest request() /*-{
return this.request; 
}-*/;
}
