//package org.sgx.yuigwt.ui.test.deadend_trash;
//
//import java.util.Collection;
//
//import org.sgx.yuigwt.yui.YuiContext;
//import org.sgx.yuigwt.yui.gwt.GWTUtil;
//import org.sgx.yuigwt.yui.node.Node;
//import org.sgx.yuigwt.yui.util.YUIUtil;
//import org.sgx.yuigwt.yui.widget.Widget;
//import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
//
//import com.google.gwt.core.client.JavaScriptObject;
//import com.google.gwt.user.client.ui.HTML;
//import com.google.gwt.user.client.ui.HTMLPanel;
///**
// * UI Attributes: 
// * <ul>
// * <li><b>source</b>&nbsp; accepts a comma separated strings as the source.  </li>
// * <li><b></b>&nbsp; maxResults - int</li>
// * <li><b></b>&nbsp; value - String</li>
// * <li><b></b>&nbsp; </li>
// * </ul>
// * @author sg
// *
// */
//public class AutoComplete extends UIWidget {
//	public AutoComplete() {
//		AutoCompleteConfig acConfig = AutoCompleteConfig.create();
//		initUIWidget(acConfig); 
////		super( AutoCompleteConfig.create().in);
//	}
////	
////	protected Widget newYuiWidget(YuiContext y, JavaScriptObject config) {
////		System.out.println(((AutoCompleteConfig)config).inputNode());
////		return y.newAutoComplete(config);
////	}
//	
//	protected void initUIWidget(JavaScriptObject config)	{
//		AutoCompleteConfig acConfig = (AutoCompleteConfig)config; 
//		HTML html1 = new HTML("<div></div>"); 
//		Node html1Node = Y().one(html1.getElement());
//		
//		acConfig.inputNode(html1Node.appendChild("<input type='text'></input>"));
//		
//		yuiWidget = Y().newAutoComplete(config);//newYuiWidget(Y(), config);
//		
//		initWidget(html1);
//		
//		setStyleName(getYuiStyleName());
//
//		yuiWidget.render( YUIUtil.getNode(Y(), html1) ); 
//	}
//	
//	/**
//	 * accepts a comma separated strings as the source. 
//	 * @param src
//	 */
//	public void setSource(String src) {
//		String[] a = src.split(",");
//		for (int i = 0; i < a.length; i++) {
//			a[i]=a[i].trim(); 
//		}
//		_getAC().source(a);		
//	}
//	
//	private org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete _getAC() {
//		return (org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete)getYuiWidget();
//	}
//	public void setSource(String[] src) {
//		_getAC().source(src); 
//	}
//	public void setSource(Collection<String> src) {
//		_getAC().source(src); 
//	}
//	
//public void setMaxResults(int val) {
//	getYuiWidget().set("maxResults", val);
//}	
//public int getMaxResults() {
//	return getYuiWidget().getInt("maxResults");
//}	
//
//public void setValue(String val) {
//	getYuiWidget().set("value", val);
//}
//
//public String getValue() {
//	return getYuiWidget().getString("value");
//}
//
//public void setQuery(String val) {
//	getYuiWidget().set("query", val);
//}
//
//public String getQuery() {
//	return getYuiWidget().getString("query");
//}
//public void setQueryDelimiter(String val) {
//	getYuiWidget().set("queryDelimiter", val);
//}
//
//public String getQueryDelimiter() {
//	return getYuiWidget().getString("queryDelimiter");
//}
//
//public void setMinQueryLength(int val) {
//	getYuiWidget().set("minQueryLength", val);
//}
//
//public int getMinQueryLength() {
//	return getYuiWidget().getInt("minQueryLength");
//}
//
//public void setEnableCache(boolean val) {
//	getYuiWidget().set("enableCache", val);
//}
//
//public boolean getEnableCache() {
//	return getYuiWidget().getBoolean("enableCache");
//}
//
//
//
//
//
////	org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete _ac = _getAC(); 
//	
//}
