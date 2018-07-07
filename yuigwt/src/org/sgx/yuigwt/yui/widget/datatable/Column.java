package org.sgx.yuigwt.yui.widget.datatable;

import org.sgx.yuigwt.yui.model.Model;
import org.sgx.yuigwt.yui.util.JsFunction;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JsArrayString;

/**
 * Columns to include in the rendered table. </br> If omitted, the attributes on
 * the configured recordType or the first item in the data collection will be
 * used as a source. </br> This attribute takes an array of strings or objects
 * (mixing the two is fine). Each string or object is considered a column to be
 * rendered. Strings are converted to objects, so columns: ['first', 'last']
 * becomes columns: [{ key: 'first' }, { key: 'last' }].
 * 
 * DataTable.Core only concerns itself with a few properties of columns. These
 * properties are: </br> </br> key - Used to identify the record field/attribute
 * containing content for this column. Also used to create a default Model if no
 * recordType or data are provided during construction. If name is not
 * specified, this is assigned to the _id property (with added incrementer if
 * the key is used by multiple columns). </br> children - Traversed to
 * initialize nested column objects </br> name - Used in place of, or in
 * addition to, the key. Useful for columns that aren't bound to a
 * field/attribute in the record data. This is assigned to the _id property.
 * </br> id - For backward compatibility. Implementers can specify the id of the
 * header cell. This should be avoided, if possible, to avoid the potential for
 * creating DOM elements with duplicate IDs. </br> field - For backward
 * compatibility. Implementers should use name. </br> _id - Assigned
 * unique-within-this-instance id for a column. By order of preference, assumes
 * the value of name, key, id, or _yuid. This is used by the rendering views as
 * well as feature module as a means to identify a specific column without
 * ambiguity (such as multiple columns using the same key. </br> _yuid - Guid
 * stamp assigned to the column object. </br> _parent - Assigned to all child
 * columns, referencing their parent column. </br> Default: (from `recordType`
 * Attrs or first item in the `data`)
 * 
 * 
 * 
 * @author sg
 * 
 */
public class Column extends JsObject {
	protected Column() {
	}

	public static final native Column create()/*-{
		return {};
	}-*/;

	/**
	 * Used to identify the record field/attribute containing content for this
	 * column. Also used to create a default Model if no recordType or data are
	 * provided during construction. If name is not specified, this is assigned
	 * to the _id property (with added incrementer if the key is used by
	 * multiple columns).
	 * 
	 * <pre>
	 * { key: 'username' }
	 * </pre>
	 * 
	 * <p>
	 * Binds the column values to the named property in the data.
	 * </p>
	 * 
	 * <p>
	 * Optional if formatter, nodeFormatter, or cellTemplate is used to populate
	 * the content.
	 * </p>
	 * 
	 * <p>
	 * It should not be set if children is set.
	 * </p>
	 * 
	 * <p>
	 * The value is used for the _id property unless the name property is also
	 * set.
	 * </p>
	 * 
	 * @return
	 */
	public native final String key() /*-{
		return this.key;
	}-*/;

	/**
	 * Used to identify the record field/attribute containing content for this
	 * column. Also used to create a default Model if no recordType or data are
	 * provided during construction. If name is not specified, this is assigned
	 * to the _id property (with added incrementer if the key is used by
	 * multiple columns).
	 * 
	 * <pre>
	 * { key: 'username' }
	 * </pre>
	 * 
	 * <p>
	 * Binds the column values to the named property in the data.
	 * </p>
	 * 
	 * <p>
	 * Optional if formatter, nodeFormatter, or cellTemplate is used to populate
	 * the content.
	 * </p>
	 * 
	 * <p>
	 * It should not be set if children is set.
	 * </p>
	 * 
	 * <p>
	 * The value is used for the _id property unless the name property is also
	 * set.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column key(String val) /*-{
		this.key = val;
		return this;
	}-*/;

	// TODO: children

	/**
	 * for stacked column headers
	 * 
	 * @return
	 */
	public native final JsArrayString children() /*-{
		return this.children;
	}-*/;

	/**
	 * <p>
	 * for stacked column headers. Used to create stacked headers. See the
	 * example above.
	 * </p>
	 * 
	 * <p>
	 * Child columns may also contain children. There is no limit to the depth
	 * of nesting.
	 * </p>
	 * 
	 * <p>
	 * Columns configured with children are for display only and should not be
	 * configured with a key. Configurations relating to the display of data,
	 * such as formatter, nodeFormatter, emptyCellValue, etc. are ignored.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column children(JsArrayString val) /*-{
		this.children = val;
		return this;
	}-*/;

	/**
	 * for stacked column headers.
	 * <p>
	 * for stacked column headers. Used to create stacked headers. See the
	 * example above.
	 * </p>
	 * 
	 * <p>
	 * Child columns may also contain children. There is no limit to the depth
	 * of nesting.
	 * </p>
	 * 
	 * <p>
	 * Columns configured with children are for display only and should not be
	 * configured with a key. Configurations relating to the display of data,
	 * such as formatter, nodeFormatter, emptyCellValue, etc. are ignored.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column children(String[] val) /*-{
		this.children = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val);
		return this;
	}-*/;

	/**
	 * <pre>
	 * { key: 'MfgPrtNum', label: 'Part Number' }
	 * </pre>
	 * 
	 * <p>
	 * HTML to populate the header &lt;th> for the column.
	 * </p>
	 * 
	 * @return
	 */
	public native final String label() /*-{
		return this.label;
	}-*/;

	/**
	 * <pre>
	 * { key: 'MfgPrtNum', label: 'Part Number' }
	 * </pre>
	 * 
	 * <p>
	 * HTML to populate the header &lt;th> for the column.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column label(String val) /*-{
		this.label = val;
		return this;
	}-*/;

	/**
	 * Used in place of, or in addition to, the key. Useful for columns that
	 * aren't bound to a field/attribute in the record data. This is assigned to
	 * the _id property.
	 * 
	 * <pre>
	 * { name: 'fullname', formatter: ... }
	 * </pre>
	 * 
	 * Use this to assign a name to pass to table.getColumn(NAME) or style
	 * columns with class "yui3-datatable-col-NAME" if a column isn't assigned a
	 * key.
	 * 
	 * The value is used for the _id property.
	 * 
	 * @return
	 */
	public native final String name() /*-{
		return this.name;
	}-*/;

	/**
	 * Used in place of, or in addition to, the key. Useful for columns that
	 * aren't bound to a field/attribute in the record data. This is assigned to
	 * the _id property.
	 * 
	 * <pre>
	 * { name: 'fullname', formatter: ... }
	 * </pre>
	 * 
	 * Use this to assign a name to pass to table.getColumn(NAME) or style
	 * columns with class "yui3-datatable-col-NAME" if a column isn't assigned a
	 * key.
	 * 
	 * The value is used for the _id property.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column name(String val) /*-{
		this.name = val;
		return this;
	}-*/;

	// TODO: Id not done because it s obsolete...

	/**
	 * <pre>
	 * {
	 *   key: 'preview',
	 *   allowHTML: true
	 * }
	 * </pre>
	 * 
	 * Skips the security step of HTML escaping the value for cells in this
	 * column. This is also necessary if emptyCellValue is set with an HTML
	 * string.
	 * 
	 * nodeFormatters ignore this configuration. If using a nodeFormatter, it is
	 * recommended to use Y.Escape.html() on any user supplied content that is
	 * to be displayed.
	 * 
	 * @return
	 */
	public native final boolean allowHTML() /*-{
		return this.allowHTML;
	}-*/;

	/**
	 * <pre>
	 * {
	 *   key: 'preview',
	 *   allowHTML: true
	 * }
	 * </pre>
	 * 
	 * Skips the security step of HTML escaping the value for cells in this
	 * column. This is also necessary if emptyCellValue is set with an HTML
	 * string.
	 * 
	 * nodeFormatters ignore this configuration. If using a nodeFormatter, it is
	 * recommended to use Y.Escape.html() on any user supplied content that is
	 * to be displayed.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column allowHTML(boolean val) /*-{
		this.allowHTML = val;
		return this;
	}-*/;

	/**
	 * <pre>
	 * {
	 *   key: 'price',
	 *   emptyCellValue: '???'
	 * }
	 * </pre>
	 * 
	 * Provides the default value to populate the cell if the data for that cell
	 * is undefined, null, or an empty string.
	 * 
	 * @return
	 */
	public native final String emptyCellValue() /*-{
		return this.emptyCellValue;
	}-*/;

	/**
	 * <pre>
	 * {
	 *   key: 'price',
	 *   emptyCellValue: '???'
	 * }
	 * </pre>
	 * 
	 * Provides the default value to populate the cell if the data for that cell
	 * is undefined, null, or an empty string.
	 * 
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column emptyCellValue(String val) /*-{
		this.emptyCellValue = val;
		return this;
	}-*/;

	/**
	 * Used to customize the content of the data cells for this column.
	 * 
	 * @return
	 */
	public native final JsFunction formatter() /*-{
		return this.formatter;
	}-*/;

	/**
	 * Used to customize the content of the data cells for this column.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column formatter(JsFunction val) /*-{
		this.formatter = val;
		return this;
	}-*/;
	/**
	 * Used to customize the content of the data cells for this column.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column formatter(String val) /*-{
		this.formatter = val;
		return this;
	}-*/;

	/**
	 * Used to customize the content of the data cells for this column.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column formatter(Formatter val) /*-{
		var f = $entry(function(o) {
			return val.@org.sgx.yuigwt.yui.widget.datatable.Formatter::format(Lorg/sgx/yuigwt/yui/widget/datatable/FormatterContext;)(o);
		});
		this.formatter = f;
		return this;
	}-*/;

	/**
	 * Used to customize the content of the data cells for this column.
	 * 
	 * @return
	 */
	public native final JsFunction nodeFormatter() /*-{
		return this.nodeFormatter;
	}-*/;

	/**
	 * Used to customize the content of the data cells for this column.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column nodeFormatter(JsFunction val) /*-{
		this.nodeFormatter = val;
		return this;
	}-*/;

	/**
	 * Used to customize the content of the data cells for this column.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column nodeFormatter(NodeFormatter val) /*-{
		var f = $entry(function(o) {
			return val.@org.sgx.yuigwt.yui.widget.datatable.NodeFormatter::format(Lorg/sgx/yuigwt/yui/widget/datatable/NodeFormatterContext;)(o);
		});
		this.nodeFormatter = f;
		return this;
	}-*/;

	/**
	 * <pre>
	 * {
	 *   key: 'symbol',
	 *   className: 'no-hide'
	 * }
	 * </pre>
	 * 
	 * A string of CSS classes that will be added to the &lt;td>'s class
	 * attribute.
	 * 
	 * Note, all cells will automatically have a class in the form of
	 * "yui3-datatable-col-KEY" added to the &lt;td>, where KEY is the column's
	 * configured name, key, or id (in that order of preference).
	 * 
	 * @return
	 */
	public native final String className() /*-{
		return this.className;
	}-*/;

	/**
	 * <pre>
	 * {
	 *   key: 'symbol',
	 *   className: 'no-hide'
	 * }
	 * </pre>
	 * 
	 * A string of CSS classes that will be added to the &lt;td>'s class
	 * attribute.
	 * 
	 * Note, all cells will automatically have a class in the form of
	 * "yui3-datatable-col-KEY" added to the &lt;td>, where KEY is the column's
	 * configured name, key, or id (in that order of preference).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column className(String val) /*-{
		this.className = val;
		return this;
	}-*/;

	/**
	 * <pre>
	 * { key: 'a', width: '400px' },
	 * { key: 'b', width: '10em' }
	 * </pre>
	 * 
	 * Adds a style width setting to an associated <col> element for the column.
	 * 
	 * Note, the assigned width will not truncate cell content, and it will not
	 * preserve the configured width if doing so would compromise either the
	 * instance's width configuration or the natural width of the table's
	 * containing DOM elements.
	 * 
	 * <p>
	 * If absolute widths are required, it can be accomplished with some custom
	 * CSS and the use of a cellTemplate, or formatter. See the description of
	 * datatable-column-widths for an example of how to do this.
	 * </p>
	 * 
	 * @return
	 */
	public native final String width() /*-{
		return this.width;
	}-*/;

	/**
	 * <pre>
	 * { key: 'a', width: '400px' },
	 * { key: 'b', width: '10em' }
	 * </pre>
	 * 
	 * Adds a style width setting to an associated <col> element for the column.
	 * 
	 * Note, the assigned width will not truncate cell content, and it will not
	 * preserve the configured width if doing so would compromise either the
	 * instance's width configuration or the natural width of the table's
	 * containing DOM elements.
	 * 
	 * <p>
	 * If absolute widths are required, it can be accomplished with some custom
	 * CSS and the use of a cellTemplate, or formatter. See the description of
	 * datatable-column-widths for an example of how to do this.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column width(String val) /*-{
		this.width = val;
		return this;
	}-*/;

	/**
	 * <pre>
	 * { key: 'lastLogin', sortable: true }
	 * </pre>
	 * 
	 * Used when the instance's sortable attribute is set to "auto" (the
	 * default) to determine which columns will support user sorting by clicking
	 * on the header.
	 * 
	 * If the instance's sortable attribute is set, this configuration is
	 * ignored.
	 * 
	 * @return
	 */
	public native final boolean sortable() /*-{
		return this.sortable;
	}-*/;

	/**
	 * <pre>
	 * { key: 'lastLogin', sortable: true }
	 * </pre>
	 * 
	 * Used when the instance's sortable attribute is set to "auto" (the
	 * default) to determine which columns will support user sorting by clicking
	 * on the header.
	 * 
	 * If the instance's sortable attribute is set, this configuration is
	 * ignored.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column sortable(boolean val) /*-{
		this.sortable = val;
		return this;
	}-*/;

	/**
	 * column sort function:
	 * 
	 * <pre>
	 * {
	 *   label: 'Name',
	 *   sortFn: function (a, b, desc) {
	 *     var an = a.get('lname') + b.get('fname'),
	 *         bn = a.get('lname') + b.get('fname'),
	 *         order = (an > bn) ? 1 : -(an < bn);
	 * 
	 *     return desc ? -order : order;
	 *   },
	 *   formatter: function (o) {
	 *     return o.data.lname + ', ' + o.data.fname;
	 *   }
	 * }
	 * </pre>
	 * 
	 * Allows a column to be sorted using a custom algorithm. The function
	 * receives three parameters, the first two being the two record Models to
	 * compare, and the third being a boolean true if the sort order should be
	 * descending.
	 * 
	 * <p>
	 * The function should return -1 to sort a above b, -1 to sort a below b,
	 * and 0 if they are equal. Keep in mind that the order should be reversed
	 * when desc is true.
	 * </p>
	 * 
	 * The desc parameter is provided to allow sortFns to always sort certain
	 * values above or below others, such as always sorting nulls on top.
	 * 
	 * @author sg
	 * 
	 */
	public static interface SortFn {
		int sort(Model a, Model b, boolean desc);
	}

	/**
	 * column sort function:
	 * 
	 * <pre>
	 * {
	 *   label: 'Name',
	 *   sortFn: function (a, b, desc) {
	 *     var an = a.get('lname') + b.get('fname'),
	 *         bn = a.get('lname') + b.get('fname'),
	 *         order = (an > bn) ? 1 : -(an < bn);
	 * 
	 *     return desc ? -order : order;
	 *   },
	 *   formatter: function (o) {
	 *     return o.data.lname + ', ' + o.data.fname;
	 *   }
	 * }
	 * </pre>
	 * 
	 * Allows a column to be sorted using a custom algorithm. The function
	 * receives three parameters, the first two being the two record Models to
	 * compare, and the third being a boolean true if the sort order should be
	 * descending.
	 * 
	 * <p>
	 * The function should return -1 to sort a above b, -1 to sort a below b,
	 * and 0 if they are equal. Keep in mind that the order should be reversed
	 * when desc is true.
	 * </p>
	 * 
	 * The desc parameter is provided to allow sortFns to always sort certain
	 * values above or below others, such as always sorting nulls on top.
	 * 
	 * 
	 * @return
	 */
	public native final JsFunction sortFn() /*-{
		return this.sortFn;
	}-*/;

	/**
	 * column sort function:
	 * 
	 * <pre>
	 * {
	 *   label: 'Name',
	 *   sortFn: function (a, b, desc) {
	 *     var an = a.get('lname') + b.get('fname'),
	 *         bn = a.get('lname') + b.get('fname'),
	 *         order = (an > bn) ? 1 : -(an < bn);
	 * 
	 *     return desc ? -order : order;
	 *   },
	 *   formatter: function (o) {
	 *     return o.data.lname + ', ' + o.data.fname;
	 *   }
	 * }
	 * </pre>
	 * 
	 * Allows a column to be sorted using a custom algorithm. The function
	 * receives three parameters, the first two being the two record Models to
	 * compare, and the third being a boolean true if the sort order should be
	 * descending.
	 * 
	 * <p>
	 * The function should return -1 to sort a above b, -1 to sort a below b,
	 * and 0 if they are equal. Keep in mind that the order should be reversed
	 * when desc is true.
	 * </p>
	 * 
	 * The desc parameter is provided to allow sortFns to always sort certain
	 * values above or below others, such as always sorting nulls on top.
	 * 
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column sortFn(JsFunction val) /*-{
		this.sortFn = val;
		return this;
	}-*/;

	/**
	 * column sort function:
	 * 
	 * <pre>
	 * {
	 *   label: 'Name',
	 *   sortFn: function (a, b, desc) {
	 *     var an = a.get('lname') + b.get('fname'),
	 *         bn = a.get('lname') + b.get('fname'),
	 *         order = (an > bn) ? 1 : -(an < bn);
	 * 
	 *     return desc ? -order : order;
	 *   },
	 *   formatter: function (o) {
	 *     return o.data.lname + ', ' + o.data.fname;
	 *   }
	 * }
	 * </pre>
	 * 
	 * Allows a column to be sorted using a custom algorithm. The function
	 * receives three parameters, the first two being the two record Models to
	 * compare, and the third being a boolean true if the sort order should be
	 * descending.
	 * 
	 * <p>
	 * The function should return -1 to sort a above b, -1 to sort a below b,
	 * and 0 if they are equal. Keep in mind that the order should be reversed
	 * when desc is true.
	 * </p>
	 * 
	 * The desc parameter is provided to allow sortFns to always sort certain
	 * values above or below others, such as always sorting nulls on top.
	 * 
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Column sortFn(SortFn val) /*-{
		var f = $entry(function(a, b, desc) {
			return val.@org.sgx.yuigwt.yui.widget.datatable.Column.SortFn::sort(Lorg/sgx/yuigwt/yui/model/Model;Lorg/sgx/yuigwt/yui/model/Model;Z)(a, b, desc);
		});
		this.sortFn = f;
		return this;
	}-*/;

	/**
	 * If a column is sorted, this will be set to 1 for ascending order or -1
	 * for descending. This configuration is public for inspection, but can't be
	 * used during DataTable instantiation to set the sort direction of the
	 * column. Use the table's sortBy attribute for that.
	 * 
	 * @return
	 */
	public native final int sortDir() /*-{
		return this.sortDir;
	}-*/;

	// /**
	// *
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final Column sortDir(int val) /*-{
	// this.sortDir = val;
	// return this;
	// }-*/;

	/**
	 * (read-only) The unique identifier assigned to each column. This is used
	 * for the id if not set, and the _id if none of name, 'field, key, or id`
	 * are set.
	 * 
	 * @return
	 */
	public native final String _yuid() /*-{
		return this._yuid;
	}-*/;

	// /**
	// * (read-only) The unique identifier assigned to each column. This is used
	// for the id if not set, and the _id if none of name, 'field, key, or id`
	// are set.
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final Column _yuid(String val) /*-{
	// this._yuid = val;
	// return this;
	// }-*/;

	/**
	 * (read-only) A unique-to-this-instance name used extensively in the
	 * rendering process. It is also used to create the column's classname, as
	 * the input name table.getColumn(HERE), and in the column header's &lt;th
	 * data-yui3-col-id="HERE">.
	 * 
	 * The value is populated by the first of name, field, key, id, or _yuid to
	 * have a value. If that value has already been used (such as when multiple
	 * columns have the same key), an incrementer is added to the end. For
	 * example, two columns with key: "id" will have _ids of "id" and "id2".
	 * table.getColumn("id") will return the first column, and
	 * table.getColumn("id2") will return the second.
	 * 
	 * @return
	 */
	public native final String id() /*-{
		return this.id;
	}-*/;

	// /**
	// *
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final Column id(String val) /*-{
	// this.id = val;
	// return this;
	// }-*/;
	/**
	 * (read-only) Used by Y.DataTable.HeaderView when building stacked column
	 * headers.
	 * 
	 * @return
	 */
	public native final String _colspan() /*-{
		return this._colspan;
	}-*/;

	/**
	 * (read-only) Used by Y.DataTable.HeaderView when building stacked column
	 * headers.
	 * 
	 * @return
	 */
	public native final String _rowspan() /*-{
		return this._rowspan;
	}-*/;

	/**
	 * (read-only) Assigned to all columns in a column's children collection.
	 * References the parent column object.
	 * 
	 * @return
	 */
	public native final String _parent() /*-{
		return this._parent;
	}-*/;

	/**
	 * (read-only) Array of the ids of the column and all parent columns. Used
	 * by Y.DataTable.BodyView to populate <td headers="THIS">when a cell
	 * references more than one header.
	 * 
	 * @return
	 */
	public native final String _headers() /*-{
		return this._headers;
	}-*/;
}
