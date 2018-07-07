package org.sgx.yuigwt.yui.io;

import org.sgx.yuigwt.yui.event.EventFacade;
import com.google.gwt.core.client.JavaScriptObject;

public class IOEvent extends EventFacade {
protected IOEvent(){}

/**
 * the transaction id.
 * @return
 */
public native final String id() /*-{
return this.id; 
}-*/;

/**
 * the transaction id.
 * @param val
 * @return this - for setter chaining
 */
public native final IOEvent id(String val) /*-{
this.id = val; 
return this; 
}-*/;

/**
 * the configuration object used for this transaction.
 * @return
 */
public native final IOConfig cfg() /*-{
return this.cfg; 
}-*/;

/**
 * the configuration object used for this transaction.
 * @param val
 * @return this - for setter chaining
 */
public native final IOEvent cfg(IOConfig val) /*-{
this.cfg = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final JavaScriptObject attributeName() /*-{
return this.attributeName; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final IOEvent attributeName(JavaScriptObject val) /*-{
this.attributeName = val; 
return this; 
}-*/;

/**
 * the user-defined arguments, if any.
 * @return
 */
public native final JavaScriptObject arguments() /*-{
return this.arguments; 
}-*/;

/**
 * the user-defined arguments, if any.
 * @param val
 * @return this - for setter chaining
 */
public native final IOEvent arguments(JavaScriptObject val) /*-{
this.arguments = val; 
return this; 
}-*/;

/**
 * the XMLHttpRequest (or other transport) object.
 * @return
 */
public native final Request data() /*-{
return this.data; 
}-*/;

}
