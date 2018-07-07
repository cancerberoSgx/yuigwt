package org.sgx.yuigwt.yuitest1.gallery.test.uibinder;

import org.sgx.yuigwt.ui.YUIBinder;
import org.sgx.yuigwt.ui.YUIBinder1;
import org.sgx.yuigwt.ui.YUIBinderFactory;
import org.sgx.yuigwt.ui.YUIBinderListener;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeList;
import org.sgx.yuigwt.yui.node.NodeList.NodeListIterator;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.tabview.TabView;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * Shows how to apply different XML templates to the same view as documented in https://developers.google.com/web-toolkit/doc/latest/DevGuideUiBinder#Apply_different_xml
 * A second argument String userName is passed to the constructor. If this parameter is not null then 
 * we show the template ApplyDifferentXMLLoggedIn.ui.xml, and if null then we show the template 
 * ApplyDifferentXMLNotLoggedIn.ui.xml
 * 
 * @author sg
 * 
 */
public class ApplyDifferentXML extends Composite implements YUIBinderListener {
	
	
	@UiTemplate("ApplyDifferentXMLLoggedIn.ui.xml")	
	interface LoggedInUiBinder extends UiBinder<Widget, ApplyDifferentXML> {}
	private static LoggedInUiBinder loggedInUiBinder = GWT.create(LoggedInUiBinder.class);
	
	@UiTemplate("ApplyDifferentXMLNotLoggedIn.ui.xml")	
	interface NotLoggedInUiBinder extends UiBinder<Widget, ApplyDifferentXML> {}
	private static NotLoggedInUiBinder notLLoggedInUiBinder = GWT.create(NotLoggedInUiBinder.class);
		
	private YUIBinder binderUtil;	

	@UiField Element menunav1;
	
	private YuiContext y;

	private String userName; 
	
	UiBinder<Widget, ApplyDifferentXML> getUiBinder() {
		if(userName==null)
			return notLLoggedInUiBinder; 
		else
			return loggedInUiBinder;		
	}
	
	@UiConstructor
	public ApplyDifferentXML(YuiContext y, String userName) {
		this.userName=userName; 
		this.y=y;
		
		/* init this widget using the propper XML template, returned by getUiBinder() */
		initWidget(getUiBinder().createAndBindUi(this));

		binderUtil = YUIBinderFactory.getInstance().newYUIBinder();
		
		/*
		 * bind YUI stuff manually passing this Element UIFields corresponding
		 * to YUI stuff and register myself as a listener to be notified when
		 * YUI binding is done. see yuiBinded()
		 */
		binderUtil.bindYUI(y, this, new Element[] {menunav1 }, this);
	}

	@Override
	public void yuiBinded() {
		if(userName!=null) {
			NodeList names = y.all(".userName123"); 
			names.set("text", userName); 
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
