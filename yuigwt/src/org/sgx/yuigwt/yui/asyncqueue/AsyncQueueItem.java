package org.sgx.yuigwt.yui.asyncqueue;

import org.sgx.yuigwt.yui.util.SimpleCallback;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * a callback function object : 
 * <pre>
 * 
    fn -- The callback function
    context -- The execution context for the callbackFn.
    args -- Arguments to pass to callbackFn.
    timeout -- Millisecond delay before executing callbackFn. (Applies to each iterative execution of callback)
    iterations -- Number of times to repeat the callback.
    until -- Repeat the callback until this function returns true. This setting trumps iterations.
    autoContinue -- Set to false to prevent the AsyncQueue from executing the next callback in the Queue after the callback completes.
    id -- Name that can be used to get, promote, get the indexOf, or delete this callback.

 * </pre>
 * @author sg
 *
 */
public class AsyncQueueItem extends JavaScriptObject {
protected AsyncQueueItem(){}
public static final native AsyncQueueItem create()/*-{
	return {}
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final AsyncQueueItem fn(SimpleCallback val) /*-{
var f = $entry(function(){
	return val.@org.sgx.yuigwt.yui.util.SimpleCallback::call(*)();  
}); 
this.fn = f; 
return this; 
}-*/;


/**
 * Repeat the callback until this function returns true. This setting trumps iterations.
 * @param val
 * @return this - for setter chaining
 */
public native final AsyncQueueItem until(SimpleCallback val) /*-{
var f = $entry(function(){
	return val.@org.sgx.yuigwt.yui.util.SimpleCallback::call(*)();  
}); 
this.until = f; 
return this; 
}-*/;
/**
 * Set to false to prevent the AsyncQueue from executing the next callback in the Queue after the callback completes.
 * @param autoContinue
 * @return
 */
public native final AsyncQueueItem autoContinue(boolean autoContinue) /*-{
this.autoContinue = autoContinue; 
return this; 
}-*/;

/**
 * Name that can be used to get, promote, get the indexOf, or delete this callback.
 * @return
 */
public native final String id() /*-{
return this.id; 
}-*/;

/**
 * Name that can be used to get, promote, get the indexOf, or delete this callback.
 * @param val
 * @return this - for setter chaining
 */
public native final AsyncQueueItem id(String val) /*-{
this.id = val; 
return this; 
}-*/;
/**
 * Number of times to repeat the callback. 
 * @return
 */
public native final int iterations() /*-{
return this.iterations; 
}-*/;

/**
 * Number of times to repeat the callback. 
 * @param val
 * @return this - for setter chaining
 */
public native final AsyncQueueItem iterations(int val) /*-{
this.iterations = val; 
return this; 
}-*/;
/**
 * Millisecond delay before executing callbackFn. (Applies to each iterative execution of callback)
 * @return
 */
public native final int timeout() /*-{
return this.timeout; 
}-*/;

/**
 * Millisecond delay before executing callbackFn. (Applies to each iterative execution of callback)
 * @param val
 * @return this - for setter chaining
 */
public native final AsyncQueueItem timeout(int val) /*-{
this.timeout = val; 
return this; 
}-*/;

/**
 * Arguments to pass to callbackFn
 * @return
 */
public native final JavaScriptObject args() /*-{
return this.args; 
}-*/;

/**
 * Arguments to pass to callbackFn
 * @param val
 * @return this - for setter chaining
 */
public native final AsyncQueueItem args(JavaScriptObject val) /*-{
this.args = val; 
return this; 
}-*/;
}
