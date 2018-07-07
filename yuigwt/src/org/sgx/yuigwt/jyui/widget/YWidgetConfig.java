package org.sgx.yuigwt.jyui.widget;

import org.sgx.yuigwt.jyui.event.YEventTargetConfig;
import org.sgx.yuigwt.yui.attr.AttributeConfig;
import org.sgx.yuigwt.yui.base.BaseConfig;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.WidgetConfig;
import org.sgx.yuigwt.yui.yui.PluginBase;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 100% Java wrapper for type org.sgx.yuigwt.yui.attr.AttributeConfig
 * 
 * @author sg
 * 
 */
public class YWidgetConfig extends YEventTargetConfig {
	public YWidgetConfig() {
		super();
	}

	public WidgetConfig _wrappedWidgetConfig() {
		return _wrapped.cast();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.base.BaseConfig#destroyed()
	 */
	public boolean destroyed() {
		return _wrappedWidgetConfig().destroyed();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#boundingBox()
	 */
	public Node boundingBox() {
		return _wrappedWidgetConfig().boundingBox();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.base.BaseConfig#destroyed(boolean)
	 */
	public BaseConfig destroyed(boolean val) {
		return _wrappedWidgetConfig().destroyed(val);
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#boundingBox(org.sgx.yuigwt.yui.node.Node)
	 */
	public WidgetConfig boundingBox(Node val) {
		return _wrappedWidgetConfig().boundingBox(val);
	}

	/**
	 * @param plugins
	 * @return
	 * @see org.sgx.yuigwt.yui.base.BaseConfig#plugins(org.sgx.yuigwt.yui.yui.PluginBase[])
	 */
	public BaseConfig plugins(PluginBase[] plugins) {
		return _wrappedWidgetConfig().plugins(plugins);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#srcNode()
	 */
	public Node srcNode() {
		return _wrappedWidgetConfig().srcNode();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#srcNode(org.sgx.yuigwt.yui.node.Node)
	 */
	public WidgetConfig srcNode(Node val) {
		return _wrappedWidgetConfig().srcNode(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#srcNodeString()
	 */
	public String srcNodeString() {
		return _wrappedWidgetConfig().srcNodeString();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#srcNode(java.lang.String)
	 */
	public WidgetConfig srcNode(String val) {
		return _wrappedWidgetConfig().srcNode(val);
	}

	/**
	 * @param plugin
	 * @return
	 * @see org.sgx.yuigwt.yui.base.BaseConfig#plugins(org.sgx.yuigwt.yui.yui.PluginBase)
	 */
	public BaseConfig plugins(PluginBase plugin) {
		return _wrappedWidgetConfig().plugins(plugin);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#strings()
	 */
	public JavaScriptObject strings() {
		return _wrappedWidgetConfig().strings();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#strings(com.google.gwt.core.client.JavaScriptObject)
	 */
	public WidgetConfig strings(JavaScriptObject val) {
		return _wrappedWidgetConfig().strings(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#id()
	 */
	public String id() {
		return _wrappedWidgetConfig().id();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#id(java.lang.String)
	 */
	public WidgetConfig id(String val) {
		return _wrappedWidgetConfig().id(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#disabled()
	 */
	public boolean disabled() {
		return _wrappedWidgetConfig().disabled();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#disabled(boolean)
	 */
	public WidgetConfig disabled(boolean val) {
		return _wrappedWidgetConfig().disabled(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#focused()
	 */
	public boolean focused() {
		return _wrappedWidgetConfig().focused();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#focused(boolean)
	 */
	public WidgetConfig focused(boolean val) {
		return _wrappedWidgetConfig().focused(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#height()
	 */
	public String height() {
		return _wrappedWidgetConfig().height();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#height(java.lang.String)
	 */
	public WidgetConfig height(String val) {
		return _wrappedWidgetConfig().height(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#width()
	 */
	public String width() {
		return _wrappedWidgetConfig().width();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#width(java.lang.String)
	 */
	public WidgetConfig width(String val) {
		return _wrappedWidgetConfig().width(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#render()
	 */
	public Node render() {
		return _wrappedWidgetConfig().render();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#render(org.sgx.yuigwt.yui.node.Node)
	 */
	public WidgetConfig render(Node val) {
		return _wrappedWidgetConfig().render(val);
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#render(java.lang.String)
	 */
	public WidgetConfig render(String val) {
		return _wrappedWidgetConfig().render(val);
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.WidgetConfig#render(boolean)
	 */
	public WidgetConfig render(boolean val) {
		return _wrappedWidgetConfig().render(val);
	}

}
