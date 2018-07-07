package org.sgx.yuigwt.yui.widget.ext;

import org.sgx.yuigwt.yui.collection.ArrayList;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeBase;
import org.sgx.yuigwt.yui.util.Point;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.button.Button;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;

/**
 * java api for yui3 widget extensions part of the standar YUI distribution:
 * WidgetButtons, WidgetAutohide, WidgetModality, WidgetParent, WidgetPosition,
 * WidgetPositionAlign, WidgetPositionConstrain, WidgetStack
 * 
 * <h2>WidgetButtons</h2> Provides header/body/footer button support for Widgets
 * that use the WidgetStdMod extension.<br/>
 * This Widget extension makes it easy to declaratively configure a widget's
 * buttons. It adds a buttons attribute along with button- accessor and mutator
 * methods. All button nodes have the Y.Plugin.Button plugin applied.<br/>
 * This extension also includes HTML_PARSER support to seed a widget's buttons
 * from those which already exist in its DOM.
 * 
 * <h2WidgetAutohide></h2> The WidgetAutohide class provides the hideOn
 * attribute which can be used to hide the widget when certain events occur.
 * 
 * <h2>WidgetModality</h2> Widget extension, which can be used to add modality
 * support to the base Widget class, through the Base.create method.
 * 
 * <h2>WidgetParent</h2> Widget extension providing functionality enabling a
 * Widget to be a parent of another Widget. In addition to the set of attributes
 * supported by WidgetParent, the constructor configuration object can also
 * contain a children which can be used to add child widgets to the parent
 * during construction. The children property is an array of either child widget
 * instances or child widget configuration objects, and is sugar for the add
 * method. See the add for details on the structure of the child widget
 * configuration object.
 * 
 * <h2>WidgetPosition</h2> Widget extension, which can be used to add
 * positioning support to the base Widget class, through the Base.build method.
 * 
 * <h2>WidgetPositionAlign</h2>
 * 
 * Widget extension, which can be used to add extended XY positioning support to
 * the base Widget class, through the Base.create method. Note: This extension
 * requires that the WidgetPosition extension be added to the Widget (before
 * WidgetPositionAlign, if part of the same extension list passed to
 * Base.build).
 * 
 * <h2>WidgetPositionConstrain</h2> A widget extension, which can be used to add
 * constrained xy positioning support to the base Widget class, through the
 * Base.build method. This extension requires that the WidgetPosition extension
 * be added to the Widget (before WidgetPositionConstrain, if part of the same
 * extension list passed to Base.build).
 * 
 * <h2>WidgetStack</h2> Widget extension, which can be used to add stackable
 * (z-index) support to the base Widget class along with a shimming solution,
 * through the Base.build method.
 * 
 * <h2>WidgetParent</h2>
 * <p>
 * Widget extension providing functionality enabling a Widget to be a parent of
 * another Widget.In addition to the set of attributes supported by
 * WidgetParent, the constructor configuration object can also contain a
 * children which can be used to add child widgets to the parent during
 * construction. The children property is an array of either child widget
 * instances or child widget configuration objects, and is sugar for the add
 * method. See the add for details on the structure of the child widget
 * configuration object.
 * </p>
 * 
 * @author sg
 * 
 */
public class WidgetExt extends Widget {
	protected WidgetExt() {
	}

	// WidgetButtons

	/**
	 * @param button
	 *            The button to add. This can be a Y.Node instance, config
	 *            Object, or String name for a predefined button on the BUTTONS
	 *            prototype property. When a config Object is provided, it will
	 *            be merged with any defaults provided by any srcNode and/or a
	 *            button with the same name defined on the BUTTONS property.
	 * @param section
	 *            The WidgetStdMod section (header/body/footer) where the button
	 *            should be added. This takes precedence over the button.section
	 *            configuration property.
	 * @return
	 */
	public final native WidgetExt addButton(Node button)/*-{
		this.addButton(button);
		return this;
	}-*/;

	/**
	 * @param button
	 *            The button to add. This can be a Y.Node instance, config
	 *            Object, or String name for a predefined button on the BUTTONS
	 *            prototype property. When a config Object is provided, it will
	 *            be merged with any defaults provided by any srcNode and/or a
	 *            button with the same name defined on the BUTTONS property.
	 * @param section
	 *            The WidgetStdMod section (header/body/footer) where the button
	 *            should be added. This takes precedence over the button.section
	 *            configuration property.
	 * @return
	 */
	public final native WidgetExt addButton(Button b)/*-{
		this.addButton(b.get("srcNode"));
		return this;
	}-*/;

	/**
	 * @param button
	 *            The button to add. This can be a Y.Node instance, config
	 *            Object, or String name for a predefined button on the BUTTONS
	 *            prototype property. When a config Object is provided, it will
	 *            be merged with any defaults provided by any srcNode and/or a
	 *            button with the same name defined on the BUTTONS property.
	 * @param section
	 *            The WidgetStdMod section (header/body/footer) where the button
	 *            should be added. This takes precedence over the button.section
	 *            configuration property.
	 * @return
	 */
	public final native WidgetExt addButton(Button b, String section)/*-{
		this.addButton(b.get("srcNode"), section);
		return this;
	}-*/;

	/**
	 * @param button
	 *            The button to add. This can be a Y.Node instance, config
	 *            Object, or String name for a predefined button on the BUTTONS
	 *            prototype property. When a config Object is provided, it will
	 *            be merged with any defaults provided by any srcNode and/or a
	 *            button with the same name defined on the BUTTONS property.
	 * @param section
	 *            The WidgetStdMod section (header/body/footer) where the button
	 *            should be added. This takes precedence over the button.section
	 *            configuration property.
	 * @return
	 */
	public final native WidgetExt addButton(String button)/*-{
		this.addButton(button);
		return this;
	}-*/;

	/**
	 * @param button
	 *            The button to add. This can be a Y.Node instance, config
	 *            Object, or String name for a predefined button on the BUTTONS
	 *            prototype property. When a config Object is provided, it will
	 *            be merged with any defaults provided by any srcNode and/or a
	 *            button with the same name defined on the BUTTONS property.
	 * @param section
	 *            The WidgetStdMod section (header/body/footer) where the button
	 *            should be added. This takes precedence over the button.section
	 *            configuration property.
	 * @return
	 */
	public final native WidgetExt addButton(WidgetButtonsConfig button)/*-{
		this.addButton(button);
		return this;
	}-*/;

	/**
	 * @param button
	 *            The button to add. This can be a Y.Node instance, config
	 *            Object, or String name for a predefined button on the BUTTONS
	 *            prototype property. When a config Object is provided, it will
	 *            be merged with any defaults provided by any srcNode and/or a
	 *            button with the same name defined on the BUTTONS property.
	 * @param section
	 *            The WidgetStdMod section (header/body/footer) where the button
	 *            should be added. This takes precedence over the button.section
	 *            configuration property.
	 * @return
	 */
	public final native WidgetExt addButton(Node button, String section)/*-{
		this.addButton(button, section);
		return this;
	}-*/;

	/**
	 * @param button
	 *            The button to add. This can be a Y.Node instance, config
	 *            Object, or String name for a predefined button on the BUTTONS
	 *            prototype property. When a config Object is provided, it will
	 *            be merged with any defaults provided by any srcNode and/or a
	 *            button with the same name defined on the BUTTONS property.
	 * @param section
	 *            The WidgetStdMod section (header/body/footer) where the button
	 *            should be added. This takes precedence over the button.section
	 *            configuration property.
	 * @param index
	 *            The index at which the button should be inserted. If not
	 *            specified, the button will be added to the end of the section.
	 *            This value is passed to the Array splice() method, therefore a
	 *            negative value will insert the button that many items from the
	 *            end.
	 * @return
	 */
	public final native WidgetExt addButton(Node button, String section, int index)/*-{
		this.addButton(button, section, index);
		return this;
	}-*/;

	/**
	 * Returns a button node from this widget's buttons.
	 * 
	 * @param name
	 * @return The button node.
	 */
	public final native Node getButton(String name)/*-{
		return this.getButton(name);
	}-*/;

	/**
	 * Returns a button node from this widget's buttons.
	 * 
	 * @param name
	 * @return The button node.
	 */
	public final native Node getButton(int index)/*-{
		return this.getButton(index);
	}-*/;

	/**
	 * Returns a button node from this widget's buttons.
	 * 
	 * @param name
	 * @param section
	 *            The WidgetStdMod section (header/body/footer) where the button
	 *            exists. Only applicable when looking for a button by numerical
	 *            index, or by name but scoped to a particular section.
	 * @return The button node.
	 */
	public final native Node getButton(String name, String section)/*-{
		return this.getButton(name, section);
	}-*/;

	/**
	 * Returns a button node from this widget's buttons.
	 * 
	 * @param index
	 *            the button index
	 * @param section
	 *            The WidgetStdMod section (header/body/footer) where the button
	 *            exists. Only applicable when looking for a button by numerical
	 *            index, or by name but scoped to a particular section.
	 * @return The button node.
	 */
	public final native Node getButton(int index, String section)/*-{
		return this.getButton(index, section);
	}-*/;

	/**
	 * Removes a button from this widget. The button will be removed from this
	 * widget's buttons and its DOM. Any event subscriptions on the button which
	 * were created by this widget will be detached. If the content section
	 * becomes empty after removing the button node, then the section will also
	 * be removed.
	 * 
	 * @param name
	 * @return self for method chaining
	 */
	public final native Node removeButton(String name)/*-{
		return this.removeButton(name);
	}-*/;

	/**
	 * Removes a button from this widget. The button will be removed from this
	 * widget's buttons and its DOM. Any event subscriptions on the button which
	 * were created by this widget will be detached. If the content section
	 * becomes empty after removing the button node, then the section will also
	 * be removed.
	 * 
	 * @param name
	 * @return self for method chaining
	 */
	public final native Node removeButton(int index)/*-{
		return this.removeButton(index);
	}-*/;

	/**
	 * Removes a button from this widget. The button will be removed from this
	 * widget's buttons and its DOM. Any event subscriptions on the button which
	 * were created by this widget will be detached. If the content section
	 * becomes empty after removing the button node, then the section will also
	 * be removed.
	 * 
	 * @param name
	 * @param section
	 *            The WidgetStdMod section (header/body/footer) where the button
	 *            exists. Only applicable when looking for a button by numerical
	 *            index, or by name but scoped to a particular section.
	 * @return self for method chaining
	 */
	public final native Node removeButton(String name, String section)/*-{
		return this.removeButton(name, section);
	}-*/;

	/**
	 * Removes a button from this widget. The button will be removed from this
	 * widget's buttons and its DOM. Any event subscriptions on the button which
	 * were created by this widget will be detached. If the content section
	 * becomes empty after removing the button node, then the section will also
	 * be removed.
	 * 
	 * @param index
	 *            the button index
	 * @param section
	 *            The WidgetStdMod section (header/body/footer) where the button
	 *            exists. Only applicable when looking for a button by numerical
	 *            index, or by name but scoped to a particular section.
	 * @return self for method chaining
	 */
	public final native Node removeButton(int index, String section)/*-{
		return this.removeButton(index, section);
	}-*/;

	// widgetAutoHide extension

	// no methods - al private

	// WidgetModality

	// no methods - al private

	// WidgetPosition

	public final native Point getXY()/*-{
		return this.get("xy");
	}-*/;

	/**
	 * Moves the Widget to the specified page xy co-ordinate position.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public final native WidgetExt move(double x, double y)/*-{
		this.move(x, y);
		return this;
	}-*/;

	/**
	 * Moves the Widget to the specified page xy co-ordinate position.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public final native WidgetExt move(Point p)/*-{
		this.move(p);
		return this;
	}-*/;

	/**
	 * Synchronizes the Panel's "xy", "x", and "y" properties with the Widget's
	 * position in the DOM.
	 * 
	 * @return
	 */
	public final native WidgetExt syncXY()/*-{
		this.syncXY();
		return this;
	}-*/;

	// WidgetPositionAlign
	/**
	 * Aligns this widget to the provided Node (or viewport) using the provided
	 * points. This method can be invoked with no arguments which will cause the
	 * widget's current align Attribute value to be synced to the DOM.
	 * 
	 * @return
	 */
	public final native WidgetExt align()/*-{
		this.align();
		return this;
	}-*/;

	/**
	 * Aligns this widget to the provided Node (or viewport) using the provided
	 * points. This method can be invoked with no arguments which will cause the
	 * widget's current align Attribute value to be synced to the DOM.
	 * 
	 * @param node
	 *            A reference (or selector String) for the Node which with the
	 *            widget is to be aligned. If null is passed in, the widget will
	 *            be aligned with the viewport.
	 * @return
	 */
	public final native WidgetExt align(Node node)/*-{
		this.align(node);
		return this;
	}-*/;

	/**
	 * Aligns this widget to the provided Node (or viewport) using the provided
	 * points. This method can be invoked with no arguments which will cause the
	 * widget's current align Attribute value to be synced to the DOM.
	 * 
	 * @param node
	 *            A reference (or selector String) for the Node which with the
	 *            widget is to be aligned. If null is passed in, the widget will
	 *            be aligned with the viewport.
	 * @return
	 */
	public final native WidgetExt align(String node)/*-{
		this.align(node);
		return this;
	}-*/;

	/**
	 * Aligns this widget to the provided Node (or viewport) using the provided
	 * points. This method can be invoked with no arguments which will cause the
	 * widget's current align Attribute value to be synced to the DOM.
	 * 
	 * @param node
	 *            A reference (or selector String) for the Node which with the
	 *            widget is to be aligned. If null is passed in, the widget will
	 *            be aligned with the viewport.
	 * @return
	 */
	public final native WidgetExt align(String node, String[] points)/*-{
		this
				.align(node,
						@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(points));
		return this;
	}-*/;

	/**
	 * Aligns this widget to the provided Node (or viewport) using the provided
	 * points. This method can be invoked with no arguments which will cause the
	 * widget's current align Attribute value to be synced to the DOM.
	 * 
	 * @param a
	 * @return
	 */
	public final native WidgetExt align(Align a)/*-{
		this.align(a.node, a.points);
		return this;
	}-*/;

	/**
	 * Centers the widget in the viewport, or if a Node is passed in, it will be
	 * centered to that Node.
	 * 
	 * @return
	 */
	public final native WidgetExt centered()/*-{
		this.centered();
		return this;
	}-*/;

	/**
	 * Centers the widget in the viewport, or if a Node is passed in, it will be
	 * centered to that Node.
	 * 
	 * @param n
	 *            A Node reference or selector String defining the Node which
	 *            the widget should be centered. If a Node is not passed in,
	 *            then the widget will be centered to the viewport.
	 * @return
	 */
	public final native WidgetExt centered(Node n)/*-{
		this.centered(node);
		return this;
	}-*/;

	/**
	 * Centers the widget in the viewport, or if a Node is passed in, it will be
	 * centered to that Node.
	 * 
	 * @param n
	 *            A Node reference or selector String defining the Node which
	 *            the widget should be centered. If a Node is not passed in,
	 *            then the widget will be centered to the viewport.
	 * @return
	 */
	public final native WidgetExt centered(String n)/*-{
		this.centered(node);
		return this;
	}-*/;

	// WidgetPositionConstrain
	/**
	 * Constrains the widget's bounding box to a node (or the viewport). If xy
	 * or node are not passed in, the current position and the value of
	 * "constrain" will be used respectively. The widget's position will be
	 * changed to the constrained position.
	 * 
	 * @param xy
	 *            Optional. The xy values to constrain
	 * @param n
	 *            Optional. The node to constrain to, or true for the viewport
	 * @return
	 */
	public final native WidgetExt constrain(Point xy, Node n)/*-{
		this.constrain(xy, n);
		return this;
	}-*/;

	/**
	 * Constrains the widget's bounding box to a node (or the viewport). If xy
	 * or node are not passed in, the current position and the value of
	 * "constrain" will be used respectively. The widget's position will be
	 * changed to the constrained position.
	 * 
	 * @param xy
	 *            Optional. The xy values to constrain
	 * @param n
	 *            Optional. The node to constrain to, or true for the viewport
	 * @return
	 */
	public final native WidgetExt constrain(Point xy, boolean n)/*-{
		this.constrain(xy, n);
		return this;
	}-*/;

	/**
	 * Constrains the widget's bounding box to a node (or the viewport). If xy
	 * or node are not passed in, the current position and the value of
	 * "constrain" will be used respectively. The widget's position will be
	 * changed to the constrained position.
	 * 
	 * @param xy
	 *            Optional. The xy values to constrain
	 * @return
	 */
	public final native WidgetExt constrain(Point xy)/*-{
		this.constrain(xy);
		return this;
	}-*/;

	/**
	 * Constrains the widget's bounding box to a node (or the viewport). If xy
	 * or node are not passed in, the current position and the value of
	 * "constrain" will be used respectively. The widget's position will be
	 * changed to the constrained position.
	 * 
	 * @param xy
	 *            Optional. The xy values to constrain
	 * @return
	 */
	public final native WidgetExt constrain()/*-{
		this.constrain();
		return this;
	}-*/;

	/**
	 * Calculates the constrained positions for the XY positions provided, using
	 * the provided node argument is passed in. If no node value is passed in,
	 * the value of the "constrain" attribute is used.
	 * 
	 * @param xy
	 *            The xy values to constrain
	 * @param n
	 *            Optional. The node to constrain to, or true for the viewport
	 * @return
	 */
	public final native Point getConstrainedXY(Point xy, Node n)/*-{
		return this.getConstrainedXY(xy, n);
	}-*/;

	/**
	 * Calculates the constrained positions for the XY positions provided, using
	 * the provided node argument is passed in. If no node value is passed in,
	 * the value of the "constrain" attribute is used.
	 * 
	 * @param xy
	 *            The xy values to constrain
	 * @param n
	 *            Optional. The node to constrain to, or true for the viewport
	 * @return
	 */
	public final native Point getConstrainedXY(Point xy, boolean n)/*-{
		return this.getConstrainedXY(xy, n);
	}-*/;

	/**
	 * Calculates the constrained positions for the XY positions provided, using
	 * the provided node argument is passed in. If no node value is passed in,
	 * the value of the "constrain" attribute is used.
	 * 
	 * @param xy
	 *            The xy values to constrain
	 * @return
	 */
	public final native Point getConstrainedXY(Point xy)/*-{
		return this.getConstrainedXY(xy);
	}-*/;

	// WidgetStack
	/**
	 * For IE6, synchronizes the size and position of iframe shim to that of
	 * Widget bounding box which it is protecting. For all other browsers, this
	 * method does not do anything.
	 * 
	 * @return
	 */
	public final native WidgetExt sizeShim()/*-{
		this.sizeShim();
		return this;
	}-*/;

	// WidgetStdMod
	/**
	 * Sets the height on the provided header, body or footer element to fill
	 * out the height of the Widget. It determines the height of the widgets
	 * bounding box, based on it's configured height value, and sets the height
	 * of the provided section to fill out any space remaining after the other
	 * standard module section heights have been accounted for.<br/>
	 * NOTE: This method is not designed to work if an explicit height has not
	 * been set on the Widget, since for an "auto" height Widget, the heights of
	 * the header/body/footer will drive the height of the Widget.
	 * 
	 * @param n
	 *            The node which should be resized to fill out the height of the
	 *            Widget bounding box. Should be a standard module section node
	 *            which belongs to the widget.
	 * @return
	 */
	public final native WidgetExt fillHeight(Node n)/*-{
		this.fillHeight(n);
		return this;
	}-*/;

	/**
	 * Returns the node reference for the specified section. Note: The DOM is
	 * not queried for the node reference. The reference stored by the widget
	 * instance is returned if it was set. Passing a truthy for forceCreate will
	 * create the section node if it does not already exist.
	 * 
	 * @param section
	 *            The section whose node reference is required. Either
	 *            WidgetStdMod.HEADER, WidgetStdMod.BODY, or
	 *            WidgetStdMod.FOOTER.
	 * @param forceCreate
	 *            Whether the section node should be created if it does not
	 *            already exist.
	 * @return The node reference for the section, or null if not set.
	 */
	public final native Node getStdModNode(String section, boolean forceCreate)/*-{
		return this.getStdModNode(section, forceCreate);
	}-*/;

	/**
	 * Returns the node reference for the specified section. Note: The DOM is
	 * not queried for the node reference. The reference stored by the widget
	 * instance is returned if it was set. Passing a truthy for forceCreate will
	 * create the section node if it does not already exist.
	 * 
	 * @param section
	 *            The section whose node reference is required. Either
	 *            WidgetStdMod.HEADER, WidgetStdMod.BODY, or
	 *            WidgetStdMod.FOOTER.
	 * @return The node reference for the section, or null if not set.
	 */
	public final native Node getStdModNode(String section)/*-{
		return this.getStdModNode(section);
	}-*/;

	/**
	 * Updates the body section of the standard module with the content provided
	 * (either an HTML string, or node reference). This method can be used
	 * instead of the corresponding section content attribute if you'd like to
	 * retain the current content of the section, and insert content before or
	 * after it, by specifying the where argument.
	 * 
	 * @param section
	 *            The standard module section whose content is to be updated.
	 *            Either WidgetStdMod.HEADER, WidgetStdMod.BODY or
	 *            WidgetStdMod.FOOTER.
	 * @param content
	 *            The content to be added, either an HTML string or a Node
	 *            reference.
	 * @param where
	 *            Optional. Either WidgetStdMod.AFTER, WidgetStdMod.BEFORE or
	 *            WidgetStdMod.REPLACE. If not provided, the content will
	 *            replace existing content in the section.
	 * @return
	 */
	public final native WidgetExt setStdModContent(String section, String content, String where)/*-{
		this.setStdModContent(section, content, where);
		return this;
	}-*/;

	/**
	 * Updates the body section of the standard module with the content provided
	 * (either an HTML string, or node reference). This method can be used
	 * instead of the corresponding section content attribute if you'd like to
	 * retain the current content of the section, and insert content before or
	 * after it, by specifying the where argument.
	 * 
	 * @param section
	 *            The standard module section whose content is to be updated.
	 *            Either WidgetStdMod.HEADER, WidgetStdMod.BODY or
	 *            WidgetStdMod.FOOTER.
	 * @param content
	 *            The content to be added, either an HTML string or a Node
	 *            reference.
	 * @param where
	 *            Optional. Either WidgetStdMod.AFTER, WidgetStdMod.BEFORE or
	 *            WidgetStdMod.REPLACE. If not provided, the content will
	 *            replace existing content in the section.
	 * @return
	 */
	public final native WidgetExt setStdModContent(String section, Node content, String where)/*-{
		this.setStdModContent(section, content, where);
		return this;
	}-*/;

	/**
	 * Updates the body section of the standard module with the content provided
	 * (either an HTML string, or node reference). This method can be used
	 * instead of the corresponding section content attribute if you'd like to
	 * retain the current content of the section, and insert content before or
	 * after it, by specifying the where argument.
	 * 
	 * @param section
	 *            The standard module section whose content is to be updated.
	 *            Either WidgetStdMod.HEADER, WidgetStdMod.BODY or
	 *            WidgetStdMod.FOOTER.
	 * @param content
	 *            The content to be added, either an HTML string or a Node
	 *            reference.
	 * @return
	 */
	public final native WidgetExt setStdModContent(String section, String content)/*-{
		this.setStdModContent(section, content, where);
		return this;
	}-*/;

	/**
	 * Updates the body section of the standard module with the content provided
	 * (either an HTML string, or node reference). This method can be used
	 * instead of the corresponding section content attribute if you'd like to
	 * retain the current content of the section, and insert content before or
	 * after it, by specifying the where argument.
	 * 
	 * @param section
	 *            The standard module section whose content is to be updated.
	 *            Either WidgetStdMod.HEADER, WidgetStdMod.BODY or
	 *            WidgetStdMod.FOOTER.
	 * @param content
	 *            The content to be added, either an HTML string or a Node
	 *            reference.
	 * @return
	 */
	public final native WidgetExt setStdModContent(String section, Node content)/*-{
		this.setStdModContent(section, content);
		return this;
	}-*/;

	// WidgetStdMod attributes accessors

	/**
	 * The content to be added to the body section. This will replace any
	 * existing content in the body. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @return the attribute
	 */
	public final native Node bodyContent()/*-{
		return this.get("bodyContent");
	}-*/;

	/**
	 * The content to be added to the body section. This will replace any
	 * existing content in the body. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native WidgetExt bodyContent(String val)/*-{
		this.set("bodyContent", val);
		return this;
	}-*/;

	/**
	 * The content to be added to the body section. This will replace any
	 * existing content in the body. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native WidgetExt bodyContent(Element val)/*-{
		this.set("bodyContent", val);
		return this;
	}-*/;

	/**
	 * The content to be added to the body section. This will replace any
	 * existing content in the body. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native WidgetExt bodyContent(NodeBase val)/*-{
		this.set("bodyContent", val);
		return this;
	}-*/;

	/**
	 * The content to be added to the header section. This will replace any
	 * existing content in the header. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @return the attribute
	 */
	public final native NodeBase headerContent()/*-{
		return this.get("headerContent");
	}-*/;

	/**
	 * The content to be added to the header section. This will replace any
	 * existing content in the header. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native WidgetExt headerContent(String val)/*-{
		this.set("headerContent", val);
		return this;
	}-*/;

	/**
	 * The content to be added to the header section. This will replace any
	 * existing content in the header. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native WidgetExt headerContent(Node val)/*-{
		this.set("headerContent", val);
		return this;
	}-*/;

	/**
	 * The content to be added to the header section. This will replace any
	 * existing content in the header. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native WidgetExt headerContent(Element val)/*-{
		this.set("headerContent", val);
		return this;
	}-*/;

	/**
	 * The section (WidgetStdMod.HEADER, WidgetStdMod.BODY or
	 * WidgetStdMod.FOOTER) which should be resized to fill the height of the
	 * standard module, when a height is set on the Widget. If a height is not
	 * set on the widget, then all sections are sized based on their content.
	 * 
	 * @return the attribute
	 */
	public final native String fillHeight()/*-{
		return this.get("fillHeight");
	}-*/;

	/**
	 * The section (WidgetStdMod.HEADER, WidgetStdMod.BODY or
	 * WidgetStdMod.FOOTER) which should be resized to fill the height of the
	 * standard module, when a height is set on the Widget. If a height is not
	 * set on the widget, then all sections are sized based on their content.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native WidgetExt fillHeight(String val)/*-{
		this.set("fillHeight", val);
		return this;
	}-*/;

	/**
	 * The content to be added to the footer section. This will replace any
	 * existing content in the footer. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @return
	 */
	public native final NodeBase footerContentNode() /*-{
		return this.getNode("footerContent");
	}-*/;

	/**
	 * The content to be added to the footer section. This will replace any
	 * existing content in the footer. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final WidgetExt footerContent(NodeBase val) /*-{
		this.set("footerContent", val); 
//		this.footerContent = val;
		return this;
	}-*/;

	/**
	 * The content to be added to the footer section. This will replace any
	 * existing content in the footer. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final WidgetExt footerContent(String val) /*-{
		this.set("footerContent", val); 
//		this.footerContent = val;
		return this;
	}-*/;

	/**
	 * The content to be added to the footer section. This will replace any
	 * existing content in the footer. If you want to append, or insert new
	 * content, use the setStdModContent method.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final WidgetExt footerContent(Element val) /*-{
		this.set("footerContent", val); 
//		this.footerContent = val;
		return this;
	}-*/;

	// WidgetParent -
	// http://yuilibrary.com/yui/docs/api/classes/WidgetParent.html
	// Events
	/**
	 * Fires when a Widget is add as a child. The event object will have a
	 * 'child' property that returns a reference to the child Widget, as well as
	 * an 'index' property that returns a reference to the index specified when
	 * the add() method was called. Subscribers to the "on" moment of this
	 * event, will be notified before a child is added. Subscribers to the
	 * "after" moment of this event, will be notified after a child is added.
	 */
	public static final String EVENT_ADDCHILD = "addChild";
	/**
	 * Fires when a child Widget is removed. The event object will have a
	 * 'child' property that returns a reference to the child Widget, as well as
	 * an 'index' property that returns a reference child's ordinal
	 * position.Subscribers to the "on" moment of this event, will be notified
	 * before a child is removed.Subscribers to the "after" moment of this
	 * event, will be notified after a child is removed.
	 */
	public static final String EVENT_REMOVECHILD = "removeChild";

	/**
	 * Deselects all children.
	 * 
	 * @return
	 */
	public final native WidgetExt deselectAll()/*-{
		this.deselectAll();
		return this;
	}-*/;

	/**
	 * The destructor implementation for Parent widgets. Destroys all children.
	 * 
	 * @return self for method chaining
	 */
	public native final WidgetExt destructor() /*-{
		this.destructor();
		return this;
	}-*/;

	/**
	 * Removes the Widget from its parent. Optionally, can remove a child by
	 * specifying its index.
	 * 
	 * @return Widget instance that was successfully removed, otherwise
	 *         undefined.
	 */
	public native final WidgetExt remove() /*-{
		return this.remove();
	}-*/;

	/**
	 * Removes the Widget from its parent. Optionally, can remove a child by
	 * specifying its index.
	 * 
	 * @param index
	 *            (Optional.) DataTypeNumber representing the index of the child
	 *            to be removed.
	 * @return Widget instance that was successfully removed, otherwise
	 *         undefined.
	 */
	public native final WidgetExt remove(int index) /*-{
		return this.remove(index);
	}-*/;

	/**
	 * Removes all of the children from the Widget.
	 * 
	 * @return ArrayList: Y.ArrayList instance containing Widgets that were
	 *         successfully removed. If no children where removed, will return
	 *         an empty Y.ArrayList instance.
	 */
	public native final ArrayList removeAll() /*-{
		return this.removeAll();
	}-*/;

	/**
	 * Selects all children.
	 * 
	 * @return
	 */
	public native final WidgetExt selectAll() /*-{
		this.selectAll();
		return this;
	}-*/;

	/**
	 * Selects the child at the given index (zero-based).
	 * 
	 * @param index
	 *            the index of the child to be selected
	 * @return
	 */
	public native final WidgetExt selectChild(int index) /*-{
		this.selectChild(index);
		return this;
	}-*/;

	/**
	 * How many items are in this list?
	 * 
	 * @return Number of items in the list
	 */
	public native final int size() /*-{
		return this.size();
	}-*/;

	public static interface SomeCallback {
		boolean call(Widget t, int index);
	}

	/**
	 * 
	 <p>
	 * Execute a function on each item of the list, optionally providing a
	 * custom execution context. Default context is the item.
	 * </p>
	 * 
	 * <p>
	 * The callback signature is callback( item, index ).
	 * </p>
	 * 
	 * <p>
	 * Unlike each, if the callback returns true, the iteratation will stop.
	 * </p>
	 * 
	 * @param fn
	 *            the function to execute
	 * @return
	 */
	public native final boolean some(SomeCallback fn) /*-{
		var f = $entry(function(item, index) {
			return fn.@org.sgx.yuigwt.yui.widget.ext.WidgetExt.SomeCallback::call(Lorg/sgx/yuigwt/yui/widget/Widget;I)(item, index);
		});
		return this.some(f);
	}-*/;

	/**
	 * Provides an array-like representation for JSON.stringify.
	 * @return Array: an array representation of the ArrayList
	 */
	public native final JsArray toJSON() /*-{	
		return this.toJSON();
	}-*/;

	
	


	// TODO: OTHERS

	// WidgetChild - http://yuilibrary.com/yui/docs/api/classes/WidgetChild.html

}
