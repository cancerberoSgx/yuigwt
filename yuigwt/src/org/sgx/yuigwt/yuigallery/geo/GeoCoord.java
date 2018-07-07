package org.sgx.yuigwt.yuigallery.geo;

import org.sgx.yuigwt.yui.util.JsObject;
/**
 * 
 * @author sg
 *
 */
public class GeoCoord extends JsObject{
protected GeoCoord(){}
/**
 * 
 * @return
 */
public native final double latitude() /*-{
return this.latitude; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GeoCoord latitude(double val) /*-{
this.latitude = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double longitude() /*-{
return this.longitude; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GeoCoord longitude(double val) /*-{
this.longitude = val; 
return this; 
}-*/;
}
