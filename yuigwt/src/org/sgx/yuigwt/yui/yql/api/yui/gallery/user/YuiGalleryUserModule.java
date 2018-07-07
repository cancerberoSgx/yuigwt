package org.sgx.yuigwt.yui.yql.api.yui.gallery.user;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JsArrayString;


//small yui.gallery java api
public class YuiGalleryUserModule extends JsObject {
protected YuiGalleryUserModule(){}
/**
* gallery module url
* @return
*/
public native final String url() /*-{
	return this.url; 
}-*/;
/**
* this gallery module tag 
* @return
*/
public native final String module() /*-{
return this.module; 
}-*/;
/**
* comma separated required modules
* @return
*/
public native final JsArrayString requires() /*-{
if(typeof(this.requires)=="string") 
	return this.requres.split(",");
else
	return this.requires; 
}-*/;
/**
* readable title
* @return
*/
public native final String title() /*-{
return this.title; 
}-*/;
/**
* @return
*/
public native final String summary() /*-{
return this.summary; 
}-*/;


/**
* @return
*/
public native final String license() /*-{
return this.license; 
}-*/;

/**
* @return
*/
public native final String license_url() /*-{
return this.license_url; 
}-*/;


/**
* @return
*/
public native final String buildtag() /*-{
return this.buildtag; 
}-*/;

/**
 * @return
 */
public native final String buildtag_data() /*-{
return this.buildtag_data+""; 
}-*/;



//description, license, license_url, cdn, buildtag, featured, 
//owner
//buildtag_data

}