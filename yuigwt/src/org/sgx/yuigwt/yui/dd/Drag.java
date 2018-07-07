package org.sgx.yuigwt.yui.dd;

import org.sgx.yuigwt.yui.base.Base;
/**
 * Provides the ability to drag a Node. @see http://yuilibrary.com/yui/docs/api/classes/DD.Drag.html
 * @author sg
 *
 */
public class Drag extends Base {
protected Drag(){}

/**
 * Add a handle to a drag element. Drag only initiates when a mousedown happens on this element.
 * @param sel The selector to test for a valid handle. Must be a child of the element.
 * @return
 */
public native final Drag addHandle(String sel)/*-{
	this.addHandle(sel); 
	return this; 
}-*/;
/**
 * Add a selector string to test the handle against. If the test passes the drag operation will not continue.
 * @param sel The selector to test against to determine if this is an invalid drag handle.
 * @return
 */
public native final Drag addInvalid(String sel)/*-{
	this.addInvalid(sel); 
	return this; 
}-*/;
}
