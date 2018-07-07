package org.sgx.yuigwt.yui.datasource;

import org.sgx.yuigwt.yui.base.BaseClass;
import org.sgx.yuigwt.yui.event.EventFacade;

/**
 * static properties of all DataSource.* classes
 * @author sebastian
 *
 */
public class DataSourceClass extends BaseClass {
protected DataSourceClass(){}
/**
 * Returns data to callback.
 * @param e
 * @param caller Calling DataSource instance.
 */
public native final void issueCallback(EventFacade e, DataSource caller)/*-{
	this.issueCallback(e, caller); 
}-*/;

}
