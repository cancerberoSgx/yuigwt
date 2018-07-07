package org.sgx.yuigwt.yui.get;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;

/**
 *this represent a  
 * errors.get(0).request() {attributes, url, purgethreshold, type, doc,
 * pollInterval, win, node, error, finished, }
 * </br>
 * TODO: cannot find the dcumentation for this object - returned by
 * errors.get(0).request() - this is an object dump : 
 * 
 * <pre>
 *  {attributes: [object Object], 
 *  url: http://127.0
 * .0.1:8888/org.sgx.yuigwt.YuiGwtTestLocal/testfiles/jsNotExists123.css,
 * purgethreshold: 20, 
 * type: css, 
 * doc: [object HTMLDocument],
 *  pollInterval: 50,
 * win: [object Window], 
 * node: [object HTMLLinkElement], 
 * error: Failed to load
 * http
 * ://127.0.0.1:8888/org.sgx.yuigwt.YuiGwtTestLocal/testfiles/jsNotExists123.
 * css, 
 * finished: true, }
 * </pre>
 * 
 * @author sg
 * 
 */
public class GetRequest extends JavaScriptObject {
protected GetRequest(){}
/**
 * 
 * @return
 */
public native final JavaScriptObject attributes() /*-{
return this.attributes; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetRequest attributes(JavaScriptObject val) /*-{
this.attributes = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final String url() /*-{
return this.url; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetRequest url(String val) /*-{
this.url = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final int purgethreshold() /*-{
return this.purgethreshold; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetRequest purgethreshold(int val) /*-{
this.purgethreshold = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final int pollInterval() /*-{
return this.pollInterval; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetRequest pollInterval(int val) /*-{
this.pollInterval = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final Document doc() /*-{
return this.doc; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetRequest doc(Document val) /*-{
this.doc = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final String type() /*-{
return this.type; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetRequest type(String val) /*-{
this.type = val; 
return this; 
}-*/;
/**
 * Window Element object
 * @return
 */
public native final Element win() /*-{
return this.win; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetRequest win(Element val) /*-{
this.win = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final Element node() /*-{
return this.node; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetRequest node(Element val) /*-{
this.node = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final String error() /*-{
return this.error; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetRequest error(String val) /*-{
this.error = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final boolean finished() /*-{
return this.finished; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GetRequest finished(boolean val) /*-{
this.finished = val; 
return this; 
}-*/;
}
