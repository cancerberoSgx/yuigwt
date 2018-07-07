package org.sgx.yuigwt.yui.datatype;

import com.google.gwt.core.client.JavaScriptObject;

public class DataTypeNumber extends JavaScriptObject {
protected DataTypeNumber(){}
/**
 * Takes a Number and formats to string for display to user.
 * @param d Number
 * @param format Optional configuration values
 * @return Formatted number for display. Note, the following values return as "": null, undefined, NaN, "". 
 */
public native final String format(double d, NumberFormat format)/*-{
return this.format(d, format); 
}-*/;
/**
 * Takes a Number and formats to string for display to user.
 * @param d Number
 * @param format Optional configuration values
 * @return Formatted number for display. Note, the following values return as "": null, undefined, NaN, "". 
 */
public native final String format(int d, NumberFormat format)/*-{
return this.format(d, format); 
}-*/;
/**
 * Takes a Number and formats to string for display to user.
 * @param d Number
 * @param format Optional configuration values
 * @return Formatted number for display. Note, the following values return as "": null, undefined, NaN, "". 
 */
public native final String format(float d, NumberFormat format)/*-{
return this.format(d, format); 
}-*/;
/**
 * Converts data to type Number.
 */
public native final int parseInt(String data)/*-{
return this.parse(data); 
}-*/;
/**
 * Converts data to type Number.
 */
public native final double parseDouble(String data)/*-{
return this.parse(data); 
}-*/;
}
