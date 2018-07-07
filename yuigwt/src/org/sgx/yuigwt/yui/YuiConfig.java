package org.sgx.yuigwt.yui;

import org.sgx.yuigwt.yui.yui.SkinConfig;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Document;

/**
 * overlay of main YUI object configuration -
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/config.html
 * 
 * 
 * @author sg
 * 
 */
public class YuiConfig extends JavaScriptObject {

	// public static class DelayUntil extends JavaScriptObject {
	// protected DelayUntil(){};
	// public static final native YuiConfig create()/*-{
	// return {};
	// }-*/;
	// /**
	// * the event name for example "available"
	// * @return
	// */
	// public native final String event() /*-{
	// return this.event;
	// }-*/;
	//
	// /**
	// * the event name, for example "available"
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final YuiConfig.DelayUntil event(String val) /*-{
	// this.event = val;
	// return this;
	// }-*/;
	//
	// /**
	// * arguments
	// * @return
	// */
	// public native final String args() /*-{
	// return this.args;
	// }-*/;
	//
	// /**
	// * arguments
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final YuiConfig.DelayUntil args(String val) /*-{
	// this.args = val;
	// return this;
	// }-*/;
	//
	// }

	protected YuiConfig() {
	}

	public static final native YuiConfig create()/*-{
		return {};
	}-*/;

	/**
	 * Aliases are dynamic groups of modules that can be used as shortcuts.
	 * 
	 * <pre>
	 *  YUI({
	 *      aliases: {
	 *          davglass: [ 'node', 'yql', 'dd' ],
	 *          mine: [ 'davglass', 'autocomplete']
	 *      }
	 *  }).use('mine', function(Y) {
	 *      //Node, YQL, DD &amp; AutoComplete available here..
	 *  });
	 * </pre>
	 * 
	 * @return
	 */
	public native final JavaScriptObject aliases() /*-{
		return this.aliases;
	}-*/;

	/**
	 * Aliases are dynamic groups of modules that can be used as shortcuts.
	 * 
	 * <pre>
	 *  YUI({
	 *      aliases: {
	 *          davglass: [ 'node', 'yql', 'dd' ],
	 *          mine: [ 'davglass', 'autocomplete']
	 *      }
	 *  }).use('mine', function(Y) {
	 *      //Node, YQL, DD &amp; AutoComplete available here..
	 *  });
	 * </pre>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig aliases(JavaScriptObject val) /*-{
		this.aliases = val;
		return this;
	}-*/;

	/**
	 * Base directory for dynamic loading
	 * 
	 * @return
	 */
	public native final String base() /*-{
		return this.base;
	}-*/;

	/**
	 * Base directory for dynamic loading
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig base(String val) /*-{
		this.base = val;
		return this;
	}-*/;

	/**
	 * Allows the YUI seed file to fetch the loader component and library
	 * metadata to dynamically load additional dependencies. Default: true
	 * 
	 * @return
	 */
	public native final boolean bootstrap() /*-{
		return this.bootstrap;
	}-*/;

	/**
	 * Allows the YUI seed file to fetch the loader component and library
	 * metadata to dynamically load additional dependencies. Default: true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig bootstrap(boolean val) /*-{
		this.bootstrap = val;
		return this;
	}-*/;

	/**
	 * Use the YUI combo service to reduce the number of http connections
	 * required to load your dependencies. Turning this off will disable combo
	 * handling for YUI and all module groups configured with a combo service.
	 * For dynamic loading. Default: true if 'base' is not supplied, false if it
	 * is.
	 * 
	 * @return
	 */
	public native final boolean combine() /*-{
		return this.combine;
	}-*/;

	/**
	 * Use the YUI combo service to reduce the number of http connections
	 * required to load your dependencies. Turning this off will disable combo
	 * handling for YUI and all module groups configured with a combo service.
	 * For dynamic loading. Default: true if 'base' is not supplied, false if it
	 * is.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig combine(boolean val) /*-{
		this.combine = val;
		return this;
	}-*/;

	/**
	 * The YUI combo service base dir. Ex: http://yui.yahooapis.com/combo? For
	 * dynamic loading.
	 * 
	 * @return
	 */
	public native final String comboBase() /*-{
		return this.comboBase;
	}-*/;

	/**
	 * The YUI combo service base dir. Ex: http://yui.yahooapis.com/combo? For
	 * dynamic loading.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig comboBase(String val) /*-{
		this.comboBase = val;
		return this;
	}-*/;

	/**
	 * A list of modules that defines the YUI core (overrides the default list).
	 * Default: [ get,features,intl-base,yui-log,yui-later,loader-base,
	 * loader-rollup, loader-yui3 ]
	 * 
	 * @return
	 */
	public native final JsArrayString core() /*-{
		return this.core;
	}-*/;

	/**
	 * A list of modules that defines the YUI core (overrides the default list).
	 * Default: [ get,features,intl-base,yui-log,yui-later,loader-base,
	 * loader-rollup, loader-yui3 ]
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig core(JsArrayString val) /*-{
		this.core = val;
		return this;
	}-*/;

	/**
	 * A list of modules that defines the YUI core (overrides the default list).
	 * Default: [ get,features,intl-base,yui-log,yui-later,loader-base,
	 * loader-rollup, loader-yui3 ]
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig core(String[] val) /*-{
		this.core = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(val);
		return this;
	}-*/;

	/**
	 * Object literal containing attributes to add to dynamically loaded link
	 * nodes.
	 * 
	 * @return
	 */
	public native final String cssAttributes() /*-{
		return this.cssAttributes;
	}-*/;

	/**
	 * Object literal containing attributes to add to dynamically loaded link
	 * nodes.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig cssAttributes(String val) /*-{
		this.cssAttributes = val;
		return this;
	}-*/;

	/**
	 * Turns on writing Ylog messages to the browser console.
	 * 
	 * @return
	 */
	public native final boolean debug() /*-{
		return this.debug;
	}-*/;

	/**
	 * Turns on writing Ylog messages to the browser console.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig debug(boolean val) /*-{
		this.debug = val;
		return this;
	}-*/;

	// /**
	// *
	// * @return
	// */
	// public native final DelayUntil delayUntil() /*-{
	// return this.delayUntil;
	// }-*/;

	/**
	 * Delay the use callback until a specific event has passed (load, domready,
	 * contentready or available)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig delayUntil(String event, String args) /*-{
		this.delayUntil = {
			"event" : event,
			"args" : args
		};
		return this;
	}-*/;

	/**
	 * Delay the use callback until a specific event has passed (load, domready,
	 * contentready or available)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig delayUntil(String event) /*-{
		this.delayUntil = val;
		return this;
	}-*/;

	/**
	 * The document associated with the 'win' configuration.Default: the
	 * document hosting YUI
	 * 
	 * @return
	 */
	public native final Document doc() /*-{
		return this.doc;
	}-*/;

	/**
	 * The document associated with the 'win' configuration.Default: the
	 * document hosting YUI
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig doc(Document val) /*-{
		this.doc = val;
		return this;
	}-*/;

	public static interface ErrorCallback {
		boolean call(String errMsg, JavaScriptObject err);
	}

	/**
	 * A callback to execute when Y.error is called. It receives the error
	 * message and an javascript error object if Y.error was executed because a
	 * javascript error was caught. The function is executed in the YUI instance
	 * context. Returning true from this function will stop the Error from being
	 * thrown.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig errorFn(ErrorCallback c) /*-{
		this.errorFn = $entry(function(errMsg, err) {
			return c.@org.sgx.yuigwt.yui.YuiConfig.ErrorCallback::call(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(errMsg, err);
		});
		return this;
	}-*/;

	/**
	 * Specifies whether or not YUI().use(...) will attempt to load CSS
	 * resources at all. Any truthy value will cause CSS dependencies to load
	 * when fetching script. The special value 'force' will cause CSS
	 * dependencies to be loaded even if no script is needed. Default: true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig fetchCSS(String val) /*-{
		this.fetchCSS = val;
		return this;
	}-*/;

	/**
	 * Specifies whether or not YUI().use(...) will attempt to load CSS
	 * resources at all. Any truthy value will cause CSS dependencies to load
	 * when fetching script. The special value 'force' will cause CSS
	 * dependencies to be loaded even if no script is needed.. Default: true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig fetchCSS(boolean val) /*-{
		this.fetchCSS = val;
		return this;
	}-*/;

	/**
	 * A filter to apply to result urls. This filter will modify the default
	 * path for all modules. The default path for the YUI library is the
	 * minified version of the files (e.g., event-min.js). The filter property
	 * can be a predefined filter or a custom filter. The valid predefined
	 * filters are: <br/>
	 * DEBUG Selects the debug versions of the library (e.g., event-debug.js).
	 * This option will automatically include the Logger widget<br/>
	 * RAW Selects the non-minified version of the library (e.g., event.js).<br/>
	 * 
	 * You can also define a custom filter, which must be an object literal
	 * containing a search expression and a replace string:<br/>
	 * 
	 * <pre>
	 * 'searchExp': "-min\\.js",
	 *      'replaceStr': "-debug.js"
	 * </pre>
	 * 
	 * For dynamic loading.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig filter(String val) /*-{
		this.filter = val;
		return this;
	}-*/;

	/**
	 * A filter to apply to result urls. This filter will modify the default
	 * path for all modules. The default path for the YUI library is the
	 * minified version of the files (e.g., event-min.js). The filter property
	 * can be a predefined filter or a custom filter. The valid predefined
	 * filters are: <br/>
	 * DEBUG Selects the debug versions of the library (e.g., event-debug.js).
	 * This option will automatically include the Logger widget<br/>
	 * RAW Selects the non-minified version of the library (e.g., event.js).<br/>
	 * 
	 * You can also define a custom filter, which must be an object literal
	 * containing a search expression and a replace string:<br/>
	 * 
	 * <pre>
	 * 'searchExp': "-min\\.js",
	 *      'replaceStr': "-debug.js"
	 * </pre>
	 * 
	 * For dynamic loading.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig filter(String searchExp, String replaceStr) /*-{
		this.filter = {
			"searchExp" : searchExp,
			"replaceStr" : replaceStr
		};
		return this;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig filter(JavaScriptObject val) /*-{
		this.attributeName = val;
		return this;
	}-*/;

	/**
	 * Hash of per-component filter specification. If specified for a given
	 * component, this overrides the filter config. For dynamic loading.
	 * 
	 * @return
	 */
	public native final JavaScriptObject filters() /*-{
		return this.filters;
	}-*/;

	/**
	 * Hash of per-component filter specification. If specified for a given
	 * component, this overrides the filter config.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig filters(JavaScriptObject val) /*-{
		this.filters = val;
		return this;
	}-*/;

	// /**
	// * A filter to apply to result urls. This filter will modify the default
	// path for all modules. The default path for the YUI library is the
	// minified version of the files (e.g., event-min.js). The filter property
	// can be a predefined filter or a custom filter. The valid predefined
	// filters are:
	// <br/>
	// DEBUG
	// Selects the debug versions of the library (e.g., event-debug.js). This
	// option will automatically include the Logger widget<br/>
	// RAW
	// Selects the non-minified version of the library (e.g., event.js).<br/>
	//
	// You can also define a custom filter, which must be an object literal
	// containing a search expression and a replace string:<br/>
	// <pre>
	// 'searchExp': "-min\\.js",
	// 'replaceStr': "-debug.js"
	// </pre>
	// * @return
	// */
	// public native final String filter() /*-{
	// return this.filter;
	// }-*/;

	// /**
	// *
	// * @return
	// */
	// public native final JsArrayString force() /*-{
	// return this.attributeName;
	// }-*/;

	/**
	 * A list of modules that should always be loaded when required, even if
	 * already present on the page.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig force(String[] val) /*-{
		this.force = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val);
		return this;
	}-*/;

	/**
	 * The default gallery version to build gallery module urls
	 * 
	 * @return
	 */
	public native final String gallery() /*-{
		return this.gallery;
	}-*/;

	/**
	 * The default gallery version to build gallery module urls
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig gallery(String val) /*-{
		this.gallery = val;
		return this;
	}-*/;

	/**
	 * A hash of module group definitions. It for each group you can specify a
	 * list of modules and the base path and combo spec to use when dynamically
	 * loading the modules.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig groups(JavaScriptObject val) /*-{
		this.groups = val;
		return this;
	}-*/;

	/**
	 * A list of modules that should always be loaded when required, even if
	 * already present on the page.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig ignore(String[] val) /*-{
		this.ignore = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val);
		return this;
	}-*/;

	public native final JsArrayString ignore()/*-{
		return this.ignore;
	}-*/;

	/**
	 * Set to true if the yui seed file was dynamically loaded in order to
	 * bootstrap components relying on the window load event and the domready
	 * custom event.
	 * 
	 * @return
	 */
	public native final boolean injected() /*-{
		return this.injected;
	}-*/;

	/**
	 * Set to true if the yui seed file was dynamically loaded in order to
	 * bootstrap components relying on the window load event and the domready
	 * custom event. Default: false
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig injected(boolean val) /*-{
		this.injected = val;
		return this;
	}-*/;

	/**
	 * Node or id for a node that should be used as the insertion point for new
	 * nodes. For dynamic loading.
	 * 
	 * @return
	 */
	public native final String insertBefore() /*-{
		return this.insertBefore;
	}-*/;

	/**
	 * Node or id for a node that should be used as the insertion point for new
	 * nodes. For dynamic loading.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig insertBefore(String val) /*-{
		this.insertBefore = val;
		return this;
	}-*/;

	/**
	 * Object literal containing attributes to add to dynamically loaded script
	 * nodes.
	 * 
	 * @return
	 */
	public native final String jsAttributes() /*-{
		return this.jsAttributes;
	}-*/;

	/**
	 * Object literal containing attributes to add to dynamically loaded script
	 * nodes.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig jsAttributes(String val) /*-{
		this.jsAttributes = val;
		return this;
	}-*/;

	/**
	 * A list of languages in order of preference. This list is matched against
	 * the list of available languages in modules that the YUI instance uses to
	 * determine the best possible localization of language sensitive modules.
	 * Languages are represented using BCP 47 language tags, such as "en-GB" for
	 * English as used in the United Kingdom, or "zh-Hans-CN" for simplified
	 * Chinese as used in China. The list can be provided as a comma-separated
	 * list or as an array.
	 * 
	 * @return
	 */
	public native final String lang() /*-{
		return this.lang;
	}-*/;

	/**
	 * A list of languages in order of preference. This list is matched against
	 * the list of available languages in modules that the YUI instance uses to
	 * determine the best possible localization of language sensitive modules.
	 * Languages are represented using BCP 47 language tags, such as "en-GB" for
	 * English as used in the United Kingdom, or "zh-Hans-CN" for simplified
	 * Chinese as used in China. The list can be provided as a comma-separated
	 * list or as an array.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig lang(String val) /*-{
		this.lang = val;
		return this;
	}-*/;

	/**
	 * A list of languages in order of preference. This list is matched against
	 * the list of available languages in modules that the YUI instance uses to
	 * determine the best possible localization of language sensitive modules.
	 * Languages are represented using BCP 47 language tags, such as "en-GB" for
	 * English as used in the United Kingdom, or "zh-Hans-CN" for simplified
	 * Chinese as used in China. The list can be provided as a comma-separated
	 * list or as an array.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig lang(JsArrayString val) /*-{
		this.lang = val;
		return this;
	}-*/;

	/**
	 * A list of languages in order of preference. This list is matched against
	 * the list of available languages in modules that the YUI instance uses to
	 * determine the best possible localization of language sensitive modules.
	 * Languages are represented using BCP 47 language tags, such as "en-GB" for
	 * English as used in the United Kingdom, or "zh-Hans-CN" for simplified
	 * Chinese as used in China. The list can be provided as a comma-separated
	 * list or as an array.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig lang(String[] val) /*-{
		this.lang = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(val);
		return this;
	}-*/;

	/**
	 * The loader 'path' attribute to the loader itself. This is combined with
	 * the 'base' attribute to dynamically load the loader component when
	 * boostrapping with the get utility alone.Default: loader/loader-min.js
	 * 
	 * @return
	 */
	public native final String loaderPath() /*-{
		return this.loaderPath;
	}-*/;

	/**
	 * The loader 'path' attribute to the loader itself. This is combined with
	 * the 'base' attribute to dynamically load the loader component when
	 * boostrapping with the get utility alone.Default: loader/loader-min.js
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig loaderPath(String val) /*-{
		this.loaderPath = val;
		return this;
	}-*/;

	/**
	 * A callback to execute when the loader fails to load one or more resource.
	 * This could be because of a script load failure. It can also fail if a
	 * javascript module fails to register itself, but only when the
	 * 'requireRegistration' is true. If this function is defined, the use()
	 * callback will only be called when the loader succeeds, otherwise it
	 * always executes unless there was a javascript error when attaching a
	 * module.
	 * 
	 * @param c
	 * @return
	 */
	public native final YuiConfig loadErrorFn(ErrorCallback c)/*-{
		this.loadErrorFn = $entry(function(errMsg, err) {
			return c.@org.sgx.yuigwt.yui.YuiConfig.ErrorCallback::call(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(errMsg, err);
		});
		return this;
	}-*/;

	/**
	 * A hash of log sources that should be not be logged. If specified, all
	 * sources are logged if not on this list.
	 * 
	 * @return
	 */
	public native final JavaScriptObject logExclude() /*-{
		return this.logExclude;
	}-*/;

	/**
	 * A hash of log sources that should be not be logged. If specified, all
	 * sources are logged if not on this list.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig logExclude(JavaScriptObject val) /*-{
		this.logExclude = val;
		return this;
	}-*/;

	/**
	 * A callback to execute when the loader fails to load one or more resource.
	 * This could be because of a script load failure. It can also fail if a
	 * javascript module fails to register itself, but only when the
	 * 'requireRegistration' is true. If this function is defined, the use()
	 * callback will only be called when the loader succeeds, otherwise it
	 * always executes unless there was a javascript error when attaching a
	 * module.
	 * 
	 * @param c
	 * @return
	 */
	public native final YuiConfig logFn(ErrorCallback c)/*-{
		this.logFn = $entry(function(errMsg, err) {
			return c.@org.sgx.yuigwt.yui.YuiConfig.ErrorCallback::call(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(errMsg, err);
		});
		return this;
	}-*/;

	/**
	 * A hash of log sources that should be logged. If specified, only log
	 * messages from these sources will be logged.
	 * 
	 * @return
	 */
	public native final JavaScriptObject logInclude() /*-{
		return this.logInclude;
	}-*/;

	/**
	 * A hash of log sources that should be logged. If specified, only log
	 * messages from these sources will be logged.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig logInclude(JavaScriptObject val) /*-{
		this.logInclude = val;
		return this;
	}-*/;

	// modules
	public static class Module extends JavaScriptObject {
		protected Module() {
		}

		public static native final Module create()/*-{
			return {};
		}-*/;
		
		/**
		 * 
		 * @return
		 */
		public native final JsArrayString requires() /*-{
			return this.requires;
		}-*/;

		/**
		 * 
		 * @return
		 */
		public native final String type() /*-{
			return this.type;
		}-*/;

		/**
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final YuiConfig.Module type(String val) /*-{
			this.type = val;
			return this;
		}-*/;

		/**
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final YuiConfig.Module requires(JsArrayString val) /*-{
			this.requires = val;
			return this;
		}-*/;

		/**
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final YuiConfig.Module requires(String[] val) /*-{
			this.requires = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val);
			return this;
		}-*/;

		/**
		 * 
		 * @return
		 */
		public native final String fullpath() /*-{
			return this.fullpath;
		}-*/;

		/**
		 * A list of languages in order of preference. This list is matched
		 * against the list of available languages in modules that the YUI
		 * instance uses to determine the best possible localization of language
		 * sensitive modules. Languages are represented using BCP 47 language
		 * tags, such as "en-GB" for English as used in the United Kingdom, or
		 * "zh-Hans-CN" for simplified Chinese as used in China. The list can be
		 * provided as a comma-separated list or as an array.
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final Module lang(String val) /*-{
			this.lang = val;
			return this;
		}-*/;

		/**
		 * A list of languages in order of preference. This list is matched
		 * against the list of available languages in modules that the YUI
		 * instance uses to determine the best possible localization of language
		 * sensitive modules. Languages are represented using BCP 47 language
		 * tags, such as "en-GB" for English as used in the United Kingdom, or
		 * "zh-Hans-CN" for simplified Chinese as used in China. The list can be
		 * provided as a comma-separated list or as an array.
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final Module lang(JsArrayString val) /*-{
			this.lang = val;
			return this;
		}-*/;

		/**
		 * A list of languages in order of preference. This list is matched
		 * against the list of available languages in modules that the YUI
		 * instance uses to determine the best possible localization of language
		 * sensitive modules. Languages are represented using BCP 47 language
		 * tags, such as "en-GB" for English as used in the United Kingdom, or
		 * "zh-Hans-CN" for simplified Chinese as used in China. The list can be
		 * provided as a comma-separated list or as an array.
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final Module lang(String[] val) /*-{
			this.lang = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(val);
			return this;
		}-*/;

		/**
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final YuiConfig.Module fullpath(String val) /*-{
			this.fullpath = val;
			return this;
		}-*/;

		/**
		 * 
		 * @return
		 */
		public native final boolean async() /*-{
			return this.async;
		}-*/;

		/**
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final YuiConfig.Module async(boolean val) /*-{
			this.async = val;
			return this;
		}-*/;
	}

	/**
	 * A hash of module definitions to add to the list of YUI components. These
	 * components can then be dynamically loaded side by side with YUI via the
	 * use() method. This is a hash, the key is the module name, and the value
	 * is an object literal specifying the metdata for the module. See
	 * Loader.addModule for the supported module metadata fields. Also see
	 * groups, which provides a way to configure the base and combo spec for a
	 * set of modules.
	 * 
	 * <pre>
	 * modules: {
	 *      mymod1: {
	 *          requires: ['node'],
	 *          fullpath: '/mymod1/mymod1.js'
	 *      },
	 *      mymod2: {
	 *          requires: ['mymod1'],
	 *          fullpath: '/mymod2/mymod2.js'
	 *      },
	 *      mymod3: '/js/mymod3.js',
	 *      mycssmod: '/css/mycssmod.css'
	 *  }
	 * </pre>
	 * 
	 * @return
	 */
	public native final JavaScriptObject modules() /*-{
		return this.modules;
	}-*/;

	/**
	 * A hash of module definitions to add to the list of YUI components. These
	 * components can then be dynamically loaded side by side with YUI via the
	 * use() method. This is a hash, the key is the module name, and the value
	 * is an object literal specifying the metdata for the module. See
	 * Loader.addModule for the supported module metadata fields. Also see
	 * groups, which provides a way to configure the base and combo spec for a
	 * set of modules.
	 * 
	 * <pre>
	 * modules: {
	 *      mymod1: {
	 *          requires: ['node'],
	 *          fullpath: '/mymod1/mymod1.js'
	 *      },
	 *      mymod2: {
	 *          requires: ['mymod1'],
	 *          fullpath: '/mymod2/mymod2.js'
	 *      },
	 *      mymod3: '/js/mymod3.js',
	 *      mycssmod: '/css/mycssmod.css'
	 *  }
	 * </pre>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig modules(JavaScriptObject val) /*-{
		this.modules = val;
		return this;
	}-*/;

	/**
	 * A hash of module definitions to add to the list of YUI components. These
	 * components can then be dynamically loaded side by side with YUI via the
	 * use() method. This is a hash, the key is the module name, and the value
	 * is an object literal specifying the metdata for the module. See
	 * Loader.addModule for the supported module metadata fields. Also see
	 * groups, which provides a way to configure the base and combo spec for a
	 * set of modules.
	 * 
	 * <pre>
	 * modules: {
	 *      mymod1: {
	 *          requires: ['node'],
	 *          fullpath: '/mymod1/mymod1.js'
	 *      },
	 *      mymod2: {
	 *          requires: ['mymod1'],
	 *          fullpath: '/mymod2/mymod2.js'
	 *      },
	 *      mymod3: '/js/mymod3.js',
	 *      mycssmod: '/css/mycssmod.css'
	 *  }
	 * </pre>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig module(String name, Module val) /*-{
		if (!this.modules)
			this.modules = {};
		this.modules[name] = val;
		return this;
	}-*/;

	/**
	 * A hash of module definitions to add to the list of YUI components. These
	 * components can then be dynamically loaded side by side with YUI via the
	 * use() method. This is a hash, the key is the module name, and the value
	 * is an object literal specifying the metdata for the module. See
	 * Loader.addModule for the supported module metadata fields. Also see
	 * groups, which provides a way to configure the base and combo spec for a
	 * set of modules.
	 * 
	 * <pre>
	 * modules: {
	 *      mymod1: {
	 *          requires: ['node'],
	 *          fullpath: '/mymod1/mymod1.js'
	 *      },
	 *      mymod2: {
	 *          requires: ['mymod1'],
	 *          fullpath: '/mymod2/mymod2.js'
	 *      },
	 *      mymod3: '/js/mymod3.js',
	 *      mycssmod: '/css/mycssmod.css'
	 *  }
	 * </pre>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig module(String name, String val) /*-{
		if (!this.modules)
			this.modules = {};
		this.modules[name] = val;
		return this;
	}-*/;

	/**
	 * SimpleCallback for the 'CSSComplete' event. When dynamically loading YUI
	 * components with CSS, this property fires when the CSS is finished loading
	 * but script loading is still ongoing. This provides an opportunity to
	 * enhance the presentation of a loading page a little bit before the entire
	 * loading process is done.
	 * 
	 * @param c
	 * @return
	 */
	public native final YuiConfig onCSS(ErrorCallback c)/*-{
		this.onCSS = $entry(function(errMsg, err) {
			return c.@org.sgx.yuigwt.yui.YuiConfig.ErrorCallback::call(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(errMsg, err);
		});
		return this;
	}-*/;

	/**
	 * The default interval when polling in milliseconds. default 20
	 * 
	 * @return
	 */
	public native final int pollInterval() /*-{
		return this.pollInterval;
	}-*/;

	/**
	 * The default interval when polling in milliseconds. default 20
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig pollInterval(int val) /*-{
		this.pollInterval = val;
		return this;
	}-*/;

	/**
	 * The number of dynamic nodes to insert by default before automatically
	 * removing them. This applies to script nodes because removing the node
	 * will not make the evaluated script unavailable. Dynamic CSS is not auto
	 * purged, because removing a linked style sheet will also remove the style
	 * definitions. Default: 20
	 * 
	 * @return
	 */
	public native final int purgethreshold() /*-{
		return this.purgethreshold;
	}-*/;

	/**
	 * The number of dynamic nodes to insert by default before automatically
	 * removing them. This applies to script nodes because removing the node
	 * will not make the evaluated script unavailable. Dynamic CSS is not auto
	 * purged, because removing a linked style sheet will also remove the style
	 * definitions. Default: 20
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig purgethreshold(int val) /*-{
		this.purgethreshold = val;
		return this;
	}-*/;

	/**
	 * When set to true, the YUI loader will expect that all modules it is
	 * responsible for loading will be first-class YUI modules that register
	 * themselves with the YUI global. If this is set to true, loader will fail
	 * if the module registration fails to happen after the script is loaded.
	 * 
	 * @return
	 */
	public native final boolean requireRegistration() /*-{
		return this.requireRegistration;
	}-*/;

	/**
	 * When set to true, the YUI loader will expect that all modules it is
	 * responsible for loading will be first-class YUI modules that register
	 * themselves with the YUI global. If this is set to true, loader will fail
	 * if the module registration fails to happen after the script is loaded.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig requireRegistration(boolean val) /*-{
		this.requireRegistration = val;
		return this;
	}-*/;

	/**
	 * The root path to prepend to module path for the combo service. Ex:
	 * 3.0.0b1/build/ For dynamic loading.
	 * 
	 * @return
	 */
	public native final String root() /*-{
		return this.root;
	}-*/;

	/**
	 * The root path to prepend to module path for the combo service. Ex:
	 * 3.0.0b1/build/ For dynamic loading.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig root(String val) /*-{
		this.root = val;
		return this;
	}-*/;

	/**
	 * The skin config let's you configure application level skin
	 * customizations. It contains the following attributes which can be
	 * specified to override the defaults:
	 * 
	 * <pre>
	 *  // The default skin, which is automatically applied if not
	 *  // overriden by a component-specific skin definition.
	 *  // Change this in to apply a different skin globally
	 *  defaultSkin: 'sam',
	 * 
	 *  // This is combined with the loader base property to get
	 *  // the default root directory for a skin.
	 *  base: 'assets/skins/',
	 * 
	 *  // Any component-specific overrides can be specified here,
	 *  // making it possible to load different skins for different
	 *  // components.  It is possible to load more than one skin
	 *  // for a given component as well.
	 *  overrides: {
	 *      slider: ['capsule', 'round']
	 *  }
	 * </pre>
	 * 
	 * For dynamic loading.
	 * 
	 * @return
	 */
	public native final SkinConfig skin() /*-{
		return this.skin;
	}-*/;

	/**
	 * The skin config let's you configure application level skin
	 * customizations. It contains the following attributes which can be
	 * specified to override the defaults:
	 * 
	 * <pre>
	 *  // The default skin, which is automatically applied if not
	 *  // overriden by a component-specific skin definition.
	 *  // Change this in to apply a different skin globally
	 *  defaultSkin: 'sam',
	 * 
	 *  // This is combined with the loader base property to get
	 *  // the default root directory for a skin.
	 *  base: 'assets/skins/',
	 * 
	 *  // Any component-specific overrides can be specified here,
	 *  // making it possible to load different skins for different
	 *  // components.  It is possible to load more than one skin
	 *  // for a given component as well.
	 *  overrides: {
	 *      slider: ['capsule', 'round']
	 *  }
	 * </pre>
	 * 
	 * For dynamic loading.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig skin(SkinConfig val) /*-{
		this.skin = val;
		return this;
	}-*/;

	/**
	 * If throwFail is set, Y.error will generate or re-throw a JS Error.
	 * Otherwise the failure is logged. default true
	 * 
	 * @return
	 */
	public native final boolean throwFail() /*-{
		return this.throwFail;
	}-*/;

	/**
	 * If throwFail is set, Y.error will generate or re-throw a JS Error.
	 * Otherwise the failure is logged. default true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig throwFail(boolean val) /*-{
		this.throwFail = val;
		return this;
	}-*/;

	/**
	 * DataTypeNumber of milliseconds before a timeout occurs when dynamically
	 * loading nodes. If not set, there is no timeout.
	 * 
	 * @return
	 */
	public native final int timeout() /*-{
		return this.timeout;
	}-*/;

	/**
	 * DataTypeNumber of milliseconds before a timeout occurs when dynamically
	 * loading nodes. If not set, there is no timeout.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig timeout(int val) /*-{
		this.timeout = val;
		return this;
	}-*/;

	/**
	 * Log to the browser console if debug is on and the browser has a supported
	 * console. default true
	 * 
	 * @return
	 */
	public native final boolean useBrowserConsole() /*-{
		return this.useBrowserConsole;
	}-*/;

	/**
	 * Log to the browser console if debug is on and the browser has a supported
	 * console. default true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig useBrowserConsole(boolean val) /*-{
		this.useBrowserConsole = val;
		return this;
	}-*/;

	/**
	 * If true, the Y.History alias will always point to Y.HistoryHTML5 when the
	 * history-html5 module is loaded, even if the current browser doesn't
	 * support HTML5 history. If false, the Y.History alias will always point to
	 * Y.HistoryHash when the history-hash module is loaded, even if the current
	 * browser supports HTML5 history. If neither true nor false, the Y.History
	 * alias will point to the best available history adapter that the browser
	 * supports. This is the default behavior.
	 * 
	 * @return
	 */
	public native final boolean useHistoryHTML5() /*-{
		return this.useHistoryHTML5;
	}-*/;

	/**
	 * If true, the Y.History alias will always point to Y.HistoryHTML5 when the
	 * history-html5 module is loaded, even if the current browser doesn't
	 * support HTML5 history. If false, the Y.History alias will always point to
	 * Y.HistoryHash when the history-hash module is loaded, even if the current
	 * browser supports HTML5 history. If neither true nor false, the Y.History
	 * alias will point to the best available history adapter that the browser
	 * supports. This is the default behavior.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig useHistoryHTML5(boolean val) /*-{
		this.useHistoryHTML5 = val;
		return this;
	}-*/;

	/**
	 * The window/frame that this instance should operate in.Default: the window
	 * hosting YUI
	 * 
	 * @return
	 */
	public native final JavaScriptObject win() /*-{
		return this.win;
	}-*/;

	/**
	 * The window/frame that this instance should operate in.Default: the window
	 * hosting YUI
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig win(JavaScriptObject val) /*-{
		this.win = val;
		return this;
	}-*/;

	/**
	 * The default interval when polling in milliseconds.Default: 40
	 * 
	 * @return
	 */
	public native final int windowResizeDeltay() /*-{
		return this.windowResizeDeltay;
	}-*/;

	/**
	 * The default interval when polling in milliseconds.Default: 40
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig windowResizeDeltay(int val) /*-{
		this.windowResizeDeltay = val;
		return this;
	}-*/;

	/**
	 * The default YUI 2 version to build yui2 module urls. This is for
	 * intrinsic YUI 2 support via the 2in3 project. Also see the '2in3' config
	 * for pulling different revisions of the wrapped YUI 2 modules. Default:
	 * 2.9.0
	 * 
	 * @return
	 */
	public native final String yui2() /*-{
		return this.yui2;
	}-*/;

	/**
	 * The default YUI 2 version to build yui2 module urls. This is for
	 * intrinsic YUI 2 support via the 2in3 project. Also see the '2in3' config
	 * for pulling different revisions of the wrapped YUI 2 modules. Default:
	 * 2.9.0
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiConfig yui2(String val) /*-{
		this.yui2 = val;
		return this;
	}-*/;

}
