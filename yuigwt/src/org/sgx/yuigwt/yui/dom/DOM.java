package org.sgx.yuigwt.yui.dom;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
/**
 * Provides DOM helper methods.
 * @see http://yuilibrary.com/yui/docs/api/classes/DOM.html
 * 
 * TODO: addHTML, byId, elementByAxis, .....
 * @author sg
 *
 */
public class DOM extends JavaScriptObject {
protected DOM(){}
/**
 * Adds a class name to a given DOM element.
 * @param e The DOM element
 * @param className the class name to add to the class attribute
 */
public native final void addClass(Element e, String className) /*-{
this.addClass(e, className); 
}-*/;
/**
 * Determines whether or not one HTMLElement is or contains another HTMLElement.
 * @param element The containing html element.
 * @param needle The html element that may be contained.
 * @return Whether or not the element is or contains the needle. 
 */
public native final boolean contains(Element element , Element needle) /*-{
return this.contains(element, needle); 
}-*/;
/**
 * Creates a new dom node using the provided markup string.
 * @param html The markup used to create the element
 * @param doc An optional document context
 * @return returns a single HTMLElement when creating one node, and a documentFragment when creating multiple nodes. 
 */
public native final Element create(String html, Document doc) /*-{
return this.create(html, doc); 
}-*/;
/**
 * Document height
 * @return The current height of the document. 
 */
public native final int docHeight() /*-{
return this.docHeight(); 
}-*/;
/**
 * Amount page has been scroll horizontally
 * @return he current amount the screen is scrolled horizontally. 
 */
public native final int docScrollX() /*-{
return this.docScrollX(); 
}-*/;
/**
 * Amount page has been scroll vertically
 * @return The current amount the screen is scrolled vertically. 
 */
public native final int docScrollY() /*-{
return this.docScrollY(); 
}-*/;
/**Document width
 * @return The current width of the document. 
 */
public native final int docWidth() /*-{
return this.docWidth(); 
}-*/;
/**
 * Provides a normalized attribute interface.
 * @param el The target element for the attribute.
 * @param attr The attribute to get.
 * @return The current value of the attribute. 
 */
public native final String getAttribute(Element el, String attr) /*-{
return this.getAttribute(el, attr); 
}-*/;
/**
 * Returns the computed style for the given node.
 * @param el HTMLElement to get the style from.
 * @param attr The style property to get.
 * @return The computed value of the style property. 
 */
public native final String getComputedStyle(Element el, String attr) /*-{
return this.getComputedStyle(el, attr); 
}-*/;
}
