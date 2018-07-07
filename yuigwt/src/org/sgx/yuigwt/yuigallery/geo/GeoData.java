package org.sgx.yuigwt.yuigallery.geo;

import org.sgx.yuigwt.yui.util.JsObject;
/**
 * four properties: success (true/false), coords (an object),
 * timestamp, and source ("native" or "geoplugin").
 * @author sg
 *
 */
public class GeoData extends JsObject{
protected GeoData(){}

/**
 * 
 * @return
 */
public native final boolean success() /*-{
return this.success; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GeoData success(boolean val) /*-{
this.success = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final GeoCoord coords() /*-{
return this.coords; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GeoData coords(GeoCoord val) /*-{
this.coords = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String timestamp() /*-{
return this.timestamp; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GeoData timestamp(String val) /*-{
this.timestamp = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String source() /*-{
return this.source; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GeoData source(String val) /*-{
this.source = val; 
return this; 
}-*/;
}
