//package org.sgx.yuigwt.gen;
//
//import java.io.PrintWriter;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Set;
//import java.util.logging.Logger;
//
//import org.sgx.yuigwt.yui.util.Util;
//
//import com.google.gwt.core.ext.Generator;
//import com.google.gwt.core.ext.GeneratorContext;
//import com.google.gwt.core.ext.TreeLogger;
//import com.google.gwt.core.ext.UnableToCompleteException;
//import com.google.gwt.core.ext.typeinfo.JClassType;
//import com.google.gwt.core.ext.typeinfo.JMethod;
//import com.google.gwt.core.ext.typeinfo.TypeOracle;
//import com.google.gwt.user.rebind.ClassSourceFileComposerFactory;
//import com.google.gwt.user.rebind.SourceWriter;
///**
// * generates a BeanToJSO - a java bean object that implements methods toJSO() and fromJSO() - 
// * a java bean capable of serializing to an  "equivalent"  javascript object.  
// * @author sg
// *
// */
//public class BeanToJSOGenerator extends Generator {
//	static Logger logger = Logger.getLogger("PHGenerator");
//	
//	private HashMap<String, String> props;
//
//	private HashMap<String, String> propTypes;
//	
////	private HashMap<String, String> propTypes;
////	private HashMap<String, String> setterMethodNames;
////	private HashMap<String, String> getterMethodNames;
////
////	private HashMap<String, String> propJavaTypes;
////	private HashMap<String, JClassType> propJJTypes;
////	private HashMap<String, String> propUseLabels;
////	private HashMap<String, String> propUseDescriptions;
////	private HashMap<String, String> propUseEditorIds;
////	private HashMap<String, String> propUseEditorParams;
////	private HashMap<String, String> propUseEditorTypes;
//
//	public String generate(TreeLogger logger, GeneratorContext context,
//			String typeName) throws UnableToCompleteException {
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
////        JavaScriptObject
//        composerFactory.addImport("com.google.gwt.core.client.JavaScriptObject");
////        composerFactory.addImport("org.sgx.yuigwt.editors.props.PropertyInfo");
//        
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
//	
////	writer.println("public JavaScriptObject toJSO() {");
//	writer.println("public native final JavaScriptObject toJSO() /*-{ \n");
//	writer.println("	var ret = {}; \n");
//	
//	for(String name : propTypes.keySet()) {
////		writer.println("name: "+name+" - type: "+propTypes.get(name));
//		
//
//		String getterName = "get"+name.substring(0,1).toUpperCase()+name.substring(1,name.length()); 
//		String getterCallExpr = "this.@"+objectType.getQualifiedSourceName()+"::"+getterName+"(*)()";
//		
//		writer.println("	ret[\""+name+"\"] = "+getterCallExpr+";\n");
//
//	}
//	
//	writer.println("	return ret; \n"); 
//	writer.println("}-*/; \n"); 
//	
//	writer.println("public void fromJSO(JavaScriptObject jso) {");
////	writer.println("	for()");
//	writer.println("}");
////	writer.println("static LWOMap<String, PropertyInfo> _props = null;");
////	
////	writer.println("public LWOMap<String, PropertyInfo> getProperties() {");
////	writer.indent();
////	
////		writer.println("if(_props==null) {");
////		writer.indent();
////			writer.println("_props=new LWOMap<String, PropertyInfo>();");
////			
////			for(String name : propTypes.keySet()) {
////				//constr params : String name, String type, String description, String label, String editorId
////				String s = "_props.put(\""+name+"\", new PropertyInfo(\""+name+"\", \""+propTypes.get(name)+"\", \""+
////						propUseDescriptions.get(name)+"\", \""+propUseLabels.get(name)+"\", \""+propUseEditorIds.get(name)+"\", \""+propUseEditorParams.get(name)+"\" ));";
//////				System.out.println(s);
////				writer.println(s);
////			}			
////			
////		writer.outdent();
////		writer.println("}");
////		writer.println("return _props;");
//	
////	writer.outdent();
////	writer.println("}");
////	
////	
////	writer.println("public Object getProperty(String propertyName) {");
////	for(String name : propTypes.keySet()) {
////		writer.println("if(propertyName.equals(\""+name+"\")) return this."+getterMethodNames.get(name)+"();");		
////	}
////	writer.println("return null;");
////	writer.println("}");
////	
////	writer.println("public void setProperty(String propertyName, Object val) {");
////	for(String name : propTypes.keySet()) {
////		writer.println("if(propertyName.equals(\""+name+"\")) this."+setterMethodNames.get(name)+"(("+propJavaTypes.get(name)+")val);");
////	}	
////	writer.println("}");
//	
//}
//
//private static String getPropertyName(String prefix, String methodName) {
//	String pName = methodName.substring(prefix.length(), methodName.length());
//	return pName.substring(0,1).toLowerCase()+pName.substring(1, pName.length());
//}
//
//void buildFieldInfo(JClassType jt, TreeLogger logger) {
//	
//	props = new HashMap<String, String>(); 
//	
//	
//	JMethod[] methods_ = jt.getMethods();
////	
//	Set<String> attrsWithSetters  = new HashSet<String>(), 
//			attrsWithGetters = new HashSet<String>();
////	
//	propTypes = new HashMap<String, String>();
//	HashMap<String, JClassType> propJJTypes = new HashMap<String, JClassType>();
////	propJavaTypes = new HashMap<String, String>(); 
//	HashMap<String, String> setterMethodNames = new HashMap<String, String>(); 
//	HashMap<String, String> getterMethodNames = new HashMap<String, String>();
//	HashMap<String, JMethod> setters = new HashMap<String, JMethod>();
//	HashMap<String, JMethod> getters = new HashMap<String, JMethod>();
////	propUseDescriptions = new HashMap<String, String>();
////	propUseEditorIds = new HashMap<String, String>(); 
////	propUseEditorParams = new HashMap<String, String>();
////	
////	propUseLabels = new HashMap<String, String>();
////	
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
//			propTypes.put(pname, methods_[i].getParameters()[0].getType().getQualifiedSourceName());
//			JClassType jt2 = jt.getOracle().findType(methods_[i].getParameters()[0].getType().getQualifiedSourceName());
//			propJJTypes.put(pname, jt2);
//			setters.put(pname, methods_[i]);
//		}
//	}
//	
//	List<String> propNames = new LinkedList<String>();
//	for(String attr : attrsWithSetters) {
//		if(attrsWithGetters.contains(attr)) {
//			propNames.add(attr);			
//		} 
//		else if(propTypes.containsKey(attr)) {
//			propTypes.remove(attr);
//			propJJTypes.remove(attr);
//		}
//	}
//	
//	
////	
////	//now get prop types according to impl1 types
//	for(String name : propNames) {
////		props.put(name, value)
////		propJavaTypes.put(name, propTypes.get(name));
////		propTypes.put(name, toImpl1Type(propTypes.get(name), propJJTypes.get(name), logger));
//	}
//	
//	System.out.println("PROPTYPES: "+Util.toString(propTypes));
//	System.out.println("PROP JJ TYPES: "+Util.toString(propJJTypes));
//	
////	
////	//now get descriptions, .labels and custom editors.
////	for(String name : propNames) {
////		JMethod m = setters.get(name);
////		UseEditor use = m.getAnnotation(UseEditor.class);
////		if(use==null) {
////			m = getters.get(name);
////			use = m.getAnnotation(UseEditor.class);
////		}
////		if(use!=null) {
////			propUseDescriptions.put(name, use.description());
////			propUseLabels.put(name, use.label());
////			propUseEditorIds.put(name, use.editorName());
////			propUseEditorParams.put(name, use.params());
//////			System.out.println(use.editorName());
////			if(Util.notNull(use.editorName()) && 
////					EditorFramework1.isValidEditorName(use.editorName())) {
////				propTypes.put(name, use.editorName());//TODO: fix this we are storing the same in two vars.				
////			}
////		}
////		else {
////			propUseDescriptions.put(name, "");
////			propUseLabels.put(name, "");
////		}
////	}
//	
////	System.out.println(Util.toString(propUseEditorIds)); 
//}
//
////private String toImpl1Type(String t, JClassType jt, TreeLogger logger) {
////	 
////	String ret = null; 
////	
////	if(t.equals("java.lang.String"))
////		ret = EditorFramework1.TYPE_STRING;
////	
////	else if(t.equals("int")||t.equals("java.lang.Integer"))
////		ret = EditorFramework1.TYPE_INTEGER;
////	
////	else if(t.equals("double")||t.equals("java.lang.Double")||
////			t.equals("float")||t.equals("java.lang.Float"))
////		ret = EditorFramework1.TYPE_DOUBLE;
////	
////	else if(t.equals("boolean")||t.equals("java.lang.Boolean"))
////		ret = EditorFramework1.TYPE_BOOLEAN;
////	
//////	else if(t.equals(org.sgx.gwteditors.client.impl1.basetypes.SelectionList.class.getName()))
//////		ret = EditorFramework1.TYPE_LISTSINGLE;
//////	
////	else if(t.equals(Color.class.getName()))
////		ret = EditorFramework1.TYPE_COLOR;
//////	
//////	else if(t.equals(InRangeDouble.class.getName()))
//////		ret = EditorFramework1.TYPE_INRANGEDOUBLE;
//////	
//////	else if(t.equals(InRangeInteger.class.getName()))
//////		ret = EditorFramework1.TYPE_INRANGEINTEGER;
//////	
//////	else if(isAssignableFrom(jt, PropertyHaver.class)) {
//////		ret = EditorFramework1.TYPE_PROPERTYHAVER;
////		
//////	}
////	
//////	logger.log(TreeLogger.INFO, "toImpl1Type: "+t+": "+jt+" - "+ret+" - "+isAssignableFrom(jt, PropertyHaver.class));
////	return ret;
////}
//
////private boolean isAssignableFrom(JClassType jt, Class<PropertyHaver> c) {
////	try {
////		return jt.getOracle().findType(c.getName()).isAssignableFrom(jt);
////	} catch (Exception e) {
////		return false;
////	}
////}
//
//
//}