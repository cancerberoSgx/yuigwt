package org.sgx.yuigwt.yui.widget.scrollview;

import org.sgx.yuigwt.yui.base.Base;
import org.sgx.yuigwt.yui.yui.PluginBase;

/**
 * @see http://yuilibrary.com/yui/docs/api/classes/Plugin.ScrollViewScrollbars.htm
 * @author sg
 *
 */
public class ScrollViewScrollbars extends PluginBase {
protected ScrollViewScrollbars(){}

//public static native final ScrollViewScrollbars getFor(Base b)/*-{
//	return this.
//}-*/;

/**
 * Momentarily flash the scroll bars to indicate current scroll position
 * @return self for method chaining
 */
public native final ScrollViewScrollbars flash() /*-{
this.flash(); 
return this; 
}-*/;
/**
 * Hide the scroll bar indicators
 * @return
 */
public native final ScrollViewScrollbars hide() /*-{
this.hide(); 
return this; 
}-*/;
/**
 * Hide the scroll bar indicators
 * @return
 */
public native final ScrollViewScrollbars hide(boolean animate) /*-{
this.hide(animate); 
return this; 
}-*/;
/**
 * shows the scroll bar indicators
 * @return
 */
public native final ScrollViewScrollbars show() /*-{
this.show(); 
return this; 
}-*/;
/**
 * shows the scroll bar indicators
 * @return
 */
public native final ScrollViewScrollbars show(boolean animate) /*-{
this.show(animate); 
return this; 
}-*/;
}
