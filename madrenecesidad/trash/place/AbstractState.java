package org.sgx.madrenecesidad.client.trash.place;

import org.sgx.madrenecesidad.client.trash.ui_old.Ui;
import org.sgx.yuigwt.yui.YuiContext;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class AbstractState implements State {

	String name;
	JavaScriptObject data;
	Ui ui;
	protected YuiContext y;

	public AbstractState(YuiContext y, String name, JavaScriptObject data, Ui ui) {
		super();
		this.y=y; 
		this.name = name;
		this.data = data;
		this.ui = ui;
	}
//	public AbstractState(YuiContext y, String name, JavaScriptObject data) {
//		super();
//		this.y=y; 
//		this.name = name;
//		this.data = data;
////		this.ui = ui;
//	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JavaScriptObject getData() {
		return data;
	}

	public void setData(JavaScriptObject data) {
		this.data = data;
	}

	public Ui getUi() {
		return ui;
	}

	public void setUi(Ui ui) {
		this.ui = ui;
	}

}
