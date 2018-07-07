package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_ANIM;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_BUTTON;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_EVENT;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_NODE;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.anim.Anim;
import org.sgx.yuigwt.yui.anim.AnimConfig;
import org.sgx.yuigwt.yui.anim.AnimEvent;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;

import com.google.gwt.user.client.Window;
/**
 * anim
 * @author sg
 *
 */
public class AnimTest1 extends AbstractTest {

public AnimTest1() {
	super("anim1", "anim tests", 
		new String[]{TAG_ANIM, TAG_EVENT, TAG_BUTTON, TAG_NODE}, 
		TestResources.instance.AnimTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"button", "anim"}, new YUICallback() {
	@Override
	public void ready(final YuiContext Y) {
		final Node p = parent.appendChild("<p>This is a para graph.. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. ..</p>");
		p.setStyle("backgroundColor", "red"); 		

		final Anim anim1 = Y.newAnim(AnimConfig.create().
				node(p).duration(2.3).
				to(Style.create().width("10px")));
		
		anim1.on("end", new EventCallback<AnimEvent>() {			
			@Override
			public void call(AnimEvent e) {
				Window.alert("anim ended "); 
			}
		}); 
		Widget button1 = Y.newButton(
			ButtonConfig.create().label("start")
		).render(parent);	
		button1.on("click", new EventCallback<ButtonEvent>() {			
			@Override
			public void call(ButtonEvent e) {
				anim1.run();				
			}
		});	
	}
}); 
}

}
