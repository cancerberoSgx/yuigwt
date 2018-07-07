package org.sgx.yuigwt.alloyuitest1.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface TestResources extends ClientBundle {
	public static TestResources instance = GWT.create(TestResources.class);

	@Source("ButtonItemTest1.java")
	public TextResource ButtonItemTest1();
	
	@Source("ColorPickerTest1.java")
	public TextResource ColorPickerTest1();
	
	
}
