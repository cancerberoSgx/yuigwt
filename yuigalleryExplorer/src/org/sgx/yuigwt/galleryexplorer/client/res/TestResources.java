package org.sgx.yuigwt.galleryexplorer.client.res;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface TestResources extends ClientBundle {
	
	public static TestResources instance = GWT.create(TestResources.class); 
	
	  @Source("data1.json")
	  public TextResource data1();
	  
}
