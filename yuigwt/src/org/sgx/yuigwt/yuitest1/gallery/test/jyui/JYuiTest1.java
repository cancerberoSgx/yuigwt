package org.sgx.yuigwt.yuitest1.gallery.test.jyui;

import org.sgx.yuigwt.jyui.widget.button.YButton;
import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.event.EventHandle;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.user.client.Window;

/**
 * a first jyui test where we show different ways of extending YWidget subclasses, in this case YButton.
 * @author sg
 * 
 */
public class JYuiTest1 extends AbstractTest {

	public JYuiTest1() {
		super("jyui1", "jyui1", new String[] { GalleryConstants.TAG_EXT, GalleryConstants.TAG_GWT }, TestResources.instance.jyui_JYuiTest1());
	}

	
	public void test(final Node parent) {
		YUI.Use(new String[] { "button" }, new YUICallback() {
			private EventHandle handle1;

			
			public void ready(final YuiContext Y) {

				YButton ybutton1 = new YButton(Y, "button1");
				ybutton1.on("click", new EventCallback<ButtonEvent>() {
					
					public void call(ButtonEvent e) {
						Window.alert("clicked");
					}
				});
				ybutton1.render(parent);

				// now extending a button
				MyButton button2 = new MyButton(Y, "myButton", new EventCallback<ButtonEvent>() {
					
					public void call(ButtonEvent e) {
						Window.alert("clicked 2");
					}
				});
				button2.render(parent);

				MyOtherButton button3 = new MyOtherButton(Y);
				button3.setLabel("custom button 3");
				button3.render(parent);
			}
		});
	}

	/**
	 * My custom button - extending YButton - use a render event listener for
	 * adding custom UI after rendering.
	 * 
	 */
	public static class MyButton extends YButton {
		public MyButton(YuiContext y, String label, EventCallback<ButtonEvent> onclick) {
			super(y, label);
			this.on("click", onclick);
			this.on("render", new EventCallback<EventFacade>() {
				
				public void call(EventFacade e) {
					MyButton.this.srcNode().setStyle("border", "2px solid green");
				}
			});
		}
	}

	/**
	 * another custom button, this time overriding afterRender() . Also adds label getter/setetrs. 
	 * custom render.
	 * 
	 */
	public static class MyOtherButton extends YButton {
		public MyOtherButton(YuiContext y) {
			super(y);
		}
		
		public void afterRender() {
			srcNode().setStyles(Style.create()
				.backgroundColor("pink")
				.backgroundImage("none")
				.border("4px dotted gray")
			); 
		}
		public void setLabel(String s) {
			this.set("label", s);
		}
		public String getLabel() {
			return this.getString("label");
		}
	}

}
