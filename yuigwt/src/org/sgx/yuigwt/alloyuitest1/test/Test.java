package org.sgx.yuigwt.alloyuitest1.test;

import java.util.Map;

import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.resources.client.TextResource;

public interface Test {
void test(Node parent); 
String[] getTags(); 
String getDescription(); 
String getName(); 
Map<String, TextResource> getTestResources(); 
}
