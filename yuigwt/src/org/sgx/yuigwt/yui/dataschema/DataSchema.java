package org.sgx.yuigwt.yui.dataschema;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * YUI DataSchema Utility. This class overlay all DataSchema concrete YUI classes.
 * 
 * The DataSchema Utility applies a given schema against data of arbitrary formats, normalizing input such as JSON, XML, or delimited text into a JavaScript object with known properties. The value of the DataSchema Utility is in its ability to translate data from a variety of sources into a consistent format for consumption by components in a predictable manner. 
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/DataSchema.JSON.html
 * @see http://yuilibrary.com/yui/docs/api/classes/DataSchema.Base.html
 * @author sg
 *
 */
public class DataSchema extends JavaScriptObject {
protected DataSchema(){}
/**
 * Applies field parser, if defined
 * @param value Original value.
 * @param field Field
 * @return Type-converted value.
 */
public native final JavaScriptObject parse(JavaScriptObject value, Field field)/*-{
	return this.parse(value, field); 
}-*/;

}
