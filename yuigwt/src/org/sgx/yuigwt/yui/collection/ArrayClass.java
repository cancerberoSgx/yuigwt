package org.sgx.yuigwt.yui.collection;

import org.sgx.yuigwt.yui.YUI;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * @see http://yuilibrary.com/yui/docs/api/classes/Array.html
 * @author sg
 * 
 */
public class ArrayClass extends JavaScriptObject {
	protected ArrayClass() {
	}

	/**
	 * Dedupes an array of strings, returning an array that's guaranteed to
	 * contain only one copy of a given string. This method differs from
	 * Array.unique() in that it's optimized for use only with strings, whereas
	 * unique may be used with other types (but is slower). Using dedupe() with
	 * non-string values may result in unexpected behavior.
	 * 
	 * @param array
	 * @return
	 */
	public native final JavaScriptObject dedupe(JavaScriptObject array)/*-{
		return this.dedupe(array);
	}-*/;

	/**
	 * Dedupes an array of strings, returning an array that's guaranteed to
	 * contain only one copy of a given string. This method differs from
	 * Array.unique() in that it's optimized for use only with strings, whereas
	 * unique may be used with other types (but is slower). Using dedupe() with
	 * non-string values may result in unexpected behavior.
	 * 
	 * @param array
	 * @return
	 */
	public native final JsArrayString dedupe(JsArrayString array)/*-{
		return this.dedupe(array);
	}-*/;

	/**
	 * Executes the supplied function on each item in the array. This method
	 * wraps the native ES5 Array.forEach() method if available.
	 * 
	 * @param array
	 *            Array to iterate.
	 * @param fn
	 *            Function to execute on each item in the array.
	 * @return The YUI instance.
	 */
	public native final YUI each(JavaScriptObject array, ArrayEachCallback fn)/*-{
		var f = $entry(function(item, index, array) {
			fn.@org.sgx.yuigwt.yui.collection.ArrayEachCallback::call(*)(item, index, array);
			return true;
		});
		return this.each(array, f);
	}-*/;

	/**
	 * Executes the supplied function on each item in the array. Iteration stops
	 * if the supplied function does not return a truthy value.
	 * 
	 * @param array
	 *            the array to iterate.
	 * @param fn
	 *            the function to execute on each item.
	 * @return true if every item in the array returns true from the supplied
	 *         function, false otherwise.
	 */
	public native final boolean every(JavaScriptObject array, ArrayEveryCallback fn)/*-{
		var f = $entry(function(item, index) {
			fn.@org.sgx.yuigwt.yui.collection.ArrayEveryCallback::call(*)(item, index);
			return true;
		});
		return this.every(array, f);
	}-*/;

	/**
	 * Executes the supplied function on each item in the array. Returns a new
	 * array containing the items for which the supplied function returned a
	 * truthy value.
	 * 
	 * @param array
	 *            Array to filter.
	 * @param fn
	 *            Function to execute on each item.
	 * @return
	 */
	public native final JavaScriptObject filter(JavaScriptObject array, ArrayEveryCallback fn)/*-{
		var f = $entry(function(item, index) {
			fn.@org.sgx.yuigwt.yui.collection.ArrayEveryCallback::call(*)(item, index);
			return true;
		});
		return this.filter(array, f);
	}-*/;

}
