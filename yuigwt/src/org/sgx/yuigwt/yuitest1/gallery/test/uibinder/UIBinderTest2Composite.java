package org.sgx.yuigwt.yuitest1.gallery.test.uibinder;

import org.sgx.yuigwt.ui.YUIBinder;
import org.sgx.yuigwt.ui.YUIBinder1;
import org.sgx.yuigwt.ui.YUIBinderFactory;
import org.sgx.yuigwt.ui.YUIBinderListener;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.widget.calendar.Calendar;
import org.sgx.yuigwt.yui.widget.calendar.CalendarEvent;
import org.sgx.yuigwt.yui.widget.panel.Panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * this is a common UIBinder Composite class. Notes:
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
public class UIBinderTest2Composite extends Composite implements YUIBinderListener {

	interface MyUiBinder extends UiBinder<Widget, UIBinderTest2Composite> {
	}

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

	@UiField
	Element menunav1;

	@UiField
	Element calendar1;

	@UiField
	Element panel1El;

	@UiField
	Element yuiButtonEl1;

	private YUIBinder binderUtil;

	private YuiContext y;

	public UIBinderTest2Composite(YuiContext y) {
		this.y=y;
		initWidget(uiBinder.createAndBindUi(this));

		binderUtil = YUIBinderFactory.getInstance().newYUIBinder();

		/*
		 * bind YUI stuff manually passing this Element UIFields corresponding
		 * to YUI stuff and register myself as a listener to be notified when
		 * YUI binding is done
		 */

		binderUtil.bindYUI(y, this, new Element[] { menunav1, calendar1, panel1El, yuiButtonEl1 }, this);
	}

	@Override
	public void yuiBinded() {
		Calendar calendarWidget = binderUtil.getWidget(calendar1).cast();
		System.out.println(calendarWidget+"");
		calendarWidget.on(Calendar.EVENT_DATECLICK, new EventCallback<CalendarEvent>() {
			@Override
			public void call(CalendarEvent e) {
				Window.alert("clicked " + e.date());
			}
		});

		Panel panel1 = binderUtil.getWidget(panel1El).cast();
		panel1.show();
//		panel1.h
	}

	/**
	 * because we use an UIBinderAloneButton inside and because its constructor requires passing
	 * the parameter Y, we use this @uiFactory method that will be used automatically to build instances of UIBinderAloneButton.
	 * Method name is insignificant   
	 * @return
	 */
	@UiFactory
	public UIBinderAloneButton makeUIBinderAloneButton() {
		return new UIBinderAloneButton(y); 
	}
}
