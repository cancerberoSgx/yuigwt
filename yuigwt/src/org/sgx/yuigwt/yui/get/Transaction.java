package org.sgx.yuigwt.yui.get;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;

/**
 * Represents a Get transaction, which may contain requests for one or more JS or CSS files.
 * This class should not be instantiated manually. Instances will be created and returned as needed by Y.Get's css(), js(), and load() methods.
 * http://yuilibrary.com/yui/docs/api/classes/Get.Transaction.html
 * @author sg
 *
 */
public class Transaction extends JavaScriptObject {
protected Transaction(){}

//methods

/**
 * Aborts this transaction.</br>
 * This will cause the transaction's onFailure callback to be called and will prevent any new script and link nodes from being added to the document, but any resources that have already been requested will continue loading (there's no safe way to prevent this, unfortunately).
 * @return self for method chaining
 */
public native final Transaction abort() /*-{
this.abort(); 
return this; 
}-*/;
/**
 * Aborts this transaction.</br>
 * This will cause the transaction's onFailure callback to be called and will prevent any new script and link nodes from being added to the document, but any resources that have already been requested will continue loading (there's no safe way to prevent this, unfortunately).
 * @param msg Optional message to use in the errors array describing why the transaction was aborted.
 * @return self for method chaining
 */
public native final Transaction abort(String msg) /*-{
this.abort(msg); 
return this; 
}-*/;


/**
 * 
 * @return self for method chaining
 */
public native final Transaction execute(TransactionCallback c) /*-{
var f = $entry(function(){
	$wnd.alert(arguments.length); 
	return c.@org.sgx.yuigwt.yui.get.TransactionCallback::call()(); 
}); 
this.execute(c.@org.sgx.yuigwt.yui.get.TransactionCallback::call()); 
return this; 
}-*/;



//properties
///**
// * Arbitrary data object associated with this transaction. This object comes from the options passed to Get.css(), Get.js(), or Get.load(), and will be undefined if no data object was specified.
// * @return
// */
//public native final JavaScriptObject data() /*-{
//return this.data; 
//}-*/;
//
///**
// * Arbitrary data object associated with this transaction. This object comes from the options passed to Get.css(), Get.js(), or Get.load(), and will be undefined if no data object was specified.
// * @param val
// * @return this - for setter chaining
// */
//public native final Transaction data(JavaScriptObject val) /*-{
//this.data = val; 
//return this; 
//}-*/;

/**
 * Arbitrary data object associated with this transaction. This object comes from the options passed to Get.css(), Get.js(), or Get.load(), and will be undefined if no data object was specified.
 * @return
 */
public native final JavaScriptObject data() /*-{
return this.data; 
}-*/;

///**
// * Arbitrary data object associated with this transaction. This object comes from the options passed to Get.css(), Get.js(), or Get.load(), and will be undefined if no data object was specified.
// * @param val
// * @return this - for setter chaining
// */
//public native final TransactionConfig data(JavaScriptObject val) /*-{
//this.data = val; 
//return this; 
//}-*/;


/**
 * Numeric id for this transaction, unique among all transactions within the same YUI sandbox in the current pageview.
 * @return
 */
public native final int id() /*-{
return this.id; 
}-*/;

///**
// * Numeric id for this transaction, unique among all transactions within the same YUI sandbox in the current pageview.
// * @param val
// * @return this - for setter chaining
// */
//public native final TransactionConfig id(int val) /*-{
//this.id = val; 
//return this; 
//}-*/;

/**
 * HTMLElement nodes (native ones, not YUI Node instances) that have been inserted during the current transaction.
 * @return
 */
public native final JsArray<Element> nodes() /*-{
return this.nodes; 
}-*/;

///**
// * 
// * @param val
// * @return this - for setter chaining
// */
//public native final TransactionConfig nodes(JsArr<Element> val) /*-{
//this.nodes = val; 
//return this; 
//}-*/;

/**
 * Options associated with this transaction.
 * @return
 */
public native final GetConfig options() /*-{
return this.options; 
}-*/;

///**
// * Options associated with this transaction.
// * @param val
// * @return this - for setter chaining
// */
//public native final TransactionConfig options(GetConfig val) /*-{
//this.options = val; 
//return this; 
//}-*/;

/**
 * Request objects contained in this transaction. Each request object represents one CSS or JS URL that will be (or has been) requested and loaded into the page.
 * @return
 */
public native final JsArray<GetRequest> requests() /*-{
return this.requests; 
}-*/;

///**
// * Request objects contained in this transaction. Each request object represents one CSS or 
// * JS URL that will be (or has been) requested and loaded into the page
// * .
// * @param val
// * @return this - for setter chaining
// */
//public native final JavaScriptObject requests(JavaScriptObject val) /*-{
//this.requests = val; 
//return this; 
//}-*/;

/**
 * Request object related to the error. Array of errors that have occurred during this transaction, if any.
 * @return
 */
public native final JsArray<GetError> errors() /*-{
return this.errors; 
}-*/;

///**
// *  Request object related to the error. Array of errors that have occurred during this transaction, if any.
// * @param val
// * @return this - for setter chaining
// */
//public native final TransactionConfig errors(JavaScriptObject val) /*-{
//this.errors = val; 
//return this; 
//}-*/;



}
