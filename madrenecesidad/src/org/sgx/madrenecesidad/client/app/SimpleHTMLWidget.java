package org.sgx.madrenecesidad.client.app;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.UIObject;

public class SimpleHTMLWidget extends UIObject {

	private static SimpleHTMLWidgetUiBinder uiBinder = GWT.create(SimpleHTMLWidgetUiBinder.class);

	interface SimpleHTMLWidgetUiBinder extends UiBinder<Element, SimpleHTMLWidget> {
	}

	public SimpleHTMLWidget() {
		setElement(uiBinder.createAndBindUi(this));
	}


}
