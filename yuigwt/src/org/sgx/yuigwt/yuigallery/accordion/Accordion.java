package org.sgx.yuigwt.yuigallery.accordion;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.Widget;
/**
 * Accordion creates an widget, consists of one or more items, which can be collapsed, expanded, set as always visible and reordered by using Drag&Drop. Collapsing/expanding might be animated.
 * @see http://yuilibrary.com/gallery/show/accordion
 * original doc http://ipeychev.github.com/yui3-gallery/gallery-accordion/3.3.0_1.14/apidocs/Accordion.html 
 * @author sg
 *
 */
public class Accordion extends Widget {
protected Accordion(){}

/**
 * Add an item to Accordion. Items could be added/removed multiple times and they will be rendered in the process of adding, if not. The item will be expanded, collapsed, or set as always visible depending on the settings. Item's properties will be also updated, if they are incomplete. For example, if alwaysVisible is true, but expanded property is false, it will be set to true also. If the second param, parentItem is an Y.AccordionItem instance, registered in Accordion, the item will be added as child of the parentItem.
 * @param item The item to be added in Accordion
 * @param parentItem This item will be the parent of the item being added
 * @return True in case of successfully added item, false otherwise
 */
public native final boolean addItem(AccordionItem item, AccordionItem parentItem) /*-{
return this.addItem(item, parentItem);
}-*/;
/**
 * Add an item to Accordion. Items could be added/removed multiple times and they will be rendered in the process of adding, if not. The item will be expanded, collapsed, or set as always visible depending on the settings. Item's properties will be also updated, if they are incomplete. For example, if alwaysVisible is true, but expanded property is false, it will be set to true also. If the second param, parentItem is an Y.AccordionItem instance, registered in Accordion, the item will be added as child of the parentItem.
 * @param item The item to be added in Accordion
 * @return True in case of successfully added item, false otherwise
 */
public native final boolean addItem(AccordionItem item) /*-{
return this.addItem(item);
}-*/;

/**
 * Searching for item, previously registered in Accordion 
 * @param param If number, this must be item's index. If Node, it should be the value of item's contentBox or boundingBox properties
 * @return The found item or null
 */
public native final AccordionItem getItem(int param) /*-{
return this.getItem(param); 
}-*/;
/**
 * Searching for item, previously registered in Accordion 
 * @param param If number, this must be item's index. If Node, it should be the value of item's contentBox or boundingBox properties
 * @return The found item or null
 */
public native final AccordionItem getItem(Node param) /*-{
return this.getItem(param); 
}-*/;
/**
 * The found item or null
 * @param i The item which index should be returned
 * @return Item index or -1 if item has been not found
 */
public native final int getItemIndex(AccordionItem i) /*-{
return this.getItemIndex(i); 
}-*/;
/**
 * Removes an previously registered item in Accordion 
 * @param i The removed item or null if not found
 * @return The removed item or null if not found
 */
public native final int removeItem(AccordionItem i) /*-{
return this.removeItem(i); 
}-*/;

/**
 * Removes an previously registered item in Accordion 
 * @param i The removed item or null if not found
 * @return The removed item or null if not found
 */
public native final int removeItem(int i) /*-{
return this.removeItem(i); 
}-*/;
}
