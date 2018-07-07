package org.sgx.yuigwt.yui.io;

import org.sgx.yuigwt.yui.event.EventTarget;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The IO class is a utility that brokers HTTP requests through a simplified
 * interface. Specifically, it allows JavaScript to make HTTP requests to a
 * resource without a page reload. The underlying transport for making
 * same-domain requests is the XMLHttpRequest object. IO can also use Flash, if
 * specified as a transport, for cross-domain requests.
 * 
 * 
 * Note, in Java, currently it is suppoerted to instantiate IO and use 
 * event facade emitFacade: true for getting a single event parameter in event callbacks
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/IO.html
 * @author sg
 * 
 */
public class IO extends EventTarget {
	protected IO() {
	}
	
	public static final String EVENT_COMPLETE="complete", EVENT_FAILURE="failure", EVENT_END="end", 
		EVENT_PROGRESS="progress", EVENT_START="start", EVENT_SUCCESS="success", EVENT_XDRREADY="xdrReady"; 
	
public native final Response send(String uri) /*-{
return this.send(uri, {emitFacade: true});
}-*/;
	
/**
 * 
 * @return 
 */
public native final Response send(String uri, IOConfig config) /*-{
return this.send(uri, config || {emitFacade: true});
}-*/;
/**
 * 
 * @return 
 */
public native final Response send(String uri, JavaScriptObject config) /*-{
return this.send(uri, config || {emitFacade: true});
}-*/;
/**
 * 
 * @return 
 */
public native final Response send(String uri, IOConfig config, String id) /*-{
return this.send(uri, config, id);
}-*/;
/**
 * 
 * @return 
 */
public native final Response send(String uri, JavaScriptObject config, String id) /*-{
return this.send(uri, config, id);
}-*/;
}
