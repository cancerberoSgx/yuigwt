package org.sgx.yuigwt.yui.widget.datatable;

import org.sgx.yuigwt.yui.model.Model;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
/**
 * @see http://yuilibrary.com/yui/docs/datatable/#formatter-props
 * @author sg
 *
 */
public class NodeFormatterContext extends JsObject{
protected NodeFormatterContext(){}
/**
 * The <td> Node for this cell.
 * @return
 */
public native final Node td() /*-{
return this.td; 
}-*/;

/**
 * The <td> Node for this cell.
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFormatterContext td(Node val) /*-{
this.td = val; 
return this; 
}-*/;

/**
 * <p>
 * If the cell &lt;td> contains an element with class
 * "yui3-datatable-liner", this will refer to that Node. Otherwise, it is
 * equivalent to o.td (default behavior).
 * </p>
 * 
 * <p>
 * By default, liner elements aren't rendered into cells, but to implement
 * absolute column widths, some cell liner element with width and overflow
 * style is required (barring a table style of table-layout: fixed). This
 * may be applied to the columns cellTemplate configuration or to the
 * bodyView instance's CELL_TEMPLATE for all columns.
 * </p>
 * 
 * <p>
 * Generally, the liner, if present, corresponds to where the content should
 * go, so use o.cell to add content and o.td to specifically work with the
 * &lt;td> Node.
 * </p>
 * @return
 */
public native final Node cell() /*-{
return this.cell; 
}-*/;

/**
 * <p>
 * If the cell &lt;td> contains an element with class
 * "yui3-datatable-liner", this will refer to that Node. Otherwise, it is
 * equivalent to o.td (default behavior).
 * </p>
 * 
 * <p>
 * By default, liner elements aren't rendered into cells, but to implement
 * absolute column widths, some cell liner element with width and overflow
 * style is required (barring a table style of table-layout: fixed). This
 * may be applied to the columns cellTemplate configuration or to the
 * bodyView instance's CELL_TEMPLATE for all columns.
 * </p>
 * 
 * <p>
 * Generally, the liner, if present, corresponds to where the content should
 * go, so use o.cell to add content and o.td to specifically work with the
 * &lt;td> Node.
 * </p>
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFormatterContext cell(Node val) /*-{
this.cell = val; 
return this; 
}-*/;

/**
 * The raw value from the record Model to populate this cell. Equivalent to o.record.get(o.column.key) or o.data[o.column.key]. 
 * @return
 */
public native final String value() /*-{
return this.value; 
}-*/;

/**
 * The raw value from the record Model to populate this cell. Equivalent to o.record.get(o.column.key) or o.data[o.column.key]. 
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFormatterContext value(String val) /*-{
this.value = val; 
return this; 
}-*/;

/**
 * The Model data for this row in simple object format.
 * @return
 */
public native final JsObject data() /*-{
return this.data; 
}-*/;

/**
 * The Model data for this row in simple object format.
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFormatterContext data(JsObject val) /*-{
this.data = val; 
return this; 
}-*/;

/**
 * The Model for this row.
 * @return
 */
public native final Model record() /*-{
return this.record; 
}-*/;

/**
 * The Model for this row.
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFormatterContext record(Model val) /*-{
this.record = val; 
return this; 
}-*/;

/**
 * The column configuration object.
 * @return
 */
public native final Column column() /*-{
return this.column; 
}-*/;

/**
 * The column configuration object.
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFormatterContext column(Column val) /*-{
this.column = val; 
return this; 
}-*/;

/**
 * The index of the current Model in the ModelList. Typically correlates to the row index as well. 
 * @return
 */
public native final int rowIndex() /*-{
return this.rowIndex; 
}-*/;

/**
 * The index of the current Model in the ModelList. Typically correlates to the row index as well. 
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFormatterContext rowIndex(int val) /*-{
this.rowIndex = val; 
return this; 
}-*/;
}
