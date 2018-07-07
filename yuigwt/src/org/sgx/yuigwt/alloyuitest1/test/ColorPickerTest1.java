package org.sgx.yuigwt.alloyuitest1.test;


import org.sgx.yuigwt.alloyui.AUI;
import org.sgx.yuigwt.alloyui.AUICallback;
import org.sgx.yuigwt.alloyui.AuiContext;
import org.sgx.yuigwt.alloyui.widget.buttonitem.ButtonItem;
import org.sgx.yuigwt.alloyui.widget.buttonitem.ButtonItemConfig;
import org.sgx.yuigwt.alloyui.widget.colorpicker.ColorPicker;
import org.sgx.yuigwt.alloyui.widget.colorpicker.ColorPickerConfig;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.SimpleCallback;
import org.sgx.yuigwt.yui.util.JsUtil;

import com.google.gwt.user.client.Window;
/**
 * colorpicker simple example, the same as http://www.liferay.com/community/liferay-projects/alloy-ui/demo?title=community-liferay-projects-alloy-ui-demos-color-picker
 * @author sg
 *
 */
public class ColorPickerTest1 extends AbstractTest {

private Node parent;
protected ColorPicker colorPiker1;

public ColorPickerTest1() {
	super("colorpicker1", "colorpicker simple example, the same as http://www.liferay.com/community/liferay-projects/alloy-ui/demo?title=community-liferay-projects-alloy-ui-demos-color-picker", 
		new String[]{}, 
		TestResources.instance.ColorPickerTest1());
}

@Override
public void test(final Node parent) {
//	this.parent = parent; 
	AUI.Use(new String[]{"aui-color-picker", "console"}, new AUICallback() {
		
		@Override
		public void ready(AuiContext Y) {
			
			final Console console = Y.newConsole().render().cast(); 
			
			//TODO: parent.getDomNode not supported in aui
			Y.one("#"+parent.get("id")).append(
				"<div id=\"demo\"></div>" +
				"<div id=\"color\"></div>"); 
			
			colorPiker1 = Y.newColorPicker(ColorPickerConfig.create().after(ColorPicker.EVENT_COLORCHANGE, new EventCallback<EventFacade>() {

				@Override
				public void call(EventFacade e) {
					console.log(colorPiker1.get("hex")); 
				}
			})); 
			colorPiker1.render("#demo"); 
//			button1.render(parent); 
		}
	}); 
}

//@Override
//public void ready(final AuiContext A) {
//	
//}
	
}
