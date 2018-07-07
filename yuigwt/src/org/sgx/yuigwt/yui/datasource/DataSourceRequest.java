package org.sgx.yuigwt.yui.datasource;

import org.sgx.yuigwt.yui.event.EventTargetConfig;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @see http://yuilibrary.com/yui/docs/api/classes/DataSource.Local.html#method_sendRequest
 * 
 * @author sg
 *
 */
public class DataSourceRequest extends EventTargetConfig {
protected DataSourceRequest(){}; 
public static native final DataSourceRequest create()/*-{
	return {}; 
}-*/;

/**
 * 
 * @return
 */
public native final String request() /*-{
return this.request; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceRequest request(String val) /*-{
this.request = val; 
return this; 
}-*/;
/**The request to send to the live data source, if any.
 * 
 * @return
 */
public native final JavaScriptObject requestObj() /*-{
return this.request; 
}-*/;

/**
 * The request to send to the live data source, if any.
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceRequest request(JavaScriptObject val) /*-{
this.request = val; 
return this; 
}-*/;

/**
 * Configuration object, if any.
 * @return
 */
public native final DataSourceConfig cfg() /*-{
return this.cfg; 
}-*/;

/**
 * Configuration object, if any.
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceRequest cfg(DataSourceConfig val) /*-{
this.cfg = val; 
return this; 
}-*/;

public static interface DataSourceEventCallback {
	void call(DataSourceEvent e); 
}
/**
 * 
 * @param type one of success or failure
 * @param c
 * @return
 */
public native final DataSourceRequest callback(String type, DataSourceEventCallback c) /*-{
var f = $entry(function(e){
	return c.@org.sgx.yuigwt.yui.datasource.DataSourceRequest.DataSourceEventCallback::call(Lorg/sgx/yuigwt/yui/datasource/DataSourceEvent;)(e); 
});
if(!this.callback)
	this.callback={}; 
this.callback[type]=f; 
//this[type]=f; 
//return this;  
}-*/;

/**
 * 
 * @param c
 * @return
 */
public native final DataSourceRequest callback(DataSourceCallback c) /*-{
var successFn = $entry(function(e){
	return c.@org.sgx.yuigwt.yui.datasource.DataSourceCallback::success(Lorg/sgx/yuigwt/yui/datasource/DataSourceEvent;)(e); 
});
var failureFn = $entry(function(e){
	return c.@org.sgx.yuigwt.yui.datasource.DataSourceCallback::failure(Lorg/sgx/yuigwt/yui/datasource/DataSourceEvent;)(e); 
});
var args = c.@org.sgx.yuigwt.yui.datasource.DataSourceCallback::argument();  
this.callback = {
	"success": successFn, 
	"failure": failureFn,
	"argument": args
}; 
//this["success"]=successFn;
//this["failure"]=failure;
//this["argument"]=argument;    
return this; 
}-*/;
}
