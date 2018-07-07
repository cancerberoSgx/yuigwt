package org.sgx.yuigwt.galleryexplorer.client.search;

import org.sgx.yuigwt.galleryexplorer.client.api.Module;
import org.sgx.yuigwt.galleryexplorer.client.ui.GalleryUtil;

import com.google.gwt.core.client.JsArrayString;
public class ByTagsSearcher implements Searcher<Module>{
	
	String tag;
	private GalleryUtil util; 
	
	public ByTagsSearcher(GalleryUtil util, String name) {
		this.tag=name; 
		this.util=util; 
	}

	@Override
	public JsArrayString autocompleteData() {
		return util.getModuleTags(); 
	}

	@Override
	public boolean contains(Module m) {
		return m.tags().contains(tag); 
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	

}