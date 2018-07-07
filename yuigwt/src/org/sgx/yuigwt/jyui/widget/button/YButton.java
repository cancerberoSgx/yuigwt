package org.sgx.yuigwt.jyui.widget.button;

import org.sgx.yuigwt.jyui.widget.YWidget;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
/**
 * 
 * @author sg
 *
 */
public class YButton extends YWidget {

	public YButton(YuiContext y, YButtonConfig config) {
		super(y);
		_wrapped = y.newButton(config.getWrapped());  
	}
	public YButton(YuiContext y) {
		super(y);
		_wrapped = y.newButton(ButtonConfig.create());  
	}
	public YButton(YuiContext y, String label) {
		super(y);
		_wrapped = y.newButton(ButtonConfig.create().label(label));  
	}
	public Button _wrappedButton() {
		return _wrapped.cast(); 
	}
	
}