package org.sgx.yuigwt.yui.history;

import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * @author sg
 * 
 */
public class HistoryEvent extends EventFacade {
	protected HistoryEvent() {
	}

	/**
	 * Object hash of state items that have been added or changed. The key is the item key, and the value is an object containing newVal and prevVal properties representing the
	 * values of the item both before and after the change. If the item was newly added, prevVal will be undefined.
	 * 
	 * @return
	 */
	public native final JsObject changed() /*-{
		return this.changed;
	}-*/;

	/**
	 * Object hash of state items that have been added or changed. The key is the item key, and the value is an object containing newVal and prevVal properties representing the
	 * values of the item both before and after the change. If the item was newly added, prevVal will be undefined.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryEvent changed(JavaScriptObject val) /*-{
		this.changed = val;
		return this;
	}-*/;

	/**
	 * Object hash of key/value pairs of state items that have been removed. Values are the old values prior to removal.
	 * 
	 * @return
	 */
	public native final JsObject removed() /*-{
		return this.removed;
	}-*/;

	/**
	 * Object hash of key/value pairs of state items that have been removed. Values are the old values prior to removal.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryEvent removed(JavaScriptObject val) /*-{
		this.removed = val;
		return this;
	}-*/;

	/**
	 * The source of the event. This can be used to selectively ignore events generated by certain sources.
	 * 
	 * <p>
	 * All History event facades include a src property that indicates the source of the event. You can filter on this property to ignore events triggered by sources you don't care
	 * about, or to avoid handling duplicate events.
	 * </p>
	 * 
	 * 
	 * <p>
	 * Y.HistoryBase.SRC_ADD Event was triggered by a call to add() or addValue() on a history adapter.
	 * </p>
	 * <p>
	 * Y.HistoryBase.SRC_REPLACE Event was triggered by a call to replace() or replaceValue() on a history adapter.
	 * </p>
	 * <p>
	 * Y.HistoryHash.SRC_HASH Event was triggered by a change to the URL hash fragment.
	 * </p>
	 * <p>
	 * Y.HistoryHTML5.SRC_POPSTATE Event was triggered by the HTML5 popstate event.
	 * </p>
	 * 
	 * <p>
	 * The following example demonstrates how to handle only events that were triggered by a change to the URL hash, while ignoring events from other sources:
	 * </p>
	 * 
	 * <pre>
	 * Y.on('history:change', function (e) {
	 *   if (e.src === Y.HistoryHash.SRC_HASH) {
	 *     // ...
	 *   }
	 * });
	 * </pre>
	 * 
	 * @return
	 */
	public native final String src() /*-{
		return this.src;
	}-*/;

	/**
	 * The source of the event. This can be used to selectively ignore events generated by certain sources.
	 * 
	 * <p>
	 * All History event facades include a src property that indicates the source of the event. You can filter on this property to ignore events triggered by sources you don't care
	 * about, or to avoid handling duplicate events.
	 * </p>
	 * 
	 * 
	 * <p>
	 * Y.HistoryBase.SRC_ADD Event was triggered by a call to add() or addValue() on a history adapter.
	 * </p>
	 * <p>
	 * Y.HistoryBase.SRC_REPLACE Event was triggered by a call to replace() or replaceValue() on a history adapter.
	 * </p>
	 * <p>
	 * Y.HistoryHash.SRC_HASH Event was triggered by a change to the URL hash fragment.
	 * </p>
	 * <p>
	 * Y.HistoryHTML5.SRC_POPSTATE Event was triggered by the HTML5 popstate event.
	 * </p>
	 * 
	 * <p>
	 * The following example demonstrates how to handle only events that were triggered by a change to the URL hash, while ignoring events from other sources:
	 * </p>
	 * 
	 * <pre>
	 * Y.on('history:change', function (e) {
	 *   if (e.src === Y.HistoryHash.SRC_HASH) {
	 *     // ...
	 *   }
	 * });
	 * </pre>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryEvent src(String val) /*-{
		this.src = val;
		return this;
	}-*/;
}
