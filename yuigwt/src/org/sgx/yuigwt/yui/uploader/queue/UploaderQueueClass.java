package org.sgx.yuigwt.yui.uploader.queue;

import org.sgx.yuigwt.yui.base.Base;
import org.sgx.yuigwt.yui.base.BaseClass;

/**
 * This class manages a queue of files to be uploaded to the server.
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Uploader.Queue.html
 * 
 * @author sg
 * 
 */
public class UploaderQueueClass extends BaseClass {
	protected UploaderQueueClass() {
	}

	/**
	 * Static constant for the value of the errorAction attribute: prescribes
	 * the queue to continue uploading files in case of an error.
	 * 
	 * @return
	 */
	public final native String CONTINUE()/*-{
		return this.CONTINUE;
	}-*/;

	/**
	 * Static constant for the value of the errorAction attribute: prescribes
	 * the queue to restart an errored out file upload after other files have
	 * finished uploading.
	 * 
	 * @return
	 */
	public final native String RESTART_AFTER()/*-{
		return this.RESTART_AFTER;
	}-*/;

	/**
	 * Static constant for the value of the errorAction attribute: prescribes
	 * the queue to restart a file upload immediately in case of an error.
	 * 
	 * @return
	 */
	public final native String RESTART_ASAP()/*-{
		return this.RESTART_ASAP;
	}-*/;

	/**
	 * Static constant for the value of the errorAction attribute: prescribes
	 * the queue to stop uploading files in case of an error.
	 * 
	 * @return
	 */
	public final native String STOP()/*-{
		return this.STOP;
	}-*/;

	/**
	 * Static constant for the value of the _currentState property: implies that
	 * the queue is currently not uploading files.
	 * 
	 * @return
	 */
	public final native String STOPPED()/*-{
		return this.STOPPED;
	}-*/;

	/**
	 * Static constant for the value of the _currentState property: implies that
	 * the queue is currently uploading files.
	 * 
	 * @return
	 */
	public final native String UPLOADING()/*-{
		return this.UPLOADING;
	}-*/;

}
