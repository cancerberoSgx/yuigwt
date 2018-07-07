package org.sgx.yuigwt.yui.yql.api.showtables;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * can be used to cast aQuery.result() return value for working with this specific query java api...
 * in  this case the build() method will return a JsArray<TableShow> object 
 * @author sg
 *
 */
public class ShowTablesResult extends JsObject /*implements YQLQueryResult */{
protected ShowTablesResult(){}
	
//	@Override
	/**
	 * Pleas, always use this method to normalize the data before using this Java API
	 * @param Y
	 * @param o
	 * @return
	 */
	public native final static ShowTablesResult normalize(YuiContext Y, JavaScriptObject o)/*-{
		if(!o || !o["table"])
			return null; 
		var ta = o["table"]; 
		for(var i = 0; i<ta.length; i++) {
			var t = ta[i]; 
			if(Y.Lang.isString(t)) {
				ta[i] = {"content": t}; 
			}
		}
		return o; 
	}-*/;

/**
 * 
 * @return self for method chaining
 */
public native final JsArray<TableShow> table() /*-{
	return this.table; 
}-*/;
	
//	private void sdf(YuiContext Y) {
//		Y.Lang().isString(o)
//	}
//	{
//		JsArrayMixed tablesNativeArr = ((JsObject)o).objGetObj("table").cast(); 
//		for (int i = 0; i < array.length; i++) {
//			
//		}
//		// TODO Auto-generated method stub
//		return null;
//	}
}
