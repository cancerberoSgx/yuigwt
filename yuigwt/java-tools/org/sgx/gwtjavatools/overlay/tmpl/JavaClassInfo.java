package org.sgx.gwtjavatools.overlay.tmpl;

public class JavaClassInfo {
String className, packageName, extendsClassName;

public JavaClassInfo(String className, String packageName) {
	super();
	this.className = className;
	this.packageName = packageName;
	extendsClassName="com.google.gwt.core.client.JavaScriptObject"; 
}

public String getClassName() {
	return className;
}

public void setClassName(String className) {
	this.className = className;
}

public String getPackageName() {
	return packageName;
}

public void setPackageName(String packageName) {
	this.packageName = packageName;
}

public String getExtendsClassName() {
	return extendsClassName;
}

public void setExtendsClassName(String extendsClassName) {
	this.extendsClassName = extendsClassName;
} 

}
