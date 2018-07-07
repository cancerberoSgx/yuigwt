package org.sgx.gwtjavatools.overlay.json;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sgx.gwtjavatools.overlay.model.JsTypes;
import org.sgx.gwtjavatools.overlay.model.JsValue;

/**
 * responsible of bulding overlaytemplates.model.JsValue from org.json.JSONObject values. 
 * @author sg
 *
 */
public class JsValueBuilder {
//private JsTypes typesUtil;
//
//public JsValueBuilder(){
//	typesUtil = new JsTypes(); 
//}
	
public JsValue build(Object o) throws JSONException {
	String type = JsTypes.getInstance().typeOf(o); 
	JsValue t = new JsValue(type);
	
	//primitives
	if(type.equals(JsTypes.TYPE_BOOLEAN) ||
			type.equals(JsTypes.TYPE_STRING) ||
			type.equals(JsTypes.TYPE_NUMBER)) {
		
		t.setValue(o); 
	}
	
	else if(type.equals(JsTypes.TYPE_ARRAY)) {
		List<JsValue> values = new LinkedList<JsValue>(); 
		JSONArray arr = (org.json.JSONArray)o;
		for (int i = 0; i < arr.length(); i++) {
			Object itemJsonVal = arr.get(i);
			JsValue itemJsValue = build(itemJsonVal); 
			values.add(itemJsValue); 
		}
		t.setValues(values); 
	}
	
	else if(type.equals(JsTypes.TYPE_OBJECT)) {
		Map<String, JsValue> properties = new HashMap<String, JsValue>(); 
		t.setProperties(properties); 
		JSONObject propJsObj = (JSONObject)o; 
		Iterator it = propJsObj.keys();
		while (it.hasNext()) {
			String propName = (String) it.next();
			Object propVal = propJsObj.get(propName); 
			JsValue propJsValue = build(propVal); 
			properties.put(propName, propJsValue); 
		}
	}
	
	
	return t; 
}
}
