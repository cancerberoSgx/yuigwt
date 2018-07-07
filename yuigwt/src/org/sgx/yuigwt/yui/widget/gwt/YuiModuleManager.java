package org.sgx.yuigwt.yui.widget.gwt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.util.JsUtil;

/**
 * a pure java utility for dealing with a "global" YUI sandbox and not with many sandboxes one for each module set..
 * @author sg
 *
 */
public class YuiModuleManager {
private static YuiModuleManager instance;

private YuiModuleManager() {
	init();
}

public static YuiModuleManager getInstance() {
	if (instance == null)
		instance = new YuiModuleManager();
	return instance;
}

YuiContext Y;

Map<String, LoadStatus> status;

private void init() {
	status=new HashMap<String, LoadStatus>();
}

public void register(String []modules, YUICallback callback) {
	String key = printModules(modules); 
	if(status.get(key)==null) {
		LoadStatus ls = new LoadStatus();
		ls.setStatus(STATUS_ZERO);
		ls.setCallback(callback); 
		status.put(key, ls); 
		loadModules(modules, key); 
	}
	else if(status.get(key).getStatus().equals(STATUS_loaded)) {
		YUI.Use(new String[]{"*"}, callback); 
	}
	
}

private void loadModules(String[] modules, String key) {
	YUI.Use(modules, status.get(key).getCallback()); 
}

private String printModules(String[] modules) {
	Arrays.sort(modules); 
	return JsUtil.toJsArrayString(modules).join(",");
}

//public static interface ModuleReadyCallback {
//	void notifyModuleReady(YuiContext Y);
//}

public static final String 
		STATUS_ZERO="zero", 
		STATUS_LOADING="loading", 
		STATUS_loaded="loaded"; 



private static class LoadStatus {
	String status;
	YUICallback callback;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the callback
	 */
	public YUICallback getCallback() {
		return callback;
	}
	/**
	 * @param callback the callback to set
	 */
	public void setCallback(YUICallback callback) {
		this.callback = callback;
	}
	
}
}
