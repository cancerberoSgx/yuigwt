package org.sgx.yuigwt.alloyui.widget.overlay;
/**
 * A base class for OverlayContext, providing:<br/>

    Widget Lifecycle (initializer, renderUI, bindUI, syncUI, destructor)<br/>
    Able to display an Overlay at a specified corner of an element trigger<br/>

Quick Example:
<pre>
var instance = new A.OverlayContext({
 boundingBox: '#OverlayBoundingBox',
 hideOn: 'mouseleave',
 showOn: 'mouseenter',
 trigger: '.menu-trigger'
}).render();
</pre>
TODO: does aui OverlayContext showOn() and hideOn() support StateDescription[] like yui's ? 
 * @author sg
 *
 */
public class OverlayContext extends OverlayBase {
protected OverlayContext(){}

/**
 * Clear the intervals to show or hide the OverlayContext. See hideDelay and showDelay.
 * @return self for method chaining
 */
public native final OverlayContext clearIntervals() /*-{
this.clearIntervals(); 
return this; 
}-*/;

/**
 * Refreshes the alignment of the OverlayContext with the currentNode. See also align.
 * @return self for method chaining
 */
public native final OverlayContext refreshAlign() /*-{
this.refreshAlign(); 
return this; 
}-*/;
}
