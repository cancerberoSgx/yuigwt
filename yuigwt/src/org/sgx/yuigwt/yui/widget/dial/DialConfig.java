package org.sgx.yuigwt.yui.widget.dial;

import org.sgx.yuigwt.yui.widget.WidgetConfig;
import org.sgx.yuigwt.yui.widget.slider.SliderConfig;

/**
 * <p>
 * A dial represents an input control capable of representing a series of
 * intermediate states based on the position of the Dial's handle. These states
 * are typically aligned to a value algorithm whereby the angle of the handle's
 * position corresponds to a given value.
 * </p>
 * 
 * <p>
 * The Dial widget is a circular value input control. It's like a real-world,
 * analog volume control dial, but with much finer UI control. Have you ever
 * needed a slider with a 2000 unit range, wanted 1 unit accuracy, but didn't
 * have 2000 pixels of real estate for a slider? The Dial widget is made for
 * cases like this.
 * </p>
 * 
 * <p>
 * The user sets the value of the dial by dragging its handle or clicking on the
 * ring.
 * </p>
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Dial.html
 * @see http://yuilibrary.com/yui/docs/dial/
 * @author sg
 * 
 */
public class DialConfig extends WidgetConfig {
	protected DialConfig() {
	}
	public static final native DialConfig create()/*-{
		return {}; 
	}-*/;
	/**
	 * 
	 diameter of the center button object. Dial sets the pixel dimension of
	 * the centerButton equal to centerButtonDiameter * diameter. Set this only
	 * before rendering.
	 * 
	 * Default: 0.1
	 * 
	 * @return
	 */
	public native final double centerButtonDiameter() /*-{
		return this.centerButtonDiameter;
	}-*/;

	/**
	 * 
	 diameter of the center button object. Dial sets the pixel dimension of
	 * the centerButton equal to centerButtonDiameter * diameter. Set this only
	 * before rendering.
	 * 
	 * Default: 0.1
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig centerButtonDiameter(double val) /*-{
		this.centerButtonDiameter = val;
		return this;
	}-*/;

	/**
	 * 
	 number of decimal places of accuracy in the value
	 * 
	 * Default: 0
	 * 
	 * @return
	 */
	public native final int decimalPlaces() /*-{
		return this.decimalPlaces;
	}-*/;

	/**
	 * 
	 number of decimal places of accuracy in the value
	 * 
	 * Default: 0
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig decimalPlaces(int val) /*-{
		this.decimalPlaces = val;
		return this;
	}-*/;

	/**
	 * 
	 diameter of the circular background object. Other objects scale
	 * accordingly. Set this only before rendering.
	 * 
	 * Default: 100
	 * 
	 * @return
	 */
	public native final int diameter() /*-{
		return this.diameter;
	}-*/;

	/**
	 * 
	 diameter of the circular background object. Other objects scale
	 * accordingly. Set this only before rendering.
	 * 
	 * Default: 100
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig diameter(int val) /*-{
		this.diameter = val;
		return this;
	}-*/;

	/**
	 * 
	 diameter of the handle object which users drag to change the value. Dial
	 * sets the pixel dimension of the handle equal to handleDiameter *
	 * diameter. Set this only before rendering.
	 * 
	 * Default: 0.2
	 * 
	 * @return
	 */
	public native final double handleDiameter() /*-{
		return this.handleDiameter;
	}-*/;

	/**
	 * 
	 diameter of the handle object which users drag to change the value. Dial
	 * sets the pixel dimension of the handle equal to handleDiameter *
	 * diameter. Set this only before rendering.
	 * 
	 * Default: 0.2
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig handleDiameter(double val) /*-{
		this.handleDiameter = val;
		return this;
	}-*/;

	/**
	 * 
	 distance from the center of the dial to the center of the marker and
	 * handle, when at rest. The value is a percent of the radius of the dial.
	 * 
	 * Default: 0.75
	 * 
	 * @return
	 */
	public native final double handleDistance() /*-{
		return this.handleDistance;
	}-*/;

	/**
	 * 
	 distance from the center of the dial to the center of the marker and
	 * handle, when at rest. The value is a percent of the radius of the dial.
	 * 
	 * Default: 0.75
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig handleDistance(double val) /*-{
		this.handleDistance = val;
		return this;
	}-*/;

	/**
	 * 
	 amount to increment/decrement the dial value when the page up/down keys
	 * are pressed
	 * 
	 * Default: 10
	 * 
	 * @return
	 */
	public native final int majorStep() /*-{
		return this.majorStep;
	}-*/;

	/**
	 * 
	 amount to increment/decrement the dial value when the page up/down keys
	 * are pressed
	 * 
	 * Default: 10
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig majorStep(int val) /*-{
		this.majorStep = val;
		return this;
	}-*/;

	/**
	 * 
	 diameter of the marker object which follows the angle of the handle
	 * during value changes. Dial sets the pixel dimension of the marker equal
	 * to markerDiameter * diameter. Set this only before rendering.
	 * 
	 * Default: 0.1
	 * 
	 * @return
	 */
	public native final double markerDiameter() /*-{
		return this.markerDiameter;
	}-*/;

	/**
	 * 
	 diameter of the marker object which follows the angle of the handle
	 * during value changes. Dial sets the pixel dimension of the marker equal
	 * to markerDiameter * diameter. Set this only before rendering.
	 * 
	 * Default: 0.1
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig markerDiameter(double val) /*-{
		this.markerDiameter = val;
		return this;
	}-*/;

	/**
	 * 
	 maximum value allowed.
	 * 
	 * Default: 220
	 * 
	 * @return
	 */
	public native final int max() /*-{
		return this.max;
	}-*/;

	/**
	 * 
	 maximum value allowed.
	 * 
	 * Default: 220
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig max(int val) /*-{
		this.max = val;
		return this;
	}-*/;

	/**
	 * 
	 minimum value allowed.
	 * 
	 * Default: -220
	 * 
	 * @return
	 */
	public native final double min() /*-{
		return this.min;
	}-*/;

	/**
	 * 
	 minimum value allowed.
	 * 
	 * Default: -220
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig min(double val) /*-{
		this.min = val;
		return this;
	}-*/;

	/**
	 * 
	 amount to increment/decrement the dial value when the arrow
	 * up/down/left/right keys are pressed.
	 * 
	 * Default: 1
	 * 
	 * @return
	 */
	public native final double minorStep() /*-{
		return this.minorStep;
	}-*/;

	/**
	 * 
	 amount to increment/decrement the dial value when the arrow
	 * up/down/left/right keys are pressed.
	 * 
	 * Default: 1
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig minorStep(double val) /*-{
		this.minorStep = val;
		return this;
	}-*/;

	/**
	 * 
	 number of value increments in one 360 degree revolution of the handle
	 * around the dial.
	 * 
	 * Default: 100
	 * 
	 * @return
	 */
	public native final int stepsPerRevolution() /*-{
		return this.stepsPerRevolution;
	}-*/;

	/**
	 * 
	 number of value increments in one 360 degree revolution of the handle
	 * around the dial.
	 * 
	 * Default: 100
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig stepsPerRevolution(int val) /*-{
		this.stepsPerRevolution = val;
		return this;
	}-*/;

	/**
	 * 
	 initial value of the Dial.
	 * 
	 * Default: 0
	 * 
	 * @return
	 */
	public native final double value() /*-{
		return this.value;
	}-*/;

	/**
	 * 
	 initial value of the Dial.
	 * 
	 * Default: 0
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DialConfig value(double val) /*-{
		this.value = val;
		return this;
	}-*/;
}
