package org.sgx.yuigwt.yui.yql.api.yui.gallery.all;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;

public class YuiGalleryAllResult extends JsObject {
	protected YuiGalleryAllResult(){}
//public static final native YuiGalleryAllResult normalize(JavaScriptObject o)/*-{
//	return this["json"]||null; 
//}-*/;
/**
 * 
 * @return
 */
public native final YuiGalleryAllJson json() /*-{
return this.json; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final YuiGalleryAllResult json(YuiGalleryAllJson val) /*-{
this.json = val; 
return this; 
}-*/;
}
