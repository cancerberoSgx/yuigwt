package org.sgx.yuigwt.alloyui.widget.overlay;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeBase;

/**
 * TODO: does aui OverlayContext showOn() and hideOn() support StateDescription[] like yui's ? 
 * @author sg
 *
 */
public class OverlayContextConfig extends OverlayConfig {
protected OverlayContextConfig(){}

/**
 * Cancel auto hide delay if the user interact with the Overlay (focus, click, mouseover). Default: true
 * @return
 */
public native final boolean cancellableHide() /*-{
return this.cancellableHide; 
}-*/;

/**
 * Cancel auto hide delay if the user interact with the Overlay (focus, click, mouseover). Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final OverlayContextConfig cancellableHide(boolean val) /*-{
this.cancellableHide = val; 
return this; 
}-*/;

/**
 * OverlayContext allow multiple elements to be the trigger, the currentNode stores the current active one. Default: First item of the <a href="OverlayContext.html#config_trigger">trigger</a> NodeList.
 * @return
 */
public native final Node currentNode() /*-{
return this.currentNode; 
}-*/;

/**
 * OverlayContext allow multiple elements to be the trigger, the currentNode stores the current active one.Default: First item of the <a href="OverlayContext.html#config_trigger">trigger</a> NodeList.
 * @param val
 * @return this - for setter chaining
 */
public native final OverlayContextConfig currentNode(Node val) /*-{
this.currentNode = val; 
return this; 
}-*/;

/**
 * DataTypeNumber of milliseconds after the hide method is invoked to hide the OverlayContext. Default: 0
 * @return
 */
public native final int hideDelay() /*-{
return this.hideDelay; 
}-*/;

/**
 * DataTypeNumber of milliseconds after the hide method is invoked to hide the OverlayContext. Default: 0
 * @param val
 * @return this - for setter chaining
 */
public native final OverlayContextConfig hideDelay(int val) /*-{
this.hideDelay = val; 
return this; 
}-*/;

/**
 * If true the instance is registered on the OverlayContextManager static class and will be hide when the user click on document. Default: true
 * @return
 */
public native final boolean hideOnDocumentClick() /*-{
return this.hideOnDocumentClick; 
}-*/;

/**
 * If true the instance is registered on the OverlayContextManager static class and will be hide when the user click on document.Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final OverlayContextConfig hideOnDocumentClick(boolean val) /*-{
this.hideOnDocumentClick = val; 
return this; 
}-*/;

/**
 * DataTypeNumber of milliseconds after the show method is invoked to show the OverlayContext.Default: 0
 * @return
 */
public native final int showDelay() /*-{
return this.showDelay; 
}-*/;

/**
 * DataTypeNumber of milliseconds after the show method is invoked to show the OverlayContext.Default: 0
 * @param val
 * @return this - for setter chaining
 */
public native final OverlayContextConfig showDelay(int val) /*-{
this.showDelay = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String showOn() /*-{
return this.showOn; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final OverlayContextConfig showOn(String val) /*-{
this.showOn = val; 
return this; 
}-*/;

//TODO: does aui OverlayContext showOn() and hideOn() support StateDescription[] like yui's ?

/**
 * Node, NodeList or Selector which will be used as trigger elements to show or hide the OverlayContext. Default: null
 * @return
 */
public native final NodeBase trigger() /*-{
return this.trigger; 
}-*/;

/**
 * Node, NodeList or Selector which will be used as trigger elements to show or hide the OverlayContext. Default: null
 * @param val
 * @return this - for setter chaining
 */
public native final OverlayContextConfig trigger(NodeBase val) /*-{
this.trigger = val; 
return this; 
}-*/;
/**
 * Node, NodeList or Selector which will be used as trigger elements to show or hide the OverlayContext. Default: null
 * @param val
 * @return this - for setter chaining
 */
public native final OverlayContextConfig trigger(String val) /*-{
this.trigger = val; 
return this; 
}-*/;

/**
 * True if Overlay should use ARIA plugin
 * @return
 */
public native final boolean useARIA() /*-{
return this.useARIA; 
}-*/;

/**
 * True if Overlay should use ARIA plugin
 * @param val
 * @return this - for setter chaining
 */
public native final OverlayContextConfig useARIA(boolean val) /*-{
this.useARIA = val; 
return this; 
}-*/;

/**
 * If true the OverlayContext is visible by default after the render phase. Inherited from Overlay. Default: false
 * @return
 */
public native final boolean visible() /*-{
return this.visible; 
}-*/;

/**
 * If true the OverlayContext is visible by default after the render phase. Inherited from Overlay. Default: false
 * @param val
 * @return this - for setter chaining
 */
public native final OverlayContextConfig visible(boolean val) /*-{
this.visible = val; 
return this; 
}-*/;
}
