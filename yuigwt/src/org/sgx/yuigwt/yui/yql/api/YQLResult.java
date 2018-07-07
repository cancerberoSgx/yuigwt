package org.sgx.yuigwt.yui.yql.api;

import org.sgx.yuigwt.yui.util.JsObject;
/**
 * YQL result helper
 * 
 *  in all cases, for each datatable or datatable command, there exists a Java class 
 named  ${tableName}Result.java that is the root main entry point to access the data table. In some
 cases, where required, this ${tableName}Result.java class will provide with methods for normalizing the
 js object data, like for example 
 org.sgx.yuigwt.yui.yql.api.weather.forecast.WheatherForecastResult::normalize
 * @author sg
 *
 */
public class YQLResult extends JsObject{
protected YQLResult(){}
/**
 * the query object or null if there was an error. 
 * @return
 */
public native final YQLQuery query() /*-{
return this.query; 
}-*/;

/**
 * the error object if any or null if none error
 * @return
 */
public native final YQLError error() /*-{
return this.error || null; 
}-*/;

}
