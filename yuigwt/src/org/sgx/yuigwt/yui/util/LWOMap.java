package org.sgx.yuigwt.yui.util;

import java.util.LinkedList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * lightweight ordered map. Needs more mem, but keys() is faster than lwmap.
 * @author sg
 *
 */
public class LWOMap<K,V>{
	LWMap <K,V> _map;
	List<K> _keys;
	public LWOMap() {
		_map = LWMap.create();
		_keys = new LinkedList<K>();
	}
	public LWOMap(Object []a) {
		_map = LWMap.create();
		_keys = new LinkedList<K>();
		for (int i = 0; i < a.length; i+=2) {
			_map.put((K)a[i], (V)a[i+1]);
			_keys.add((K)a[i]);
		}
	}
	public List<K> keys() {
		return _keys;
	}
	public void put(K k, V v) {
		_map.put(k, v);
		_keys.remove(k);
		_keys.add(k);
	}
	public V get(K k) {
		return _map.get(k);
	}
	public String print() {
		String s = "LWOMap(";
		for(K k : keys()) {
			s+=k+", ";
		}
		return s+")";
	}
}
