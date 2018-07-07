//package org.sgx.madrenecesidad.client.ui.editor;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class ActionNotificator<T> {
//	List<ActionListener<T>> listeners; 
//	public ActionNotificator(){
//		listeners=new LinkedList<ActionListener<T>>(); 
//	}
//	public void addActionListener(ActionListener<T> l) {
//		listeners.add(l);
//	}
//	public void notifyAction(T t) {
//		for(ActionListener<T> l : listeners) {
//			l.notifyAction(t);
//		}
//	}
//
//}
