package org.sgx.yuigwt.yui.base;

import org.sgx.yuigwt.yui.attr.Attribute;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.yui.PluginBase;

/**
 * A base class which objects requiring attributes and custom event support can
 * extend. Base also handles the chaining of initializer and destructor methods
 * across the hierarchy as part of object construction and destruction.
 * Additionally, attributes configured through the static Attrs property for
 * each class in the hierarchy will be initialized by Base. The static NAME
 * property of each class extending from Base will be used as the identifier for
 * the class, and is used by Base to prefix all events fired by instances of
 * that class.
 * 
 * <br/><br/>
 * Base also contain methods of http://yuilibrary.com/yui/docs/api/classes/Plugin.Host.html
 * 
 * @author sg
 * 
 */
public class Base extends Attribute {
	protected Base() {
	}
	/**
	 * Lifecycle event for the destroy phase, fired prior to destruction. Invoking the preventDefault method on the event object provided to subscribers will prevent destruction from proceeding. Subscribers to the "after" moment of this event, will be notified after destruction is complete (and as a result cannot prevent destruction).
	 */
	public static final String EVENT_INIT="init";
	/**
	 * Lifecycle event for the init phase, fired prior to initialization. Invoking the preventDefault() method on the event object provided to subscribers will prevent initialization from occuring.Subscribers to the "after" momemt of this event, will be notified after initialization of the object is complete (and therefore cannot prevent initialization).
	 */
	public static final String EVENT_DESTROY="destroy"; 
	/**
	 * Destroy lifecycle method. Fires the destroy event, prior to invoking
	 * destructors for the class hierarchy. Subscribers to the destroy event can
	 * invoke preventDefault on the event object, to prevent destruction from
	 * proceeding.
	 * 
	 * @return
	 */
	public native final Base destroy()/*-{
		this.destroy
		return this;
	}-*/;

	/**
	 * Flag indicating whether or not this object has been through the init
	 * lifecycle phase.
	 * 
	 * @return
	 */
	public native final boolean initialized() /*-{
		return this.initialized;
	}-*/;

	/**
	 * Flag indicating whether or not this object has been through the init
	 * lifecycle phase.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Base initialized(boolean val) /*-{
		this.initialized = val;
		return this;
	}-*/;

	/**
	 *Adds a plugin to the host object. This will instantiate the plugin and attach it to the configured namespace on the host object.
	 * @see http://yuilibrary.com/yui/docs/api/classes/Plugin.Host.html#method_plug
	 * @param p 
	 * @return A reference to the host object 
	 */
	public native final Base plug(PluginBase p)/*-{
		return this.plug(p);
	}-*/;

	/**
	 * Registers plugins to be instantiated at the class level (plugins which
	 * should be plugged into every instance of Node by default).
	 * 
	 * @param p
	 * @return A reference to the host object 
	 */
	public native final Base plug(PluginBase p, BaseConfig config)/*-{
		return this.plug(p, config);
	}-*/;

	/**
	 * Unregisters any class level plugins which have been registered by the
	 * Node
	 * @see http://yuilibrary.com/yui/docs/api/classes/Plugin.Host.html#method_uplug
	 * @param p
	 * @return A reference to the host object 
	 */
	public native final Base unplug(PluginBase p)/*-{
		return this.unplug(p); 
	}-*/;
	
	/**
	 * artificial java method for getting the plugin object. The yui plugin object is added as one host object property 
	 * @param pluginName
	 * @return the pluginobject with that name or null
	 */
	public native final PluginBase getPlugin(String pluginName)/*-{
		return this[pluginName] || null; 
	}-*/;
}
