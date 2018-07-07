package org.sgx.yuigwt.yui.datatype;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * @see http://yuilibrary.com/yui/docs/api/classes/DataType.Number.html#method_format
 * @author sg
 *
 */
public class NumberFormat extends JavaScriptObject {
protected NumberFormat(){}
public static final native NumberFormat create()/*-{
	return {}; 
}-*/;

/**
 * String prepended before each number, like a currency designator "$"
 * @return
 */
public native final String prefix() /*-{
return this.prefix; 
}-*/;

/**
 * String prepended before each number, like a currency designator "$"
 * @param val
 * @return this - for setter chaining
 */
public native final NumberFormat prefix(String val) /*-{
this.prefix = val; 
return this; 
}-*/;

/**
 * Number of decimal places to round. Must be a number 0 to 20.
 * @return
 */
public native final int decimalPlaces() /*-{
return this.decimalPlaces; 
}-*/;

/**
 * Number of decimal places to round. Must be a number 0 to 20.
 * @param val
 * @return this - for setter chaining
 */
public native final NumberFormat decimalPlaces(int val) /*-{
this.decimalPlaces = val; 
return this; 
}-*/;

/**
 * Decimal separator
 * @return
 */
public native final String decimalSeparator() /*-{
return this.decimalSeparator; 
}-*/;

/**
 * Decimal separator
 * @param val
 * @return this - for setter chaining
 */
public native final NumberFormat decimalSeparator(String val) /*-{
this.decimalSeparator = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String thousandsSeparator() /*-{
return this.thousandsSeparator; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final NumberFormat thousandsSeparator(String val) /*-{
this.thousandsSeparator = val; 
return this; 
}-*/;
/**
 * String appended after each number, like " items" (note the space)
 * @return
 */
public native final String suffix() /*-{
return this.suffix; 
}-*/;

/**
 * String appended after each number, like " items" (note the space)
 * @param val
 * @return this - for setter chaining
 */
public native final NumberFormat suffix(String val) /*-{
this.suffix = val; 
return this; 
}-*/;
}
