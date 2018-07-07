package org.sgx.yuigwt.yui.yui;

import org.sgx.yuigwt.yui.base.Base;
/**
 * this class represent yui plugins, this is functions like Y.plugin.NodeMenuNav. 
 * Base.plug() and Base.unplug() for installing/uninstalling plugins.
 * 
 * Note: we extend base here because many plugins extend Base like Editor BidiPlugin http://yuilibrary.com/yui/docs/api/classes/Plugin.EditorBidi.html
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Plugin.Base.html
 * @author sg
 *
 */
public class PluginBase extends Base {
protected PluginBase(){}

/**
 * Destructor lifecycle implementation. Removes any event listeners or injected methods applied by the Plugin
 * @return self for method chaining
 */
public native final PluginBase destructor() /*-{
this.destructor(); 
return this; 
}-*/;

/**
 * Initializer lifecycle implementation.
 * @return self for method chaining
 */
public native final PluginBase initializer(PluginBaseConfig config) /*-{
this.initializer(config); 
return this; 
}-*/;

//attrs
/**
 * The plugin's host object.
 * @return the attribute
 */
public final native Base host()/*-{
return this.get("host");
}-*/;

/**
 * The plugin's host object.
 * @param val
 * @return self for method chaining
 */
public final native PluginBase host(Base val)/*-{
this.set("host", val);
return this; 
}-*/;
}
