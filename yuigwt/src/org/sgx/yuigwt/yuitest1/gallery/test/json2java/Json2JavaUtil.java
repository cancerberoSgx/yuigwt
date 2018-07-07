//package org.sgx.yuigwt.yuitest1.gallery.test.json2java;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.sgx.yuigwt.yui.util.JsObject;
//
//import com.google.gwt.core.client.JsArrayString;
//
//public class Json2JavaUtil {
////public void render(StringBuffer sb, JsObject in, JavaClassInfo classInfo) {
////	JsArrayString props = in.objProps();
////	for (int i = 0; i < props.length(); i++) {
////		String jspropName = props.get(i); 
////		String jpropName = toJavaName(jspropName); 
////	}
////}
//	
//public JsValue render(JsObject in, JavaClassInfo classInfo) {
//	JsValue jsv = new JsValue(JsTypes.TYPE_OBJECT);
//	Map<String,JsValue> properties = new HashMap<String, JsValue>(); 
//	jsv.setProperties(properties); 
//	JsArrayString props = in.objProps();
//	for (int i = 0; i < props.length(); i++) {
//		JsValue propJsv = new JsValue();
//		String jspropName = props.get(i); 
//		String jpropName = toJavaName(jspropName); 
//		propJsv.setJavaName(jpropName); 
//		propJsv.setJsName(jspropName); 
//		
//		String jstype = in.objTypeof(jspropName);
//		String javaType = JsTypes.getJavaType(jstype); 
//		
//	}
//	return jsv; 
//}
//
//private String toJavaName(String jspropName) {
//	return jspropName; 
//}
//}
