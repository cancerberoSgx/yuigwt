package org.sgx.yuigwt.yui.event;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * http://yuilibrary.com/yui/docs/api/classes/EventHandle.html
 * @author sg
 *
 */
public class EventHandle extends JavaScriptObject {
protected EventHandle(){}

/**
 * Detaches this subscriber
 * @return the number of detached listeners 
 */
public native final int detach()/*-{
	return this.detach(); 
}-*/;
/**
 * Monitor the event state for the subscribed event. The first parameter is what should be monitored, the rest are the normal parameters when subscribing to an event.
 * 
 * @param what to monitor ('attach', 'detach', 'publish').
 * @return value from the monitor event subscription.  
 */
public native final EventHandle monitor(String what)/*-{
return this.monitor(what); 
}-*/;
}
