package org.sgx.yuigwt.yui;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.ScriptInjector;

/**
 * a pure Java class that helps loading yui javascript from url and modules initially. 
 * This is for preventing obsolete &lt;script&gt; tag in gwt.xml and for avoiding the user not to worry to add <script tag in its html pages.  
 * @author sg
 *
 */
public class YuiLoader {
protected static boolean yuiJsLoaded=false;

public static void load(final String yuiJsUrl, final String [] modules, final YUICallback callback) {
	if(yuiJsLoaded) {
		YUI.YUI().use(modules, callback); 
	}
	else {
		ScriptInjector.fromUrl(yuiJsUrl).setCallback(new Callback<Void, Exception>() {			
			
			public void onSuccess(Void result) {
				yuiJsLoaded=true;
				YUI.YUI().use(modules, callback); 
			}			
			
			public void onFailure(Exception reason) {
	//			Window.alert("Error YUI javascript's couldn't be loaded from  +"+yuiJsUrl);
			}
		}).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}
}

private static String DEFAULT_YUI_JS_URL="http://yui.yahooapis.com/3.8.1/build/yui/yui-min.js";
public static void load(final String [] modules, final YUICallback callback) {
	load(DEFAULT_YUI_JS_URL, modules, callback); 
}
}
