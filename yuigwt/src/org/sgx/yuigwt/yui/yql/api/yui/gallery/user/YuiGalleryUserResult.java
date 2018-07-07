package org.sgx.yuigwt.yui.yql.api.yui.gallery.user;

import org.sgx.yuigwt.yui.yql.api.YQLJson;

public class YuiGalleryUserResult extends YQLJson  {
protected YuiGalleryUserResult(){}
/**
 * 
 * @return
 */
public native final YuiGalleryUserJson json() /*-{
return this.json; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final YuiGalleryUserResult json(YuiGalleryUserJson val) /*-{
this.json = val; 
return this; 
}-*/;
}
