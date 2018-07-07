package org.sgx.yuigwt.yui.datasource;

import org.sgx.yuigwt.yui.base.BaseEvent;
import org.sgx.yuigwt.yui.util.JsObject;

public class DataSourceEvent extends BaseEvent {
protected DataSourceEvent(){}

/**
 * Unique transaction ID.
 * @return
 */
public native final String tId() /*-{
return this.tId; 
}-*/;

/**
 * Unique transaction ID.
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceEvent tId(String val) /*-{
this.tId = val; 
return this; 
}-*/;

/**
 * The request value.
 * @return
 */
public native final JsObject request() /*-{
return this.request; 
}-*/;

/**
 * The request value.
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceEvent request(JsObject val) /*-{
this.request = val; 
return this; 
}-*/;

/**
 * The callback object.
 * @return
 */
public native final JsObject callback() /*-{
return this.callback; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceEvent callback(JsObject val) /*-{
this.callback = val; 
return this; 
}-*/;

///**
// * 
// * @return
// */
//public native final JsObject cfg() /*-{
//return this.cfg; 
//}-*/;
//
///**
// * 
// * @param val
// * @return this - for setter chaining
// */
//public native final DataSourceEvent cfg(JsObject val) /*-{
//this.cfg = val; 
//return this; 
//}-*/;

/**
 * The raw data.
 * @return
 */
public native final String data() /*-{
return this.data; 
}-*/;

/**
 * The raw data.
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceEvent data(String val) /*-{
this.data = val; 
return this; 
}-*/;

/**
 * Data normalized into a response object.
 * @return
 */
public native final DataSourceResponse response() /*-{
return this.response; 
}-*/;

/**
 * Data normalized into a response object.
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceEvent response(DataSourceResponse val) /*-{
this.response = val; 
return this; 
}-*/;
}
