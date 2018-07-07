package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.gwt.GWTUtil;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimpleCheckBox;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;
/**
 * this example shows how YUI widgets and GWT widgets can be mixed on the same  
 * GUI using methods of GWTUtil. This is a very manual experiment, for more refined ways see using YUI + UIBinder. 
 * @author sg
 *
 */

public class GWTWidgetTest1 extends AbstractTest {

public GWTWidgetTest1() {
	super("gwtWidget1", "this example shows how YUI widgets and GWT widgets can be mixed on the same GUI. This is a very manual experiment, for more refined ways see using YUI + UIBinder.", 
		new String[]{GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_EXT, GalleryConstants.TAG_GWT}, 
		TestResources.instance.GWTWidgetTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"button"}, new YUICallback() {

	
	public void ready(final YuiContext Y) {
		
		/* using GWT widgets and YUI widgets together.
		 * 
		 * First usecase: put GWT widgets inside YUI Nodes
		 */
		
		parent.append("<h2>Add a common GWT button</h2>"); 
		
		//create a GWT Panel wrapping YUI Node parent
		Panel gwtParent = parent.asHTMLPanel(); //GWTUtil.YUI2GWT(Y, parent);
		
		gwtParent.add(new Button("gwtbutton1")); 		
		
		/*
		 * second usecase, put YUI widgets inside GWT panel
		 */		
		HorizontalPanel hpanel1 = new HorizontalPanel(); 
		
		//create a YUI button not rendered
		org.sgx.yuigwt.yui.widget.button.Button yuibutton1 = Y.newButton(ButtonConfig.create().label("YUIButton1"));
		
		//create a GWT widget wrapping our YUI button
		Widget yuiButtonGwtized = GWTUtil.YUI2GWT(Y, yuibutton1); 
		
		hpanel1.add(yuiButtonGwtized); 
		

		
		//another much simpler way - use yuiWidget.render(gwtWidget) with GWT HTML widget
//		HTML gwt1 = new HTML("<button>asdasd</button>");
//		hpanel1.add(gwt1); 
//		Y.newButton(ButtonConfig.create().label("YUIButton2")).render(gwt1);
		
		
		gwtParent.add(hpanel1); 
		
		
		parent.append("<h2>Now include a full GWT Widget made with GWT designer in the YUI parent Node: </h2>"); 
		
		GwtWidgetSnippet1 gwtPanel1 = new GwtWidgetSnippet1(); 
		gwtParent.add(gwtPanel1);
		
	}
}); 
}


/**
 * a GWT widget snippet created in a init using GWT designer. 
 */
public class GwtWidgetSnippet1 extends FlexTable {
	public GwtWidgetSnippet1() {
		
		DisclosurePanel disclosurePanel = new DisclosurePanel("New panel", true);
		setWidget(0, 0, disclosurePanel);
		
		FlexTable flexTable_1 = new FlexTable();
		disclosurePanel.setContent(flexTable_1);
		flexTable_1.setSize("5cm", "4cm");
		
		Label lblThisIsYour = new Label("This is your status: ");
		flexTable_1.setWidget(0, 0, lblThisIsYour);
		
		Tree tree = new Tree();
		flexTable_1.setWidget(1, 0, tree);
		
		TreeItem trtmNewItem = new TreeItem( new SafeHtmlBuilder().appendEscaped("new item").toSafeHtml());
		tree.addItem(trtmNewItem);
		
		TreeItem trtmNewItem_1 = new TreeItem( new SafeHtmlBuilder().appendEscaped("new item").toSafeHtml());
		trtmNewItem.addItem(trtmNewItem_1);
		trtmNewItem.setState(true);
		
		TreeItem trtmNewItem_2 = new TreeItem( new SafeHtmlBuilder().appendEscaped("new item").toSafeHtml());
		tree.addItem(trtmNewItem_2);
		
		TreeItem trtmNewItem_4 = new TreeItem( new SafeHtmlBuilder().appendEscaped("new item").toSafeHtml());
		trtmNewItem_2.addItem(trtmNewItem_4);
		trtmNewItem_2.setState(true);
		
		TreeItem trtmNewItem_3 = new TreeItem( new SafeHtmlBuilder().appendEscaped("new item").toSafeHtml());
		tree.addItem(trtmNewItem_3);
		
		FlexTable flexTable = new FlexTable();
		setWidget(0, 2, flexTable);
		flexTable.setSize("100%", "100%");
		
		Label lblWhatDayIs = new Label("what day is today ? ");
		flexTable.setWidget(0, 0, lblWhatDayIs);
		
		DatePicker datePicker = new DatePicker();
		flexTable.setWidget(0, 1, datePicker);
		flexTable.getCellFormatter().setVerticalAlignment(0, 0, HasVerticalAlignment.ALIGN_TOP);
		flexTable.getCellFormatter().setVerticalAlignment(0, 1, HasVerticalAlignment.ALIGN_TOP);
		
		Label lblApplyMegaprotocol = new Label("apply megaprotocol ? ");
		flexTable.setWidget(1, 0, lblApplyMegaprotocol);
		
		SimpleCheckBox simpleCheckBox = new SimpleCheckBox();
		flexTable.setWidget(1, 1, simpleCheckBox);
		getCellFormatter().setVerticalAlignment(0, 0, HasVerticalAlignment.ALIGN_TOP);
		
		TabPanel tabPanel = new TabPanel();
		setWidget(1, 0, tabPanel);
		tabPanel.setWidth("100%");
		
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		tabPanel.add(horizontalPanel, "New tab", false);
		horizontalPanel.setSize("5cm", "3cm");
		
		DateBox dateBox_1 = new DateBox();
		horizontalPanel.add(dateBox_1);
		
		Button btnNewButton = new Button("New button");
		horizontalPanel.add(btnNewButton);
		
		Label lblNewLabel = new Label("New label");
		horizontalPanel.add(lblNewLabel);
		
		Button btnNewButton_1 = new Button("New button");
		horizontalPanel.add(btnNewButton_1);
		
		VerticalPanel verticalPanel = new VerticalPanel();
		tabPanel.add(verticalPanel, "New tab", false);
		verticalPanel.setSize("5cm", "3cm");
		
		Button btnNewButton_2 = new Button("New button");
		verticalPanel.add(btnNewButton_2);
		
		DateBox dateBox = new DateBox();
		verticalPanel.add(dateBox);
		
		ListBox comboBox = new ListBox();
		verticalPanel.add(comboBox);
		
		TextArea textArea = new TextArea();
		verticalPanel.add(textArea);
		getFlexCellFormatter().setColSpan(1, 0, 3);
		getCellFormatter().setVerticalAlignment(1, 0, HasVerticalAlignment.ALIGN_TOP);
		
		tabPanel.selectTab(1); 
		
	}
}

}
