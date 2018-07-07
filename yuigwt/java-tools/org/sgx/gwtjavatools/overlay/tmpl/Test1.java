package org.sgx.gwtjavatools.overlay.tmpl;

import java.io.StringWriter;

import org.json.JSONObject;
import org.sgx.gwtjavatools.overlay.json.JsValueBuilder;
import org.sgx.gwtjavatools.overlay.model.JsTypes;
import org.sgx.gwtjavatools.overlay.model.JsValue;


public class Test1 {

	public static void main(String[] args) {
		try {
			test1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	private static void test1() throws Exception {

		OverlayRenderer renderer = new OverlayRenderer();
		
		String json1 = "{obj1: {name: 'foo'}, arr1: [1,2,3], str1: 'hello', int1: 1234}";
		JsValueBuilder jsValueBuilder = new JsValueBuilder(); 
		JsValue jsval = jsValueBuilder.build(new JSONObject(json1)); // new JsValue(JsTypes.TYPE_OBJECT); 
		
		
		JavaClassInfo ci = new JavaClassInfo("MyFirstClass1", "org.sgx.ppp"); 
		
		
		StringWriter out = new StringWriter(); 
		renderer.renderClass(jsval, ci, out); 
	}

}
