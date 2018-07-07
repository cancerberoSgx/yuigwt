package org.sgx.yuigwt.yuitest1.gallery.test.uibinder;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;

public class GWTTest1 extends FlexTable {
	public GWTTest1() {
		
		Label lblNewLabel = new Label("is a GWT FlexTable with some YUI+UIBinder Widgets ");
		setWidget(0, 0, lblNewLabel);
	}

}
