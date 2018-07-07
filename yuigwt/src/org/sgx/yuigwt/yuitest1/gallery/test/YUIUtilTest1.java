package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yui.util.YUIUtil.NODE;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_EXT;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Attr;
import org.sgx.yuigwt.yui.util.Style;

/** creating markup from java code - YUIUtil.NODE - a java utility based 
 * on YUI node for creating nodes from java. 
 * Here we will show how to use YUIUtil.NODE for building node structures in 
 * java literally. First using JSON Strings for defining element's attrisbutes 
 * and style, and later. using javascript objects builded with HTMLAttrs 
 * and Style GWT overlay helpers. 
 */
public class YUIUtilTest1 extends AbstractTest {

public YUIUtilTest1() {
super("YUIUtil.NODE", "Creating markup from java code - YUIUtil.NODE - a java " +
		"utility based on YUI node for creating nodes from java. Shows how to use " +
		"YUIUtil.NODE for building node structures " +
		"in java literally. YUIUtil.NODE utility is not part of YUI, it is " +
		"writen in java based on YUI Node (yuigwt)", new String[]{TAG_EXT}, 
		TestResources.instance.YUIUtilTest1());
}


public void test(final Node parent) {
YUI.YUI().use(new String[]{"node"}, new YUICallback() {


public void ready(YuiContext Y) {



//build a simple node <input type="text" value="foo" style="border: 4px slid pink"></input>, using a json string for attrs
parent.append(NODE(Y, "id: 'pp123', tag: 'input', type: 'text', value: 'foo'", 
		"border: '4px solid pink'")); 

//and now compose a node structure <div><span>..</span, using a json string for attrs
parent.append(NODE(Y, "tag: 'div'", "border: '4px solid green'", new Node[]{
	NODE(Y, "tag: 'span', cdata: 'first box'", "border: '4px solid blue', margin: '10px'"),
	NODE(Y, "tag: 'span', cdata: 'second box'", "border: '4px solid red', padding: '14px'"), 
})); 
	

//build another structure this time using classes Attr and Style for setting attributes using java methods: 
parent.append(NODE(Y, Attr.create().tag("ul"), new Node[]{
	NODE(Y, Attr.create().tag("li").cdata("item 1")),
	NODE(Y, Attr.create().tag("li").cdata("item 2")), 
	NODE(Y, Attr.create().tag("li").cdata("item 3"), Style.create().backgroundColor("red").color("white")), 
})); 

//another example
Node n = NODE(Y, Attr.create("form").action("/action1").method("post"), null, new Node[]{
	NODE(Y, Attr.create("div").Class("formbox"), Style.create().backgroundColor("#ededed").marginTop("40px"), new Node[]{
		NODE(Y, Attr.create("input").type("checkbox").id("in1"), Style.create().textDecoration("underline"), new Node[]{}), 
		NODE(Y, Attr.create("label").cdata("Like Shakespeare?").For("in1"), Style.create().textDecoration("underline"), new Node[]{})
	}), 
	NODE(Y, Attr.create("div").Class("formbox"), Style.create().backgroundColor("#aaaaff").paddingTop("20px"), new Node[]{
		NODE(Y, Attr.create("input").type("submit").value("Save"), Style.create().textDecoration("underline"), new Node[]{})		
	})
}); 
parent.append(n);
}

}); 
}

}
