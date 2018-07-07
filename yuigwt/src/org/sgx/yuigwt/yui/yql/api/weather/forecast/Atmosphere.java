package org.sgx.yuigwt.yui.yql.api.weather.forecast;

import org.sgx.yuigwt.yui.util.JsObject;

public class Atmosphere extends JsObject{
protected Atmosphere(){}
/**
 * 
 * @return
 */
public native final String humidity() /*-{
return this.humidity; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Atmosphere humidity(String val) /*-{
this.humidity = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String pressure() /*-{
return this.pressure; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Atmosphere pressure(String val) /*-{
this.pressure = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final String rising() /*-{
return this.rising; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Atmosphere rising(String val) /*-{
this.rising = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final String visibility() /*-{
return this.visibility; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Atmosphere visibility(String val) /*-{
this.visibility = val; 
return this; 
}-*/;
}
