package org.sgx.yuigwt.editors.impl;

import java.util.LinkedList;
import java.util.List;

import org.sgx.yuigwt.editors.AbstractUi;
import org.sgx.yuigwt.editors.Editor;
import org.sgx.yuigwt.editors.error.EditorError;
import org.sgx.yuigwt.editors.event.EditorEventManager;
import org.sgx.yuigwt.editors.event.ValueChangeListener;
import org.sgx.yuigwt.yui.YuiContext;
/**
 * 
 * @author sg
 *
 * @param <T>
 */
public abstract class AbstractEditor<T> extends AbstractUi implements Editor<T> {
	private boolean isSimple;

	public AbstractEditor(YuiContext y, boolean isSimple) {
		super(y);
		errors = new LinkedList<EditorError<T>>();
		this.isSimple = isSimple;
	}

	protected T model = null;

	public void load(final T model) {
		this.model = model;
		if (!this.isRendered()) {
			throw new RuntimeException("Editors must first rendered and then loaded. ");
		}
	}

	
	public boolean isSimple() {
		return isSimple;
	}

	List<EditorError<T>> errors;

	// protected Node node, parentNode;
	// /**
	// * implementors should set the node attribute here
	// */
	// public AbstractEditor(Node parentNode) {
	// super();
	// this.parentNode=parentNode;
	// }

	// public Node getNode() {
	// return node;
	// }
	// public void setNode(Node node) {
	// this.node = node;
	// }
	
	public void addValueChangeListener(ValueChangeListener<T> l) {
		EditorEventManager.<T> getInstance().addValueChangeListener(this, l);
	}

	
	public void removeValueChangeListener(ValueChangeListener<T> l) {
		EditorEventManager.<T> getInstance().removeValueChangeListener(this, l);
	}

	
	public List<EditorError<T>> getErrors() {
		return errors;
	}
}
