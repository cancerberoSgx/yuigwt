package org.sgx.yuigwt.yuitest1.gallery.test.uibinder;

import org.sgx.yuigwt.ui.YUIBinder;
import org.sgx.yuigwt.ui.YUIBinderFactory;
import org.sgx.yuigwt.ui.YUIBinderListener;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.tabview.TabView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * This test shows an example of extending GWT Composite directly instead extending YUIBinded  
 * @author sg
 * 
 */
public class UsingCompositeDirectly extends Composite implements YUIBinderListener {
	
	interface MyUiBinder extends UiBinder<Widget, UsingCompositeDirectly> {
	}

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

	@UiField
	Element tabViewEl1;

	@UiField
	com.google.gwt.user.client.ui.Button gwtButton1, gwtButton2;

	@UiField
	Element yuiButtonEl1;

	@UiField
	Element yuiButtonEl2;

	@UiField
	Element ac1El;
	
	private YUIBinder binderUtil;

	private Button yuiButton1;

	private TabView tabView;

	public UsingCompositeDirectly(YuiContext y) {
		
		initWidget(uiBinder.createAndBindUi(this));

		binderUtil = YUIBinderFactory.getInstance().newYUIBinder();
		
		/*
		 * bind YUI stuff manually passing this Element UIFields corresponding
		 * to YUI stuff and register myself as a listener to be notified when
		 * YUI binding is done. see yuiBinded()
		 */
		binderUtil.bindYUI(y, this, new Element[] { 
			tabViewEl1, yuiButtonEl1, yuiButtonEl2, ac1El }, this);

		/*
		 * the gwt widgets can be used right away, but for using YUI widgets we
		 * need to wait until binding is finished, see method yuiBindede() below
		 */
		gwtButton2.addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				Window.alert("gwtbutton1clicked");
				tabView.selectChild(2);
			}
		});
	}

	
	public void yuiBinded() {
		/*
		 * all YUI stuff is ready and rendered, we obtain the YUI widgets and
		 * work directly in java:
		 */
		yuiButton1 = binderUtil.getWidget(yuiButtonEl1).cast();
		tabView = binderUtil.getWidget(tabViewEl1).cast();

		yuiButton1.on("click", new EventCallback<ButtonEvent>() {
			
			public void call(ButtonEvent e) {
				tabView.selectChild(1);
			}
		});
		
		AutoComplete ac1 = binderUtil.getWidget(ac1El).cast();
		ac1.source(new String[]{"ab", "abc", "abcd", "abc dfgh", "abcdfg"}); 
	}

}
