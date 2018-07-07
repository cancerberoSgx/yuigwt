package org.sgx.yuigwt.yui.pjax;

import org.sgx.yuigwt.yui.base.BaseConfig;
import org.sgx.yuigwt.yui.node.NodeSelector;
import org.sgx.yuigwt.yui.util.JsObject;

public class PjaxBaseConfig extends BaseConfig {
protected PjaxBaseConfig(){}
/**
 *CSS selector string used to filter link click events so that only the links which match it will have the enhanced navigation behavior of Pjax applied.
<br/>
When a link is clicked and that link matches this selector, Pjax will attempt to dispatch to any route handlers matching the link's href URL. If HTML5 history is not supported or if no route handlers match, the link click will be handled by the browser just like any old link.

 * @return
 */
public native final String linkSelectorString() /*-{
return this.linkSelector; 
}-*/;

/**
 * CSS selector string used to filter link click events so that only the links which match it will have the enhanced navigation behavior of Pjax applied.
<br/>
When a link is clicked and that link matches this selector, Pjax will attempt to dispatch to any route handlers matching the link's href URL. If HTML5 history is not supported or if no route handlers match, the link click will be handled by the browser just like any old link.

 * @param val
 * @return this - for setter chaining
 */
public native final PjaxBaseConfig linkSelector(String val) /*-{
this.linkSelector = val; 
return this; 
}-*/;

/**
 * CSS selector string used to filter link click events so that only the links which match it will have the enhanced navigation behavior of Pjax applied.
<br/>
When a link is clicked and that link matches this selector, Pjax will attempt to dispatch to any route handlers matching the link's href URL. If HTML5 history is not supported or if no route handlers match, the link click will be handled by the browser just like any old link.

 * @param val
 * @return this - for setter chaining
 */
public native final PjaxBaseConfig linkSelector(NodeSelector val) /*-{
this.linkSelector = $entry(function(n){
	return val.@org.sgx.yuigwt.yui.node.NodeSelector::select(Lorg/sgx/yuigwt/yui/node/Node;)(n)
}); ; 
return this; 
}-*/;

/**
 * Whether navigating to a hash-fragment identifier on the current page should be enhanced and cause the navigate event to fire.
<br/>
By default Pjax allows the browser to perform its default action when a user is navigating within a page by clicking in-page links (e.g. <a href="#top">Top of page</a>) and does not attempt to interfere or enhance in-page navigation.

 * @return
 */
public native final boolean navigateOnHash() /*-{
return this.navigateOnHash; 
}-*/;

/**
 * Whether navigating to a hash-fragment identifier on the current page should be enhanced and cause the navigate event to fire.
<br/>
By default Pjax allows the browser to perform its default action when a user is navigating within a page by clicking in-page links (e.g. <a href="#top">Top of page</a>) and does not attempt to interfere or enhance in-page navigation.

 * @param val
 * @return this - for setter chaining
 */
public native final PjaxBaseConfig navigateOnHash(boolean val) /*-{
this.navigateOnHash = val; 
return this; 
}-*/;

/**
 * Whether the page should be scrolled to the top after navigating to a URL.When the user clicks the browser's back button, the previous scroll position will be maintained.

 * @return
 */
public native final boolean scrollToTop() /*-{
return this.scrollToTop; 
}-*/;

/**
 * Whether the page should be scrolled to the top after navigating to a URL.When the user clicks the browser's back button, the previous scroll position will be maintained.
 * @param val
 * @return this - for setter chaining
 */
public native final PjaxBaseConfig scrollToTop(boolean val) /*-{
this.scrollToTop = val; 
return this; 
}-*/;

///**
// * Flag indicating whether or not this object has been through the destroy lifecycle phase.Default: false
// * @return
// */
//public native final boolean destroyed() /*-{
//return this.destroyed; 
//}-*/;
//
///**
// * Flag indicating whether or not this object has been through the destroy lifecycle phase.Default: false
// * @param val
// * @return this - for setter chaining
// */
//public native final PjaxConfig destroyed(boolean val) /*-{
//this.destroyed = val; 
//return this; 
//}-*/;
}
