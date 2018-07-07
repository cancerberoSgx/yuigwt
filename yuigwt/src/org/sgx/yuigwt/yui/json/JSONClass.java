package org.sgx.yuigwt.yui.json;

import org.sgx.yuigwt.yui.util.JsFunction;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * <p>
 * The JSON module adds support for serializing JavaScript objects into JSON
 * strings and parsing JavaScript objects from strings in JSON format.
 * </p>
 * 
 * <p>
 * The JSON namespace is added to your YUI instance including static methods
 * Y.JSON.parse(..) and Y.JSON.stringify(..).
 * </p>
 * 
 * <p>
 * The functionality and method signatures follow the ECMAScript 5
 * specification. In browsers with native JSON support, the native
 * implementation is used.
 * </p>
 * 
 * <p>
 * The json module is a rollup of json-parse and json-stringify.
 * </p>
 * 
 * <p>
 * As their names suggest, json-parse adds support for parsing JSON data
 * (Y.JSON.parse) and json-stringify for serializing JavaScript data into JSON
 * strings (Y.JSON.stringify). You may choose to include either of the
 * submodules individually if you don't need the complementary functionality, or
 * include the rollup for both.
 * </p>
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/JSON.html
 * 
 * @author sg
 * 
 */
public class JSONClass extends JavaScriptObject {
	protected JSONClass() {
	}

	// TODO notify(), dateToString() (deprecated)

	/**
	 * Create a custom transport of type and return it's object
	 * 
	 * @param id
	 *            the id of the transport to create.
	 * @return self for method chaining
	 */
	public native final JavaScriptObject customTransport(String id) /*-{
		return this.customTransport(id);
	}-*/;

	/**
	 * 
	 * @param id
	 *            The transport to set as the default, if empty a new transport
	 *            is created.
	 * @return The transport object with a send method
	 */
	public native final JavaScriptObject defaultTransport(String id) /*-{
		return this.defaultTransport(id);
	}-*/;

	/**
	 * 
	 * @param id
	 *            The transport to set as the default, if empty a new transport
	 *            is created.
	 * @return The transport object with a send method
	 */
	public native final JavaScriptObject defaultTransport() /*-{
		return this.defaultTransport();
	}-*/;

	/**
	 * Parse a JSON string, returning the native JavaScript representation.
	 * 
	 * @param s
	 * @param reviver
	 * @return
	 */
	public native final JavaScriptObject parse(String s) /*-{
		return this.parse(s);
	}-*/;

	/**
	 * <p>
	 * Parse a JSON string, returning the native JavaScript representation.
	 * Usage example:
	 * </p>
	 * 
	 * <pre>
	 * JsFunction reviver2 = new JsFunctionBuilder() {	
	 * 	public native final JsFunction buildFunction()/*-{
	 * 		return function(k, v) {
	 * 			if(k=="miscellaneous" && v>500)
	 * 				return 999999; 
	 * 			else
	 * 				return v; 
	 * 		}
	 * 	}-*&#47;;
	 * }.buildFunction();
	 * JsObject obj2 = Y.JSON().parse(jsonStr2, reviver2).cast();
	 * </pre>
	 * @param s the json string to parse. 
	 * @param reviver a js function the receive property name and property value as parameters and return a new value.
	 * 
	 * @return
	 */
	public native final JavaScriptObject parse(String s,
			JavaScriptObject reviver) /*-{
		return this.parse(s, reviver);
	}-*/;

	/**
	 * <p>
	 * Converts an arbitrary value to a JSON string representation.
	 * </p>
	 * 
	 * <p>
	 * Objects with cyclical references will trigger an exception.
	 * </p>
	 * 
	 * <p>
	 * If a whitelist is provided, only matching object keys will be included.
	 * Alternately, a replacer function may be passed as the second parameter.
	 * This function is executed on every value in the input, and its return
	 * value will be used in place of the original value. This is useful to
	 * serialize specialized objects or class instances.
	 * </p>
	 * 
	 * <p>
	 * If a positive integer or non-empty string is passed as the third
	 * parameter, the output will be formatted with carriage returns and
	 * indentation for readability. If a String is passed (such as "\t") it will
	 * be used once for each indentation level. If a number is passed, that
	 * number of spaces will be used.
	 * </p>
	 * 
	 * @param o
	 *            any arbitrary value to convert to JSON string
	 * @return JSON string representation of the input 
	 */
	public native final String stringify(JavaScriptObject o) /*-{
		return this.stringify(o);
	}-*/;

	/**
	 * <p>
	 * Converts an arbitrary value to a JSON string representation.
	 * </p>
	 * 
	 * <p>
	 * Objects with cyclical references will trigger an exception.
	 * </p>
	 * 
	 * <p>
	 * If a whitelist is provided, only matching object keys will be included.
	 * Alternately, a replacer function may be passed as the second parameter.
	 * This function is executed on every value in the input, and its return
	 * value will be used in place of the original value. This is useful to
	 * serialize specialized objects or class instances.
	 * </p>
	 * 
	 * <p>
	 * If a positive integer or non-empty string is passed as the third
	 * parameter, the output will be formatted with carriage returns and
	 * indentation for readability. If a String is passed (such as "\t") it will
	 * be used once for each indentation level. If a number is passed, that
	 * number of spaces will be used.
	 * </p>
	 * 
	 * @param o
	 *            any arbitrary value to convert to JSON string
	 * @param w
	 *            (optional) whitelist of acceptable object keys to include, or
	 *            a replacer function to modify the raw value before
	 *            serialization
	 * @return JSON string representation of the input 
	 */
	public native final String stringify(JavaScriptObject o,
			JsArrayString w) /*-{
		return this.stringify(o, w);
	}-*/;

	/**
	 * <p>
	 * Converts an arbitrary value to a JSON string representation.
	 * </p>
	 * 
	 * <p>
	 * Objects with cyclical references will trigger an exception.
	 * </p>
	 * 
	 * <p>
	 * If a whitelist is provided, only matching object keys will be included.
	 * Alternately, a replacer function may be passed as the second parameter.
	 * This function is executed on every value in the input, and its return
	 * value will be used in place of the original value. This is useful to
	 * serialize specialized objects or class instances.
	 * </p>
	 * 
	 * <p>
	 * If a positive integer or non-empty string is passed as the third
	 * parameter, the output will be formatted with carriage returns and
	 * indentation for readability. If a String is passed (such as "\t") it will
	 * be used once for each indentation level. If a number is passed, that
	 * number of spaces will be used.
	 * </p>
	 * 
	 * @param o
	 *            any arbitrary value to convert to JSON string
	 * @param w
	 *            (optional) whitelist of acceptable object keys to include, or
	 *            a replacer function to modify the raw value before
	 *            serialization
	 * @return JSON string representation of the input 
	 */
	public native final String stringify(JavaScriptObject o,
			JsFunction w) /*-{
		return this.stringify(o, w);
	}-*/;

	/**
	 * <p>
	 * Converts an arbitrary value to a JSON string representation.
	 * </p>
	 * 
	 * <p>
	 * Objects with cyclical references will trigger an exception.
	 * </p>
	 * 
	 * <p>
	 * If a whitelist is provided, only matching object keys will be included.
	 * Alternately, a replacer function may be passed as the second parameter.
	 * This function is executed on every value in the input, and its return
	 * value will be used in place of the original value. This is useful to
	 * serialize specialized objects or class instances.
	 * </p>
	 * 
	 * <p>
	 * If a positive integer or non-empty string is passed as the third
	 * parameter, the output will be formatted with carriage returns and
	 * indentation for readability. If a String is passed (such as "\t") it will
	 * be used once for each indentation level. If a number is passed, that
	 * number of spaces will be used.
	 * </p>
	 * 
	 * @param o
	 *            any arbitrary value to convert to JSON string
	 * @param w
	 *            (optional) whitelist of acceptable object keys to include, or
	 *            a replacer function to modify the raw value before
	 *            serialization
	 * @param ind
	 *            (optional) indentation character or depth of spaces to format
	 *            the output.
	 * @return JSON string representation of the input
	 */
	public native final String stringify(JavaScriptObject o,
			JsArrayString w, int ind) /*-{
		return this.stringify(o, w, ind);
	}-*/;

	/**
	 * <p>
	 * Converts an arbitrary value to a JSON string representation.
	 * </p>
	 * 
	 * <p>
	 * Objects with cyclical references will trigger an exception.
	 * </p>
	 * 
	 * <p>
	 * If a whitelist is provided, only matching object keys will be included.
	 * Alternately, a replacer function may be passed as the second parameter.
	 * This function is executed on every value in the input, and its return
	 * value will be used in place of the original value. This is useful to
	 * serialize specialized objects or class instances.
	 * </p>
	 * 
	 * <p>
	 * If a positive integer or non-empty string is passed as the third
	 * parameter, the output will be formatted with carriage returns and
	 * indentation for readability. If a String is passed (such as "\t") it will
	 * be used once for each indentation level. If a number is passed, that
	 * number of spaces will be used.
	 * </p>
	 * 
	 * @param o
	 *            any arbitrary value to convert to JSON string
	 * @param w
	 *            (optional) whitelist of acceptable object keys to include, or
	 *            a replacer function to modify the raw value before
	 *            serialization
	 * @param ind
	 *            (optional) indentation character or depth of spaces to format
	 *            the output.
	 * @return JSON string representation of the input
	 */
	public native final String stringify(JavaScriptObject o,
			JsFunction w, int ind) /*-{
	return this.stringify(o, w, ind);
	}-*/;
}
