package org.sgx.yuigwt.yuigallery;

import org.sgx.yuigwt.yui.yui.PluginBase;
import org.sgx.yuigwt.yui.yui.YuiPluginHome;
import org.sgx.yuigwt.yuigallery.tokenInput.TokenInputPlugin;
/**
 * since we cannot override YuiContext.Plugin(), we introduce YuiGalleryContext.GalleryPlugin()
 * that will return this class - that contain Y.Plugin.* accessors for gallery's plugin
 * @author sg
 *
 */
public class GalleryPluginHome extends YuiPluginHome{
protected GalleryPluginHome(){}

public native final TokenInputPlugin TokenInput()/*-{
	return this.TokenInput; 
}-*/;


}
