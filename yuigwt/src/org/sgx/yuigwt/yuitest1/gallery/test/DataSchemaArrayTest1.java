package org.sgx.yuigwt.yuitest1.gallery.test;


import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.dataschema.DataSchemaResult;
import org.sgx.yuigwt.yui.dataschema.Field;
import org.sgx.yuigwt.yui.dataschema.Schema;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsArr;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.Window;
/**
 * dataschema test 1. The analog javascript: 
 * <pre>
YUI().use("dataschema-array", function(Y) {
    var data_in = [
            {make:"Chevrolet",model:"Bel Air",year:1957},
            {make:"Dodge",model:"Dart",year:1964},
            {make:"Ford",model:"Mustang",year:1968}
        ],
        schema = {
            // Or simply: ["make", "model", "year"]
            resultFields: [{key:"make"}, {key:"model"}, {key:"year"}]
        },
        data_out = Y.DataSchema.Array.apply(schema, data_in));

    alert(data_out);
});</pre>
 * @author sg
 *
 */
public class DataSchemaArrayTest1 extends AbstractTest {

public DataSchemaArrayTest1() {
	super("dataSchema1", "data schema test 1", 
		new String[]{GalleryConstants.TAG_DATASCHEMA, GalleryConstants.TAG_UTILS}, 
		TestResources.instance.DataSchemaTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"dataschema-array"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		
		//create some json data using JsArr and JSObject - this data is commonly returned by the server in json
		JsArr data_in = JsArr.create(
			JsObject.one("make", "Chevrolet")._("model", "Bel Air")._("year", 1957),
			JsObject.one("make", "Dodge")._("model", "Dart")._("year", 1964),
			JsObject.one("make", "Ford")._("model", "Mustang")._("year", 1968) 
		); 
		Schema schema = Schema.create().resultFields(new Field[]{
			Field.create().key("model"), Field.create().key("year") 
		}); 
		DataSchemaResult data_out = Y.DataSchemaArray().apply(schema, data_in);
		Window.alert(Y.dump(data_out.results())); //data_out.results().length()+" - "+JsUtil.dumpObj(data_out, true));
		
		
		//another little test, this time reading a json string contained mixed formed data
		String data_in2  = "[\n"+
		"            {make:\"Chevrolet\",model:\"Bel Air\",year:1957},\n"+
		"            [\"Dodge\", \"Dart\", 1964],\n"+
		"            \"1968 Ford Mustang\"\n"+
		"]"; 
		
		Schema schema2 = Schema.create().resultFields(new Field[]{
				Field.create().key("make"), Field.create().key("model"), Field.create().key("year") 
		}); 
		DataSchemaResult data_out2 = Y.DataSchemaArray().apply(schema2, JsonUtils.unsafeEval(data_in2));
		Window.alert(Y.dump(data_out2.results())); 
	}
}); 
}

}
