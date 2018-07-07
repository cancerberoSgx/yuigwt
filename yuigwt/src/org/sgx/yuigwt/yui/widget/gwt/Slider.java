package org.sgx.yuigwt.yui.widget.gwt;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.widget.slider.SliderConfig;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Slider extends Composite implements YUICallback {

	private static SliderUiBinder uiBinder = GWT.create(SliderUiBinder.class);

	interface SliderUiBinder extends UiBinder<Widget, Slider> {
	}

	static String[]MODULES={"slider"}; 
	@UiField Element el;
	private org.sgx.yuigwt.yui.widget.slider.Slider yuiSlider;
	
	public Slider() {
		initWidget(uiBinder.createAndBindUi(this));
		YUI.Use(MODULES, this); 
	}

	@Override
	public void ready(YuiContext Y) {
		yuiSlider = Y.newSlider(SliderConfig.create().srcNode(el)); 
		yuiSlider.render(); 
	}

}
