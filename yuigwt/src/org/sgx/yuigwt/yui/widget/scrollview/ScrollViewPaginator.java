package org.sgx.yuigwt.yui.widget.scrollview;

import org.sgx.yuigwt.yui.yui.PluginBase;
/**
 * Scrollview plugin that adds support for paging
 * @author sg
 *
 */
public class ScrollViewPaginator extends PluginBase {
protected ScrollViewPaginator(){}

/**
 *  Fires when the value for the configuration attribute index is changed. You can listen for the event using the on method if you wish to be notified before the attribute's value has changed, or using the after method if you wish to be notified after the attribute's value has changed.
 */
public static final String EVENT_INDEXCHANGE = "indexChange";

/**
 * Fires when the value for the configuration attribute selector is changed. You can listen for the event using the on method if you wish to be notified before the attribute's value has changed, or using the after method if you wish to be notified after the attribute's value has changed. 
 */
public static final String EVENT_SELECTORCHANGE = "selectorChange"; 
/**
 * Fires when the value for the configuration attribute total is changed. You can listen for the event using the on method if you wish to be notified before the attribute's value has changed, or using the after method if you wish to be notified after the attribute's value has changed. 
 */
public static final String EVENT_TOTALCHANGE = "selectorChange"; 

 
/**
 * Designated initializer
 * @return self for method chaining
 */
public native final ScrollViewPaginator initializer() /*-{
this.initializer(); 
return this; 
}-*/;
/**
 * Scroll to the next page in the scrollview, with animation
 * @return self for method chaining
 */
public native final ScrollViewPaginator next() /*-{
this.next(); 
return this; 
}-*/;

/**
 * Scroll to the previous page in the scrollview, with animation
 * @return self for method chaining
 */
public native final ScrollViewPaginator prev() /*-{
this.prev(); 
return this; 
}-*/;

/**
 * Scroll to a given page in the scrollview
 * @param index The index of the page to scroll to
 * @param duration The number of ms the animation should last
 * @return easing The timing function to use in the animation
 */
public native final ScrollView scrollTo(int index, int duration, String easing) /*-{
this.scrollTo(x, y); 
return this; 
}-*/;


//attrs
/**
 * The active page number for a paged scrollview. Default: 0
 * @return the attribute
 */
public final native int index()/*-{
return this.get("index");
}-*/;

/**
 * The active page number for a paged scrollview. Default: 0
 * @param val
 * @return self for method chaining
 */
public final native ScrollViewPaginator index(int val)/*-{
this.set("index", val);
return this; 
}-*/;



/**
 * CSS selector for a page inside the scrollview. The scrollview will snap to the closest page
 * @return the attribute
 */
public final native String selector()/*-{
return this.get("selector");
}-*/;

/**
 * CSS selector for a page inside the scrollview. The scrollview will snap to the closest page
 * @param val
 * @return self for method chaining
 */
public final native ScrollViewPaginator selector(String val)/*-{
this.set("selector", val);
return this; 
}-*/;

/**
 * 
 * @return the attribute
 */
public final native int total()/*-{
return this.get("total");
}-*/;

/**
 * 
 * @param val
 * @return self for method chaining
 */
public final native ScrollViewPaginator total(int val)/*-{
this.set("total", val);
return this; 
}-*/;
}
