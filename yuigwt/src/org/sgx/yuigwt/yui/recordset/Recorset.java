package org.sgx.yuigwt.yui.recordset;

import org.sgx.yuigwt.yui.collection.ArrayList;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *The Recordset utility provides a standard way for dealing with a collection of similar objects. Provides the base Recordset implementation, which can be extended to add additional functionality, such as custom indexing. sorting, and filtering. 
 *@author sg
 *
 * @param <T>
 */
public class Recorset<T extends JavaScriptObject> extends ArrayList<T>{
protected Recorset(){}

}
