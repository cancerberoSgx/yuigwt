package org.sgx.yuigwt.yui.widget.dial;

import org.sgx.yuigwt.yui.widget.Widget;

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
public class Dial extends Widget {
	protected Dial() {
	}

	// attributes

	/**
	 * 
	 * @return
	 */
	public native final int centerButtonDiameter() /*-{
		return this.get("centerButtonDiameter");
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Dial centerButtonDiameter(int val) /*-{
		this.set("centerButtonDiameter", val);
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
		return this.get("decimalPlaces");
	}-*/;

	/**
	 * 
	 number of decimal places of accuracy in the value
	 * 
	 * Default: 0
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Dial decimalPlaces(int val) /*-{
		this.set("decimalPlaces", val);
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
		return this.get("diameter");
	}-*/;

	/**
	 * 
	 diameter of the circular background object. Other objects scale
	 * accordingly. Set this only before rendering.
	 * 
	 * Default: 100
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Dial diameter(double val) /*-{
		this.set("diameter", val);
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
		return this.get("handleDiameter");
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
	 * @return this - for method chaining
	 */
	public native final Dial handleDiameter(double val) /*-{
		this.set("handleDiameter", val);
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
		return this.get("handleDistance");
	}-*/;

	/**
	 * 
	 distance from the center of the dial to the center of the marker and
	 * handle, when at rest. The value is a percent of the radius of the dial.
	 * 
	 * Default: 0.75
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Dial handleDistance(int val) /*-{
		this.set("handleDistance", val);
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
		return this.get("majorStep");
	}-*/;

	/**
	 * 
	 amount to increment/decrement the dial value when the page up/down keys
	 * are pressed
	 * 
	 * Default: 10
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Dial majorStep(int val) /*-{
		this.set("majorStep", val);
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
	public native final int markerDiameter() /*-{
		return this.get("markerDiameter");
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
	 * @return this - for method chaining
	 */
	public native final Dial markerDiameter(int val) /*-{
		this.set("markerDiameter", val);
		return this;
	}-*/;

	/**
	 * 
	 maximum value allowed
	 * 
	 * Default: 220
	 * 
	 * @return
	 */
	public native final int max() /*-{
		return this.get("max");
	}-*/;

	/**
	 * 
	 maximum value allowed
	 * 
	 * Default: 220
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Dial max(int val) /*-{
		this.set("max", val);
		return this;
	}-*/;

	/**
	 * minimum value allowed
	 * 
	 * Default: -220
	 * 
	 * @return
	 */
	public native final int min() /*-{
		return this.get("min");
	}-*/;

	/**
	 * minimum value allowed
	 * 
	 * Default: -220
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Dial min(int val) /*-{
		this.set("min", val);
		return this;
	}-*/;

	/**
	 * 
	 amount to increment/decrement the dial value when the arrow
	 * up/down/left/right keys are pressed
	 * 
	 * Default: 1
	 * 
	 * @return
	 */
	public native final double minorStep() /*-{
		return this.get("minorStep");
	}-*/;

	/**
	 * 
	 amount to increment/decrement the dial value when the arrow
	 * up/down/left/right keys are pressed
	 * 
	 * Default: 1
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Dial minorStep(double val) /*-{
		this.set("minorStep", val);
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
		return this.get("stepsPerRevolution");
	}-*/;

	/**
	 * 
	 number of value increments in one 360 degree revolution of the handle
	 * around the dial.
	 * 
	 * Default: 100
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Dial stepsPerRevolution(int val) /*-{
		this.set("stepsPerRevolution", val);
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
	public native final Dial value(double val) /*-{
		this.value = val;
		return this;
	}-*/;
}
