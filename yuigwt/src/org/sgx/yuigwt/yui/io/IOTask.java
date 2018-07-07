package org.sgx.yuigwt.yui.io;

import com.google.gwt.core.client.JavaScriptObject;

public class IOTask extends JavaScriptObject {
protected IOTask(){}
/**
 * 
 * @return
 */
public native final String uri() /*-{
return this.uri; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final IOTask uri(String val) /*-{
this.uri = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final IOConfig cfg() /*-{
return this.cfg; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final IOTask cfg(IOConfig val) /*-{
this.cfg = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String id() /*-{
return this.id; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final IOTask id(String val) /*-{
this.id = val; 
return this; 
}-*/;
}
