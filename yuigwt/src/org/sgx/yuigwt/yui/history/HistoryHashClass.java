package org.sgx.yuigwt.yui.history;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Provides browser history management backed by window.location.hash, as well as convenience methods for working with the location hash and a synthetic hashchange event that
 * normalizes differences across browsers.
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/HistoryHash.html
 * 
 * @author sg
 * 
 */
public class HistoryHashClass extends JavaScriptObject {
	protected HistoryHashClass() {
	}

	/**
	 * Constant used to identify state changes originating from hashchange events.
	 * 
	 * @return
	 */
	public native final String SRC_HASH() /*-{
		return this.SRC_HASH;
	}-*/;

	/**
	 * Constant used to identify state changes originating from hashchange events.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryHashClass SRC_HASH(String val) /*-{
		this.SRC_HASH = val;
		return this;
	}-*/;

	/**
	 * <p>
	 * Prefix to prepend when setting the hash fragment. For example, if the prefix is ! and the hash fragment is set to #foo=bar&baz=quux, the final hash fragment in the URL will
	 * become #!foo=bar&baz=quux. This can be used to help make an Ajax application crawlable in accordance with Google's guidelines at http://code.google.com/web/ajaxcrawling/.
	 * </p>
	 * 
	 * <p>
	 * Note that this prefix applies to all HistoryHash instances. It's not possible for individual instances to use their own prefixes since they all operate on the same URL.
	 * </p>
	 * 
	 * Default: ''
	 * 
	 * @return
	 */
	public native final String hashPrefix() /*-{
		return this["hashPrefix"];
	}-*/;

	/**
	 * <p>
	 * Prefix to prepend when setting the hash fragment. For example, if the prefix is ! and the hash fragment is set to #foo=bar&baz=quux, the final hash fragment in the URL will
	 * become #!foo=bar&baz=quux. This can be used to help make an Ajax application crawlable in accordance with Google's guidelines at http://code.google.com/web/ajaxcrawling/.
	 * </p>
	 * 
	 * <p>
	 * Note that this prefix applies to all HistoryHash instances. It's not possible for individual instances to use their own prefixes since they all operate on the same URL.
	 * </p>
	 * 
	 * Default: ''
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryHashClass hashPrefix(String val) /*-{
		this["hashPrefix"] = val;
		return this;
	}-*/;
	
	
	/**
	 * Creates a location hash string from the specified object of key/value pairs.

	 * @param params object of key/value parameter pairs
	 * @return location hash string 
	 */
	public native final String createHash(JavaScriptObject params) /*-{
		return this.createHash(params); 
	}-*/;
	
	/**
	 * Wrapper around decodeURIComponent() that also converts + chars into spaces.

	 * @param string to decode
	 * @return  decoded string  
	 */
	public native final String decode(String s) /*-{
		return this.decode(params); 
	}-*/;
	
	/**
	 * Wrapper around encodeURIComponent() that converts spaces to + chars.

	 * @param string to encode
	 * @return  encoded string  
	 */
	public native final String encode(String s) /*-{
		return this.encode(params); 
	}-*/;
	
	/**
	 * Gets the raw (not decoded) current location hash, minus the preceding '#' character and the hashPrefix (if one is set).
	 * 
	 * @return current location hash   
	 */
	public native final String getHash() /*-{
		return this.getHash(); 
	}-*/;
	
	/**
	 * Gets the raw (not decoded) current location hash from the IE iframe, minus the preceding '#' character and the hashPrefix (if one is set).
	 * 
	 * @return current iframe hash   
	 */
	public native final String getIframeHash() /*-{
		return this.getIframeHash(); 
	}-*/;
	
	/**
	 * Gets the current bookmarkable URL.
	 * 
	 * @return current bookmarkable URL    
	 */
	public native final String getUrl() /*-{
		return this.getUrl(); 
	}-*/;
	
	/**
	 * Parses a location hash string into an object of key/value parameter pairs. If hash is not specified, the current location hash will be used.
	 * @return  object of parsed key/value parameter pairs 
	 */
	public native final JsObject parseHash() /*-{
		return this.parseHash(); 
	}-*/;
	
	/**
	 * Parses a location hash string into an object of key/value parameter pairs. If hash is not specified, the current location hash will be used.
	 * @return  object of parsed key/value parameter pairs 
	 */
	public native final JsObject parseHash(String hash) /*-{
		return this.parseHash(hash); 
	}-*/;
	
	
	// TODO: other props
}
