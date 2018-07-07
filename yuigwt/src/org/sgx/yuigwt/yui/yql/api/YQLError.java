package org.sgx.yuigwt.yui.yql.api;

import org.sgx.yuigwt.yui.util.JsObject;

public class YQLError extends JsObject {
protected YQLError(){}
/**
 * 
 * @return
 */
public native final String description() /*-{
return this.description; 
}-*/;
/**
 * 
 * @return
 */
public native final String lang() /*-{
return this.lang; 
}-*/;

}
