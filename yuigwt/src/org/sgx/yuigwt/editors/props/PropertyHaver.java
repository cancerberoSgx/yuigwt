package org.sgx.yuigwt.editors.props;

import org.sgx.yuigwt.yui.util.LWOMap;

/**
 * we solve the issue with java reflection forcing the user to describe its
 * beans implementing this interface.
 * 
 * the PH must know : * describe its properties names and types,
 * 
 * @author sg
 * 
 */
public interface PropertyHaver {

	LWOMap<String, PropertyInfo> getProperties();

	Object getProperty(String propertyName);

	void setProperty(String propertyName, Object val);
}
