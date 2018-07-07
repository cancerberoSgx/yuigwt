//package org.sgx.yuigwt.gen;
//
//import java.io.PrintWriter;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import org.sgx.yuigwt.ui.YUIField;
//
//import com.google.gwt.core.ext.Generator;
//import com.google.gwt.core.ext.GeneratorContext;
//import com.google.gwt.core.ext.TreeLogger;
//import com.google.gwt.core.ext.UnableToCompleteException;
//import com.google.gwt.core.ext.typeinfo.JClassType;
//import com.google.gwt.core.ext.typeinfo.JField;
//import com.google.gwt.core.ext.typeinfo.TypeOracle;
//import com.google.gwt.uibinder.client.UiField;
//import com.google.gwt.user.rebind.ClassSourceFileComposerFactory;
//import com.google.gwt.user.rebind.SourceWriter;
//
///**
// * generator for class YUIBinded - it will detect @UiField annotated also with @YUIField 
// * and with that information it will implement missing YUIBindd methods like getUIBinder() 
// * and getYUIBindedEls()
// * @author sg
// * 
// */
//public class YUIBindedGenerator extends Generator {
//	static Logger logger2 = Logger.getLogger("YUIBinderGenerator");
//
//	public String generate(TreeLogger logger, GeneratorContext context, String typeName)
//			throws UnableToCompleteException {
//		TypeOracle typeOracle = context.getTypeOracle();
//		JClassType objectType = typeOracle.findType(typeName);
//		String implTypeName = objectType.getSimpleSourceName() + "Impl";
//		String implPackageName = objectType.getPackage().getName();
//
//		ClassSourceFileComposerFactory composerFactory = new ClassSourceFileComposerFactory(implPackageName,
//				implTypeName);
//
//		composerFactory.setSuperclass(objectType.getQualifiedSourceName());
//
//		PrintWriter printWriter = context.tryCreate(logger, implPackageName, implTypeName);
//		if (printWriter != null) {
//
//			SourceWriter sourceWriter = composerFactory.createSourceWriter(context, printWriter);
//
//			writeMethods(logger, sourceWriter, objectType);
//			sourceWriter.commit(logger);
//
//		}
//		return implPackageName + "." + implTypeName;
//	}
//
//	public void writeMethods(TreeLogger logger, SourceWriter writer, JClassType objectType) {
//
//		JField[] fields = objectType.getFields();
//		List<String> yuiFieldNames = new LinkedList<String>(); 
//		
//		for (int i = 0; i < fields.length; i++) {
//			JField field = fields[i];
//			YUIField yuiFieldAnn = field.getAnnotation(YUIField.class);
//			if (yuiFieldAnn == null || field.getAnnotation(UiField.class) == null)
//				continue;
//			yuiFieldNames.add(field.getName()); 
//
//		}
//		
//		System.out.println("writeMethods");
//		logger.log(TreeLogger.INFO, "writeMethods"); 
//		
//		logger2.log(Level.ALL, "writeMethods2");
//		
//		/**
//		 * UIBinder part: 
//		interface MyUiBinder extends UiBinder<Widget, UIBinderAloneButton> {
//		}
//		private static UiBinder<YUIBinded, Widget> uiBinder = GWT.create(MyUiBinder.class);
//		
//		 */
//		String thisClassName = objectType.getName(); 
//		writer.println("interface MyUiBinder extends UiBinder<Widget, "+thisClassName+"> {}");
//		writer.println("private static UiBinder<YUIBinded, Widget> uiBinder = GWT.create(MyUiBinder.class);");
//		writer.println(" public UiBinder<YUIBinded, Widget> getUIBinder() {");
//		writer.println("	return uiBinder;}");
//		
//		writer.print("private static final String[] _yuiFields = {");
//		Iterator<String> it = yuiFieldNames.iterator();
//		while (it.hasNext()) {
//			String fieldName = (String) it.next();
//			writer.print("\""+fieldName+"\"");
//			if(it.hasNext())
//				writer.print(", ");
//		}
//		writer.print("};");
//		writer.println("/** tell the YUIBinder which are the fields corresponding to YUI widgets. */");
//		writer.println(" public Element[] getYUIBindedEls() { return _yuiFields; }");
//		
//
//	}
//
//
//}