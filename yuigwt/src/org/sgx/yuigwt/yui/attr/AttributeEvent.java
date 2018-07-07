package org.sgx.yuigwt.yui.attr;

import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.event.YuiEvent;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * this artificial class serves for those events related to the change of an
 * attribute. Many YUI modules, poblates the EventFacade only for storing,
 * previous and next values of the attribute being changed.
 * 
 * @author sg
 * 
 */
public class AttributeEvent extends EventFacade {
	protected AttributeEvent() {
	}

	// prevVal and newVal - most custom events notifying property changes have
	// these, so we added here in the parent only once.
	/**
	 * on a property change event, this is the previous value of th enow changed
	 * property.
	 * 
	 * @return
	 */
	public native final String prevValString() /*-{
		return this.prevVal + "";
	}-*/;

	/**
	 * on a property change event, this is the previous value of th enow changed
	 * property.
	 * 
	 * @return
	 */
	public native final int prevValInt() /*-{
		return this.prevVal;
	}-*/;

	/**
	 * on a property change event, this is the previous value of th enow changed
	 * property.
	 * 
	 * @return
	 */
	public native final double prevValDouble() /*-{
		return this.prevVal;
	}-*/;

	/**
	 * on a property change event, this is the previous value of th enow changed
	 * property.
	 * 
	 * @return
	 */
	public native final boolean prevValBoolean() /*-{
		return this.prevVal || false;
	}-*/;

	/**
	 * on a property change event, this is the previous value of th enow changed
	 * property.
	 * 
	 * @return
	 */
	public native final JavaScriptObject prevValObj() /*-{
		return this.prevVal;
	}-*/;

	/**
	 * on a property change event, this is the new value of the now changed
	 * property.
	 * 
	 * @return
	 */
	public native final String newValString() /*-{
		return this.newVal + "";
	}-*/;

	/**
	 * on a property change event, this is the new value of the now changed
	 * property.
	 * 
	 * @return
	 */
	public native final boolean newValBoolean() /*-{
		return this.newVal || false;
	}-*/;

	/**
	 * on a property change event, this is the new value of the now changed
	 * property.
	 * 
	 * @return
	 */
	public native final int newValInt() /*-{
		return this.newVal;
	}-*/;

	/**
	 * on a property change event, this is the new value of the now changed
	 * property.
	 * 
	 * @return
	 */
	public native final double newValDouble() /*-{
		return this.newVal;
	}-*/;

	/**
	 * on a property change event, this is the new value of the now changed
	 * property.
	 * 
	 * @return
	 */
	public native final JavaScriptObject newValObj() /*-{
		return this.newVal;
	}-*/;

	/**
	 * The name of the attribute being set
	 * 
	 * @return
	 */
	public native final String attrName() /*-{
		return this.newVal;
	}-*/;

	/**
	 * If setting a property within the attribute's value, the name of the
	 * sub-attribute property being set.
	 * 
	 * <p>
	 * Attribute also allows you to set individual properties of attributes
	 * having values which are objects through the set method (e.g.
	 * o.set("X.a.b", 5), discussed below). This event property will contain the
	 * complete dot notation path for the object property which was changed.
	 * </p>
	 * 
	 * <p>
	 * For example, during o.set("X.a.b", 5);, event.subAttrName will be
	 * "X.a.b", the path of the property which was modified, and event.attrName
	 * will be "X", the attribute name.
	 * </p>
	 * 
	 * 
	 * @return
	 */
	public native final String subAttrName() /*-{
		return this.newVal;
	}-*/;

}
