package org.sgx.gwtjavatools.delegate;

import japa.parser.JavaParser;
import japa.parser.ParseException;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.ModifierSet;
import japa.parser.ast.body.Parameter;
import japa.parser.ast.body.TypeDeclaration;
import japa.parser.ast.type.Type;
import japa.parser.ast.type.VoidType;
import japa.parser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * the same but with getters/setters method syntax. 
 * 
 * uses http://code.google.com/p/javaparser for building delegate methods - just
 * like eclipse does but automatically choosing only target class methods, not
 * methods defined in its superclasses. Also it copies the wrapped javadoc
 * method comments
 * 
 * TODO: declared exceptions are ignored
 * 
 * TODO: if param or return types are from .yui. package then transform them into jyui. package types.
 * 
 *  
 * 
 * @author sg
 * 
 */
public class JYUIDelegateMethods2 {

	/**
	 * 
	 * @param sb
	 *            - the sb in which to render the output code
	 * @param targetJavaClassFile
	 *            - the path, relative to YUIGWT_SRC_ROOT_PATH, of the target
	 *            java class file (the java file of target delegate-to class).
	 * @param delegateExpression
	 *            - delegate field or getter to which point all delegation,
	 *            example: "this._wrapper" - will result on
	 *            this._wrapper.delegateMethod1(...
	 * @throws ParseException
	 * @throws IOException
	 */
	public void renderDelegateMethods(Config config) throws ParseException, IOException {

		File classFile = new File(config.getTargetJavaClassFile());
		
		FileInputStream in = new FileInputStream(classFile);
		TypeDeclaration mainType = null;
		CompilationUnit cu;
		try {
			// parse the file
			cu = JavaParser.parse(in);

			mainType = searchForMainType(cu);
			mainType.getName();
		} finally {
			in.close();
		}

		config.setTargetType(mainType);
		new MethodVisitor(config).visit(cu, null);

	}

	private TypeDeclaration searchForMainType(CompilationUnit cu) {
		for (TypeDeclaration t : cu.getTypes()) {
			if ((t.getModifiers() | ModifierSet.PUBLIC) != 0) {
				return t;
			}
		}
		return null;
	}

	/**
	 * Simple visitor implementation for visiting MethodDeclaration nodes.
	 */
	private class MethodVisitor extends VoidVisitorAdapter {

		Config config;

		public MethodVisitor(Config config) {
			super();
			this.config = config;
		}

		@Override
		public void visit(MethodDeclaration m, Object arg) {

//			if(m.getName().equals("voidMethod1")) {
//				Type ttt = m.getType(); 
//			}
			boolean isPublic = (m.getModifiers() | ModifierSet.PUBLIC) != 0, isStatic = (m.getModifiers() | ModifierSet.STATIC) != 0;

			if (!isPublic)
				return; // do not delegate non public and non instance methods
				// if (isStatic) //TODO: do not work - japa bug ? 
				// return; // do not delegate static methods

			if (definedInSuperClass(m, config.getTargetType()))
				return; // do not delegate methods that are defined in a
						// superclass
			List<Parameter> params = m.getParameters();

			StringBuffer javadoc = new StringBuffer(), body = new StringBuffer();
			if(m.getJavaDoc()!=null)
				javadoc.append(m.getJavaDoc().toString());

			// javadoc.append(
			// "/**\n" +
			// " * ");

			body.append("public " + m.getType() + " " + m.getName() + "(");

			StringBuffer paramCallList = new StringBuffer();

			if (params != null)
				for (Iterator it = params.iterator(); it.hasNext();) {
					Parameter p = (Parameter) it.next();
					body.append(p.getType() + " " + m.getName() + (it.hasNext() ? ", " : ""));
					paramCallList.append(m.getName() + (it.hasNext() ? ", " : ""));
				}

			body.append(") {\n");
			
			String returnExpr = ""; 
			if(! (m.getType() instanceof VoidType)) { 
				returnExpr+="return "; 
			}
			body.append(returnExpr+config.getDelegateExpression() + "." + m.getName() + "(");
			body.append(paramCallList);
			body.append("); \n}\n");

			config.getSb().append(javadoc);

			config.getSb().append("\n");
			config.getSb().append(body);
		}

	}

	public static class Config {
		StringBuffer sb;
		String targetJavaClassFil;
		String delegateExpression;
		private TypeDeclaration targetType;

		/**
		 * @return the sb
		 */
		public StringBuffer getSb() {
			return sb;
		}

		public void setTargetType(TypeDeclaration mainType) {
			this.targetType = mainType;
		}

		public TypeDeclaration getTargetType() {
			return targetType;
		}

		/**
		 * @param sb
		 *            the sb to set
		 */
		public void setSb(StringBuffer sb) {
			this.sb = sb;
		}

		/**
		 * @return the targetJavaClassFil
		 */
		public String getTargetJavaClassFile() {
			return targetJavaClassFil;
		}

		/**
		 * @param targetJavaClassFil
		 *            the targetJavaClassFil to set
		 */
		public void setTargetJavaClassFile(String targetJavaClassFil) {
			this.targetJavaClassFil = targetJavaClassFil;
		}

		/**
		 * @return the delegateExpression
		 */
		public String getDelegateExpression() {
			return delegateExpression;
		}

		/**
		 * @param delegateExpression
		 *            the delegateExpression to set
		 */
		public void setDelegateExpression(String delegateExpression) {
			this.delegateExpression = delegateExpression;
		}
		// /**
		// * @return the className
		// */
		// public String getClassName() {
		// return className;
		// }
		// /**
		// * @param className the className to set
		// */
		// public void setClassName(String className) {
		// this.className = className;
		// }

	}

	public boolean definedInSuperClass(MethodDeclaration m, TypeDeclaration targetType) {
		return false; 
 		 /* JAPA only parses the methods defined in the target java file - so no methods defined in superclasses are paresd. */
	}

	// test
	public static void main(String[] args) {

		String YUIGWT_SRC_ROOT_PATH = "/home/sebastian/workspace3.7/yuigwt/src/",

		targetFileClass = "org/sgx/yuigwt/yui/widget/button/ButtonConfig.java", 
		
		delegateExpression = "_wrappedButtonConfig()",
		
		targetJavaClassFile = YUIGWT_SRC_ROOT_PATH + targetFileClass;;
		
		JYUIDelegateMethods2 tool = new JYUIDelegateMethods2();
		
		StringBuffer sb = new StringBuffer();
		try {
			Config config = new Config();
			config.setSb(sb);
			config.setDelegateExpression(delegateExpression);
			config.setTargetJavaClassFile(targetJavaClassFile);

			tool.renderDelegateMethods(config);

			System.out.println(sb);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
