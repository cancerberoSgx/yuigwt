package org.sgx.yuigwt.yui.io;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * This overlays the ioEvent.data() object.- When a transaction, using the XHR object as a transport, is complete, the response data are passed as an object to the event handler.
 * 
 * <br/>
 * NOTE: Transactions involving file upload or cross-domain requests, using alternate transports, will only populate the responseText or responseXML field. The HTTP status and response headers are either inaccessible or unavailable to these alternate transports.  
 * @author sg
 *
 */
public class Request extends JavaScriptObject {
protected Request(){}
/**
 * The HTTP status code of the transaction.
 * @return
 */
public native final int status() /*-{
return this.status; 
}-*/;


/**
 * The HTTP status message.
 * @return
 */
public native final String statusText() /*-{
return this.statusText; 
}-*/;


/**
 * Returns the string value of the specified header label
 * @param header
 * @return
 */
public native final String getResponseHeader(String header) /*-{
return this.getResponseHeader(header); 
}-*/;
/**
 * All response HTTP headers are available as a string. Each key-value pair is delimited by "\n".
 * @return
 */
public native final String getAllResponseHeaders() /*-{
return this.getAllResponseHeaders(); 
}-*/;

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
