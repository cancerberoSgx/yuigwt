package org.sgx.yuigwt.yui.intl;

import org.sgx.yuigwt.yui.event.EventTarget;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Intl utility provides a central location for managing sets of localized
 * resources (strings and formatting patterns). This represents the Y.Intl
 * object
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Intl.html
 * @author sg
 * 
 */
public class Intl extends EventTarget {
	protected Intl() {
	}

	public static final String EVENT_LANGCHANGE = "intl:langChange"; 
	
	/**
	 * Register a hash of localized resources for the given module and language
	 * 
	 * @param module
	 *            The module name.
	 * @param lang
	 *            The BCP 47 language tag.
	 * @param strings
	 *            The hash of localized values, keyed by the string name.
	 * @return self for method chaining
	 */
	public native final Intl add(String module, String lang,
			JavaScriptObject strings) /*-{
		this.add(module, lang, strings);
		return this;
	}-*/;

	/**
	 * Gets the module's localized resources for the currently active language
	 * (as provided by the getLang method). Optionally, the localized resources
	 * for alternate languages which have been added to Intl (see the add
	 * method) can be retrieved by providing the BCP 47 language tag as the lang
	 * parameter.
	 * 
	 * @param module
	 *            The module name.
	 * @param key
	 *            Optional. A single resource key. If not provided, returns a
	 *            copy (shallow clone) of all resources.
	 * @param lang
	 *            Optional. The BCP 47 language tag. If not provided, the
	 *            module's currently active language is used.
	 * @return String | Object A copy of the module's localized resources, or a
	 *         single value if key is provided.
	 */
	public native final String get(String module, String key, String lang) /*-{
		return this.get(module, key, lang);
	}-*/;
	/**
	 * Gets the module's localized resources for the currently active language
	 * (as provided by the getLang method). Optionally, the localized resources
	 * for alternate languages which have been added to Intl (see the add
	 * method) can be retrieved by providing the BCP 47 language tag as the lang
	 * parameter.
	 * 
	 * @param module
	 *            The module name.
	 * @param key
	 *            Optional. A single resource key. If not provided, returns a
	 *            copy (shallow clone) of all resources.
	 * @param lang
	 *            Optional. The BCP 47 language tag. If not provided, the
	 *            module's currently active language is used.
	 * @return String | Object A copy of the module's localized resources, or a
	 *         single value if key is provided.
	 */
	public native final String get(String module, String key) /*-{
		return this.get(module, key);
	}-*/;
	/**
	 * Gets the module's localized resources for the currently active language
	 * (as provided by the getLang method). Optionally, the localized resources
	 * for alternate languages which have been added to Intl (see the add
	 * method) can be retrieved by providing the BCP 47 language tag as the lang
	 * parameter.
	 * 
	 * @param module
	 *            The module name.
	 * @return String | Object A copy of the module's localized resources, or a
	 *         single value if key is provided.
	 */
	public native final JavaScriptObject get(String module) /*-{
		return this.get(module);
	}-*/;
	/**
	 * Gets the list of languages for which localized resources are available for a given module, based on the module meta-data (part of loader). If loader is not on the page, returns an empty array.
	 * @param module The name of the module
	 * @return The array of languages available. 
	 */
	public native final JsArrayString getAvailableLangs(String module) /*-{
		return this.getAvailableLangs(module);
	}-*/;
	/**
	 * Get the currently active language for the given module.
	 * @param module The module name.
	 * @return The BCP 47 language tag. 
	 */
	public native final String getLang(String module) /*-{
		return this.getLang(module);
	}-*/;
	/**
	 * Returns the language among those available that best matches the preferred language list, using the Lookup algorithm of BCP 47. If none of the available languages meets the user's preferences, then "" is returned. Extended language ranges are not supported.
	 * @param preferredLanguages The list of preferred languages in descending preference order, represented as BCP 47 language tags. A string array or a comma-separated list.
	 * @param availableLanguages The list of languages that the application supports, represented as BCP 47 language tags.
	 * @return  The available language that best matches the preferred language list, or "". 
	 */
	public native final String lookupBestLang(JsArrayString preferredLanguages, JsArrayString availableLanguages) /*-{
		return this.lookupBestLang(preferredLanguages, availableLanguages);
	}-*/;
	/**
	 * Returns the language among those available that best matches the preferred language list, using the Lookup algorithm of BCP 47. If none of the available languages meets the user's preferences, then "" is returned. Extended language ranges are not supported.
	 * @param preferredLanguages The list of preferred languages in descending preference order, represented as BCP 47 language tags. A string array or a comma-separated list.
	 * @param availableLanguages The list of languages that the application supports, represented as BCP 47 language tags.
	 * @return  The available language that best matches the preferred language list, or "". 
	 */
	public native final String lookupBestLang(String preferredLanguages, JsArrayString availableLanguages) /*-{
		return this.lookupBestLang(preferredLanguages, availableLanguages);
	}-*/;
	
	/**
	 * Returns the language among those available that best matches the preferred language list, using the Lookup algorithm of BCP 47. If none of the available languages meets the user's preferences, then "" is returned. Extended language ranges are not supported.
	 * @param preferredLanguages The list of preferred languages in descending preference order, represented as BCP 47 language tags. A string array or a comma-separated list.
	 * @param availableLanguages The list of languages that the application supports, represented as BCP 47 language tags.
	 * @return  The available language that best matches the preferred language list, or "". 
	 */
	public native final String lookupBestLang(String[] preferredLanguages, String[] availableLanguages) /*-{
		return this.lookupBestLang(
			@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(preferredLanguages), 
			@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(availableLanguages)
		);
	}-*/;
	/**
	 * Returns the language among those available that best matches the preferred language list, using the Lookup algorithm of BCP 47. If none of the available languages meets the user's preferences, then "" is returned. Extended language ranges are not supported.
	 * @param preferredLanguages The list of preferred languages in descending preference order, represented as BCP 47 language tags. A string array or a comma-separated list.
	 * @param availableLanguages The list of languages that the application supports, represented as BCP 47 language tags.
	 * @return  The available language that best matches the preferred language list, or "". 
	 */
	public native final String lookupBestLang(String preferredLanguages, String[] availableLanguages) /*-{
		return this.lookupBestLang(
			preferredLanguages, 
			@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(availableLanguages)
		);
	}-*/;
	/**
	 * Sets the active language for the given module.Returns false on failure, which would happen if the language had not been registered through the add() method.
	 * @param module
	 * @param lang
	 * @return true if successful, false if not. 
	 */
	public native final boolean setLang(String module, String lang) /*-{
		return this.setLang(module, lang);
	}-*/;
}
