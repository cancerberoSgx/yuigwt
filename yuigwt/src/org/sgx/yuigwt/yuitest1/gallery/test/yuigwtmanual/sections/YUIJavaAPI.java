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
public class YUIJavaAPI extends YUIBinded {

	interface MyUiBinder extends UiBinder<Widget, YUIJavaAPI> {
	}

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);	
	
	public YUIJavaAPI(YuiContext y) {
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

}
