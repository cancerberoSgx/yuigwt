package org.sgx.yuigwt.alloyui;

import org.sgx.yuigwt.alloyui.widget.buttonitem.ButtonItem;
import org.sgx.yuigwt.alloyui.widget.buttonitem.ButtonItemConfig;
import org.sgx.yuigwt.alloyui.widget.colorpicker.ColorPicker;
import org.sgx.yuigwt.alloyui.widget.colorpicker.ColorPickerConfig;
import org.sgx.yuigwt.yui.YuiContext;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * adds specific AUI studd to the YUI context. Example:

<pre>
AUI.Ready(new String[]{"aui-button-item"}, new AUICallback() {		
	
	public void ready(AuiContext A) {
		Node n = A.one("foo"); 
		ButtonItem button1 = A.newButtonItem(ButtonItemConfig.create().
			icon("home").label("home"));
		....
	}
}); 

-- OR --
AUI.AUI(AuiConfig.create.()...).ready(new String[]{"aui-button-item"}, new AUICallback() { ....

</pre>

 * @author sg
 *
 */
public class AuiContext extends YuiContext {
protected AuiContext(){}

public native final ButtonItem newButtonItem(ButtonItemConfig cfg)/*-{
return new this.ButtonItem(cfg); 
}-*/;
public native final ButtonItem newButtonItem(JavaScriptObject cfg)/*-{
return new this.ButtonItem(cfg); 
}-*/;


public native final ColorPicker newColorPicker(ColorPickerConfig cfg)/*-{
return new this.ColorPicker(cfg); 
}-*/;
public native final ColorPicker newColorPicker(JavaScriptObject cfg)/*-{
return new this.ColorPicker(cfg); 
}-*/;
}
