package org.sgx.yuigwt.yui.yql.api.weather.forecast;

import org.sgx.yuigwt.yui.util.JsObject;

public class Astronomy extends JsObject{
protected Astronomy(){}
/**
 * 
 * @return
 */
public native final String sunrise() /*-{
return this.sunrise; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Astronomy sunrise(String val) /*-{
this.sunrise = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String sunset() /*-{
return this.sunset; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Astronomy sunset(String val) /*-{
this.sunset = val; 
return this; 
}-*/;
}
