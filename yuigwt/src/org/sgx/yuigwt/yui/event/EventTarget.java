package org.sgx.yuigwt.yui.event;

import org.sgx.yuigwt.yui.util.Callback;
import org.sgx.yuigwt.yui.util.JsFunction;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.dom.client.Element;

/**
 * 
 * <p>EventTarget provides the implementation for any object to publish, subscribe and fire to custom events, and also alows other EventTargets to target the object with events sourced from the other object. EventTarget is designed to be used with Y.augment to wrap EventCustom in an interface that allows events to be listened to and fired by name. This makes it possible for implementing code to subscribe to an event that either has not been created yet, or will not be created at all.
 *  </p>
 *  
 * Java Note 1: EventCallback do not return boolean for preventing behaviour. Thi sis discouraged, use e.preventDefault();  instead return false; All native callbacks return true.  
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/EventTarget.html, http://yuilibrary.com/yui/docs/event
 * @author sg
 * 
 * TODO: add JsFunction and Callback param types to "once", "after", etc. like we have done for "on".
 *
 */
public class EventTarget extends JsObject {
protected EventTarget() {}

/**
 * Removes a bubble target
 * @param e the event target to remove 
 */
public native final void removeTarget(EventTarget e) /*-{
this.removeTarget(e); 
}-*/;
/**
 * <p>Registers another EventTarget as a bubble target. Bubble order is determined by the order registered. Multiple targets can be specified.</p>
 * Events can only bubble if emitFacade is true. Included in the event-custom-complex submodule.
 * @param e the event target to add 
 */
public native final void addTarget(EventTarget e) /*-{
this.addTarget(e); 
}-*/;


/**
 * Takes the type parameter passed to 'on' and parses out the various pieces that could be included in the type. If the event type is passed without a prefix, it will be expanded to include the prefix one is supplied or the event target is configured with a default prefix.
 * @param type the type
 * @returns Array: an array containing: * the detach category, if supplied, * the prefixed event type, * whether or not this is an after listener, * the supplied event type 
 */
public native final JsArrayMixed parseType(String type) /*-{
return this.parseType(type); 
}-*/;

/**
 * Takes the type parameter passed to 'on' and parses out the various pieces that could be included in the type. If the event type is passed without a prefix, it will be expanded to include the prefix one is supplied or the event target is configured with a default prefix.
 * @param type the type
 * @returns Array: an array containing: * the detach category, if supplied, * the prefixed event type, * whether or not this is an after listener, * the supplied event type 
 */
public native final JsArrayMixed parseType(String type, String prefix) /*-{
return this.parseType(type, prefix); 
}-*/;


/**
 * Creates a new custom event of the specified type. If a custom event by that name already exists, it will not be re-created. In either case the custom event is returned.
 * @param the type, or name of the event
 * @param config optional config params. 
 * @return the custom event 
 */
public native final CustomEvent publish(String type, EventConfig config) /*-{
return this.publish(type, config);
}-*/;
/**
 * Creates a new custom event of the specified type. If a custom event by that name already exists, it will not be re-created. In either case the custom event is returned.
 * @param the type, or name of the event
 * @return the custom event 
 */
public native final CustomEvent publish(String type) /*-{
return this.publish(type);
}-*/;


/**
 * @param e the custom event to propagate
 * @return the aggregated return value from Event.Custom.fire 
 */
public native final boolean bubble(CustomEvent e) /*-{
return this.bubble(e);
}-*/;


/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String type, EventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;   
	});
	return this.on(type, f);  
}-*/;

/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String type, Callback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.util.Callback::call(*)(arguments);
		return true;   
	});
	return this.on(type, f);  
}-*/;

/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String type, JsFunction c) /*-{
	return this.on(type, c);  
}-*/;


/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String[] type, EventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e); 
		return true;  
	});
	return this.on(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f);  
}-*/;

/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String[] type, JsFunction c) /*-{	
	return this.on(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), c);  
}-*/;

/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String[] type, Callback c) /*-{
var f = $entry(function(e){
	c.@org.sgx.yuigwt.yui.util.Callback::call(*)(arguments);
	return true;   
});
return this.on(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f);  
}-*/;

/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String type, EventCallback c, Object args) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;  
	});
	return this.on(type, f, args);  
}-*/;

/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String type, Callback c, Object args) /*-{
var f = $entry(function(e){
	c.@org.sgx.yuigwt.yui.util.Callback::call(*)(arguments);
	return true;   
});
return this.on(type, f, args);   
}-*/;

/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String type, JsFunction c, Object args) /*-{
return this.on(type, c, args);   
}-*/;


/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String[] type, EventCallback c, Object args) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e); 
		return true;  
	});
	return this.on(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f, args);  
}-*/;

/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String[] type, JsFunction c, Object args) /*-{
	return this.on(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), c, args);  
}-*/;
/**
 * Subscribe a callback function to a custom event fired by this object or
 * from an object that bubbles its events to this object. <br/>
 * 
 * 
 * SimpleCallback functions for events published with emitFacade = true will
 * receive an EventFacade as the first argument (typically named "e"). These
 * callbacks can then call e.preventDefault() to disable the behavior
 * published to that event's defaultFn. See the EventFacade API for all
 * available properties and methods. Subscribers to non-emitFacade events
 * will receive the arguments passed to fire() after the event name. <br/>
 * 
 * 
 * To subscribe to multiple events at once, pass an object as the first
 * argument, where the key:value pairs correspond to the eventName:callback,
 * or pass an array of event names as the first argument to subscribe to all
 * listed events with the same callback. <br/>
 * 
 * 
 * Returning false from a callback is supported as an alternative to calling
 * e.preventDefault(); e.stopPropagation();. However, it is recommended to
 * use the event methods whenever possible.
 * 
 * @param type The names of the events
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle on(String[] type, Callback c, Object args) /*-{
var f = $entry(function(e){
	c.@org.sgx.yuigwt.yui.util.Callback::call(*)(arguments);
	return true;   
});
return this.on(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f, args);  
}-*/;

/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to on except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle once(String type, EventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e); 
		return true;  
	});
	return this.once(type, f);  
}-*/;
/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to on except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle once(String[] type, EventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e); 
		return true;  
	});
	return this.once(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f);  
}-*/;


/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to on except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle once(String type, EventCallback c, Object args) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e); 
		return true;  
	});
	return this.once(type, f, args);  
}-*/;
/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to on except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle once(String[] type, EventCallback c, Object args) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e); 
		return true;  
	});
	return this.once(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f, args);  
}-*/;



/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to after except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle onceAfter(String type, EventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e); 
		return true;  
	});
	return this.onceAfter(type, f);  
}-*/;
/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to after except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle onceAfter(String[] type, EventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;  
	});
	return this.onceAfter(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f);  
}-*/;


/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to after except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle onceAfter(String type, EventCallback c, Object args) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;  
	});
	return this.onceAfter(type, f, args);  
}-*/;
/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to after except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle onceAfter(String[] type, EventCallback c, Object args) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;  
	});
	return this.onceAfter(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f, args);  
}-*/;




//after


/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to after except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle after(String type, EventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e); 
		return true;  
	});
	return this.after(type, f);  
}-*/;
/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to after except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle after(String[] type, EventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;  
	});
	return this.after(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f);  
}-*/;


/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to after except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle after(String type, EventCallback c, Object args) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;  
	});
	return this.after(type, f, args);  
}-*/;
/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to after except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle after(String[] type, EventCallback c, Object args) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;  
	});
	return this.after(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f, args);  
}-*/;



/**
 * Executes the callback before a DOM event, custom event or method. If the first argument is a function, it is assumed the target is a method. For DOM and custom events, this is an alias for Y.on.
<br/><br/>
For DOM and custom events: type, callback, context, 0-n arguments
<br/><br/>
For methods: callback, object (method host), methodName, context, 0-n arguments
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle before(String type, EventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;  
	});
	return this.before(type, f);  
}-*/;
/**
 *Executes the callback before a DOM event, custom event or method. If the first argument is a function, it is assumed the target is a method. For DOM and custom events, this is an alias for Y.on.
<br/><br/>
For DOM and custom events: type, callback, context, 0-n arguments
<br/><br/>
For methods: callback, object (method host), methodName, context, 0-n arguments
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle before(String[] type, EventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;  
	});
	return this.before(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f);  
}-*/;


/**
 * Executes the callback before a DOM event, custom event or method. If the first argument is a function, it is assumed the target is a method. For DOM and custom events, this is an alias for Y.on.
<br/><br/>
For DOM and custom events: type, callback, context, 0-n arguments
<br/><br/>
For methods: callback, object (method host), methodName, context, 0-n arguments
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle before(String type, EventCallback c, Object args) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;  
	});
	return this.before(type, f, args);  
}-*/;
/**
 * Executes the callback before a DOM event, custom event or method. If the first argument is a function, it is assumed the target is a method. For DOM and custom events, this is an alias for Y.on.
<br/><br/>
For DOM and custom events: type, callback, context, 0-n arguments
<br/><br/>
For methods: callback, object (method host), methodName, context, 0-n arguments
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @param args additional arguments to supply to the subscriber
 * @return
 */
public final native EventHandle before(String[] type, EventCallback c, Object args) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		return true;  
	});
	return this.before(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f, args);  
}-*/;


}
