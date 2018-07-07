package org.sgx.yuigwt.yui.dataschema;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
/**
 * static properties and methods of all DataSchema impls
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/DataSchema.JSON.html
 * @see http://yuilibrary.com/yui/docs/api/classes/DataSchema.Base.html
 * 
 * @author sg
 *
 */
public class DataSchemaClass extends JavaScriptObject {
protected DataSchemaClass(){}

//BASE

/**
 * Overridable method returns data as-is.
 * @param schema Schema to apply
 * @param data Data
 * @return Schema-parsed data. 
 */
public native final DataSchemaResult apply(JavaScriptObject schema, JavaScriptObject data)/*-{
	return this.apply(schema, data); 
}-*/;
/**
 * Overridable method returns data as-is.
 * @param schema Schema to apply
 * @param data Data
 * @return Schema-parsed data. 
 */
public native final DataSchemaResult apply(JavaScriptObject schema, String data)/*-{
	return this.apply(schema, data); 
}-*/;


//JSON
/**
 * Utility function to walk a path and return the value located there.
 * @param path
 * @param data
 * @return
 */
public native final JavaScriptObject getLocationValue(JsArrayString path, String data)/*-{
return this.getLocationValue(path, data); 
}-*/; 
/**
 * Utility function converts JSON locator strings into walkable paths
 * @param locator JSON value locator.
 * @return Walkable path to data value. 
 */
public native final JsArrayString getPath(String locator)/*-{
return this.getPath(locator); 
}-*/; 
}
