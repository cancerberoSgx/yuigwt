package org.sgx.yuigwt.alloyuitest1.test;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.resources.client.TextResource;

public abstract class AbstractTest implements Test {
String name, description; 
String[]tags;
Map<String, TextResource> testResources; ; 
public AbstractTest(String name, String description, String[] tags) {
	super();
	this.name = name;
	this.description = description;
	this.tags = tags;
	testResources=new HashMap<String, TextResource>();
}
public AbstractTest(String name, String description, String[] tags, TextResource res) {
	this(name, description, tags);
	testResources.put(this.getClass().getName(), res); 
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

public Map<String, TextResource> getTestResources() {
	return testResources;
}
}
