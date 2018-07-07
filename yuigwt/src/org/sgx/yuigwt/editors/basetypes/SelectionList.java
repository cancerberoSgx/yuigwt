package org.sgx.yuigwt.editors.basetypes;

import java.util.List;

import org.sgx.yuigwt.editors.util.Util;

//import org.sgx.gwteditors.client.util.Util;

public class SelectionList<T> {

	List<T> options, selection;
	boolean multiple;

	@SuppressWarnings("unchecked")
	public SelectionList(T[] options, T[] selection) {
		super();
		this.options = Util.toList(options);
		this.selection = Util.toList(selection);
	}

	public SelectionList(List<T> options, List<T> selection) {
		super();
		this.options = options;
		this.selection = selection;
	}

	public List<T> getOptions() {
		return options;
	}

	public void setOptions(List<T> options) {
		this.options = options;
	}

	public List<T> getSelection() {
		return selection;
	}

	public void setSelection(List<T> selection) {
		this.selection = selection;
	}

	public boolean isMultiple() {
		return multiple;
	}

	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}

	public T getItemNamed(String itemName) {
		for (T t : options) {
			if (t.toString().equals(itemName))
				return t;
		}
		return null;
	}

	public void setSelection(T t) {
		getSelection().clear();
		getSelection().add(t);
	}

	public void setSelection(T[] t) {
		setSelection(Util.toList(t));
	}

	@Override
	public String toString() {
		return "SelectionList(" + Util.print(getSelection()) + ")";
	}

}
