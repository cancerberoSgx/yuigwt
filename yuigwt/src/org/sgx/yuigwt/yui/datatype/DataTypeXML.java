package org.sgx.yuigwt.yui.datatype;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;

public class DataTypeXML extends JavaScriptObject{
protected DataTypeXML(){}
public native final String format(Document xmlDoc)/*-{
return this.format(xmlDoc); 
}-*/;
public native final Document parse(String xml)/*-{
return this.parse(xml); 
}-*/;
}
