package org.sgx.madrenecesidad.client.trash.place;

import org.sgx.madrenecesidad.client.trash.ui_old.Ui;
import org.sgx.yuigwt.yui.history.History;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * correspond to YUI Place - Url - history state
 * @author sg
 *
 */
public interface State {
void start();  
void stop();
//Ui getUi();
String getName(); 
JavaScriptObject getData(); 
//void loadHistory(History h);
}
