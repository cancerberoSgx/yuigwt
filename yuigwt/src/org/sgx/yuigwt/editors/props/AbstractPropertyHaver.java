package org.sgx.yuigwt.editors.props;

import org.sgx.yuigwt.yui.util.LWOMap;
/**
 * 
 * @author sg
 *
 */
public abstract class AbstractPropertyHaver implements PropertyHaver {

	LWOMap<String, PropertyInfo> props = null;
	LWOMap<String, Object> values = null;

	public AbstractPropertyHaver() {
		props = new LWOMap<String, PropertyInfo>();
		values = new LWOMap<String, Object>();
	}

	
	public LWOMap<String, PropertyInfo> getProperties() {
		return props;
	}

	
	public Object getProperty(String propertyName) {
		return values.get(propertyName);
	}

	
	public void setProperty(String propertyName, Object val) {
		values.put(propertyName, val);
	}

}
