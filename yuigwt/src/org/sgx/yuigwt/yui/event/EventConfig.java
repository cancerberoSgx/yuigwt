package org.sgx.yuigwt.yui.event;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * an overlay type for the second parameter of EventTarget.publish
 * 
 * @author sg
 * 
 */
public class EventConfig extends JavaScriptObject {
	protected EventConfig() {
	}

	/**
	 * whether or not the YUI instance and YUI global are notified when the
	 * event is fired (false)
	 * 
	 * @return
	 */
	public native final boolean broadcast() /*-{
		return this.broadcast;
	}-*/;

	/**
	 * whether or not the YUI instance and YUI global are notified when the
	 * event is fired (false)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig broadcast(boolean val) /*-{
		this.broadcast = val;
		return this;
	}-*/;

	/**
	 * whether or not this event bubbles (true) Events can only bubble if
	 * emitFacade is true.
	 * 
	 * @return
	 */
	public native final boolean bubbles() /*-{
		return this.bubbles;
	}-*/;

	/**
	 * whether or not this event bubbles (true) Events can only bubble if
	 * emitFacade is true.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig bubbles(boolean val) /*-{
		this.bubbles = val;
		return this;
	}-*/;

	/**
	 * the default function to execute when this event fires if preventDefault
	 * was not called
	 * 
	 * @return
	 */
	public native final EventCallback<?> defaultFn() /*-{
		return this.defaultFn;
	}-*/;

	/**
	 * the default function to execute when this event fires if preventDefault
	 * was not called
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig defaultFn(EventCallback<?> val) /*-{
		this.defaultFn = val;
		return this;
	}-*/;

	/**
	 * whether or not this event emits a facade (false)
	 * 
	 * @return
	 */
	public native final boolean emitFacade() /*-{
		return this.emitFacade;
	}-*/;

	/**
	 * whether or not this event emits a facade (false)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig emitFacade(boolean val) /*-{
		this.emitFacade = val;
		return this;
	}-*/;

	/**
	 * the prefix for this targets events, e.g., 'menu' in 'menu:click'
	 * 
	 * @return
	 */
	public native final String prefix() /*-{
		return this.prefix;
	}-*/;

	/**
	 * the prefix for this targets events, e.g., 'menu' in 'menu:click'
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig prefix(String val) /*-{
		this.prefix = val;
		return this;
	}-*/;

	/**
	 * if an event is configured to fire once, new subscribers after the fire
	 * will be notified immediately.
	 * 
	 * @return
	 */
	public native final boolean fireOnce() /*-{
		return this.fireOnce;
	}-*/;

	/**
	 * if an event is configured to fire once, new subscribers after the fire
	 * will be notified immediately.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig fireOnce(boolean val) /*-{
		this.fireOnce = val;
		return this;
	}-*/;

	/**
	 * fireOnce event listeners will fire synchronously if the event has already
	 * fired unless async is true.
	 * 
	 * @return
	 */
	public native final boolean async() /*-{
		return this.async;
	}-*/;

	/**
	 * fireOnce event listeners will fire synchronously if the event has already
	 * fired unless async is true.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig async(boolean val) /*-{
		this.async = val;
		return this;
	}-*/;

	/**
	 * whether or not preventDefault() has an effect (true)
	 * 
	 * @return
	 */
	public native final boolean preventable() /*-{
		return this.preventable;
	}-*/;

	/**
	 * whether or not preventDefault() has an effect (true)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig preventable(boolean val) /*-{
		this.preventable = val;
		return this;
	}-*/;

	/**
	 * a function that is executed when preventDefault is called
	 * 
	 * @return
	 */
	public native final EventCallback<?> preventedFn() /*-{
		return this.preventedFn;
	}-*/;

	/**
	 * a function that is executed when preventDefault is called
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig preventedFn(EventCallback<?> val) /*-{
		this.preventedFn = val;
		return this;
	}-*/;

	/**
	 * whether or not this event can be queued during bubbling (false)
	 * 
	 * @return
	 */
	public native final boolean queuable() /*-{
		return this.queuable;
	}-*/;

	/**
	 * whether or not this event can be queued during bubbling (false)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig queuable(boolean val) /*-{
		this.queuable = val;
		return this;
	}-*/;

	/**
	 * if silent is true, debug messages are not provided for this event.
	 * 
	 * @return
	 */
	public native final boolean silent() /*-{
		return this.silent;
	}-*/;

	/**
	 * if silent is true, debug messages are not provided for this event.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig silent(boolean val) /*-{
		this.silent = val;
		return this;
	}-*/;

	/**
	 * a function that is executed when stopPropagation is called
	 * 
	 * @return
	 */
	public native final EventCallback<?> stoppedFn() /*-{
		return this.stoppedFn;
	}-*/;

	/**
	 * a function that is executed when stopPropagation is called
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig stoppedFn(EventCallback<?> val) /*-{
		this.stoppedFn = val;
		return this;
	}-*/;

	/**
	 * specifies whether or not this event should send notifications about when
	 * the event has been attached, detached, or published.
	 * 
	 * @return
	 */
	public native final boolean monitored() /*-{
		return this.monitored;
	}-*/;

	/**
	 * specifies whether or not this event should send notifications about when
	 * the event has been attached, detached, or published.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig monitored(boolean val) /*-{
		this.monitored = val;
		return this;
	}-*/;

	/**
	 * the event type (valid option if not provided as the first parameter to
	 * publish)
	 * 
	 * @return
	 */
	public native final String type() /*-{
		return this.type;
	}-*/;

	/**
	 * the event type (valid option if not provided as the first parameter to
	 * publish)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EventConfig type(String val) /*-{
		this.type = val;
		return this;
	}-*/;
}
