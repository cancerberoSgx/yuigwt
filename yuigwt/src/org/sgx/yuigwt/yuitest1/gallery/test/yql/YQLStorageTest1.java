package org.sgx.yuigwt.yuitest1.gallery.test.yql;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.yql.YQL;
import org.sgx.yuigwt.yui.yql.YQLCallback;
import org.sgx.yuigwt.yui.yql.YQLParams;
import org.sgx.yuigwt.yui.yql.api.YQLResult;
import org.sgx.yuigwt.yui.yql.api.yql.storage.admin.StorageAdminResult;
import org.sgx.yuigwt.yui.yql.api.yql.storage.admin.StorageAdminResultInserted;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;
import org.sgx.yuigwt.yuitest1.gallery.test.yql.YQLStorageTest1.Apple;
/**
 * test yql.storage
 * @author sg
 *
 */
public class YQLStorageTest1 extends AbstractTest implements YUICallback {

protected Node parent;
protected Console console;
protected YuiContext Y;
private YQLParams params1;
private String selectUrl;

public YQLStorageTest1() {
	super("YQLStorageTest1", "test yql.storage", 
		new String[]{GalleryConstants.TAG_BUTTON, GalleryConstants.TAG_YQL, 
			GalleryConstants.TAG_AUTOCOMPLETE}, 
		TestResources.instance.YQLTest2());
}



public void test(Node parent) {
	this.parent=parent; 
	//load yui usng this as the YUI callback, see ready() method
	YUI.Use(new String[]{"yql", "console", "button","dump", "json", "io", "panel",
		"autocomplete", "autocomplete-filters", "autocomplete-highlighters"}, this); 
}

public void ready(YuiContext Y_) {
	this.console = Y_.newConsole().collapsed(true).render().cast();
	console.contentBox().setX(200); 
	this.Y=Y_; 
	params1 = YQLParams.create().format("json").diagnostics("true"); 	
//	createRecord1(); 

	Apple a1 = new Apple("apple1", "red", 123);
	nativeMethod1(a1, this.Y, this.console); 
//	console.log(Y.dump(a1, 10), "", ""); 
}

private native final void nativeMethod1(Apple a1, YuiContext y, Console console)/*-{
	var s = "{";
	for(var i in a1) {
		s+=i+", "; 
	}
//	$wnd.alert(a1+" - "+y+" - "+console+" - "+y.dump	); 
	console.log(s, "", ""); 
}-*/;
static class Apple {
	String name, color; 
	int age;
	
	public Apple(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
}
private void createRecord1() {
//YQL yql1 = Y.newYQL("insert into yql.storage.admin (value) values (\"example text content\") ", new YQLCallback() {			
//	
//	public void call(YQLResult r) {
//		 
//		StorageAdminResult result = r.query().results().cast();
//		StorageAdminResultInserted inserted = result.inserted(); 
//		if(result.inserted()!=null) {
//			console.log("record created urls : execute: "+inserted.execute()+", select: "+inserted.select()+", update: "+inserted.update());
//		}
//		else {
//			console.log("record not created, perhaps an error...: "+ Y.JSON().stringify(result));
//		}
////			console.log(Y.JSON().stringify(result));
//					 
//	}
//}, params1); 
	
	selectUrl = "store://KbcHl12L8CI7OsolbPhuzy"; 
//	execute: store://pNvQT4AQ0502pInhbVGVSy, select: store://KbcHl12L8CI7OsolbPhuzy, update: store://IiJ32WF0pxqqHqG9mYRBCO
	
	selectRecord1(); 

}





private void selectRecord1() {
	YQL yql1 = Y.newYQL("select * from yql.storage where name=\""+selectUrl+"\"", new YQLCallback() {			
	
	public void call(YQLResult r) {
		 
		StorageAdminResult result = r.query().results().cast();
//		StorageAdminResultInserted inserted = result.inserted(); 
//		if(result.inserted()!=null) {
//			console.log("record created urls : execute: "+inserted.execute()+", select: "+inserted.select()+", update: "+inserted.update());
//		}
//		else {
//			console.log("record not created, perhaps an error...: "+ Y.JSON().stringify(result));
//		}
			console.log(Y.JSON().stringify(result));
					 
	}
}, params1); 
}

}
