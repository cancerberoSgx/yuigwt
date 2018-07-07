package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.datatype.NumberFormat;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.core.client.JsDate;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.Window;
/**
 * data type tests
 * @author sg
 *
 */
public class DataTypeTest1 extends AbstractTest {

public DataTypeTest1() {
	super("dataType1", "data type tests", new String[]{GalleryConstants.TAG_DATATYPE, GalleryConstants.TAG_YUI, GalleryConstants.TAG_UTILS}, 
			TestResources.instance.DataTypeTest1());
}


public void test(final Node parent) {
	YUI.YUI(YuiConfig.create().lang("ko-KR")).use(new String[]{"datatype"}, new YUICallback() {	
		
		public void ready(YuiContext Y) {
			
			//parse and format some dates
			
			JsDate now = JsDate.create(); 
			Window.alert(Y.DataTypeDate().format(now, "%x %X")); 			

			JsDate date3 = Y.DataTypeDate().parse(new int[]{1995,11,17,3,24,0}); 
			Window.alert(Y.DataTypeDate().format(date3, "century: %c")); 
			
			//now parse and format some numbers
			double pi = Y.DataTypeNumber().parseDouble(" 3.1415 ");
			String formated = Y.DataTypeNumber().format(pi, NumberFormat.create().decimalSeparator(" . "));
			String formated2 = Y.DataTypeNumber().format(123123123.176, NumberFormat.create().
					decimalSeparator(",").
					prefix("€").
					thousandsSeparator(".").
					decimalPlaces(2).
					suffix(" (EUR)")); 
			Window.alert("numbers formated: "+formated+"    -   "+formated2); 
			
			String xml1 = "<p>aslkdjas<h>alskd</h></p>"; 
			Document doc1 = Y.DataTypeXML().parse(xml1);
			Window.alert("first tag is : "+
				doc1.getDocumentElement().getTagName()+
				"\nxml formatted is: \n"+
				Y.DataTypeXML().format(doc1)); 
		}
	}); 	
}

}
