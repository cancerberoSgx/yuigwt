package org.sgx.yuigwt.yuitest1.gallery.test.uibinder;

import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;

/**
 * this is a common UIBinder Composite class, using YUIBinded (extends Composite) for less boilerplate code. 
 * 
 * Notes:
 * 
 * <p>
 * 1) for YUI, we are binding plain HTML Elements, like @UiField Element
 * tabViewEl1;
 * </p>
 * 
 * <p>
 * 2) then in the constructor, after this GWT widget is initialized with
 * initWidget(uiBinder.createAndBindUi(this));, we call YUIBinder.bindYUI
 * passing this Element UIFields corresponding to YUI stuff and register myself
 * as a listener to be notified when YUI binding is done to start working.
 * </p>
 * 
 * <p>
 * 3) in yuiBinded() callback we ask for YUI Widgets and start working with
 * them.
 * </p>
 * 
 * @author sg
 * 
 */
public class UIBinderAloneButton extends YUIBinded {

	interface MyUiBinder extends UiBinder<Widget, UIBinderAloneButton> {
	}

	private static UiBinder<YUIBinded, Widget> uiBinder = GWT.create(MyUiBinder.class);

	@UiField
	Element yuiButtonEl1, yuiButtonEl2;	

	private Button yuiButton1, yuiButton2;

	public UIBinderAloneButton(YuiContext y) {
		super(y); 
	}

	
	public void yuiBinded() {
		/*
		 * all YUI stuff is ready and rendered, we obtain the YUI widgets and
		 * work directly in java:
		 */
		yuiButton1 = yuiBinder.getWidget(yuiButtonEl1).cast();

		yuiButton1.on("click", new EventCallback<ButtonEvent>() {
			
			public void call(ButtonEvent e) {
				Window.alert("yui button clicked!"); 
			}
		}); 
		
		yuiButton2 = yuiBinder.getWidget(yuiButtonEl2).cast();

		yuiButton2.on("pressedChange", new EventCallback<ButtonEvent>() {
			
			public void call(ButtonEvent e) {
				boolean pressed = yuiButton2.getBoolean("pressed");
				yuiButton2.set("label", pressed ? "pressed button" : "not pressed button"); 
			}
		}); 
	}

	
	public UiBinder<YUIBinded, Widget> getUIBinder() {
		return uiBinder;
	}	
	/**
	 * tell the YUIBinder which are the fields corresponding to YUI widgets. 
	 */
	
	public Element[] getYUIBindedEls() {
		return  new Element[] { yuiButtonEl1, yuiButtonEl2}; 
	}

}
