package org.sgx.yuigwt.yui.util;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
/**
 * lightweight mapJavaToJs using native js objects
 * @author sg
 *
 * @param <K>
 * @param <V>
 */
public class LWMap<K,V> extends JavaScriptObject {
protected LWMap(){}
public static <K,V> LWMap<K,V> create() {
	return (LWMap<K, V>) createObject();
}
final public native void put(K k, V v)/*-{
	this[k]=v;
}-*/;
final public native V get(K k)/*-{
	return this[k];
}-*/;
final public native JsArray keys()/*-{
	var a = [];
	for(var i in this) {
		a.push(i);
	}
	return a;
}-*/;
final public native JsArray values()/*-{
	var a = [];
	for(var i in this) {
		a.push(this[i]);
	}
	return a;
}-*/;
final public native String print()/*-{
var a = "LWMap(";
for(var i in this) {
	a+=i+", ";
}
return a+")";
}-*/;
final public static LWMap fromArray(Object []a) {
	LWMap m =LWMap.create();
	for (int i = 0; i < a.length; i+=2) {
		m.put(a[i], a[i+1]);
	}
	return m;
}
public native final boolean containsKey(K k)/*-{
	return this[k] || false; 
}-*/;
public native final V remove(K k)/*-{
	var val = this[k]; 
	delete this[k]; 
	this[k] = null; 
	return val; 
}-*/;


}
