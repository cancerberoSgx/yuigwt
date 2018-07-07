package org.sgx.yuigwt.jyui.widget.button;

import org.sgx.yuigwt.jyui.widget.YWidgetConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
/**
 * 
 * @author sg
 *
 */
public class YButtonConfig extends YWidgetConfig {
	public YButtonConfig() {
		super();
	}

	public ButtonConfig _wrappedButtonConfig() {
		return _wrapped.cast();
	}

	/**
	 * button's label
	 * 
	 * @return
	 */

	public String label() {
		return _wrappedButtonConfig().label();
	}

	/**
	 * button's label
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */

	public ButtonConfig label(String label) {
		return _wrappedButtonConfig().label(label);
	}

}
