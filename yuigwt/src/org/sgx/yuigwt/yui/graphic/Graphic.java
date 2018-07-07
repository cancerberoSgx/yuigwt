package org.sgx.yuigwt.yui.graphic;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Region;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class Graphic extends JavaScriptObject{
protected Graphic(){}
/**
 * Generates a shape instance by type. The method accepts an object that contain's the shape's type and attributes to be customized. For example, the code below would create a rectangle:
 * <br/><br/>
 * 
 * <pre>
   var myRect = myGraphic.addShape({
       type: "rect",
       width: 40,
       height: 30,
       fill: {
           color: "#9aa"
       },
       stroke: {
           weight: 1,
           color: "#000"
       }
   });
       </pre>
       
   The Graphics module includes a few basic shapes. More information on their creation can be found in each shape's documentation:
   <br/><br/>
   
   The Graphics module also allows for the creation of custom shapes. If a custom shape has been created, it can be instantiated with the addShape method as well. The attributes, required and optional, would need to be defined in the custom shape.
   <br/><br/>
   <pre>
   var myCustomShape = myGraphic.addShape({
       type: Y.MyCustomShape,
       width: 50,
       height: 50,
       fill: {
           color: "#9aa"
       },
       stroke: {
           weight: 1,
           color: "#000"
       }
   });
   </pre>
   
 * @param cfg Object containing the shape's type and attributes.
 * @return the new shape
 */
public native final Shape addShape(ShapeConfig cfg)/*-{
	return this.addShape(cfg); 
}-*/;




//attribute accessing

/**
 * Determines how the size of instance is calculated. If true, the width and height are determined by the size of the contents. If false, the width and height values are either explicitly set or determined by the size of the parent node's dimensions.Default: false
 * @return the attribute
 */
public final native boolean autoSize()/*-{
return this.get("autoSize");
}-*/;

/**
 * Determines how the size of instance is calculated. If true, the width and height are determined by the size of the contents. If false, the width and height values are either explicitly set or determined by the size of the parent node's dimensions.Default: false
 * @param val
 * @return self for method chaining
 */
public final native Graphic autoSize(boolean val)/*-{
this.set("autoSize", val);
return this; 
}-*/;
/**
 * Object containing size and coordinate data for the content of a Graphic in relation to the coordSpace node.
 * @return the attribute
 */
public final native Region contentBounds()/*-{
return this.get("contentBounds");
}-*/;

/**
 * Object containing size and coordinate data for the content of a Graphic in relation to the coordSpace node.
 * @param val
 * @return self for method chaining
 */
public final native Graphic contentBounds(Region val)/*-{
this.set("contentBounds", val);
return this; 
}-*/;

/**
 * Indicates the height of the Graphic.
 * @return the attribute
 */
public final native double height()/*-{
return this.get("height");
}-*/;

/**
 * Indicates the height of the Graphic.
 * @param val
 * @return self for method chaining
 */
public final native Graphic height(double val)/*-{
this.set("height", val);
return this; 
}-*/;

/**
 * Unique id for class instance.
 * @return the attribute
 */
public final native String id()/*-{
return this.get("id");
}-*/;

/**
 * Unique id for class instance.
 * @param val
 * @return self for method chaining
 */
public final native Graphic id(String val)/*-{
this.set("id", val);
return this; 
}-*/;

/**
 * The html element that represents to coordinate system of the Graphic instance
 * @return the attribute
 */
public final native Element node()/*-{
return this.get("node");
}-*/;

/**
 * The html element that represents to coordinate system of the Graphic instance
 * @param val
 * @return self for method chaining
 */
public final native Graphic node(Element val)/*-{
this.set("node", val);
return this; 
}-*/;

/**
 * Whether or not to render the Graphic automatically after to a specified parent node after init. This can be a Node instance or a CSS selector string.
 * @return the attribute
 */
public final native Node render()/*-{
return this.get("render");
}-*/;

/**
 * Whether or not to render the Graphic automatically after to a specified parent node after init. This can be a Node instance or a CSS selector string.
 * @param val
 * @return self for method chaining
 */
public final native Graphic render(Node val)/*-{
this.set("render", val);
return this; 
}-*/;
/**
 * The contentBounds will resize to greater values but not to smaller values. (for performance) When resizing the contentBounds down is desirable, set the resizeDown value to true.
 * @return the attribute
 */
public final native boolean resizeDown()/*-{
return this.get("resizeDown");
}-*/;

/**
 * The contentBounds will resize to greater values but not to smaller values. (for performance) When resizing the contentBounds down is desirable, set the resizeDown value to true.
 * @param val
 * @return self for method chaining
 */
public final native Graphic resizeDown(boolean val)/*-{
this.set("resizeDown", val);
return this; 
}-*/;


/**
 * 
 * @return the attribute
 */
public final native ShapeSet shapes()/*-{
return this.get("shapes");
}-*/;

/**
 * 
 * @param val
 * @return self for method chaining
 */
public final native Graphic shapes(ShapeSet val)/*-{
this.set("shapes", val);
return this; 
}-*/;

/**
 * Indicates whether the Graphic and its children are visible.
 * @return the attribute
 */
public final native boolean visible()/*-{
return this.get("visible");
}-*/;

/**
 * Indicates whether the Graphic and its children are visible.
 * @param val
 * @return self for method chaining
 */
public final native Graphic visible(boolean val)/*-{
this.set("visible", val);
return this; 
}-*/;

/**
 * Indicates the width of the Graphic.
 * @return the attribute
 */
public final native double width()/*-{
return this.get("width");
}-*/;

/**
 * Indicates the width of the Graphic.
 * @param val
 * @return self for method chaining
 */
public final native Graphic width(double val)/*-{
this.set("width", val);
return this; 
}-*/;

/**
 * Indicates the x-coordinate for the instance.
 * @return the attribute
 */
public final native double x()/*-{
return this.get("x");
}-*/;

/**
 * Indicates the x-coordinate for the instance.
 * @param val
 * @return self for method chaining
 */
public final native Graphic x(double val)/*-{
this.set("x", val);
return this; 
}-*/;

/**
 * Indicates the y-coordinate for the instance.
 * @return the attribute
 */
public final native double y()/*-{
return this.get("y");
}-*/;

/**
 * Indicates the y-coordinate for the instance.
 * @param val
 * @return self for method chaining
 */
public final native Graphic y(double val)/*-{
this.set("y", val);
return this; 
}-*/;
}
