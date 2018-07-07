package org.sgx.yuigwt.yuitest1.gallery.test.json2java;

import org.sgx.yuigwt.yui.YuiContext;

import com.google.gwt.core.client.JsArrayMixed;

/**
 * class for manage js types, 
 * @author sg
 *
 */
public class JsTypes {

	public static final String TYPE_NULL = "null",
			TYPE_UNDEFINED = "undefined", TYPE_STRING = "string",
			TYPE_NUMBER = "number", TYPE_BOOLEAN = "boolean",
			TYPE_ARRAY = "array", TYPE_OBJECT = "object";

//	YuiContext Y; 
//	public JsTypes(YuiContext Y){
//		this.Y=Y; 
//	}
	public static String getJavaType(String type) {
		if(type==null)
			return TYPE_NULL; 
		else if (type.equals("string"))
			return TYPE_STRING; 
		else if (type.equals("number"))
			return TYPE_NUMBER;
		else return null; 
	}
//	/**
//	 * <p>return the type name for an json value returned by JSONObject.get, like in</p> 
//	 * <pre>using JSONObject jo = new JSONObject(json); jo.get()</pre>
//	 * @param o
//	 * @return
//	 */
//	public String typeOf(Object o) {
//		if(o==null)
//			return "null";
//		else if(o instanceof String) 
//			return "string"; 
//		else if(o instanceof Number)
//			return "number"; 
//		else if(o instanceof Boolean)
//			return "boolean"; 
//		else if(o instanceof org.json.JSONArray)
//			return "array"; 	
//		else if(o instanceof org.json.JSONObject)
//			return "object";	
//		else
//			return "undefined"; 
//	}
//	public String toJavaType(String type) {
//		if(type==null)
//			return null; 
//		if(type.equals(TYPE_STRING))
//			return "String"; 
//		else if(type.equals(TYPE_NUMBER))
//			return "double";
//		else if(type.equals(TYPE_BOOLEAN))
//			return "boolean";
//		else if(type.equals(TYPE_ARRAY))
//			return "JsArrayMixed"; //"com.google.gwt.core.client.JsArrayMixed";
//		else if(type.equals(TYPE_OBJECT))
//			return "JavaScriptObject";//"com.google.gwt.core.client.JavaScriptObject";
//		else 
//			return null; 
//	}
}
