package org.sgx.yuigwt.alloyuitest1;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class AlloyuiGalleryTestEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		AlloyuiGallery gal = new AlloyuiGallery();
		gal.render(RootPanel.get().getElement()); 
		
	}

}
