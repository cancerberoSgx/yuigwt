package org.sgx.yuigwt.galleryexplorer.client.util;

import java.util.Collection;
import java.util.Iterator;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

public class JsUtil {
public static JsArrayString toJsArrayString(Collection<String> col) {
	JsArrayString arr = JsArrayString.createArray().cast(); 
	for (Iterator<String> iterator = col.iterator(); iterator.hasNext();) {
		String string = iterator.next();
		arr.push(string); 		
	}
	return arr; 
}
public static <T extends JavaScriptObject> JsArray<T> toJsArrayString(Collection<T> col) {
	JsArray<T> arr = JsArray.createArray().cast(); 
	for (Iterator<T> iterator = col.iterator(); iterator.hasNext();) {
		T t = iterator.next();
		arr.push(t); 		
	}
	return arr; 
}
}
