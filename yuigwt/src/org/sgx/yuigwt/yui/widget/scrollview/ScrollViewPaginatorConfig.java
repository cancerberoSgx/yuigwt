package org.sgx.yuigwt.yui.widget.scrollview;

import org.sgx.yuigwt.yui.yui.PluginBaseConfig;

public class ScrollViewPaginatorConfig extends PluginBaseConfig {
public static native final ScrollViewPaginatorConfig create()/*-{
	return {}; 
}-*/;

protected ScrollViewPaginatorConfig(){}

/**
 * CSS selector for a page inside the scrollview. The scrollview will snap to the closest page
 * @return
 */
public native final String selector() /*-{
return this.selector; 
}-*/;

/**
 * CSS selector for a page inside the scrollview. The scrollview will snap to the closest page
 * @param val
 * @return this - for setter chaining
 */
public native final ScrollViewPaginatorConfig selector(String val) /*-{
this.selector = val; 
return this; 
}-*/;

}
