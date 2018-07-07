package org.sgx.yuigwt.yui.yql.api;

import com.google.gwt.core.client.JavaScriptObject;

public class DiagnosticsCache extends JavaScriptObject{
protected DiagnosticsCache(){}

/**
 * 
 * @return
 */
public native final String executionStartTime() /*-{
return this["execution-start-time"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DiagnosticsCache executionStartTime(String val) /*-{
this["execution-start-time"] = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final String executionStopTime() /*-{
return this["execution-stop-time"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DiagnosticsCache executionStopTime(String val) /*-{
this["execution-stop-time"] = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String executionTime() /*-{
return this["execution-time"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DiagnosticsCache executionTime(String val) /*-{
this["execution-time"] = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String method() /*-{
return this.method; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DiagnosticsCache method(String val) /*-{
this.method = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String type() /*-{
return this.type; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DiagnosticsCache type(String val) /*-{
this.type = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String content() /*-{
return this.content; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DiagnosticsCache content(String val) /*-{
this.content = val; 
return this; 
}-*/;
}
