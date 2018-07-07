package org.sgx.yuigwt.yui.dd;

import org.sgx.yuigwt.yui.base.BaseConfig;
import org.sgx.yuigwt.yui.graphic.Shape;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JsArrayString;

public class DragConfig extends BaseConfig {
protected DragConfig(){}
public static final native DragConfig create()/*-{
	return {}; 
}-*/;

/**
 * This config option is set by DragConfig to inform you of which handle fired the DragConfig event (in the case that there are several handles): default false.
 * @return
 */
public native final Node activeHandle() /*-{
return this.activeHandle; 
}-*/;

/**
 * This config option is set by DragConfig to inform you of which handle fired the DragConfig event (in the case that there are several handles): default false.
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig activeHandle(Node val) /*-{
this.activeHandle = val; 
return this; 
}-*/;

/**
 * The number of pixels to move to start a DragConfig operation, default is 3.
 * @return
 */
public native final int clickPixelThresh() /*-{
return this.clickPixelThresh; 
}-*/;

/**
 * The number of pixels to move to start a DragConfig operation, default is 3.
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig clickPixelThresh(int val) /*-{
this.clickPixelThresh = val; 
return this; 
}-*/;

/**
 * The number of milliseconds a mousedown has to pass to start a DragConfig operation, default is 1000.
 * @return
 */
public native final int clickTimeThresh() /*-{
return this.clickTimeThresh; 
}-*/;

/**
 * The number of milliseconds a mousedown has to pass to start a DragConfig operation, default is 1000.
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig clickTimeThresh(int val) /*-{
this.clickTimeThresh = val; 
return this; 
}-*/;
/**
 * This attribute only works if the dd-drop module is active. It will set the dragMode (point, intersect, strict) of this DragConfig instance.
 * @return
 */
public native final String dragMode() /*-{
return this.dragMode; 
}-*/;

/**
 * This attribute only works if the dd-drop module is active. It will set the dragMode (point, intersect, strict) of this DragConfig instance.
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig dragMode(String val) /*-{
this.dragMode = val; 
return this; 
}-*/;

/**
 * Y.Node instance to use as the draggable element, defaults to node
 * @return
 */
public native final Node dragNode() /*-{
return this.dragNode; 
}-*/;

/**
 * Y.Node instance to use as the draggable element, defaults to node
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig dragNode(Node val) /*-{
this.dragNode = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final Node node() /*-{
return this.node; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig node(Node val) /*-{
this.node = val; 
return this; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig node(String val) /*-{
this.node = val; 
return this; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig node(Shape val) /*-{
this.node = val; 
return this; 
}-*/;
/**
 * Should the mousedown event be halted. Default: true
 * @return
 */
public native final boolean haltDown() /*-{
return this.haltDown; 
}-*/;

/**
 * Should the mousedown event be halted. Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig haltDown(boolean val) /*-{
this.haltDown = val; 
return this; 
}-*/;

/**
 * Array of valid handles to add. Adding something here will set all handles, even if previously added with addHandle
 * @return
 */
public native final JsArrayString handles() /*-{
return this.handles; 
}-*/;

/**
 * Array of valid handles to add. Adding something here will set all handles, even if previously added with addHandle
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig handles(JsArrayString val) /*-{
this.handles = val; 
return this; 
}-*/;
/**
 * Array of valid handles to add. Adding something here will set all handles, even if previously added with addHandle
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig handles(String[] val) /*-{
this.handles = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(val); 
return this; 
}-*/;
/**
 * Set to lock this DragConfig element so that it can't be dragged: default false.
 * @return
 */
public native final boolean lock() /*-{
return this.lock; 
}-*/;

/**
 * Set to lock this DragConfig element so that it can't be dragged: default false.
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig lock(boolean val) /*-{
this.lock = val; 
return this; 
}-*/;

/**
 * If this is false, the DragConfig element will not move with the cursor: default true. Can be used to "resize" the element.
 * @return
 */
public native final boolean move() /*-{
return this.move; 
}-*/;

/**
 * If this is false, the DragConfig element will not move with the cursor: default true. Can be used to "resize" the element.
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig move(boolean val) /*-{
this.move = val; 
return this; 
}-*/;

/**
 * Offset the DragConfig element by the difference in cursor position: default true
 * @return
 */
public native final boolean offsetNode() /*-{
return this.offsetNode; 
}-*/;

/**
 * Offset the DragConfig element by the difference in cursor position: default true
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig offsetNode(boolean val) /*-{
this.offsetNode = val; 
return this; 
}-*/;

/**
 * By default a DragConfig operation will only begin if the mousedown occurred with the primary mouse button. Setting this to false will allow for all mousedown events to trigger a drag.
 * @return
 */
public native final boolean  primaryButtonOnly() /*-{
return this.primaryButtonOnly; 
}-*/;

/**
 * By default a DragConfig operation will only begin if the mousedown occurred with the primary mouse button. Setting this to false will allow for all mousedown events to trigger a drag.
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig primaryButtonOnly(boolean  val) /*-{
this.primaryButtonOnly = val; 
return this; 
}-*/;

/**
 * Center the dragNode to the mouse position on drag:start: default false
 * @return
 */
public native final boolean startCentered() /*-{
return this.startCentered; 
}-*/;

/**
 * Center the dragNode to the mouse position on drag:start: default false
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig startCentered(boolean val) /*-{
this.startCentered = val; 
return this; 
}-*/;

/**
 * This attribute only works if the dd-drop module has been loaded. It will make this node a drop target as well as draggable.
 * @return
 */
public native final boolean target() /*-{
return this.target; 
}-*/;

/**
 * This attribute only works if the dd-drop module has been loaded. It will make this node a drop target as well as draggable.
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig target(boolean val) /*-{
this.target = val; 
return this; 
}-*/;

/**
 * Use the protective shim on all DragConfig operations: default true. Only works with dd-ddm, not dd-ddm-base.
 * @return
 */
public native final boolean useShim() /*-{
return this.useShim; 
}-*/;

/**
 * Use the protective shim on all DragConfig operations: default true. Only works with dd-ddm, not dd-ddm-base.
 * @param val
 * @return this - for setter chaining
 */
public native final DragConfig useShim(boolean val) /*-{
this.useShim = val; 
return this; 
}-*/;
}
