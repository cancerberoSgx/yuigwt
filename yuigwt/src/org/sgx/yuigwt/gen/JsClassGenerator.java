//package org.sgx.yuigwt.gen;
//
//import java.io.PrintWriter;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Set;
//
//import org.sgx.yuigwt.yui.util.jsclass.JsClass;
//
//import com.google.gwt.core.client.JavaScriptObject;
//import com.google.gwt.core.ext.Generator;
//import com.google.gwt.core.ext.GeneratorContext;
//import com.google.gwt.core.ext.TreeLogger;
//import com.google.gwt.core.ext.UnableToCompleteException;
//import com.google.gwt.core.ext.typeinfo.JClassType;
//import com.google.gwt.core.ext.typeinfo.JMethod;
//import com.google.gwt.core.ext.typeinfo.JParameter;
//import com.google.gwt.core.ext.typeinfo.JType;
//import com.google.gwt.core.ext.typeinfo.TypeOracle;
//import com.google.gwt.user.rebind.ClassSourceFileComposerFactory;
//import com.google.gwt.user.rebind.SourceWriter;
///**
// * @see JsClass comment. This generator will build the method implementation toJSO() 
// * that will return a JSO object
// * @author sg
// *
// */
//public class JsClassGenerator extends Generator {
//	private HashMap<String, JType> propJavaTypes;
//	private HashMap<String, String> setterMethodNames;
//	private HashMap<String, String> getterMethodNames;
//	private HashMap<String, JMethod> methods;
//
//	private LinkedList<String> propNames;
//	private JClassType jClassType;
//	private GeneratorContext context;
//	private TreeLogger logger;
//
//	public String generate(TreeLogger logger, GeneratorContext context,
//			String typeName) throws UnableToCompleteException {
//		this.context=context;
//		this.logger = logger; 
//		
//		TypeOracle typeOracle = context.getTypeOracle();			
//		JClassType objectType = typeOracle.findType(typeName);			
//		String implTypeName = objectType.getSimpleSourceName() + "Impl";			 
//        String implPackageName = objectType.getPackage().getName();
//        			
//		ClassSourceFileComposerFactory composerFactory = new ClassSourceFileComposerFactory(
//                implPackageName, implTypeName);
// 
//        composerFactory.setSuperclass(objectType
//                .getQualifiedSourceName());
//        
//        composerFactory.addImport("com.google.gwt.core.client.JavaScriptObject");        
//        
//        PrintWriter printWriter = context.tryCreate(logger, implPackageName,
//                implTypeName);
//        if (printWriter != null) {
// 
//            SourceWriter sourceWriter = composerFactory.createSourceWriter(
//                    context, printWriter);
// 
//            writeMethods(logger, sourceWriter, objectType);
//            sourceWriter.commit(logger);
// 
//        }
//        return implPackageName + "." + implTypeName;	        
//	}
//
//public void writeMethods(TreeLogger logger, 
//		SourceWriter writer, JClassType objectType) {
//		
//	buildFieldInfo(objectType, logger);
//	buildMethodInfo(objectType, logger);
//	
//	StringBuffer sb = new StringBuffer(); 
//	sb.append("@Override \n"); 
//	sb.append("public native final JavaScriptObject toJSO() /*-{ \n");
////	sb.append("var ret = {}; \n");
//	sb.append("var ret = function(){arguments.callee.superclass.constructor.apply(this, arguments);}; \n");
//	
//	//first, fields - for each field with a setter and a getter: 
//	
//	for(String pname : propNames) {
//		JType ptype = propJavaTypes.get(pname);
//		fieldToValue(sb, pname, ptype); 
//	}
//
//	//now methods - for each public method not converging with setProp/getProp
//	sb.append("var that = this; ");	
//	for(String methodName : methods.keySet()) {
////		JMethod m = methods.get(methodName); 
//		String fnExpr = "that.@"+jClassType.getQualifiedSourceName()+"::"+methodName+"(*)";
//		
//		//with $entry()
////		sb.append("ret['"+methodName+"'] = $entry(function(){" +
////			"return "+fnExpr+".apply(that, arguments); "+
////		"}); ");
//		
//		//without $entry()
//		sb.append("ret['"+methodName+"'] = function(){" +
//			"return "+fnExpr+".apply(that, arguments); "+
//		"}; "); 
//	}
//	
//	sb.append("return ret; \n"); 
//	sb.append("}-*/; \n"); 
//	
//	writer.println(sb.toString());
//}
//
//private void fieldToValue(StringBuffer sb, String pname, JType ptype) {
//	
//	if(ptype.getQualifiedSourceName().equals("java.lang.String") || 
//			ptype.toString().equals("int") || 
//			ptype.toString().equals("double") || 
//			ptype.toString().equals("float")|| 
//			ptype.toString().equals("long")) {
//		String getterName = "get"+pname.substring(0,1).toUpperCase()+pname.substring(1,pname.length()); 
//		String getterCallExpr = "this.@"+jClassType.getQualifiedSourceName()+"::"+getterName+"(*)()";
//		String fieldExpr = "ret[\""+pname+"\"] = "+getterCallExpr+"; \n"; 
//		sb.append(fieldExpr);
//	}
//	else if(ptype.isClass()!=null){
//		JClassType cl = ptype.isClass();
//		
//		JClassType jt = context.getTypeOracle().findType(JavaScriptObject.class.getName());
////		logger.log(Type.ERROR, "ptype.isClass(): "+JavaScriptObject.class.getName()+" - "+jt);  
//		
//		if(cl.isAssignableTo(context.getTypeOracle().findType(JavaScriptObject.class.getName()))) {
//			
//			String getterName = "get"+pname.substring(0,1).toUpperCase()+pname.substring(1,pname.length()); 
//			String getterCallExpr = "this.@"+jClassType.getQualifiedSourceName()+"::"+getterName+"(*)()";
//			String fieldExpr = "ret[\""+pname+"\"] = "+getterCallExpr+"; \n"; 
//			sb.append(fieldExpr);			
//		}
//		if(cl.isAssignableTo(context.getTypeOracle().findType(JsClass.class.getName()))) {
//			
//			String getterName = "get"+pname.substring(0,1).toUpperCase()+pname.substring(1,pname.length()); 
//			String getterCallExpr = "this.@"+jClassType.getQualifiedSourceName()+"::"+getterName+"(*)()";
//			String jsClassGetExpr = "("+getterCallExpr+").@"+JsClass.class.getName()+"::toJSO(*)()"; 
//			String fieldExpr = "ret[\""+pname+"\"] = "+jsClassGetExpr+"; \n"; 
//			sb.append(fieldExpr);
//		}
//	}
//}
//
//private void buildMethodInfo(JClassType jt, TreeLogger logger2) {
//	methods = new HashMap<String, JMethod>(); 
//	JMethod[] methods_ = jt.getMethods();
//	for (int i = 0; i < methods_.length; i++) {
//		String name = methods_[i].getName();
//		if(!setterMethodNames.containsKey(name) && ! getterMethodNames.containsKey(name))
//			methods.put(name, methods_[i]);
//	}
//}
//
//void buildFieldInfo(JClassType jt, TreeLogger logger) {
//	
//	this.jClassType = jt; 
//	JMethod[] methods_ = jt.getMethods();
//	
//	Set<String> attrsWithSetters  = new HashSet<String>(), 
//			attrsWithGetters = new HashSet<String>();
//	
//	setterMethodNames = new HashMap<String, String>(); 
//	getterMethodNames= new HashMap<String, String>();
//	HashMap<String, JMethod> setters = new HashMap<String, JMethod>();
//	HashMap<String, JMethod> getters = new HashMap<String, JMethod>();
//	
//	propJavaTypes = new HashMap<String, JType>();
//	
//	for (int i = 0; i < methods_.length; i++) {
//		String name = methods_[i].getName();
//		
//		if(name.startsWith("get")) {
//			String pname = getPropertyName("get", name);
//			attrsWithGetters.add(pname);
//			getterMethodNames.put(pname, name);
//			getters.put(pname, methods_[i]);
//		}
//		else if(name.startsWith("is")){
//			String pname = getPropertyName("is", name);
//			attrsWithGetters.add(pname);
//			getterMethodNames.put(pname, name);
//			getters.put(pname, methods_[i]);
//		}
//		if(name.startsWith("set")) {
//			String pname = getPropertyName("set", name);
//			attrsWithSetters.add(pname);
//			setterMethodNames.put(pname, name);
//			
//			JParameter param = methods_[i].getParameters()[0]; 
//			
//			propJavaTypes.put(pname, param.getType()); 			
//			setters.put(pname, methods_[i]);
//		}
//	}
//	
//	propNames = new LinkedList<String>();
//	for(String attr : attrsWithSetters) {
//		if(attrsWithGetters.contains(attr)) {
//			propNames.add(attr);
//		} 
//	}
//	
//}
//
//private static String getPropertyName(String prefix, String methodName) {
//	String pName = methodName.substring(prefix.length(), methodName.length());
//	return pName.substring(0,1).toLowerCase()+pName.substring(1, pName.length());
//}
//}