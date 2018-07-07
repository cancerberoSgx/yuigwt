package org.sgx.yuigwt.yui.widget.datatable;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * config for DataTable widget
 * 
 * TODO: There are properties in here like summary, caption that I can't find in
 * the API docs.
 * 
 * @author sg
 * 
 */
public class DataTableConfig extends DataTableBaseConfig {

	public static final native DataTableConfig create()/*-{
		return {};
	}-*/;

	protected DataTableConfig() {
	}

	/**
	 * 
	 * @return
	 */
	public native final JsArray<JavaScriptObject> data() /*-{
		return this.data;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig data(JsArray/* <JavaScriptObject> */val) /*-{
		this.data = val;
		return this;
	}-*/;

	/**
	 * Controls whether addRow, removeRow, and modifyRow should trigger the
	 * underlying Model's sync layer by default.When true, it is unnecessary to
	 * pass the "sync" configuration property to those methods to trigger
	 * per-operation sync.
	 * 
	 * @return
	 */
	public native final boolean autoSync() /*-{
		return this.autoSync;
	}-*/;

	/**
	 * Controls whether addRow, removeRow, and modifyRow should trigger the
	 * underlying Model's sync layer by default.When true, it is unnecessary to
	 * pass the "sync" configuration property to those methods to trigger
	 * per-operation sync.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig autoSync(boolean val) /*-{
		this.autoSync = val;
		return this;
	}-*/;

	/**
	 * HTML content of an optional <caption> element to appear above the table.
	 * Leave this config unset or set to a falsy value to remove the
	 * caption.Default: '' (empty string)
	 * 
	 * @return
	 */
	public native final String caption() /*-{
		return this.caption;
	}-*/;

	/**
	 * HTML content of an optional <caption> element to appear above the table.
	 * Leave this config unset or set to a falsy value to remove the
	 * caption.Default: '' (empty string)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig caption(String val) /*-{
		this.caption = val;
		return this;
	}-*/;

	/**
	 * Columns to include in the rendered table.
	 * 
	 * <p>
	 * If omitted, the attributes on the configured recordType or the first item
	 * in the data collection will be used as a source.
	 * </p>
	 * 
	 * <p>
	 * This attribute takes an array of strings or objects (mixing the two is
	 * fine). Each string or object is considered a column to be rendered.
	 * Strings are converted to objects, so columns: ['first', 'last'] becomes
	 * columns: [{ key: 'first' }, { key: 'last' }].
	 * </p>
	 * 
	 * @return this - for setter chaining
	 */
	public native final JsArray<Column> columns() /*-{
		return this.columns;
	}-*/;

	/**
	 * Columns to include in the rendered table.
	 * 
	 * <p>
	 * If omitted, the attributes on the configured recordType or the first item
	 * in the data collection will be used as a source.
	 * </p>
	 * 
	 * <p>
	 * This attribute takes an array of strings or objects (mixing the two is
	 * fine). Each string or object is considered a column to be rendered.
	 * Strings are converted to objects, so columns: ['first', 'last'] becomes
	 * columns: [{ key: 'first' }, { key: 'last' }].
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig columns(JsArray<Column> val) /*-{
		this.columns = val;
		return this;
	}-*/;

	/**
	 * Columns to include in the rendered table.
	 * 
	 * <p>
	 * If omitted, the attributes on the configured recordType or the first item
	 * in the data collection will be used as a source.
	 * </p>
	 * 
	 * <p>
	 * This attribute takes an array of strings or objects (mixing the two is
	 * fine). Each string or object is considered a column to be rendered.
	 * Strings are converted to objects, so columns: ['first', 'last'] becomes
	 * columns: [{ key: 'first' }, { key: 'last' }].
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig columns(Column[] val) /*-{
		this.columns = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val);
		return this;
	}-*/;

	/**
	 * Columns to include in the rendered table.
	 * 
	 * <p>
	 * If omitted, the attributes on the configured recordType or the first item
	 * in the data collection will be used as a source.
	 * </p>
	 * 
	 * <p>
	 * This attribute takes an array of strings or objects (mixing the two is
	 * fine). Each string or object is considered a column to be rendered.
	 * Strings are converted to objects, so columns: ['first', 'last'] becomes
	 * columns: [{ key: 'first' }, { key: 'last' }].
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig columns(String... val) /*-{
		this.columns = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val);
		return this;
	}-*/;

	/**
	 * Columns to include in the rendered table.
	 * 
	 * <p>
	 * If omitted, the attributes on the configured recordType or the first item
	 * in the data collection will be used as a source.
	 * </p>
	 * 
	 * <p>
	 * This attribute takes an array of strings or objects (mixing the two is
	 * fine). Each string or object is considered a column to be rendered.
	 * Strings are converted to objects, so columns: ['first', 'last'] becomes
	 * columns: [{ key: 'first' }, { key: 'last' }].
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig columns(JsArrayString val) /*-{
		this.columns = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String summary() /*-{
		return this.summary;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig summary(String val) /*-{
		this.summary = val;
		return this;
	}-*/;

	// TODO: data : ModelList

	// TODO: recordSet - deprecated

	// TODO:; recordType

	/**
	 * <p>
	 * Activates or deactivates scrolling in the table. Acceptable values are:
	 * </p>
	 * 
	 * 
	 * - false - (default) Scrolling is disabled.</br>
	 * 
	 * - true or 'xy' - If height is set, vertical scrolling will be activated,
	 * if width is set, horizontal scrolling will be activated.</br>
	 * 
	 * - 'x' - Activate horizontal scrolling only. Requires the width attribute
	 * is also set.</br>
	 * 
	 * - 'y' - Activate vertical scrolling only. Requires the height attribute
	 * is also set.</br>
	 * 
	 * 
	 * @return
	 */
	public native final boolean scrollable() /*-{
		return this.scrollable;
	}-*/;

	/**
	 * Activates or deactivates scrolling in the table. Acceptable values
	 * are:</br>
	 * 
	 * false - (default) Scrolling is disabled.</br>
	 * 
	 * true or 'xy' - If height is set, vertical scrolling will be activated, if
	 * width is set, horizontal scrolling will be activated.</br>
	 * 
	 * 'x' - Activate horizontal scrolling only. Requires the width attribute is
	 * also set.</br>
	 * 
	 * 'y' - Activate vertical scrolling only. Requires the height attribute is
	 * also set.</br>
	 * 
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig scrollable(boolean val) /*-{
		this.scrollable = val;
		return this;
	}-*/;

	/**
	 * Activates or deactivates scrolling in the table. Acceptable values
	 * are:</br>
	 * 
	 * false - (default) Scrolling is disabled.</br>
	 * 
	 * true or 'xy' - If height is set, vertical scrolling will be activated, if
	 * width is set, horizontal scrolling will be activated.</br>
	 * 
	 * 'x' - Activate horizontal scrolling only. Requires the width attribute is
	 * also set.</br>
	 * 
	 * 'y' - Activate vertical scrolling only. Requires the height attribute is
	 * also set.</br>
	 * 
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig scrollable(String val) /*-{
		this.scrollable = val;
		return this;
	}-*/;

	/**
	 * Enables the display of messages in the table. Setting this to false will
	 * prevent the message Node from being created and showMessage from doing
	 * anything.
	 * 
	 * @return
	 */
	public native final boolean showMessages() /*-{
		return this.showMessages;
	}-*/;

	/**
	 * Enables the display of messages in the table. Setting this to false will
	 * prevent the message Node from being created and showMessage from doing
	 * anything.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig showMessages(boolean val) /*-{
		this.showMessages = val;
		return this;
	}-*/;

	/**
	 * Controls which column headers can trigger sorting by user clicks.</br>
	 * 
	 * Acceptable values are:</br>
	 * 
	 * "auto" - (default) looks for sortable: true in the column
	 * configurations</br>
	 * 
	 * true - all columns are enabled</br>
	 * 
	 * `false - no UI sortable is enabled</br>
	 * 
	 * {String[]} - array of key names to give sortable headers</br>
	 * 
	 * 
	 * @return
	 */
	public native final boolean sortable() /*-{
		return this.sortable;
	}-*/;

	/**
	 * Controls which column headers can trigger sorting by user clicks.</br>
	 * 
	 * Acceptable values are:</br>
	 * 
	 * "auto" - (default) looks for sortable: true in the column
	 * configurations</br>
	 * 
	 * true - all columns are enabled</br>
	 * 
	 * `false - no UI sortable is enabled</br>
	 * 
	 * {String[]} - array of key names to give sortable headers</br>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig sortable(boolean val) /*-{
		this.sortable = val;
		return this;
	}-*/;

	/**
	 * Controls which column headers can trigger sorting by user clicks.</br>
	 * 
	 * Acceptable values are:</br>
	 * 
	 * "auto" - (default) looks for sortable: true in the column
	 * configurations</br>
	 * 
	 * true - all columns are enabled</br>
	 * 
	 * `false - no UI sortable is enabled</br>
	 * 
	 * {String[]} - array of key names to give sortable headers</br>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig sortable(String val) /*-{
		this.sortable = val;
		return this;
	}-*/;

	/**
	 * Controls which column headers can trigger sorting by user clicks.</br>
	 * 
	 * Acceptable values are:</br>
	 * 
	 * "auto" - (default) looks for sortable: true in the column
	 * configurations</br>
	 * 
	 * true - all columns are enabled</br>
	 * 
	 * `false - no UI sortable is enabled</br>
	 * 
	 * {String[]} - array of key names to give sortable headers</br>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig sortable(String[] val) /*-{
		this.sortable = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(val);
		return this;
	}-*/;

	// /**
	// *
	// * @return
	// */
	// public native final String sortBy() /*-{
	// return this.sortBy;
	// }-*/;

	/**
	 * 
	 The current sort configuration to maintain in the data.
	 * 
	 * Accepts column key strings or objects with a single property, the column
	 * key, with a value of 1, -1, "asc", or "desc". E.g. { username: 'asc' }.
	 * String values are assumed to be ascending.</br> Example values would
	 * be:</br>
	 * 
	 * </br> "username" - sort by the data's username field or the key
	 * associated to a column with that name.
	 * 
	 * </br> { username: "desc" } - sort by username in descending order.
	 * Alternately, use values "asc", 1 (same as "asc"), or -1 (same as "desc").
	 * 
	 * </br> ["lastName", "firstName"] - ascending sort by lastName, but for
	 * records with the same lastName, ascending subsort by firstName. Array can
	 * have as many items as you want.
	 * 
	 * </br> [{ lastName: -1 }, "firstName"] - descending sort by lastName,
	 * ascending subsort by firstName. Mixed types are ok.
	 * 
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DataTableConfig sortBy(String val) /*-{
		this.sortBy = val;
		return this;
	}-*/;

	public native final DataTableConfig recordType(JsArrayString val) /*-{
		this.recordType = val;
		return this;
	}-*/;

	public native final DataTableConfig recordType(String[] val) /*-{
		this.recordType = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(val);
		return this;
	}-*/;

	// /**
	// * Strings containing language for sorting tooltips.Default: (strings for
	// current lang configured in the YUI instance config)
	// * @return
	// */
	// public native final JavaScriptObject strings() /*-{
	// return this.strings;
	// }-*/;
	//
	// /**
	// *Strings containing language for sorting tooltips.Default: (strings for
	// current lang configured in the YUI instance config)
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final DataTableConfig strings(JavaScriptObject val) /*-{
	// this.strings = val;
	// return this;
	// }-*/;

}
