package org.sgx.yuigwt.yui.io;

import org.sgx.yuigwt.yui.event.EventTargetClass;

/**
 * Y.IO.* properties
 * 
 * @author sg
 * 
 */
public class IOClass extends EventTargetClass {
	protected IOClass() {
	}

	/**
	 * @return Delay value to calling the Flash transport, in the event io.swf
	 *         has not finished loading. Once the EXDRREADY event is fired, this
	 *         value will be set to 0.
	 */
	public native final int delay() /*-{
		return this.delay;
	}-*/;

	/**
	 * return Y.io.queue the default io task queue TODO:there is little YUI
	 * documentation, i don't know if this is a AynxQueue, but the API seems the
	 * same.
	 * 
	 * @return
	 */
	public native final IOQueue queue() /*-{
		return this.queue;
	}-*/;

	/**
	 * return Y.io.queue the default io task queue TODO:there is little YUI
	 * documentation, i don't know if this is a AynxQueue, but the API seems the
	 * same.
	 * 
	 * @return the new IOTask object for the new queue entry
	 */
	public native final IOTask queue(String uri) /*-{
		return this.queue(uri);
	}-*/;
}
