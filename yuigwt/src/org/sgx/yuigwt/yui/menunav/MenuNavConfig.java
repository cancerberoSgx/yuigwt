package org.sgx.yuigwt.yui.menunav;

import org.sgx.yuigwt.yui.yui.PluginBaseConfig;

/**
 * @see http://yuilibrary.com/yui/docs/api/classes/plugin.NodeMenuNav.html
 * @author sg
 * 
 */
public class MenuNavConfig extends PluginBaseConfig {
	protected MenuNavConfig() {
	}

	public static native final MenuNavConfig create()/*-{
		return {};
	}-*/;

	/**
	 * 
	 Boolean indicating if submenus are automatically made visible when the
	 * user mouses over the menu's items.
	 * 
	 * Default: true
	 * 
	 * @return
	 */
	public native final boolean autoSubmenuDisplay() /*-{
		return this.autoSubmenuDisplay;
	}-*/;

	/**
	 * 
	 Boolean indicating if submenus are automatically made visible when the
	 * user mouses over the menu's items.
	 * 
	 * Default: true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MenuNavConfig autoSubmenuDisplay(boolean val) /*-{
		this.autoSubmenuDisplay = val;
		return this;
	}-*/;

	/**
	 * 
	 Number indicating the time (in milliseconds) that should expire before a
	 * submenu is hidden when the user mouses out of it.
	 * 
	 * Default: 750
	 * 
	 * @return
	 */
	public native final int mouseOutHideDelay() /*-{
		return this.mouseOutHideDelay;
	}-*/;

	/**
	 * 
	 Number indicating the time (in milliseconds) that should expire before a
	 * submenu is hidden when the user mouses out of it.
	 * 
	 * Default: 750
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MenuNavConfig mouseOutHideDelay(int val) /*-{
		this.mouseOutHideDelay = val;
		return this;
	}-*/;

	/**
	 * 
	 Number indicating the time (in milliseconds) that should expire before a
	 * submenu is hidden when the user mouses out of a menu label heading in the
	 * direction of a submenu.
	 * 
	 * Default: 250
	 * 
	 * @return
	 */
	public native final int submenuHideDelay() /*-{
		return this.submenuHideDelay;
	}-*/;

	/**
	 * 
	 Number indicating the time (in milliseconds) that should expire before a
	 * submenu is hidden when the user mouses out of a menu label heading in the
	 * direction of a submenu.
	 * 
	 * Default: 250
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MenuNavConfig submenuHideDelay(int val) /*-{
		this.submenuHideDelay = val;
		return this;
	}-*/;

	/**
	 * 
	 Number indicating the time (in milliseconds) that should expire before a
	 * submenu is made visible when the user mouses over the menu's label.
	 * 
	 * Default: 250
	 * 
	 * @return
	 */
	public native final int submenuShowDelay() /*-{
		return this.submenuShowDelay;
	}-*/;

	/**
	 * 
	 Number indicating the time (in milliseconds) that should expire before a
	 * submenu is made visible when the user mouses over the menu's label.
	 * 
	 * Default: 250
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MenuNavConfig submenuShowDelay(int val) /*-{
		this.submenuShowDelay = val;
		return this;
	}-*/;

	/**
	 * 
	 Boolean indicating if use of the WAI-ARIA Roles and States should be
	 * enabled for the menu.
	 * 
	 * Default: true
	 * 
	 * @return
	 */
	public native final boolean useARIA() /*-{
		return this.useARIA;
	}-*/;

	/**
	 * 
	 Boolean indicating if use of the WAI-ARIA Roles and States should be
	 * enabled for the menu.
	 * 
	 * Default: true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final MenuNavConfig useARIA(boolean val) /*-{
		this.useARIA = val;
		return this;
	}-*/;

}
