package org.sgx.yuigwt.yui.datasource;

import org.sgx.yuigwt.yui.base.Base;

/**
 * contains the api of A>ll Datasources implementations. 
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/DataSource.Local.html
 * @author sg
 *
 */
public class DataSource extends Base {
protected DataSource(){}
/**
 * Request is made.
 * @see http://yuilibrary.com/yui/docs/datasource/#events
 */
public static final String EVENT_REQUEST = "request"; 

/**
 * Raw data is received from the source.
 * @see http://yuilibrary.com/yui/docs/datasource/#events
 */
public static final String EVENT_DATA = "data"; 

/**
 * Response is returned to a callback function.
 * @see http://yuilibrary.com/yui/docs/datasource/#events
 */
public static final String EVENT_RESPONSE = "response";

/**
 * After response event, before the configured failure callback is executed
 * @see http://yuilibrary.com/yui/docs/datasource/#events
 */
public static final String EVENT_ERROR = "error";




/**
 * Generates a unique transaction ID and fires request event. Note: the property callback is a deprecated alias for the on transaction configuration property described below.
 * @param req
 * @return
 */
public native final double sendRequest(DataSourceRequest req)/*-{
	return this.sendRequest(req); 
}-*/;

}
