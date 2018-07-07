package org.sgx.yuigwt.yui.io;

import org.sgx.yuigwt.yui.event.EventTargetConfig;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sg
 *
 */
public class IOConfig extends EventTargetConfig {
protected IOConfig(){}
public static native final IOConfig create()/*-{
	return {"emitFacade": true}; 
}-*/;

public static final String EVENT_COMPLETE="complete", 
	EVENT_START="start", EVENT_SUCCESS="success", 
	EVENT_FAILURE="failure", EVENT_END="end"; 

/**
 * Defines the HTTP method for the transaction. If this property is undefined or omitted, the default value is GET.
 * @return
 */
public native final String method() /*-{
return this.method; 
}-*/;

/**
 * Defines the HTTP method for the transaction. If this property is undefined or omitted, the default value is GET.
 * @param val
 * @return this - for setter chaining
 */
public native final IOConfig method(String val) /*-{
this.method = val; 
return this; 
}-*/;

/**
 * Data to be sent with the transaction, defined as a string of key-value pairs(e.g., "foo=bar&baz=boo".) Data can also be defined as a single-level object(e.g., { 'foo':'bar', 'baz':'boo' }), which is then serialized into a key-value string. To use this capability, the sub-module querystring-stringify-simple, an optional dependency for io-base, must be declared in Y.use().
 * @return
 */
public native final String data() /*-{
return this.data; 
}-*/;

/**
 * Data to be sent with the transaction, defined as a string of key-value pairs(e.g., "foo=bar&baz=boo".) Data can also be defined as a single-level object(e.g., { 'foo':'bar', 'baz':'boo' }), which is then serialized into a key-value string. To use this capability, the sub-module querystring-stringify-simple, an optional dependency for io-base, must be declared in Y.use().
 * @param val
 * @return this - for setter chaining
 */
public native final IOConfig data(String val) /*-{
this.data = val; 
return this; 
}-*/;

/**
 * Specific HTTP headers and values to be sent with the transaction (e.g., { 'Content-Type': 'application/xml; charset=utf-8' } ).
 * @return
 */
public native final JavaScriptObject headers() /*-{
return this.headers; 
}-*/;

/**
 * Specific HTTP headers and values to be sent with the transaction (e.g., { 'Content-Type': 'application/xml; charset=utf-8' } ).
 * @param val
 * @return this - for setter chaining
 */
public native final IOConfig headers(JavaScriptObject val) /*-{
this.headers = val; 
return this; 
}-*/;

//FORM
public static class Form extends JsObject {
	protected Form(){}
	public static final native Form create()/*-{
		return {}; 
	}-*/;
	/**
	 * This property can be defined as the id(String) of an HTML form or an object reference of the HTML form.
	 * @return
	 */
	public native final String id() /*-{
	return this.id; 
	}-*/;
	
	/**
	 * This property can be defined as the id(String) of an HTML form or an object reference of the HTML form.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final IOConfig.Form id(String val) /*-{
	this.id = val; 
	return this; 
	}-*/;
	/**
	 * When set to true, disabled field values are included as part of the data. The default value is false.
	 * @return
	 */
	public native final boolean useDisabled() /*-{
	return this.useDisabled; 
	}-*/;
	
	/**
	 * When set to true, disabled field values are included as part of the data. The default value is false.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final IOConfig.Form useDisabled(boolean val) /*-{
	this.useDisabled = val; 
	return this; 
	}-*/;
}

/**
 * Defines the transport to be used for cross-domain requests (e.g., { use:'flash' } ). The transaction will use the specified transport instead of the default transport, when specified in the transaction's configuration object. 
 * @author sg
 *
 */
public static class XDR extends JsObject {
protected XDR(){}
/**
 * This property specifies the type of transport to be used; the io-xdr module provides 'native' and 'flash' transports.
 * @return
 */
public native final String use() /*-{
return this.use; 
}-*/;

/**
 * This property specifies the type of transport to be used; the io-xdr module provides 'native' and 'flash' transports.
 * @param val
 * @return this - for setter chaining
 */
public native final IOConfig.XDR use(String val) /*-{
this.use = val; 
return this; 
}-*/;
/**
 * When set to 'xml', io will return the response data as an XML document, if necessary.
 * @return
 */
public native final String datatype() /*-{
return this.datatype; 
}-*/;

/**
 * When set to 'xml', io will return the response data as an XML document, if necessary.
 * @param val
 * @return this - for setter chaining
 */
public native final IOConfig.XDR datatype(String val) /*-{
this.datatype = val; 
return this; 
}-*/;
}

/**
 * 
 * @return
 */
public native final boolean sync() /*-{
return this.sync; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final IOConfig sync(boolean val) /*-{
this.sync = val; 
return this; 
}-*/;
}
