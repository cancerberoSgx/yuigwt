package org.sgx.yuigwt.yuigallery.accordion;

import org.sgx.yuigwt.yui.widget.Widget;

public class AccordionItem extends Widget {
protected AccordionItem(){}

/**
 * Marks the item as always visible by adding class to always visible icon. The icon will be updated only if needed. 
 * @param b If true, the item should be marked as always visible.
 * @return Return true if the icon has been updated, false if there was no need to update
 */
public native final boolean markAsAlwaysVisible(boolean b) /*-{
return markAsAlwaysVisible(b); 
}-*/;

/**
 * Marks the item as collapsing by adding class to expand icon. The method will update icon only if needed.
 * @param b Boolean indicating that the item should be marked as collapsing.
 * @return Return true if the icon has been updated, false if there was no need to update
 */
public native final boolean markAsCollapsing(boolean b) /*-{
return markAsCollapsing(b); 
}-*/;

/**
 * Marks the item as expanded by adding class to expand icon. The icon will be updated only if needed.
 * @param b Boolean indicating that item should be marked as expanded.
 * @return Return true if the icon has been updated, false if there was no need to update
 */
public native final boolean markAsExpanded(boolean b) /*-{
return markAsExpanded(b); 
}-*/;

/**
 * Marks the item as expanding by adding class to expand icon. The method will update icon only if needed. 
 * @param b Boolean indicating that the item should be marked as expanding.
 * @return Return true if the icon has been updated, false if there was no need to update
 */
public native final boolean markAsExpanding(boolean b) /*-{
return markAsExpanding(b); 
}-*/;

/**
 * Forces the item to resize as result of direct content manipulation (via 'innerHTML'). This method should be invoked if 'contentHeight' property has been set to 'auto'. 
 * @return self for method chaining
 */
public native final AccordionItem resize() /*-{
this.resize(); 
return this; 
}-*/;
}
