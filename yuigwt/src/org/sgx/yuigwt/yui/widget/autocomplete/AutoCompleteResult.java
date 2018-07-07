package org.sgx.yuigwt.yui.widget.autocomplete;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class AutoCompleteResult extends JavaScriptObject {
	protected AutoCompleteResult() {}
/**
 * Formatted result HTML suitable for display to the user. If no custom formatter is set, this will be an HTML-escaped version of the string in the text property. 
 * @return
 */
public native final String displayString() /*-{
return this.display; 
}-*/;
/**
 * Formatted result HTML suitable for display to the user. If no custom formatter is set, this will be an HTML-escaped version of the string in the text property. 
 * @return
 */
public native final Node displaNode() /*-{
return this.display; 
}-*/;
/**
 * Formatted result HTML suitable for display to the user. If no custom formatter is set, this will be an HTML-escaped version of the string in the text property. 
 * @return
 */
public native final Element displaElement() /*-{
return this.display; 
}-*/;

/**
 * Highlighted (but not formatted) result text. This property will only be set if a highlighter is in use.  
 * @return
 */
public native final String highlighted() /*-{
return this.highlighted; 
}-*/;
/**
 * Raw, unformatted result in whatever form it was provided by the source. 
 * @return
 */
public native final JsObject rawObj() /*-{
return this.raw; 
}-*/;
/**
 * Raw, unformatted result in whatever form it was provided by the source. 
 * @return
 */
public native final String rawString() /*-{
return this.raw; 
}-*/;
/**
 * Plain text version of the result, suitable for being inserted into the value of a text input field or textarea when the result is selected by a user. This value is not HTML-escaped and should not be inserted into the page using innerHTML.  
 * @return
 */
public native final String text() /*-{
return this.text; 
}-*/;
 


}
