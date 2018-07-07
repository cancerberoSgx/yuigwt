package org.sgx.yuigwt.yui.yql.api.weather.forecast;

import org.sgx.yuigwt.yui.util.JsObject;

public class Wind extends JsObject {
	protected Wind(){}
	public native final String chill() /*-{
		return this.chill; 
	}-*/;
	public native final String direction() /*-{
		return this.direction; 
	}-*/;
	public native final String speed() /*-{
		return this.speed; 
	}-*/;
}