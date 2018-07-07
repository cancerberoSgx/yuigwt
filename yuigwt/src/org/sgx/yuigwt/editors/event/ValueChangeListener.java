package org.sgx.yuigwt.editors.event;


public interface ValueChangeListener<T> {

void notifyValueChange(EditorValueChangeEvent<T> evt);
}
