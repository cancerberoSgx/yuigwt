package org.sgx.yuigwt.yui.imageloader;

import org.sgx.yuigwt.yui.base.Base;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.dom.client.Element;

/**
 * A group for images. A group can have one time limit and a series of triggers.
 * Thus the images belonging to this group must share these constraints.
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/ImgLoadGroup.html
 * @author sg
 * 
 */
public class ImgLoadGroup extends Base {
	protected ImgLoadGroup() {
	}

	/**
	 * Displays the images in the group. This method is called when a trigger
	 * fires or the time limit expires; it shouldn't be called externally, but
	 * is not private in the rare event that it needs to be called immediately.
	 */
	public native final void fetch() /*-{
		this.fetch();
	}-*/;

	// TODO addCustomTrigger

	/**
	 * Adds a trigger to the group. Arguments are passed to Y.on.
	 * 
	 * @param obj
	 *            The DOM object to attach the trigger event to
	 * @param type
	 *            The event type
	 * @return self for method chaining
	 */
	public native final ImgLoadGroup addTrigger(Element obj, String type) /*-{
		this.addTrigger(obj, type);
		return this;
	}-*/;

	/**
	 * Adds a trigger to the group. Arguments are passed to Y.on.
	 * 
	 * @param obj
	 *            The DOM object to attach the trigger event to
	 * @param type
	 *            The event type
	 * @return self for method chaining
	 */
	public native final ImgLoadGroup addTrigger(String obj, String type) /*-{
		this.addTrigger(obj, type);
		return this;
	}-*/;

	/**
	 * Adds a trigger to the group. Arguments are passed to Y.on.
	 * 
	 * @param obj
	 *            The DOM object to attach the trigger event to
	 * @param type
	 *            The event type
	 * @return self for method chaining
	 */
	public native final ImgLoadGroup addTrigger(Node obj, String type) /*-{
		this.addTrigger(obj, type);
		return this;
	}-*/;

	/**
	 * Registers an image with the group. Arguments are passed through to a
	 * Y.ImgLoadImgObj constructor; see that class' attribute documentation for
	 * detailed information. "domId" is a required attribute.
	 * 
	 * @param obj
	 *            A configuration object literal with attribute name/value pairs
	 *            (passed through to a Y.ImgLoadImgObj constructor)
	 * @return Y.ImgLoadImgObj that was registered
	 */
	public native final ImgLoadImgObj registerImage(ImgLoadImgObjConfig obj) /*-{
		return this.registerImage(obj);
	}-*/;

}
