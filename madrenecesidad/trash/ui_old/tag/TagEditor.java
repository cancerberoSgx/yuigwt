package org.sgx.madrenecesidad.client.trash.ui_old.tag;

import org.sgx.madrenecesidad.client.model.Tag;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.HTMLUtil;

public class TagEditor {
private Tag model;
private YuiContext y;
private Node tableNode;
private Node nameEntry;
private Node descriptionEntry;
public TagEditor(YuiContext y, Tag model) {
	this.model=model; 
	this.y=y; 
}
public void render(Node parent) {
	HTMLUtil HTMLUtil = new HTMLUtil(y); 
	tableNode = HTMLUtil.newTable(parent);
	tableNode.addClass("formTable"); 
	HTMLUtil.appendRow(tableNode, "Name: ", "<input class=\"tagNameEntry\" type=\"text\"></input>");
	HTMLUtil.appendRow(tableNode, "Description: ", "<input class=\"tagDescriptionEntry\" type=\"text\"></input>");
	nameEntry = tableNode.one(".tagNameEntry");
	descriptionEntry = tableNode.one(".tagDescriptionEntry"); 
}
public Tag flush() {
//	Window.alert(nameEntry+" - "+nameEntry.get("value"));	
//	Main.getInstance().getConsole().log(nameEntry+""+" - "+descriptionEntry.get("value")+" - "+nameEntry.get("value")); 
	
//	JsObject _node = nameEntry.objGetObj("_node"); 
//	Main.getInstance().getConsole().log(
//		JsUtil.typeof(_node)+" - "+
//		y.dump(_node, 10)+" - "+y.dump(nameEntry, 10));
	
//	Main.getInstance().getConsole().log("TagEditor flush(): "+nameEntry.get("value"));
	
//	nameEntry.setStyles(Style.create().border("5px solid pink")); 
	model.setName(nameEntry.get("value"));
	model.setDescription(descriptionEntry.get("value")); 
	return model; 
}
public void load(Tag t) {
	this.model=t; 
	nameEntry.set("value", model.getName());
	descriptionEntry.set("value", model.getDescription()); 
	
//	Main.getInstance().getConsole().log("TagEditor load(): "+nameEntry.get("value"));
}
public Node getTableNode() {
	return tableNode;
}
}
