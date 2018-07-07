package org.sgx.yuigwt.yui.console;

import org.sgx.yuigwt.yui.widget.WidgetEvent;

public class ConsoleEvent extends WidgetEvent {
protected ConsoleEvent(){}
/**
 * The message data normalized into an object literal
 * @return
 */
public native final NormalizedMessage message() /*-{
return this.message; 
}-*/;

/**
 * The message data normalized into an object literal
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleEvent entry(NormalizedMessage val) /*-{
this.message = val; 
return this; 
}-*/;
}
