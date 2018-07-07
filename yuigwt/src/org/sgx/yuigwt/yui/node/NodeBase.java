package org.sgx.yuigwt.yui.node;

import org.sgx.yuigwt.yui.base.Base;
import org.sgx.yuigwt.yui.event.EventHandle;
import org.sgx.yuigwt.yui.event.NodeEventCallback;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.util.Style;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * Common functionality of Node and NodeList.
 * <br/><br/>
 * In the case of a node list, in general, the method will be applied to each
 * nodelist children.
 * <br/><br/>
 * Java Note 1: Events methods on() once() etc are managed here and like in EventTarget, the following applies: EventCallback do not return boolean for preventing behaviour. Thi sis discouraged, use e.preventDefault();  instead return false; All native callbacks return true.
 * 
 * @author sg
 * 
 */
public class NodeBase extends Base {
	protected NodeBase() {
	}

	/**
	 * Adds a class name to the node.
	 * 
	 * @param c
	 *            the class name to add to the node's class attribute
	 * @return self for method chaining
	 */
	public native final NodeBase addClass(String c)/*-{
		this.addClass(c);
		return this;
	}-*/;

	/**
	 * Sets a style property of the node. Use camelCase (e.g. 'backgroundColor')
	 * for multi-word properties.
	 * 
	 * @param attr
	 * @param val
	 * @return
	 */
	public native final Node setStyle(String attr, String val)/*-{
		this.setStyle(attr, val);
		return this;
	}-*/;
	/**
	 * Sets a style property of the node. Use camelCase (e.g. 'backgroundColor')
	 * for multi-word properties.
	 * 
	 * @param attr
	 * @param val
	 * @return
	 */
	public native final Node setStyle(String attr, int val)/*-{
		this.setStyle(attr, val);
		return this;
	}-*/;
	/**
	 * Sets a style property of the node. Use camelCase (e.g. 'backgroundColor')
	 * for multi-word properties.
	 * 
	 * @param attr
	 * @param val
	 * @return
	 */
	public native final Node setStyle(String attr, double val)/*-{
		this.setStyle(attr, val);
		return this;
	}-*/;
	
	/**
	 * Removes a class name from each node.
	 * @param className the class name to remove from the node's class attribute
	 * @return self 
	 */
	public native final NodeBase removeClass(String className)/*-{
		this.removeClass(className);
		return this; 
	}-*/;
	
	
	/**
	 * Sets multiple style properties on the node. Use camelCase (e.g.
	 * 'backgroundColor') for multi-word properties. You can use
	 * org.sgx.yuigwt.yui.Style for building the style
	 * 
	 * @param sty
	 * @return
	 */
	public native final Node setStyles(Style sty)/*-{
		this.setStyles(sty);
		return this;
	}-*/;

	/**
	 * Sets multiple style properties on the node. Use camelCase (e.g.
	 * 'backgroundColor') for multi-word properties. You can use
	 * org.sgx.yuigwt.yui.Style for building the style
	 * 
	 * @param sty
	 * @return
	 */
	public native final Node setStyles(JavaScriptObject sty)/*-{
		this.setStyles(sty);
		return this;
	}-*/;
	
	// append

	/**
	 * Inserts the given node as the lastChild of the node.
	 * 
	 * @param n
	 *            The content to insert Use Y.Escape.html() to escape html
	 *            content.
	 * @return this object for method chaining
	 */
	public native final NodeBase append(NodeBase n)/*-{
		this.append(n);
		return this;
	}-*/;

	/**
	 * Inserts the given content html string node as the lastChild of the node.
	 * 
	 * @param n
	 *            The content to insert Use Y.Escape.html() to escape html
	 *            content.
	 * @return this object for method chaining
	 */
	public native final NodeBase append(String content)/*-{
		this.append(content);
		return this;
	}-*/;

	/**
	 * Inserts the given html element as the lastChild of the node.
	 * 
	 * @param n
	 *            The content to insert Use Y.Escape.html() to escape html
	 *            content.
	 * @return this object for method chaining
	 */
	public native final NodeBase append(Element e)/*-{
		this.append(e);
		return this;
	}-*/;

	/**
	 * Inserts the given node as the lastChild of the node.
	 * 
	 * @param n
	 *            The content to insert Use Y.Escape.html() to escape html
	 *            content.
	 * @return The appended node
	 */
	public native final NodeBase appendChild(NodeBase n)/*-{
		return this.appendChild(n);
	}-*/;

	/**
	 * Inserts the given content html string node as the lastChild of the node.
	 * 
	 * @param n
	 *            The content to insert Use Y.Escape.html() to escape html
	 *            content.
	 * @return The appended node -
	 */
	public native final Node appendChild(String content)/*-{
		return this.appendChild(content);
	}-*/;

	/**
	 * Inserts the given html element as the lastChild of the node.
	 * 
	 * @param n
	 *            The content to insert Use Y.Escape.html() to escape html
	 *            content.
	 * @return The appended node
	 */
	public native final Node appendChild(Element e)/*-{
		return this.appendChild(e);
	}-*/;

	/**
	 * Clears internally stored data.
	 * 
	 * @param name
	 *            The name of the field to clear. If no name is given, all data
	 *            is cleared.
	 * @return this for method chaining
	 */
	public native final NodeBase clearData(String name)/*-{
		this.clearData(e);
		return this;
	}-*/;

	// /**
	// * Called on each Node instance. Nulls internal node references, removes
	// any plugins and event listeners
	// */
	// public native final void destroy()/*-{
	// this.destroy();
	// }-*/;
	/**
	 * Called on each Node instance. Nulls internal node references, removes any
	 * plugins and event listeners
	 * 
	 * @param recursivePurge
	 *            Whether or not to remove listeners from the node's subtree
	 *            (default is false)
	 */
	public native final void destroy(boolean recursivePurge)/*-{
		this.destroy(recursivePurge);
	}-*/;

/**
 * Simulates an event on the node.
 * @param type The type of event (i.e., "click").
 * @param opts (Optional) Extra options to copy onto the event object. 
 * @return self for method chaining
 */
public native final NodeBase simulate(String type, YuiEvent opts) /*-{
this.simulate(type, opts); 
return this; 
}-*/;
	// todo dettach dettachAll







//events, on, once, onceAfter, etc - this work with NodeEventCallback/YuiEvent instead EventCallback/EventFacade

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
public final native EventHandle on(String type, NodeEventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
		return true;  
	});
	return this.on(type, f);  
}-*/;

/**
 * Subscribe a single callback to multiple events
 * 
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
public final native EventHandle on(String[] type, NodeEventCallback c) /*-{
var f = $entry(function(e){
	c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
		return true;  
});
return this.on(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f);  
}-*/;
/**
 * TODO not sure - but this is needed for keyboard events, for example newTask.on("key", addTodo, "enter");  
 * @param type
 * @param c
 * @param args
 * @return
 */
public final native EventHandle on(String type, NodeEventCallback c, Object args) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
		return true;  
	});
	return this.on(type, f, args);  
}-*/;

public final native EventHandle on(String [] type, NodeEventCallback c, Object args) /*-{
var f = $entry(function(e){
	c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
		return true;  
});
return this.on(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f, args);  
}-*/;

/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to on except the listener is immediatelly detached when it is executed.
 * @param type
 * @param c
 * @return
 */
public final native EventHandle once(String type, NodeEventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
		return true;  
	});
	return this.once(type, f);  
}-*/;
/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to on except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle once(String []type, NodeEventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
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
public final native EventHandle once(String type, NodeEventCallback c, Object args) /*-{
	var f = $entry(function(e, args){
		e._args=args;
		c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
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
public final native EventHandle once(String []type, NodeEventCallback c, Object args) /*-{
var f = $entry(function(e, args){
	e._args=args;
	c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
	return true;  
});
return this.once(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f, args);  
}-*/;




/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to after except the listener is immediatelly detached when it is executed.
 * @param type
 * @param c
 * @return
 */
public final native EventHandle onceAfter(String type, NodeEventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
		return true;  
	});
	return this.onceAfter(type, f);  
}-*/;
/**
 * Listen to a custom event hosted by this object one time. This is the equivalent to after except the listener is immediatelly detached when it is executed.
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle onceAfter(String []type, NodeEventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
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
public final native EventHandle onceAfter(String type, NodeEventCallback c, Object args) /*-{
	var f = $entry(function(e, args){
		e._args=args;
		c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
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
public final native EventHandle onceAfter(String []type, NodeEventCallback c, Object args) /*-{
var f = $entry(function(e, args){
	e._args=args;
	c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
	return true;  
});
return this.onceAfter(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f, args);  
}-*/;


/**
 * Executes the callback before a DOM event, custom event or method. If the first argument is a function, it is assumed the target is a method. For DOM and custom events, this is an alias for Y.on.
<br/><br/>
For DOM and custom events: type, callback, context, 0-n arguments
<br/><br/>
For methods: callback, object (method host), methodName, context, 0-n arguments
 * @param type
 * @param c
 * @return
 */
public final native EventHandle before(String type, NodeEventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
		return true;  
	});
	return this.before(type, f);  
}-*/;
/**
 * Executes the callback before a DOM event, custom event or method. If the first argument is a function, it is assumed the target is a method. For DOM and custom events, this is an alias for Y.on.
<br/><br/>
For DOM and custom events: type, callback, context, 0-n arguments
<br/><br/>
For methods: callback, object (method host), methodName, context, 0-n arguments
 * @param type The name of the event
 * @param c The callback to execute in response to the event
 * @return
 */
public final native EventHandle before(String []type, NodeEventCallback c) /*-{
	var f = $entry(function(e){
		c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
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
public final native EventHandle before(String type, NodeEventCallback c, Object args) /*-{
	var f = $entry(function(e, args){
		e._args=args;
		c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
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
public final native EventHandle before(String []type, NodeEventCallback c, Object args) /*-{
var f = $entry(function(e, args){
	e._args=args;
	c.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e);  
	return true;  
});
return this.before(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(type), f, args);  
}-*/;



//insert
/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(String content, String where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;

/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(String content, Node where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;
/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(String content, Element where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;
/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(String content, int where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;
/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(NodeBase content, String where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;

/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(NodeBase content, Node where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;
/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(NodeBase content, Element where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;
/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(NodeBase content, int where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;




/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(Element content, String where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;

/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(Element content, Node where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;
/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(Element content, Element where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;
/**
 * Inserts the content before the reference node.
 * @param content The content to insert Use Y.Escape.html() to escape html content. can be any of the following types String | Node | HTMLElement | NodeList | HTMLCollection
 * @param where The position to insert at. Possible "where" arguments: 
 * <br/> Y.Node - The Node to insert before
 * <br/> HTMLElement - The element to insert before
 * <br/> Int -  The index of the child element to insert before
 * <br/> "replace" -  Replaces the existing HTML
 * <br/> "before" -  Inserts before the existing HTML
 * <br/> "after"  - Inserts content after the node
 * @return self for method chaining.
 */
public final native NodeBase insert(Element content, int where) /*-{
	this.insert(content, where); 
	return this; 
}-*/;



/**
 * 
 * @param newNode Node to be appended
 * @param refnode 
 * @return  The inserted node 
 */
public final native Node insertBefore(Node newNode, Node refnode) /*-{
return this.insertBefore(content, where);
}-*/;
/**
 * 
 * @param newNode Node to be appended
 * @param refnode 
 * @return  The inserted node 
 */
public final native Node insertBefore(String newNode, Node refnode) /*-{
return this.insertBefore(content, where);
}-*/;
/**
 * 
 * @param newNode Node to be appended
 * @param refnode 
 * @return  The inserted node 
 */
public final native Node insertBefore(Element newNode, Node refnode) /*-{
return this.insertBefore(content, where);
}-*/;

/**
 * 
 * @param newNode Node to be appended
 * @param refnode 
 * @return  The inserted node 
 */
public final native Node insertBefore(Node newNode, Element refnode) /*-{
return this.insertBefore(content, where);
}-*/;
/**
 * 
 * @param newNode Node to be appended
 * @param refnode 
 * @return  The inserted node 
 */
public final native Node insertBefore(String newNode, Element refnode) /*-{
return this.insertBefore(content, where);
}-*/;
/**
 * 
 * @param newNode Node to be appended
 * @param refnode 
 * @return  The inserted node 
 */
public final native Node insertBefore(Element newNode, Element refnode) /*-{
return this.insertBefore(content, where);
}-*/;

/**
 * Removes and destroys all of the nodes within the node.
 * 
 * @returnself for method chaining
 */
public native final Node empty()/*-{
	this.empty();
	return this;
}-*/;

}
