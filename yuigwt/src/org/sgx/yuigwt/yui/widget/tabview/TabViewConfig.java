package org.sgx.yuigwt.yui.widget.tabview;

import org.sgx.yuigwt.yui.widget.ext.WidgetExtConfig;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
/**
 * Provides a tabbed widget interface
 * @author sg
 *
 */
public class TabViewConfig extends WidgetExtConfig {
protected TabViewConfig(){}
public static final native TabViewConfig create()/*-{
	return {};
}-*/;

public static native final TabViewConfig create(TabConfig[]tags)/*-{
return {"children": @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(tags)}; 
}-*/;

// /**
//  * 
//  * @return
//  */
// public native final JsArray<Tab> children() /*-{
// return this.children; 
// }-*/;

// /**
//  * 
//  * @param val
//  * @return this - for setter chaining
//  */
// public native final WidgetExtConfig children(JavaScriptObject... val)  /*-{
// this.children = val; 
// return this; 
// }-*/;
}
