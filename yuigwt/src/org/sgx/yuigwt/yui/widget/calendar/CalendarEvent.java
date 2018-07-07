package org.sgx.yuigwt.yui.widget.calendar;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.WidgetEvent;

import com.google.gwt.core.client.JsDate;

/**
 * Fired when any of the previous month's days displayed before the calendar
 * grid are clicked.
 * 
 * @author sg
 * 
 */
public class CalendarEvent extends WidgetEvent {
	protected CalendarEvent() {
	}

	/**
	 * the node of the actual date cell clicked on a dateClicked event
	 * 
	 * @return
	 */
	public native final Node cell() /*-{
		return this.cell;
	}-*/;

	/**
	 * the node of the actual date cell clicked on a dateClicked event
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CalendarEvent cell(Node val) /*-{
		this.cell = val;
		return this;
	}-*/;

	/**
	 * the date that was clicked on a dateClicked event.
	 * 
	 * @return
	 */
	public native final JsDate date() /*-{
		return this.date;
	}-*/;

	/**
	 * the date that was clicked on a dateClicked event.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CalendarEvent date(JsDate val) /*-{
		this.date = val;
		return this;
	}-*/;
}
