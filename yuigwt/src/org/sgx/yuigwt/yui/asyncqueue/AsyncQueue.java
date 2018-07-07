package org.sgx.yuigwt.yui.asyncqueue;

import org.sgx.yuigwt.yui.event.EventTarget;
import org.sgx.yuigwt.yui.util.SimpleCallback;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * A specialized queue class that supports scheduling callbacks to execute sequentially, iteratively, even asynchronously.
 * @see http://yuilibrary.com/yui/docs/api/classes/AsyncQueue.html
 * @author sg
 *
 */
public class AsyncQueue extends EventTarget {
protected AsyncQueue(){}

public static final String EVENT_COMPLETE = "complete", EVENT_PROMOTE = "promote", EVENT_REMOVE="remove", EVENT_EXECUTE="execute", EVENT_SHIFT="shift", EVENT_ADD="add"; 

public native final AsyncQueueItem defaults()/*-{
	return this.defaults || {}; 
}-*/;

///**
// * Add any number of callbacks to the end of the queue. Callbacks may be provided as functions or objects.
// * @param c
// * @return
// */
//public native final AsyncQueue add(SimpleCallback c)/*-{
//var f = $entry(function(){
//	return c.@org.sgx.yuigwt.yui.util.SimpleCallback::call(*)();  
//}); 
//@org.sgx.yuigwt.yui.util.YuiCallbackManager::register(Ljava/lang/String;Ljava/lang/Object;Lcom/google/gwt/core/client/JavaScriptObject;)("AsyncQueue", c, f)
//this.add(f); 
//return this; 
//}-*/;

/**
 * Add any number of callbacks to the end of the queue. Callbacks may be provided as functions or objects.
 * @param c
 * @return
 */
public native final AsyncQueue add(AsyncQueueItem c)/*-{
//@org.sgx.yuigwt.yui.util.YuiCallbackManager::register(Ljava/lang/String;Ljava/lang/Object;Lcom/google/gwt/core/client/JavaScriptObject;)("AsyncQueue", c, f)
this.add(c); 
return this; 
}-*/;

//TODO: add array

///**
// * get the java object callback orrespondent to a given id
// * @param c
// * @return
// */
//public native final AsyncQueueItem getCallbackJava(String id)/*-{
//	var f = this.getCallback(id); 
//	return @org.sgx.yuigwt.yui.util.YuiCallbackManager::getJava(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)("AsyncQueue", f);  
//}-*/;
/**
 * get the javascript function gallback correspondent to a given id
 * @param c
 * @return
 */
public native final JavaScriptObject getCallback(String id)/*-{
	return this.getCallback(id); 
}-*/; 
///**
// * Returns the current index of a callback. Pass in either the id or callback function from getCallback.
// * @param c
// * @return
// */
//public native final int indexOf(SimpleCallback c)/*-{
//	var f = @org.sgx.yuigwt.yui.util.YuiCallbackManager::getJs(Ljava/lang/String;Ljava/lang/Object;)("AsyncQueue", c); 
//	return this.indexOf(f); 
//}-*/;
///**
// * Returns the current index of a callback. Pass in either the id or callback function from getCallback.
// * @param c
// * @return
// */
//public native final int indexOf(AsyncQueueItem c)/*-{
//	var f = @org.sgx.yuigwt.yui.util.YuiCallbackManager::getJs(Ljava/lang/String;Ljava/lang/Object;)("AsyncQueue", c); 
//	return this.indexOf(f); 
//}-*/;
/**
 * Returns the current index of a callback. Pass in either the id or callback function from getCallback.
 * @param c
 * @return
 */
public native final int indexOf(String id)/*-{
	return this.indexOf(id); 
}-*/;
/**
 * Returns the current index of a callback. Pass in either the id or callback function from getCallback.
 * @param c
 * @return
 */
public native final int indexOf(JavaScriptObject c)/*-{
return this.indexOf(c); 
}-*/;
/**
 * Determines if the queue is waiting for a callback to complete execution.
 * @param id
 * @return  true if queue is waiting for a from any initiated transactions 
 */
public native final boolean isRunning()/*-{
return this.isRunning(); 
}-*/;
/** 
 * Returns the next callback needing execution. If a callback is configured to repeat via iterations or until, it will be returned until the completion criteria is met.When the queue is empty, null is returned.
 * @return
 */
public native final JavaScriptObject next()/*-{
return this.next(); 
}-*/;
///** 
// * Returns the next callback needing execution. If a callback is configured to repeat via iterations or until, it will be returned until the completion criteria is met.When the queue is empty, null is returned.
// * @return
// */
//public native final AsyncQueueItem nextJava()/*-{
//return @org.sgx.yuigwt.yui.util.YuiCallbackManager::getJava(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)("AsyncQueue", this.next());
//}-*/;

/**
 * Pause the execution of the queue after the execution of the current callback completes. If called from code outside of a queued callback, clears the timeout for the pending callback. Paused queue can be restarted with q.run()
 * @return self for method chaining
 */
public native final AsyncQueue pause() /*-{
this.pause(); 
return this; 
}-*/;
/**
 * Promotes the named callback to the top of the queue. If a callback is currently executing or looping (via until or iterations), the promotion is scheduled to occur after the current callback has completed.
 * @param jsf
 * @return
 */
public native final AsyncQueue promote(JavaScriptObject jsf)/*-{
this.promote(jsf);
return this;   
}-*/;
///**
// * Promotes the named callback to the top of the queue. If a callback is currently executing or looping (via until or iterations), the promotion is scheduled to occur after the current callback has completed.
// * @param c
// * @return
// */
//public native final SimpleCallback promote(SimpleCallback c)/*-{
//this.promote(@org.sgx.yuigwt.yui.util.YuiCallbackManager::getJs(Ljava/lang/String;Ljava/lang/Object;)("AsyncQueue", c));
//return this;
//}-*/;
/**
 * Promotes the named callback to the top of the queue. If a callback is currently executing or looping (via until or iterations), the promotion is scheduled to occur after the current callback has completed.
 * @param c
 * @return
 */
public native final AsyncQueue promote(String id)/*-{
//this.promote(@org.sgx.yuigwt.yui.util.YuiCallbackManager::getJs(Ljava/lang/String;Ljava/lang/Object;)("AsyncQueue", c));
this.promote(id); 
return this;
}-*/;
/**
 * Removes the callback from the queue. If the queue is active, the removal is scheduled to occur after the current callback has completed.
 * @param jsf
 * @return
 */
public native final AsyncQueue remove(JavaScriptObject jsf)/*-{
this.remove(jsf);
return this;   
}-*/;
///**
// * Removes the callback from the queue. If the queue is active, the removal is scheduled to occur after the current callback has completed.
// * @param c
// * @return
// */
//public native final SimpleCallback remove(SimpleCallback c)/*-{
//this.remove(@org.sgx.yuigwt.yui.util.YuiCallbackManager::getJs(Ljava/lang/String;Ljava/lang/Object;)("AsyncQueue", c));
//return this;
//}-*/;
/**
 * Removes the callback from the queue. If the queue is active, the removal is scheduled to occur after the current callback has completed.
 * @param c
 * @return
 */
public native final AsyncQueue remove(String id)/*-{
//this.remove(@org.sgx.yuigwt.yui.util.YuiCallbackManager::getJs(Ljava/lang/String;Ljava/lang/Object;)("AsyncQueue", c));
this.remove(id); 
return this;
}-*/;
/**
 * Sets the queue in motion. All queued callbacks will be executed in order unless pause() or stop() is called or if one of the callbacks is configured with autoContinue: false.
 * @return
 */
public native final AsyncQueue run() /*-{
this.run(); 
return this; 
}-*/;

/**
 * @return Returns the number of callbacks in the queue.
 */
public native final int size() /*-{
return this.size();
}-*/;

/**
 * Stop and clear the queue after the current execution of the current callback completes.
 * @return
 */
public native final AsyncQueue stop() /*-{
this.stop(); 
return this; 
}-*/;
}
