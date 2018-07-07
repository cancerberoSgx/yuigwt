package org.sgx.yuigwt.yui.anim;

import org.sgx.yuigwt.yui.base.Base;

/**
 * 
 * @author sg
 * 
 */
public class Anim extends Base {
	protected Anim() {
	}
	
	/**
	 * fires after the animation completes.
	 */
	public static final String EVENT_END = "end";  
	/**	
	 * fires when an animation begins an iteration. 
	 */
	public static final String EVENT_ITERATION = "iteration";  
	
	/**	
	 * fires when an animation is paused.
	 */
	public static final String EVENT_PAUSE = "pause";  
	
	/**	
	 * fires when an animation is resumed (run from pause).
	 */
	public static final String EVENT_RESUME = "resume";  
	
	/**	
	 * fires when an animation is resumed (run from pause).
	 */
	public static final String EVENT_START = "start";  
	
	/**	
	 * fires every frame of the animation.
	 */
	public static final String EVENT_TWEEN = "tween";  
	
	
	
	
	/**
	 * Stops the animation and resets its time.
	 * 
	 * @return this for chaining methods.
	 */
	public native final Anim stop()/*-{
		this.stop();
		return this;
	}-*/;

	/**
	 * Stops the animation and resets its time.
	 * 
	 * @param If
	 *            true, the animation will move to the last frame
	 * @return this for chaining methods.
	 */
	public native final Anim stop(boolean finish)/*-{
		this.stop(finish);
		return this;
	}-*/;

	/**
	 * Pauses the animation and freezes it in its current state and time.
	 * Calling run() will continue where it left off.
	 * 
	 * @return this for chaining methods.
	 */
	public native final Anim pause()/*-{
		this.pause();
		return this;
	}-*/;

	/**
	 * Starts or resumes an animation.
	 * 
	 * @return this for chaining methods.
	 */
	public native final Anim run()/*-{
	this.run();
	return this;  
}-*/;

}
