package org.sgx.yuigwt.yui.dataschema;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
/**
 * object defining schema, like schema = {
            // Or simply: ["make", "model", "year"]
            resultFields: [{key:"make"}, {key:"model"}, {key:"year"}]
        }
        
 * @see http://yuilibrary.com/yui/docs/api/classes/DataSchema.JSON.html
 * @see http://yuilibrary.com/yui/docs/api/classes/DataSchema.Base.html
 * 
 * @author sg
 *
 */
public class Schema extends JavaScriptObject {
protected Schema(){}
public static final native Schema create()/*-{
	return {}; 
}-*/;

/**
 * Field identifiers to locate/assign values in the response records
 * @return
 */
public native final JsArray<Field> resultFields() /*-{
return this.resultFields; 
}-*/;

/**
 * Field identifiers to locate/assign values in the response records
 * @param val
 * @return this - for setter chaining
 */
public native final Schema resultFields(JsArray<Field> val) /*-{
this.resultFields = val; 
return this; 
}-*/;
/**
 * Field identifiers to locate/assign values in the response records
 * @param val
 * @return this - for setter chaining
 */
public native final Schema resultFields(Field[] val) /*-{
this.resultFields = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;

/**
 * Path locators to extract extra non-record related information from the data object.
 * @return
 */
public native final JsArray<Field> metaFields() /*-{
return this.metaFields; 
}-*/;

/**
 * Path locators to extract extra non-record related information from the data object.
 * @param val
 * @return this - for setter chaining
 */
public native final Schema metaFields(JsArray<Field> val) /*-{
this.metaFields = val; 
return this; 
}-*/;
/**
 * Path locators to extract extra non-record related information from the data object.
 * @param val
 * @return this - for setter chaining
 */
public native final Schema metaFields(Field[] val) /*-{
this.metaFields = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;


/**
 * Locator to an internal array of tabular data.
 * @return
 */
public native final String resultListLocator() /*-{
return this.resultListLocator; 
}-*/;

/**
 * Locator to an internal array of tabular data.
 * @param val
 * @return this - for setter chaining
 */
public native final Schema resultListLocator(String val) /*-{
this.resultListLocator = val; 
return this; 
}-*/;
}
