package org.sgx.yuigwt.editors.props;

import java.util.List;

import org.sgx.yuigwt.yui.util.LWOMap;
/**
 * 
 * @author sg
 *
 */
public class PropertyHaverUtil {
	public static String dump(PropertyHaver ph) {
		String s = "PropertyHaver(";
		LWOMap<String, PropertyInfo> props = ph.getProperties();
		for (String name : props.keys()) {
			s += name + "(" + props.get(name).getType() + "): " + ph.getProperty(name) + ", ";
		}
		return s + ")";
	}

	public static List<String> getPropertyNames(PropertyHaver ph) {
		return ph.getProperties().keys();
	}

	public static LWOMap<String, PropertyInfo> buildPropMap(PropertyInfo[] propertyInfos) {
		LWOMap<String, PropertyInfo> m = new LWOMap<String, PropertyInfo>();
		for (int i = 0; i < propertyInfos.length; i++) {
			m.put(propertyInfos[i].getName(), propertyInfos[i]);
		}
		return m;
	}
}
