package org.sgx.yuigwt.yui.datasource;

/**
 * <p>
 * requires module datasource-polling
 * </p>
 * <p>
 * Usage:
 * </p>
 * 
 * <pre>
 * Pollable ds1 = Y.newDataSourceIO(...).cast();
 * ds1.setInterval(...)
 * </pre>
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Pollable.html
 * @author sg
 * 
 */
public class Pollable extends DataSource {
protected Pollable() {
}
	
/**
 * Sets up a polling mechanism to send requests at set intervals and forward responses to given callback.
 * @param mseec Length of interval in milliseconds.
 * @return  Interval ID. 
 */
public native final double setInterval(int msec, DataSourceRequest request) /*-{
return this.setInterval(msec, request); 
}-*/;
/**
 * Disables polling mechanism associated with the given interval ID.
 * @param id
 * @return self for method chaining
 */
public native final Pollable clearInterval(double id) /*-{
this.clearInterval(id); 
return this; 
}-*/;

/**
 * Clears all intervals.
 * @param id
 * @return self for method chaining
 */
public native final Pollable clearAllIntervals() /*-{
this.clearAllIntervals(); 
return this; 
}-*/;

}
