package org.sgx.yuigwt.yui.pjax;

import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * object returned by pjax.getContent()
 * @author sg
 *
 */
public class PjaxContent extends JavaScriptObject {
protected PjaxContent(){}
/**
 * A Y.Node instance for a document fragment containing the extracted HTML content.
 * @return
 */
public native final Node node() /*-{
return this.node; 
}-*/;

/**
 * A Y.Node instance for a document fragment containing the extracted HTML content.
 * @param val
 * @return this - for setter chaining
 */
public native final PjaxContent node(Node val) /*-{
this.node = val; 
return this; 
}-*/;

/**
 * The title of the HTML page, if any, extracted using the titleSelector attribute (which defaults to looking for a <title> element). If titleSelector is not set or if a title could not be found, this property will be undefined.
 * @return
 */
public native final String title() /*-{
return this.title; 
}-*/;

/**
 * The title of the HTML page, if any, extracted using the titleSelector attribute (which defaults to looking for a <title> element). If titleSelector is not set or if a title could not be found, this property will be undefined.
 * @param val
 * @return this - for setter chaining
 */
public native final PjaxContent title(String val) /*-{
this.title = val; 
return this; 
}-*/;
}
