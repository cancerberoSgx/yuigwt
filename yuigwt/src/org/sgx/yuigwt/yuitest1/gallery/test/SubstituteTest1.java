package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.yui.SubstituteCallback;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.user.client.Window;
/**
 * Y.Substitute usage test
 * @author sg
 *
 */
public class SubstituteTest1 extends AbstractTest {

public SubstituteTest1() {
	super("substitute1", "Y.Substitute usage test", 
			new String[]{GalleryConstants.TAG_YUI, GalleryConstants.TAG_UTILS}, 
			TestResources.instance.SubstituteTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"substitute"}, new YUICallback() {
	@Override
	public void ready(final YuiContext Y) {
		
		//Y.substitute test simple		
		String template1 = "My name is {name}, and I'm {age} years old"; 
		final JsObject person1 = JsObject.one("name", "Sebastián Gurin")._("age", 28);
		Window.alert(Y.substitute(template1, person1));
		
		//Y.substitute test - using a function substituter
		String template2 = "My name is {name}, and I'm {age} years old and my sister name is {sister.name jaja} with {sister.age jeje} years old."; 
		final JsObject person2 = JsObject.one("name", "Laura Gurin")._("age", 25);
		person1._("sister", person2); 
		SubstituteCallback<String> substituter1 = new SubstituteCallback<String>() {
			@Override
			public String call(String key, String value, String param1) {
				if(value==null && key != null && key.startsWith("sister.")) {
					String kn = key.substring("sister.".length(), key.length()); 
					return person1.objGetObj("sister").objGetString(kn)+"(param1=="+param1+")";
				}
				else return null; 
			}
		};
		Window.alert(Y.substitute(template2, person1, substituter1));
		
		//Y.substitute with recursion	TODO
//		String template3 = "My name is {name}, and I'm {age} years old"; 
//		final JsObject obj1 = JsObject.one("name", "Sebastián Gurin")._("age", 28);
//		Window.alert(Y.substitute(template3, obj1));
	}
}); 
}

}
