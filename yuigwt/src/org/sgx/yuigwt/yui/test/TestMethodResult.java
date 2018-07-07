package org.sgx.yuigwt.yui.test;

import org.sgx.yuigwt.yui.util.JsObject;
/**
 * 
 * @author sg
 *
 */
public class TestMethodResult extends JsObject{
protected TestMethodResult(){}

/**
 * pass, fail, etc
 * @return
 */
public native final String result() /*-{
return this.result; 
}-*/;

/**
 * pass, fail, etc
 * @param val
 * @return this - for setter chaining
 */
public native final TestMethodResult result(String val) /*-{
this.result = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String message() /*-{
return this.message; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TestMethodResult message(String val) /*-{
this.message = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String type() /*-{
return this.type; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TestMethodResult type(String val) /*-{
this.type = val; 
return this; 
}-*/;

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
public native final TestMethodResult name(String val) /*-{
this.name = val; 
return this; 
}-*/;
}
