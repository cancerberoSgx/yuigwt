package org.sgx.yuigwt.yui.widget.gwt;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AbstractWidget extends Composite {

	private static AbstractWidgetUiBinder uiBinder = GWT.create(AbstractWidgetUiBinder.class);

	interface AbstractWidgetUiBinder extends UiBinder<Widget, AbstractWidget> {
	}

	public AbstractWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
