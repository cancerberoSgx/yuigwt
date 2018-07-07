package org.sgx.yuigwt.yui.widget.slider;
/**
 * Create a slider to represent an integer value between a given minimum and maximum. Sliders may be aligned vertically or horizontally, based on the axis configuration.
 * @author sg
 *
 */
public class Slider extends SliderBase {
	protected Slider(){}
	
	//event names	
	
	/**
	 * Broadcasts when the rail has received a mousedown event and triggers the thumb positioning. Use e.preventDefault() or set("clickableRail", false) to prevent the thumb positioning.
	 */
	public static final String EVENT_RAILMOUSEDOWN = "railMouseDown";
	
	/**
	 * Signals the end of a thumb drag operation. Payload includes the thumb's drag:end event.
	 */
	public static final String EVENT_SLIDEEND = "slideEnd";
	
	/**
	 * Signals the beginning of a thumb drag operation. Payload includes the thumb's drag:start event.
	 */
	public static final String EVENT_SLIDESTART = "slideStart";
	
	
	/**
	 * Signals that the thumb has moved. Payload includes the thumb's pixel offset from the top/left edge of the rail, and if triggered by dragging the thumb, the drag:drag event.
	 */
	public static final String EVENT_THUMBMOVE = "thumbMove";
	

	//SliderValueRange stuff
	
	/**
	 * Returns the current value. Override this if you want to introduce output formatting. Otherwise equivalent to slider.get( "value" );
	 * @return
	 */
	public native final int getValue()/*-{
		return this.getValue(); 
	}-*/;
	/**
	 * Updates the current value. Override this if you want to introduce input value parsing or preprocessing. Otherwise equivalent to slider.set( "value", v );
	 * @param v
	 * @return this for method chaining.
	 */
	public native final Slider setValue(int v)/*-{
		return this.setValue(v); 
	}-*/;
	
	public static native SliderConfig config()/*-{
		return {}; 
	}-*/;

}