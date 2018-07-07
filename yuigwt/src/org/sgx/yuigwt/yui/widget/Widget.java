package org.sgx.yuigwt.yui.widget;

import org.sgx.yuigwt.yui.base.Base;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * <p>
 * A base class for widgets, providing:
 * </p>
 * 
 * <ul>
 * <li>The render lifecycle method, in addition to the init and destroy
 * lifecycle methods provide by Base</li>
 * <li>Abstract methods to support consistent MVC structure across widgets:
 * renderer, renderUI, bindUI, syncUI</li>
 * <li>Support for common widget attributes, such as boundingBox, contentBox,
 * visible, disabled, focused, strings</li>
 * </ul>
 * 
 * @author sg
 * 
 */
public class Widget extends Base {
	protected Widget() {
	}

	// EVENT NAMES

	/**
	 * Notification event, which widget implementations can fire, when they
	 * change the content of the widget. This event has no default behavior and
	 * cannot be prevented, so the "on" or "after" moments are effectively
	 * equivalent (with on listeners being invoked before after listeners).
	 */
	public static final String EVENT_WIDGET_CONTENTUPDATE = "widget:contentUpdate";

	/**
	 * Lifecycle event for the render phase, fired prior to rendering the UI for
	 * the widget (prior to invoking the widget's renderer method). Subscribers
	 * to the "on" moment of this event, will be notified before the widget is
	 * rendered. Subscribers to the "after" moment of this event, will be
	 * notified after rendering is complete.
	 */
	public static final String EVENT_WIDGET_RENDER = "widget:render";

	// ATTRIBUTE NAMES

	/**
	 * A DOM node that is a direct descendant of a Widget's bounding box that
	 * houses its content.
	 */
	public static final String ATTR_CONTENTBOX = "contentBox";
	/**
	 * The outermost DOM node for the Widget, used for sizing and positioning of
	 * a Widget as well as a containing element for any decorator elements used
	 * for skinning.
	 */
	public static final String ATTR_BOUNDINGBOX = "boundingBox";
	/**
	 * The outermost DOM node for the Widget, used for sizing and positioning of
	 * a Widget as well as a containing element for any decorator elements used
	 * for skinning.
	 */
	public static final String ATTR_DESTROYED = "destroyed";

	// METHODS

	/**
	 * <p>
	 * Establishes the initial DOM for the widget. Invoking this method will
	 * lead to the creating of all DOM elements for the widget (or the
	 * manipulation of existing DOM elements for the progressive enhancement use
	 * case). This method should only be invoked once for an initialized widget.
	 * </p>
	 * 
	 * <p>
	 * It delegates to the widget specific renderer method to do the actual
	 * work.
	 * </p>
	 * 
	 * @return this for method chaining.
	 */
	public final native Widget render()/*-{
		this.render();
		return this;
	}-*/;

	/**
	 * Fires the renderView event, delegating UI updates to the configured View.
	 * 
	 * @return
	 */
	public final native Widget syncUI()/*-{
		this.syncUI();
		return this;
	}-*/;

	/**
	 * <p>
	 * Establishes the initial DOM for the widget. Invoking this method will
	 * lead to the creating of all DOM elements for the widget (or the
	 * manipulation of existing DOM elements for the progressive enhancement use
	 * case).
	 * </p>
	 * 
	 * <p>
	 * This method should only be invoked once for an initialized widget.
	 * </p>
	 * 
	 * <p>
	 * It delegates to the widget specific renderer method to do the actual
	 * work.
	 * </p>
	 * 
	 * @param parentNode
	 *            The Node under which the Widget is to be rendered. This can be
	 *            a Node instance or a CSS selector string.
	 * @return this for method chaining.
	 */
	public final native Widget render(Node parentNode)/*-{
		this.render(parentNode);
		return this;
	}-*/;
	
//	/**
//	 * <p>
//	 * Establishes the initial DOM for the widget. Invoking this method will
//	 * lead to the creating of all DOM elements for the widget (or the
//	 * manipulation of existing DOM elements for the progressive enhancement use
//	 * case).
//	 * </p>
//	 * 
//	 * <p>
//	 * This method should only be invoked once for an initialized widget.
//	 * </p>
//	 * 
//	 * <p>
//	 * It delegates to the widget specific renderer method to do the actual
//	 * work.
//	 * </p>
//	 * 
//	 * @param parentNode
//	 *            The Node under which the Widget is to be rendered. This can be
//	 *            a Node instance or a CSS selector string.
//	 * @return this for method chaining.
//	 */
//	public final native Widget render(Element parentNode)/*-{
//		this.render(parentNode);
//		return this;
//	}-*/;

//	/**
//	 * <p>
//	 * For integration with GWT Widget.
//	 * </p>
//	 * 
//	 * <p>
//	 * Establishes the initial DOM for the widget. Invoking this method will
//	 * lead to the creating of all DOM elements for the widget (or the
//	 * manipulation of existing DOM elements for the progressive enhancement use
//	 * case).
//	 * </p>
//	 * 
//	 * <p>
//	 * This method should only be invoked once for an initialized widget.
//	 * </p>
//	 * 
//	 * <p>
//	 * It delegates to the widget specific renderer method to do the actual
//	 * work.
//	 * </p>
//	 * 
//	 * @param parentNode
//	 *            The Node under which the Widget is to be rendered. This can be
//	 *            a Node instance or a CSS selector string.
//	 * @return this for method chaining.
//	 */
//	public final native Widget render(com.google.gwt.user.client.ui.Widget parent)/*-{
//		var el = parent.@com.google.gwt.user.client.ui.Widget::getElement();
//		this.render(el);
//		return this;
//	}-*/;

	/**
	 * Establishes the initial DOM for the widget. Invoking this method will
	 * lead to the creating of all DOM elements for the widget (or the
	 * manipulation of existing DOM elements for the progressive enhancement use
	 * case). This method should only be invoked once for an initialized widget.
	 * It delegates to the widget specific renderer method to do the actual
	 * work.
	 * 
	 * @param parentNode
	 *            The Node under which the Widget is to be rendered. This can be
	 *            a Node instance or a CSS selector string.
	 * @return this for method chaining.
	 */
	public final native Widget render(String parentNode)/*-{
		this.render(parentNode);
		return this;
	}-*/;

	/**
	 * Causes the Widget to lose focus by setting the "focused" attribute to
	 * "false"
	 * 
	 * @return this for chainable method calling.
	 */
	public final native Widget blur()/*-{
		this.blur();
		return this;
	}-*/;

	public final native Widget ancestor(int deepth)/*-{
		return this.ancestor(deepth);
	}-*/;

	/**
	 * Destroy lifecycle method. Fires the destroy event, prior to invoking
	 * destructors for the class hierarchy. Overrides Base's implementation, to
	 * support arguments to destroy. Subscribers to the destroy event can invoke
	 * preventDefault on the event object, to prevent destruction from
	 * proceeding.
	 * 
	 * @param destroyAllNodes
	 *            If true, all nodes contained within the Widget are removed and
	 *            destroyed. Defaults to false due to potentially high run-time
	 *            cost.
	 * @return this widget for method chaining
	 */
	public final native Widget destroy(boolean destroyAllNodes)/*-{
		this.destroy(destroyAllNodes);
		return this;
	}-*/;

	/**
	 * Set the Widget's "disabled" attribute to "true".
	 * 
	 * @return this widget for method chaining
	 */
	public final native Widget disable()/*-{
		this.disable();
		return this;
	}-*/;

	/**
	 * Set the Widget's "disabled" attribute to "false".
	 * 
	 * @return this widget for method chaining
	 */
	public final native Widget enable()/*-{
		this.enable();
		return this;
	}-*/;

	/**
	 * Hides the Widget by setting the "visible" attribute to "false".
	 * 
	 * @return self for method chaining.
	 */
	public final native Widget hide()/*-{
		this.hide();
		return this;
	}-*/;

	/**
	 * Causes the Widget to receive the focus by setting the "focused" attribute
	 * to "true".
	 * 
	 * @return
	 */
	public final native Widget focus()/*-{
		this.focus();
		return true;
	}-*/;

	/**
	 * Returns a class name prefixed with the the value of the
	 * YUI.config.classNamePrefix attribute + the instances NAME property. Uses
	 * YUI.config.classNameDelimiter attribute to delimit the provided strings.
	 * e.g.
	 * 
	 * <pre>
	 * 	   // returns "yui-slider-foo-bar", for a slider instance
	 * 	   var scn = slider.getClassName('foo','bar');
	 * 	
	 * 	   // returns "yui-overlay-foo-bar", for an overlay instance
	 * 	   var ocn = overlay.getClassName('foo','bar');
	 * </pre>
	 * 
	 * @param a
	 *            One or more classname bits to be joined and prefixed
	 * @return
	 */
	public final native String getClassName(String a)/*-{
		return this.getClassName(a);
	}-*/;

	/**
	 * Generate a standard prefixed classname for the Widget, prefixed by the
	 * default prefix defined by the Y.config.classNamePrefix attribute used by
	 * ClassNameManager and Widget.NAME.toLowerCase() (e.g.
	 * "yui-widget-xxxxx-yyyyy", based on default values for the prefix and
	 * widget class name). The instance based version of this method can be used
	 * to generate standard prefixed classnames, based on the instances NAME, as
	 * opposed to Widget.NAME. This method should be used when you need to use a
	 * constant class name across different types instances.
	 * 
	 * @param a
	 *            0..n strings which should be concatenated, using the default
	 *            separator defined by ClassNameManager, to create the class
	 *            name
	 * @return
	 */
	public final native String getClassName(String... a)/*-{
		return this.getClassName
				.apply(this,
						@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(a));
	}-*/;

	/**
	 * Returns the default locale for the widget (the locale value defined by
	 * the widget class, or provided by the user during construction).
	 * 
	 * @return The default locale for the widget
	 */
	public final native String getDefaultLocale()/*-{
		return this.getDefaultLocale();
	}-*/;

	/**
	 * Returns the name of the skin that's currently applied to the widget. This
	 * is only really useful after the widget's DOM structure is in the
	 * document, either by render or by progressive enhancement. Searches up the
	 * Widget's ancestor axis for a class yui3-skin-(name), and returns the
	 * (name) portion. Otherwise, returns null.
	 * 
	 * @return the name of the skin, or null (yui3-skin-sam => sam)
	 */
	public final native String getSkinName()/*-{
		return this.getSkinName();
	}-*/;

	/**
	 * Gets the string for a particular key, for a particular locale, performing
	 * locale lookup. If no values if defined for the key, for the given locale,
	 * the value for the default locale (in initial locale set for the class) is
	 * returned.
	 * 
	 * @param key
	 *            The key.
	 * @param locale
	 *            (optional) The locale for which the string value is required.
	 *            Defaults to the current locale, if not provided.
	 * @return
	 */
	public final native String getString(String key, String locale)/*-{
		return this.getString(key, locale);
	}-*/;

	// /**
	// * Gets the string for a particular key, for a particular locale,
	// performing locale lookup. If no values if defined for the key, for the
	// given locale, the value for the default locale (in initial locale set for
	// the class) is returned.
	// * @param key The key.
	// * @return
	// */
	// public final native String getString(String key)/*-{
	// return this.getString(key);
	// }-*/;
	/**
	 * Gets the entire strings hash for a particular locale, performing locale
	 * lookup. If no values of the key are defined for a particular locale the
	 * value for the default locale (in initial locale set for the class) is
	 * returned.
	 * 
	 * @param locale
	 *            (optional) The locale for which the string value is required.
	 *            Defaults to the current locale, if not provided.
	 * @return
	 */
	public final native JavaScriptObject getStrings(String locale)/*-{
		return this.getString(locale);
	}-*/;

	/**
	 * Gets the entire strings hash for a particular locale, performing locale
	 * lookup. If no values of the key are defined for a particular locale the
	 * value for the default locale (in initial locale set for the class) is
	 * returned.
	 * 
	 * @return
	 */
	public final native JavaScriptObject getStrings()/*-{
		return this.getString();
	}-*/;

	/**
	 * Determines if the Widget is the root Widget in the object hierarchy.
	 * 
	 * @return Boolean indicating if Widget is the root Widget in the object
	 *         hierarchy.
	 */
	public final native boolean isRoot()/*-{
		return this.isRoot();
	}-*/;

	/**
	 * Returns the Widget's next sibling.
	 * 
	 * @param circular
	 *            Boolean indicating if the parent's first child should be
	 *            returned if the child has no next sibling.
	 * @return Widget instance.
	 */
	public final native Widget next(boolean circular)/*-{
		return this.next(circular);
	}-*/;

	/**
	 * Returns the Widget's next sibling.
	 * 
	 * @return Widget instance.
	 */
	public final native Widget next()/*-{
		return this.next(false);
	}-*/;

	/**
	 * Returns the Widget's previous sibling.
	 * 
	 * @param circular
	 *            Boolean indicating if the parent's last child should be
	 *            returned if the child has no previous sibling.
	 * @return Widget instance.
	 */
	public final native Widget previous(boolean circular)/*-{
		return this.next(circular);
	}-*/;

	/**
	 * Returns the Widget's previous sibling.
	 * 
	 * @return Widget instance.
	 */
	public final native Widget previous()/*-{
		return this.next(false);
	}-*/;

	/**
	 * Shows the Widget by setting the "visible" attribute to "true".
	 * 
	 * @return
	 */
	public final native Widget show()/*-{
		this.show();
		return this;
	}-*/;

	/**
	 * Generic toString implementation for all widgets.
	 * 
	 * @return The default string value for the widget [ displays the NAME of
	 *         the instance, and the unique id ]
	 */
	public final native String toString_()/*-{
		return this.toString();
	}-*/;

	// ATTRIBUTE ACCESSORS
	/**
	 * A DOM node that is a direct descendant of a Widget's bounding box that
	 * houses its content.
	 * 
	 * @return
	 */
	public final native Node contentBox()/*-{
		return this.get("contentBox");
	}-*/;

	/**
	 * A DOM node that is a direct descendant of a Widget's bounding box that
	 * houses its content.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget contentBox(Node val)/*-{
		this.set("contentBox", val);
		return this;
	}-*/;

	/**
	 * A DOM node that is a direct descendant of a Widget's bounding box that
	 * houses its content.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget contentBox(String val)/*-{
		this.set("contentBox", val);
		return this;
	}-*/;

	/**
	 * The outermost DOM node for the Widget, used for sizing and positioning of
	 * a Widget as well as a containing element for any decorator elements used
	 * for skinning.
	 * 
	 * @return the attribute
	 */
	public final native Node boundingBox()/*-{
		return this.get("boundingBox");
	}-*/;

	/**
	 * The outermost DOM node for the Widget, used for sizing and positioning of
	 * a Widget as well as a containing element for any decorator elements used
	 * for skinning.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget boundingBox(Node val)/*-{
		this.set("boundingBox", val);
		return this;
	}-*/;

	/**
	 * The outermost DOM node for the Widget, used for sizing and positioning of
	 * a Widget as well as a containing element for any decorator elements used
	 * for skinning.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget boundingBox(String val)/*-{
		this.set("boundingBox", val);
		return this;
	}-*/;

	/**
	 * 
	 * @return the attribute
	 */
	public final native boolean destroyed()/*-{
		return this.get("destroyed");
	}-*/;

	/**
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget destroyed(boolean val)/*-{
		this.set("destroyed", val);
		return this;
	}-*/;

	/**
	 * Boolean indicating if the Widget should be disabled. The disabled
	 * implementation is left to the specific classes extending widget.Default:
	 * false
	 * 
	 * @return the attribute
	 */
	public final native boolean disabled()/*-{
		return this.get("disabled");
	}-*/;

	/**
	 * Boolean indicating if the Widget should be disabled. The disabled
	 * implementation is left to the specific classes extending widget.Default:
	 * false
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget disabled(boolean val)/*-{
		this.set("disabled", val);
		return this;
	}-*/;

	/**
	 * Boolean indicating if the Widget, or one of its descendants, has
	 * focus.Default: false
	 * 
	 * @return the attribute
	 */
	public final native boolean focused()/*-{
		return this.get("focused");
	}-*/;

	/**
	 * Boolean indicating if the Widget, or one of its descendants, has
	 * focus.Default: false
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget focused(boolean val)/*-{
		this.set("focused", val);
		return this;
	}-*/;

	/**
	 * String with units, or number, representing the height of the Widget. If a
	 * number is provided, the default unit, defined by the Widgets DEF_UNIT,
	 * property is used. Default: EMPTY_STR
	 * 
	 * @return the attribute
	 */
	public final native String height()/*-{
		return this.get("height");
	}-*/;

	/**
	 * String with units, or number, representing the height of the Widget. If a
	 * number is provided, the default unit, defined by the Widgets DEF_UNIT,
	 * property is used. Default: EMPTY_STR
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget height(String val)/*-{
		this.set("height", val);
		return this;
	}-*/;

	/**
	 * Default: Generated using guid()
	 * 
	 * @return the attribute
	 */
	public final native String id()/*-{
		return this.get("id");
	}-*/;

	/**
	 * Default: Generated using guid()
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget id(String val)/*-{
		this.set("id", val);
		return this;
	}-*/;

	/**
	 * Flag indicating whether or not this Widget has been through the render
	 * lifecycle phase. Default: false
	 * 
	 * @return the attribute
	 */
	public final native boolean rendered()/*-{
		return this.get("rendered");
	}-*/;

	/**
	 * Flag indicating whether or not this Widget has been through the render
	 * lifecycle phase. Default: false
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget rendered(boolean val)/*-{
		this.set("rendered", val);
		return this;
	}-*/;

	/**
	 * The DOM node to parse for configuration values, passed to the Widget's
	 * HTML_PARSER definition
	 * 
	 * @return the attribute
	 */
	public final native Node srcNode()/*-{
		return this.get("srcNode");
	}-*/;

	/**
	 * The DOM node to parse for configuration values, passed to the Widget's
	 * HTML_PARSER definition
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget srcNode(Node val)/*-{
		this.set("srcNode", val);
		return this;
	}-*/;

	/**
	 * Collection of strings used to label elements of the Widget's UI. Default:
	 * null
	 * 
	 * @return the attribute
	 */
	public final native JavaScriptObject strings()/*-{
		return this.get("strings");
	}-*/;

	/**
	 * Collection of strings used to label elements of the Widget's UI. Default:
	 * null
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget strings(JavaScriptObject val)/*-{
		this.set("strings", val);
		return this;
	}-*/;

	/**
	 * DataTypeNumber (between -32767 to 32767) indicating the widget's position
	 * in the default tab flow. The value is used to set the "tabIndex"
	 * attribute on the widget's bounding box. Negative values allow the widget
	 * to receive DOM focus programmatically (by calling the focus method),
	 * while being removed from the default tab flow. A value of null removes
	 * the "tabIndex" attribute from the widget's bounding box. Default: null
	 * 
	 * @return the attribute
	 */
	public final native int tabIndex()/*-{
		return this.get("tabIndex");
	}-*/;

	/**
	 * DataTypeNumber (between -32767 to 32767) indicating the widget's position
	 * in the default tab flow. The value is used to set the "tabIndex"
	 * attribute on the widget's bounding box. Negative values allow the widget
	 * to receive DOM focus programmatically (by calling the focus method),
	 * while being removed from the default tab flow. A value of null removes
	 * the "tabIndex" attribute from the widget's bounding box. Default: null
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget tabIndex(int val)/*-{
		this.set("tabIndex", val);
		return this;
	}-*/;

	/**
	 * Boolean indicating whether or not the Widget is visible. Default: TRUE
	 * 
	 * @return the attribute
	 */
	public final native boolean visible()/*-{
		return this.get("visible");
	}-*/;

	/**
	 * Boolean indicating whether or not the Widget is visible. Default: TRUE
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget visible(boolean val)/*-{
		this.set("visible", val);
		return this;
	}-*/;

	/**
	 * String with units, or number, representing the width of the Widget. If a
	 * number is provided, the default unit, defined by the Widgets DEF_UNIT,
	 * property is used. Default: EMPTY_STR
	 * 
	 * @return the attribute
	 */
	public final native String width()/*-{
		return this.get("width");
	}-*/;

	/**
	 * String with units, or number, representing the width of the Widget. If a
	 * number is provided, the default unit, defined by the Widgets DEF_UNIT,
	 * property is used. Default: EMPTY_STR
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Widget width(String val)/*-{
		this.set("width", val);
		return this;
	}-*/;
	
//	/**
//	 * only for uibinder support
//	 * @param attrName
//	 * @param val
//	 */
//	public final native void _setAttrFromString(String attrName, String val)/*-{
//		
//	}-*/;

}