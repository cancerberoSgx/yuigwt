package org.sgx.yuigwt.yui.yql.api.yui.gallery.all;

import org.sgx.yuigwt.yui.yql.api.YQLJson;

import com.google.gwt.core.client.JsArray;
/**
 * @author sg
 *
 */
public class YuiGalleryAllJson extends YQLJson {
	protected YuiGalleryAllJson(){}


/**
 * 
 * @return
 */
public native final JsArray<YuiGalleryAllModule> modules() /*-{
return this.modules; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final YuiGalleryAllJson modules(JsArray<YuiGalleryAllModule> val) /*-{
this.modules = val; 
return this; 
}-*/;
}
