package org.sgx.yuigwt.ui;

import java.util.Arrays;
import java.util.Comparator;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.base.BaseConfig;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeList;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.LWMap;
import org.sgx.yuigwt.yui.widget.WidgetConfig;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.calendar.CalendarConfig;
import org.sgx.yuigwt.yui.widget.datatable.DataTableConfig;
import org.sgx.yuigwt.yui.widget.panel.PanelConfig;
import org.sgx.yuigwt.yui.widget.tabview.TabViewConfig;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.gwt.user.client.ui.Widget;

/**
 * using YUI in GWT UIBinder. We introduce YUI markup not extending GWT widgets,
 * but using plain HTML.
 * 
 * @author sg
 * 
 */
public class YUIBinder1 implements YUIBinder {

	static final String
	// CLASS_TABVIEW = "yui-tabview",
	// CLASS_BUTTON = "yui-button",
	// CLASS_AUTOCOMPLETE = "yui-autocomplete",
			YUIWIDGET = "yuiWidget",
			DATA = "yui", __u = "";

	LWMap<String, org.sgx.yuigwt.yui.widget.Widget> widgets = null;

	private YUIBinderListener listener;

	public YUIBinder1() {
		widgets = LWMap.create();
	}

	/* (non-Javadoc)
	 * @see org.sgx.yuigwt.ui.YUIBinder#bindYUI(org.sgx.yuigwt.yui.YuiContext, com.google.gwt.user.client.ui.Widget, com.google.gwt.dom.client.Element[], org.sgx.yuigwt.ui.YUIBinderListener)
	 */
	
	public void bindYUI(final YuiContext y, final Widget w, final Element[] els, YUIBinderListener listener) {
		this.listener = listener;
		
		String cc = w.getClass().getName(); 
//		System.out.println(cc+" - "+w.isAttached());
		
		if (w.isAttached())
			bindYUI(y, els);
		else {
			w.addAttachHandler(new Handler() {
				
				public void onAttachOrDetach(AttachEvent event) {
//					System.out.println("bindYUI addAttachHandler "+w.getClass()+" "+event.isAttached());
					if (event.isAttached())
						bindYUI(y, els);
					else {
						// TODO: destroy widgets
					}
				}
			});
		}
	}

	private void bindYUI(final YuiContext y, Element[] els) {

		// generate ids
		for (int i = 0; i < els.length; i++)
			y.one(els[i]).generateID();

		// sort the list for getting the correct yui widget rendering order
		Arrays.sort(els, new Comparator<Element>() {
			
			public int compare(Element o1, Element o2) {
				int ret = -1;
				if (o1.getId() != null && o2.getId() != null && o1.getId().equals(o2.getId()))
					ret = 0;
				if (ret == -1) {
					boolean contains = y.one(o1).contains(y.one(o2));
					ret = contains ? -1 : 1;
				}
				return ret;
			}
		});

		for (int i = 0; i < els.length; i++) {
			Element el = els[i];
			Node n = y.one("#" + el.getId());
			bindYUI(y, n);
		}

		if (listener != null)
			listener.yuiBinded();
	}

	private void bindYUI(final YuiContext y, final Node n) {
		if (y == null || n == null || !n.inDoc())
			return; // TODO: something went wrong with the ordering

		org.sgx.yuigwt.yui.widget.Widget w = null;

		JsObject nodeConfig = getNodeConfig(n);
		if (nodeConfig == null)
			return;

		String yuiWidget = nodeConfig.objGetString(YUIWIDGET);

		if (yuiWidget == null)
			return;

		// System.out.println(yuiWidget+" - "+yuiWidget.equals("TabView"));
		// if(yuiWidget!=null)

		yuiWidget = yuiWidget.toLowerCase();
		// System.out.println(yuiWidget);

		// if (n.hasClass(CLASS_TABVIEW)) {
		if (yuiWidget != null && yuiWidget.equals("tabview")) {
			WidgetConfig config = TabViewConfig.create().srcNode(n);
			config = y.merge(config, nodeConfig).cast();
			w = y.newTabView(config).render();
		}

		// else if (n.hasClass(CLASS_BUTTON)) {
		else if (yuiWidget != null && yuiWidget.equals("button")) {
			Element e = n.getDOMNode(); 
			NodeList prevChildren = n.children(); 
			
			String prevId = n.get("id");
			String prevClass = e.getClassName();
			
			WidgetConfig config = ButtonConfig.create().srcNode(n);
			config = y.merge(config, nodeConfig).cast();
			w = y.newButton(config).render();
			e = w.contentBox().getDOMNode(); 
			
			//fix - re set previous id and class attributes - http://jsfiddle.net/cancerbero_sgx/MPc4g/3/
			e.setClassName(e.getClassName()+" "+prevClass); 
			y.one(e).prepend(prevChildren); 
			n.set("id", prevId); 
		}
		
		else if (yuiWidget != null && yuiWidget.equals("togglebutton")) {
			Element e = n.getDOMNode(); 
			NodeList prevChildren = n.children(); 
			
			String prevId = n.get("id");
			String prevClass = e.getClassName();
			
			WidgetConfig config = ButtonConfig.create().srcNode(n);
			config = y.merge(config, nodeConfig).cast();
			w = y.newToggleButton(config).render();
			
			e = w.contentBox().getDOMNode(); 
			
			//fix - re set previous id and class attributes - http://jsfiddle.net/cancerbero_sgx/MPc4g/3/
			e.setClassName(e.getClassName()+" "+prevClass); 
			y.one(e).prepend(prevChildren); 
			n.set("id", prevId); 
		}
		

		// else if (n.hasClass(CLASS_AUTOCOMPLETE)) {
		else if (yuiWidget != null && yuiWidget.equals("autocomplete")) {
			/* TODO: check if it is an input el */
			AutoCompleteConfig config = AutoCompleteConfig.create().inputNode(n);
			config = y.merge(config, nodeConfig).cast();
			w = y.newAutoComplete(config).render();
//			System.out.println("render autocomplete");
			// n.get("data");
		}

		else if (yuiWidget != null && yuiWidget.equals("menunav")) {
			// MenuNavConfig config = MenuNavConfig.create().inputNode(n);
			// config = y.merge(config, nodeConfig).cast();
			n.plug(y.Plugin().NodeMenuNav(), (BaseConfig) nodeConfig);
			// w = y.ne.newAutoComplete(config).render();
			// n.get("data");
		}

		else if (yuiWidget != null && yuiWidget.equals("calendar")) {
			CalendarConfig config = CalendarConfig.create().contentBox(n).cast();
			config = y.merge(config, nodeConfig).cast();
			w = y.newCalendar(config).render();
		}

		else if (yuiWidget != null && yuiWidget.equals("panel")) {
			PanelConfig config = PanelConfig.create().srcNode(n).cast();
			config = y.merge(config, nodeConfig).cast();
			w = y.newPanel(config).render();
//			System.out.println("render panel");
//			System.out.println("panel config: " + JsUtil.dumpObj(config) + " - " + JsUtil.dumpObj(nodeConfig));
		}

		else if (yuiWidget != null && yuiWidget.equals("datatable")) {
			// System.out.println("doing datatable");

			DataTableConfig config = DataTableConfig.create().srcNode(n).cast();
			config = y.merge(config, nodeConfig).cast();
			w = y.newDataTable(config); // .render(n);
		}

		if (w != null) {
			registerWidget(n.get("id"), w);
		}

	}

	private JsObject getNodeConfig(Node n) {
		String data = n.getData(DATA);
		if (data != null) {
			data = data.replace("(((", "{").replace(")))", "}");
			JavaScriptObject configObj = JsonUtils.unsafeEval("{" + data + "}");
			return configObj.cast();
		} else {
			// TODO: check for individual data-yuiconfig-label="buttonlabel"
			JsObject config = JsObject.createObject().cast();
			// JsObject dataObj = n.getData();
			// JsArrayString props = dataObj.objProps();
			// for (int i = 0; i < props.length(); i++) {
			// String prop = props.get(i);
			//
			// if(prop.startsWith(DATA)) {
			// String attrName = prop.substring(DATA.length(), prop.length());
			// String val = dataObj.objGetString(prop);
			// System.out.println(prop+" - "+attrName+" - "+val);
			// config.objPut(attrName, val);
			// }
			// }
			return config;
		}
	}

	/* (non-Javadoc)
	 * @see org.sgx.yuigwt.ui.YUIBinder#registerWidget(java.lang.String, org.sgx.yuigwt.yui.widget.Widget)
	 */
	
	public void registerWidget(String elId, org.sgx.yuigwt.yui.widget.Widget w) {
		widgets.put(elId, w);
	}

	/* (non-Javadoc)
	 * @see org.sgx.yuigwt.ui.YUIBinder#getWidget(com.google.gwt.dom.client.Element)
	 */
	
	public org.sgx.yuigwt.yui.widget.Widget getWidget(Element e) {
		String id = e.getId();
		return widgets.get(id);
	}

	/* (non-Javadoc)
	 * @see org.sgx.yuigwt.ui.YUIBinder#getWidget(org.sgx.yuigwt.yui.node.Node)
	 */
	
	public org.sgx.yuigwt.yui.widget.Widget getWidget(Node n) {
		return widgets.get(n.get("id"));
	}
}
