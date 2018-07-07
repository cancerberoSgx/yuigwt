package org.sgx.yuigwt.yui.attr;

import org.sgx.yuigwt.yui.util.AbstractCallback;
import org.sgx.yuigwt.yui.util.CallbackObject;
import org.sgx.yuigwt.yui.util.JsFunction;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * this correspond to a attribtue config property, described at
 * http://yuilibrary.com/yui/docs/attribute/index.html#configuration
 * 
 * @author sg
 * 
 */
public class AttributeDefProp <T> extends JavaScriptObject {
	protected AttributeDefProp(){}
	public static final native <T> AttributeDefProp <T> create()/*-{
		return {}; 
	}-*/;
	
	/**
	 * The default value for this attribute
	 * 
	 * @return
	 */
	public native final T value() /*-{
		return this.value;
	}-*/;

	/**
	 * The default value for this attribute
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp value(T val) /*-{
		this.value = val;
		return this;
	}-*/;

	/**
	 * <p>
	 * A function, the return value of which is the value for the attribute.
	 * This property can be used instead of the value property for static
	 * configurations, if you need to set default values which require access to
	 * instance state ("this.something").
	 * </p>
	 * 
	 * <p>
	 * If both the value and valueFn properties are defined, the value returned
	 * by valueFn has precedence over the value property, unless it returns
	 * undefined, in which case the value property is used.
	 * </p>
	 * 
	 * <p>
	 * The valueFn is passed the name of the attribute, allowing users to share
	 * valueFn implementations across attributes if required.
	 * </p>
	 * 
	 * @return
	 */
	public native final JsFunction valueFn() /*-{
		return this.valueFn;
	}-*/;

	/**
	 * <p>
	 * A function, the return value of which is the value for the attribute.
	 * This property can be used instead of the value property for static
	 * configurations, if you need to set default values which require access to
	 * instance state ("this.something").
	 * </p>
	 * 
	 * <p>
	 * If both the value and valueFn properties are defined, the value returned
	 * by valueFn has precedence over the value property, unless it returns
	 * undefined, in which case the value property is used.
	 * </p>
	 * 
	 * <p>
	 * The valueFn is passed the name of the attribute, allowing users to share
	 * valueFn implementations across attributes if required.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp valueFn(JsFunction val) /*-{
		this.valueFn = val;
		return this;
	}-*/;

	/**
	 * <p>
	 * A function, the return value of which is the value for the attribute.
	 * This property can be used instead of the value property for static
	 * configurations, if you need to set default values which require access to
	 * instance state ("this.something").
	 * </p>
	 * 
	 * <p>
	 * If both the value and valueFn properties are defined, the value returned
	 * by valueFn has precedence over the value property, unless it returns
	 * undefined, in which case the value property is used.
	 * </p>
	 * 
	 * <p>
	 * The valueFn is passed the name of the attribute, allowing users to share
	 * valueFn implementations across attributes if required.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp valueFn(CallbackObject val) /*-{
		this.valueFn = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/CallbackObject;)(val);
		return this;
	}-*/;
	
	/**
	 * <p>
	 * A function, the return value of which is the value for the attribute.
	 * This property can be used instead of the value property for static
	 * configurations, if you need to set default values which require access to
	 * instance state ("this.something").
	 * </p>
	 * 
	 * <p>
	 * If both the value and valueFn properties are defined, the value returned
	 * by valueFn has precedence over the value property, unless it returns
	 * undefined, in which case the value property is used.
	 * </p>
	 * 
	 * <p>
	 * The valueFn is passed the name of the attribute, allowing users to share
	 * valueFn implementations across attributes if required.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp valueFn(AbstractCallback<T, Void> val) /*-{
		this.valueFn = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/AbstractCallback;)(val); 
		return this;
	}-*/;

	/**
	 * <p>
	 * Custom 'get' handler, which is invoked when the user calls Attribute's
	 * get method. It can be used to manipulate or normalize the stored value
	 * before it is returned to the user.
	 * </p>
	 * 
	 * <p>
	 * The function will be passed the currently stored value of the attribute
	 * as the first argument and the name of the attribute as the second
	 * argument. If configured, the value returned by this function will be the
	 * value returned to the user.
	 * </p>
	 * 
	 * <p>
	 * Attribute also supports the ability to return sub-attribute values
	 * (get('a.b.c')). The getter implications for this are discussed in the
	 * Getters, Setters, Validators and Sub Attributes section
	 * (http://yuilibrary.com/yui/docs/attribute/index.html#subattrs-gsv).
	 * </p>
	 * 
	 * @return
	 */
	public native final JsFunction getter() /*-{
		return this.getter;
	}-*/;

	/**
	 * <p>
	 * Custom 'get' handler, which is invoked when the user calls Attribute's
	 * get method. It can be used to manipulate or normalize the stored value
	 * before it is returned to the user.
	 * </p>
	 * 
	 * <p>
	 * The function will be passed the currently stored value of the attribute
	 * as the first argument and the name of the attribute as the second
	 * argument. If configured, the value returned by this function will be the
	 * value returned to the user.
	 * </p>
	 * 
	 * <p>
	 * Attribute also supports the ability to return sub-attribute values
	 * (get('a.b.c')). The getter implications for this are discussed in the
	 * Getters, Setters, Validators and Sub Attributes section
	 * (http://yuilibrary.com/yui/docs/attribute/index.html#subattrs-gsv).
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp getter(JsFunction val) /*-{
		this.getter = val;
		return this;
	}-*/;

	/**
	 * <p>
	 * Custom 'get' handler, which is invoked when the user calls Attribute's
	 * get method. It can be used to manipulate or normalize the stored value
	 * before it is returned to the user.
	 * </p>
	 * 
	 * <p>
	 * The function will be passed the currently stored value of the attribute
	 * as the first argument and the name of the attribute as the second
	 * argument. If configured, the value returned by this function will be the
	 * value returned to the user.
	 * </p>
	 * 
	 * <p>
	 * Attribute also supports the ability to return sub-attribute values
	 * (get('a.b.c')). The getter implications for this are discussed in the
	 * Getters, Setters, Validators and Sub Attributes section
	 * (http://yuilibrary.com/yui/docs/attribute/index.html#subattrs-gsv).
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp getter(CallbackObject val) /*-{
		this.getter = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/CallbackObject;)(val);
		return this;
	}-*/;

	/**
	 * <p>
	 * Custom 'get' handler, which is invoked when the user calls Attribute's
	 * get method. It can be used to manipulate or normalize the stored value
	 * before it is returned to the user.
	 * </p>
	 * 
	 * <p>
	 * The function will be passed the currently stored value of the attribute
	 * as the first argument and the name of the attribute as the second
	 * argument. If configured, the value returned by this function will be the
	 * value returned to the user.
	 * </p>
	 * 
	 * <p>
	 * Attribute also supports the ability to return sub-attribute values
	 * (get('a.b.c')). The getter implications for this are discussed in the
	 * Getters, Setters, Validators and Sub Attributes section
	 * (http://yuilibrary.com/yui/docs/attribute/index.html#subattrs-gsv).
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp getter(AbstractCallback<T,Void> val) /*-{
		this.getter = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/AbstractCallback;)(val);
		return this;
	}-*/;

	/**
	 * <p>
	 * Custom 'set' handler, which is invoked when the user calls Attribute's
	 * set method. It can be used to manipulate the value which is stored for
	 * the attribute.
	 * </p>
	 * 
	 * <p>
	 * The function will be passed the value which the user passed to the set
	 * method as the first argument and the name of the attribute as the second
	 * argument. If configured, the value returned by this function will be the
	 * value stored as the attribute value.
	 * </p>
	 * 
	 * <p>
	 * The getter and setter can be used to normalize values on input/output for
	 * the user while storing the value in a format most effective for internal
	 * operation.
	 * </p>
	 * 
	 * <p>
	 * Attribute also supports the ability to set sub-attribute values
	 * (set('a.b.c', 10)). The setter implications for this are discussed in the
	 * Getters, Setters, Validators and Sub Attributes section.
	 * </p>
	 * 
	 * @param val
	 * @return
	 */
	public native final JsFunction setter() /*-{
		return this.setter;
	}-*/;

	/**
	 * <p>
	 * Custom 'set' handler, which is invoked when the user calls Attribute's
	 * set method. It can be used to manipulate the value which is stored for
	 * the attribute.
	 * </p>
	 * 
	 * <p>
	 * The function will be passed the value which the user passed to the set
	 * method as the first argument and the name of the attribute as the second
	 * argument. If configured, the value returned by this function will be the
	 * value stored as the attribute value.
	 * </p>
	 * 
	 * <p>
	 * The getter and setter can be used to normalize values on input/output for
	 * the user while storing the value in a format most effective for internal
	 * operation.
	 * </p>
	 * 
	 * <p>
	 * Attribute also supports the ability to set sub-attribute values
	 * (set('a.b.c', 10)). The setter implications for this are discussed in the
	 * Getters, Setters, Validators and Sub Attributes section.
	 * </p>
	 * 
	 * @param val
	 * @return
	 */
	public native final AttributeDefProp setter(JsFunction val) /*-{
		this.setter = val;
		return this;
	}-*/;

	/**
	 * <p>
	 * Custom 'set' handler, which is invoked when the user calls Attribute's
	 * set method. It can be used to manipulate the value which is stored for
	 * the attribute.
	 * </p>
	 * 
	 * <p>
	 * The function will be passed the value which the user passed to the set
	 * method as the first argument and the name of the attribute as the second
	 * argument. If configured, the value returned by this function will be the
	 * value stored as the attribute value.
	 * </p>
	 * 
	 * <p>
	 * The getter and setter can be used to normalize values on input/output for
	 * the user while storing the value in a format most effective for internal
	 * operation.
	 * </p>
	 * 
	 * <p>
	 * Attribute also supports the ability to set sub-attribute values
	 * (set('a.b.c', 10)). The setter implications for this are discussed in the
	 * Getters, Setters, Validators and Sub Attributes section.
	 * </p>
	 * 
	 * @param val
	 * @return
	 */
	public native final AttributeDefProp setter(AbstractCallback<Void, T> val) /*-{
		this.setter = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/AbstractCallback;)(val);
		return this;
	}-*/;

	/**
	 * <p>
	 * Validation function, which if defined, is called before the setter. The
	 * validation function is passed the value which the user is trying to set
	 * as the first argument and the name of the attribute as the second
	 * argument.
	 * </p>
	 * 
	 * <p>
	 * If the function returns false, the attribute's stored value is not
	 * updated (and the setter, if defined, will not be invoked). If it returns
	 * true, the setter is invoked if defined, and the attribute's stored value
	 * is updated.
	 * </p>
	 * 
	 * <p>
	 * If validation is a potentially expensive task and contains code which
	 * would be repeated in a setter (for example, converting a string to a Node
	 * reference), you can combine validation into the setter function, by
	 * returning Attribute.INVALID_VALUE from a setter if it encounters an
	 * invalid value.
	 * </p>
	 * 
	 * <p>
	 * Attribute also supports the ability to set sub-attribute values
	 * (set('a.b.c', 10)). The 'validator' implications for this are discussed
	 * in the Getters, Setters, Validators and Sub Attributes section.
	 * </p>
	 * 
	 * @param val
	 * @return
	 */
	public native final AttributeDefProp validator(JsFunction val) /*-{
		this.validator = val;
		return this;
	}-*/;

	/**
	 * <p>
	 * Validation function, which if defined, is called before the setter. The
	 * validation function is passed the value which the user is trying to set
	 * as the first argument and the name of the attribute as the second
	 * argument.
	 * </p>
	 * 
	 * <p>
	 * If the function returns false, the attribute's stored value is not
	 * updated (and the setter, if defined, will not be invoked). If it returns
	 * true, the setter is invoked if defined, and the attribute's stored value
	 * is updated.
	 * </p>
	 * 
	 * <p>
	 * If validation is a potentially expensive task and contains code which
	 * would be repeated in a setter (for example, converting a string to a Node
	 * reference), you can combine validation into the setter function, by
	 * returning Attribute.INVALID_VALUE from a setter if it encounters an
	 * invalid value.
	 * </p>
	 * 
	 * <p>
	 * Attribute also supports the ability to set sub-attribute values
	 * (set('a.b.c', 10)). The 'validator' implications for this are discussed
	 * in the Getters, Setters, Validators and Sub Attributes section.
	 * </p>
	 * 
	 * @param val
	 * @return
	 */
	public native final AttributeDefProp validator(AbstractCallback val) /*-{
		this.validator = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/AbstractCallback;)(val);
		return this;
	}-*/;

	/**
	 * Configures the attribute to be read-only. Users will not be able to set
	 * the value of the attribute using Attribute's public API.
	 * 
	 * @return
	 */
	public native final boolean readOnly() /*-{
		return this.readOnly;
	}-*/;

	/**
	 * Configures the attribute to be read-only. Users will not be able to set
	 * the value of the attribute using Attribute's public API.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp readOnly(boolean val) /*-{
		this.readOnly = val;
		return this;
	}-*/;

	/**
	 * <p>
	 * Configures the attribute to be write-once. Users will only be able to set
	 * the value of the attribute using Attribute's set method once. Once a
	 * value has been set for the attribute, calling set will not change it's
	 * value.
	 * </p>
	 * 
	 * <p>
	 * If set to "initOnly", the attribute can only be set during
	 * initialization. In the case of Base, this means that the attribute can
	 * only be set through the constructor.
	 * </p>
	 * 
	 * <p>
	 * Code within your class can update the value of readOnly or writeOnce
	 * attributes by using the private _set method.
	 * </p>
	 * 
	 * @return
	 */
	public native final boolean writeOnce() /*-{
		return this.writeOnce;
	}-*/;

	/**
	 * <p>
	 * Configures the attribute to be write-once. Users will only be able to set
	 * the value of the attribute using Attribute's set method once. Once a
	 * value has been set for the attribute, calling set will not change it's
	 * value.
	 * </p>
	 * 
	 * <p>
	 * If set to "initOnly", the attribute can only be set during
	 * initialization. In the case of Base, this means that the attribute can
	 * only be set through the constructor.
	 * </p>
	 * 
	 * <p>
	 * Code within your class can update the value of readOnly or writeOnce
	 * attributes by using the private _set method.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp writeOnce(boolean val) /*-{
		this.writeOnce = val;
		return this;
	}-*/;

	/**
	 * By default attribute change events are not broadcast to the YUI instance
	 * or global YUI object. The broadcast property can be used to set specific
	 * attribute change events to be broadcast to either the YUI instance or the
	 * global YUI object. See CustomEvent's broadcast property for valid values.
	 * 
	 * @return
	 */
	public native final int broadcast() /*-{
		return this.broadcast;
	}-*/;

	/**
	 * By default attribute change events are not broadcast to the YUI instance
	 * or global YUI object. The broadcast property can be used to set specific
	 * attribute change events to be broadcast to either the YUI instance or the
	 * global YUI object. See CustomEvent's broadcast property for valid values.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp broadcast(int val) /*-{
		this.broadcast = val;
		return this;
	}-*/;

	/**
	 * <p>
	 * Whether or not to delay initialization of the attribute until the first
	 * call to get/set it. This flag can be used to over-ride lazy
	 * initialization on a per attribute basis, when adding multiple attributes
	 * through the addAttrs method.
	 * </p>
	 * 
	 * <p>
	 * When extending Base, all attributes are added lazily, so this flag can be
	 * used to over-ride lazyAdd behavior for specific attributes.
	 * </p>
	 * 
	 * <p>
	 * The only reason you should need to disable lazyAdd is if your setter is
	 * doing more than normalizing the attribute value. For example if your
	 * setter is storing some other state, in this._someProp, which is being
	 * used by other parts of your component. In this case, since you're not
	 * getting or setting the attribute to access this._someProp, it won't get
	 * set up lazily, until someone actually calls get or set for the related
	 * attribute.
	 * </p>
	 * 
	 * @return
	 */
	public native final boolean lazyAdd() /*-{
		return this.lazyAdd;
	}-*/;

	/**
	 * <p>
	 * Whether or not to delay initialization of the attribute until the first
	 * call to get/set it. This flag can be used to over-ride lazy
	 * initialization on a per attribute basis, when adding multiple attributes
	 * through the addAttrs method.
	 * </p>
	 * 
	 * <p>
	 * When extending Base, all attributes are added lazily, so this flag can be
	 * used to over-ride lazyAdd behavior for specific attributes.
	 * </p>
	 * 
	 * <p>
	 * The only reason you should need to disable lazyAdd is if your setter is
	 * doing more than normalizing the attribute value. For example if your
	 * setter is storing some other state, in this._someProp, which is being
	 * used by other parts of your component. In this case, since you're not
	 * getting or setting the attribute to access this._someProp, it won't get
	 * set up lazily, until someone actually calls get or set for the related
	 * attribute.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp lazyAdd(boolean val) /*-{
		this.lazyAdd = val;
		return this;
	}-*/;

	/**
	 * <p>
	 * This configuration value is not actually supported by Attribute natively,
	 * but is available when working with Base, and defining attribute
	 * configurations using Base's static Attrs property.
	 * </p>
	 * 
	 * <p>
	 * This property controls how the statically defined default value field in
	 * Base's Attrs attribute configuration is handled, when setting it up as
	 * the value for an instance. By default (if this property is not defined)
	 * object literals and arrays are deep cloned, to protect the default value
	 * from being modified. Setting cloneDefaultValue to false will disable
	 * cloning. This is useful in cases where you intend to use arrays or object
	 * literals by reference (e.g. they point to utilities). A shallow clone
	 * will be used if cloneDefaultValue is set to "shallow" and a deep clone
	 * will be used for "deep" or true.
	 * </p>
	 * 
	 * @return
	 */
	public native final String cloneDefaultValue() /*-{
		return this.cloneDefaultValue;
	}-*/;

	/**
	 * <p>
	 * This configuration value is not actually supported by Attribute natively,
	 * but is available when working with Base, and defining attribute
	 * configurations using Base's static Attrs property.
	 * </p>
	 * 
	 * <p>
	 * This property controls how the statically defined default value field in
	 * Base's Attrs attribute configuration is handled, when setting it up as
	 * the value for an instance. By default (if this property is not defined)
	 * object literals and arrays are deep cloned, to protect the default value
	 * from being modified. Setting cloneDefaultValue to false will disable
	 * cloning. This is useful in cases where you intend to use arrays or object
	 * literals by reference (e.g. they point to utilities). A shallow clone
	 * will be used if cloneDefaultValue is set to "shallow" and a deep clone
	 * will be used for "deep" or true.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp cloneDefaultValue(String val) /*-{
		this.cloneDefaultValue = val;
		return this;
	}-*/;

	/**
	 * <p>
	 * This configuration value is not actually supported by Attribute natively,
	 * but is available when working with Base, and defining attribute
	 * configurations using Base's static Attrs property.
	 * </p>
	 * 
	 * <p>
	 * This property controls how the statically defined default value field in
	 * Base's Attrs attribute configuration is handled, when setting it up as
	 * the value for an instance. By default (if this property is not defined)
	 * object literals and arrays are deep cloned, to protect the default value
	 * from being modified. Setting cloneDefaultValue to false will disable
	 * cloning. This is useful in cases where you intend to use arrays or object
	 * literals by reference (e.g. they point to utilities). A shallow clone
	 * will be used if cloneDefaultValue is set to "shallow" and a deep clone
	 * will be used for "deep" or true.
	 * </p>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AttributeDefProp cloneDefaultValue(boolean val) /*-{
		this.cloneDefaultValue = val;
		return this;
	}-*/;
}
