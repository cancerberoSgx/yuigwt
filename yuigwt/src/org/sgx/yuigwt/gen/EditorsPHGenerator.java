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
////import org.sgx.yuigwt.editors.bean.UseEditor;
//import org.sgx.yuigwt.editors.basetypes.Color;
//import org.sgx.yuigwt.editors.bean.UseEditor;
//import org.sgx.yuigwt.editors.impl.EditorFramework1;
//import org.sgx.yuigwt.editors.props.PropertyHaver;
//import org.sgx.yuigwt.editors.props.PropertyInfo;
//import org.sgx.yuigwt.yui.util.LWOMap;
//import org.sgx.yuigwt.yui.util.Util;
//
////import org.sgx.gwteditors.client.editor.props.PropertyHaver;
////import org.sgx.gwteditors.client.impl1.EditorFramework1;
////import org.sgx.gwteditors.client.impl1.basetypes.Color;
////import org.sgx.gwteditors.client.impl1.basetypes.InRangeDouble;
////import org.sgx.gwteditors.client.impl1.basetypes.InRangeInteger;
////import org.sgx.gwteditors.client.util.Util;
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
// * generate all required methods for an EditableBean to be a valid PropertyHaver.
// * (adds methods getProperties() and get/setProperty() to an bastract javabean that implements EditableBean
// * 
// *  EditableBean is an interface that the user can use in its java beans classes
// implementors will be poblated automatically using GWT derrefered binding (see PHCenerator (compile time class responsbile for this) 
//
//Using propertyHavers, the user must add a lot of code getProperties() set/get/Property() to the bean in
//order to be editable. In this package, we present EditableBean, a subclass of PropertyHaver that
//will allow the user to add theneccesary method implementations to its beans for it to be
//a vlid PropertyHagver, using GWT derreferred binding (generators)
// * @author sg
// *
// */
//public class EditorsPHGenerator extends Generator {
//	static Logger logger = Logger.getLogger("PHGenerator");
//	
//	private HashMap<String, String> propTypes;
//	private HashMap<String, String> setterMethodNames;
//	private HashMap<String, String> getterMethodNames;
//
//	private HashMap<String, String> propJavaTypes;
//	private HashMap<String, JClassType> propJJTypes;
//	private HashMap<String, String> propUseLabels;
//	private HashMap<String, String> propUseDescriptions;
//	private HashMap<String, String> propUseEditorIds;
//	private HashMap<String, String> propUseEditorParams;
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
//        composerFactory.addImport("org.sgx.yuigwt.yui.util.LWOMap");
//        composerFactory.addImport("org.sgx.yuigwt.editors.props.PropertyInfo");
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
////	writer.println("public String toString(){");
////	writer.println("	String s = \"PropertyHaver(\"; ");
////	writer.println("	for(String name : this.getProperties().keys())");
////	writer.println("		s+=name+\",\"; ");
////	writer.println("	return s+\")\"; ");	
////	writer.println("}");
//	
//	writer.println("static LWOMap<String, PropertyInfo> _props = null;");
//	
//	writer.println("public LWOMap<String, PropertyInfo> getProperties() {");
//	writer.indent();
//	
//		writer.println("if(_props==null) {");
//		writer.indent();
//			writer.println("_props=new LWOMap<String, PropertyInfo>();");
//			
//			for(String name : propTypes.keySet()) {
//				//constr params : String name, String type, String description, String label, String editorId
//				String s = "_props.put(\""+name+"\", new PropertyInfo(\""+name+"\", \""+propTypes.get(name)+"\", \""+
//						propUseDescriptions.get(name)+"\", \""+propUseLabels.get(name)+"\", \""+propUseEditorIds.get(name)+"\", \""+propUseEditorParams.get(name)+"\" ));";
////				System.out.println(s);
//				writer.println(s);
//			}			
//			
//		writer.outdent();
//		writer.println("}");
//		writer.println("return _props;");
//	
//	writer.outdent();
//	writer.println("}");
//	
//	
//	writer.println("public Object getProperty(String propertyName) {");
//	for(String name : propTypes.keySet()) {
//		writer.println("if(propertyName.equals(\""+name+"\")) return this."+getterMethodNames.get(name)+"();");		
//	}
//	writer.println("return null;");
//	writer.println("}");
//	
//	writer.println("public void setProperty(String propertyName, Object val) {");
//	for(String name : propTypes.keySet()) {
//		writer.println("if(propertyName.equals(\""+name+"\")) this."+setterMethodNames.get(name)+"(("+propJavaTypes.get(name)+")val);");
//	}	
//	writer.println("}");
//	
//}
//
//void buildFieldInfo(JClassType jt, TreeLogger logger) {
//	
//	JMethod[] methods_ = jt.getMethods();
//	
//	Set<String> attrsWithSetters  = new HashSet<String>(), 
//			attrsWithGetters = new HashSet<String>();
//	
//	propTypes = new HashMap<String, String>();
//	propJJTypes = new HashMap<String, JClassType>();
//	propJavaTypes = new HashMap<String, String>(); 
//	setterMethodNames = new HashMap<String, String>(); 
//	getterMethodNames= new HashMap<String, String>();
//	HashMap<String, JMethod> setters = new HashMap<String, JMethod>();
//	HashMap<String, JMethod> getters = new HashMap<String, JMethod>();
//	propUseDescriptions = new HashMap<String, String>();
//	propUseEditorIds = new HashMap<String, String>(); 
//	propUseEditorParams = new HashMap<String, String>();
//	
//	propUseLabels = new HashMap<String, String>();
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
//	//now get prop types according to impl1 types
//	for(String name : propNames) {
//		propJavaTypes.put(name, propTypes.get(name));
//		propTypes.put(name, toImpl1Type(propTypes.get(name), propJJTypes.get(name), logger));
//	}
//	
//	//now get descriptions, .labels and custom editors.
//	for(String name : propNames) {
//		JMethod m = setters.get(name);
//		UseEditor use = m.getAnnotation(UseEditor.class);
//		if(use==null) {
//			m = getters.get(name);
//			use = m.getAnnotation(UseEditor.class);
//		}
//		if(use!=null) {
//			propUseDescriptions.put(name, use.description());
//			propUseLabels.put(name, use.label());
//			propUseEditorIds.put(name, use.editorName());
//			propUseEditorParams.put(name, use.params());
////			System.out.println(use.editorName());
//			if(Util.notNull(use.editorName()) && 
//					EditorFramework1.isValidEditorName(use.editorName())) {
//				propTypes.put(name, use.editorName());//TODO: fix this we are storing the same in two vars.				
//			}
//		}
//		else {
//			propUseDescriptions.put(name, "");
//			propUseLabels.put(name, "");
//		}
//	}
//	
////	System.out.println(Util.toString(propUseEditorIds)); 
//}
//
//private String toImpl1Type(String t, JClassType jt, TreeLogger logger) {
//	 
//	String ret = null; 
//	
//	if(t.equals("java.lang.String"))
//		ret = EditorFramework1.TYPE_STRING;
//	
//	else if(t.equals("int")||t.equals("java.lang.Integer"))
//		ret = EditorFramework1.TYPE_INTEGER;
//	
//	else if(t.equals("double")||t.equals("java.lang.Double")||
//			t.equals("float")||t.equals("java.lang.Float"))
//		ret = EditorFramework1.TYPE_DOUBLE;
//	
//	else if(t.equals("boolean")||t.equals("java.lang.Boolean"))
//		ret = EditorFramework1.TYPE_BOOLEAN;
//	
////	else if(t.equals(org.sgx.gwteditors.client.impl1.basetypes.SelectionList.class.getName()))
////		ret = EditorFramework1.TYPE_LISTSINGLE;
////	
//	else if(t.equals(Color.class.getName()))
//		ret = EditorFramework1.TYPE_COLOR;
////	
////	else if(t.equals(InRangeDouble.class.getName()))
////		ret = EditorFramework1.TYPE_INRANGEDOUBLE;
////	
////	else if(t.equals(InRangeInteger.class.getName()))
////		ret = EditorFramework1.TYPE_INRANGEINTEGER;
////	
////	else if(isAssignableFrom(jt, PropertyHaver.class)) {
////		ret = EditorFramework1.TYPE_PROPERTYHAVER;
//		
////	}
//	
////	logger.log(TreeLogger.INFO, "toImpl1Type: "+t+": "+jt+" - "+ret+" - "+isAssignableFrom(jt, PropertyHaver.class));
//	return ret;
//}
//
////private boolean isAssignableFrom(JClassType jt, Class<PropertyHaver> c) {
////	try {
////		return jt.getOracle().findType(c.getName()).isAssignableFrom(jt);
////	} catch (Exception e) {
////		return false;
////	}
////}
//
//private static String getPropertyName(String prefix, String methodName) {
//	String pName = methodName.substring(prefix.length(), methodName.length());
//	return pName.substring(0,1).toLowerCase()+pName.substring(1, pName.length());
//}
//
//
//}