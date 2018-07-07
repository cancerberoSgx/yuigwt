package org.sgx.yuigwt.yuitest1.gallery.test;


import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.dataschema.DataSchemaResult;
import org.sgx.yuigwt.yui.dataschema.Field;
import org.sgx.yuigwt.yui.dataschema.Schema;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.HTMLUtil;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.widget.datatable.DataTable;
import org.sgx.yuigwt.yui.widget.datatable.DataTableConfig;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.Window;
/**
 * example similar to http://yuilibrary.com/yui/docs/dataschema/dataschema-table.html
 * @author sg
 *
 */
public class DataSchemaXMLTable1 extends AbstractTest {

public DataSchemaXMLTable1() {
	super("DataSchemaXMLTable1", "example similar to http://yuilibrary.com/yui/docs/dataschema/dataschema-table.html", 
		new String[]{GalleryConstants.TAG_DATASCHEMA, GalleryConstants.TAG_UTILS}, 
		TestResources.instance.DataSchemaXMLTable1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"datatype-xml", "dataschema-xml", "node", "dump", "datatable"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		parent.append(
			" <table id=\"simple\">\n"+
			"    <tr>\n"+
			"        <td>coffee</td>\n"+
			"        <td>1.25</td>\n"+
			"    </tr>\n"+
			"    <tr>\n"+
			"        <td>juice</td>\n"+
			"        <td>2.00</td>\n"+
			"    </tr>\n"+
			"    <tr>\n"+
			"        <td>tea</td>\n"+
			"        <td>1.25</td>\n"+
			"    </tr>\n"+
			"    <tr>\n"+
			"        <td>soda</td>\n"+
			"        <td>1.00</td>\n"+
			"    </tr>\n"+
			"    </table>"); 
		
		Node table = Y.one("#simple");
		
		Schema schema = Schema.create().resultListLocator("tr").resultFields(new Field[]{
			Field.create().key("beverage").locator("td[1]"), 
			Field.create().key("price").locator("td[2]")
		}); 
		
		DataSchemaResult ret = Y.DataSchemaXML().apply(schema, table.getDOMNode());
		
		if(ret.error()!=null)
			throw new JavaScriptException(ret.error()); 
		Window.alert(Y.dump(ret)); 
			
	}
}); 
}

}
