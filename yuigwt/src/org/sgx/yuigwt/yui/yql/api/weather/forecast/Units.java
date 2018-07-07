package org.sgx.yuigwt.yui.yql.api.weather.forecast;

import org.sgx.yuigwt.yui.util.JsObject;

public class Units extends JsObject {
protected Units(){}
/**
 * 
 * @return
 */
public native final String distance() /*-{
return this.distance; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Units distance(String val) /*-{
this.distance = val; 
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
public native final Units pressure(String val) /*-{
this.pressure = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String speed() /*-{
return this.speed; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Units speed(String val) /*-{
this.speed = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String temperature() /*-{
return this.temperature; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Units temperature(String val) /*-{
this.temperature = val; 
return this; 
}-*/;
}
