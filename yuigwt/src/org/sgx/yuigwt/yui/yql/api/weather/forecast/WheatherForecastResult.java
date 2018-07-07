package org.sgx.yuigwt.yui.yql.api.weather.forecast;

import org.sgx.yuigwt.yui.util.JsObject;

public class WheatherForecastResult extends JsObject /*implements YQLQueryResult*/ {
	protected WheatherForecastResult(){}

/**
 * 
 * @return
 */
public native final Channel channel() /*-{
return this.channel; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WheatherForecastResult channel(Channel val) /*-{
this.channel = val; 
return this; 
}-*/;

}

