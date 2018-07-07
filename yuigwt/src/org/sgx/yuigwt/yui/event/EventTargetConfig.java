package org.sgx.yuigwt.yui.event;

import org.sgx.yuigwt.yui.util.JsObject;

/**
 * this class is somewhat artificial. It contains configuration methods used in 
 * some classes configuration like on: {}, bubbles, emitFacade, etc. For example: 
 * 
 * var io1 = new Y.IO({
 * 	on: {"complete": function(e){}}, 
 *  emitFacade: true
 * }); 
 * 
 * In this case IO class extends EventTarget and so IOConfig extends EventTargetConfig and so we can set this event related config,. 
 * 
 * TODO: add JsFunction and Callback param types to "once", "after", etc. like we have done for EventTarget::on().
 * 
 * @author sg
 *
 */
public class EventTargetConfig extends JsObject {

protected EventTargetConfig(){}

/**
 * for registering EventTarget in configuration objects, for example: <pre>
new Y.Button({
	on: {click: function(e){..}}
}); 
</pre>
 * @param eventType
 * @param c
 * @return
 */
public native final EventTargetConfig on(String eventType, EventCallback c)/*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(Lorg/sgx/yuigwt/yui/event/EventFacade;)(e);
		return true; 
	}); 
	if(!this.on) 
		this.on = {}; 
	this.on[eventType] = f; 
	return this; 	
}-*/;

/**
 * for registering EventTarget in configuration objects, for example: <pre>
new Y.Button({
	after: {click: function(e){..}}
}); 
</pre>
 * @param eventType
 * @param c
 * @return
 */
public native final EventTargetConfig after(String eventType, EventCallback c)/*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(Lorg/sgx/yuigwt/yui/event/EventFacade;)(e);
		return true; 
	}); 
	if(!this.after) 
		this.after = {}; 
	this.after[eventType] = f; 
	return this; 	
}-*/;

/**
 * whether or not the YUI instance and YUI global are notified when the event is fired (false) 
 * @return
 */
public native final boolean broadcast() /*-{
return this.broadcast; 
}-*/;

/**
 * whether or not the YUI instance and YUI global are notified when the event is fired (false) 
 * @param val
 * @return this - for setter chaining
 */
public native final EventTargetConfig broadcast(boolean val) /*-{
this.broadcast = val; 
return this; 
}-*/;

/**
 * whether or not this event bubbles (true) Events can only bubble if emitFacade is true. 
 * @return
 */
public native final boolean bubbles() /*-{
return this.bubbles; 
}-*/;

/**
 * whether or not this event bubbles (true) Events can only bubble if emitFacade is true. 
 * @param val
 * @return this - for setter chaining
 */
public native final EventTargetConfig bubbles(boolean val) /*-{
this.bubbles = val; 
return this; 
}-*/;

/**
 * whether or not this event emits a facade (false) 
 * @return
 */
public native final boolean emitFacade() /*-{
return this.emitFacade; 
}-*/;

/**
 * whether or not this event emits a facade (false) 
 * @param val
 * @return this - for setter chaining
 */
public native final EventTargetConfig emitFacade(boolean val) /*-{
this.emitFacade = val; 
return this; 
}-*/;

/**
 * the prefix for this targets events, e.g., 'menu' in 'menu:click' 
 * @return
 */
public native final String prefix() /*-{
return this.prefix; 
}-*/;

/**
 * the prefix for this targets events, e.g., 'menu' in 'menu:click' 
 * @param val
 * @return this - for setter chaining
 */
public native final EventTargetConfig prefix(String val) /*-{
this.prefix = val; 
return this; 
}-*/;

/**
 * if an event is configured to fire once, new subscribers after the fire will be notified immediately. 
 * @return
 */
public native final boolean fireOnce() /*-{
return this.fireOnce; 
}-*/;

/**
 * if an event is configured to fire once, new subscribers after the fire will be notified immediately. 
 * @param val
 * @return this - for setter chaining
 */
public native final EventTargetConfig fireOnce(boolean val) /*-{
this.fireOnce = val; 
return this; 
}-*/;

/**
 *  fireOnce event listeners will fire synchronously if the event has already fired unless async is true. 
 * @return
 */
public native final boolean async() /*-{
return this.async; 
}-*/;

/**
 *  fireOnce event listeners will fire synchronously if the event has already fired unless async is true. 
 * @param val
 * @return this - for setter chaining
 */
public native final EventTargetConfig async(boolean val) /*-{
this.async = val; 
return this; 
}-*/;

/**
 * whether or not preventDefault() has an effect (true) 
 * @return
 */
public native final boolean preventable() /*-{
return this.preventable; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final EventTargetConfig preventable(boolean val) /*-{
this.preventable = val; 
return this; 
}-*/;

/**
 * whether or not this event can be queued during bubbling (false) 
 * @return
 */
public native final boolean queuable() /*-{
return this.queuable; 
}-*/;

/**
 * whether or not this event can be queued during bubbling (false) 
 * @param val
 * @return this - for setter chaining
 */
public native final EventTargetConfig queuable(boolean val) /*-{
this.queuable = val; 
return this; 
}-*/;

/**
 * if silent is true, debug messages are not provided for this event. 
 * @return
 */
public native final boolean silent() /*-{
return this.silent; 
}-*/;

/**
 * if silent is true, debug messages are not provided for this event. 
 * @param val
 * @return this - for setter chaining
 */
public native final EventTargetConfig silent(boolean val) /*-{
this.silent = val; 
return this; 
}-*/;

/**
 * specifies whether or not this event should send notifications about when the event has been attached, detached, or published
 * @return
 */
public native final boolean monitored() /*-{
return this.monitored; 
}-*/;

/**
 * specifies whether or not this event should send notifications about when the event has been attached, detached, or published
 * @param val
 * @return this - for setter chaining
 */
public native final EventTargetConfig monitored(boolean val) /*-{
this.monitored = val; 
return this; 
}-*/;

/**
 * the event type (valid option if not provided as the first parameter to publish) 
 * @return
 */
public native final String type() /*-{
return this.type; 
}-*/;

/**
 * the event type (valid option if not provided as the first parameter to publish) 
 * @param val
 * @return this - for setter chaining
 */
public native final EventTargetConfig type(String val) /*-{
this.type = val; 
return this; 
}-*/;
}
