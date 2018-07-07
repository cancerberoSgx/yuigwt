package org.sgx.gwtjavatools.overlay.json;

import java.io.File;
import java.io.StringWriter;
import java.util.Iterator;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * main pblic entry point for using this tool
 * @author sg
 *
 */
public class JsonToJava {
private File outputFolder;

public JsonToJava(File outputFolder) {
	this.outputFolder=outputFolder; 
}
public void jsonObjectToJava(String json) throws JSONException {
	JSONObject jo = new JSONObject(json); 
	Iterator it = jo.keys();
	while (it.hasNext()) {
		String key = (String) it.next();
		Object val = jo.get(key);
		if(val==null)
			val="null"; 
		System.out.println(val.getClass().getName()+" : "+val); 
	}
}

//private void doJsonType

private void stringfyJavaClass(String className, String packageName, 
	Object val, StringBuffer sb) {
	
}
/**
 * <p>return the type name for an json value returned by JSONObject.get, like in</p> 
 * <pre>using JSONObject jo = new JSONObject(json); jo.get()</pre>
 * @param o
 * @return
 */
public String typeOf(Object o) {
	if(o==null)
		return "null";
	else if(o instanceof String) 
		return "string"; 
	else if(o instanceof Number)
		return "number"; 
	else if(o instanceof Boolean)
		return "boolean"; 
	else if(o instanceof org.json.JSONArray)
		return "array"; 	
	else if(o instanceof org.json.JSONObject)
		return "object";	
	else
		return "undefined"; 
}
//test
public static void main(String[] args) {
	String json1 = "{as: 'asd', num: 123, arr1: [1,2,3], obj1: {}}"; 
	try {
		new JsonToJava(null).jsonObjectToJava(json1);
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
//velocitytest1
//private static void test1() throws Exception {
//	  /* first, we init the runtime engine.  Defaults are fine. */
//
//  Velocity.init();
//
//  /* lets make a Context and put data into it */
//
//  VelocityContext context = new VelocityContext();
//
//  context.put("name", "Velocity");
//  context.put("project", "Jakarta");
//
//  /* lets render a template */
//
//  StringWriter w = new StringWriter();
//
////  Velocity.mergeTemplate("testtemplate.vm", context, w );
////  System.out.println(" template : " + w );
//
//  /* lets make our own string to render */
//
//  String s = "We are using $project $name to render this.";
//  w = new StringWriter();
//  Velocity.evaluate( context, w, "mystring", s );
//  System.out.println(" string : " + w );
//}
}

