package org.sgx.yuigwt.yui.pjax;

import org.sgx.yuigwt.yui.router.Router;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * Y.Router extension that provides the core plumbing for enhanced navigation implemented using the pjax technique (HTML5 pushState + Ajax).
<br/>
This makes it easy to enhance the navigation between the URLs of an application in HTML5 history capable browsers by delegating to the router to fulfill the "request" and seamlessly falling-back to using standard full-page reloads in older, less-capable browsers.
<br/>
The PjaxBase class isn't useful on its own, but can be mixed into a Router-based class to add Pjax functionality to that Router. For a pre-made standalone Pjax router, see the Pjax class.
<pre>
var MyRouter = Y.Base.create('myRouter', Y.Router, [Y.PjaxBase], {
    // ...
});
</pre>

 * @author sg
 *
 */
public class PjaxBase extends Router {
protected PjaxBase(){}
/**
 * Navigates to the specified URL if there is a route handler that matches. In browsers capable of using HTML5 history, the navigation will be enhanced by firing the navigate event and having the router handle the "request". Non-HTML5 browsers will navigate to the new URL via manipulation of window.location.
<br/>
When there is a route handler for the specified URL and it is being navigated to, this method will return true, otherwise it will return false.
<br/>
Note: The specified URL must be of the same origin as the current URL, otherwise an error will be logged and navigation will not occur. This is intended as both a security constraint and a purposely imposed limitation as it does not make sense to tell the router to navigate to a URL on a different scheme, host, or port.

 * @return true if the URL was navigated to, false otherwise. 
 */
public native final boolean navigate(String url, NavigateOpts options) /*-{
return this.navigate(url, options);
}-*/;

/**
 * Whether navigating to a hash-fragment identifier on the current page should be enhanced and cause the navigate event to fire.By default Pjax allows the browser to perform its default action when a user is navigating within a page by clicking in-page links (e.g. <a href="#top">Top of page</a>) and does not attempt to interfere or enhance in-page navigation. Default false
 * @return self for method chaining
 */
public native final PjaxBase navigateOnHash(boolean val) /*-{
this.navigateOnHash(val); 
return this; 
}-*/;

/**
 * Whether the page should be scrolled to the top after navigating to a URL.When the user clicks the browser's back button, the previous scroll position will be maintained.Default: true
 * @return self for method chaining
 */
public native final PjaxBase scrollToTop(boolean val) /*-{
this.scrollToTop(val); 
return this; 
}-*/;
}
