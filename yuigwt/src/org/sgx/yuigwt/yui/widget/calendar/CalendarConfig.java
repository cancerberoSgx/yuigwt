package org.sgx.yuigwt.yui.widget.calendar;

import org.sgx.yuigwt.yui.widget.WidgetConfig;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsDate;
/**
 * @see http://yuilibrary.com/yui/docs/api/classes/Calendar.htm
 * @see http://yuilibrary.com/yui/docs/api/classes/CalendarBase.htm
 * @author sg
 *
 */
public class CalendarConfig extends WidgetConfig {
protected CalendarConfig(){}
public static final native CalendarConfig create()/*-{
	return {}; 
}-*/;

//TODO customRenderer

/**
 * The date corresponding to the current calendar view. Always normalized to the first of the month that contains the date at assignment time. Used as the first date visible in the calendar.Default: The first of the month containing today's date, as set on the end user's system.
 * @return
 */
public native final JsDate date() /*-{
return this.date; 
}-*/;

/**
 * The date corresponding to the current calendar view. Always normalized to the first of the month that contains the date at assignment time. Used as the first date visible in the calendar.Default: The first of the month containing today's date, as set on the end user's system.
 * @param val
 * @return this - for setter chaining
 */
public native final CalendarConfig date(JsDate val) /*-{
this.date = val; 
return this; 
}-*/;

/**
 * The name of the rule which all disabled dates should match. Either disabledDatesRule or enabledDatesRule should be specified, or neither, but not both.
 * @return
 */
public native final String disabledDatesRule() /*-{
return this.disabledDatesRule; 
}-*/;

/**
 * The name of the rule which all disabled dates should match. Either disabledDatesRule or enabledDatesRule should be specified, or neither, but not both.
 * @param val
 * @return this - for setter chaining
 */
public native final CalendarConfig disabledDatesRule(String val) /*-{
this.disabledDatesRule = val; 
return this; 
}-*/;

/**
 * The name of the rule which all enabled dates should match. Either disabledDatesRule or enabledDatesRule should be specified, or neither, but not both
 * @return
 */
public native final String enabledDatesRule() /*-{
return this.enabledDatesRule; 
}-*/;

/**
 * The name of the rule which all enabled dates should match. Either disabledDatesRule or enabledDatesRule should be specified, or neither, but not both
 * @param val
 * @return this - for setter chaining
 */
public native final CalendarConfig enabledDatesRule(String val) /*-{
this.enabledDatesRule = val; 
return this; 
}-*/;

//TODO: headerRenderer

/**
 * A read-only attribute providing a list of currently selected dates.
 * 
 * @return
 */
public native final JsArray<JsDate> selectedDates() /*-{
return this.selectedDates; 
}-*/;

/**
 * A setting specifying whether to shows days from the next month in the visible month's grid, if there are empty cells available at the end.Default: false
 * @return
 */
public native final boolean showNextMonth() /*-{
return this.showNextMonth; 
}-*/;

/**
 * A setting specifying whether to shows days from the next month in the visible month's grid, if there are empty cells available at the end.Default: false
 * @param val
 * @return this - for setter chaining
 */
public native final CalendarConfig showNextMonth(boolean val) /*-{
this.showNextMonth = val; 
return this; 
}-*/;

/**
 * A setting specifying whether to shows days from the previous month in the visible month's grid, if there are empty preceding cells available.Default: false
 * @return
 */
public native final boolean showPrevMonth() /*-{
return this.showPrevMonth; 
}-*/;

/**
 * A setting specifying whether to shows days from the previous month in the visible month's grid, if there are empty preceding cells available.Default: false 
 * @param val
 * @return this - for setter chaining
 */
public native final CalendarConfig showPrevMonth(boolean val) /*-{
this.showPrevMonth = val; 
return this; 
}-*/;


}
