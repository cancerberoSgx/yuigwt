package org.sgx.madrenecesidad.client.ui.main;

import org.sgx.madrenecesidad.client.app.AppController;
import org.sgx.madrenecesidad.client.ui.mymaps.MyMaps1;
import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * @author sg
 * 
 */
public class MainLayout1 extends YUIBinded implements MainLayout {

	interface MyUiBinder extends UiBinder<Widget, MainLayout1> {
	}

	private static UiBinder<YUIBinded, Widget> uiBinder = GWT.create(MyUiBinder.class);

//	@UiField Element useCaseContainerEl; 
	
	@UiField VerticalPanel useCaseContainer; 
	
//	@UiField
//	Element yuiButtonEl1, yuiButtonEl2;	

//	private Button yuiButton1, yuiButton2;

//	private UIContext uiContext;

	public MainLayout1(YuiContext y) {
		super(y);
//		this.uiContext=uiContext; 
	}

	@Override
	public Panel getUseCaseContainer() {
		return useCaseContainer;
	}
	
	@Override
	public void yuiBinded() {
		/*
		 * all YUI stuff is ready and rendered, we obtain the YUI widgets and
		 * work directly in java:
		 */
//		yuiButton1 = yuiBinder.getWidget(yuiButtonEl1).cast();

//		yuiButton1.on("click", new EventCallback<ButtonEvent>() {
//			@Override
//			public void call(ButtonEvent e) {
//				Window.alert("yui button clicked!"); 
//			}
//		}); 
//		
//		yuiButton2 = yuiBinder.getWidget(yuiButtonEl2).cast();
//
//		yuiButton2.on("pressedChange", new EventCallback<ButtonEvent>() {
//			@Override
//			public void call(ButtonEvent e) {
//				boolean pressed = yuiButton2.getBoolean("pressed");
//				yuiButton2.set("label", pressed ? "pressed button" : "not pressed button"); 
//			}
//		}); 
	}

	@Override
	public UiBinder<YUIBinded, Widget> getUIBinder() {
		return uiBinder;
	}	
	/**
	 * tell the YUIBinder which are the fields corresponding to YUI widgets. 
	 */
	@Override
	public Element[] getYUIBindedEls() {
		return  new Element[] {
//				yuiButtonEl1, yuiButtonEl2
				}; 
	}
	
//	/**
//	 * Will be used for creating UIContext instances of this UIBinder widget. 
//	 * @return a new UIContext
//	 */
//	@UiFactory
//	UIContext makeUIContext() {
//		return uiContext; 
//	}
	
	/**
	 * Will be used for creating MainMenu instances of this UIBinder widget. 
	 * @return a new MainMenu
	 */
	@UiFactory
	MainMenu1 makeMainMenu() {
		return new MainMenu1(y);
	}

/**
 * Will be used for creating MyMaps instances of this UIBinder widget. 
 * @return a new MyMaps
 */
@UiFactory
MyMaps1 makeMyMaps() {
	return new MyMaps1();
}
//	/**
//	 * Will be used for creating MainMenu instances of this UIBinder widget. 
//	 * @return a new MainMenu
//	 */
//	@UiFactory
//	YuiContext makeYuiContext() {
//		return y
//	}

}
