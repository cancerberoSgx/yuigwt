package org.sgx.yuigwt.yui.yql.api.desc;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JsArray;

public class TableRequestSelect extends JsObject {
protected TableRequestSelect(){}

/**
 * 
 * @return
 */
public native final JsArray<TableRequestSelectKey> key() /*-{
return this.key; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TableRequestSelect key(JsArray<TableRequestSelectKey> val) /*-{
this.key = val; 
return this; 
}-*/;
}
