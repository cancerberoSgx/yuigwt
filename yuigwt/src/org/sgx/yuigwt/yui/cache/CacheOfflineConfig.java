package org.sgx.yuigwt.yui.cache;
/**
 * 
 * @author sg
 *
 */
public class CacheOfflineConfig extends CacheConfig {
	protected CacheOfflineConfig() {
	}

	/**
	 * A string that must be passed in via the constructor. This identifier is
	 * used to sandbox one cache instance's entries from another. Calling the
	 * cache instance's flush and length methods or get("entries") will apply to
	 * only these sandboxed entries.Default: "default"
	 * 
	 * @return
	 */
	public native final String sandbox() /*-{
		return this.sandbox;
	}-*/;

	/**
	 * A string that must be passed in via the constructor. This identifier is
	 * used to sandbox one cache instance's entries from another. Calling the
	 * cache instance's flush and length methods or get("entries") will apply to
	 * only these sandboxed entries.Default: "default"
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CacheOfflineConfig sandbox(String val) /*-{
		this.sandbox = val;
		return this;
	}-*/;
}
