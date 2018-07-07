package org.sgx.yuigwt.yui.charts;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * this object is mentioned on http://yuilibrary.com/yui/docs/charts/charts-customizedtooltip.html -  categoryItem and valueItem
 * @author sg
 *
 */
public class Item extends JavaScriptObject {
protected Item(){}

/**
 * The axis to which the item's series is bound. //TODO: String?
 * @return
 */
public native final String axis() /*-{
return this.axis; 
}-*/;

/**
 * The axis to which the item's series is bound. //TODO: String?
 * @param val
 * @return this - for setter chaining
 */
public native final Item axis(String val) /*-{
this.axis = val; 
return this; 
}-*/;

/**
 * The display name of the series. (defaults to key if not provided)
 * @return
 */
public native final String displayName() /*-{
return this.displayName; 
}-*/;

/**
 * The display name of the series. (defaults to key if not provided)
 * @param val
 * @return this - for setter chaining
 */
public native final Item displayName(String val) /*-{
this.displayName = val; 
return this; 
}-*/;

/**
 * The key for the series.
 * @return
 */
public native final String key() /*-{
return this.key; 
}-*/;

/**
 * The key for the series.
 * @param val
 * @return this - for setter chaining
 */
public native final Item key(String val) /*-{
this.key = val; 
return this; 
}-*/;

/**
 * The value for the series item.
 * @return
 */
public native final String value() /*-{
return this.value; 
}-*/;

/**
 * The value for the series item.
 * @param val
 * @return this - for setter chaining
 */
public native final Item value(String val) /*-{
this.value = val; 
return this; 
}-*/;
}
