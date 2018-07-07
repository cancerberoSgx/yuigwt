package org.sgx.yuigwt.yui.asyncqueue;

import org.sgx.yuigwt.yui.event.EventFacade;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
/**
 * @see http://yuilibrary.com/yui/docs/async-queue/#events
 * @author sg
 *
 */
public class AsyncQueueEvent extends EventFacade {
protected AsyncQueueEvent(){}

/**
 * "promote", "remove", "execute", "shift" 
 * @return
 */
public native final JavaScriptObject callback() /*-{
return this.callback; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final AsyncQueueEvent callback(JavaScriptObject val) /*-{
this.callback = val; 
return this; 
}-*/;

/**
 *  "add" event - 
 * @return
 */
public native final JsArray<JavaScriptObject> callbacks() /*-{
return this.callbacks; 
}-*/;

/**
 * "add" event - 
 * @param val
 * @return this - for setter chaining
 */
public native final AsyncQueueEvent callbacks(JsArray<JavaScriptObject> val) /*-{
this.callbacks = val; 
return this; 
}-*/;
}
