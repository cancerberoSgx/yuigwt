package org.sgx.yuigwt.yuigallery.nodeTransform2d;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.TransitionVal;
import org.sgx.yuigwt.yui.util.SimpleCallback;
import org.sgx.yuigwt.yuigallery.cssmatrix2d.CSSMatrix2d;
/**
 * Just cast a node to this class for the augmented node version with transform 2d methods. 
 * @see http://yuilibrary.com/gallery/show/node-transform2d
 * @see http://solmsted.github.com/yui3-gallery/api/classes/Node.html
 * @author sg
 *
 */
public class NodeTransform2d extends Node {
protected NodeTransform2d(){}




/**
 * Helper method to get the node's current 2d transfom matrix.
 * @return self for method chaining
 */
public native final CSSMatrix2d getMatrix() /*-{
return this.getMatrix();
}-*/; 





/**
 * Transforms the node by the inverse of the nodes current 2d transform matrix.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d inverseTransform(TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.inverseTransform(transitionConfig, f); 
	return this; 
}-*/;
/**
 * Transforms the node by the inverse of the nodes current 2d transform matrix.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d inverseTransform(TransitionVal transitionConfig) /*-{
	this.inverseTransform(transitionConfig); 
	return this; 
}-*/;
/**
 * Transforms the node by the inverse of the nodes current 2d transform matrix.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d inverseTransform() /*-{
	this.inverseTransform(); 
	return this; 
}-*/;






/**
 * Transforms the node by multiplying the nodes current 2d transform matrix with another matrix.
 * @param matrix The matrix to multiply.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d multiplyMatrix(CSSMatrix2d matrix, TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.multiplyMatrix(matrix, transitionConfig, f); 
	return this; 
}-*/;
/**
 * Transforms the node by multiplying the nodes current 2d transform matrix with another matrix.
 * @param matrix The matrix to multiply.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d multiplyMatrix(CSSMatrix2d matrix, TransitionVal transitionConfig) /*-{
	this.multiplyMatrix(matrix, transitionConfig); 
	return this; 
}-*/;
/**
 * Transforms the node by multiplying the nodes current 2d transform matrix with another matrix.
 * @param matrix The matrix to multiply.
 * @return self for method chaining
 */
public native final NodeTransform2d multiplyMatrix(CSSMatrix2d matrix) /*-{
	this.multiplyMatrix(matrix); 
	return this; 
}-*/;






/**
 * Rotates the node clockwise.
 * @param angle The angle specified in degrees.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d rotate(double angle, TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.rotate(angle, transitionConfig, f); 
	return this; 
}-*/;
/**
 * Rotates the node clockwise.
 * @param angle The angle specified in degrees.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d rotate(double angle, TransitionVal transitionConfig) /*-{
	this.rotate(angle, transitionConfig); 
	return this; 
}-*/;
/**
 * Rotates the node clockwise.
 * @param angle The angle specified in degrees.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d rotate(double angle) /*-{
	this.rotate(angle); 
	return this; 
}-*/;



/**
 * Rotates the node clockwise.
 * @param angle The angle specified in radians.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d rotateRad(double angle, TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.rotateRad(angle, transitionConfig, f); 
	return this; 
}-*/;
/**
 * Rotates the node clockwise.
 * @param angle The angle specified in radians.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d rotateRad(double angle, TransitionVal transitionConfi) /*-{
	this.rotateRad(angle, transitionConfig); 
	return this; 
}-*/;
/**
 * Rotates the node clockwise.
 * @param angle The angle specified in radians.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d rotateRad(double angle) /*-{
	this.rotateRad(angle); 
	return this; 
}-*/;




/**
 * Scales the node horizontally and vertically.
 * @param scaleFactor The horizontal and vertical scale factor.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d scale(double scaleFactor, TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.scale(scaleFactor, transitionConfig, f); 
	return this; 
}-*/;
/**
 * Scales the node horizontally and vertically.
 * @param scaleFactor The horizontal and vertical scale factor.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d scale(double scaleFactor, TransitionVal transitionConfig) /*-{
	this.scale(scaleFactor, transitionConfig); 
	return this; 
}-*/;
/**
 * Scales the node horizontally and vertically.
 * @param scaleFactor The horizontal and vertical scale factor.
 * @return self for method chaining
 */
public native final NodeTransform2d scale(double scaleFactor) /*-{
	this.scale(scaleFactor); 
	return this; 
}-*/;

/**
 * Scales the node horizontally and vertically.
 * @param scaleFactor The horizontal and vertical scale factor.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d scaleXY(double x, double y, TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.scaleXY(x, y, transitionConfig, f); 
	return this; 
}-*/;

/**
 * Scales the node horizontally and vertically.
 * @param scaleFactor The horizontal and vertical scale factor.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d scaleXY(double x, double y, TransitionVal transitionConfig) /*-{
	this.scaleXY(x, y, transitionConfig); 
	return this; 
}-*/;
/**
 * Scales the node horizontally and vertically.
 * @param scaleFactor The horizontal and vertical scale factor.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d scaleXY(double x, double y) /*-{
	this.scaleXY(x, y); 
	return this; 
}-*/;


/**
 * Skews the node horizontally.
 * @param angle The horizontal skew angle specified in degrees.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d skewX(double angle, TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.skewX(angle, transitionConfig, f); 
	return this; 
}-*/;
/**
 * Skews the node horizontally.
 * @param angle The horizontal skew angle specified in degrees.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d skewX(double angle, TransitionVal transitionConfig) /*-{
	this.skewX(angle, transitionConfig); 
	return this; 
}-*/;
/**
 * Skews the node horizontally.
 * @param angle The horizontal skew angle specified in degrees.
 * @return self for method chaining
 */
public native final NodeTransform2d skewX(double angle) /*-{
	this.skewX(angle); 
	return this; 
}-*/;



/**
 * Skews the node horizontally.
 * @param angle The horizontal skew angle specified in rads.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d skewXRad(double angle, TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.skewXRad(angle, transitionConfig, f); 
	return this; 
}-*/;
/**
 * Skews the node horizontally.
 * @param angle The horizontal skew angle specified in rads.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d skewXRad(double angle, TransitionVal transitionConfig) /*-{
	this.skewXRad(angle, transitionConfig); 
	return this; 
}-*/;
/**
 * Skews the node horizontally.
 * @param angle The horizontal skew angle specified in rads.
 * @return self for method chaining
 */
public native final NodeTransform2d skewXRad(double angle) /*-{
	this.skewXRad(angle); 
	return this; 
}-*/;


/**
 * Skews the node vert.
 * @param angle The horizontal skew angle specified in degrees.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d skewY(double angle, TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.skewY(angle, transitionConfig, f); 
	return this; 
}-*/;
/**
 * Skews the node vert.
 * @param angle The horizontal skew angle specified in degrees.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d skewY(double angle, TransitionVal transitionConfig) /*-{
	this.skewY(angle, transitionConfig); 
	return this; 
}-*/;
/**
 * Skews the node vert.
 * @param angle The horizontal skew angle specified in degrees.
 * @return self for method chaining
 */
public native final NodeTransform2d skewY(double angle) /*-{
	this.skewY(angle); 
	return this; 
}-*/;


/**
 * Skews the node vert.
 * @param angle The horizontal skew angle specified in rads.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d skewYRad(double angle, TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.skewYRad(angle, transitionConfig, f); 
	return this; 
}-*/;
/**
 * Skews the node vert.
 * @param angle The horizontal skew angle specified in rads.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d skewYRad(double angle, TransitionVal transitionConfig) /*-{
	this.skewYRad(angle, transitionConfig); 
	return this; 
}-*/;
/**
 * Skews the node vert.
 * @param angle The horizontal skew angle specified in rads.
 * @return self for method chaining
 */
public native final NodeTransform2d skewYRad(double angle) /*-{
	this.skewYRad(angle); 
	return this; 
}-*/;



/**
 * Transforms the node by the given matrix.
 * @param matrix The 2d transform matrix.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d transform(CSSMatrix2d matrix, TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.transform(matrix, transitionConfig, f); 
	return this; 
}-*/;

/**
 * Transforms the node by the given matrix.
 * @param matrix The 2d transform matrix.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d transform(CSSMatrix2d matrix, TransitionVal transitionConfig) /*-{
	this.transform(matrix, transitionConfig); 
	return this; 
}-*/;


/**
 * Transforms the node by the given matrix.
 * @param matrix The 2d transform matrix.
 * @return self for method chaining
 */
public native final NodeTransform2d transform(CSSMatrix2d matrix) /*-{
	this.transform(matrix); 
	return this; 
}-*/;


/**
 * Translates the node horizontally and vertically.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @param callbackFunction Optional. Whether or not transition is used, the callback function, if defined, will get called when the transform is complete.
 * @return self for method chaining
 */
public native final NodeTransform2d translate(double x, double y, TransitionVal transitionConfig, SimpleCallback callbackFunction) /*-{
	var f = $entry(function(){
		return callbackFunction.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	this.translate(x, y, transitionConfig, f); 
	return this; 
}-*/;
/**
 * Translates the node horizontally and vertically.
 * @parma transitionConfig Optional. If defined, and if the transition module is available, a transition will be used to transform the node. This object is passed along to the transition method.
 * @return self for method chaining
 */
public native final NodeTransform2d translate(double x, double y, TransitionVal transitionConfig) /*-{
	this.translate(x, y, transitionConfig); 
	return this; 
}-*/;

/**
 * Translates the node horizontally and vertically.
 * @return self for method chaining
 */
public native final NodeTransform2d translate(double x, double y) /*-{
	this.translate(x, y); 
	return this; 
}-*/;
}
