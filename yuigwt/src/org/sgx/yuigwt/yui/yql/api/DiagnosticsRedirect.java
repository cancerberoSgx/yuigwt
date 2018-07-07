package org.sgx.yuigwt.yui.yql.api;

import org.sgx.yuigwt.yui.util.JsObject;

public class DiagnosticsRedirect extends JsObject {
	protected DiagnosticsRedirect(){}
/**
 * 
 * @return
 */
public native final String from() /*-{
return this.from; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DiagnosticsRedirect from(String val) /*-{
this.from = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String status() /*-{
return this.status; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DiagnosticsRedirect status(String val) /*-{
this.status = val; 
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
public native final DiagnosticsRedirect content(String val) /*-{
this.content = val; 
return this; 
}-*/;
}