package org.sgx.yuigwt.yuitest1.gallery.test.uibinder.userguide;

import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.user.client.ui.Widget;

/** 
 * @author sg
 * 
 */
public class AvailableYUIWidgets extends YUIBinded {

	interface MyUiBinder extends UiBinder<Widget, AvailableYUIWidgets> {
	}

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);	
	
	public AvailableYUIWidgets(YuiContext y) {
		super(y); 
	}

	@Override
	public void yuiBinded() {
		
	}

	@Override
	public UiBinder getUIBinder() {
		return uiBinder;
	}

	@Override
	public Element[] getYUIBindedEls() {
		return new Element[]{};
	}
	/**
	 * Will be used for creating SourceCodeViewer instances of this UIBinder widget. 
	 * @return a new SourceCodeViewer
	 */
	@UiFactory
	SourceCodeViewer makeSourceCodeViewer() {
		return new SourceCodeViewer(y);
	}
}
