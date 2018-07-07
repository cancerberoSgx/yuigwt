package org.sgx.yuigwt.yui.widget.datatable;

import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventHandle;
import org.sgx.yuigwt.yui.model.Model;
import org.sgx.yuigwt.yui.model.ModelList;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsFunction;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayString;

/**
 * 
 A Widget for displaying tabular data. Before feature modules are use()d, this
 * class is functionally equivalent to DataTable.Base. However, feature modules
 * can modify this class in non-destructive ways, expanding the API and
 * functionality. </br>
 * 
 * This is the primary DataTable class. Out of the box, it provides the ability
 * to dynamically generate an HTML table from a set of column configurations and
 * row data. But feature module inclusion can add table sorting, pagintaion,
 * highlighting, selection, and more.
 * 
 * <pre>
 * // The functionality of this table would require additional modules be use()d,
 * // but the feature APIs are aggregated onto Y.DataTable.
 * // (Snippet is for illustration. Not all features are available today.)
 * var table = new Y.DataTable({
 *     columns: [
 *         { type: 'checkbox', defaultChecked: true },
 *         { key: 'firstName', sortable: true, resizable: true },
 *         { key: 'lastName', sortable: true },
 *         { key: 'role', formatter: toRoleName }
 *     ],
 *     data: {
 *         source: 'http://myserver.com/service/json',
 *         type: 'json',
 *         schema: {
 *             resultListLocator: 'results.users',
 *             fields: [
 *                 'username',
 *                 'firstName',
 *                 'lastName',
 *                 { key: 'role', type: 'number' }
 *             ]
 *         }
 *     },
 *     recordType: UserModel,
 *     pagedData: {
 *         location: 'footer',
 *         pageSizes: [20, 50, 'all'],
 *         rowsPerPage: 20,
 *         pageLinks: 5
 *     },
 *     editable: true
 * });
 * </pre>
 * 
 * <h1>Column Configuration</h1> </br>
 * 
 * The column configurations are set in the form of an array of objects, where
 * each object corresponds to a column. For columns populated directly from the
 * row data, a 'key' property is required to bind the column to that property or
 * attribute in the row data. </br>
 * 
 * Not all columns need to relate to row data, nor do all properties or
 * attributes of the row data need to have a corresponding column. However, only
 * those columns included in the columns configuration attribute will be
 * rendered. </br>
 * 
 * Other column configuration properties are supported by the configured
 * headerView, bodyView, footerView classes as well as any features added by
 * plugins or class extensions. See the description of DataTable.HeaderView,
 * DataTable.BodyView, and other DataTable feature classes to see what column
 * properties they support. </br>
 * 
 * Some examples of column configurations would be:
 * 
 * <pre>
 * // Basic
 * var columns = [{ key: 'firstName' }, { key: 'lastName' }, { key: 'age' }];
 * 
 * // For columns without any additional configuration, strings can be used
 * var columns = ['firstName', 'lastName', 'age'];
 * 
 * // Multi-row column headers (see DataTable.HeaderView for details)
 * var columns = [
 *     {
 *         label: 'Name',
 *         children: [
 *             { key: 'firstName' },
 *             { key: 'lastName' }
 *         ]
 *     },
 *     'age' // mixing and matching objects and strings is ok
 * ];
 * 
 * // Including columns that are not related 1:1 to row data fields/attributes
 * // (See DataTable.BodyView for details)
 * var columns = [
 *     {
 *         label: 'Name', // Needed for the column header
 *         formatter: function (o) {
 *             // Fill the column cells with data from firstName and lastName
 *             if (o.data.age > 55) {
 *                 o.className += ' senior';
 *             }
 *             return o.data.lastName + ', ' + o.data.firstName;
 *         }
 *     },
 *     'age'
 * ];
 * 
 * // Columns that include feature configurations (for illustration; not all
 * // features are available today).
 * var columns = [
 *     { type: 'checkbox', defaultChecked: true },
 *     { key: 'firstName', sortable: true, resizable: true, min-width: '300px' },
 *     { key: 'lastName', sortable: true, resizable: true, min-width: '300px' },
 *     { key: 'age', emptyCellValue: 'unknown' }
 * ];
 * </pre>
 * 
 * <h1>Row Data Configuration</h1> </br>
 * 
 * The data configuration attribute is responsible for housing the data objects
 * that will be rendered as rows. You can provide this information in two ways
 * by default: </br>
 * 
 * An array of simple objects with key:value pairs</br>
 * 
 * A ModelList of Base-based class instances (presumably Model subclass
 * instances)</br>
 * 
 * </br> If an array of objects is passed, it will be translated into a
 * ModelList filled with instances of the class provided to the recordType
 * attribute. This attribute can also create a custom Model subclass from an
 * array of field names or an object of attribute configurations. If no
 * recordType is provided, one will be created for you from available
 * information (see _initRecordType). Providing either your own ModelList
 * instance for data, or at least Model class for recordType, is the best way to
 * control client-server synchronization when modifying data on the client side.
 * </br>
 * 
 * The ModelList instance that manages the table's data is available in the data
 * property on the DataTable instance.
 * 
 * <h1>Rendering</h1>
 * 
 * TableShow rendering is a collaborative process between the DataTable and its
 * configured headerView, bodyView, and footerView. The DataTable renders the
 * table and caption elements, but the contents of the table are delegated to
 * instances of the classes provided to the headerView, bodyView, and footerView
 * attributes. If any of these attributes is unset, that portion of the table
 * won't be rendered. </br>
 * 
 * DataTable.Base assigns the default headerView to Y.DataTable.HeaderView and
 * the default bodyView to Y.DataTable.BodyView, though either can be overridden
 * for custom rendering. No default footerView is assigned. See those classes
 * for more details about how they operate.
 * 
 * @author sg
 * 
 */
public class DataTable extends DataTableBase {
	protected DataTable() {
	}

	public static final String EVENT_ADDCOLUMN = "addColumn", EVENT_MODIFYCOLUMN = "modifyColumn", EVENT_MOVECOLUMN = "moveColumn", EVENT_REMOVECOLUMN = "removeColumn",
			EVENT_SORT = "sort";

	/**
	 * The collection of data records to display. This attribute is a pass
	 * through to a data property, which is a ModelList instance. <br/>
	 * If this attribute is passed a ModelList or subclass, it will be assigned
	 * to the property directly. If an array of objects is passed, a new
	 * ModelList will be created using the configured recordType as its model
	 * property and seeded with the array. <br/>
	 * Retrieving this attribute will return the ModelList stored in the data
	 * property. <br/>
	 * Default: `new ModelList()`
	 * 
	 * @return the attribute
	 */
	public final native ModelList dataModelList()/*-{
		return this.get("data");
	}-*/;
	/**
	 * The collection of data records to display. This attribute is a pass
	 * through to a data property, which is a ModelList instance. <br/>
	 * If this attribute is passed a ModelList or subclass, it will be assigned
	 * to the property directly. If an array of objects is passed, a new
	 * ModelList will be created using the configured recordType as its model
	 * property and seeded with the array. <br/>
	 * Retrieving this attribute will return the ModelList stored in the data
	 * property. <br/>
	 * Default: `new ModelList()`
	 * 
	 * @return the attribute
	 */
	public final native JsArray dataArray()/*-{
		return this.get("data");
	}-*/;

	/**
	 * The collection of data records to display. This attribute is a pass
	 * through to a data property, which is a ModelList instance. <br/>
	 * If this attribute is passed a ModelList or subclass, it will be assigned
	 * to the property directly. If an array of objects is passed, a new
	 * ModelList will be created using the configured recordType as its model
	 * property and seeded with the array. <br/>
	 * Retrieving this attribute will return the ModelList stored in the data
	 * property. <br/>
	 * Default: `new ModelList()`
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native DataTableBase data(JsArray val)/*-{
		this.set("data", val);
		return this;
	}-*/;

	// delegate
	/**
	 * Pass through to delegate() called from the contentBox.
	 * 
	 * @param type
	 *            the event type to delegate
	 * @param fn
	 *            the callback function to execute. This function will be
	 *            provided the event object for the delegated event.
	 * @param spec
	 *            a selector that must match the target of the event or a
	 *            function to test target and its parents for a match
	 * @return
	 */
	public final native EventHandle delegate(String type, JsFunction fn, String spec)/*-{
		return this.delegate(type, fn, spec);
	}-*/;

	/**
	 * Pass through to delegate() called from the contentBox.
	 * 
	 * @param type
	 *            the event type to delegate
	 * @param fn
	 *            the callback function to execute. This function will be
	 *            provided the event object for the delegated event.
	 * @param spec
	 *            a selector that must match the target of the event or a
	 *            function to test target and its parents for a match
	 * @return
	 */
	public final native EventHandle delegate(String type, EventCallback c, String spec)/*-{
		var fn = $entry(function(e) {
			c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		});
		return this.delegate(type, fn, spec);
	}-*/;

	/**
	 * Pass through to delegate() called from the contentBox.
	 * 
	 * @param type
	 *            the event type to delegate
	 * @param fn
	 *            the callback function to execute. This function will be
	 *            provided the event object for the delegated event.
	 * @param spec
	 *            a selector that must match the target of the event or a
	 *            function to test target and its parents for a match
	 * @return
	 */
	public final native EventHandle delegate(String type, JsFunction fn, JsFunction spec)/*-{
		return this.delegate(type, fn, spec);
	}-*/;

	/**
	 * Pass through to delegate() called from the contentBox.
	 * 
	 * @param type
	 *            the event type to delegate
	 * @param fn
	 *            the callback function to execute. This function will be
	 *            provided the event object for the delegated event.
	 * @param spec
	 *            a selector that must match the target of the event or a
	 *            function to test target and its parents for a match
	 * @return
	 */
	public final native EventHandle delegate(String type, EventCallback c, JsFunction spec)/*-{
		var fn = $entry(function(e) {
			c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		});
		return this.delegate(type, fn, spec);
	}-*/;

	
	
	/**
	 * Pass through to delegate() called from the contentBox.
	 * 
	 * @param type
	 *            the event type to delegate
	 * @param fn
	 *            the callback function to execute. This function will be
	 *            provided the event object for the delegated event.
	 * @param spec
	 *            a selector that must match the target of the event or a
	 *            function to test target and its parents for a match
	 * @return
	 */
	public final native EventHandle delegate(String type, JsFunction fn, String spec, JavaScriptObject data)/*-{
		return this.delegate(type, fn, spec, data);
	}-*/;

	/**
	 * Pass through to delegate() called from the contentBox.
	 * 
	 * @param type
	 *            the event type to delegate
	 * @param fn
	 *            the callback function to execute. This function will be
	 *            provided the event object for the delegated event.
	 * @param spec
	 *            a selector that must match the target of the event or a
	 *            function to test target and its parents for a match
	 * @return
	 */
	public final native EventHandle delegate(String type, EventCallback c, String spec, JavaScriptObject data)/*-{
		var fn = $entry(function(e) {
			c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		});
		return this.delegate(type, fn, spec, data);
	}-*/;

	/**
	 * Pass through to delegate() called from the contentBox.
	 * 
	 * @param type
	 *            the event type to delegate
	 * @param fn
	 *            the callback function to execute. This function will be
	 *            provided the event object for the delegated event.
	 * @param spec
	 *            a selector that must match the target of the event or a
	 *            function to test target and its parents for a match
	 *            
	 * @return
	 */
	public final native EventHandle delegate(String type, JsFunction fn, JsFunction spec, JavaScriptObject data)/*-{
		return this.delegate(type, fn, spec, data);
	}-*/;

	/**
	 * Pass through to delegate() called from the contentBox.
	 * 
	 * @param type
	 *            the event type to delegate
	 * @param fn
	 *            the callback function to execute. This function will be
	 *            provided the event object for the delegated event.
	 * @param spec
	 *            a selector that must match the target of the event or a
	 *            function to test target and its parents for a match
	 * @return
	 */
	public final native EventHandle delegate(String type, EventCallback c, JsFunction spec, JavaScriptObject data)/*-{
		var fn = $entry(function(e) {
			c.@org.sgx.yuigwt.yui.event.EventCallback::call(*)(e);
		});
		return this.delegate(type, fn, spec, data);
	}-*/;
	
	
	
	/**
	 * 
	 <p>
	 * Gets the column configuration object for the given key, name, or index.
	 * For nested columns, name can be an array of indexes, each identifying the
	 * index of that column in the respective parent's "children" array.
	 * </p>
	 * 
	 * <p>
	 * If you pass a column object, it will be returned.
	 * </p>
	 * 
	 * <p>
	 * For columns with keys, you can also fetch the column with
	 * instance.get('columns.foo').
	 * </p>
	 * 
	 * @param name
	 *            Key, "name", index, or index array to identify the column
	 * 
	 * @return self for method chaining
	 */
	public native final Column getColumn(String name) /*-{
		return this.getColumn(name);
	}-*/;

	/**
	 * 
	 <p>
	 * Gets the column configuration object for the given key, name, or index.
	 * For nested columns, name can be an array of indexes, each identifying the
	 * index of that column in the respective parent's "children" array.
	 * </p>
	 * 
	 * <p>
	 * If you pass a column object, it will be returned.
	 * </p>
	 * 
	 * <p>
	 * For columns with keys, you can also fetch the column with
	 * instance.get('columns.foo').
	 * </p>
	 * 
	 * @param name
	 *            Key, "name", index, or index array to identify the column
	 * 
	 * @return self for method chaining
	 */
	public native final Column getColumn(int index) /*-{
		return this.getColumn(index);
	}-*/;

	// Attrs
	/**
	 * 
	 * @return the attribute
	 */
	public final native String caption()/*-{
		return this.get("caption");
	}-*/;

	/**
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native DataTable caption(String val)/*-{
		this.set("caption", val);
		return this;
	}-*/;

	/**
	 * Returns the Model associated to the record id, clientId, or index (not
	 * row index). If none of those yield a Model from the data ModelList, the
	 * arguments will be passed to the view instance's getRecord method if it
	 * has one. If no Model can be found, null is returned.
	 * 
	 * @param seed
	 *            Record id, clientId, index, Node, or identifier for a row or
	 *            child element
	 * @return self for method chaining
	 */
	public final native Model getRecord(String seed)/*-{
		return this.getRecord(seed);
	}-*/;

	/**
	 * Returns the Model associated to the record id, clientId, or index (not
	 * row index). If none of those yield a Model from the data ModelList, the
	 * arguments will be passed to the view instance's getRecord method if it
	 * has one. If no Model can be found, null is returned.
	 * 
	 * @param seed
	 *            Record id, clientId, index, Node, or identifier for a row or
	 *            child element
	 * @return self for method chaining
	 */
	public final native Model getRecord(int seed)/*-{
		return this.getRecord(seed);
	}-*/;

	/**
	 * Returns the Model associated to the record id, clientId, or index (not
	 * row index). If none of those yield a Model from the data ModelList, the
	 * arguments will be passed to the view instance's getRecord method if it
	 * has one. If no Model can be found, null is returned.
	 * 
	 * @param seed
	 *            Record id, clientId, index, Node, or identifier for a row or
	 *            child element
	 * @return self for method chaining
	 */
	public final native Model getRecord(Node seed)/*-{
		return this.getRecord(seed);
	}-*/;

	/**
	 * Returns the &lt;tr> Node from the given row index, Model, or Model's
	 * clientId. If the rows haven't been rendered yet, or if the row can't be
	 * found by the input, null is returned. This is actually just a pass
	 * through to the view instance's method by the same name.
	 * 
	 * @param id
	 *            Row index, Model instance, or clientId
	 * @return
	 */
	public final native Node getRow(Model id)/*-{
		return this.getRow(id);
	}-*/;

	/**
	 * Returns the &lt;tr> Node from the given row index, Model, or Model's
	 * clientId. If the rows haven't been rendered yet, or if the row can't be
	 * found by the input, null is returned. This is actually just a pass
	 * through to the view instance's method by the same name.
	 * 
	 * @param id
	 *            Row index, Model instance, or clientId
	 * @return
	 */
	public final native Node getRow(int id)/*-{
		return this.getRow(id);
	}-*/;

	/**
	 * Returns the &lt;tr> Node from the given row index, Model, or Model's
	 * clientId. If the rows haven't been rendered yet, or if the row can't be
	 * found by the input, null is returned. This is actually just a pass
	 * through to the view instance's method by the same name.
	 * 
	 * @param id
	 *            Row index, Model instance, or clientId
	 * @return
	 */
	public final native Node getRow(String id)/*-{
		return this.getRow(id);
	}-*/;

	// /**Returns the name of the skin that's currently applied to the widget.
	// This is only really useful after the widget's DOM structure is in the
	// document, either by render or by progressive enhancement. Searches up the
	// Widget's ancestor axis for a class yui3-skin-(name), and returns the
	// (name) portion. Otherwise, returns null.
	// * @return the name of the skin, or null (yui3-skin-sam => sam)
	// */
	// public final native String getSkinName()/*-{
	// return this.getSkinName();
	// }-*/;

	/**
	 * Hides the message node.
	 */
	public final native DataTable hideMessage()/*-{
		return this.hideMessage();
	}-*/;

	/**
	 * Updates an existing column definition. Fires the modifyColumn event. For
	 * example:
	 * 
	 * <pre>
	 * // Add a formatter to the existing 'price' column definition
	 * table.modifyColumn('price', { formatter: currencyFormatter });
	 * 
	 * // Change the label on a header cell in a set of nested headers three rows
	 * // deep.  The index array translates to
	 * // [ 2,  -- in the third column's children
	 * //   1,  -- the second child
	 * //   3 ] -- the fourth child column
	 * table.modifyColumn([2, 1, 3], { label: 'Experience' });
	 * </pre>
	 * 
	 * @param name
	 *            The column key, name, index, or current configuration object
	 * @param config
	 *            The new column configuration properties
	 * @return
	 */
	public final native DataTable modifyColumn(String name, Column config)/*-{
		return this.modifyColumn(name, config);
	}-*/;

	/**
	 * Updates an existing column definition. Fires the modifyColumn event. For
	 * example:
	 * 
	 * <pre>
	 * // Add a formatter to the existing 'price' column definition
	 * table.modifyColumn('price', { formatter: currencyFormatter });
	 * 
	 * // Change the label on a header cell in a set of nested headers three rows
	 * // deep.  The index array translates to
	 * // [ 2,  -- in the third column's children
	 * //   1,  -- the second child
	 * //   3 ] -- the fourth child column
	 * table.modifyColumn([2, 1, 3], { label: 'Experience' });
	 * </pre>
	 * 
	 * @param name
	 *            The column key, name, index, or current configuration object
	 * @param config
	 *            The new column configuration properties
	 * @return
	 */
	public final native DataTable modifyColumn(int name, Column config)/*-{
		return this.modifyColumn(name, config);
	}-*/;

	/**
	 * Updates an existing column definition. Fires the modifyColumn event. For
	 * example:
	 * 
	 * <pre>
	 * // Add a formatter to the existing 'price' column definition
	 * table.modifyColumn('price', { formatter: currencyFormatter });
	 * 
	 * // Change the label on a header cell in a set of nested headers three rows
	 * // deep.  The index array translates to
	 * // [ 2,  -- in the third column's children
	 * //   1,  -- the second child
	 * //   3 ] -- the fourth child column
	 * table.modifyColumn([2, 1, 3], { label: 'Experience' });
	 * </pre>
	 * 
	 * @param name
	 *            The column key, name, index, or current configuration object
	 * @param config
	 *            The new column configuration properties
	 * @return
	 */
	public final native DataTable modifyColumn(JsArrayInteger name, Column config)/*-{
		return this.modifyColumn(name, config);
	}-*/;

	/**
	 * Updates an existing column definition. Fires the modifyColumn event. For
	 * example:
	 * 
	 * <pre>
	 * // Add a formatter to the existing 'price' column definition
	 * table.modifyColumn('price', { formatter: currencyFormatter });
	 * 
	 * // Change the label on a header cell in a set of nested headers three rows
	 * // deep.  The index array translates to
	 * // [ 2,  -- in the third column's children
	 * //   1,  -- the second child
	 * //   3 ] -- the fourth child column
	 * table.modifyColumn([2, 1, 3], { label: 'Experience' });
	 * </pre>
	 * 
	 * @param name
	 *            The column key, name, index, or current configuration object
	 * @param config
	 *            The new column configuration properties
	 * @return
	 */
	public final native DataTable modifyColumn(int[] name, Column config)/*-{
		return this
				.modifyColumn(
						@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayInt([I)(name),
						config);
	}-*/;

	/**
	 * <p>
	 * Updates an existing record in the DataTable's data ModelList. The record
	 * can be provided explicitly or targeted by it's id (see ModelList's
	 * getById method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the all other passed
	 * arguments to the Model's setAttrs method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be save()d.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's save() method.
	 * </p>
	 * 
	 * @param id
	 * @param data
	 * @return
	 */
	public final native DataTable modifyRow(String id, JavaScriptObject data)/*-{
		return this.modifyRow(id, data);
	}-*/;

	/**
	 * <p>
	 * Updates an existing record in the DataTable's data ModelList. The record
	 * can be provided explicitly or targeted by it's id (see ModelList's
	 * getById method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the all other passed
	 * arguments to the Model's setAttrs method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be save()d.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's save() method.
	 * </p>
	 * 
	 * @param id
	 * @param data
	 * @return
	 */
	public final native DataTable modifyRow(String id, JavaScriptObject data, JavaScriptObject config)/*-{
		return this.modifyRow(id, data);
	}-*/;

	/**
	 * <p>
	 * Updates an existing record in the DataTable's data ModelList. The record
	 * can be provided explicitly or targeted by it's id (see ModelList's
	 * getById method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the all other passed
	 * arguments to the Model's setAttrs method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be save()d.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's save() method.
	 * </p>
	 * 
	 * @param id
	 * @param data
	 * @return
	 */
	public final native DataTable modifyRow(int id, JavaScriptObject data)/*-{
		return this.modifyRow(id, data);
	}-*/;

	/**
	 * <p>
	 * Updates an existing record in the DataTable's data ModelList. The record
	 * can be provided explicitly or targeted by it's id (see ModelList's
	 * getById method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the all other passed
	 * arguments to the Model's setAttrs method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be save()d.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's save() method.
	 * </p>
	 * 
	 * @param id
	 * @param data
	 * @return
	 */
	public final native DataTable modifyRow(int id, JavaScriptObject data, JavaScriptObject config)/*-{
		return this.modifyRow(id, data);
	}-*/;

	/**
	 * <p>
	 * Updates an existing record in the DataTable's data ModelList. The record
	 * can be provided explicitly or targeted by it's id (see ModelList's
	 * getById method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the all other passed
	 * arguments to the Model's setAttrs method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be save()d.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's save() method.
	 * </p>
	 * 
	 * @param id
	 * @param data
	 * @return
	 */
	public final native DataTable modifyRow(JavaScriptObject id, JavaScriptObject data)/*-{
		return this.modifyRow(id, data);
	}-*/;

	/**
	 * <p>
	 * Updates an existing record in the DataTable's data ModelList. The record
	 * can be provided explicitly or targeted by it's id (see ModelList's
	 * getById method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the all other passed
	 * arguments to the Model's setAttrs method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be save()d.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's save() method.
	 * </p>
	 * 
	 * @param id
	 * @param data
	 * @return
	 */
	public final native DataTable modifyRow(JavaScriptObject id, JavaScriptObject data, JavaScriptObject config)/*-{
		return this.modifyRow(id, data);
	}-*/;

	// TODO: modifyRow with callback

	/**
	 * <p>
	 * Moves an existing column to a new location. Fires the moveColumn event.
	 * </p>
	 * 
	 * <p>
	 * The destination index can be a number or array of numbers to place a
	 * column header in a nested header row.
	 * </p>
	 * 
	 * @param name
	 *            he column key, name, index, or current configuration object
	 * @param index
	 *            The destination index of the column
	 * @return
	 */
	public final native DataTable moveColumn(String name, int index)/*-{
		return this.moveColumn(name, index);
	}-*/;

	/**
	 * <p>
	 * Moves an existing column to a new location. Fires the moveColumn event.
	 * </p>
	 * 
	 * <p>
	 * The destination index can be a number or array of numbers to place a
	 * column header in a nested header row.
	 * </p>
	 * 
	 * @param name
	 *            he column key, name, index, or current configuration object
	 * @param index
	 *            The destination index of the column
	 * @return
	 */
	public final native DataTable moveColumn(int name, int index)/*-{
		return this.moveColumn(name, index);
	}-*/;

	/**
	 * <p>
	 * Moves an existing column to a new location. Fires the moveColumn event.
	 * </p>
	 * 
	 * <p>
	 * The destination index can be a number or array of numbers to place a
	 * column header in a nested header row.
	 * </p>
	 * 
	 * @param name
	 *            he column key, name, index, or current configuration object
	 * @param index
	 *            The destination index of the column
	 * @return
	 */
	public final native DataTable moveColumn(int[] name, int[] index)/*-{
		return this.moveColumn(
				@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayInt([I)(name),
				@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayInt([I)(index));
	}-*/;

	/**
	 * <p>
	 * Moves an existing column to a new location. Fires the moveColumn event.
	 * </p>
	 * 
	 * <p>
	 * The destination index can be a number or array of numbers to place a
	 * column header in a nested header row.
	 * </p>
	 * 
	 * @param name
	 *            he column key, name, index, or current configuration object
	 * @param index
	 *            The destination index of the column
	 * @return
	 */
	public final native DataTable moveColumn(JsArrayInteger name, JsArrayInteger index)/*-{
		return this.moveColumn(name, index);
	}-*/;

	/**
	 * <p>
	 * Moves an existing column to a new location. Fires the moveColumn event.
	 * </p>
	 * 
	 * <p>
	 * The destination index can be a number or array of numbers to place a
	 * column header in a nested header row.
	 * </p>
	 * 
	 * @param name
	 *            he column key, name, index, or current configuration object
	 * @param index
	 *            The destination index of the column
	 * @return
	 */
	public final native DataTable moveColumn(Column name, int index)/*-{
		return this.moveColumn(name, index);
	}-*/;

	/**
	 * Removes an existing column. Fires the removeColumn event.
	 * 
	 * @param name
	 *            The column key, name, index, or current configuration object
	 * @return
	 */
	public final native DataTable removeColumn(String name)/*-{
		return this.removeColumn(name);
	}-*/;

	/**
	 * Removes an existing column. Fires the removeColumn event.
	 * 
	 * @param name
	 *            The column key, name, index, or current configuration object
	 * @return
	 */
	public final native DataTable removeColumn(int name)/*-{
		return this.removeColumn(name);
	}-*/;

	/**
	 * Removes an existing column. Fires the removeColumn event.
	 * 
	 * @param name
	 *            The column key, name, index, or current configuration object
	 * @return
	 */
	public final native DataTable removeColumn(JsArrayInteger name)/*-{
		return this.removeColumn(name);
	}-*/;

	/**
	 * Removes an existing column. Fires the removeColumn event.
	 * 
	 * @param name
	 *            The column key, name, index, or current configuration object
	 * @return
	 */
	public final native DataTable removeColumn(int[] name)/*-{
		return this
				.removeColumn(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayInt([I)(name));
	}-*/;

	/**
	 * Removes an existing column. Fires the removeColumn event.
	 * 
	 * @param name
	 *            The column key, name, index, or current configuration object
	 * @return
	 */
	public final native DataTable removeColumn(Column name)/*-{
		return this.removeColumn(name);
	}-*/;

	/**
	 * <p>
	 * Removes a record from the DataTable's data ModelList. The record can be
	 * provided explicitly or targeted by it's id (see ModelList's getById
	 * method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the Model and all other
	 * passed arguments to the data ModelList's remove method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be destroyed, passing {
	 * delete: true } to trigger calling the Model's sync layer.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's destroy() method.
	 * </p>
	 * 
	 * @param id
	 *            The Model instance or identifier
	 * @return
	 */
	public final native DataTable removeRow(Model id)/*-{
		return this.removeRow(id);
	}-*/;

	/**
	 * <p>
	 * Removes a record from the DataTable's data ModelList. The record can be
	 * provided explicitly or targeted by it's id (see ModelList's getById
	 * method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the Model and all other
	 * passed arguments to the data ModelList's remove method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be destroyed, passing {
	 * delete: true } to trigger calling the Model's sync layer.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's destroy() method.
	 * </p>
	 * 
	 * @param id
	 *            The Model instance or identifier
	 * @return
	 */
	public final native DataTable removeRow(String id)/*-{
		return this.removeRow(id);
	}-*/;

	/**
	 * <p>
	 * Removes a record from the DataTable's data ModelList. The record can be
	 * provided explicitly or targeted by it's id (see ModelList's getById
	 * method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the Model and all other
	 * passed arguments to the data ModelList's remove method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be destroyed, passing {
	 * delete: true } to trigger calling the Model's sync layer.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's destroy() method.
	 * </p>
	 * 
	 * @param id
	 *            The Model instance or identifier
	 * @return
	 */
	public final native DataTable removeRow(int id)/*-{
		return this.removeRow(id);
	}-*/;

	/**
	 * <p>
	 * Removes a record from the DataTable's data ModelList. The record can be
	 * provided explicitly or targeted by it's id (see ModelList's getById
	 * method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the Model and all other
	 * passed arguments to the data ModelList's remove method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be destroyed, passing {
	 * delete: true } to trigger calling the Model's sync layer.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's destroy() method.
	 * </p>
	 * 
	 * @param id
	 *            The Model instance or identifier
	 * @param config
	 *            Configuration to pass along
	 * @return
	 */
	public final native DataTable removeRow(Model id, JavaScriptObject config)/*-{
		return this.removeRow(id);
	}-*/;

	/**
	 * <p>
	 * Removes a record from the DataTable's data ModelList. The record can be
	 * provided explicitly or targeted by it's id (see ModelList's getById
	 * method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the Model and all other
	 * passed arguments to the data ModelList's remove method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be destroyed, passing {
	 * delete: true } to trigger calling the Model's sync layer.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's destroy() method.
	 * </p>
	 * 
	 * @param id
	 *            The Model instance or identifier
	 * @param config
	 *            Configuration to pass along
	 * @return
	 */
	public final native DataTable removeRow(String id, JavaScriptObject config)/*-{
		return this.removeRow(id);
	}-*/;

	/**
	 * <p>
	 * Removes a record from the DataTable's data ModelList. The record can be
	 * provided explicitly or targeted by it's id (see ModelList's getById
	 * method), clientId, or index in the ModelList.
	 * </p>
	 * 
	 * <p>
	 * After locating the target Model, this relays the Model and all other
	 * passed arguments to the data ModelList's remove method.
	 * </p>
	 * 
	 * <p>
	 * If a configuration object is passed as a second argument, and that object
	 * has sync: true set, the underlying Model will be destroyed, passing {
	 * delete: true } to trigger calling the Model's sync layer.
	 * </p>
	 * 
	 * <p>
	 * If the DataTable's autoSync attribute is set to true, the additional
	 * argument is not needed.
	 * </p>
	 * 
	 * <p>
	 * If syncing and the last argument is a function, that function will be
	 * used as a callback to the Model's destroy() method.
	 * </p>
	 * 
	 * @param id
	 *            The Model instance or identifier
	 * @param config
	 *            Configuration to pass along
	 * @return
	 */
	public final native DataTable removeRow(int id, JavaScriptObject config)/*-{
		return this.removeRow(id);
	}-*/;

	// TODO: removeRow with callback

	/**
	 * Scrolls a given row or cell into view if the table is scrolling. Pass the
	 * clientId of a Model from the DataTable's data ModelList or its row index
	 * to scroll to a row or a [row index, column index] array to scroll to a
	 * cell. Alternately, to scroll to any element contained within the table's
	 * scrolling areas, pass its ID, or the Node itself (though you could just
	 * as well call node.scrollIntoView() yourself, but hey, whatever).
	 * 
	 * @param id
	 *            A row clientId, row index, cell coordinate array, id string,
	 *            or Node
	 * @return
	 */
	public final native DataTable scrollTo(String id)/*-{
		return this.scrollTo(id);
	}-*/;

	/**
	 * Scrolls a given row or cell into view if the table is scrolling. Pass the
	 * clientId of a Model from the DataTable's data ModelList or its row index
	 * to scroll to a row or a [row index, column index] array to scroll to a
	 * cell. Alternately, to scroll to any element contained within the table's
	 * scrolling areas, pass its ID, or the Node itself (though you could just
	 * as well call node.scrollIntoView() yourself, but hey, whatever).
	 * 
	 * @param id
	 *            A row clientId, row index, cell coordinate array, id string,
	 *            or Node
	 * @return
	 */
	public final native DataTable scrollTo(int id)/*-{
		return this.scrollTo(id);
	}-*/;

	/**
	 * Scrolls a given row or cell into view if the table is scrolling. Pass the
	 * clientId of a Model from the DataTable's data ModelList or its row index
	 * to scroll to a row or a [row index, column index] array to scroll to a
	 * cell. Alternately, to scroll to any element contained within the table's
	 * scrolling areas, pass its ID, or the Node itself (though you could just
	 * as well call node.scrollIntoView() yourself, but hey, whatever).
	 * 
	 * @param id
	 *            A row clientId, row index, cell coordinate array, id string,
	 *            or Node
	 * @return
	 */
	public final native DataTable scrollTo(JsArrayInteger id)/*-{
		return this.scrollTo(id);
	}-*/;

	/**
	 * Scrolls a given row or cell into view if the table is scrolling. Pass the
	 * clientId of a Model from the DataTable's data ModelList or its row index
	 * to scroll to a row or a [row index, column index] array to scroll to a
	 * cell. Alternately, to scroll to any element contained within the table's
	 * scrolling areas, pass its ID, or the Node itself (though you could just
	 * as well call node.scrollIntoView() yourself, but hey, whatever).
	 * 
	 * @param id
	 *            A row clientId, row index, cell coordinate array, id string,
	 *            or Node
	 * @return
	 */
	public final native DataTable scrollTo(int[] id)/*-{
		return this
				.scrollTo(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayInt([I)(id));
	}-*/;

	/**
	 * Scrolls a given row or cell into view if the table is scrolling. Pass the
	 * clientId of a Model from the DataTable's data ModelList or its row index
	 * to scroll to a row or a [row index, column index] array to scroll to a
	 * cell. Alternately, to scroll to any element contained within the table's
	 * scrolling areas, pass its ID, or the Node itself (though you could just
	 * as well call node.scrollIntoView() yourself, but hey, whatever).
	 * 
	 * @param id
	 *            A row clientId, row index, cell coordinate array, id string,
	 *            or Node
	 * @return
	 */
	public final native DataTable scrollTo(Node id)/*-{
		return this.scrollTo(id);
	}-*/;

	/**
	 * Assigns the style width of the <col> representing the column identifed by
	 * id and updates the column configuration.
	 * 
	 * Pass the empty string for width to return a column to auto sizing.
	 * 
	 * This does not trigger a columnsChange event today, but I can be convinced
	 * that it should.
	 * 
	 * @param id
	 *            The column config object or key, name, or index of a column in
	 *            the host's _displayColumns array.
	 * @param width
	 *            CSS width value. Numbers are treated as pixels
	 * @return
	 */
	public final native DataTable setColumnWidth(int id, int width)/*-{
		return this.setColumnWidth(id, width);
	}-*/;

	/**
	 * Assigns the style width of the <col> representing the column identifed by
	 * id and updates the column configuration.
	 * 
	 * Pass the empty string for width to return a column to auto sizing.
	 * 
	 * This does not trigger a columnsChange event today, but I can be convinced
	 * that it should.
	 * 
	 * @param id
	 *            The column config object or key, name, or index of a column in
	 *            the host's _displayColumns array.
	 * @param width
	 *            CSS width value. Numbers are treated as pixels
	 * @return
	 */
	public final native DataTable setColumnWidth(String id, int width)/*-{
		return this.setColumnWidth(id, width);
	}-*/;

	/**
	 * Assigns the style width of the <col> representing the column identifed by
	 * id and updates the column configuration.
	 * 
	 * Pass the empty string for width to return a column to auto sizing.
	 * 
	 * This does not trigger a columnsChange event today, but I can be convinced
	 * that it should.
	 * 
	 * @param id
	 *            The column config object or key, name, or index of a column in
	 *            the host's _displayColumns array.
	 * @param width
	 *            CSS width value. Numbers are treated as pixels
	 * @return
	 */
	public final native DataTable setColumnWidth(int id, String width)/*-{
		return this.setColumnWidth(id, width);
	}-*/;

	/**
	 * Assigns the style width of the <col> representing the column identifed by
	 * id and updates the column configuration.
	 * 
	 * Pass the empty string for width to return a column to auto sizing.
	 * 
	 * This does not trigger a columnsChange event today, but I can be convinced
	 * that it should.
	 * 
	 * @param id
	 *            The column config object or key, name, or index of a column in
	 *            the host's _displayColumns array.
	 * @param width
	 *            CSS width value. Numbers are treated as pixels
	 * @return
	 */
	public final native DataTable setColumnWidth(String id, String width)/*-{
		return this.setColumnWidth(id, width);
	}-*/;

	/**
	 * Assigns the style width of the <col> representing the column identifed by
	 * id and updates the column configuration.
	 * 
	 * Pass the empty string for width to return a column to auto sizing.
	 * 
	 * This does not trigger a columnsChange event today, but I can be convinced
	 * that it should.
	 * 
	 * @param id
	 *            The column config object or key, name, or index of a column in
	 *            the host's _displayColumns array.
	 * @param width
	 *            CSS width value. Numbers are treated as pixels
	 * @return
	 */
	public final native DataTable setColumnWidth(Column id, int width)/*-{
		return this.setColumnWidth(id, width);
	}-*/;

	/**
	 * Assigns the style width of the <col> representing the column identifed by
	 * id and updates the column configuration.
	 * 
	 * Pass the empty string for width to return a column to auto sizing.
	 * 
	 * This does not trigger a columnsChange event today, but I can be convinced
	 * that it should.
	 * 
	 * @param id
	 *            The column config object or key, name, or index of a column in
	 *            the host's _displayColumns array.
	 * @param width
	 *            CSS width value. Numbers are treated as pixels
	 * @return
	 */
	public final native DataTable setColumnWidth(Column id, String width)/*-{
		return this.setColumnWidth(id, width);
	}-*/;

	/**
	 * Display the message node and set its content to message. If there is a
	 * localized strings entry for the value of message, that string will be
	 * used.
	 * 
	 * @param message
	 *            The message name or message itself to display
	 * @return
	 */
	public final native DataTable showMessage(String message)/*-{
		return this.showMessage(message);
	}-*/;

	/**
	 * <p>
	 * Sort the data in the data ModelList and refresh the table with the new
	 * order.
	 * </p>
	 * 
	 * <p>
	 * Acceptable values for fields are key strings or objects with a single
	 * property, the column key, with a value of 1, -1, "asc", or "desc". E.g. {
	 * username: 'asc' }. String values are assumed to be ascending.
	 * </p>
	 * 
	 * <p>
	 * Example values would be:
	 * </p>
	 * 
	 * <ul>
	 * 
	 * <li>"username" - sort by the data's username field or the key associated
	 * to a column with that name.</li>
	 * 
	 * <li>{ username: "desc" } - sort by username in descending order.
	 * Alternately, use values "asc", 1 (same as "asc"), or -1 (same as "desc").
	 * </li>
	 * 
	 * <li>["lastName", "firstName"] - ascending sort by lastName, but for
	 * records with the same lastName, ascending subsort by firstName. Array can
	 * have as many items as you want.</li>
	 * 
	 * <li>[{ lastName: -1 }, "firstName"] - descending sort by lastName,
	 * ascending subsort by firstName. Mixed types are ok.</li>
	 * 
	 * </ul>
	 * 
	 * @param fields
	 * @return
	 */
	public final native DataTable sort(String fields)/*-{
		return this.sort(fields);
	}-*/;
	
	/**
	 * <p>
	 * Sort the data in the data ModelList and refresh the table with the new
	 * order.
	 * </p>
	 * 
	 * <p>
	 * Acceptable values for fields are key strings or objects with a single
	 * property, the column key, with a value of 1, -1, "asc", or "desc". E.g. {
	 * username: 'asc' }. String values are assumed to be ascending.
	 * </p>
	 * 
	 * <p>
	 * Example values would be:
	 * </p>
	 * 
	 * <ul>
	 * 
	 * <li>"username" - sort by the data's username field or the key associated
	 * to a column with that name.</li>
	 * 
	 * <li>{ username: "desc" } - sort by username in descending order.
	 * Alternately, use values "asc", 1 (same as "asc"), or -1 (same as "desc").
	 * </li>
	 * 
	 * <li>["lastName", "firstName"] - ascending sort by lastName, but for
	 * records with the same lastName, ascending subsort by firstName. Array can
	 * have as many items as you want.</li>
	 * 
	 * <li>[{ lastName: -1 }, "firstName"] - descending sort by lastName,
	 * ascending subsort by firstName. Mixed types are ok.</li>
	 * 
	 * </ul>
	 * 
	 * @param fields
	 * @return
	 */
	public final native DataTable sort(JsArrayString fields)/*-{
		return this.sort(fields);
	}-*/;
	
	/**
	 * <p>
	 * Sort the data in the data ModelList and refresh the table with the new
	 * order.
	 * </p>
	 * 
	 * <p>
	 * Acceptable values for fields are key strings or objects with a single
	 * property, the column key, with a value of 1, -1, "asc", or "desc". E.g. {
	 * username: 'asc' }. String values are assumed to be ascending.
	 * </p>
	 * 
	 * <p>
	 * Example values would be:
	 * </p>
	 * 
	 * <ul>
	 * 
	 * <li>"username" - sort by the data's username field or the key associated
	 * to a column with that name.</li>
	 * 
	 * <li>{ username: "desc" } - sort by username in descending order.
	 * Alternately, use values "asc", 1 (same as "asc"), or -1 (same as "desc").
	 * </li>
	 * 
	 * <li>["lastName", "firstName"] - ascending sort by lastName, but for
	 * records with the same lastName, ascending subsort by firstName. Array can
	 * have as many items as you want.</li>
	 * 
	 * <li>[{ lastName: -1 }, "firstName"] - descending sort by lastName,
	 * ascending subsort by firstName. Mixed types are ok.</li>
	 * 
	 * </ul>
	 * 
	 * @param fields
	 * @return
	 */
	public final native DataTable sort(String[] fields)/*-{
		return this.sort(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(fields));
	}-*/;
	
	/**
	 * <p>
	 * Sort the data in the data ModelList and refresh the table with the new
	 * order.
	 * </p>
	 * 
	 * <p>
	 * Acceptable values for fields are key strings or objects with a single
	 * property, the column key, with a value of 1, -1, "asc", or "desc". E.g. {
	 * username: 'asc' }. String values are assumed to be ascending.
	 * </p>
	 * 
	 * <p>
	 * Example values would be:
	 * </p>
	 * 
	 * <ul>
	 * 
	 * <li>"username" - sort by the data's username field or the key associated
	 * to a column with that name.</li>
	 * 
	 * <li>{ username: "desc" } - sort by username in descending order.
	 * Alternately, use values "asc", 1 (same as "asc"), or -1 (same as "desc").
	 * </li>
	 * 
	 * <li>["lastName", "firstName"] - ascending sort by lastName, but for
	 * records with the same lastName, ascending subsort by firstName. Array can
	 * have as many items as you want.</li>
	 * 
	 * <li>[{ lastName: -1 }, "firstName"] - descending sort by lastName,
	 * ascending subsort by firstName. Mixed types are ok.</li>
	 * 
	 * </ul>
	 * 
	 * @param fields
	 * @return
	 */
	public final native DataTable sort(JavaScriptObject fields)/*-{
		return this.sort(fields);
	}-*/;
	/**
	 * <p>
	 * Sort the data in the data ModelList and refresh the table with the new
	 * order.
	 * </p>
	 * 
	 * <p>
	 * Acceptable values for fields are key strings or objects with a single
	 * property, the column key, with a value of 1, -1, "asc", or "desc". E.g. {
	 * username: 'asc' }. String values are assumed to be ascending.
	 * </p>
	 * 
	 * <p>
	 * Example values would be:
	 * </p>
	 * 
	 * <ul>
	 * 
	 * <li>"username" - sort by the data's username field or the key associated
	 * to a column with that name.</li>
	 * 
	 * <li>{ username: "desc" } - sort by username in descending order.
	 * Alternately, use values "asc", 1 (same as "asc"), or -1 (same as "desc").
	 * </li>
	 * 
	 * <li>["lastName", "firstName"] - ascending sort by lastName, but for
	 * records with the same lastName, ascending subsort by firstName. Array can
	 * have as many items as you want.</li>
	 * 
	 * <li>[{ lastName: -1 }, "firstName"] - descending sort by lastName,
	 * ascending subsort by firstName. Mixed types are ok.</li>
	 * 
	 * </ul>
	 * 
	 * @param fields
	 * @return
	 */
	public final native DataTable sort(JavaScriptObject[] fields)/*-{
		return this.sort(@org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(fields));
	}-*/;
	
	//TODO: sort payload param
	
	/**
	 * <p>Reverse the current sort direction of one or more fields currently being sorted by.</p>
	 * 
	 * <p>Pass the key of the column or columns you want the sort order reversed for.</p>
	 * @param fields The field(s) to reverse sort order for
	 * @return
	 */
	public final native DataTable toggleSort(String fields)/*-{
		return this.toggleSort(fields);
	}-*/;
	/**
	 * <p>Reverse the current sort direction of one or more fields currently being sorted by.</p>
	 * 
	 * <p>Pass the key of the column or columns you want the sort order reversed for.</p>
	 * @param fields The field(s) to reverse sort order for
	 * @return
	 */
	public final native DataTable toggleSort(String[] fields)/*-{
		return this.toggleSort(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(fields));
	}-*/;
	
	//TODO: toggleSort payload param
}
