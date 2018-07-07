package org.sgx.yuigwt.yui.yui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * overlay for Y.Escape - Provides utility methods for escaping strings.
 * @author sg
 *
 */
public class Escape extends JavaScriptObject {
protected Escape(){}

/**
 * Returns a copy of the specified string with special HTML characters escaped. The following characters will be converted to their corresponding character entities:
		<pre>& < > " ' / `</pre>
This implementation is based on the OWASP HTML escaping recommendations. In addition to the characters in the OWASP recommendations, we also escape the ` character, since IE interprets it as an attribute delimiter.
If string is not already a string, it will be coerced to a string.
 * @param s String to escape
 * @return Escaped string. 
 */
public native final String html(String s)/*-{
	return this.html(s); 
}-*/;


/**
 * Returns a copy of the specified string with special regular expression characters escaped, allowing the string to be used safely inside a regex. The following characters, and all whitespace characters, are escaped:
		<pre>- $ ^ * ( ) + [ ] { } | \ , . ?</pre>
This implementation is based on the OWASP HTML escaping recommendations. In addition to the characters in the OWASP recommendations, we also escape the ` character, since IE interprets it as an attribute delimiter.
If string is not already a string, it will be coerced to a string.
 * @param s String to escape
 * @return Escaped string. 
 */
public native final String regex(String s)/*-{
	return this.regex(s); 
}-*/;
}
