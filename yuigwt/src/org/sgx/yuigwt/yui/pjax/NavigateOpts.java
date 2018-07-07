package org.sgx.yuigwt.yui.pjax;

import org.sgx.yuigwt.yui.util.JsObject;

/**Additional options to configure the navigation. These are mixed into the navigate event facade.
 * TODO: relationship  with event facade 
 * @author sg
 *
 */
public class NavigateOpts extends JsObject {
protected NavigateOpts(){}
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
public native final NavigateOpts replace(boolean val) /*-{
this.replace = val; 
return this; 
}-*/;

/**
 * Whether the enhanced navigation should occur even in browsers without HTML5 history.
 * @return
 */
public native final boolean force() /*-{
return this.force; 
}-*/;

/**
 * Whether the enhanced navigation should occur even in browsers without HTML5 history.
 * @param val
 * @return this - for setter chaining
 */
public native final NavigateOpts force(boolean val) /*-{
this.force = val; 
return this; 
}-*/;
}
