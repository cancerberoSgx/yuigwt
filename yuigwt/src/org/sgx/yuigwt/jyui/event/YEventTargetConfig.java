package org.sgx.yuigwt.jyui.event;

import org.sgx.yuigwt.jyui.AbstractYObject;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventTargetConfig;
import org.sgx.yuigwt.yui.util.JsArr;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * 100% Java wrapper for type org.sgx.yuigwt.yui.event.EventTargetConfig
 * @author sg
 *
 */
public class YEventTargetConfig extends AbstractYObject {
	public YEventTargetConfig() {
		_wrapped = EventTargetConfig.createObject().cast(); 
	}
	public EventTargetConfig _wrappedEventTargetConfig() {
		return _wrapped.cast(); 
	}


	/**
	 * @param eventType
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#on(java.lang.String, org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public  EventTargetConfig on(String eventType, EventCallback c) {
		return _wrappedEventTargetConfig().on(eventType, c);
	}
	/**
	 * @param eventType
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#after(java.lang.String, org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public  EventTargetConfig after(String eventType, EventCallback c) {
		return _wrappedEventTargetConfig().after(eventType, c);
	}
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#broadcast()
	 */
	public  boolean broadcast() {
		return _wrappedEventTargetConfig().broadcast();
	}
	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#broadcast(boolean)
	 */
	public  EventTargetConfig broadcast(boolean val) {
		return _wrappedEventTargetConfig().broadcast(val);
	}
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#bubbles()
	 */
	public  boolean bubbles() {
		return _wrappedEventTargetConfig().bubbles();
	}
	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#bubbles(boolean)
	 */
	public  EventTargetConfig bubbles(boolean val) {
		return _wrappedEventTargetConfig().bubbles(val);
	}
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#emitFacade()
	 */
	public  boolean emitFacade() {
		return _wrappedEventTargetConfig().emitFacade();
	}
	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#emitFacade(boolean)
	 */
	public  EventTargetConfig emitFacade(boolean val) {
		return _wrappedEventTargetConfig().emitFacade(val);
	}
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#prefix()
	 */
	public  String prefix() {
		return _wrappedEventTargetConfig().prefix();
	}
	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#prefix(java.lang.String)
	 */
	public  EventTargetConfig prefix(String val) {
		return _wrappedEventTargetConfig().prefix(val);
	}
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#fireOnce()
	 */
	public  boolean fireOnce() {
		return _wrappedEventTargetConfig().fireOnce();
	}
	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#fireOnce(boolean)
	 */
	public  EventTargetConfig fireOnce(boolean val) {
		return _wrappedEventTargetConfig().fireOnce(val);
	}
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#async()
	 */
	public  boolean async() {
		return _wrappedEventTargetConfig().async();
	}
	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#async(boolean)
	 */
	public  EventTargetConfig async(boolean val) {
		return _wrappedEventTargetConfig().async(val);
	}
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#preventable()
	 */
	public  boolean preventable() {
		return _wrappedEventTargetConfig().preventable();
	}
	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#preventable(boolean)
	 */
	public  EventTargetConfig preventable(boolean val) {
		return _wrappedEventTargetConfig().preventable(val);
	}
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#queuable()
	 */
	public  boolean queuable() {
		return _wrappedEventTargetConfig().queuable();
	}
	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#queuable(boolean)
	 */
	public  EventTargetConfig queuable(boolean val) {
		return _wrappedEventTargetConfig().queuable(val);
	}
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#silent()
	 */
	public  boolean silent() {
		return _wrappedEventTargetConfig().silent();
	}
	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#silent(boolean)
	 */
	public  EventTargetConfig silent(boolean val) {
		return _wrappedEventTargetConfig().silent(val);
	}
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#monitored()
	 */
	public  boolean monitored() {
		return _wrappedEventTargetConfig().monitored();
	}
	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#monitored(boolean)
	 */
	public  EventTargetConfig monitored(boolean val) {
		return _wrappedEventTargetConfig().monitored(val);
	}
	/**
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#type()
	 */
	public  String type() {
		return _wrappedEventTargetConfig().type();
	}
	/**
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTargetConfig#type(java.lang.String)
	 */
	public  EventTargetConfig type(String val) {
		return _wrappedEventTargetConfig().type(val);
	}
	
	
	//TODO: the delete the following: 
	
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objGetArr(java.lang.Object)
//	 */
//	public  JsArr objGetArr(Object p) {
//		return _wrappedEventTargetConfig().objGetArr(p);
//	}
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objGetObj(java.lang.Object)
//	 */
//	public  JsObject objGetObj(Object p) {
//		return _wrappedEventTargetConfig().objGetObj(p);
//	}
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objGetString(java.lang.Object)
//	 */
//	public  String objGetString(Object p) {
//		return _wrappedEventTargetConfig().objGetString(p);
//	}
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objGetInt(java.lang.Object)
//	 */
//	public  int objGetInt(Object p) {
//		return _wrappedEventTargetConfig().objGetInt(p);
//	}
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objGetDouble(java.lang.Object)
//	 */
//	public  int objGetDouble(Object p) {
//		return _wrappedEventTargetConfig().objGetDouble(p);
//	}
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objTypeof(java.lang.Object)
//	 */
//	public  String objTypeof(Object p) {
//		return _wrappedEventTargetConfig().objTypeof(p);
//	}
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.Object)
//	 */
//	public  Object _(Object p) {
//		return _wrappedEventTargetConfig()._(p);
//	}
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objPut(java.lang.String, java.lang.String)
//	 */
//	public  JsObject objPut(String pname, String val) {
//		return _wrappedEventTargetConfig().objPut(pname, val);
//	}
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objPut(java.lang.String, int)
//	 */
//	public  JsObject objPut(String pname, int val) {
//		return _wrappedEventTargetConfig().objPut(pname, val);
//	}
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objPut(java.lang.String, double)
//	 */
//	public  JsObject objPut(String pname, double val) {
//		return _wrappedEventTargetConfig().objPut(pname, val);
//	}
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objPut(java.lang.String, com.google.gwt.core.client.JavaScriptObject)
//	 */
//	public  JsObject objPut(String pname, JavaScriptObject val) {
//		return _wrappedEventTargetConfig().objPut(pname, val);
//	}
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.String, java.lang.String)
//	 */
//	public  JsObject _(String pname, String val) {
//		return _wrappedEventTargetConfig()._(pname, val);
//	}
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.String, java.lang.Object)
//	 */
//	public  JsObject _(String pname, Object val) {
//		return _wrappedEventTargetConfig()._(pname, val);
//	}
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.String, int)
//	 */
//	public  JsObject _(String pname, int val) {
//		return _wrappedEventTargetConfig()._(pname, val);
//	}
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.String, double)
//	 */
//	public  JsObject _(String pname, double val) {
//		return _wrappedEventTargetConfig()._(pname, val);
//	}
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.String, com.google.gwt.core.client.JavaScriptObject)
//	 */
//	public  JsObject _(String pname, JavaScriptObject val) {
//		return _wrappedEventTargetConfig()._(pname, val);
//	}
//	/**
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objProps()
//	 */
//	public  JsArrayString objProps() {
//		return _wrappedEventTargetConfig().objProps();
//	}
//	/**
//	 * @param printValues
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objDump(boolean)
//	 */
//	public  String objDump(boolean printValues) {
//		return _wrappedEventTargetConfig().objDump(printValues);
//	}
//	/**
//	 * @return
//	 * @see com.google.gwt.core.client.JavaScriptObject#cast()
//	 */
//	public  <T extends JavaScriptObject> T cast() {
//		return _wrappedEventTargetConfig().cast();
//	}
//	/**
//	 * @param other
//	 * @return
//	 * @see com.google.gwt.core.client.JavaScriptObject#equals(java.lang.Object)
//	 */
//	public  boolean equals(Object other) {
//		return _wrappedEventTargetConfig().equals(other);
//	}
//	/**
//	 * @return
//	 * @see com.google.gwt.core.client.JavaScriptObject#hashCode()
//	 */
//	public  int hashCode() {
//		return _wrappedEventTargetConfig().hashCode();
//	}
//	/**
//	 * @return
//	 * @see com.google.gwt.core.client.JavaScriptObject#toSource()
//	 */
//	public String toSource() {
//		return _wrappedEventTargetConfig().toSource();
//	}
//	/**
//	 * @return
//	 * @see com.google.gwt.core.client.JavaScriptObject#toString()
//	 */
//	public  String toString() {
//		return _wrappedEventTargetConfig().toString();
//	} 
	
	
	
	
}
