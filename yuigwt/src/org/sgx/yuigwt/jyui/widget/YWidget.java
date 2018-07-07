package org.sgx.yuigwt.jyui.widget;

import org.sgx.yuigwt.jyui.base.YBase;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.Widget;

import com.google.gwt.core.client.JavaScriptObject;

public class YWidget extends YBase {

	public YWidget(YuiContext y) {
		super(y);
	}

	public Widget _wrappedWidget() {
		return _wrapped.cast();
	}
	/**
	 * meant to be ovewrritten by subclasses - add custom renderization after wrapped widget is rendered. 
	 */
	public void afterRender() {
		
	}
	
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#render()
	 */
	public Widget render() {
		Widget ret = _wrappedWidget().render();
		afterRender(); 
		return ret; 
	}

	/**
	 * @param parentNode
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#render(org.sgx.yuigwt.yui.node.Node)
	 */
	public Widget render(Node parentNode) {
		Widget ret = _wrappedWidget().render(parentNode);
		afterRender(); 
		return ret; 
	}

	/**
	 * @param parentNode
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#render(java.lang.String)
	 */
	public Widget render(String parentNode) {
		Widget ret = _wrappedWidget().render(parentNode);
		afterRender(); 
		return ret; 
//		return _wrappedWidget().render(parentNode);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#blur()
	 */
	public Widget blur() {
		return _wrappedWidget().blur();
	}

	/**
	 * @param deepth
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#ancestor(int)
	 */
	public Widget ancestor(int deepth) {
		return _wrappedWidget().ancestor(deepth);
	}

	/**
	 * @param destroyAllNodes
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#destroy(boolean)
	 */
	public Widget destroy(boolean destroyAllNodes) {
		return _wrappedWidget().destroy(destroyAllNodes);
	}

	/**
	 * @return
	 * @see com.google.gwt.core.client.JavaScriptObject#toSource()
	 */
	public String toSource() {
		return _wrappedWidget().toSource();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#disable()
	 */
	public Widget disable() {
		return _wrappedWidget().disable();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#enable()
	 */
	public Widget enable() {
		return _wrappedWidget().enable();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#hide()
	 */
	public Widget hide() {
		return _wrappedWidget().hide();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#focus()
	 */
	public Widget focus() {
		return _wrappedWidget().focus();
	}

	/**
	 * @param a
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#getClassName(java.lang.String)
	 */
	public String getClassName(String a) {
		return _wrappedWidget().getClassName(a);
	}

	/**
	 * @param a
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#getClassName(java.lang.String[])
	 */
	public String getClassName(String... a) {
		return _wrappedWidget().getClassName(a);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#getDefaultLocale()
	 */
	public String getDefaultLocale() {
		return _wrappedWidget().getDefaultLocale();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#getSkinName()
	 */
	public String getSkinName() {
		return _wrappedWidget().getSkinName();
	}

	/**
	 * @param key
	 * @param locale
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#getString(java.lang.String,
	 *      java.lang.String)
	 */
	public String getString(String key, String locale) {
		return _wrappedWidget().getString(key, locale);
	}

	/**
	 * @param locale
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#getStrings(java.lang.String)
	 */
	public JavaScriptObject getStrings(String locale) {
		return _wrappedWidget().getStrings(locale);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#getStrings()
	 */
	public JavaScriptObject getStrings() {
		return _wrappedWidget().getStrings();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#isRoot()
	 */
	public boolean isRoot() {
		return _wrappedWidget().isRoot();
	}

	/**
	 * @param circular
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#next(boolean)
	 */
	public Widget next(boolean circular) {
		return _wrappedWidget().next(circular);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#next()
	 */
	public Widget next() {
		return _wrappedWidget().next();
	}

	/**
	 * @param circular
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#previous(boolean)
	 */
	public Widget previous(boolean circular) {
		return _wrappedWidget().previous(circular);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#previous()
	 */
	public Widget previous() {
		return _wrappedWidget().previous();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#show()
	 */
	public Widget show() {
		return _wrappedWidget().show();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#toString_()
	 */
	public String toString() {
		return _wrappedWidget().toString_();
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#contentBox()
	 */
	public Node contentBox() {
		return _wrappedWidget().contentBox();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#contentBox(org.sgx.yuigwt.yui.node.Node)
	 */
	public Widget contentBox(Node val) {
		return _wrappedWidget().contentBox(val);
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#contentBox(java.lang.String)
	 */
	public Widget contentBox(String val) {
		return _wrappedWidget().contentBox(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#boundingBox()
	 */
	public Node boundingBox() {
		return _wrappedWidget().boundingBox();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#boundingBox(org.sgx.yuigwt.yui.node.Node)
	 */
	public Widget boundingBox(Node val) {
		return _wrappedWidget().boundingBox(val);
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#boundingBox(java.lang.String)
	 */
	public Widget boundingBox(String val) {
		return _wrappedWidget().boundingBox(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#destroyed()
	 */
	public boolean destroyed() {
		return _wrappedWidget().destroyed();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#destroyed(boolean)
	 */
	public Widget destroyed(boolean val) {
		return _wrappedWidget().destroyed(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#disabled()
	 */
	public boolean disabled() {
		return _wrappedWidget().disabled();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#disabled(boolean)
	 */
	public Widget disabled(boolean val) {
		return _wrappedWidget().disabled(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#focused()
	 */
	public boolean focused() {
		return _wrappedWidget().focused();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#focused(boolean)
	 */
	public Widget focused(boolean val) {
		return _wrappedWidget().focused(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#height()
	 */
	public String height() {
		return _wrappedWidget().height();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#height(java.lang.String)
	 */
	public Widget height(String val) {
		return _wrappedWidget().height(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#id()
	 */
	public String id() {
		return _wrappedWidget().id();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#id(java.lang.String)
	 */
	public Widget id(String val) {
		return _wrappedWidget().id(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#rendered()
	 */
	public boolean rendered() {
		return _wrappedWidget().rendered();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#rendered(boolean)
	 */
	public Widget rendered(boolean val) {
		return _wrappedWidget().rendered(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#srcNode()
	 */
	public Node srcNode() {
		return _wrappedWidget().srcNode();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#srcNode(org.sgx.yuigwt.yui.node.Node)
	 */
	public Widget srcNode(Node val) {
		return _wrappedWidget().srcNode(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#strings()
	 */
	public JavaScriptObject strings() {
		return _wrappedWidget().strings();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#strings(com.google.gwt.core.client.JavaScriptObject)
	 */
	public Widget strings(JavaScriptObject val) {
		return _wrappedWidget().strings(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#tabIndex()
	 */
	public int tabIndex() {
		return _wrappedWidget().tabIndex();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#tabIndex(int)
	 */
	public Widget tabIndex(int val) {
		return _wrappedWidget().tabIndex(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#visible()
	 */
	public boolean visible() {
		return _wrappedWidget().visible();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#visible(boolean)
	 */
	public Widget visible(boolean val) {
		return _wrappedWidget().visible(val);
	}

	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#width()
	 */
	public String width() {
		return _wrappedWidget().width();
	}

	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.widget.Widget#width(java.lang.String)
	 */
	public Widget width(String val) {
		return _wrappedWidget().width(val);
	}

}
