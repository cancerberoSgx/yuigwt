package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_JSINJAVA;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_NODE;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_RESIZE;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsFunction;
import org.sgx.yuigwt.yui.util.JsFunctionBuilder;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.user.client.Window;

/**
 * some test on manipulating json objects and strings in java and Y.JSON
 * 
 * @author sg
 * 
 */
public class JSONTest1 extends AbstractTest {

	public JSONTest1() {
		super("json1", "some test on manipulating json objects and strings in java and Y.JSON", new String[] { TAG_NODE,
				TAG_RESIZE, TAG_JSINJAVA }, TestResources.instance.JSONTest1());
	}

	@Override
	public void test(final Node parent) {
		YUI.Use(new String[] { "json", "io", "button" }, new YUICallback() {

			@Override
			public void ready(final YuiContext Y) {

				String errMsg = null;

				// test 1 : parse a json string

				String jsonStr1 = " {\"troop\":[{\"name\":\"Ashley\",\"age\":12},{\"name\":\"Abby\",\"age\":9}]}";
				JsObject obj1 = Y.JSON().parse(jsonStr1).cast();

				if (obj1.objGetArr("troop").length() != 2)
					errMsg = "obj1.objGetArr(\"troop\").length()!=2";

				// test 2 : parse another json string

				String jsonStr2 = "{\"data\": [ "
						+ "    {\"category\":\"5/1/2010\", \"miscellaneous\":2000, \"expenses\":3700, \"revenue\":2200}, "
						+ "    {\"category\":\"5/2/2010\", \"miscellaneous\":50, \"expenses\":9100, \"revenue\":100}, "
						+ "    {\"category\":\"5/3/2010\", \"miscellaneous\":400, \"expenses\":1100, \"revenue\":1500}, "
						+ "    {\"category\":\"5/4/2010\", \"miscellaneous\":200, \"expenses\":1900, \"revenue\":2800}, "
						+ "    {\"category\":\"5/5/2010\", \"miscellaneous\":5000, \"expenses\":5000, \"revenue\":2650}"
						+ "]}";

				/*
				 * Note: due to GWT types restrictions, we couldn't represent the JSON.parse() reviver function using a Java JsObject (function return value can be anything).
				 * Instead se define a js function inline using JsFunctionBuilder.
				 */
				JsFunction reviver2 = new JsFunctionBuilder() {
					@Override
					public native final JsFunction buildFunction()/*-{
						return function(k, v) {
							if (k == "miscellaneous" && v > 500)
								return 999999;
							else
								return v;
						}
					}-*/;
				}.buildFunction();

				JsObject obj2 = Y.JSON().parse(jsonStr2, reviver2).cast();

				if (obj2.objGetArr("data").length() != 5)
					errMsg = "obj2.objGetArr(\"troop\").length()!=5";

				if (obj2.objGetArr("data").getObj(2).objGetInt("miscellaneous") != 400)
					errMsg = "obj2.objGetArr(\"data\").getObj(2).objGetInt(\"miscellaneous\")!=400 but "
							+ obj2.objGetArr("data").getObj(2).objGetInt("miscellaneous");

				if (obj2.objGetArr("data").getObj(0).objGetInt("miscellaneous") != 999999)
					errMsg = "obj2.objGetArr(\"data\").getObj(0).objGetInt(\"miscellaneous\")!=999999";

				// test 3 : try to parse an invalid json string and catch the exeption.
				boolean err = false;
				try {
					JsObject obj3 = Y.JSON().parse("{blsbls: dhhdhd , , [.]}").cast();
				} catch (JavaScriptException e) {
					err = true;
					Window.alert(e + "");
				}
				if (!err)
					errMsg = "Invalid json parse() do not throw exception. ";

				if (errMsg != null)
					Window.alert("ERROR: " + errMsg);

			}
		});
	}

}
