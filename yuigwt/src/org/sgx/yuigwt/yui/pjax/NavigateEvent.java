package org.sgx.yuigwt.yui.pjax;

import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.event.YuiEvent;

public class NavigateEvent extends EventFacade {
protected NavigateEvent(){}
/**
 * The URL that the router will dispatch to its route handlers in order to fulfill the enhanced navigation "request".
 * @return
 */
public native final String url() /*-{
return this.url; 
}-*/;

/**
 * The URL that the router will dispatch to its route handlers in order to fulfill the enhanced navigation "request".
 * @param val
 * @return this - for setter chaining
 */
public native final NavigateEvent url(String val) /*-{
this.url = val; 
return this; 
}-*/;

/**
 * Whether the enhanced navigation should occur even in browsers without HTML5 history.
 * @return
 */
public native final boolean force() /*-{
return this.force; 
}-*/;

/**Whether the enhanced navigation should occur even in browsers without HTML5 history.
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final NavigateEvent force(boolean val) /*-{
this.force = val; 
return this; 
}-*/;

/**
 * The hash-fragment (including "#") of the url. This will be present when the url differs from the current URL only by its hash and navigateOnHash has ben set to true.
 * @return
 */
public native final String hash() /*-{
return this.hash; 
}-*/;

/**
 * The hash-fragment (including "#") of the url. This will be present when the url differs from the current URL only by its hash and navigateOnHash has ben set to true.
 * @param val
 * @return this - for setter chaining
 */
public native final NavigateEvent hash(String val) /*-{
this.hash = val; 
return this; 
}-*/;

/**
 * The event that caused the navigation. Usually this would be a click event from a "pjax" anchor element.
 * @return
 */
public native final YuiEvent event() /*-{
return this.event; 
}-*/;

/**
 * The event that caused the navigation. Usually this would be a click event from a "pjax" anchor element.
 * @param val
 * @return this - for setter chaining
 */
public native final NavigateEvent event(YuiEvent val) /*-{
this.event = val; 
return this; 
}-*/;

/**
 * Whether or not the current history entry will be replaced, or a new entry will be created. Will default to true if the specified url is the same as the current URL.
 * @return
 */
public native final boolean replace() /*-{
return this.replace; 
}-*/;

/**
 * Whether or not the current history entry will be replaced, or a new entry will be created. Will default to true if the specified url is the same as the current URL.
 * @param val
 * @return this - for setter chaining
 */
public native final NavigateEvent replace(boolean val) /*-{
this.replace = val; 
return this; 
}-*/;
}
