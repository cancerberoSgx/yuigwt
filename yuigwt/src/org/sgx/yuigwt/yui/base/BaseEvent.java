package org.sgx.yuigwt.yui.base;

import org.sgx.yuigwt.yui.attr.AttributeEvent;

public class BaseEvent extends AttributeEvent {
protected BaseEvent(){}
/**
 * cfg property which refers to the configuration object passed to the constructor. 
 * only valid for "init" event
 * @return
 */
public native final BaseConfig cfg() /*-{
return this.cfg; 
}-*/;
/**
 * cfg property which refers to the configuration object passed to the constructor. 
 * @param val
 * @return
 */
public native final BaseEvent cfg(BaseConfig val) /*-{
 this.cfg = val; 
 return this; 
}-*/;

}
