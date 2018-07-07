package org.sgx.yuigwt.galleryexplorer.client.api;

import org.sgx.yuigwt.yui.util.JsObject;


//small yui.gallery java api
public class Module extends JsObject {
protected Module(){}
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
public native final String requires() /*-{
return this.requires+""; 
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
public native final String tags() /*-{
return this.tags+""; 
}-*/;
/**
* @return
*/
public native final String description() /*-{
return this.description; 
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
public native final String cdn() /*-{
return this.cdn; 
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
public native final String featured() /*-{
return this.featured+""; 
}-*/;
/**
 * @return
 */
public native final String owner() /*-{
return this.owner+""; 
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