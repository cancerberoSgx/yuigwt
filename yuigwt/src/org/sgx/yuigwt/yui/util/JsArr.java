package org.sgx.yuigwt.yui.util;

import com.google.gwt.core.client.JsArrayMixed;
/**
 * enriched javascript array overlay. 
 * @author sg
 *
 */
public class JsArr extends JsArrayMixed {
protected JsArr(){}
public static final native JsArr create()/*-{
	return []; 
}-*/;

public static final native <T> JsArr create(T... t)/*-{
	return @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(t); 
}-*/;
public final native JsObject getObj(int index)/*-{
return this[index]||null; 
}-*/;
public final native JsArr getArr(int index)/*-{
return this[index]||null; 
}-*/;
public final native Object getJavaObj(int index)/*-{
return this[index]||null; 
}-*/;
}
