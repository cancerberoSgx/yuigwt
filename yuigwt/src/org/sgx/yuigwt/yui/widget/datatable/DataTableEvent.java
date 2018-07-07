package org.sgx.yuigwt.yui.widget.datatable;

import org.sgx.yuigwt.yui.widget.WidgetEvent;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayString;
/**
 * 
 * @author sg
 *
 */
public class DataTableEvent extends WidgetEvent{
	protected DataTableEvent(){}
/**
 * The new column definition object. events addColumn, modifyColumn.  
 * @return
 */
public native final Column columnObj() /*-{
return this.column; 
}-*/;
/**
 * The new column definition object. events addColumn, modifyColumn.  
 * @return
 */
public native final int columnInt() /*-{
return this.column; 
}-*/;
/**
 * The new column definition object. events addColumn, modifyColumn.  
 * @return
 */
public native final JsArrayInteger columnIntArr() /*-{
return this.column; 
}-*/;
/**
 * The new column definition object. events addColumn, modifyColumn.  
 * @return
 */
public native final String columnString() /*-{
return this.column; 
}-*/;
/**
 * The new column definition object. addColumn event. 
 * @param val
 * @return this - for setter chaining
 */
public native final DataTableEvent column(Column val) /*-{
this.column = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final int index() /*-{
return this.index; 
}-*/;
/**
 * 
 * @return
 */
public native final JsArrayInteger indexArr() /*-{
return this.index; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DataTableEvent index(int val) /*-{
this.index = val; 
return this; 
}-*/;

/**
 * The properties to assign to the column. modifyColumn event 
 * @return
 */
public native final JavaScriptObject newColumnDef() /*-{
return this.newColumnDef; 
}-*/;

/**
 * The properties to assign to the column. modifyColumn event
 * @param val
 * @return this - for setter chaining
 */
public native final DataTableEvent newColumnDef(JavaScriptObject val) /*-{
this.newColumnDef = val; 
return this; 
}-*/;

/**
 * Notifies of an impending sort, either from clicking on a column header, or from a call to the sort or toggleSort method. The requested sort is available in the sortBy property of the event.The default behavior of this event sets the table's sortBy attribute.
 * @return
 */
public native final String sortByString() /*-{
return this.sortBy; 
}-*/;

/**
 * Notifies of an impending sort, either from clicking on a column header, or from a call to the sort or toggleSort method. The requested sort is available in the sortBy property of the event.The default behavior of this event sets the table's sortBy attribute.
 * @param val
 * @return this - for setter chaining
 */
public native final DataTableEvent sortByString(String val) /*-{
this.sortBy = val; 
return this; 
}-*/;
/**
 * Notifies of an impending sort, either from clicking on a column header, or from a call to the sort or toggleSort method. The requested sort is available in the sortBy property of the event.The default behavior of this event sets the table's sortBy attribute.
 * @return
 */
public native final JsArrayString sortByStringArr() /*-{
return this.sortBy; 
}-*/;

/**
 * Notifies of an impending sort, either from clicking on a column header, or from a call to the sort or toggleSort method. The requested sort is available in the sortBy property of the event.The default behavior of this event sets the table's sortBy attribute.
 * @param val
 * @return this - for setter chaining
 */
public native final DataTableEvent sortByStringArr(JsArrayString val) /*-{
this.sortBy = val; 
return this; 
}-*/;
}
