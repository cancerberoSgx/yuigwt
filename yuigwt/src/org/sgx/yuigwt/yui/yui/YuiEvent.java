package org.sgx.yuigwt.yui.yui;

import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventHandle;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
/**
 * overlay for Y.Event static methods
 * @see http://yuilibrary.com/yui/docs/api/classes/Event.html
 * @author sg
 *
 */
public class YuiEvent extends JavaScriptObject {
protected YuiEvent(){}
/**
 * Adds an event listener
 * @param type The type of event to append
 * @param c The method the event invokes
 * String id An id, an element reference, or a collection of ids and/or elements to assign the listener to.
 * @return an object to that can be used to detach the listener 
 */
public native final EventHandle attach(String type, EventCallback<?> c, String id) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(Lorg/sgx/yuigwt/yui/event/EventFacade;)(e); 
	});
	return this.attach(type, c, id); 
}-*/;

/**
 * Adds an event listener
 * @param type The type of event to append
 * @param c The method the event invokes
 * String id An id, an element reference, or a collection of ids and/or elements to assign the listener to.
 * @return an object to that can be used to detach the listener 
 */
public native final EventHandle attach(String type, EventCallback c, Element id) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(Lorg/sgx/yuigwt/yui/event/EventFacade;)(e); 
	});
	return this.attach(type, c, id); 
}-*/;
/**
 * Adds an event listener
 * @param type The type of event to append
 * @param c The method the event invokes
 * String id An id, an element reference, or a collection of ids and/or elements to assign the listener to.
 * @return an object to that can be used to detach the listener 
 */
public native final EventHandle attach(String type, EventCallback c, String[] id) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(Lorg/sgx/yuigwt/yui/event/EventFacade;)(e); 
	});
	return this.attach(type, c, @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(id)); 
}-*/;

/**
 * Compiles a selector string into a filter function to identify whether Nodes along the parent axis of an event's target should trigger event notification.
<br/>
This function is memoized, so previously compiled filter functions are returned if the same selector string is provided.
<br/>
This function may be useful when defining synthetic events for delegate handling.
<br/>
Hosted as a property of the delegate method (e.g. Y.delegate.compileFilter).

 * @param selector the selector string to base the filtration on
 * @return
 */
public native final JavaScriptObject compileFilter(String selector) /*-{
return this.compileFilter(selector); 
}-*/;

//public native final JavaScriptObject define(String type, SyntheticEventConfig config, boolean force) /*-{
//return this.define(type, config, force); 
//}-*/;

}
