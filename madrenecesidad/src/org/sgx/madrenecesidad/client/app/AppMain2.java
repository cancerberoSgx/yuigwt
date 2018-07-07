package org.sgx.madrenecesidad.client.app;

import org.sgx.madrenecesidad.client.util.BootStrapUtil;

import com.github.gwtbootstrap.client.ui.Button;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AppMain2 extends Composite {

	private static AppMain2UiBinder uiBinder = GWT.create(AppMain2UiBinder.class);

	interface AppMain2UiBinder extends UiBinder<Widget, AppMain2> {
	}

	@UiField Button b1;
	
	public AppMain2() {
		initWidget(uiBinder.createAndBindUi(this));
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("clicked"); 
			}
		}); 
		
		BootStrapUtil.scrollspy(".navbar"); 
	}

}
