package org.sgx.yuigwt.yuitest1.gallery.test.yuigwtmanual.sections;

import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;

/** 
 * @author sg
 * 
 */
public class Introduction extends YUIBinded {

	interface MyUiBinder extends UiBinder<Widget, Introduction> {
	}

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);	
	
	public Introduction(YuiContext y) {
		super(y); 
	}

	
	public void yuiBinded() {
		
	}

	
	public UiBinder getUIBinder() {
		return uiBinder;
	}

	
	public Element[] getYUIBindedEls() {
		return new Element[]{};
	}

}
