package org.sgx.yuigwt.yui.imageloader;

import org.sgx.yuigwt.yui.base.Base;

/**
 * Image objects to be registered with the groups
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/ImgLoadImgObj.html
 * @author sg
 * 
 */
public class ImgLoadImgObj extends Base {
	protected ImgLoadImgObj() {
	}

	/**
	 * Displays the image; puts the URL into the DOM. This method shouldn't be
	 * called externally, but is not private in the rare event that it needs to
	 * be called immediately.
	 * 
	 * @param withinY
	 *            The pixel distance from the top of the page, for which if the
	 *            image lies within, it will be fetched. Undefined indicates
	 *            that no check should be made, and the image should always be
	 *            fetched
	 * @return Whether the image has been fetched (either during this execution
	 *         or previously)
	 */
	public native final boolean fetch(int withinY) /*-{
		return this.fetch(withinY);
	}-*/;

}
