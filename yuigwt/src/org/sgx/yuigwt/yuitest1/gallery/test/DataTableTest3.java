package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.attr.Attribute;
import org.sgx.yuigwt.yui.collection.ArrayListCallback;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.model.ModelList;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.datatable.Column;
import org.sgx.yuigwt.yui.widget.datatable.DataTable;
import org.sgx.yuigwt.yui.widget.datatable.DataTableConfig;
import org.sgx.yuigwt.yui.widget.datatable.DataTableEvent;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * the same example as in http://yuilibrary.com/yui/docs/datatable/datatable-chkboxselect.html 
 * @author sg
 * 
 */
public class DataTableTest3 extends AbstractTest {

protected Node processOutput;
protected DataTable table1;
protected YuiContext Y;

public DataTableTest3() {
	super("dataTable3", "the same example as in <a href=\"http://yuilibrary.com/yui/docs/datatable/datatable-chkboxselect.html\">datatable-chkboxselect</a>", 
			new String[] { GalleryConstants.TAG_DATATABLE, GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_MODEL},
			TestResources.instance.DataTableTest3());
}

@Override
public void test(final Node parent) {

	String[] modules = { "datatable", "datatable-sort", "datatable-scroll", "button" };
	YUI.Use(modules, new YUICallback() {

		@Override
		public void ready(final YuiContext Y) {
			DataTableTest3.this.Y=Y; 
			Column[] table1Columns = new Column[]{
				Column.create()
					.key("select")
					.allowHTML(true)
					.label("x")//<input type=\"checkbox\" class=\"protocol-select-all\" title=\"Toggle ALL records\"/>")
					.formatter("<input type=\"checkbox\" checked/>")
					.emptyCellValue("<input type=\"checkbox\"/>"), 
				Column.create().key("port").label("Port Number"), 
				Column.create().key("pname").label("Protocol"),
				Column.create().key("ptitle").label("Common name"), 
			}; 
			table1 = Y.newDataTable(DataTableConfig.create()
				.columns(table1Columns)
				.data(getData())
				.scrollable("xy")				
				.sortable(new String[]{"port", "pname"})
				.sortBy("port")
				.recordType(new String[]{"select", "port", "pname", "ptitle"})
				.height("250px").width("400px")			
			); 
			table1.render(parent); 
			
			table1.delegate("click", new EventCallback<DataTableEvent>() {
				@Override
				public void call(DataTableEvent e) {
					// undefined to trigger the emptyCellValue
					boolean checked = e.targetNode().getBoolean("checked");
					table1.getRecord(e.targetNode()).set("select", checked); 
					// Uncheck the header checkbox
					table1.getNode("contentBox").one(".protocol-select-all").set("checked", false); 

				}
			},  ".yui3-datatable-data .yui3-datatable-col-select input");
						
			//Also define a listener on the single TH checkbox to toggle all of the checkboxes
						
			//a button to process the checked records and another to clear the selection. 
			Y.newButton(ButtonConfig.create().label("Proccess selection").render(parent).
				on("click", new EventCallback<ButtonEvent>() {				
					@Override
					public void call(ButtonEvent e) {
						process(); 
					}
				})
			); 
			Y.newButton(ButtonConfig.create().label("Delete selected").render(parent).
				on("click", new EventCallback<ButtonEvent>() {				
					@Override
					public void call(ButtonEvent e) {
						deleteSelected(); 
					}
				})
			); 
			Y.newButton(ButtonConfig.create().label("Clear Selection").render(parent).
				on("click", new EventCallback<ButtonEvent>() {				
					@Override
					public void call(ButtonEvent e) {
						table1.dataModelList().invoke("set", "select", null);

				        // Uncheck the header checkbox
				        table1.getNode("contentBox")
				            .one(".protocol-select-all").set("checked", false);

						process(); 
					}
				})
			); 
			Y.newButton(ButtonConfig.create().label("Select All").render(parent).
				on("click", new EventCallback<ButtonEvent>() {				
					@Override
					public void call(ButtonEvent e) {
						boolean checked = e.targetNode().getBoolean("checked");
						
						if(checked)
							System.out.println("checked: "+checked);
						// Set the selected attribute in all records in the ModelList silently
				        // to avoid each update triggering a table update
				        table1.dataModelList().invoke("set", "select", checked, JsObject.one("silent", true));//{ silent: true });
				        			        

						// Update the table now that all records have been updated
						table1.syncUI();
					}
				})
			);			
			
			processOutput = parent.appendChild("<ul></ul>"); 
			
			//TODO: needed because a scrolled datatable will be in front of a Y.Panel
			table1.contentBox().setStyles(Style.create().zIndex("0")); 
		}
	});

}

@SuppressWarnings("unchecked")
protected void process() {
	ModelList ml = table1.dataModelList();
	final String template = "<li>Record index = {index} Data = {port} : {pname}</li>";
	final StringBuffer sb = new StringBuffer(); 
	ml.each(new ArrayListCallback<JavaScriptObject>() {
		@Override
		public boolean call(JavaScriptObject item_, int index) {
			Attribute item = item_.cast();  
			JsObject data = item.getAttrs(new String[]{"select", "port", "pname"});
			String s = ""; 
			if(data.objGetBoolean("select")) {
				
				data.objPut("index", index);
				sb.append(Y.Lang().sub(template, data)); 
			}
			return false;
		}
	}); 
	processOutput.setHTML(sb.toString()); 
}

@SuppressWarnings("unchecked")
protected void deleteSelected() {
	ModelList ml = table1.dataModelList();
	ml.each(new ArrayListCallback<JavaScriptObject>() {
		@Override
		public boolean call(JavaScriptObject item_, int index) {//			
			Attribute item = item_.cast();  
			JsObject data = item.getAttrs(new String[]{"select", "port", "pname"});
			if(data.objGetBoolean("select")) {	
				table1.removeRow(index); 
			}
			return false;
		}
	}); 
}



public static native final JsArray<JavaScriptObject> getData()/*-{
	return [
    { port:20,  pname:'FTP_data',ptitle:'File Transfer Process Data' },
    { port:21,  pname:'FTP',     ptitle:'File Transfer Process' },
    { port:22,  pname:'SSH',     ptitle:'Secure Shell' },
    { port:23,  pname:'TELNET',  ptitle:'Telnet remote communications' },
    { port:25,  pname:'SMTP',    ptitle:'Simple Mail Transfer Protocol' },
    { port:43,  pname:'WHOIS',   ptitle:'whois Identification' },
    { port:53,  pname:'DNS',     ptitle:'Domain Name Service' },
    { port:68,  pname:'DHCP',    ptitle:'Dynamic Host Control Protocol' },
    { port:79,  pname:'FINGER',  ptitle:'Finger Identification' },
    { port:80,  pname:'HTTP',    ptitle:'HyperText Transfer Protocol' },
    { port:110, pname:'POP3',   ptitle:'Post Office Protocol v3' },
    { port:115, pname:'SFTP',   ptitle:'Secure File Transfer Protocol' },
    { port:119, pname:'NNTP',   ptitle:'Network New Transfer Protocol' },
    { port:123, pname:'NTP',    ptitle:'Network Time Protocol' },
    { port:139, pname:'NetBIOS',ptitle:'NetBIOS Communication' },
    { port:143, pname:'IMAP',   ptitle:'Internet Message Access Protocol' },
    { port:161, pname:'SNMP',   ptitle:'Simple Network Management Protocol' },
    { port:194, pname:'IRC',    ptitle:'Internet Relay Chat' },
    { port:220, pname:'IMAP3',  ptitle:'Internet Message Access Protocol v3' },
    { port:389, pname:'LDAP',   ptitle:'Lightweight Directory Access Protocol' },
    { port:443, pname:'SSL',    ptitle:'Secure Socket Layer' },
    { port:445, pname:'SMB',    ptitle:'NetBIOS over TCP' },
    { port:993, pname:'SIMAP',  ptitle:'Secure IMAP Mail' },
    { port:995, pname:'SPOP',   ptitle:'Secure POP Mail' }
]; 
}-*/;


}
