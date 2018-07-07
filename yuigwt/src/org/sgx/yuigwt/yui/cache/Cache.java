package org.sgx.yuigwt.yui.cache;

import org.sgx.yuigwt.yui.base.Base;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Cache Utility provides a basic caching mechanism for storing key/value
 * pairs in local JavaScript memory. As a subclass of Plugin, it is designed to
 * seamlessly integrate with other components (such as DataSource). This is the
 * Base class for the YUI Cache utility.
 * 
 * @see http://yuilibrary.com/yui/docs/cache/
 * @see http://yuilibrary.com/yui/docs/api/classes/Cache.html
 * 
 *      Notes - you can use JavaScriptObject, string and double types - I'm not
 *      sure if this support java objects as keys or values.
 * @author sg
 * 
 */
public class Cache extends Base {
	protected Cache() {
	}

	/**
	 * Adds a new entry to the cache of the format {request:request,
	 * response:response, cached:cached, expires:expires}. If cache is full,
	 * evicts the stalest entry before adding the new one.
	 * 
	 * @param request
	 *            Request value.
	 * @param response
	 *            response value
	 * @return self for method chaining
	 */
	public native final Cache add(JavaScriptObject request,
			JavaScriptObject response)/*-{
		this.add(request, response);
		return this;
	}-*/;

	/**
	 * Adds a new entry to the cache of the format {request:request,
	 * response:response, cached:cached, expires:expires}. If cache is full,
	 * evicts the stalest entry before adding the new one.
	 * 
	 * @param request
	 *            Request value.
	 * @param response
	 *            response value
	 * @return self for method chaining
	 */
	public native final Cache add(String request, JavaScriptObject response)/*-{
		this.add(request, response);
		return this;
	}-*/;
	/**
	 * Adds a new entry to the cache of the format {request:request,
	 * response:response, cached:cached, expires:expires}. If cache is full,
	 * evicts the stalest entry before adding the new one.
	 * 
	 * @param request
	 *            Request value.
	 * @param response
	 *            response value
	 * @return self for method chaining
	 */
	public native final Cache add(String request, String response)/*-{
		this.add(request, response);
		return this;
	}-*/;

	/**
	 * Adds a new entry to the cache of the format {request:request,
	 * response:response, cached:cached, expires:expires}. If cache is full,
	 * evicts the stalest entry before adding the new one.
	 * 
	 * @param request
	 *            Request value.
	 * @param response
	 *            response value
	 * @return self for method chaining
	 */
	public native final Cache add(String request, double response)/*-{
		this.add(request, response);
		return this;
	}-*/;

	/**
	 * Adds a new entry to the cache of the format {request:request,
	 * response:response, cached:cached, expires:expires}. If cache is full,
	 * evicts the stalest entry before adding the new one.
	 * 
	 * @param request
	 *            Request value.
	 * @param response
	 *            response value
	 * @return self for method chaining
	 */
	public native final Cache add(String request, int response)/*-{
		this.add(request, response);
		return this;
	}-*/;

	/**
	 * Flushes cache.
	 * 
	 * @return
	 */
	public native final Cache flush()/*-{
		this.flush();
		return this;
	}-*/;

	/**
	 * Retrieves cached object for given request, if available, and refreshes
	 * entry in the cache. Returns null if there is no cache match.
	 * 
	 * @param request
	 *            Request object.
	 * @return Cached object with the properties request and response, or null.
	 */
	public native final CacheEntry retrieve(JavaScriptObject request)/*-{
		return this.retrieve(request);
	}-*/;
	/**
	 * Retrieves cached object for given request, if available, and refreshes
	 * entry in the cache. Returns null if there is no cache match.
	 * 
	 * @param request
	 *            Request object.
	 * @return Cached object with the properties request and response, or null.
	 */
	public native final CacheEntry retrieve(String request)/*-{
		return this.retrieve(request);
	}-*/;
	
//	/**
//	 * Retrieves cached object for given request, if available, and refreshes
//	 * entry in the cache. Returns null if there is no cache match.
//	 * 
//	 * @param request
//	 *            Request object.
//	 * @return Cached object with the properties request and response, or null.
//	 */
//	public native final JavaScriptObject retrieveObj(JavaScriptObject request)/*-{
//		return this.retrieve(request);
//	}-*/;
//
//	/**
//	 * Retrieves cached object for given request, if available, and refreshes
//	 * entry in the cache. Returns null if there is no cache match.
//	 * 
//	 * @param request
//	 *            Request object.
//	 * @return Cached object with the properties request and response, or null.
//	 */
//	public native final JavaScriptObject retrieveObj(String request)/*-{
//		return this.retrieve(request);
//	}-*/;
//
//	/**
//	 * Retrieves cached object for given request, if available, and refreshes
//	 * entry in the cache. Returns null if there is no cache match.
//	 * 
//	 * @param request
//	 *            Request object.
//	 * @return Cached object with the properties request and response, or null.
//	 */
//	public native final String retrieveString(String request)/*-{
//		return this.retrieve(request)+"";
//	}-*/;
//
//	/**
//	 * Retrieves cached object for given request, if available, and refreshes
//	 * entry in the cache. Returns null if there is no cache match.
//	 * 
//	 * @param request
//	 *            Request object.
//	 * @return Cached object with the properties request and response, or null.
//	 */
//	public native final double retrieveDouble(String request)/*-{
//		return this.retrieve(request);		
//	}-*/;
//
//	/**
//	 * Retrieves cached object for given request, if available, and refreshes
//	 * entry in the cache. Returns null if there is no cache match.
//	 * 
//	 * @param request
//	 *            Request object.
//	 * @return Cached object with the properties request and response, or null.
//	 */
//	public native final int retrieveInt(String request)/*-{
//		return this.retrieve(request);
//	}-*/;
}
