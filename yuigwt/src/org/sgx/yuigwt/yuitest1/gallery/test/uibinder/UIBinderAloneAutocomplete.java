package org.sgx.yuigwt.yuitest1.gallery.test.uibinder;

import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yuitest1.TestUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author sg
 * 
 */
public class UIBinderAloneAutocomplete extends YUIBinded {

	interface MyUiBinder extends UiBinder<Widget, UIBinderAloneAutocomplete> {
	}

	private static UiBinder<YUIBinded, Widget> uiBinder = GWT.create(MyUiBinder.class);

	@UiField
	Element acEl1, acEl2;	

	public UIBinderAloneAutocomplete(YuiContext y) {
		super(y); 
	}

	
	public void yuiBinded() {
		AutoComplete ac1 = getYUIBinder().getWidget(acEl1).cast();
		String[] source = new String[30]; 
		for (int i = 0; i < 30; i++) {
			source[i]=TestUtil.getInstance().randomLetters(TestUtil.getInstance().randomBetween(5, 12)); 
		}
		ac1.source(source); 
//		ac1.render(); 
	}

	
	public UiBinder<YUIBinded, Widget> getUIBinder() {
		return uiBinder;
	}	
	/**
	 * tell the YUIBinder which are the fields corresponding to YUI widgets. 
	 */
	
	public Element[] getYUIBindedEls() {
		return  new Element[] { acEl1, acEl2}; 
	}

}
