package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_SLIDER;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import net.sourceforge.htmlunit.corejs.javascript.ast.NewExpression;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.slider.Slider;
import org.sgx.yuigwt.yui.widget.slider.SliderConfig;
import org.sgx.yuigwt.yui.widget.slider.SliderEvent;

import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.user.client.Window;

public class SliderTest1 extends AbstractTest {

public SliderTest1() {
	super("slider1", "slider widget tests", new String[]{TAG_SLIDER, TAG_WIDGET}, TestResources.instance.SliderTest1());
}


public void test(final Node parent) {
	YUI.YUI().use(new String[]{"slider"}, new YUICallback() {
	
		
		public void ready(YuiContext Y) {
			parent.append("<p>First a horizontal default slider...");
			Node n1 = parent.appendChild("<span></span>").cast();
			Widget slider1 = Y.newSlider().render(n1); 
//			slider1.on(TYPE, c)
			
			parent.append("<p>Now a vertical, custom slider...");
			Node n2 = parent.appendChild("<span>unknownsoldierflag123</span>").cast();
			final Slider sl2 = Y.newSlider(SliderConfig.create().axis("y").min(1).max(5).value(3).length(200)).render(n2).cast();
			sl2.on(Slider.EVENT_SLIDEEND, new EventCallback<SliderEvent>() {

				
				public void call(SliderEvent e) {
					Window.alert("slider value change detected: "+sl2.getInt("value")); 
				}
			});
		}
	}); 
}

}
