package org.sgx.yuigwt.yuitest1.gallery.test;

import java.util.Map;

import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.resources.client.TextResource;

public interface Test {
void test(Node parent); 
String[] getTags(); 
String getDescription(); 
String getName(); 
Map<String, ResourcePrototype> getTestResources(); 
}
