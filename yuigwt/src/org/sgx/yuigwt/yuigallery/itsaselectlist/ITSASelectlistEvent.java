package org.sgx.yuigwt.yuigallery.itsaselectlist;

import org.sgx.yuigwt.yui.widget.WidgetEvent;

public class ITSASelectlistEvent extends WidgetEvent {
protected ITSASelectlistEvent(){}
/**
 * index of selected item
 * @return
 */
public native final int index() /*-{
return this.index; 
}-*/;

/**
 * index of selected item
 * @param val
 * @return this - for setter chaining
 */
public native final ITSASelectlistEvent index(int val) /*-{
this.index = val; 
return this; 
}-*/;

/**
 * value of selected item
 * @return
 */
public native final String value() /*-{
return this.value+""; 
}-*/;

/**
 * value of selected item
 * @param val
 * @return this - for setter chaining
 */
public native final ITSASelectlistEvent value(String val) /*-{
this.value = val; 
return this; 
}-*/;

//TODO: value of other types jso, int, double, boolean String
}
