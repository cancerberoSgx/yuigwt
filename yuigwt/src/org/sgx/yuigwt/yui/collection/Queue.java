package org.sgx.yuigwt.yui.collection;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Y.Queue Java API using generics overlay type
 * 
 * @author sg
 * 
 */
public class Queue<T> extends JavaScriptObject {
	protected Queue() {
	}

	/**
	 * add a new item to the end of the queue
	 * 
	 * @return self for method chaining
	 */
	public native final Queue<T> add(T item) /*-{
		this.add(item);
		return this;
	}-*/;

	/**
	 * Returns the current index in the queue of the specified item
	 * 
	 * @param item
	 * @return the index of the item or -1 if not found
	 */
	public native final int indexOf(T item) /*-{
		return this.indexOf(item);
	}-*/;

	/**
	 * Get the last in the queue. LIFO support.
	 * 
	 * @param item
	 * @return the last item in the queue.
	 */
	public native final T last() /*-{
		return this.last();
	}-*/;

	/**
	 * Get the next item in the queue. FIFO support
	 * 
	 * @param item
	 * @return the next item in the queue.
	 */
	public native final T next() /*-{
		return this.next();
	}-*/;

	/**
	 * Moves the referenced item to the head of the queue
	 * 
	 * @param item
	 *            an item in the queue
	 * @return self for method chaining.
	 */
	public native final Queue<T> promote(T item) /*-{
		this.promote(item);
		return this;
	}-*/;

	/**
	 * Removes the referenced item from the queue
	 * 
	 * @param item
	 *            an item in the queue
	 * @return self for method chaining.
	 */
	public native final Queue<T> remove(T item) /*-{
		this.remove(item);
		return this;
	}-*/;

	/**
	 * @return the current number of queued items.
	 */
	public native final int size() /*-{
		return this.size(item);
	}-*/;

}
