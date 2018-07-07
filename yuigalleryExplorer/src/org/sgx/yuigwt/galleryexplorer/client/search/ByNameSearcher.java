package org.sgx.yuigwt.galleryexplorer.client.search;

import org.sgx.yuigwt.galleryexplorer.client.api.Module;
import org.sgx.yuigwt.galleryexplorer.client.ui.GalleryUtil;

import com.google.gwt.core.client.JsArrayString;
public class ByNameSearcher implements Searcher<Module>{
	
	String name;
	private GalleryUtil util; 
	
	public ByNameSearcher(GalleryUtil util, String name) {
		this.name=name; 
		this.util=util; 
	}

	@Override
	public JsArrayString autocompleteData() {
		return util.getModuleNames(); 
	}

	@Override
	public boolean contains(Module m) {
		return m.module().equals(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}