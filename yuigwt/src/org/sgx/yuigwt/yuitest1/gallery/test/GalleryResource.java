package org.sgx.yuigwt.yuitest1.gallery.test;

import com.google.gwt.resources.client.ResourcePrototype;

public class GalleryResource {
	ResourcePrototype resource; 
	String name;
	public GalleryResource(ResourcePrototype resource, String name) {
		super();
		this.resource = resource;
		this.name = name;
	}
	public ResourcePrototype getResource() {
		return resource;
	}
	public void setResource(ResourcePrototype resource) {
		this.resource = resource;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
}
