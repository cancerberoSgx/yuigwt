package org.sgx.yuigwt.galleryexplorer.client;

import org.sgx.yuigwt.galleryexplorer.client.ui.Gallery;
import org.sgx.yuigwt.galleryexplorer.client.ui.GalleryUtil;
import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;

import com.google.gwt.core.client.EntryPoint;

public class YuigalleryExplorer implements EntryPoint, YUICallback {
	
	private Gallery gallery;

	public void onModuleLoad() {
		YUI.YUI().use(GalleryUtil.INITIALMODULES, this); 
	}

	@Override
	public void ready(YuiContext Y_) {
		YuiGalleryContext Y = (YuiGalleryContext)Y_; 
		Node rootNode = Y.one("body"); 
		gallery = new Gallery(Y,rootNode); 
//		gal.render(); 
	}
}
