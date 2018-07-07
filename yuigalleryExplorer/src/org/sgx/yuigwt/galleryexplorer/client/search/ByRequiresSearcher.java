package org.sgx.yuigwt.galleryexplorer.client.search;

import org.sgx.yuigwt.galleryexplorer.client.api.Module;
import org.sgx.yuigwt.galleryexplorer.client.ui.GalleryUtil;

import com.google.gwt.core.client.JsArrayString;
public class ByRequiresSearcher implements Searcher<Module>{
	
	String require;
	private GalleryUtil util; 
	
	public ByRequiresSearcher(GalleryUtil util, String require) {
		this.require=require; 
		this.util=util; 
	}

	@Override
	public JsArrayString autocompleteData() {
		return util.getModuleTags(); 
	}

	@Override
	public boolean contains(Module m) {
		return m.requires().contains(require); 
	}

	public String getRequire() {
		return require;
	}

	public void setRequire(String require) {
		this.require = require;
	}
	
}