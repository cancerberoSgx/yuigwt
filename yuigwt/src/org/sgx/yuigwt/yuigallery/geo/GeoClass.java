package org.sgx.yuigwt.yuigallery.geo;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * this module lack api docs. 
 * 
 * this is based on source https://github.com/nzakas/yui3-gallery/blob/master/src/gallery-geo/js/geo.js
 * 
 * @author sg
 *
 */
public class GeoClass extends JavaScriptObject {
protected GeoClass(){}

/**
* Get the current position. This tries to use the native geolocation
* API if available. Otherwise it uses the GeoPlugin site to do an
* IP address lookup.
* @param callback {Function} The callback function to call when the
* request is complete. The object passed into the request has
* four properties: success (true/false), coords (an object),
* timestamp, and source ("native" or "geoplugin").
* @param scope {Object} (Optional) The this value for the callback function.
*/
public native final GeoClass getCurrentPosition() /*-{
this.getCurrentPosition(); 
return this; 
}-*/;
}
