package org.sgx.yuigwt.yui.base;

import org.sgx.yuigwt.yui.attr.AttributeClass;

import com.google.gwt.core.client.JavaScriptObject;

public class BaseClass extends AttributeClass {
protected BaseClass(){}

/**
 * @return  The default set of attributes which will be available for instances of this class, and their configuration. In addition to the configuration properties listed by Attribute's addAttr method, the attribute can also be configured with a "cloneDefaultValue" property, which defines how the statically defined value field should be protected ("shallow", "deep" and false are supported values). By default if the value is an object literal or an array it will be "shallow" cloned, to protect the default value.  
 */
public native final JavaScriptObject ATTRS() /*-{
return this.ATTRS; 
}-*/;
/**
 * @return  The string to be used to identify instances of this class, for example in prefixing events. Classes extending Base, should define their own static NAME property, which should be camelCase by convention (e.g. MyClass.NAME = "myClass";).
 */
public native final String NAME() /*-{
return this.NAME; 
}-*/;
}
