package org.sgx.yuigwt.yuitest1.gallery.test.uibinder.userguide;

import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;

/** 
 * @author sg
 * 
 */
public class MainMenu extends YUIBinded {

	interface MyUiBinder extends UiBinder<Widget, MainMenu> {
	}

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);	

	@UiField Element menuEl; 
	
	public MainMenu(YuiContext y) {
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
		return new Element[]{menuEl};
	}

}
