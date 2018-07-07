package org.sgx.yuigwt.yui.asyncqueue;

import org.sgx.yuigwt.yui.event.EventTargetClass;

public class AsyncQueueClass extends EventTargetClass {
protected AsyncQueueClass(){}
public native final AsyncQueueItem defaults()/*-{
return this.defaults || {}; 
}-*/;
}
