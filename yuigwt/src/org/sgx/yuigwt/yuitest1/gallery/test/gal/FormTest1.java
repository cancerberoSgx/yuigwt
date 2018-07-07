package org.sgx.yuigwt.yuitest1.gallery.test.gal;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GALLERY;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.form.Form;
import org.sgx.yuigwt.yuigallery.form.FormConfig;
import org.sgx.yuigwt.yuigallery.form.FormField;
import org.sgx.yuigwt.yuigallery.form.FormFieldConfig;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.user.client.Window;
/**
 *
 * @author sg
 *
 */
public class FormTest1 extends AbstractTest {

public FormTest1() {
	super("form1", "gallery-form module tests", new String[]{TAG_WIDGET, TAG_GALLERY}, 
		TestResources.instance.gal_FormTest1());
}

@Override
public void test(final Node parent) {
YUI.YUI(YuiConfig.create().gallery("gallery-2011.11.10-16-24")).use(
new String[]{"gallery-form"}, new YUICallback() {
	@Override
	public void ready(YuiContext Y_) {		
		
		//cast to YuiGalleryContext for using the yui gallery java api.
		final YuiGalleryContext Y = Y_.cast(); 
		
		FormField checkbox1 = Y.newCheckboxField(FormFieldConfig.create().
			name("myCheckbox").value("check").label("Do you like sports?")); 
		
		Window.alert(Y.FormField().INVALID_DATE_MESSAGE()+" - "+checkbox1.label()); 
		
		Form form1 = Y.newForm(FormConfig.create().method("post").
			action("/test.php?action=submit").
			inlineValidation(true).
			children(

				checkbox1, 
				
				FormFieldConfig.create("text").name("input1").label("Email input").validator("email"), 
				
				FormFieldConfig.create("SelectField").label("Radio Choices").name("choiceinput").choices(
					FormFieldConfig.create().label("Choice A").value("A"),
					FormFieldConfig.create().label("Choice B").value("B")
				), 
				
				FormFieldConfig.create("SubmitButton").value("submit")
				
		)); 
		
		form1.render(parent);
		
		//OK, now just use independent form widgets
		
//		panel1 = parent.append("<span></span>"); 
	}
}); 
}

}
