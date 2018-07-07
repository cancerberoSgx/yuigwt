package org.sgx.yuigwt.galleryexplorer.client.search;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class SearchUtil {
	
public static <T extends JavaScriptObject> JsArray<T> search(JsArray<T> all, Searcher<T> searcher) {
	JsArray<T> arr = JsArray.createArray().cast(); 
	for (int i = 0; i < all.length(); i++) {
		T m = all.get(i); 
		if(searcher.contains(m))
			arr.push(m); 
	}
	return arr; 
}

}
