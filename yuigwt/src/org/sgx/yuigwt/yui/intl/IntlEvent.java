package org.sgx.yuigwt.yui.intl;

import org.sgx.yuigwt.yui.attr.AttributeEvent;
import org.sgx.yuigwt.yui.event.EventFacade;

/**
 * Notification event to indicate when the lang for a module has changed. There
 * is no default behavior associated with this event, so the on and after
 * moments are equivalent.
 * <p>
 * The event facade contains:
 * </p>
 * 
 * <p>
 * module: The name of the module for which the language changed
 * </p>
 * 
 * <p>
 * newVal: The new language tag
 * </p>
 * 
 * <p>
 * prevVal: The current language tag
 * </p>
 * 
 * @author sg
 * 
 */
public class IntlEvent extends AttributeEvent {
	protected IntlEvent() {
	}

	/**
	 * The name of the module for which the language changed
	 * 
	 * @return
	 */
	public native final String module() /*-{
	return this.module; 
	}-*/;

}
