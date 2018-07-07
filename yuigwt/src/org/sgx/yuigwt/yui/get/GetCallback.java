package org.sgx.yuigwt.yui.get;

import com.google.gwt.core.client.JsArray;
/**
 * SimpleCallback function to be called on completion. This is a general callback and will be called before any more granular callbacks (onSuccess, onFailure, etc.) specified in the options object.
 * @author sg
 *
 */
public interface GetCallback {
/**
 * SimpleCallback function to be called on completion. This is a general callback and will be called before any more granular callbacks (onSuccess, onFailure, etc.) specified in the options object.
 * @param err Array  of errors (JsArray<GetError>) that occurred during the transaction, or null on success. the type should be JsArray<GetError>, but it is not allowed in overlays. 
 * @param tx Transaction object.
 */
void call(JsArray<?> err, Transaction tx); 


}
