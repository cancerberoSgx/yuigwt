package org.sgx.yuigwt.yui.model;

import org.sgx.yuigwt.yui.collection.ArrayList;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayMixed;


/**
 * 
 <p>
 * Provides an API for managing an ordered list of Model instances.
 * </p>
 * 
 * <p>
 * In addition to providing convenient add, create, reset, and remove methods
 * for managing the models in the list, ModelLists are also bubble targets for
 * events on the model instances they contain. This means, for example, that you
 * can add several models to a list, and then subscribe to the *:change event on
 * the list to be notified whenever any model in the list changes.
 * </p>
 * 
 * <p>
 * ModelLists also maintain sort order efficiently as models are added and
 * removed, based on a custom comparator function you may define (if no
 * comparator is defined, models are sorted in insertion order).
 * </p>
 * 
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/ModelList.html
 * @author sg
 * 
 */
public class ModelList<T extends JavaScriptObject> extends ArrayList<T> {
	protected ModelList() {
	}
	
	//TODO: property model http://yuilibrary.com/yui/docs/api/classes/ModelList.html#property_model
	
	//TODO: comparator, create
	
	/**
	 * Calls the named method on every model in the list. Any arguments provided after name will be passed on to the invoked method.
	 * @param name Name of the method to call on each model.
	 * @param args optional - Zero or more arguments to pass to the invoked method.
	 * @return Array of return values, indexed according to the index of the model on which the method was called. 
	 */
	public final native JsArrayMixed invoke(String name, Object ... args)/*-{
		var arr1 = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayMixed([Ljava/lang/Object;)(args); 
		var fargs = [name].concat(arr1); 
		return this.invoke.apply(this, fargs);
	}-*/;

}
