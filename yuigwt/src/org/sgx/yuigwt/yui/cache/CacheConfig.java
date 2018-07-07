package org.sgx.yuigwt.yui.cache;

import java.util.Date;

import org.sgx.yuigwt.yui.base.BaseConfig;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsDate;

public class CacheConfig extends BaseConfig {
	protected CacheConfig() {
	}
	public static final native CacheConfig create()/*-{
		return {}; 
	}-*/;

	/**
	 * 
	 * @return Cached entries.
	 */
	public native final JsArray<JavaScriptObject> entries() /*-{
		return this.entries;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final JsDate expiresJsDate() /*-{
		return this.expires;
	}-*/;

	/**
	 * Absolute DataTypeDate when data expires or relative number of milliseconds. Zero
	 * disables expiration. Default: 0
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CacheConfig expires(JsDate val) /*-{
		this.expires = val;
		return this;
	}-*/;

//	/**
//	 * Absolute DataTypeDate when data expires or relative number of milliseconds. Zero
//	 * disables expiration. Default: 0
//	 * 
//	 * @param val
//	 * @return this - for setter chaining
//	 */
//	public native final CacheConfig expires(DataTypeDate val) /*-{
//		this.expires = @org.sgx.yuigwt.yui.util.JsUtil::toJsDate(Ljava/util/DataTypeDate;)(val);
//		return this;
//	}-*/;

	/**
	 * Absolute DataTypeDate when data expires or relative number of milliseconds. Zero
	 * disables expiration. Default: 0
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CacheConfig expires(int val) /*-{
		this.expires = val;
		return this;
	}-*/;

	/**
	 * Maximum number of entries the Cache can hold. Set to 0 to turn off
	 * caching.Default: 0
	 * 
	 * @return
	 */
	public native final int max() /*-{
		return this.max;
	}-*/;

	/**
	 * Maximum number of entries the Cache can hold. Set to 0 to turn off
	 * caching.Default: 0
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CacheConfig max(int val) /*-{
		this.max = val;
		return this;
	}-*/;

	/**
	 * DataTypeNumber of entries currently cached.
	 * 
	 * @return
	 */
	public native final int size() /*-{
		return this.size;
	}-*/;

	/**
	 * DataTypeNumber of entries currently cached.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CacheConfig size(int val) /*-{
		this.size = val;
		return this;
	}-*/;

	/**
	 * Validate uniqueness of stored keys. Default is false and is more
	 * performant.
	 * 
	 * @return
	 */
	public native final boolean uniqueKeys() /*-{
		return this.uniqueKeys;
	}-*/;

	/**
	 * Validate uniqueness of stored keys. Default is false and is more
	 * performant.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CacheConfig uniqueKeys(boolean val) /*-{
		this.uniqueKeys = val;
		return this;
	}-*/;

	// /**
	// *
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final CacheConfig entries(JsArr<JavaScriptObject> val)
	// /*-{
	// this.entries = val;
	// return this;
	// }-*/;
}
