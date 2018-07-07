package org.sgx.yuigwt.yui.console;

import org.sgx.yuigwt.yui.event.EventTarget;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JsDate;

public class NormalizedMessage extends JsObject {
protected NormalizedMessage(){}
/**
 * this moment
 * @return
 */
public native final JsDate time() /*-{
return this.time; 
}-*/;

/**
 * this moment
 * @param val
 * @return this - for setter chaining
 */
public native final NormalizedMessage time(JsDate val) /*-{
this.time = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String message() /*-{
return this.message; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final NormalizedMessage message(String val) /*-{
this.message = val; 
return this; 
}-*/;

/**
 * logLevel or custom category for the message
 * @return
 */
public native final String category() /*-{
return this.category; 
}-*/;

/**
 * logLevel or custom category for the message
 * @param val
 * @return this - for setter chaining
 */
public native final NormalizedMessage category(String val) /*-{
this.category = val; 
return this; 
}-*/;

/**
 * same as source but can include instance info
 * @return
 */
public native final String sourceAndDetail() /*-{
return this.sourceAndDetail; 
}-*/;

/**
 * same as source but can include instance info
 * @param val
 * @return this - for setter chaining
 */
public native final NormalizedMessage sourceAndDetail(String val) /*-{
this.sourceAndDetail = val; 
return this; 
}-*/;

/**
 * when provided, the widget or util calling Y.log<
 * @return
 */
public native final EventTarget source() /*-{
return this.source; 
}-*/;

/**
 * when provided, the widget or util calling Y.log<
 * @param val
 * @return this - for setter chaining
 */
public native final NormalizedMessage source(EventTarget val) /*-{
this.source = val; 
return this; 
}-*/;

/**
 * readable version of time
 * @return
 */
public native final String localTime() /*-{
return this.localTime; 
}-*/;

/**
 * readable version of time
 * @param val
 * @return this - for setter chaining
 */
public native final NormalizedMessage localTime(String val) /*-{
this.localTime = val; 
return this; 
}-*/;

/**
 * ms since last entry
 * @return
 */
public native final int elapsedTime() /*-{
return this.elapsedTime; 
}-*/;

/**
 * ms since last entry
 * @param val
 * @return this - for setter chaining
 */
public native final NormalizedMessage elapsedTime(int val) /*-{
this.elapsedTime = val; 
return this; 
}-*/;

/**
 * ms since Console was instantiated or reset
 * @return
 */
public native final int totalTime() /*-{
return this.totalTime; 
}-*/;

/**
 * ms since Console was instantiated or reset
 * @param val
 * @return this - for setter chaining
 */
public native final NormalizedMessage totalTime(int val) /*-{
this.totalTime = val; 
return this; 
}-*/;


}
