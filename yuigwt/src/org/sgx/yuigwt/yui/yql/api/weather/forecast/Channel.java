package org.sgx.yuigwt.yui.yql.api.weather.forecast;

import org.sgx.yuigwt.yui.util.JsObject;

public class Channel extends JsObject {
protected Channel(){}
public native final String title() /*-{
	return this.title; 
}-*/;
public native final String description() /*-{
	return this.description; 
}-*/;
public native final String link() /*-{
	return this.link; 
}-*/;
/**
 * 
 * @return
 */
public native final String language() /*-{
return this.language; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Channel language(String val) /*-{
this.language = val; 
return this; 
}-*/;
public native final Wind wind() /*-{
	return this.wind; 
}-*/;
/**
 * 
 * @return
 */
public native final String lastBuildDate() /*-{
return this.lastBuildDate; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Channel lastBuildDate(String val) /*-{
this.lastBuildDate = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String ttl() /*-{
return this.ttl; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Channel ttl(String val) /*-{
this.ttl = val; 
return this; 
}-*/;
}