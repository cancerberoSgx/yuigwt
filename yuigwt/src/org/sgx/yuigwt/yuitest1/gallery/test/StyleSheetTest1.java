package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.stylesheet.StyleSheet;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.slider.Slider;
import org.sgx.yuigwt.yui.widget.slider.SliderConfig;
import org.sgx.yuigwt.yui.widget.slider.SliderEvent;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
/**
 * console utility and loggin utils test
 * @author sg
 *
 */
public class StyleSheetTest1 extends AbstractTest {

public StyleSheetTest1() {
	super("stylesheet1", "console utility and loggin utils test", 
		new String[]{GalleryConstants.TAG_EVENT, GalleryConstants.TAG_SLIDER, 
		GalleryConstants.TAG_UTILS, GalleryConstants.TAG_STYLESHEET}, 
		TestResources.instance.StyleSheetTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"stylesheet", "slider"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {	
		
		final StyleSheet ss1 = Y.newStyleSheet(); 
		Slider sl1 = Y.newSlider(SliderConfig.create().min(8).max(34).value(11));
		sl1.render(parent); 
		sl1.on(Slider.EVENT_THUMBMOVE, new EventCallback() {
			
			
			public void call(EventFacade e_) {
				SliderEvent e = (SliderEvent)e_;
				String fsize = (e.offset()+8)+"px";
				ss1.set(".sstest1", Style.create().fontSize(fsize)); 
			}
		}); 
		
		parent.append("<p class=\"sstest1\">tres tristes tigres comen trigo en el trigal</p>");
	}	
}); 
}

}
