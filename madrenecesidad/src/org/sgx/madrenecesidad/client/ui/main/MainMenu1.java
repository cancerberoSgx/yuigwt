package org.sgx.madrenecesidad.client.ui.main;

import org.sgx.madrenecesidad.client.UserInfo;
import org.sgx.madrenecesidad.client.app.AppController;
import org.sgx.yuigwt.ui.YUIBinder;
import org.sgx.yuigwt.ui.YUIBinderFactory;
import org.sgx.yuigwt.ui.YUIBinderListener;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.NodeList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author sg
 * 
 */
public class MainMenu1 extends Composite implements YUIBinderListener {

	@UiTemplate("MainMenu1LoggedIn.ui.xml")
	interface LoggedInUiBinder extends UiBinder<Widget, MainMenu1> {
	}

	private static LoggedInUiBinder loggedInUiBinder = GWT.create(LoggedInUiBinder.class);

	@UiTemplate("MainMenu1NotLoggedIn.ui.xml")
	interface NotLoggedInUiBinder extends UiBinder<Widget, MainMenu1> {
	}

	private static NotLoggedInUiBinder notLLoggedInUiBinder = GWT.create(NotLoggedInUiBinder.class);

	private YUIBinder binderUtil;

	@UiField
	Element menunav1;

	private YuiContext y;

	// private String userName;
	
//	@UiField(provided=true)
//	UIContext uiContext;

	UiBinder<Widget, MainMenu1> getUiBinder() {
//		System.out.println(UIContext.getInstance().getUser().email());
		if (AppController.getInstance().getUser().email() == null)
			return notLLoggedInUiBinder;
		else
			return loggedInUiBinder;
	}

	@UiConstructor
	public MainMenu1(YuiContext y) {
		// this.userName=userName;
//		this.uiContext = uiContext;
		this.y = y;

		/* init this widget using the propper XML template, returned by getUiBinder() */
		initWidget(getUiBinder().createAndBindUi(this));

		binderUtil = YUIBinderFactory.getInstance().newYUIBinder();

		/*
		 * bind YUI stuff manually passing this Element UIFields corresponding to YUI stuff and register myself as a listener to be notified when YUI binding is done. see
		 * yuiBinded()
		 */
		binderUtil.bindYUI(y, this, new Element[] { menunav1 }, this);
	}

	@Override
	public void yuiBinded() {
//		Window.alert("yuiBinded "+ClientContext.getInstance().getUser() ); 
		UserInfo user = AppController.getInstance().getUser(); 
		if (user != null && user.isLoggedIn()) {
			NodeList names = y.all(".userName123");
			names.set("text", AppController.getInstance().getUser().nickname());
			
			y.all(".mnreplacehref-logouturl").set("href", AppController.getInstance().getUser().logoutUrl());
			
			y.all(".mnreplacetext-useremail").set("text", AppController.getInstance().getUser().email());
			
		}
		
		else {
			
			String loginUrl = AppController.getInstance().getUser().loginUrl(); 
			y.all(".mnreplacehref-loginurl").set("href", loginUrl);
//			Window.alert("loginUrl: "+loginUrl); 
			System.out.println(loginUrl);
			
//			y.all(".mnreplacetext-registerurl").set("text", ClientContext.getInstance().getUser().);
			
		}
		
	}

	// public String getUserName() {
	// return userName;
	// }
	//
	// public void setUserName(String userName) {
	// this.userName = userName;
	// }

//	@UiFactory
//	public UIContext getUiContext() {
//		return uiContext;
//	}
//	/**
//	 * Will be used for creating UIContext instances of this UIBinder widget. 
//	 * @return a new UIContext
//	 */
//	@UiFactory
//	UIContext makeUIContext() {
//		return new UIContext(y);
//	}

}
