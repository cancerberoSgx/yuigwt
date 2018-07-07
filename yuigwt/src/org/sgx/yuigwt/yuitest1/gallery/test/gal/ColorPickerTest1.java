package org.sgx.yuigwt.yuitest1.gallery.test.gal;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiConfig.Module;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.colorpicker.ColorPicker;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;
/**
 * galler-colorpicker module test
 * @author sg
 *
 */
public class ColorPickerTest1 extends AbstractTest {

protected Console console;
protected ColorPicker cp1;

public ColorPickerTest1() {
	super("colorPicker1", "colorPicker1", new String[]{GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_GALLERY}, 
		TestResources.instance.gal_ColorPickerTest1());
}

public static final String MISSING_CSS="http://yui.yahooapis.com/combo?gallery-2011.09.14-20-40/build/gallery-colorpicker/assets/gallery-colorpicker-core.css";


public void test(final Node parent) {
	
YUI.YUI(
	YuiConfig.create()
		.gallery(GalleryConstants.LATEST_BUILD)
		/* gallery-colorpicker bug: must load its css file explicitly - 
		 * we could also use Y.Get() but this is nicer.  
		 */
		.module("gallery-colorpicker-missing-css", Module.create()
				.async(true).fullpath(MISSING_CSS).type("css")
		)	
	).use(new String[]{"gallery-colorpicker",  "gallery-colorpicker-missing-css", "console", "button"}, new YUICallback() {
		
	
	public void ready(YuiContext Y_) {
		
		//cast to YuiGalleryContext for using the yui gallery java api.
		final YuiGalleryContext Y = Y_.cast(); 
		
		console = Y.newConsole().render().cast(); 
		console.boundingBox().setStyles(Style.create().left("70px")); 
		
		cp1 = Y.newColorPicker();
		cp1.render(parent); 
		
		Y.newButton(ButtonConfig.create().
			label("get color").
			on("click", new EventCallback<EventFacade>() {
			
			public void call(EventFacade e) {
				console.log("color hex: "+cp1.hex()); 
			}
		})).render(parent); 
		
	}
}); 
}

}
