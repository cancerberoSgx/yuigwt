package org.sgx.yuigwt.jyui.base;

import org.sgx.yuigwt.jyui.attribute.YAttributeConfig;
import org.sgx.yuigwt.yui.base.BaseConfig;
import org.sgx.yuigwt.yui.yui.PluginBase;

/**
 * 100% Java wrapper for type org.sgx.yuigwt.yui.base.BaseConfig
 * 
 * @author sg
 * 
 */
public class YBaseConfig extends YAttributeConfig {
	public YBaseConfig() {
		super();
	}

	public BaseConfig _wrappedBaseConfig() {
		return _wrapped.cast();
	}

	/**
	 * Flag indicating whether or not this object has been through the destroy
	 * lifecycle phase.
	 * 
	 * @return
	 */

	public boolean destroyed() {
		return _wrappedBaseConfig().destroyed();
	}

	/**
	 * Flag indicating whether or not this object has been through the destroy
	 * lifecycle phase.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */

	public BaseConfig destroyed(boolean destroyed) {
		return _wrappedBaseConfig().destroyed(destroyed);
	}

	/**
	 * Flag indicating whether or not this object has been through the destroy
	 * lifecycle phase.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */

	public BaseConfig plugins(PluginBase[] plugins) {
		return _wrappedBaseConfig().plugins(plugins);
	}

	public BaseConfig plugins(PluginBase plugins) {
		return _wrappedBaseConfig().plugins(plugins);
	}

}
