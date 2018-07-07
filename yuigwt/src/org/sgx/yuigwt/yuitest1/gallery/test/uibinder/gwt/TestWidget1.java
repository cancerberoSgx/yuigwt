package org.sgx.yuigwt.yuitest1.gallery.test.uibinder.gwt;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class TestWidget1 extends Composite {

	private static TestWidget1UiBinder uiBinder = GWT.create(TestWidget1UiBinder.class);

	interface TestWidget1UiBinder extends UiBinder<Widget, TestWidget1> {
	}

	public TestWidget1() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
