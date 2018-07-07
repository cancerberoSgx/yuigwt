package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.*;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsArr;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.util.SimpleCallback;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.util.YUIUtil;
import org.sgx.yuigwt.yui.widget.datatable.Column;
import org.sgx.yuigwt.yui.widget.datatable.DataTable;
import org.sgx.yuigwt.yui.widget.datatable.DataTableConfig;
import org.sgx.yuigwt.yui.widget.datatable.Formatter;
import org.sgx.yuigwt.yui.widget.datatable.FormatterContext;

import static org.sgx.yuigwt.yui.util.YUIUtil.NODE; 
//import org.sgx.yuigwt.yui.util.JsArr;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
/**
 * this is the equivalent of 
 * <pre>
   // A table from data with keys that work fine as column names
    var simple = new Y.DataTable({
        columns: ["id", "name", "price"],
        data   : [
{ id: "ga_3475", name: "gadget",   price: "$6.99" },
{ id: "sp_9980", name: "sprocket", price: "$3.75" },
{ id: "wi_0650", name: "widget",   price: "$4.25" }
        ],
        summary: "Price sheet for inventory parts",
        caption: "Example table with simple columns"
    });    
    simple.render("#simple");
</pre>

 * @author sg
 *
 */
public class DataTableTest1 extends AbstractTest {

public DataTableTest1() {
	super("dataTable1", "dataTable1", new String[]{TAG_DATATABLE, TAG_WIDGET}, 
			TestResources.instance.DataTableTest1());
}

/* yui uses json obnjects for poblating its objects - here we show you how it can be done in a more java way */

/** 
 * transform a model class into a javascript object
 */
public static interface JSProducer<T> {
	JavaScriptObject jsonize(T o); 
}


/**
 * the model class
 */
public static class Item {
	String id, name, price;
	public Item(String id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}	
}

public static JSProducer<Item> ItemJSProducer = new JSProducer<Item>() {

	
	public JavaScriptObject jsonize(Item item) {
		JsObject o = JsObject.one("id", item.getId()).
			_("name", item.getName()).
			_("price", item.getPrice());
		return o; 
	}
}; 

public static <T> JsArray<JavaScriptObject> javaArrayToJs(T[]javaArray, JSProducer<T> prod) {
	JsArray<JavaScriptObject> arr = JsArray.createArray().cast();
	for (int i = 0; i < javaArray.length; i++) {
		arr.push(prod.jsonize(javaArray[i])); 
	}
	return arr; 
}

public void test(final Node parent) {
YUI.Use(new String[]{"datatable"}, new YUICallback() {
	
	public void ready(YuiContext Y) {
		//creates a simple html table for putting datatables inside. 
		parent.append(NODE(Y, "tag: 'table'", "", new Node[]{
			NODE(Y, "tag: 'tr'", "", new Node[]{
				NODE(Y, "tag: 'td', id: 'ssimple1'"),
				NODE(Y, "tag: 'td', id: 'ssimple2'"), 
			}), 
			NODE(Y, "tag: 'tr'", "", new Node[]{
				NODE(Y, "tag: 'td', id: 'ssimple3'"),
				NODE(Y, "tag: 'td', id: 'ssimple4'"), 
			})	
		})); 
		
		parent.all("table td").setStyles(Style.create().margin("20px").padding("20px")); 
		
		/* first of all the java model I want to put in the datatable : */
		Item[] items = new Item[]{
			new Item("ga_3475", "gadget", "$6.99"),
			new Item("sp_9980", "sprocket", "$3.75"),
			new Item("wi_0650", "widget", "$4.25")
		}; 
		
		JsArray<JavaScriptObject> jsItems = javaArrayToJs(items, ItemJSProducer);
		
		DataTable dt1 = Y.newDataTable(DataTableConfig.create().
			columns(new String[]{"id", "name", "price"}).
			data(jsItems).
			caption("Example table with simple columns from java model").
			summary("Price sheet for inventory parts"));
		dt1.render("#ssimple1"); 
		
		DataTable dt2 = Y.newDataTable(DataTableConfig.create().
			columns(new String[]{"id", "name", "price"}).
			data((JsArray<JavaScriptObject>) JsonUtils.unsafeEval("["+
				"{id: \"ga_3475\", name: \"gadget\",   price: \"$6.99\" },\n"+
				"{ id: \"sp_9980\", name: \"sprocket\", price: \"$3.75\" },\n"+
				"{ id: \"wi_0650\", name: \"widget\",   price: \"$4.25\" }"+
			"]")).
			caption("Example table with sortable columns from json string").
			summary("Price sheet for inventory parts").sortable(true));
		dt2.render("#ssimple2"); 
		
		
		//one more experiment: a data table that change its data after 3 secs
		final DataTable dt3 = Y.newDataTable(DataTableConfig.create().
			columns((JsArray<Column>) JsArr.create(
				Column.create().key("username"), 
				Column.create().label("Access").children(new String[]{"read", "write"})).cast()).
			data((JsArray<JavaScriptObject>) JsonUtils.unsafeEval("["+
				"{ username: \"root\", read: true, write: true },\n"+
				"{ username: \"spilgrim\", read: true, write: false },\n"+
				"{ username: \"fizzgig\", read: false, write: false }"+
			"]")).
			caption("Example table with sortable columns from json string").
			summary("Price sheet for inventory parts").sortable(true));
		dt3.render("#ssimple3"); 
		
		JsUtil.setTimeout(new SimpleCallback() {			
			
			public void call() {
				dt3.data((JsArray<JavaScriptObject>) JsonUtils.unsafeEval("["+
					"{ username: \"root123\", read: true, write: true },\n"+
					"{ username: \"2222spilgrim\", read: true, write: false },\n"+
					"{ username: \"3333fizzgig\", read: false, write: false }"+
				"]")); 
				dt3.render(); 
			}
		}, 3000); 
		
		
		
		/* 
		 * one more experiment: a data table with very custom columns - 
		 * one using formatter, allowHTML and datatable event delegate for links 
		 */
		
		Formatter urlColumnFormatter = new Formatter() {
			
			public String format(FormatterContext o) {
				return "<a href=\""+o.value()+"\">"+o.value()+"</a>";
			}			
		}; 
		JsArray<Column> columns4 = (JsArray<Column>) JsArr.create(
				Column.create().key("username").sortable(true), 
				Column.create().label("Access").children(new String[]{"read", "write"}), 
				Column.create().key("url").label("Link").formatter(urlColumnFormatter).allowHTML(true).sortable(true)
			).cast(); 
		
		JsArray<JavaScriptObject> data4 = (JsArray<JavaScriptObject>) JsonUtils.unsafeEval("["+
				"{ username: \"root\", read: true, write: true, url: \"http://www.microsoft.com\" },\n"+
				"{ username: \"spilgrim\", read: true, write: false, url: \"http://www.yahoo.com\" },\n"+
				"{ username: \"fizzgig\", read: false, write: false, url: \"http://www.google.com\" }"+
			"]"); 
		final DataTable dt4 = Y.newDataTable(DataTableConfig.create().
			columns(columns4).
			data(data4).
			caption("a data table with very custom columns").
			summary("Price sheet for inventory parts")
//			.sortable(true)
		);
		dt4.render("#ssimple4");
		//use Datatable.delegate() for preventing link default behavoir
		dt4.delegate("click", new EventCallback<EventFacade>() {
			
			public void call(EventFacade e) {
				e.preventDefault(); 
			}
		}, "a"); 
		
	}
}); 
}

}


