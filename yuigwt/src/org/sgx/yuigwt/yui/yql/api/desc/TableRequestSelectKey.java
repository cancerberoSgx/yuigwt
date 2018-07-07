package org.sgx.yuigwt.yui.yql.api.desc;

import org.sgx.yuigwt.yui.util.JsObject;

public class TableRequestSelectKey extends JsObject {
protected TableRequestSelectKey(){}
/**
 * 
 * @return
 */
public native final String name() /*-{
return this.name; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TableRequestSelectKey name(String val) /*-{
this.name = val; 
return this; 
}-*/;

/**
 * true|false
 * @return
 */
public native final String private_() /*-{
return this["private"]; 
}-*/;

/**
 * true|false
 * @param val
 * @return this - for setter chaining
 */
public native final TableRequestSelectKey private_(String val) /*-{
this["private"] = val; 
return this; 
}-*/;

/**
 * a xsd type like xs:string
 * @return
 */
public native final String type() /*-{
return this.type; 
}-*/;

/**
 * a xsd type like xs:string
 * @param val
 * @return this - for setter chaining
 */
public native final TableRequestSelectKey type(String val) /*-{
this.type = val; 
return this; 
}-*/;

/**
 * true|false
 * @return
 */
public native final String required() /*-{
return this.required; 
}-*/;

/**
 * true|false
 * @param val
 * @return this - for setter chaining
 */
public native final TableRequestSelectKey required(String val) /*-{
this.required = val; 
return this; 
}-*/;
}
