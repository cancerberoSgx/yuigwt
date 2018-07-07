package org.sgx.yuigwt.yui.event;

import org.sgx.yuigwt.yui.attr.Attribute;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
/**
 * 
 * @author sg
 *
 */
public class EventFacade extends JsObject {
protected EventFacade(){}

/**
 * Stops the propagation to the next bubble target. In the case of DOM events, 
 * stops the event from bubbling further up the DOM tree. This does not prevent the default action if there is one. Subsequent event subscribers will be executed. 
 */
public native final void stopPropagation()/*-{
	this.stopPropagation(); 
}-*/;

/**Stops the propagation to the next bubble target and prevents any additional listeners from being exectued on the current target.
 * In the case of DOM events, stops the event from bubbling further up the DOM tree. This does not prevent the default action if there is one. Subsequent event subscribers will NOT be executed.  
 */
public native final void stopImmediatePropagation()/*-{
	this.stopImmediatePropagation(); 
}-*/;

/**
 * Stops the event propagation and prevents the default event behavior. In the case of DOM events, 
 * it is an alias for e.preventDefault(); e.stopPropagation(); or e.preventDefault(); e.stopImmediatePropagation();, depending on the immediate parameter. 
 * @param inmediate if true additional listeners on the current target will not be executed
 */
public native final void halt(boolean inmediate)/*-{
this.halt(inmediate); 
}-*/;
/**Stops the event propagation and prevents the default event behavior. In the case of DOM events, 
 * it is an alias for e.preventDefault(); e.stopPropagation(); or e.preventDefault(); e.stopImmediatePropagation();, depending on the immediate parameter. 
 */
public native final void halt()/*-{
this.halt(); 
}-*/;

/**Prevents the event's default behavior. In the case of DOM events, 
 * prevents the default action associated with the event. E.g. page navigation from an <a>nchor click or form submission and page reload from a form submit. 
 */
public native final void preventDefault()/*-{
	this.preventDefault(); 
}-*/;
/**
 * get the related dom event. 
 * @return
 */
public native final YuiEvent domEvent()/*-{
return this.domEvent; 
}-*/;


//event, details, type, _type, target, currentTarget, relatedTarget, stopped, prevented, constructor, stopPropagation, stopImmediatePropagation, preventDefault, halt, }</pre>

	/**
	 * 
	 * @return
	 */
	public native final String type() /*-{
	return this.type; 
	}-*/;

	/**
	 * @return The Node instance that originated the event (see the description
	 *         of event delegation for reference) . @see
	 *         http://yuilibrary.com/yui/docs/event/delegation.html
	 */
	public native final EventTarget getTarget()/*-{
		return this.target;
	}-*/;

	/**
	 * @return The Node instance that originated the event (see the description
	 *         of event delegation for reference) . @see
	 *         http://yuilibrary.com/yui/docs/event/delegation.html
	 */
	public native final EventTarget target()/*-{
		return this.target;
	}-*/;
	
	/**
	 * @return The Node instance that originated the event (see the description
	 *         of event delegation for reference) . @see
	 *         http://yuilibrary.com/yui/docs/event/delegation.html
	 */
	public native final Attribute targetAttribute()/*-{
		return this.target;
	}-*/;
	
	/**
	 * @return The Node instance that originated the event (see the description
	 *         of event delegation for reference) . @see
	 *         http://yuilibrary.com/yui/docs/event/delegation.html
	 */
	public native final Node targetNode()/*-{
		return this.target;
	}-*/;

	/**
	 * @return For mouseover events, this will be the Node instance of where the
	 *         mouse travelled from. For mouseout, it will be the Node that the
	 *         mouse travelled to.
	 */
	public native final EventTarget getRelatedTarget()/*-{
		return this.relatedTarget;
	}-*/;

	/**
	 * @return For mouseover events, this will be the Node instance of where the
	 *         mouse travelled from. For mouseout, it will be the Node that the
	 *         mouse travelled to.
	 */
	public native final EventTarget relatedTarget()/*-{
		return this.relatedTarget;
	}-*/;

	/**
	 * @return For mouseover events, this will be the Node instance of where the
	 *         mouse travelled from. For mouseout, it will be the Node that the
	 *         mouse travelled to.
	 */
	public native final YuiEvent relatedTarget(EventTarget et)/*-{
	this.relatedTarget=et;
	return this;  
	}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final EventFacade type(String val) /*-{
this.type = val; 
return this; 
}-*/;


/**
 * Indicates the number of times a button was clicked (DOM-compliant browsers only). 
 * @return
 */
public native final int detail() /*-{
return this.detail; 
}-*/;

/**
 * Indicates the number of times a button was clicked (DOM-compliant browsers only). 
 * @param val
 * @return this - for setter chaining
 */
public native final YuiEvent detail(int val) /*-{
this.detail = val; 
return this; 
}-*/;



}
