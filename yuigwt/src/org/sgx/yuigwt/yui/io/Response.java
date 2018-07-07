package org.sgx.yuigwt.yui.io;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * response object returned by io.send()
 * @author sg
 *
 */
public class Response extends JavaScriptObject {
protected Response(){}
/**
 * the transaction id
 * @return
 */
public native final String id() /*-{
return this.id; 
}-*/;

/**
 * the transaction id
 * @param val
 * @return this - for setter chaining
 */
public native final Response id(String val) /*-{
this.id = val; 
return this; 
}-*/;

//TODO: Abort: documentation unknown

/**
 * 
 * @return
 */
public native final boolean isInProgress() /*-{
return this.isInProgress; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Response isInProgress(boolean val) /*-{
this.isInProgress = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final IO io() /*-{
return this.io; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Response io(IO val) /*-{
this.io = val; 
return this; 
}-*/;
}
