package org.sgx.gwtjavatools;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.sgx.yuigwt.yui.util.Util;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayBoolean;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

/**
 * overlay types from java POJOs generation. overlay types have the format described on http://cancerberonia.blogspot.com/2012/07/eclipse-template-for-gwt-overlay-types.html
 * Mainly auto creation of gwt overlay types from pojos.  
 * 
 * A common scenario, you want to create a java overlay type for html attributes - http://www.w3.org/TR/html4/index/attributes.html
 * the easy way, you create a java class with those attributes and generate the overlay type using this ustil class.
 * 
 * The input class should only define the attributes, not getters/setters - that it wish to publish in the generated gwt overlay. This utility uses simple java reflection for knowing the input class attributes.
 * 
 * Non primitive fields that are not subclasses of JavaScriptObject or of JsArr will be ignored. (only fields GWT overlay types support)   
 * @author sg
 *
 */
public class Overlay1Generator {
public static final String BASE_OVERLAY_TYPE="com.google.gwt.core.client.JavaScriptObject", 
	OPT_GETTER="getter", OPT_SETTER="setter";

Set<Class<?>> imports; 
Set<Field> fields; 

public Overlay1Generator(){
	imports=new HashSet<Class<?>>(); 
	fields=new HashSet<Field>(); 
}

public void generateOverlayFrom(StringBuffer sb, Class<?> c, String outputClassName, 
		String outputPackageName, String []options) {
	
	options = (options==null||options.length==0) ? new String[]{OPT_GETTER, OPT_SETTER} : options; 
	
	boolean doSetter = Util.indexOf(options, OPT_SETTER)!=-1;
	boolean doGetter = Util.indexOf(options, OPT_GETTER)!=-1; 
	
	Field[] allFields = c.getFields();
	for (int i = 0; i < allFields.length; i++) {
//		String fieldName = fields[i].getName();
		Class<?> fieldClass = allFields[i].getType();
		if(supportedFieldClass(fieldClass)) {
			fields.add(allFields[i]); 
			if(!imports.contains(fieldClass) && !fieldClass.isPrimitive() && !fieldClass.getName().startsWith("java.lang"))	
				imports.add(fieldClass);
		}
		 
	}
	
	sb.append("package "+outputPackageName+";\n"); 
	for(Class<?> ic : imports) {
		sb.append("import "+ic.getName()+";\n");		
	}
	sb.append("public class "+outputClassName+" extends "+BASE_OVERLAY_TYPE+" {\n");
	sb.append("\tprotected "+outputClassName+"(){}\n");
	sb.append("\tpublic static final native  "+outputClassName+" create()/*-{\n\t\treturn {}; \n\t}-*/;\n");
	for(Field field : fields) {
		String fieldName = field.getName(), fieldTypeName = field.getType().getSimpleName();
		
		if(doGetter)
			sb.append("\tpublic final native "+fieldTypeName+" "+fieldName+"()/*-{\n\t\treturn this."+fieldName+";\n\t}-*/;\n");
		
		if(doSetter)
			sb.append("\tpublic final native "+outputClassName+" "+fieldName+"("+fieldTypeName+" val)/*-{\n\t\tthis."+fieldName+" = val; return this; \n\t}-*/;\n");
	}
	sb.append("}\n"); 
}
public static boolean supportedFieldClass(Class<?> fieldClass) {
//	System.out.println(fieldClass+" "+fieldClass.isPrimitive());
	
	return true; 
	
//	if(fieldClass.isPrimitive() || fieldClass.equals(String.class) || fieldClass.isAssignableFrom(JavaScriptObject.class) || 
//		fieldClass.isAssignableFrom(JsArray.class) || fieldClass.isAssignableFrom(JsArrayString.class)
//		|| fieldClass.isAssignableFrom(JsArrayBoolean.class) || fieldClass.isAssignableFrom(JsArrayNumber.class)) {
//		
//		return true; 
//	}
//	else
//		return false; 
}
}
