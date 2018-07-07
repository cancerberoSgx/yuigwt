package org.sgx.yuigwt.yui.yql.api.yui.gallery.user;

import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.yql.api.YQLJson;
import org.sgx.yuigwt.yui.yql.api.yui.gallery.all.YuiGalleryAllJson;

import com.google.gwt.core.client.JsArray;

public class YuiGalleryUserJson extends YQLJson{
protected YuiGalleryUserJson(){}
/**
 * 
 * @return
 */
public native final String username() /*-{
return this.username; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final YuiGalleryUserJson username(String val) /*-{
this.username = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final YuiGalleryUserInfo userinfo() /*-{
return this.userinfo; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final YuiGalleryUserJson userinfo(YuiGalleryUserInfo val) /*-{
this.userinfo = val; 
return this; 
}-*/;

/**
 * an url
 * @return
 */
public native final String modulelist() /*-{
return this.modulelist; 
}-*/;

/**
 * an url
 * @param val
 * @return this - for setter chaining
 */
public native final YuiGalleryUserJson modulelist(String val) /*-{
this.modulelist = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final JsArray<YuiGalleryUserModule> modules() /*-{
return this.modules; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final YuiGalleryUserJson modules(JsArray<YuiGalleryUserModule> val) /*-{
this.modules = val; 
return this; 
}-*/;
}
