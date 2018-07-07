package org.sgx.yuigwt.yuigallery.deferred;

import org.sgx.yuigwt.yui.util.Callback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A deferred keeps two lists of callbacks, one for the success scenario and another for the failure case. It runs these callbacks once a call to resolve() or reject() is made. This class is designed to augment others
 * @see http://yuilibrary.com/gallery/show/deferred
 * @see http://juandopazo.github.com/yui3-gallery/src/gallery-deferred/api/classes/Promise.html
 * @author sg
 *
 */
public class Promise extends JavaScriptObject {
protected Promise(){}

/**
 * Adds callbacks to the list of callbacks tracked by the promise
 * @param doneCallbacks A function or array of functions to run when the promise is resolved
 * @param failCallbacks A function or array of functions to run when the promise is rejected
 * @return self for method chaining
 */
public final native Promise then(Callback doneCallbacks, Callback failCallbacks )/*-{
	var f1 = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/Callback;)(doneCallbacks );
	var f2 = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/Callback;)(failCallbacks );
	this.then(f1, f2); 
	return this; 
}-*/;
/**
 * Adds callbacks to the list of callbacks tracked by the promise
 * @param doneCallbacks A function or array of functions to run when the promise is resolved
 * @param failCallbacks A function or array of functions to run when the promise is rejected
 * @return self for method chaining
 */
public final native Promise then(Callback doneCallbacks)/*-{
	var f1 = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/Callback;)(doneCallbacks );	
	this.then(f1); 
	return this; 
}-*/;

}
