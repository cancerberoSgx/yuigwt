package org.sgx.yuigwt.yuitest1;

import java.util.Map;

import org.sgx.yuigwt.yui.util.Util;
import org.sgx.yuigwt.yuitest1.gallery.Gallery;

import com.google.gwt.core.client.EntryPoint;

public class Yui4GwtGalleryEntryPoint implements EntryPoint {
	
	public void onModuleLoad() {
		Map<String, String> urlParams = Util.parseUrlParams(Util.getCurrentAddressUrl());
		if(urlParams.containsKey("singleTest") && urlParams.containsKey("test")) {
			new GallerySingleTest(urlParams.get("test")).draw(); ; 
		}
		else {
			new Gallery().draw();
		}
	}
	
	
}
