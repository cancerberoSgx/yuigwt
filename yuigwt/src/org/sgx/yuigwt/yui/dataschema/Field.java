package org.sgx.yuigwt.yui.dataschema;

import com.google.gwt.core.client.JavaScriptObject;

public class Field extends JavaScriptObject {
protected Field(){}
public static final native Field create()/*-{
return {}; 
}-*/;
public static final native Field create(String key)/*-{
return {"key": key}; 
}-*/;
/**
 * 
 * @return
 */
public native final String key() /*-{
return this.key; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Field key(String val) /*-{
this.key = val; 
return this; 
}-*/;

/**
 * valid values can be "number": will parse into a number, "date" will parse into a js date. @see Datatypes.
 * @return
 */
public native final String parser() /*-{
return this.parser; 
}-*/;

/**
 * valid values can be "number": will parse into a number, "date" will parse into a js date. @see Datatypes.
 * @param val
 * @return this - for setter chaining
 */
public native final Field parser(String val) /*-{
this.parser = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String locator() /*-{
return this.locator; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Field locator(String val) /*-{
this.locator = val; 
return this; 
}-*/;
}
