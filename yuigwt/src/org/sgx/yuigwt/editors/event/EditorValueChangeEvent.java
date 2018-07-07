package org.sgx.yuigwt.editors.event;

import org.sgx.yuigwt.editors.Editor;

//import org.sgx.gwteditors.client.editor.Editor;


public class EditorValueChangeEvent<T> {

Editor src;
Object value;
EditorValueChangeEvent<?> childEvent;

public EditorValueChangeEvent(Editor<T> src, T value) {
	this(src, value, null);
}
public EditorValueChangeEvent(Editor<T> src, T value,
		EditorValueChangeEvent<Object> childEvent) {
	super();
	this.src = src;
	this.value = value;
	this.childEvent=childEvent;
}
public T getValue() {
	return (T) value;
}
public void setValue(T value) {
	this.value = value;
}
public Editor<T> getSrc() {
	return src;
}
public void setSrc(Editor<T> src) {
	this.src = src;
}
public EditorValueChangeEvent<?> getChildEvent() {
	return childEvent;
}
public void setChildEvent(EditorValueChangeEvent<?> childEvent) {
	this.childEvent = childEvent;
}
public EditorValueChangeEvent<Object> getRootEvent() {
	EditorValueChangeEvent ev1=this, ev2 = ev1.childEvent;
	while(ev2!=null) {
		ev1=ev2;
		ev2=ev2.getChildEvent();
	}
	return ev1;
}

}

