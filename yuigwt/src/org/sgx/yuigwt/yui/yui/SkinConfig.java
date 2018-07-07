package org.sgx.yuigwt.yui.yui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 

The skin config let's you configure application level skin customizations. It contains the following attributes which can be specified to override the defaults:
<pre>
 // The default skin, which is automatically applied if not
 // overriden by a component-specific skin definition.
 // Change this in to apply a different skin globally
 defaultSkin: 'sam',

 // This is combined with the loader base property to get
 // the default root directory for a skin.
 base: 'assets/skins/',

 // Any component-specific overrides can be specified here,
 // making it possible to load different skins for different
 // components.  It is possible to load more than one skin
 // for a given component as well.
 overrides: {
     slider: ['capsule', 'round']
 }
</pre>
For dynamic loading.

 * @author sg
 *
 */
public class SkinConfig extends JavaScriptObject {
	protected SkinConfig(){}
	public static native final SkinConfig create()/*-{
		return {}; 
	}-*/;

/**
 * The default skin, which is automatically applied if not overriden by a component-specific skin definition.  Change this in to apply a different skin globally
 * @return
 */
public native final String defaultSkin() /*-{
return this.defaultSkin; 
}-*/;

/**
 * The default skin, which is automatically applied if not overriden by a component-specific skin definition.  Change this in to apply a different skin globally
 * @param val
 * @return this - for setter chaining
 */
public native final SkinConfig defaultSkin(String val) /*-{
this.defaultSkin = val; 
return this; 
}-*/;

/**
 * This is combined with the loader base property to get the default root directory for a skin.
 * @return
 */
public native final String base() /*-{
return this.base; 
}-*/;

/**
 * This is combined with the loader base property to get the default root directory for a skin.
 * @param val
 * @return this - for setter chaining
 */
public native final SkinConfig base(String val) /*-{
this.base = val; 
return this; 
}-*/;

/**
 * Any component-specific overrides can be specified here, making it possible to load different skins for different
 * components.  It is possible to load more than one skin for a given component as well.
 * @return
 */
public native final JavaScriptObject overrides() /*-{
return this.overrides; 
}-*/;

/**
 * Any component-specific overrides can be specified here, making it possible to load different skins for different
 * components.  It is possible to load more than one skin for a given component as well.
 * @param val
 * @return this - for setter chaining
 */
public native final SkinConfig overrides(JavaScriptObject val) /*-{
this.overrides = val; 
return this; 
}-*/;

}
