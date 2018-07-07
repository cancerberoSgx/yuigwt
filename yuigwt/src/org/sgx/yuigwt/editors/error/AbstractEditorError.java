package org.sgx.yuigwt.editors.error;

import org.sgx.yuigwt.editors.Editor;

//import org.sgx.gwteditors.client.editor.Editor;

public class AbstractEditorError<T> implements EditorError<T>{
String 
//type, 
name
//, description
;
Editor<T> source;

public AbstractEditorError(String name,
		Editor<T> source) {
	super();
//	this.type = type;
	this.name = name;
//	this.description = description;
	this.source = source;
}
//public String getType() {
//	return type;
//}
//public void setType(String type) {
//	this.type = type;
//}
public String getMessage() {
	return name;
}
public void setMessage(String name) {
	this.name = name;
}
//public String getDescription() {
//	return description;
//}
//public void setDescription(String description) {
//	this.description = description;
//}
public Editor<T> getSource() {
	return source;
}
public void setSource(Editor<T> source) {
	this.source = source;
}
@Override
public String toString() {
	return "Error "+getMessage()+". Source editor: "+getSource();
}

}
