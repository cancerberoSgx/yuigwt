package org.sgx.yuigwt.yuigallery.deferred;

import org.sgx.yuigwt.yui.event.EventFacade;

import com.google.gwt.core.client.JavaScriptObject;

public class IODeferredEvent extends EventFacade {
protected IODeferredEvent(){}
/**
 * The response data as a decoded string.
 * @return
 */
public native final String responseText() /*-{
return this.responseText; 
}-*/;


/**
 * The response data as an XML document
 * @return
 */
public native final JavaScriptObject responseXML() /*-{
return this.responseXML; 
}-*/;
}
