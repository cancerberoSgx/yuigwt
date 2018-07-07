package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.*;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.calendar.CalendarConfig;

import com.google.gwt.core.client.JsDate;
/**
 * show a small example of calendar usage's
 * @author sg
 *
 */
public class CalendarTest1 extends AbstractTest {

public CalendarTest1() {
	super("calendar1", "show a small example of calendar usage's", 
		new String[]{TAG_CALENDAR, TAG_WIDGET}, 
		TestResources.instance.CalendarTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"calendar"}, new YUICallback() {	
		
	@Override
	public void ready(final YuiContext Y) {
		Widget calendar = Y.newCalendar(CalendarConfig.create().
			showNextMonth(true).
			showPrevMonth(true).
			date(JsDate.create()).
			width("500px").
			height("300px")).render(parent); 
	}
}); 
}

}
