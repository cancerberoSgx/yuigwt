package org.sgx.yuigwt.galleryexplorer.client.search;

import com.google.gwt.core.client.JsArrayString;


public interface Searcher<T> {
	JsArrayString autocompleteData(); 
	/**
	 * return true if obj should be included on this search results. 
	 * @param util
	 * @param obj
	 * @return
	 */
	boolean contains(T obj); 
}
