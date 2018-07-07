package org.sgx.yuigwt.yui.get;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Provides dynamic loading of remote JavaScript and CSS resources. static class
 * Y.Get http://yuilibrary.com/yui/docs/api/classes/Get.html
 * 
 * @author sg
 * 
 */
public class Get extends JavaScriptObject {
	protected Get() {
	}

	/**
	 * Loads one or more CSS files.</br> The urls parameter may be provided as a
	 * URL string, a request object, or an array of URL strings and/or request
	 * objects.</br>
	 * 
	 * A request object is just an object that contains a url property and zero
	 * or more options that should apply specifically to that request.
	 * Request-specific options take priority over transaction-level options and
	 * default options.</br>
	 * 
	 * URLs may be relative or absolute, and do not have to have the same origin
	 * as the current page.</br>
	 * 
	 * The options parameter may be omitted completely and a callback passed in
	 * its place, if desired.</br>
	 * 
	 * @param urls
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction css(String urls)/*-{
		//		$wnd.alert(this+" - "+urls); 
		return this.css(urls);
	}-*/;

	/**
	 * Loads one or more CSS files.</br> The urls parameter may be provided as a
	 * URL string, a request object, or an array of URL strings and/or request
	 * objects.</br>
	 * 
	 * A request object is just an object that contains a url property and zero
	 * or more options that should apply specifically to that request.
	 * Request-specific options take priority over transaction-level options and
	 * default options.</br>
	 * 
	 * URLs may be relative or absolute, and do not have to have the same origin
	 * as the current page.</br>
	 * 
	 * The options parameter may be omitted completely and a callback passed in
	 * its place, if desired.</br>
	 * 
	 * @param urls
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction css(String[] urls)/*-{
		return this
				.css(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(urls));
	}-*/;

	/**
	 * Loads one or more CSS files.</br> The urls parameter may be provided as a
	 * URL string, a request object, or an array of URL strings and/or request
	 * objects.</br>
	 * 
	 * A request object is just an object that contains a url property and zero
	 * or more options that should apply specifically to that request.
	 * Request-specific options take priority over transaction-level options and
	 * default options.</br>
	 * 
	 * URLs may be relative or absolute, and do not have to have the same origin
	 * as the current page.</br>
	 * 
	 * The options parameter may be omitted completely and a callback passed in
	 * its place, if desired.</br>
	 * 
	 * @param urls
	 *            - URL string, request object, or array of URLs and/or request
	 *            objects to load.
	 * 
	 * @param options
	 *            - Options for this transaction. See the Y.Get.options property
	 *            for a complete list of available options.
	 * 
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction css(String urls, GetConfig options)/*-{
		return this.css(urls, options);
	}-*/;

	/**
	 * Loads one or more CSS files.</br> The urls parameter may be provided as a
	 * URL string, a request object, or an array of URL strings and/or request
	 * objects.</br>
	 * 
	 * A request object is just an object that contains a url property and zero
	 * or more options that should apply specifically to that request.
	 * Request-specific options take priority over transaction-level options and
	 * default options.</br>
	 * 
	 * URLs may be relative or absolute, and do not have to have the same origin
	 * as the current page.</br>
	 * 
	 * The options parameter may be omitted completely and a callback passed in
	 * its place, if desired.</br>
	 * 
	 * @param urls
	 *            - URL string, request object, or array of URLs and/or request
	 *            objects to load.
	 * 
	 * @param options
	 *            - Options for this transaction. See the Y.Get.options property
	 *            for a complete list of available options.
	 * 
	 * @param callback
	 *            SimpleCallback function to be called on completion. This is a
	 *            general callback and will be called before any more granular
	 *            callbacks (onSuccess, onFailure, etc.) specified in the
	 *            options object.
	 * 
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction css(String urls, GetConfig options,
			GetCallback callback)/*-{
		return this.css(
			urls,
			options,
			$entry(function(err, tx) {
				return callback.@org.sgx.yuigwt.yui.get.GetCallback::call(Lcom/google/gwt/core/client/JsArray;Lorg/sgx/yuigwt/yui/get/Transaction;)(err, tx); 
			}));
	}-*/;

	/**
	 * Loads one or more CSS files.</br> The urls parameter may be provided as a
	 * URL string, a request object, or an array of URL strings and/or request
	 * objects.</br>
	 * 
	 * A request object is just an object that contains a url property and zero
	 * or more options that should apply specifically to that request.
	 * Request-specific options take priority over transaction-level options and
	 * default options.</br>
	 * 
	 * URLs may be relative or absolute, and do not have to have the same origin
	 * as the current page.</br>
	 * 
	 * The options parameter may be omitted completely and a callback passed in
	 * its place, if desired.</br>
	 * 
	 * @param urls
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction js(String urls)/*-{
		//		$wnd.alert(this+" - "+urls); 
		return this.js(urls);
	}-*/;

	/**
	 * Loads one or more CSS files.</br> The urls parameter may be provided as a
	 * URL string, a request object, or an array of URL strings and/or request
	 * objects.</br>
	 * 
	 * A request object is just an object that contains a url property and zero
	 * or more options that should apply specifically to that request.
	 * Request-specific options take priority over transaction-level options and
	 * default options.</br>
	 * 
	 * URLs may be relative or absolute, and do not have to have the same origin
	 * as the current page.</br>
	 * 
	 * The options parameter may be omitted completely and a callback passed in
	 * its place, if desired.</br>
	 * 
	 * @param urls
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction js(String[] urls)/*-{
		return this
				.js(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(urls));
	}-*/;

	/**
	 * Loads one or more CSS files.</br> The urls parameter may be provided as a
	 * URL string, a request object, or an array of URL strings and/or request
	 * objects.</br>
	 * 
	 * A request object is just an object that contains a url property and zero
	 * or more options that should apply specifically to that request.
	 * Request-specific options take priority over transaction-level options and
	 * default options.</br>
	 * 
	 * URLs may be relative or absolute, and do not have to have the same origin
	 * as the current page.</br>
	 * 
	 * The options parameter may be omitted completely and a callback passed in
	 * its place, if desired.</br>
	 * 
	 * @param urls
	 *            - URL string, request object, or array of URLs and/or request
	 *            objects to load.
	 * 
	 * @param options
	 *            - Options for this transaction. See the Y.Get.options property
	 *            for a complete list of available options.
	 * 
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction js(String urls, GetConfig options)/*-{
		return this.js(urls, options);
	}-*/;

	/**
	 * Loads one or more JavaScript resources. </br> The urls parameter may be
	 * provided as a URL string, a request object, or an array of URL strings
	 * and/or request objects. </br> A request object is just an object that
	 * contains a url property and zero or more options that should apply
	 * specifically to that request. Request-specific options take priority over
	 * transaction-level options and default options. </br> URLs may be relative
	 * or absolute, and do not have to have the same origin as the current page.
	 * </br> The options parameter may be omitted completely and a callback
	 * passed in its place, if desired. </br> Scripts will be executed in the
	 * order they're specified unless the async option is true, in which case
	 * they'll be loaded in parallel and executed in whatever order they finish
	 * loading. </br>
	 * 
	 * @param urls
	 *            - URL string, request object, or array of URLs and/or request
	 *            objects to load.
	 * 
	 * @param options
	 *            - Options for this transaction. See the Y.Get.options property
	 *            for a complete list of available options.
	 * 
	 * @param callback
	 *            SimpleCallback function to be called on completion. This is a
	 *            general callback and will be called before any more granular
	 *            callbacks (onSuccess, onFailure, etc.) specified in the
	 *            options object.
	 * 
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction js(String urls, GetConfig options,
			GetCallback callback)/*-{
		return this.js(urls, options, 
			$entry(function(err, tx){
				return callback.@org.sgx.yuigwt.yui.get.GetCallback::call(Lcom/google/gwt/core/client/JsArray;Lorg/sgx/yuigwt/yui/get/Transaction;)(err, tx);
			})); 
	}-*/;

	/**
	 * Loads one or more CSS files.</br> The urls parameter may be provided as a
	 * URL string, a request object, or an array of URL strings and/or request
	 * objects.</br>
	 * 
	 * A request object is just an object that contains a url property and zero
	 * or more options that should apply specifically to that request.
	 * Request-specific options take priority over transaction-level options and
	 * default options.</br>
	 * 
	 * URLs may be relative or absolute, and do not have to have the same origin
	 * as the current page.</br>
	 * 
	 * The options parameter may be omitted completely and a callback passed in
	 * its place, if desired.</br>
	 * 
	 * @param urls
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction script(String urls)/*-{
		//		$wnd.alert(this+" - "+urls); 
		return this.script(urls);
	}-*/;

	/**
	 * Loads one or more CSS files.</br> The urls parameter may be provided as a
	 * URL string, a request object, or an array of URL strings and/or request
	 * objects.</br>
	 * 
	 * A request object is just an object that contains a url property and zero
	 * or more options that should apply specifically to that request.
	 * Request-specific options take priority over transaction-level options and
	 * default options.</br>
	 * 
	 * URLs may be relative or absolute, and do not have to have the same origin
	 * as the current page.</br>
	 * 
	 * The options parameter may be omitted completely and a callback passed in
	 * its place, if desired.</br>
	 * 
	 * @param urls
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction script(String[] urls)/*-{
		return this
				.script(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(urls));
	}-*/;

	/**
	 * Loads one or more CSS files.</br> The urls parameter may be provided as a
	 * URL string, a request object, or an array of URL strings and/or request
	 * objects.</br>
	 * 
	 * A request object is just an object that contains a url property and zero
	 * or more options that should apply specifically to that request.
	 * Request-specific options take priority over transaction-level options and
	 * default options.</br>
	 * 
	 * URLs may be relative or absolute, and do not have to have the same origin
	 * as the current page.</br>
	 * 
	 * The options parameter may be omitted completely and a callback passed in
	 * its place, if desired.</br>
	 * 
	 * @param urls
	 *            - URL string, request object, or array of URLs and/or request
	 *            objects to load.
	 * 
	 * @param options
	 *            - Options for this transaction. See the Y.Get.options property
	 *            for a complete list of available options.
	 * 
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction script(String urls, GetConfig options)/*-{
		return this.script(urls, options);
	}-*/;

	/**
	 * Loads one or more JavaScript resources. </br> The urls parameter may be
	 * provided as a URL string, a request object, or an array of URL strings
	 * and/or request objects. </br> A request object is just an object that
	 * contains a url property and zero or more options that should apply
	 * specifically to that request. Request-specific options take priority over
	 * transaction-level options and default options. </br> URLs may be relative
	 * or absolute, and do not have to have the same origin as the current page.
	 * </br> The options parameter may be omitted completely and a callback
	 * passed in its place, if desired. </br> Scripts will be executed in the
	 * order they're specified unless the async option is true, in which case
	 * they'll be loaded in parallel and executed in whatever order they finish
	 * loading. </br>
	 * 
	 * @param urls
	 *            - URL string, request object, or array of URLs and/or request
	 *            objects to load.
	 * 
	 * @param options
	 *            - Options for this transaction. See the Y.Get.options property
	 *            for a complete list of available options.
	 * 
	 * @param callback
	 *            SimpleCallback function to be called on completion. This is a
	 *            general callback and will be called before any more granular
	 *            callbacks (onSuccess, onFailure, etc.) specified in the
	 *            options object.
	 * 
	 * @return Get.Transaction: Transaction object.
	 */
	public final native Transaction script(String urls, GetConfig options,
			GetCallback callback)/*-{
		return this.script(urls, options, 
			$entry(function(err, tx){
				return callback.@org.sgx.yuigwt.yui.get.GetCallback::call(Lcom/google/gwt/core/client/JsArray;Lorg/sgx/yuigwt/yui/get/Transaction;)(err, tx);
			}));
	}-*/;

}
