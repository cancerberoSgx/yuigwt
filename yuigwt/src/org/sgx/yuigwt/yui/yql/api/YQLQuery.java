package org.sgx.yuigwt.yui.yql.api;

import org.sgx.yuigwt.yui.util.JsArr;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sg
 *
 */
public class YQLQuery extends JsObject {
protected YQLQuery(){}
/**
 * The number of items (rows) in returned by the YQL statement. In an XML response, count is the number of sub-elements in the results element.
 * @return
 */
public native final int count() /*-{
return this.count; 
}-*/;
/**
 * The date and time the response was created.
 * @return
 */
public native final String created() /*-{
return this.created; 
}-*/;

/**
 * The locale for the response.
 * @return
 */
public native final String lang() /*-{
return this.lang; 
}-*/;

/**
 * The date and time this response was last updated.
 * @return
 */
public native final String updated() /*-{
return this.updated; 
}-*/;

/**
 * this object should be casted to the ${tableName}Result of the concrete table package to be used. For example if query = "select * from weather.forecast", then in the YQL callback cast the argument to class org.sgx.yuigwt.yui.yql.api.weather.forecast.WheatherForecastResult and start working with the concrete wheather.forecast java api. 
 * @return
 */
public native final JsObject results() /*-{
return this.results || null; 
}-*/;

/**
 * 
 * @return
 */
public native final Diagnostics diagnostics() /*-{
return this.diagnostics; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final YQLQuery diagnostics(Diagnostics val) /*-{
this.diagnostics = val; 
return this; 
}-*/;

}
