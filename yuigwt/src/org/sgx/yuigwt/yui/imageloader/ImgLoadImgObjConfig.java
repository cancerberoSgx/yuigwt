package org.sgx.yuigwt.yui.imageloader;

import org.sgx.yuigwt.yui.base.BaseConfig;

public class ImgLoadImgObjConfig extends BaseConfig {
	protected ImgLoadImgObjConfig() {
	}

	public static final native ImgLoadImgObjConfig create()/*-{
		return {};
	}-*/;

	/**
	 * Background URL for the image. For an image whose URL is specified by
	 * "background-image" in the element's style.
	 * 
	 * @return
	 */
	public native final String bgUrl() /*-{
		return this.bgUrl;
	}-*/;

	/**
	 * Background URL for the image. For an image whose URL is specified by
	 * "background-image" in the element's style.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadImgObjConfig bgUrl(String val) /*-{
		this.bgUrl = val;
		return this;
	}-*/;

	/**
	 * HTML DOM id of the image element.
	 * 
	 * @return
	 */
	public native final String domId() /*-{
		return this.domId;
	}-*/;

	/**
	 * HTML DOM id of the image element.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadImgObjConfig domId(String val) /*-{
		this.domId = val;
		return this;
	}-*/;

	/**
	 * AlphaImageLoader enabled property to be set for the image. Only set if
	 * isPng value for this image is set to true. Defaults to true.
	 * 
	 * @return
	 */
	public native final String enabled() /*-{
		return this.enabled;
	}-*/;

	/**
	 * AlphaImageLoader enabled property to be set for the image. Only set if
	 * isPng value for this image is set to true. Defaults to true.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadImgObjConfig enabled(String val) /*-{
		this.enabled = val;
		return this;
	}-*/;

	/**
	 * Pixel height of the image. Will be set as a height attribute on the DOM
	 * element after the image is fetched. Defaults to the natural height of the
	 * image (no height attribute will be set). Usually only used with src
	 * images.
	 * 
	 * @return
	 */
	public native final int height() /*-{
		return this.height;
	}-*/;

	/**
	 * Pixel height of the image. Will be set as a height attribute on the DOM
	 * element after the image is fetched. Defaults to the natural height of the
	 * image (no height attribute will be set). Usually only used with src
	 * images.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadImgObjConfig height(int val) /*-{
		this.height = val;
		return this;
	}-*/;

	/**
	 * Whether the image is a PNG. PNG images get special treatment in that the
	 * URL is specified through AlphaImageLoader for IE, versions 6 and earlier.
	 * Only used with background images.
	 * 
	 * @return
	 */
	public native final boolean isPng() /*-{
		return this.isPng;
	}-*/;

	/**
	 * Whether the image is a PNG. PNG images get special treatment in that the
	 * URL is specified through AlphaImageLoader for IE, versions 6 and earlier.
	 * Only used with background images.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadImgObjConfig isPng(boolean val) /*-{
		this.isPng = val;
		return this;
	}-*/;

	/**
	 * Whether the image's style.visibility should be set to visible after the
	 * image is fetched. Used when setting images as visibility:hidden prior to
	 * image fetching.
	 * 
	 * @return
	 */
	public native final boolean setVisible() /*-{
		return this.setVisible;
	}-*/;

	/**
	 * Whether the image's style.visibility should be set to visible after the
	 * image is fetched. Used when setting images as visibility:hidden prior to
	 * image fetching.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadImgObjConfig setVisible(boolean val) /*-{
		this.setVisible = val;
		return this;
	}-*/;

	/**
	 * AlphaImageLoader sizingMethod property to be set for the image. Only set
	 * if isPng value for this image is set to true. Defaults to scale.
	 * 
	 * @return
	 */
	public native final String sizingMethod() /*-{
		return this.sizingMethod;
	}-*/;

	/**
	 * AlphaImageLoader sizingMethod property to be set for the image. Only set
	 * if isPng value for this image is set to true. Defaults to scale.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadImgObjConfig sizingMethod(String val) /*-{
		this.sizingMethod = val;
		return this;
	}-*/;

	/**
	 * Source URL for the image. For an image whose URL is specified by a "src"
	 * attribute in the DOM element.
	 * 
	 * @return
	 */
	public native final String srcUrl() /*-{
		return this.srcUrl;
	}-*/;

	/**
	 * Source URL for the image. For an image whose URL is specified by a "src"
	 * attribute in the DOM element.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadImgObjConfig srcUrl(String val) /*-{
		this.srcUrl = val;
		return this;
	}-*/;

	/**
	 * Pixel width of the image. Will be set as a width attribute on the DOM
	 * element after the image is fetched. Defaults to the natural width of the
	 * image (no width attribute will be set). Usually only used with src
	 * images.
	 * 
	 * @return
	 */
	public native final int width() /*-{
		return this.width;
	}-*/;

	/**
	 * Pixel width of the image. Will be set as a width attribute on the DOM
	 * element after the image is fetched. Defaults to the natural width of the
	 * image (no width attribute will be set). Usually only used with src
	 * images.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadImgObjConfig width(int val) /*-{
		this.width = val;
		return this;
	}-*/;
}
