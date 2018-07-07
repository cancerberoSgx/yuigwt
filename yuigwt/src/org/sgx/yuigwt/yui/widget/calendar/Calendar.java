package org.sgx.yuigwt.yui.widget.calendar;

import org.sgx.yuigwt.yui.widget.Widget;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsDate;

/**month range of dates, rendered as a grid with date and weekday labels.<br/>
 * This java class overlays both YUI Calendar and CalendarBase.
 * @see http://yuilibrary.com/yui/docs/api/classes/Calendar.htm
 * @see http://yuilibrary.com/yui/docs/api/classes/CalendarBase.htm
 * @author sg
 *
 */
public class Calendar extends Widget {
protected Calendar(){}
/**
 * Fired when a specific date cell in the calendar is clicked. The event carries a payload which includes a cell property corresponding to the node of the actual date cell, and a date property, with the Date that was clicked.
 */
public static final String EVENT_DATECLICK="dateClick"; 
/**
 * Fired when any of the next month's days displayed after the calendar grid are clicked.
 */
public static final String EVENT_NEXTMONTHCLICK="nextMonthClick";
/**
 * Fired when any of the previous month's days displayed before the calendar grid are clicked.
 */
public static final String EVENT_PREVMONTHCLICK="prevMonthClick";

//CalendarBase methods
/**
 * Deselects a given date or array of dates, or deselects all dates if no argument is specified.
 * @return self for method chaining
 */
public native final Calendar deselectDates(JsArray<JsDate> dates) /*-{
this.deselectDates(dates); 
return this; 
}-*/;
/**
 * Deselects a given date or array of dates, or deselects all dates if no argument is specified.
 * @return self for method chaining
 */
public native final Calendar deselectDates(JsDate[] dates) /*-{
this.deselectDates(@org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(dates)); 
return this; 
}-*/;
/**
 * Selects a given date or array of dates.
 * @return self for method chaining
 */
public native final Calendar selectDates(JsArray<JsDate> dates) /*-{
this.selectDates(dates); 
return this; 
}-*/;
/**
 * Selects a given date or array of dates.
 * @return self for method chaining
 */
public native final Calendar selectDates(JsDate date) /*-{
this.selectDates(date); 
return this; 
}-*/;
/**
 * Selects a given date or array of dates.
 * @return self for method chaining
 */
public native final Calendar selectDates(JsDate[] dates) /*-{
this.selectDates(@org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(dates)); 
return this; 
}-*/;



//Calendar methods
/**
 * Adds one month to the current calendar view.
 * @return self for method chaining
 */
public native final Calendar addMonth() /*-{
this.addMonth(); 
return this; 
}-*/;

/**
 * Adds one year to the current calendar view.
 * @return self for method chaining
 */
public native final Calendar addYear() /*-{
this.addYear(); 
return this; 
}-*/;

/**
 * Subtracts one month from the current calendar view.
 * @return self for method chaining
 */
public native final Calendar subtractMonth() /*-{
this.subtractMonth(); 
return this; 
}-*/;
/**
 * Subtracts one year from the current calendar view
 * @return self for method chaining
 */
public native final Calendar subtractYear() /*-{
this.subtractYear(); 
return this; 
}-*/;



//CalendarBase attributes


//Calendar attributes
/**
 * The date corresponding to the current calendar view. Always normalized to the first of the month that contains the date at assignment time. Used as the first date visible in the calendar.Default: Today's date as set on the user's computer.
 * @return the attribute
 */
public final native JsDate date()/*-{
return this.get("date");
}-*/;

/**
 * The date corresponding to the current calendar view. Always normalized to the first of the month that contains the date at assignment time. Used as the first date visible in the calendar.Default: Today's date as set on the user's computer.
 * @param val
 * @return self for method chaining
 */
public final native Calendar date(JsDate val)/*-{
this.set("date", val);
return this; 
}-*/;

/**
 * The maximum date that can be displayed by the calendar. The calendar will not allow dates later than this one to be set, and will reset any later date to this date. Should be null if no maximum date is needed.Default: null
 * @return the attribute
 */
public final native JsDate maximumDate()/*-{
return this.get("maximumDate");
}-*/;

/**
 * The maximum date that can be displayed by the calendar. The calendar will not allow dates later than this one to be set, and will reset any later date to this date. Should be null if no maximum date is needed.Default: null
 * @param val
 * @return self for method chaining
 */
public final native Calendar maximumDate(JsDate val)/*-{
this.set("maximumDate", val);
return this; 
}-*/;
/**
 * The minimum date that can be displayed by the calendar. The calendar will not allow dates earlier than this one to be set, and will reset any earlier date to this date. Should be null if no minimum date is needed.
 * @return the attribute
 */
public final native JsDate minimumDate()/*-{
return this.get("minimumDate");
}-*/;

/**
 * The minimum date that can be displayed by the calendar. The calendar will not allow dates earlier than this one to be set, and will reset any earlier date to this date. Should be null if no minimum date is needed.
 * @param val
 * @return self for method chaining
 */
public final native Calendar minimumDate(JsDate val)/*-{
this.set("minimumDate", val);
return this; 
}-*/;

/**
 * A setting specifying the type of selection the calendar allows. Possible values include:<br/>
    single - One date at a time<br/>
    multiple-sticky - Multiple dates, selected one at a time (the dates "stick"). This option is appropriate for mobile devices, where function keys from the keyboard are not available.<br/>
    multiple - Multiple dates, selected with Ctrl/Meta keys for additional single dates, and Shift key for date ranges.<br/>
<br/>
Default: single
 * @return the attribute
 */
public final native String selectionMode()/*-{
return this.get("selectionMode");
}-*/;

/**
 * A setting specifying the type of selection the calendar allows. Possible values include:<br/>
    single - One date at a time<br/>
    multiple-sticky - Multiple dates, selected one at a time (the dates "stick"). This option is appropriate for mobile devices, where function keys from the keyboard are not available.<br/>
    multiple - Multiple dates, selected with Ctrl/Meta keys for additional single dates, and Shift key for date ranges.<br/>
<br/>
Default: single
 * @param val
 * @return self for method chaining
 */
public final native Calendar selectionMode(String val)/*-{
this.set("selectionMode", val);
return this; 
}-*/;
}
