package org.sgx.yuigwt.yui.attr;

import org.sgx.yuigwt.yui.event.EventTarget;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * Java note: we make Attribute extends Event target because js YUI uses
 * multiple inheritance so Base extends both EventTarget and Attribute, but here
 * in java we only have single inheritance.</br></br> Attribute provides
 * configurable attribute support along with attribute change events. It is
 * designed to be augmented on to a host class, and provides the host with the
 * ability to configure attributes to store and retrieve state, along with
 * attribute change events.
 * <p>
 * For example, attributes added to the host can be configured:
 * </p>
 * <ul>
 * <li>As read only.</li>
 * <li>As write once.</li>
 * <li>With a setter function, which can be used to manipulate values passed to
 * Attribute's<a href="#method_set">set</a>method, before they are stored.</li>
 * <li>With a getter function, which can be used to manipulate stored values,
 * before they are returned by Attribute's<a href="#method_get">get</a>method.</li>
 * <li>With a validator function, to validate values before they are stored.</li>
 * </ul>
 * <p>
 * See the<a href="#method_addAttr">addAttr</a>method, for the complete set of
 * configuration options available for attributes.
 * </p>
 * <p>
 * <strong>NOTE:</strong>Most implementations will be better off extending the<a
 * href=Base.html>Base</a>class, instead of augmenting Attribute directly. Base
 * augments Attribute and will handle the initial configuration of attributes
 * for derived classes, accounting for values passed into the constructor.
 * </p>
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Attribute.html
 * @see http://yuilibrary.com/yui/docs/api/classes/AttributeCore.html
 * @author sg
 * 
 */
public class Attribute extends EventTarget {
	protected Attribute() {
	}

	/**
	 * Adds an attribute with the provided configuration to the host object.
	 * 
	 * @param name
	 *            The name of the attribute.
	 * @param config
	 *            An object with attribute configuration property/value pairs,
	 *            specifying the configuration for the attribute. NOTE: The
	 *            configuration object is modified when adding an attribute, so
	 *            if you need to protect the original values, you will need to
	 *            merge the object.
	 * @param lazy
	 *            (optional) Whether or not to add this attribute lazily (on the
	 *            first call to get/set).
	 * @return A reference to the host object.
	 */
	public final native JavaScriptObject addAttr(String name, AttributeDefProp config, boolean lazy)/*-{
		return this.addAttr(name, config, lazy);
	}-*/;

	/**
	 * Adds an attribute with the provided configuration to the host object.
	 * 
	 * @param name
	 *            The name of the attribute.
	 * @param config
	 *            An object with attribute configuration property/value pairs,
	 *            specifying the configuration for the attribute. NOTE: The
	 *            configuration object is modified when adding an attribute, so
	 *            if you need to protect the original values, you will need to
	 *            merge the object.
	 * @return A reference to the host object.
	 */
	public final native Attribute addAttr(String name, AttributeDefProp config)/*-{
		return this.addAttr(name, config);
	}-*/;

	/**
	 * Configures a group of attributes, and sets initial values. NOTE: This
	 * method does not isolate the configuration object by merging/cloning. The
	 * caller is responsible for merging/cloning the configuration object if
	 * required.
	 * 
	 * @param cfgs
	 *            An object with attribute name/configuration pairs.
	 * @param values
	 *            An object with attribute name/value pairs, defining the
	 *            initial values to apply. Values defined in the cfgs argument
	 *            will be over-written by values in this argument unless defined
	 *            as read only.
	 * @param lazy
	 *            Whether or not to delay the intialization of these attributes
	 *            until the first call to get/set. Individual attributes can
	 *            over-ride this behavior by defining a lazyAdd configuration
	 *            property in their configuration. See addAttr.
	 * @return A reference to the host object.
	 */
	public final native Attribute addAttrs(JavaScriptObject cfgs, JavaScriptObject values, boolean lazy)/*-{
		return this.addAttrs(name, config);
	}-*/;

	/**
	 * Checks if the given attribute has been added to the host
	 * 
	 * @param name
	 *            The name of the attribute to check.
	 * @return true if an attribute with the given name has been added, false if
	 *         it hasn't. This method will return true for lazily added
	 *         attributes.
	 */
	public final native boolean attrAdded(String name)/*-{
		return this.attrAdded(name);
	}-*/;

	/**
	 * Gets multiple attribute values.
	 * 
	 * @param attrs
	 *            Optional. An array of attribute names. If omitted, all
	 *            attribute values are returned. If set to true, all attributes
	 *            modified from their initial values are returned.
	 * @return An object with attribute name/value pairs.
	 */
	public final native JsObject getAttrs()/*-{
		return this.getAttrs();
	}-*/;

	/**
	 * Gets multiple attribute values.
	 * 
	 * @param attrs
	 *            Optional. An array of attribute names. If omitted, all
	 *            attribute values are returned. If set to true, all attributes
	 *            modified from their initial values are returned.
	 * @return An object with attribute name/value pairs.
	 */
	public final native JsObject getAttrs(boolean attrs)/*-{
		return this.getAttrs(attrs);
	}-*/;

	/**
	 * Gets multiple attribute values.
	 * 
	 * @param attrs
	 *            Optional. An array of attribute names. If omitted, all
	 *            attribute values are returned. If set to true, all attributes
	 *            modified from their initial values are returned.
	 * @return An object with attribute name/value pairs.
	 */
	public final native JsObject getAttrs(JsArrayString attrs)/*-{
		return this.getAttrs(attrs);
	}-*/;

	/**
	 * Gets multiple attribute values.
	 * 
	 * @param attrs
	 *            Optional. An array of attribute names. If omitted, all
	 *            attribute values are returned. If set to true, all attributes
	 *            modified from their initial values are returned.
	 * @return An object with attribute name/value pairs.
	 */
	public final native JsObject getAttrs(String[] attrs)/*-{
		return this
				.getAttrs(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(attrs));
	}-*/;

	// /**Subscribe to a custom event hosted by this object. The supplied
	// callback will execute after any listeners add via the subscribe method,
	// and after the default function, if configured for the event, has
	// executed.*/
	// public native final after(String type, )/*-{
	//
	// }-*/;

	public final native JavaScriptObject getObj(String attrName)/*-{
		return this.get(attrName);
	}-*/;

	public final native Node getNode(String attrName)/*-{
		return this.get(attrName);
	}-*/;

	public final native String getString(String attrName)/*-{
		return this.get(attrName) + "" || null;
	}-*/;

	public final native String get(String attrName)/*-{
		return this.get(attrName) + "";
	}-*/;

	public final native double getDouble(String attrName)/*-{
		return this.get(attrName) || 0;
	}-*/;

	public final native int getInt(String attrName)/*-{
		return this.get(attrName) || 0;
	}-*/;

	public final native boolean getBoolean(String attrName)/*-{
		return this.get(attrName) || false;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param val
	 *            The value to set the attribute to.
	 * @return this for chaining methods.
	 */
	public final native Attribute set(String attrName, JavaScriptObject val)/*-{
		this.set(attrName, val)
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param val
	 *            The value to set the attribute to.
	 * @return this for chaining methods.
	 */
	public final native Attribute set(String attrName, String val)/*-{
		this.set(attrName, val)
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param val
	 *            The value to set the attribute to.
	 * @return this for chaining methods.
	 */
	public final native Attribute set(String attrName, double val)/*-{
		this.set(attrName, val)
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param val
	 *            The value to set the attribute to.
	 * @return this for chaining methods.
	 */
	public final native Attribute set(String attrName, int val)/*-{
		this.set(attrName, val); 
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param val
	 *            The value to set the attribute to.
	 * @return this for chaining methods.
	 */
	public final native Attribute set(String attrName, boolean val)/*-{
		this.set(attrName, val); 
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param val
	 *            The value to set the attribute to.
	 * 
	 * @param opts
	 *            (Optional) Optional event data to be mixed into the event
	 *            facade passed to subscribers of the attribute's change event.
	 *            This can be used as a flexible way to identify the source of a
	 *            call to set, allowing the developer to distinguish between set
	 *            called internally by the host, vs. set called externally by
	 *            the application developer.
	 * 
	 * @see http 
	 *      ://yuilibrary.com/yui/docs/api/classes/AttributeEvents.html#method_set
	 * 
	 * @return this for chaining methods.
	 */
	public final native Attribute set(String attrName, JavaScriptObject val, JavaScriptObject opts)/*-{
		this.set(attrName, val, opts); 
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param val
	 *            The value to set the attribute to.
	 * @param opts
	 *            (Optional) Optional event data to be mixed into the event
	 *            facade passed to subscribers of the attribute's change event.
	 *            This can be used as a flexible way to identify the source of a
	 *            call to set, allowing the developer to distinguish between set
	 *            called internally by the host, vs. set called externally by
	 *            the application developer.
	 * 
	 * @see http 
	 *      ://yuilibrary.com/yui/docs/api/classes/AttributeEvents.html#method_set
	 * @return this for chaining methods.
	 */
	public final native Attribute set(String attrName, String val, JavaScriptObject opts)/*-{
		this.set(attrName, val, opts); 
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param val
	 *            The value to set the attribute to.
	 * 
	 * @param opts
	 *            (Optional) Optional event data to be mixed into the event
	 *            facade passed to subscribers of the attribute's change event.
	 *            This can be used as a flexible way to identify the source of a
	 *            call to set, allowing the developer to distinguish between set
	 *            called internally by the host, vs. set called externally by
	 *            the application developer.
	 * 
	 * @see http 
	 *      ://yuilibrary.com/yui/docs/api/classes/AttributeEvents.html#method_set
	 * @return this for chaining methods.
	 */
	public final native Attribute set(String attrName, double val, JavaScriptObject opts)/*-{
		this.set(attrName, val, opts); 
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param val
	 *            The value to set the attribute to.
	 * 
	 * @param opts
	 *            (Optional) Optional event data to be mixed into the event
	 *            facade passed to subscribers of the attribute's change event.
	 *            This can be used as a flexible way to identify the source of a
	 *            call to set, allowing the developer to distinguish between set
	 *            called internally by the host, vs. set called externally by
	 *            the application developer.
	 * 
	 * @see http 
	 *      ://yuilibrary.com/yui/docs/api/classes/AttributeEvents.html#method_set
	 * @return this for chaining methods.
	 */
	public final native Attribute set(String attrName, int val, JavaScriptObject opts)/*-{
		this.set(attrName, val, opts); 
		return this;
	}-*/;

	/**
	 * Sets the value of an attribute.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param val
	 *            The value to set the attribute to.
	 * 
	 * @param opts
	 *            (Optional) Optional event data to be mixed into the event
	 *            facade passed to subscribers of the attribute's change event.
	 *            This can be used as a flexible way to identify the source of a
	 *            call to set, allowing the developer to distinguish between set
	 *            called internally by the host, vs. set called externally by
	 *            the application developer.
	 * 
	 * @see http 
	 *      ://yuilibrary.com/yui/docs/api/classes/AttributeEvents.html#method_set
	 * @return this for chaining methods.
	 */
	public final native Attribute set(String attrName, boolean val, JavaScriptObject opts)/*-{
		this.set(attrName, val, opts);
		return this;
	}-*/;

	/**
	 * Sets multiple attribute values.
	 * 
	 * @param attrs
	 *            An object with attributes name/value pairs.
	 * @return this for chaining methods.
	 */
	public final native Attribute setAttrs(JavaScriptObject attrs)/*-{
		this.setAttrs(attrs);
		return this;
	}-*/;

	/**
	 * Sets multiple attribute values.
	 * 
	 * @param attrs
	 *            An object with attributes name/value pairs.
	 * 
	 * @param Properties
	 *            to mix into the event payload. These are shared and mixed into
	 *            each set
	 * @return this for chaining methods.
	 * @see http 
	 *      ://yuilibrary.com/yui/docs/api/classes/AttributeEvents.html#method_set
	 */
	public final native Attribute setAttrs(JavaScriptObject attrs, JavaScriptObject opts)/*-{
		this.setAttrs(attrs, opts);
		return this;
	}-*/;

	/**
	 * Sets the value of an array attribute's single item. internally it
	 * performs
	 * 
	 * <pre>
	 * this.get(attrName)[index] = value;
	 * </pre>
	 * 
	 * This call will not trigger any event.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param index
	 *            - the array index to set the value
	 * @param val
	 *            The value to set the attribute array item to.
	 * @return this for chaining methods.
	 */
	public final native Attribute setArrayItem(String attrName, int index, int value)/*-{
		this.get(attrName)[index] = value;
		return this;
	}-*/;

	/**
	 * Sets the value of an array attribute's single item. internally it
	 * performs
	 * 
	 * <pre>
	 * this.get(attrName)[index] = value;
	 * </pre>
	 * 
	 * This call will not trigger any event.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param index
	 *            - the array index to set the value
	 * @param val
	 *            The value to set the attribute array item to.
	 * @return this for chaining methods.
	 */
	public final native Attribute setArrayItem(String attrName, int index, String value)/*-{
		this.get(attrName)[index] = value;
		return this;
	}-*/;

	/**
	 * Sets the value of an array attribute's single item. internally it
	 * performs
	 * 
	 * <pre>
	 * this.get(attrName)[index] = value;
	 * </pre>
	 * 
	 * This call will not trigger any event.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param index
	 *            - the array index to set the value
	 * @param val
	 *            The value to set the attribute array item to.
	 * @return this for chaining methods.
	 */
	public final native Attribute setArrayItem(String attrName, int index, double value)/*-{
		this.get(attrName)[index] = value;
		return this;
	}-*/;

	/**
	 * Sets the value of an array attribute's single item. internally it
	 * performs
	 * 
	 * <pre>
	 * this.get(attrName)[index] = value;
	 * </pre>
	 * 
	 * This call will not trigger any event.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param index
	 *            - the array index to set the value
	 * @param val
	 *            The value to set the attribute array item to.
	 * @return this for chaining methods.
	 */
	public final native Attribute setArrayItem(String attrName, int index, boolean value)/*-{
		this.get(attrName)[index] = value;
		return this;
	}-*/;

	/**
	 * Sets the value of an array attribute's single item. internally it
	 * performs
	 * 
	 * <pre>
	 * this.get(attrName)[index] = value;
	 * </pre>
	 * 
	 * This call will not trigger any event.
	 * 
	 * @param attrName
	 *            The name of the attribute. If the current value of the
	 *            attribute is an Object, dot notation can be used to set the
	 *            value of a property within the object (e.g. set("x.y.z", 5)).
	 * @param index
	 *            - the array index to set the value
	 * @param val
	 *            The value to set the attribute array item to.
	 * @return this for chaining methods.
	 */
	public final native Attribute setArrayItem(String attrName, int index, JavaScriptObject value)/*-{
		this.get(attrName)[index] = value;
		return this;
	}-*/;

}
