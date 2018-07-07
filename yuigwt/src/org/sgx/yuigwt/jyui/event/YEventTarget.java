package org.sgx.yuigwt.jyui.event;

import org.sgx.yuigwt.jyui.AbstractYObject;
import org.sgx.yuigwt.jyui.AbstractYObjectWithContext;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.CustomEvent;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventConfig;
import org.sgx.yuigwt.yui.event.EventHandle;
import org.sgx.yuigwt.yui.event.EventTarget;
import org.sgx.yuigwt.yui.util.Callback;
import org.sgx.yuigwt.yui.util.JsArr;
import org.sgx.yuigwt.yui.util.JsFunction;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsArrayString;

/**
 * 100% Java Wrapper for EventTarget
 * 
 * @author sg
 * 
 */
public abstract class YEventTarget extends AbstractYObjectWithContext {

	public YEventTarget(YuiContext y) {
		super(y);
	}

	public org.sgx.yuigwt.yui.event.EventTarget _wrappedEventTarget() {
		return _wrapped.cast();
	}

	/**
	 * @param e
	 * @see org.sgx.yuigwt.yui.event.EventTarget#removeTarget(org.sgx.yuigwt.yui.event.EventTarget)
	 */
	public void removeTarget(EventTarget e) {
		_wrappedEventTarget().removeTarget(e);
	}

	/**
	 * @param e
	 * @see org.sgx.yuigwt.yui.event.EventTarget#addTarget(org.sgx.yuigwt.yui.event.EventTarget)
	 */
	public void addTarget(EventTarget e) {
		_wrappedEventTarget().addTarget(e);
	}

	/**
	 * @param type
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#parseType(java.lang.String)
	 */
	public JsArrayMixed parseType(String type) {
		return _wrappedEventTarget().parseType(type);
	}

	/**
	 * @param type
	 * @param prefix
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#parseType(java.lang.String,
	 *      java.lang.String)
	 */
	public JsArrayMixed parseType(String type, String prefix) {
		return _wrappedEventTarget().parseType(type, prefix);
	}

	/**
	 * @param type
	 * @param config
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#publish(java.lang.String,
	 *      org.sgx.yuigwt.yui.event.EventConfig)
	 */
	public CustomEvent publish(String type, EventConfig config) {
		return _wrappedEventTarget().publish(type, config);
	}

	/**
	 * @param type
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#publish(java.lang.String)
	 */
	public CustomEvent publish(String type) {
		return _wrappedEventTarget().publish(type);
	}

	/**
	 * @param e
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#bubble(org.sgx.yuigwt.yui.event.CustomEvent)
	 */
	public boolean bubble(CustomEvent e) {
		return _wrappedEventTarget().bubble(e);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String,
	 *      org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public EventHandle on(String type, EventCallback c) {
		return _wrappedEventTarget().on(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String,
	 *      org.sgx.yuigwt.yui.util.Callback)
	 */
	public EventHandle on(String type, Callback c) {
		return _wrappedEventTarget().on(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String,
	 *      org.sgx.yuigwt.yui.util.JsFunction)
	 */
	public EventHandle on(String type, JsFunction c) {
		return _wrappedEventTarget().on(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String[],
	 *      org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public EventHandle on(String[] type, EventCallback c) {
		return _wrappedEventTarget().on(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String[],
	 *      org.sgx.yuigwt.yui.util.JsFunction)
	 */
	public EventHandle on(String[] type, JsFunction c) {
		return _wrappedEventTarget().on(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String[],
	 *      org.sgx.yuigwt.yui.util.Callback)
	 */
	public EventHandle on(String[] type, Callback c) {
		return _wrappedEventTarget().on(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String,
	 *      org.sgx.yuigwt.yui.event.EventCallback, java.lang.Object)
	 */
	public EventHandle on(String type, EventCallback c, Object args) {
		return _wrappedEventTarget().on(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String,
	 *      org.sgx.yuigwt.yui.util.Callback, java.lang.Object)
	 */
	public EventHandle on(String type, Callback c, Object args) {
		return _wrappedEventTarget().on(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String,
	 *      org.sgx.yuigwt.yui.util.JsFunction, java.lang.Object)
	 */
	public EventHandle on(String type, JsFunction c, Object args) {
		return _wrappedEventTarget().on(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String[],
	 *      org.sgx.yuigwt.yui.event.EventCallback, java.lang.Object)
	 */
	public EventHandle on(String[] type, EventCallback c, Object args) {
		return _wrappedEventTarget().on(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String[],
	 *      org.sgx.yuigwt.yui.util.JsFunction, java.lang.Object)
	 */
	public EventHandle on(String[] type, JsFunction c, Object args) {
		return _wrappedEventTarget().on(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#on(java.lang.String[],
	 *      org.sgx.yuigwt.yui.util.Callback, java.lang.Object)
	 */
	public EventHandle on(String[] type, Callback c, Object args) {
		return _wrappedEventTarget().on(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#once(java.lang.String,
	 *      org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public EventHandle once(String type, EventCallback c) {
		return _wrappedEventTarget().once(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#once(java.lang.String[],
	 *      org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public EventHandle once(String[] type, EventCallback c) {
		return _wrappedEventTarget().once(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#once(java.lang.String,
	 *      org.sgx.yuigwt.yui.event.EventCallback, java.lang.Object)
	 */
	public EventHandle once(String type, EventCallback c, Object args) {
		return _wrappedEventTarget().once(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#once(java.lang.String[],
	 *      org.sgx.yuigwt.yui.event.EventCallback, java.lang.Object)
	 */
	public EventHandle once(String[] type, EventCallback c, Object args) {
		return _wrappedEventTarget().once(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#onceAfter(java.lang.String,
	 *      org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public EventHandle onceAfter(String type, EventCallback c) {
		return _wrappedEventTarget().onceAfter(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#onceAfter(java.lang.String[],
	 *      org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public EventHandle onceAfter(String[] type, EventCallback c) {
		return _wrappedEventTarget().onceAfter(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#onceAfter(java.lang.String,
	 *      org.sgx.yuigwt.yui.event.EventCallback, java.lang.Object)
	 */
	public EventHandle onceAfter(String type, EventCallback c, Object args) {
		return _wrappedEventTarget().onceAfter(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#onceAfter(java.lang.String[],
	 *      org.sgx.yuigwt.yui.event.EventCallback, java.lang.Object)
	 */
	public EventHandle onceAfter(String[] type, EventCallback c, Object args) {
		return _wrappedEventTarget().onceAfter(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#after(java.lang.String,
	 *      org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public EventHandle after(String type, EventCallback c) {
		return _wrappedEventTarget().after(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#after(java.lang.String[],
	 *      org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public EventHandle after(String[] type, EventCallback c) {
		return _wrappedEventTarget().after(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#after(java.lang.String,
	 *      org.sgx.yuigwt.yui.event.EventCallback, java.lang.Object)
	 */
	public EventHandle after(String type, EventCallback c, Object args) {
		return _wrappedEventTarget().after(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#after(java.lang.String[],
	 *      org.sgx.yuigwt.yui.event.EventCallback, java.lang.Object)
	 */
	public EventHandle after(String[] type, EventCallback c, Object args) {
		return _wrappedEventTarget().after(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#before(java.lang.String,
	 *      org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public EventHandle before(String type, EventCallback c) {
		return _wrappedEventTarget().before(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#before(java.lang.String[],
	 *      org.sgx.yuigwt.yui.event.EventCallback)
	 */
	public EventHandle before(String[] type, EventCallback c) {
		return _wrappedEventTarget().before(type, c);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#before(java.lang.String,
	 *      org.sgx.yuigwt.yui.event.EventCallback, java.lang.Object)
	 */
	public EventHandle before(String type, EventCallback c, Object args) {
		return _wrappedEventTarget().before(type, c, args);
	}

	/**
	 * @param type
	 * @param c
	 * @param args
	 * @return
	 * @see org.sgx.yuigwt.yui.event.EventTarget#before(java.lang.String[],
	 *      org.sgx.yuigwt.yui.event.EventCallback, java.lang.Object)
	 */
	public EventHandle before(String[] type, EventCallback c, Object args) {
		return _wrappedEventTarget().before(type, c, args);
	}

	
	
	
	// TODO: delete the following - leave here because it is easy to call
	// generate delegate methods

//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objGetArr(java.lang.Object)
//	 */
//	public JsArr objGetArr(Object p) {
//		return _wrappedEventTarget().objGetArr(p);
//	}
//
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objGetObj(java.lang.Object)
//	 */
//	public JsObject objGetObj(Object p) {
//		return _wrappedEventTarget().objGetObj(p);
//	}
//
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objGetString(java.lang.Object)
//	 */
//	public String objGetString(Object p) {
//		return _wrappedEventTarget().objGetString(p);
//	}
//
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objGetInt(java.lang.Object)
//	 */
//	public int objGetInt(Object p) {
//		return _wrappedEventTarget().objGetInt(p);
//	}
//
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objGetDouble(java.lang.Object)
//	 */
//	public int objGetDouble(Object p) {
//		return _wrappedEventTarget().objGetDouble(p);
//	}
//
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objTypeof(java.lang.Object)
//	 */
//	public String objTypeof(Object p) {
//		return _wrappedEventTarget().objTypeof(p);
//	}
//
//	/**
//	 * @param p
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.Object)
//	 */
//	public Object _(Object p) {
//		return _wrappedEventTarget()._(p);
//	}
//
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objPut(java.lang.String,
//	 *      java.lang.String)
//	 */
//	public JsObject objPut(String pname, String val) {
//		return _wrappedEventTarget().objPut(pname, val);
//	}
//
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objPut(java.lang.String, int)
//	 */
//	public JsObject objPut(String pname, int val) {
//		return _wrappedEventTarget().objPut(pname, val);
//	}
//
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objPut(java.lang.String, double)
//	 */
//	public JsObject objPut(String pname, double val) {
//		return _wrappedEventTarget().objPut(pname, val);
//	}
//
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objPut(java.lang.String,
//	 *      com.google.gwt.core.client.JavaScriptObject)
//	 */
//	public JsObject objPut(String pname, JavaScriptObject val) {
//		return _wrappedEventTarget().objPut(pname, val);
//	}
//
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.String,
//	 *      java.lang.String)
//	 */
//	public JsObject _(String pname, String val) {
//		return _wrappedEventTarget()._(pname, val);
//	}
//
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.String,
//	 *      java.lang.Object)
//	 */
//	public JsObject _(String pname, Object val) {
//		return _wrappedEventTarget()._(pname, val);
//	}
//
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.String, int)
//	 */
//	public JsObject _(String pname, int val) {
//		return _wrappedEventTarget()._(pname, val);
//	}
//
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.String, double)
//	 */
//	public JsObject _(String pname, double val) {
//		return _wrappedEventTarget()._(pname, val);
//	}
//
//	/**
//	 * @param pname
//	 * @param val
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#_(java.lang.String,
//	 *      com.google.gwt.core.client.JavaScriptObject)
//	 */
//	public JsObject _(String pname, JavaScriptObject val) {
//		return _wrappedEventTarget()._(pname, val);
//	}
//
//	/**
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objProps()
//	 */
//	public JsArrayString objProps() {
//		return _wrappedEventTarget().objProps();
//	}
//
//	/**
//	 * @param printValues
//	 * @return
//	 * @see org.sgx.yuigwt.yui.util.JsObject#objDump(boolean)
//	 */
//	public String objDump(boolean printValues) {
//		return _wrappedEventTarget().objDump(printValues);
//	}
//
//	/**
//	 * @return
//	 * @see com.google.gwt.core.client.JavaScriptObject#cast()
//	 */
//	public <T extends JavaScriptObject> T cast() {
//		return _wrappedEventTarget().cast();
//	}
//
//	/**
//	 * @param other
//	 * @return
//	 * @see com.google.gwt.core.client.JavaScriptObject#equals(java.lang.Object)
//	 */
//	public boolean equals(Object other) {
//		return _wrappedEventTarget().equals(other);
//	}
//
//	/**
//	 * @return
//	 * @see com.google.gwt.core.client.JavaScriptObject#hashCode()
//	 */
//	public int hashCode() {
//		return _wrappedEventTarget().hashCode();
//	}
//
//	/**
//	 * @return
//	 * @see com.google.gwt.core.client.JavaScriptObject#toSource()
//	 */
//	public String toSource() {
//		return _wrappedEventTarget().toSource();
//	}
//
//	/**
//	 * @return
//	 * @see com.google.gwt.core.client.JavaScriptObject#toString()
//	 */
//	public String toString() {
//		return _wrappedEventTarget().toString();
//	}

}