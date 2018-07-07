package org.sgx.yuigwt.yui.widget.datatable;

import org.sgx.yuigwt.yui.model.Model;
import org.sgx.yuigwt.yui.util.JsObject;
/**
 * @see http://yuilibrary.com/yui/docs/datatable/#formatter-function
 * @see http://yuilibrary.com/yui/docs/datatable/#formatter-props
 * @author sg
 *
 */
public class FormatterContext extends JsObject{
protected FormatterContext(){}

/**
 <pre>formatter: function (o) {
    // assumes a numeric value for this column
    return '$' + o.value.toFixed(2);
}
</pre>
The raw value from the record Model to populate this cell. Equivalent to o.record.get(o.column.key) or o.data[o.column.key]. 
 * @return
 */
public native final String value() /*-{
return this.value+""; 
}-*/;

/**
<pre>formatter: function (o) {
    // assumes a numeric value for this column
    return '$' + o.value.toFixed(2);
}
</pre>
The raw value from the record Model to populate this cell. Equivalent to o.record.get(o.column.key) or o.data[o.column.key]. 
 
 * @param val
 * @return this - for setter chaining
 */
public native final FormatterContext value(String val) /*-{
this.value = val; 
return this; 
}-*/;

/**
<pre>formatter: function (o) {
   // assumes a numeric value for this column
   return '$' + o.value.toFixed(2);
}
</pre>
The raw value from the record Model to populate this cell. Equivalent to o.record.get(o.column.key) or o.data[o.column.key]. 
* @return
*/
public native final double valueDouble() /*-{
return this.value; 
}-*/;

/**
<pre>formatter: function (o) {
   // assumes a numeric value for this column
   return '$' + o.value.toFixed(2);
}
</pre>
The raw value from the record Model to populate this cell. Equivalent to o.record.get(o.column.key) or o.data[o.column.key]. 

* @param val
* @return this - for setter chaining
*/
public native final FormatterContext value(double val) /*-{
this.value = val; 
return this; 
}-*/;
/**
<pre>formatter: function (o) {
   // assumes a numeric value for this column
   return '$' + o.value.toFixed(2);
}
</pre>
The raw value from the record Model to populate this cell. Equivalent to o.record.get(o.column.key) or o.data[o.column.key]. 
* @return
*/
public native final boolean valueBoolean() /*-{
return this.value; 
}-*/;

/**
<pre>formatter: function (o) {
   // assumes a numeric value for this column
   return '$' + o.value.toFixed(2);
}
</pre>
The raw value from the record Model to populate this cell. Equivalent to o.record.get(o.column.key) or o.data[o.column.key]. 

* @param val
* @return this - for setter chaining
*/
public native final FormatterContext value(boolean val) /*-{
this.value = val; 
return this; 
}-*/;

/**
<pre>formatter: function (o) {
    return o.data.lname + ', ' + o.data.fname;
}
</pre>
The Model data for this row in simple object format. 
 * @return
 */
public native final JsObject data() /*-{
return this.data; 
}-*/;

/**
<pre>formatter: function (o) {
    return o.data.lname + ', ' + o.data.fname;
}
</pre>
The Model data for this row in simple object format. 
 * @param val
 * @return this - for setter chaining
 */
public native final FormatterContext data(JsObject val) /*-{
this.data = val; 
return this; 
}-*/;

/**
 * <pre>formatter: function (o) {
    return '<a href="/service/' + o.record.get('id') + '">' +
        o.value + '</a>';
}
</pre>
The Model for this row. 
 * @return
 */
public native final Model record() /*-{
return this.record; 
}-*/;

/**
 * <pre>formatter: function (o) {
    return '<a href="/service/' + o.record.get('id') + '">' +
        o.value + '</a>';
}
</pre>
The Model for this row. 
 * @param val
 * @return this - for setter chaining
 */
public native final FormatterContext record(Model val) /*-{
this.record = val; 
return this; 
}-*/;

/**
 * <pre>formatter: function (o) {
    // Use a custom column property
    var format = o.column.dateFormat || '%D';

    return Y.DataType.Data.format(o.value, format);
}
</pre>
The column configuration object. 
 * @return
 */
public native final Column column() /*-{
return this.column; 
}-*/;

/**
 * <pre>formatter: function (o) {
    // Use a custom column property
    var format = o.column.dateFormat || '%D';

    return Y.DataType.Data.format(o.value, format);
}
</pre>
The column configuration object. 
 * @param val
 * @return this - for setter chaining
 */
public native final FormatterContext column(Column val) /*-{
this.column = val; 
return this; 
}-*/;

/**
 * <pre>formatter: function (o) {
    if (o.value < 0) {
        o.className += 'loss';
    }
}
</pre>
A string of class names to add &lt;td class="HERE"> in addition to the column class and any classes in the column's className configuration
 * @return
 */
public native final String className() /*-{
return this.className; 
}-*/;

/**
 * <pre>formatter: function (o) {
    if (o.value < 0) {
        o.className += 'loss';
    }
}
</pre>
A string of class names to add &lt;td class="HERE"> in addition to the column class and any classes in the column's className configuration
 * @param val
 * @return this - for setter chaining
 */
public native final FormatterContext className(String val) /*-{
this.className = val; 
return this; 
}-*/;

/**
 * <pre>formatter: function (o) {
    return (o.rowIndex + 1) + ' - ' + o.value;
}
</pre>
The index of the current Model in the ModelList. Typically correlates to the row index as well. 
 * @return
 */
public native final int rowIndex() /*-{
return this.rowIndex; 
}-*/;

/**
 * <pre>formatter: function (o) {
    return (o.rowIndex + 1) + ' - ' + o.value;
}
</pre>
The index of the current Model in the ModelList. Typically correlates to the row index as well.
 * @param val
 * @return this - for setter chaining
 */
public native final FormatterContext rowIndex(int val) /*-{
this.rowIndex = val; 
return this; 
}-*/;

/**
 * <pre>formatter: function (o) {
    if (o.value < 0) {
        o.rowClass += 'loss';
    }
}
</pre>
A string of css classes to add &lt;tr class="HERE">&lt;td.... This is useful to avoid the need for nodeFormatters to add classes to the containing row. 
 * @return
 */
public native final String rowClass() /*-{
return this.rowClass; 
}-*/;

/**
 * <pre>formatter: function (o) {
    if (o.value < 0) {
        o.rowClass += 'loss';
    }
}
</pre>
A string of css classes to add &lt;tr class="HERE">&lt;td.... This is useful to avoid the need for nodeFormatters to add classes to the containing row. 
 * @param val
 * @return this - for setter chaining
 */
public native final FormatterContext rowClass(String val) /*-{
this.rowClass = val; 
return this; 
}-*/;
}
