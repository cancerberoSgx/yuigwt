package org.sgx.yuigwt.yui.util;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayMixed;
/**
 * enriched javascript array overlay. 
 * @author sg
 *
 */
public class JSArrObj<T extends JavaScriptObject> extends JsArray {
protected JSArrObj(){}
public static final native JSArrObj create()/*-{
	return []; 
}-*/;

public static final native <T extends JavaScriptObject> JSArrObj create(Object... t)/*-{
	return @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(t); 
}-*/;


}
