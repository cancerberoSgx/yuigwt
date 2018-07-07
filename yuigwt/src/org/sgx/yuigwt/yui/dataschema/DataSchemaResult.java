package org.sgx.yuigwt.yui.dataschema;

import org.sgx.yuigwt.yui.util.JsError;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class DataSchemaResult extends JavaScriptObject {
protected DataSchemaResult(){}
/**
 * 
 * @return self for method chaining
 */
public native final JsArray<? extends JavaScriptObject> results() /*-{
return this.results;
}-*/;
public native final JavaScriptObject meta() /*-{
return this.meta;
}-*/;

public native final JsError error() /*-{
return this.error;
}-*/;
}
