package org.sgx.yuigwt.yui.pjax;

import org.sgx.yuigwt.yui.node.Node;

public class PjaxConfig extends PjaxBaseConfig {
protected PjaxConfig(){}
public static final native PjaxConfig create()/*-{
	return {}; 
}-*/;
/**
 * If true, a "pjax=1" query parameter will be appended to all URLs requested via Pjax.
<br/>
Browsers ignore HTTP request headers when caching content, so if the same URL is used to request a partial Pjax page and a full page, the browser will cache them under the same key and may later load the cached partial page when the user actually requests a full page (or vice versa).
<br/>
To prevent this, we can add a bogus query parameter to the URL so that Pjax URLs will always be cached separately from non-Pjax URLs.
<br/>
Default: true
 * @return
 */
public native final boolean addPjaxParam() /*-{
return this.addPjaxParam; 
}-*/;

/**
 * If true, a "pjax=1" query parameter will be appended to all URLs requested via Pjax.
<br/>
Browsers ignore HTTP request headers when caching content, so if the same URL is used to request a partial Pjax page and a full page, the browser will cache them under the same key and may later load the cached partial page when the user actually requests a full page (or vice versa).
<br/>
To prevent this, we can add a bogus query parameter to the URL so that Pjax URLs will always be cached separately from non-Pjax URLs.
<br/>
Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final PjaxConfig addPjaxParam(boolean val) /*-{
this.addPjaxParam = val; 
return this; 
}-*/;

/**
 * Node into which content should be inserted when a page is loaded via Pjax. This node's existing contents will be removed to make way for the new content.
<br/>
If not set, loaded content will not be automatically inserted into the page.
<br/>
Default: null
 * @return
 */
public native final Node container() /*-{
return this.container; 
}-*/;

/**
 * Node into which content should be inserted when a page is loaded via Pjax. This node's existing contents will be removed to make way for the new content.
<br/>
If not set, loaded content will not be automatically inserted into the page.
<br/>
Default: null
 * @param val
 * @return this - for setter chaining
 */
public native final PjaxConfig container(Node val) /*-{
this.container = val; 
return this; 
}-*/;
/**
 * Node into which content should be inserted when a page is loaded via Pjax. This node's existing contents will be removed to make way for the new content.
<br/>
If not set, loaded content will not be automatically inserted into the page.
<br/>
Default: null
 * @param val
 * @return this - for setter chaining
 */
public native final PjaxConfig container(String val) /*-{
this.container = val; 
return this; 
}-*/;

/**
 * CSS selector used to extract a specific portion of the content of a page loaded via Pjax.
<br/>
For example, if you wanted to load the page example.html but only use the content within an element with the id "pjax-content", you'd set contentSelector to "#pjax-content".
<br/>
If not set, the entire page will be used.
<br/>
Default: null
 * @return
 */
public native final String contentSelector() /*-{
return this.contentSelector; 
}-*/;

/**
 * CSS selector used to extract a specific portion of the content of a page loaded via Pjax.
<br/>
For example, if you wanted to load the page example.html but only use the content within an element with the id "pjax-content", you'd set contentSelector to "#pjax-content".
<br/>
If not set, the entire page will be used.
<br/>
Default: null
 * @param val
 * @return this - for setter chaining
 */
public native final PjaxConfig contentSelector(String val) /*-{
this.contentSelector = val; 
return this; 
}-*/;


/**
 * Time in milliseconds after which an Ajax request should time out. When a timeout occurs, the error event will be fired. Default: 30000
 * 
 * @return
 */
public native final int timeout() /*-{
return this.timeout; 
}-*/;

/**
 * Time in milliseconds after which an Ajax request should time out. When a timeout occurs, the error event will be fired. Default: 30000
 * @param val
 * @return this - for setter chaining
 */
public native final PjaxConfig timeout(int val) /*-{
this.timeout = val; 
return this; 
}-*/;

/**
 * CSS selector used to extract a page title from the content of a page loaded via Pjax. By default this is set to extract the title from the <title> element, but you could customize it to extract the title from an <h1>, or from any other element, if that's more appropriate for the content you're loading. Default: "title"
 * @return
 */
public native final String titleSelector() /*-{
return this.titleSelector; 
}-*/;

/**
 * CSS selector used to extract a page title from the content of a page loaded via Pjax. By default this is set to extract the title from the <title> element, but you could customize it to extract the title from an <h1>, or from any other element, if that's more appropriate for the content you're loading. Default: "title"
 * @param val
 * @return this - for setter chaining
 */
public native final PjaxConfig titleSelector(String val) /*-{
this.titleSelector = val; 
return this; 
}-*/;
}
