package org.sgx.yuigwt.yui.widget.ext;

import org.sgx.yuigwt.yui.collection.ArrayList;
import org.sgx.yuigwt.yui.event.NodeEventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Point;
import org.sgx.yuigwt.yui.widget.WidgetConfig;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * configuration for WidgetExt
 * 
 * @author sg
 *
 */
public abstract class WidgetExtConfig extends WidgetConfig {
protected WidgetExtConfig(){}


//widgetAutoHide extension
//TODO: http://yuilibrary.com/yui/docs/api/classes/WidgetAutohide.html#attr_hideOn




//widgetbuttons

/**
 * 
 * @return
 */
public native final NodeEventCallback action() /*-{
return this.action; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig action(NodeEventCallback val) /*-{
this.action = $entry(function(e){val.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e)}); 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final JsArrayString classNames() /*-{
return this.classNames; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig classNames(String []val) /*-{
this.classNames = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val);  
return this; 
}-*/;
//
///**
// * Whether the button should be disabled.
// * @return
// */
//public native final boolean disabled() /*-{
//return this.disabled; 
//}-*/;
//
///**
// * Whether the button should be disabled.
// * @param val
// * @return this - for setter chaining
// */
//public native final WidgetExtConfig disabled(boolean val) /*-{
//this.disabled = val; 
//return this; 
//}-*/;

/**
 * Event name, or set of events and handlers to bind to the button node. See: Y.Node.on(), this value is passed as the first argument to on().
 * @return
 */
public native final String events() /*-{
return this.events; 
}-*/;

/**
 * Event name, or set of events and handlers to bind to the button node. See: Y.Node.on(), this value is passed as the first argument to on().
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig events(String val) /*-{
this.events = val; 
return this; 
}-*/;

/**
 * A name which can later be used to reference this button. If a button is defined on the BUTTONS property with this same name, its configuration properties will be merged in as defaults.
 * @return
 */
public native final String name() /*-{
return this.name; 
}-*/;

/**
 * A name which can later be used to reference this button. If a button is defined on the BUTTONS property with this same name, its configuration properties will be merged in as defaults.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig name(String val) /*-{
this.name = val; 
return this; 
}-*/;

/**
 * The WidgetStdMod section (header, body, footer) where the button should be added.
 * @return
 */
public native final String section() /*-{
return this.section; 
}-*/;

/**
 * The WidgetStdMod section (header, body, footer) where the button should be added.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig section(String val) /*-{
this.section = val; 
return this; 
}-*/;

/**
 * The index at which the button should be inserted. If not specified, the button will be added to the end of the section. This value is passed to the Array splice() method, therefore a negative value will insert the button that many items from the end.
 * @return
 */
public native final String template() /*-{
return this.template; 
}-*/;

/**
 * The index at which the button should be inserted. If not specified, the button will be added to the end of the section. This value is passed to the Array splice() method, therefore a negative value will insert the button that many items from the end.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig template(String val) /*-{
this.template = val; 
return this; 
}-*/;


//widgetautohide


/**
 * An array of objects corresponding to the nodes, events, and keycodes to
 * hide the widget on. The implementer can supply an array of objects, with
 * each object having the following properties: <br/>
 * eventName: (string, required): The eventName to listen to. <br/>
 * node: (Y.Node, optional): The Y.Node that will fire the event (defaults
 * to the boundingBox of the widget) <br/>
 * keyCode: (string, optional): If listening for key events, specify the
 * keyCode <br/>
 * By default, this attribute consists of one object which will cause the
 * widget to hide if the escape key is pressed.
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig hideOn(StateDescription[] val) /*-{
this.hideOn = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;
public native final WidgetExtConfig hideOn(String val) /*-{
this.hideOn = [{"eventName": val}]; //@org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;
/**
 * An array of objects corresponding to the nodes, events, and keycodes to
 * hide the widget on. The implementer can supply an array of objects, with
 * each object having the following properties: <br/>
 * eventName: (string, required): The eventName to listen to. <br/>
 * node: (Y.Node, optional): The Y.Node that will fire the event (defaults
 * to the boundingBox of the widget) <br/>
 * keyCode: (string, optional): If listening for key events, specify the
 * keyCode <br/>
 * By default, this attribute consists of one object which will cause the
 * widget to hide if the escape key is pressed.
 * 
 * @return
 */
public native final JsArray<StateDescription> hideOn() /*-{
return this.hideOn; 
}-*/;




//widgetmodality

/**
 * An array of objects corresponding to the nodes and events that will
 * trigger a re-focus back on the widget. The implementer can supply an
 * array of objects, with each object having the following properties: <br/>
 * eventName: (string, required): The eventName to listen to. <br/>
 * node: (Y.Node, optional): The Y.Node that will fire the event (defaults
 * to the boundingBox of the widget) <br/>
 * By default, this attribute consists of two objects which will cause the
 * widget to re-focus if anything outside the widget is clicked on or
 * focussed upon.
 * 
 * @return
 */
public native final WidgetExtConfig focusOn(StateDescription[] val) /*-{
this.focusOn = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;

/**
 * An array of objects corresponding to the nodes and events that will
 * trigger a re-focus back on the widget. The implementer can supply an
 * array of objects, with each object having the following properties: <br/>
 * eventName: (string, required): The eventName to listen to. <br/>
 * node: (Y.Node, optional): The Y.Node that will fire the event (defaults
 * to the boundingBox of the widget) <br/>
 * By default, this attribute consists of two objects which will cause the
 * widget to re-focus if anything outside the widget is clicked on or
 * focussed upon.
 * 
 * @return
 */
public native final JsArray<StateDescription> focusOn() /*-{
return this.focusOn; 
}-*/;

/**
 * Y.Node instance of the node being used as the mask.
 * @return
 */
public native final Node maskNode() /*-{
return this.maskNode; 
}-*/;

/**
 * Y.Node instance of the node being used as the mask.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig maskNode(Node val) /*-{
this.maskNode = val; 
return this; 
}-*/;

/**
 * Whether the widget should be modal or not.
 * @return
 */
public native final boolean modal() /*-{
return this.modal; 
}-*/;

/**
 * Whether the widget should be modal or not.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig modal(boolean val) /*-{
this.modal = val; 
return this; 
}-*/;




//WidgetPosition

/**
 * Page XY co-ordinate pair for the widget.
 * @return
 */
public native final Point xy() /*-{
return this.xy; 
}-*/;

/**
 * Page XY co-ordinate pair for the widget.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig xy(Point val) /*-{
this.xy = val; 
return this; 
}-*/;

/**
 * Page XY co-ordinate pair for the widget.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig xy(double x, double y) /*-{
this.xy = [x, y]; 
return this; 
}-*/;


/**
 * Page X co-ordinate for the widget. This attribute acts as a facade for the xy attribute. Changes in position can be monitored by listening for xyChange events.
 * @return
 */
public native final double x() /*-{
return this.x; 
}-*/;

/**
 * Page X co-ordinate for the widget. This attribute acts as a facade for the xy attribute. Changes in position can be monitored by listening for xyChange events.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig x(double val) /*-{
this.x = val; 
return this; 
}-*/;


/**
 * Page Y co-ordinate for the widget. This attribute acts as a facade for the xy attribute. Changes in position can be monitored by listening for xyChange events.
 * @return
 */
public native final double y() /*-{
return this.y; 
}-*/;

/**
 * Page Y co-ordinate for the widget. This attribute acts as a facade for the xy attribute. Changes in position can be monitored by listening for xyChange events.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig y(double val) /*-{
this.y = val; 
return this; 
}-*/;



//WidgetPositionAlign

/**
 * 
 * @return
 */
public native final Align align() /*-{
return this.align; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig align(Align val) /*-{
this.align = val; 
return this; 
}-*/;

/**
 * An Array of Objects corresponding to the Nodes and events that will cause the alignment of this widget to be synced to the DOM.
 * @return
 */
public native final WidgetExtConfig alignOn(StateDescription[] val) /*-{
this.alignOn = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;

/**
 * An Array of Objects corresponding to the Nodes and events that will cause the alignment of this widget to be synced to the DOM.
 * @return
 */
public native final JsArray<StateDescription> alignOn() /*-{
return this.alignOn; 
}-*/;

/**
 * A convenience Attribute, which can be used as a shortcut for the align Attribute.If set to true, the widget is centered in the viewport. If set to a Node reference or valid selector String, the widget will be centered within the Node. If set to false, no center positioning is applied.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig centered(boolean val) /*-{
this.centered = val; 
return this; 
}-*/;
/**
 * A convenience Attribute, which can be used as a shortcut for the align Attribute.If set to true, the widget is centered in the viewport. If set to a Node reference or valid selector String, the widget will be centered within the Node. If set to false, no center positioning is applied.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig centered(String val) /*-{
this.centered = val; 
return this; 
}-*/;

/**
 * A convenience Attribute, which can be used as a shortcut for the align Attribute.If set to true, the widget is centered in the viewport. If set to a Node reference or valid selector String, the widget will be centered within the Node. If set to false, no center positioning is applied.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig centered(Node val) /*-{
this.centered = val; 
return this; 
}-*/;



//WidgetPositionConstrain

/**
 * The node to constrain the widget's bounding box to, when setting xy. Can also be set to true, to constrain to the viewport.
 * @return
 */
public native final boolean constrain() /*-{
return this.constrain; 
}-*/;

/**
 * The node to constrain the widget's bounding box to, when setting xy. Can also be set to true, to constrain to the viewport.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig constrain(boolean val) /*-{
this.constrain = val; 
return this; 
}-*/;


/**
 * If set to true, and WidgetPositionAlign is also added to the Widget, constrained positioning will attempt to prevent the widget's bounding box from overlapping the element to which it has been aligned, by flipping the orientation of the alignment for corner based alignments
 * @return
 */
public native final boolean preventOverlap() /*-{
return this.preventOverlap; 
}-*/;

/**
 * If set to true, and WidgetPositionAlign is also added to the Widget, constrained positioning will attempt to prevent the widget's bounding box from overlapping the element to which it has been aligned, by flipping the orientation of the alignment for corner based alignments
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig preventOverlap(boolean val) /*-{
this.preventOverlap = val; 
return this; 
}-*/;



//WidgetStack

/**
 * Boolean flag to indicate whether or not a shim should be added to the Widgets boundingBox, to protect it from select box bleedthrough.
 * @return
 */
public native final boolean shim() /*-{
return this.shim; 
}-*/;

/**
 * Boolean flag to indicate whether or not a shim should be added to the Widgets boundingBox, to protect it from select box bleedthrough.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig shim(boolean val) /*-{
this.shim = val; 
return this; 
}-*/;


/**
 * The z-index to apply to the Widgets boundingBox. Non-numerical values for zIndex will be converted to 0
 * @return
 */
public native final int zIndex() /*-{
return this.zIndex; 
}-*/;

/**
 * The z-index to apply to the Widgets boundingBox. Non-numerical values for zIndex will be converted to 0
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig zIndex(int val) /*-{
this.zIndex = val; 
return this; 
}-*/;



//WidgetStdMod


/**
 * The content to be added to the body section. This will replace any existing content in the body. If you want to append, or insert new content, use the setStdModContent method.
 * @return
 */
public native final Node bodyContent() /*-{
return this.bodyContent; 
}-*/;

/**
 * The content to be added to the body section. This will replace any existing content in the body. If you want to append, or insert new content, use the setStdModContent method.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig bodyContent(Node val) /*-{
this.bodyContent = val; 
return this; 
}-*/;
/**
 * The content to be added to the body section. This will replace any existing content in the body. If you want to append, or insert new content, use the setStdModContent method.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig bodyContent(String val) /*-{
this.bodyContent = val; 
return this; 
}-*/;
/**
 * The section (WidgetStdMod.HEADER, WidgetStdMod.BODY or WidgetStdMod.FOOTER) which should be resized to fill the height of the standard module, when a height is set on the Widget. If a height is not set on the widget, then all sections are sized based on their content.
 * Default: WidgetStdMod.BODY
 * @return
 */
public native final String fillHeight() /*-{
return this.fillHeight; 
}-*/;

/**
 * The section (WidgetStdMod.HEADER, WidgetStdMod.BODY or WidgetStdMod.FOOTER) which should be resized to fill the height of the standard module, when a height is set on the Widget. If a height is not set on the widget, then all sections are sized based on their content.
 * Default: WidgetStdMod.BODY
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig fillHeight(String val) /*-{
this.fillHeight = val; 
return this; 
}-*/;

/**
 * The content to be added to the footer section. This will replace any existing content in the footer. If you want to append, or insert new content, use the setStdModContent method.
 * @return
 */
public native final Node footerContent() /*-{
return this.footerContent; 
}-*/;

/**
 * The content to be added to the footer section. This will replace any existing content in the footer. If you want to append, or insert new content, use the setStdModContent method.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig footerContent(Node val) /*-{
this.footerContent = val; 
return this; 
}-*/;

/**
 * The content to be added to the footer section. This will replace any existing content in the footer. If you want to append, or insert new content, use the setStdModContent method.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig footerContent(String val) /*-{
this.footerContent = val; 
return this; 
}-*/;
/**
 * The content to be added to the header section. This will replace any existing content in the header. If you want to append, or insert new content, use the setStdModContent method.
 * @return
 */
public native final Node headerContent() /*-{
return this.headerContent; 
}-*/;

/**
 * The content to be added to the header section. This will replace any existing content in the header. If you want to append, or insert new content, use the setStdModContent method.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig headerContent(Node val) /*-{
this.headerContent = val; 
return this; 
}-*/;
/**
 * The content to be added to the header section. This will replace any existing content in the header. If you want to append, or insert new content, use the setStdModContent method.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig headerContent(String val) /*-{
this.headerContent = val; 
return this; 
}-*/;






//WidgetParent - http://yuilibrary.com/yui/docs/api/classes/WidgetParent.html

///**
// * for the child can include a childType property, which is either a constructor function or a string which names a constructor function on the Y instance (e.g. "Tab" would refer to Y.Tab) (childType used to be named type, support for which has been deprecated, but is still maintained for backward compatibility. childType takes precedence over type if both are defined.
// * @return
// */
//public native final String type() /*-{
//return this.type; 
//}-*/;
//
///**
// * for the child can include a childType property, which is either a constructor function or a string which names a constructor function on the Y instance (e.g. "Tab" would refer to Y.Tab) (childType used to be named type, support for which has been deprecated, but is still maintained for backward compatibility. childType takes precedence over type if both are defined.
// * @param val
// * @return this - for setter chaining
// */
//public native final WidgetExtConfig type(String val) /*-{
//this.type = val; 
//return this; 
//}-*/;

/**
 * Returns the Widget's currently focused descendant Widget.
 * @return
 */
public native final WidgetExt activeDescendant() /*-{
return this.activeDescendant; 
}-*/;

/**
 * Returns the Widget's currently focused descendant Widget.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig activeDescendant(WidgetExt val) /*-{
this.activeDescendant = val; 
return this; 
}-*/;

/**
 * String representing the default type of the children managed by this Widget. Can also supply default type as a constructor reference.
 * @return
 */
public native final String defaultChildType() /*-{
return this.defaultChildType; 
}-*/;

/**
 * String representing the default type of the children managed by this Widget. Can also supply default type as a constructor reference.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig defaultChildType(String val) /*-{
this.defaultChildType = val; 
return this; 
}-*/;

/**
 * Boolean indicating if multiple children can be selected at once. Whether or not multiple selection is enabled is always delegated to the value of the multiple attribute of the root widget in the object hierarchy.
 * @return
 */
public native final boolean multiple() /*-{
return this.multiple; 
}-*/;

/**
 * Boolean indicating if multiple children can be selected at once. Whether or not multiple selection is enabled is always delegated to the value of the multiple attribute of the root widget in the object hierarchy.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig multiple(boolean val) /*-{
this.multiple = val; 
return this; 
}-*/;
/**
 * Returns the currently selected child Widget. If the mulitple attribte is set to true will return an Y.ArrayList instance containing the currently selected children. If no children are selected, will return null.
 * @return
 */
public native final WidgetExt selection() /*-{
return this.selection; 
}-*/;
/**
 * Returns the currently selected child Widget. If the mulitple attribte is set to true will return an Y.ArrayList instance containing the currently selected children. If no children are selected, will return null.
 * @return
 */
public native final ArrayList<WidgetExt> selectionList() /*-{
return this.selection; 
}-*/;

/**
 * Returns the currently selected child Widget. If the mulitple attribte is set to true will return an Y.ArrayList instance containing the currently selected children. If no children are selected, will return null.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig selection(WidgetExt val) /*-{
this.selection = val; 
return this; 
}-*/;

/**
 * Returns the currently selected child Widget. If the mulitple attribte is set to true will return an Y.ArrayList instance containing the currently selected children. If no children are selected, will return null.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig selection(ArrayList<WidgetExt> val) /*-{
this.selection = val; 
return this; 
}-*/;

 /**
  * TODO: the children property is not mentioned on the docs, but many widgetParent subclasses uses it, like gallery-form (children config)
  * @param val
  * @return
  */
public native final WidgetExtConfig children(JavaScriptObject... val) /*-{
this.children = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val); 
return this; 
}-*/;
/**
 * TODO: the children property is not mentioned on the docs, but many widgetParent subclasses uses it, like gallery-form (children config)
 * @param val
 * @return
 */
public final native WidgetExtConfig children(JsArray<WidgetExtConfig> val) /*-{
this.children = val;  
return this; 
}-*/;




//WidgetChild - http://yuilibrary.com/yui/docs/api/classes/WidgetChild.html
/**
 * DataTypeNumber representing the depth of this Widget relative to the root Widget in the object heirarchy.
 * @return
 */
public native final int depth() /*-{
return this.depth; 
}-*/;

/**
 * DataTypeNumber representing the depth of this Widget relative to the root Widget in the object heirarchy.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig depth(int val) /*-{
this.depth = val; 
return this; 
}-*/;

/**
 * DataTypeNumber representing the Widget's ordinal position in its parent Widget.
 * @return
 */
public native final int index() /*-{
return this.index; 
}-*/;

/**
 * DataTypeNumber representing the Widget's ordinal position in its parent Widget.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig index(int val) /*-{
this.index = val; 
return this; 
}-*/;

/**
 * Retrieves the parent of the Widget in the object hierarchy.
 * @return
 */
public native final WidgetExt parent() /*-{
return this.parent; 
}-*/;

/**
 * Retrieves the parent of the Widget in the object hierarchy.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig parent(WidgetExt val) /*-{
this.parent = val; 
return this; 
}-*/;

/**
 * Returns the root Widget in the object hierarchy. If the ROOT_TYPE property is set, the search for the root Widget will be constrained to parent Widgets of the specified type.
 * @return
 */
public native final WidgetExt root() /*-{
return this.root; 
}-*/;

/**
 * Returns the root Widget in the object hierarchy. If the ROOT_TYPE property is set, the search for the root Widget will be constrained to parent Widgets of the specified type.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig root(WidgetExt val) /*-{
this.root = val; 
return this; 
}-*/;

/**
 * DataTypeNumber indicating if the Widget is selected. Possible values are: </br>0- (Default) Not selected</br>1    Fully selected</br>2    Partially selected</br>Default: 0
 * @return
 */
public native final int selected() /*-{
return this.selected; 
}-*/;

/**
 * DataTypeNumber indicating if the Widget is selected. Possible values are: </br>0- (Default) Not selected</br>1    Fully selected</br>2    Partially selected</br>Default: 0
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetExtConfig selected(int val) /*-{
this.selected = val; 
return this; 
}-*/;
}
