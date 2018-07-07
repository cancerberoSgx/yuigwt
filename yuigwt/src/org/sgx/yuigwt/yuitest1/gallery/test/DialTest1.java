package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.WidgetEvent;
import org.sgx.yuigwt.yui.widget.dial.Dial;
import org.sgx.yuigwt.yui.widget.dial.DialConfig;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
/**
 * a simple example of the dial widget usage
 * @author sg
 *
 */
public class DialTest1 extends AbstractTest {

public DialTest1() {
	super("dial1", "a simple example of the dial widget usage", 
			new String[]{GalleryConstants.TAG_DIAL, GalleryConstants.TAG_WIDGET}, 
			TestResources.instance.ButtonTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"dial", "console"}, new YUICallback() {

	@Override
	public void ready(final YuiContext Y) {
		Dial dial = Y.newDial(DialConfig.create()
			.centerButtonDiameter(2)
			.min(-100)
			.max(100)
			.stepsPerRevolution(10)
		);
		final Console console = Y.newConsole().render().cast(); 
		dial.on("valueChange", new EventCallback<WidgetEvent>() {
			@Override
			public void call(WidgetEvent e) {
				console.log("valuechange : "+e.newValInt()); 
			}
		}); 
		dial.render(parent); 
	}
}); 
}

}
