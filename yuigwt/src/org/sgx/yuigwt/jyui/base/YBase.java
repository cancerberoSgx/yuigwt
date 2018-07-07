package org.sgx.yuigwt.jyui.base;

import org.sgx.yuigwt.jyui.attribute.YAttribute;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.base.Base;
import org.sgx.yuigwt.yui.base.BaseConfig;
import org.sgx.yuigwt.yui.yui.PluginBase;

/**
 * 100% Java Wrapper for Base
 * @author sg
 *
 */
public class YBase extends YAttribute {

	public YBase(YuiContext y) {
		super(y);
	}
	
	public org.sgx.yuigwt.yui.base.Base _wrappedBase() {
		return _wrapped.cast(); 
	}
	
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.base.Base#destroy()
	 */
	public  Base destroy() {
		return _wrappedBase().destroy();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.base.Base#initialized()
	 */
	public  boolean initialized() {
		return _wrappedBase().initialized();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.base.Base#initialized(boolean)
	 */
	public  Base initialized(boolean val) {
		return _wrappedBase().initialized(val);
	}

	/**
	 * @param p
	 * @return
	 * @see org.sgx.yuigwt.yui.base.Base#plug(org.sgx.yuigwt.yui.yui.PluginBase)
	 */
	public  Base plug(PluginBase p) {
		return _wrappedBase().plug(p);
	}

	/**
	 * @param p
	 * @param config
	 * @return
	 * @see org.sgx.yuigwt.yui.base.Base#plug(org.sgx.yuigwt.yui.yui.PluginBase, org.sgx.yuigwt.yui.base.BaseConfig)
	 */
	public  Base plug(PluginBase p, BaseConfig config) {
		return _wrappedBase().plug(p, config);
	}

	/**
	 * @param p
	 * @return
	 * @see org.sgx.yuigwt.yui.base.Base#unplug(org.sgx.yuigwt.yui.yui.PluginBase)
	 */
	public  Base unplug(PluginBase p) {
		return _wrappedBase().unplug(p);
	}

	/**
	 * @param pluginName
	 * @return
	 * @see org.sgx.yuigwt.yui.base.Base#getPlugin(java.lang.String)
	 */
	public  PluginBase getPlugin(String pluginName) {
		return _wrappedBase().getPlugin(pluginName);
	} 
	

	
}
