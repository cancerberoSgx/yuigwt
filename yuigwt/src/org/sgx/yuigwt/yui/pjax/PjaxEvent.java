package org.sgx.yuigwt.yui.pjax;

import org.sgx.yuigwt.yui.event.EventFacade;

public class PjaxEvent extends EventFacade {
protected PjaxEvent(){}
/**
 * 
 * @return
 */
public native final PjaxContent content() /*-{
return this.content; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final PjaxEvent content(PjaxContent val) /*-{
this.content = val; 
return this; 
}-*/;
}
