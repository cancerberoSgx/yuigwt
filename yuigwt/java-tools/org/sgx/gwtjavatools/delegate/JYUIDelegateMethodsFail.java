//package org.sgx.gwtjavatools.delegate;
//
//import java.lang.reflect.Method;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//import org.sgx.yuigwt.yui.util.JsObject;
//
//import com.google.gwt.core.client.JavaScriptObject;
///**
// * extract delegate methods from existing classes for wrappers at jyui packaage 
// * @author sg
// *
// */
//public class JYUIDelegateMethodsFail {
//	
//	Set<String> imports; 
//	public JYUIDelegateMethodsFail() {
//		imports=new HashSet<String>(); 
//	}
//	public void generateDelegateMethods(StringBuffer sb, StringBuffer importsSb, Class<? extends JavaScriptObject> targetClass, String fieldName) {
//		for (int i = 0; i < targetClass.getMethods().length; i++) {
//			Method method = targetClass.getMethods()[i];
//			if(!classContainsMethodNamed(JavaScriptObject.class, method.getName()) && 
//				!classContainsMethodNamed(JsObject.class, method.getName()) ) {
//				
//				printDelegateMethod(sb, importsSb, method, fieldName); 
//			}
//		}
//	}
//
//	private void printDelegateMethod(StringBuffer sb, StringBuffer importsSb, Method method, String fieldName) {		
//		String returnTypeName = method.getReturnType().getName();
//		if(!imports.contains(returnTypeName)) {
//			imports.add(returnTypeName); 
//			importsSb.append("import "+returnTypeName+";\n"); 
//		}
//		
//		Class<?>[] paramTypes = method.getParameterTypes(); 
//		for (int i = 0; i < paramTypes.length; i++) {
//			String paramType = paramTypes[i].getName();
//			if(!imports.contains(paramType)) {
//				imports.add(paramType); 
//				importsSb.append("import "+paramType+";\n"); 
//			}
//		}
////		method.get
//		sb.append("public "+returnTypeName+" "+method.getName()+"("); 
//		for (int i = 0; i < paramTypes.length; i++) {
//			String paramType = paramTypes[i].getName(), paramName = "param"+i;
//			//TODO
//		}
//	}
//
//	private boolean classContainsMethodNamed(Class<?> c, String name) {
//		for (int i = 0; i < c.getMethods().length; i++) {
//			Method method = c.getMethods()[i];
//			if(method.getName().equals(name)) 
//				return true; 
//		}
//		return false; 
//	}
//
//	// test
//	public static void main(String[] args) {
//
//	}
//}
