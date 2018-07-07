package org.sgx.yuigwt.yuitest1.gallery.test;

import java.util.HashMap;
import java.util.Map;

import org.sgx.yuigwt.yuitest1.TestUtil;

import com.google.gwt.resources.client.ResourcePrototype;

public abstract class AbstractTest implements Test {
protected String name, description; 
protected String[]tags;
protected Map<String, ResourcePrototype> testResources; 
protected TestUtil testUtil; 
public AbstractTest(String name, String description, String[] tags) {
	super();
	this.name = name;
	this.description = description;
	this.tags = tags;
	testUtil = TestUtil.getInstance(); 
	testResources=new HashMap<String, ResourcePrototype>();
}
public AbstractTest(String name, String description, String[] tags, ResourcePrototype res) {
	this(name, description, tags);
	testResources.put(this.getClass().getName(), res); 
}
public AbstractTest(String name, String description, String[] tags, GalleryResource[] res) {
	this(name, description, tags);
	for (int i = 0; i < res.length; i++) {
		testResources.put(res[i].getName(), res[i].getResource()); 
	}	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String[] getTags() {
	return tags;
}
public void setTags(String[] tags) {
	this.tags = tags;
} 
@Override
public Map<String, ResourcePrototype> getTestResources() {
	return testResources;
}
}
