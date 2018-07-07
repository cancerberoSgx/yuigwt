package org.sgx.yuigwt.yui.collection;

import org.sgx.yuigwt.yui.base.Base;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
/**
 * <p>Generic ArrayList class for managing lists of items and iterating operations 
 * over them. The targeted use for this class is for augmentation onto a class 
 * that is responsible for managing multiple instances of another class (e.g. 
 * NodeList for Nodes). The recommended use is to augment your class with ArrayList, 
 * then use ArrayList.addMethod to mirror the API of the constituent items on the 
 * list's API. The default implementation creates immutable lists, but mutability 
 * can be provided via the arraylist-add submodule or by implementing mutation
 *  methods directly on the augmented class's prototype.</p>
 *  
 *  <p>Extends Base because of java single inheritance and because classes like Recordset extends Base uses arraylist.</p>
 * @author sg
 *
 */
public class ArrayList<T extends JavaScriptObject> extends Base {
protected ArrayList(){}
/**
 * Add a single item to the ArrayList. Does not prevent duplicates.
 * @param item Item presumably of the same type as others in the ArrayList.
 * @return self for method chaining
 * @deprecated
 */
public native final ArrayList<T> add(T item) /*-{
this.add(item); 
return this; 
}-*/;
/**
 * Add a single item to the ArrayList. Does not prevent duplicates.
 * @param index (Optional.) DataTypeNumber representing the position at which the item should be inserted.
 * @return self for method chaining
 * @deprecated
 */
public native final ArrayList<T> add(T item, int index) /*-{
this.add(item, index); 
return this; 
}-*/;

//TODO: methodName - not in java...

/**
 * Execute a function on each item of the list, optionally providing a custom execution context. Default context is the item.The callback signature is callback( item, index ).
 * @param c the callback to execute on each
 * @return
 */
public native final ArrayList<T> each(ArrayListCallback<T> c)/*-{
	var f = $entry(function(item, index){
		return c.@org.sgx.yuigwt.yui.collection.ArrayListCallback::call(Lcom/google/gwt/core/client/JavaScriptObject;I)(item, index); 
	}); 
	return this.each(f); 
}-*/;
/**
 * Execute a function on each item of the list, optionally providing a custom execution context. Default context is the item.The callback signature is callback( item, index ).
 * @param c the callback to execute on each
 * @deprecated
 * @return
 */
public native final ArrayList<T> filter(ArrayListCallback<T> c)/*-{
	var f = $entry(function(item, index){
		return c.@org.sgx.yuigwt.yui.collection.ArrayListCallback::call(Lcom/google/gwt/core/client/JavaScriptObject;I)(item, index); 
	}); 
	return this.filter(f); 
}-*/;

/**
 * Finds the first index of the needle in the managed array of items.
 * @param needle The item to search for
 * @return Array index if found. Otherwise -1 
 */
public native final int indexOf(T needle) /*-{
return this.indexOf(needle);
}-*/;
/**
 * Is this instance managing any items? 
 * @return true if 1 or more items are being managed
 */
public native final boolean isEmpty() /*-{
return this.isEmpty(needle);
}-*/;
/**
 * Get an item by index from the list. Override this method if managing a list of objects that have a different public representation (e.g. Node instances vs DOM nodes). The iteration methods that accept a user function will use this method for access list items for operation.
 * @param index
 * @return the item at the requested index 
 */
public native final T get(int index) /*-{
return this.get(needle);
}-*/;

//TODO: itemsAreEquals - deprecated

//TODO: remove - deprecated
/**
 * How many items are in this list?
 * @return integer: DataTypeNumber of items in the list 
 */
public native final int size() /*-{
return this.size();
}-*/;

/**
 * Execute a function on each item of the list, optionally providing a custom execution context. Default context is the item. The callback signature is callback( item, index ). Unlike each, if the callback returns true, the iteratation will stop. * @param c
 * @return True if the function returned true on an item 
 */
public native final boolean some(ArrayListCallback<T> c)/*-{
var f = $entry(function(item, index){
	return c.@org.sgx.yuigwt.yui.collection.ArrayListCallback::call(Lcom/google/gwt/core/client/JavaScriptObject;I)(item, index);
}); 
return this.some(f); 
}-*/;
/**
 * Provides an array-like representation for JSON.stringify.
 * @param c
 * @return
 */
public native final JsArray<T> toJSON(ArrayListCallback<T> c)/*-{
return this.toJSON(); 
}-*/;

}
