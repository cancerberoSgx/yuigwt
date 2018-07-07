package org.sgx.yuigwt.yui.console;

import org.sgx.yuigwt.yui.event.EventTarget;
import org.sgx.yuigwt.yui.widget.WidgetConfig;

import com.google.gwt.core.client.JsDate;

public class ConsoleConfig extends WidgetConfig {
protected ConsoleConfig(){}
public static final native ConsoleConfig create()/*-{
	return {}; 
}-*/;

/**
 * Controls the collapsed state of the Console. default false.
 * @return
 */
public native final boolean collapsed() /*-{
return this.collapsed; 
}-*/;

/**
 * Controls the collapsed state of the Console. default false.
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig collapsed(boolean val) /*-{
this.collapsed = val; 
return this; 
}-*/;

/**
 * Maximum number of Console entries allowed in the Console body at one time. This is used to keep acquired messages from exploding the DOM tree and impacting page performance. Default: 300
 * @return
 */
public native final int consoleLimit() /*-{
return this.consoleLimit; 
}-*/;

/**
 * Maximum number of Console entries allowed in the Console body at one time. This is used to keep acquired messages from exploding the DOM tree and impacting page performance. Default: 300 
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig consoleLimit(int val) /*-{
this.consoleLimit = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String defaultCategory() /*-{
return this.defaultCategory; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig defaultCategory(String val) /*-{
this.defaultCategory = val; 
return this; 
}-*/;

/**
 * If a source is not specified in the Y.log(..) statement, this source will be used. Default: "global"
 * @return
 */
public native final String defaultSource() /*-{
return this.defaultSource; 
}-*/;

/**
 * If a source is not specified in the Y.log(..) statement, this source will be used. Default: "global"
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig defaultSource(String val) /*-{
this.defaultSource = val; 
return this; 
}-*/;

//TODO: entryTemplate

///**
// * String with units, or number, representing the height of the Console, inclusive of header and footer. If a number is provided, the default unit, defined by Widget's DEF_UNIT, property is used. Default: "300px"
// * @return
// */
//public native final String height() /*-{
//return this.height; 
//}-*/;
//
///**
// * String with units, or number, representing the height of the Console, inclusive of header and footer. If a number is provided, the default unit, defined by Widget's DEF_UNIT, property is used. Default: "300px"
// * @param val
// * @return this - for setter chaining
// */
//public native final ConsoleConfig height(String val) /*-{
//this.height = val; 
//return this; 
//}-*/;

/**
 * Name of the custom event that will communicate log messages. Default: "yui:log"
 * @return
 */
public native final String logEvent() /*-{
return this.logEvent; 
}-*/;

/**
 * Name of the custom event that will communicate log messages. Default: "yui:log"
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig logEvent(String val) /*-{
this.logEvent = val; 
return this; 
}-*/;
/**
 * Minimum entry log level to render into the Console. The initial logLevel value for all Console instances defaults from the Y.config.logLevel YUI configuration, or Console.LOGLEVELINFO if that configuration is not set. Possible values are "info", "warn", "error" (case insensitive), or their corresponding statics Console.LOGLEVELINFO and so on. Default: Y.config.logLevel or Console.LOG_LEVEL_INFO
 * @return
 */
public native final String logLevel() /*-{
return this.logLevel; 
}-*/;

/**
 * Minimum entry log level to render into the Console. The initial logLevel value for all Console instances defaults from the Y.config.logLevel YUI configuration, or Console.LOGLEVELINFO if that configuration is not set. Possible values are "info", "warn", "error" (case insensitive), or their corresponding statics Console.LOGLEVELINFO and so on. Default: Y.config.logLevel or Console.LOG_LEVEL_INFO
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig logLevel(String val) /*-{
this.logLevel = val; 
return this; 
}-*/;

/**
 * Object that will emit the log events. By default the YUI instance. To have a single Console capture events from all YUI instances, set this to the Y.Global object. Default: Y
 * @return
 */
public native final EventTarget logSource() /*-{
return this.logSource; 
}-*/;

/**
 * Object that will emit the log events. By default the YUI instance. To have a single Console capture events from all YUI instances, set this to the Y.Global object. Default: Y
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig logSource(EventTarget val) /*-{
this.logSource = val; 
return this; 
}-*/;

/**
 * New entries should display at the top of the Console or the bottom? Default: true
 * @return
 */
public native final boolean newesOnTop() /*-{
return this.newesOnTop; 
}-*/;

/**
 * New entries should display at the top of the Console or the bottom? Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig newesOnTop(boolean val) /*-{
this.newesOnTop = val; 
return this; 
}-*/;

/**
 * Boolean to pause the outputting of new messages to the console. When paused, messages will accumulate in the buffer. Default: false
 * @return
 */
public native final boolean paused() /*-{
return this.paused; 
}-*/;

/**
 * Boolean to pause the outputting of new messages to the console. When paused, messages will accumulate in the buffer. Default: false
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig paused(boolean val) /*-{
this.paused = val; 
return this; 
}-*/;

/**
 * Maximum number of entries printed in each iteration of the print loop. This is used to prevent excessive logging locking the page UI. Default: 50
 * @return
 */
public native final int printLimit() /*-{
return this.printLimit; 
}-*/;

/**
 * Maximum number of entries printed in each iteration of the print loop. This is used to prevent excessive logging locking the page UI. Default: 50
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig printLimit(int val) /*-{
this.printLimit = val; 
return this; 
}-*/;

/**
 * Millisecond timeout between iterations of the print loop, moving entries from the buffer to the UI. Default: 100
 * @return
 */
public native final int printTimeout() /*-{
return this.printTimeout; 
}-*/;

/**
 * Millisecond timeout between iterations of the print loop, moving entries from the buffer to the UI. Default: 100
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig printTimeout(int val) /*-{
this.printTimeout = val; 
return this; 
}-*/;

/**
 * When new entries are added to the Console UI, should they be scrolled into view? Default: true
 * @return
 */
public native final boolean scrollIntoView() /*-{
return this.scrollIntoView; 
}-*/;

/**
 * When new entries are added to the Console UI, should they be scrolled into view? Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig scrollIntoView(boolean val) /*-{
this.scrollIntoView = val; 
return this; 
}-*/;

/**
 * The baseline time for this Console instance, used to measure elapsed time from the moment the console module is used to the moment each new entry is logged (not rendered). This value is reset by the instance method myConsole.reset(). Default: The moment the console module is <code>use</code>d
 * @return
 */
public native final JsDate startTime() /*-{
return this.startTime; 
}-*/;

/**
 * The baseline time for this Console instance, used to measure elapsed time from the moment the console module is used to the moment each new entry is logged (not rendered). This value is reset by the instance method myConsole.reset(). Default: The moment the console module is <code>use</code>d
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig startTime(JsDate val) /*-{
this.startTime = val; 
return this; 
}-*/;

///**
// * Collection of strings used to label elements in the Console UI. Default collection contains the following name:value pairs:
//    title : "Log Console",    pause : "Pause",    clear : "Clear",    collapse : "Collapse",    expand : "Expand" * @param val
// * @return
// */
//public native final JavaScriptObject strings() /*-{
//return this.strings; 
//}-*/;
//
///**
// * Collection of strings used to label elements in the Console UI. Default collection contains the following name:value pairs:
//    title : "Log Console",    pause : "Pause",    clear : "Clear",    collapse : "Collapse",    expand : "Expand" * @param val
// * @return this - for setter chaining
// */
//public native final ConsoleConfig strings(JavaScriptObject val) /*-{
//this.strings = val; 
//return this; 
//}-*/;

/**
 * Allows the Console to flow in the document. Available values are 'inline', 'block', and 'separate' (the default). Default: 'separate'
 * @return
 */
public native final String style() /*-{
return this.style; 
}-*/;

/**
 *  Allows the Console to flow in the document. Available values are 'inline', 'block', and 'separate' (the default). Default: 'separate'
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig style(String val) /*-{
this.style = val; 
return this; 
}-*/;

/**
 * Pass through to the YUI instance useBrowserConsole configuration. By default this is set to false, which will disable logging to the browser console when a Console instance is created. If the logSource is not a YUI instance, this has no effect. Default: false
 * @return
 */
public native final boolean useBrowserConsole() /*-{
return this.useBrowserConsole; 
}-*/;

/**
 * Pass through to the YUI instance useBrowserConsole configuration. By default this is set to false, which will disable logging to the browser console when a Console instance is created. If the logSource is not a YUI instance, this has no effect. Default: false
 * @param val
 * @return this - for setter chaining
 */
public native final ConsoleConfig useBrowserConsole(boolean val) /*-{
this.useBrowserConsole = val; 
return this; 
}-*/;

///**
// * String with units, or number, representing the width of the Console. If a number is provided, the default unit, defined by Widget's DEF_UNIT, property is used. Default: "300px"
// * @return
// */
//public native final String width() /*-{
//return this.width; 
//}-*/;
//
///**
// * String with units, or number, representing the width of the Console. If a number is provided, the default unit, defined by Widget's DEF_UNIT, property is used. Default: "300px"
// * @param val
// * @return this - for setter chaining
// */
//public native final ConsoleConfig width(String val) /*-{
//this.width = val; 
//return this; 
//}-*/;
}
