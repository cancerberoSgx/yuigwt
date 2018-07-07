package org.sgx.yuigwt.yui.yql;

import org.sgx.yuigwt.yui.util.JsObject;

public class YQLParams extends JsObject {
protected YQLParams(){}
public static final native YQLParams create()/*-{
return {}; 
}-*/;
/**
 * 
 * @return
 */
public native final String format() /*-{
return this.format; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final YQLParams format(String val) /*-{
this.format = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String env() /*-{
return this.env; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final YQLParams env(String val) /*-{
this.env = val; 
return this; 
}-*/;

/**
 * false|true
 * @return
 */
public native final String diagnostics() /*-{
return this.diagnostics; 
}-*/;

/**
 * false|true
 * @param val
 * @return this - for setter chaining
 */
public native final YQLParams diagnostics(String val) /*-{
this.diagnostics = val; 
return this; 
}-*/;

/**
 * js global function name to call back
 * @return
 */
public native final String callback() /*-{
return this.callback; 
}-*/;

/**
 * js global function name to call back
 * @param val
 * @return this - for setter chaining
 */
public native final YQLParams callback(String val) /*-{
this.callback = val; 
return this; 
}-*/;
}
