package org.sgx.yuigwt.yui.console;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.widget.ext.WidgetExt;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * <p> Console creates a visualization for messages logged through calls to a YUI
 * instance's Y.log( message, category, source ) method. The debug versions of
 * YUI modules will include logging statements to offer some insight into the
 * steps executed during that module's operation. Including log statements in
 * your code will cause those messages to also appear in the Console. Use
 * Console to aid in developing your page or application.</p>
 * 
 * <p>Entry categories "info", "warn", and "error" are also referred to as the log
 * level, and entries are filtered against the configured logLevel.</p>
 * 
 * <p>YUIBUG: in the API do not tells, but it seems that Console extends Widget, because of the render() method.</p>
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Console.html
 * @author sg
 * 
 */
public class Console extends WidgetExt {
	protected Console() {
	}
	/**
	 * Transfers a received message to the print loop buffer. Default behavior defined in _defEntryFn.
	 */
	public static final String EVENT_ENTRY = "entry"; 
	
	/**
	 * Triggers the reset behavior via the default logic in _defResetFn.
	 */
	public static final String EVENT_RESET = "reset"; 
	
	
	/**
	 * Clear the console of messages and flush the buffer of pending messages.
	 * @return
	 */
	public native final Console clearConsole()/*-{
		this.clearConsole(); 
		return this; 
	}-*/;

/**
 * Collapses the body and footer.
 * @return self for method chaining
 */
public native final Console collapse() /*-{
this.collapse(); 
return this; 
}-*/;

/**
 * Expands the body and footer if collapsed.
 * @return self for method chaining
 */
public native final Console expand() /*-{
this.expand(); 
return this; 
}-*/;

/**
* Wrapper for Y.log.
* @param msg  The message to log.
* @param cat  The log category for the message. Default categories are "info", "warn", "error", time". Custom categories can be used as well. (opt).
* @param src The source of the the message (opt).
* @param silent If true, the log event won't fire.
* @return self for method chaining
*/
public native final YUI log(String msg, String cat, String src, boolean silent) /*-{
this.log(msg, cat, src, silent); 
return this; 
}-*/;
/**
* Wrapper for Y.log.
* @param msg  The message to log.
* @param cat  The log category for the message. Default categories are "info", "warn", "error", time". Custom categories can be used as well. (opt).
* @param src The source of the the message (opt).
* @return self for method chaining
*/
public native final YUI log(String msg, String cat, String src) /*-{
this.log(msg, cat, src); 
return this; 
}-*/;
/**
* Wrapper for Y.log.
* @param msg  The message to log.
* @param cat  The log category for the message. Default categories are "info", "warn", "error", time". Custom categories can be used as well. (opt).
* @param src The source of the the message (opt).
* @return self for method chaining
*/
public native final YUI log(String msg) /*-{
this.log(msg, "", ""); 
return this; 
}-*/;
/**
* Wrapper for Y.log.
* @param msg  The message to log.
* @param cat  The log category for the message. Default categories are "info", "warn", "error", time". Custom categories can be used as well. (opt).
* @param src The source of the the message (opt).
* @return self for method chaining
*/
public native final YUI log(JavaScriptObject msg) /*-{
this.log(msg, "", ""); 
return this; 
}-*/;
/**
 * Outputs buffered messages to the console UI. This is typically called from a scheduled interval until the buffer is empty (referred to as the print loop). The number of buffered messages output to the Console is limited to the number provided as an argument. If no limit is passed, all buffered messages are rendered.
 * @param limit (optional) max number of buffered entries to write
 * @return self for method chaining
 */
public native final Console printBuffer(int limit) /*-{
this.printBuffer(limit); 
return this; 
}-*/;

/**
 * Clears the console and resets internal timers.
 * @return self for method chaining
 */
public native final Console reset() /*-{
this.reset(); 
return this; 
}-*/;

/**
 * Scrolls to the most recent entry
 * @return self for method chaining
 */
public native final Console scrollToLatest() /*-{
this.scrollToLatest(); 
return this; 
}-*/;


//attribute accessors

/**
 * Controls the collapsed state of the Console. Default: false
 * @return the attribute
 */
public final native boolean collapsed()/*-{
return this.get("collapsed");
}-*/;

/**
 * 
 * @param val
 * @return self for method chaining
 */
public final native Console collapsed(boolean val)/*-{
this.set("collapsed", val);
return this; 
}-*/;
}
