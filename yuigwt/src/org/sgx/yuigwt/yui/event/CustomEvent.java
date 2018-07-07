package org.sgx.yuigwt.yui.event;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * The CustomEvent class lets you define events for your application that can be subscribed to by one or more independent component. @see http://yuilibrary.com/yui/docs/api/classes/CustomEvent.html
 * @author sg
 *
 */
public class CustomEvent extends JavaScriptObject {
protected CustomEvent(){} 

/**
 * The type of event, which is passed to the callback when the event fires.
 * @return
 */
public native final String type() /*-{
return this.type; 
}-*/;

/**The type of event, which is passed to the callback when the event fires.
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CustomEvent type(String val) /*-{
this.type = val; 
return this; 
}-*/;


}
