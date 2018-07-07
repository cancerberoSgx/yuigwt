package org.sgx.yuigwt.yuitest1.gallery.test.gal;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GALLERY;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_IO;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_JSON;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_TREEVIEW;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.io.IO;
import org.sgx.yuigwt.yui.io.IOConfig;
import org.sgx.yuigwt.yui.io.IOEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollView.Flick;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewConfig;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.yui_treeview.TreeLeafConfig;
import org.sgx.yuigwt.yuigallery.yui_treeview.TreeView;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.Window;
/**
 * Using gallery treeview module, io, and json modules we load a big json file containing all yui modules meta/module.json information created with tool ExtractmoduleJson.java and show all this information using treeview and panel. 
 * @see http://allenrabinovich.github.com/gallery-yui-treeview/apidocs/classes/TreeView.html
 * @see http://yuilibrary.com/gallery/show/yui-treeview
 * <pre>

</pre>

 * @author sg
 *
 */
public class TreeViewTest2 extends AbstractTest {

protected YuiGalleryContext Y;
protected JsArray<JsObject> moduleInfo;
protected Node parent;
public TreeViewTest2() {
	super("treeview2", "Using gallery treeview module, io, and json modules we load a big json file containing all yui modules meta/module.json information created with tool ExtractmoduleJson.java and show all this information using treeview and panel.", 
		new String[]{TAG_TREEVIEW, TAG_WIDGET, TAG_GALLERY, TAG_IO, TAG_JSON}, 
		TestResources.instance.gal_TreeViewTest2());
}


public void test(final Node parent) {
YUI.YUI(
//	YuiConfig.create().gallery("gallery-2012.07.18-13-22")
	YuiConfig.create().gallery(GalleryConstants.LATEST_BUILD)
).use(	
new String[]{"gallery-yui-treeview", "io", "json"}, new YUICallback() {
	
	public void ready(YuiContext Y_) {		
		Y = Y_.cast(); 		
		TreeViewTest2.this.parent = parent; 
		parent.append("YUI modules and submodules hierarchical information. "); 
		
		//get the json string using io
		String uri1 = GWT.getModuleBaseURL()+"testfiles/yuimodulesMeta.json"; 
		IOConfig ioConfig = IOConfig.create().
				on(IO.EVENT_SUCCESS, new EventCallback<IOEvent>() {		
			
			public void call(IOEvent e) {
				//data arrived, use json for parsing it and draw the tree
				String json = e.data().responseText(); 
//				JsObject obj = Y.JSON().parse("("+json+")").cast(); 
				moduleInfo = JsUtil.eval(json).cast(); //obj.objGetObj("value").cast(); //JsonUtils.unsafeEval(json); //; 				
				renderUi(); 
			}			
		}).on(IO.EVENT_FAILURE, new EventCallback<IOEvent>() {
			
			public void call(IOEvent e) {
				Window.alert("FAIL to load data. Status: "+e.data().status()+
					" - "+e.data().statusText()); 
			}
		}).cast(); 
		Y.newIO(ioConfig).send(uri1, ioConfig);	
	}
}); 
}
protected void renderUi() {
	JsArray<TreeLeafConfig> leafs1 = JsArray.createArray().cast(); 	
	for (int i = 0; i < moduleInfo.length(); i++) {
		JsObject module = moduleInfo.get(i); 
		leafs1.push(buildLeaf(module)); 
	}
	TreeView treeView1 = Y.newTreeView(TreeLeafConfig.create().collapsed(false)
		.label("Yui Modules metainformation").children(leafs1).id("tree1")); 		
	Node treeViewParentNode = Y.one(parent.getDOMNode()); 
	treeView1.collapsed(false); 
	treeView1.render(treeViewParentNode); 
	treeViewParentNode.setStyles(Style.create().overflow("scroll")); 	
}

private TreeLeafConfig buildLeaf(JsObject module) {
	String moduleName = module.objProps().get(0);		
	TreeLeafConfig leaf = TreeLeafConfig.create()
		.label(moduleName).id(moduleName).type("TreeView").cast();
	
	TreeLeafConfig submodulesLeaf = TreeLeafConfig.create()
		.label("submodules").type("TreeView").cast(); 
	
	TreeLeafConfig useLeaf = TreeLeafConfig.create()
		.label("use").type("TreeView").cast(); 
	
	TreeLeafConfig requiresLeaf = TreeLeafConfig.create()
		.label("requires").type("TreeView").cast(); 
	
	leaf.children(submodulesLeaf, useLeaf, requiresLeaf); 
	
	JsObject modObj = module.objGetObj(moduleName);
	
	//do submodules
	JsObject submodules = modObj.objGetObj("submodules"); 
	if(submodules!=null) {
		JsArrayString submodulesNames =submodules.objProps(); 
		JsArray<TreeLeafConfig> submoduleChildren = JsArray.createArray().cast(); 
		for (int i = 0; i < submodulesNames.length(); i++) {
			String smn = submodulesNames.get(i); 
			TreeLeafConfig leaf2 = TreeLeafConfig.create().label(smn).id(moduleName+"-"+smn).cast();
			submoduleChildren.push(leaf2); 
		}
		submodulesLeaf.children(submoduleChildren);
	}
	
	//do use
	JsArrayString useArray = modObj.objGetArr("use").cast();
	if(useArray!=null) {
		JsArray<TreeLeafConfig> useChildren = JsArray.createArray().cast(); 
		for (int i = 0; i < useArray.length(); i++) {
			TreeLeafConfig leaf2 = TreeLeafConfig.create().label(useArray.get(i)).cast();
			useChildren.push(leaf2); 
		}
		useLeaf.children(useChildren); 
	}
	
	//do requires
	JsArrayString requiresArray = modObj.objGetArr("requires").cast();
	if(requiresArray!=null) {
		JsArray<TreeLeafConfig> requiresChildren = JsArray.createArray().cast(); 
		for (int i = 0; i < requiresArray.length(); i++) {
			TreeLeafConfig leaf2 = TreeLeafConfig.create().label(requiresArray.get(i)).cast();
			requiresChildren.push(leaf2); 
		}
		requiresLeaf.children(requiresChildren); 
	}
	
	return leaf; 
}

}
