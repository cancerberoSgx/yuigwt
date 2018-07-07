package org.sgx.yuigwt.yui;

import org.sgx.yuigwt.yui.dom.DOM;
import org.sgx.yuigwt.yui.anim.Anim;
import org.sgx.yuigwt.yui.anim.AnimConfig;
import org.sgx.yuigwt.yui.asyncqueue.AsyncQueue;
import org.sgx.yuigwt.yui.asyncqueue.AsyncQueueClass;
import org.sgx.yuigwt.yui.attr.AttributeConfig;
import org.sgx.yuigwt.yui.cache.Cache;
import org.sgx.yuigwt.yui.cache.CacheConfig;
import org.sgx.yuigwt.yui.cache.CacheOffline;
import org.sgx.yuigwt.yui.cache.CacheOfflineConfig;
import org.sgx.yuigwt.yui.charts.ChartBase;
import org.sgx.yuigwt.yui.charts.ChartBaseConfig;
import org.sgx.yuigwt.yui.charts.PieChart;
import org.sgx.yuigwt.yui.charts.PieChartConfig;
import org.sgx.yuigwt.yui.collection.ArrayList;
import org.sgx.yuigwt.yui.collection.Queue;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.cookie.CookieClass;
import org.sgx.yuigwt.yui.dataschema.DataSchemaClass;
import org.sgx.yuigwt.yui.datasource.DataSourceClass;
import org.sgx.yuigwt.yui.datasource.DataSourceConfig;
import org.sgx.yuigwt.yui.datatype.DataTypeDate;
import org.sgx.yuigwt.yui.datatype.DataTypeNumber;
import org.sgx.yuigwt.yui.datatype.DataTypeXML;
import org.sgx.yuigwt.yui.dd.Drag;
import org.sgx.yuigwt.yui.dd.DragConfig;
import org.sgx.yuigwt.yui.dd.Drop;
import org.sgx.yuigwt.yui.editor.EditorBase;
import org.sgx.yuigwt.yui.editor.EditorBaseClass;
import org.sgx.yuigwt.yui.editor.EditorBaseConfig;
import org.sgx.yuigwt.yui.event.EventTarget;
import org.sgx.yuigwt.yui.get.Get;
import org.sgx.yuigwt.yui.graphic.Graphic;
import org.sgx.yuigwt.yui.graphic.GraphicConfig;
import org.sgx.yuigwt.yui.handlebars.HandlebarsClass;
import org.sgx.yuigwt.yui.history.HistoryBase;
import org.sgx.yuigwt.yui.history.HistoryClass;
import org.sgx.yuigwt.yui.history.HistoryBaseConfig;
import org.sgx.yuigwt.yui.history.HistoryHashClass;
import org.sgx.yuigwt.yui.imageloader.ImgLoadGroup;
import org.sgx.yuigwt.yui.imageloader.ImgLoadGroupConfig;
import org.sgx.yuigwt.yui.io.IO;
import org.sgx.yuigwt.yui.io.IOClass;
import org.sgx.yuigwt.yui.json.JSONClass;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeClass;
import org.sgx.yuigwt.yui.node.NodeList;
import org.sgx.yuigwt.yui.pjax.Pjax;
import org.sgx.yuigwt.yui.pjax.PjaxConfig;
import org.sgx.yuigwt.yui.resize.Resize;
import org.sgx.yuigwt.yui.resize.ResizeConfig;
import org.sgx.yuigwt.yui.router.RouterClass;
import org.sgx.yuigwt.yui.router.RouterConfig;
import org.sgx.yuigwt.yui.sortable.Sortable;
import org.sgx.yuigwt.yui.sortable.SortableConfig;
import org.sgx.yuigwt.yui.stylesheet.StyleSheet;
import org.sgx.yuigwt.yui.stylesheet.StyleSheetClass;
import org.sgx.yuigwt.yui.test.TestAssert;
import org.sgx.yuigwt.yui.test.TestCase;
import org.sgx.yuigwt.yui.test.TestCaseConfig;
import org.sgx.yuigwt.yui.test.TestCaseJsClass;
import org.sgx.yuigwt.yui.test.TestRunner;
import org.sgx.yuigwt.yui.test.TestSuite;
import org.sgx.yuigwt.yui.uploader.Uploader;
import org.sgx.yuigwt.yui.uploader.UploaderClass;
import org.sgx.yuigwt.yui.uploader.UploaderConfig;
import org.sgx.yuigwt.yui.uploader.UploaderHTML5;
import org.sgx.yuigwt.yui.uploader.file.FileHTML5;
import org.sgx.yuigwt.yui.uploader.file.FileHTML5Class;
import org.sgx.yuigwt.yui.util.AbstractCallback;
import org.sgx.yuigwt.yui.util.Callback;
import org.sgx.yuigwt.yui.util.JsFunction;
import org.sgx.yuigwt.yui.widget.WidgetClass;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ToggleButton;
import org.sgx.yuigwt.yui.widget.calendar.Calendar;
import org.sgx.yuigwt.yui.widget.calendar.CalendarConfig;
import org.sgx.yuigwt.yui.widget.datatable.DataTable;
import org.sgx.yuigwt.yui.widget.datatable.DataTableConfig;
import org.sgx.yuigwt.yui.widget.dial.Dial;
import org.sgx.yuigwt.yui.widget.dial.DialConfig;
import org.sgx.yuigwt.yui.widget.ext.WidgetExtClass;
import org.sgx.yuigwt.yui.widget.overlay.Overlay;
import org.sgx.yuigwt.yui.widget.overlay.OverlayConfig;
import org.sgx.yuigwt.yui.widget.panel.Panel;
import org.sgx.yuigwt.yui.widget.panel.PanelConfig;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollView;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewClass;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewConfig;
import org.sgx.yuigwt.yui.widget.slider.Slider;
import org.sgx.yuigwt.yui.widget.slider.SliderConfig;
import org.sgx.yuigwt.yui.widget.tabview.TabView;
import org.sgx.yuigwt.yui.widget.tabview.TabViewConfig;
import org.sgx.yuigwt.yui.yql.YQL;
import org.sgx.yuigwt.yui.yql.YQLCallback;
import org.sgx.yuigwt.yui.yql.YQLOpts;
import org.sgx.yuigwt.yui.yql.YQLParams;
import org.sgx.yuigwt.yui.yui.Escape;
import org.sgx.yuigwt.yui.yui.SubstituteCallback;
import org.sgx.yuigwt.yui.yui.Timer;
import org.sgx.yuigwt.yui.yui.UAClass;
import org.sgx.yuigwt.yui.yui.YuiEvent;
import org.sgx.yuigwt.yui.yui.YuiLang;
import org.sgx.yuigwt.yui.yui.YuiPluginHome;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * the YuiContext is the "Y" object returned to the YUI.use() callback in which
 * we work. in this java API it has the respojnsability of instantiate YUI
 * classes. This class is big and it is separated in two main responsabilities
 * 1) Y object utilities like Y.on, Y.one, Y.log, etc 2) Y constants - like
 * module contsntas and Static classes like Plugin, Escape, etc 3) component
 * creators - methods started with new*
 * 
 * TODO: all new* methods shoud accept a JavaScriptObject class so objects
 * created not using *Config classes can be used. See example configobjects1
 * 
 * TODO: YUI should be the same class as YuiContext - REFACTOR!
 * 
 * @author sg
 * 
 */
public class YuiContext extends YUI {
	protected YuiContext() {
	}

	// first an artificial extension manager
	// public native final YuiConfig extendRegister(String className,
	// JavaScriptObject parentClass)/*-{
	// if(!this._extendRegister)
	// this._extendRegister = {};
	// function fnnn() {
	// fnnn.superclass.constructor.apply(this, arguments);
	// } ;
	// this.extend(parentClass)
	// this._extendRegister[className]
	// }-*/;

	/**
	 * @return the current YUI configuration.
	 */
	public native final YuiConfig config()/*-{
		return this.config;
	}-*/;

	/**
	 * 
	 <p>
	 * Returns a new object containing all of the properties of all the supplied
	 * objects. The properties from later objects will overwrite those in
	 * earlier objects.
	 * </p>
	 * 
	 * <p>
	 * Passing in a single object will create a shallow copy of it. For a deep
	 * copy, use clone().
	 * </p>
	 * 
	 * @param objects
	 * @return
	 */
	public native final JavaScriptObject merge(JavaScriptObject ... objects)/*-{
		
		return this.merge.apply(this, @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(objects)); 
		
//		return this.merge(objects);
	}-*/;

	/**
	 * Returns a single Node instance bound to the node or the first element
	 * matching the given selector. Returns null if no match
	 * found.<strong>Note:</strong>For chaining purposes you may want to use
	 * <code>Y.all</code>, which returns a NodeList when no match is found.<div
	 * class=params><h4>Parameters:</h4>
	 * <ul class=params-list>
	 * <li class=param><code class=param-name>node</code><span class=type><a
	 * href=
	 * "https://developer.mozilla.org/en/JavaScript/Reference/Global_Objects/String"
	 * class="crosslink external" target=_blank>String</a>|<a href=
	 * "https://developer.mozilla.org/en/Document_Object_Model_%28DOM%29/HTMLElement"
	 * class="crosslink external" target=_blank>HTMLElement</a></span><div
	 * class=param-description>
	 * <p>
	 * a node or Selector
	 * </p>
	 * </div></li>
	 * </ul>
	 * </div><div class=returns><h4>Returns:</h4><div
	 * class=returns-description><span class=type><a href="../classes/Node.html"
	 * class=crosslink>Node</a>| null</span>: a Node instance or null if no
	 * match found.</div></div>
	 */
	public native final Node one(String node)/*-{
		return this.one(node);
	}-*/;

	public native final Node one(Node node)/*-{
		return this.one(node);
	}-*/;

	/**
	 * Retrieves a NodeList based on the given CSS selector.
	 * @param selector The CSS selector to test against.
	 * @return  A NodeList instance for the matching HTMLCollection/Array. 
	 */
	public native final NodeList all(String selector)/*-{
		return this.all(selector);
	}-*/;

	
	/**
	 * create a node from a gwt widget
	 * 
	 * @param node
	 * @return
	 */
	public native final Node one(Widget node)/*-{
		var el = node.@com.google.gwt.user.client.ui.Widget::getElement()();
		return this.one(el);
	}-*/;

	public native final Node one(Element node)/*-{
		return this.one(node);
	}-*/;

	// log
	/**
	 * If the 'debug' config is true, a 'yui:log' event will be dispatched,
	 * which the Console widget and anything else can consume. If the
	 * 'useBrowserConsole' config is true, it will write to the browser console
	 * if available. YUI-specific log messages will only be present in the
	 * -debug versions of the JS files. The build system is supposed to remove
	 * log statements from the raw and minified versions of the files.
	 * 
	 * @param msg
	 *            The message to log.
	 * @param cat
	 *            The log category for the message. Default categories are
	 *            "info", "warn", "error", time". Custom categories can be used
	 *            as well. (opt).
	 * @param src
	 *            The source of the the message (opt).
	 * @param silent
	 *            If true, the log event won't fire.
	 * @return self for method chaining
	 */
	public native final YUI log(String msg, String cat, String src, boolean silent) /*-{
		this.log(msg, cat, src, silent);
		return this;
	}-*/;

	/**
	 * If the 'debug' config is true, a 'yui:log' event will be dispatched,
	 * which the Console widget and anything else can consume. If the
	 * 'useBrowserConsole' config is true, it will write to the browser console
	 * if available. YUI-specific log messages will only be present in the
	 * -debug versions of the JS files. The build system is supposed to remove
	 * log statements from the raw and minified versions of the files.
	 * 
	 * @param msg
	 *            The message to log.
	 * @param cat
	 *            The log category for the message. Default categories are
	 *            "info", "warn", "error", time". Custom categories can be used
	 *            as well. (opt).
	 * @param src
	 *            The source of the the message (opt).
	 * @return self for method chaining
	 */
	public native final YUI log(String msg, String cat, String src) /*-{
		this.log(msg, cat, src);
		return this;
	}-*/;

	public native final YUI fail(String msg) /*-{
		this.log(msg);
		return this;
	}-*/;

	public native final JavaScriptObject extend(JsFunction myClassFn, JavaScriptObject supplier)/*-{
		return this.aggregate(receiver, supplier);
	}-*/;

	/**
	 * Copies object properties from the supplier to the receiver. If the target
	 * has the property, and the property is an object, the target object will
	 * be augmented with the supplier's value.
	 * 
	 * @param receiver
	 *            Object to receive the augmentation.
	 * @param supplier
	 *            Object that supplies the properties with which to augment the
	 *            receiver.
	 * @return Augmented object.
	 */
	public native final JavaScriptObject aggregate(JavaScriptObject receiver, JavaScriptObject supplier)/*-{
		return this.aggregate(receiver, supplier);
	}-*/;

	/**
	 * Copies object properties from the supplier to the receiver. If the target
	 * has the property, and the property is an object, the target object will
	 * be augmented with the supplier's value.
	 * 
	 * @param receiver
	 *            Object to receive the augmentation.
	 * @param supplier
	 *            Object that supplies the properties with which to augment the
	 *            receiver.
	 * @return Augmented object.
	 */
	public native final JavaScriptObject aggregate(JavaScriptObject receiver, JavaScriptObject supplier, boolean overwrite)/*-{
		return this.aggregate(receiver, supplier);
	}-*/;

	/**
	 * Returns a simple string representation of the object or array. Other
	 * types of objects will be returned unprocessed. Arrays are expected to be
	 * indexed.
	 * 
	 * @param o
	 *            The object to dump.
	 * @param d
	 *            How deep to recurse child objects, default 3.
	 * @return the dump result.
	 */
	public native final String dump(JavaScriptObject o, int d)/*-{
		return this.dump(o, d);
	}-*/;

	public native final String dump(Object o, int d)/*-{
		return this.dump(o, d);
	}-*/;

	/**
	 * Returns a simple string representation of the object or array. Other
	 * types of objects will be returned unprocessed. Arrays are expected to be
	 * indexed.
	 * 
	 * @param o
	 *            The object to dump.
	 * @return the dump result.
	 */
	public native final String dump(JavaScriptObject o)/*-{
		return this.dump(o);
	}-*/;

	// message
	/**
	 * Write a system message. This message will be preserved in the minified
	 * and raw versions of the YUI files, unlike log statements.
	 * 
	 * @param msg
	 *            The message to log.
	 * @param cat
	 *            The log category for the message. Default categories are
	 *            "info", "warn", "error", time". Custom categories can be used
	 *            as well. (opt).
	 * @param src
	 *            The source of the the message (opt).
	 * @param silent
	 *            If true, the log event won't fire.
	 * @return self for method chaining
	 */
	public native final YUI message(String msg, String cat, String src, boolean silent) /*-{
		this.message(msg, cat, src, silent);
		return this;
	}-*/;

	/**
	 * Write a system message. This message will be preserved in the minified
	 * and raw versions of the YUI files, unlike log statements.
	 * 
	 * @param msg
	 *            The message to log.
	 * @param cat
	 *            The log category for the message. Default categories are
	 *            "info", "warn", "error", time". Custom categories can be used
	 *            as well. (opt).
	 * @param src
	 *            The source of the the message (opt).
	 * @return self for method chaining
	 */
	public native final YUI message(String msg, String cat, String src) /*-{
		this.message(msg, cat, src, silent);
		return this;
	}-*/;

	/**
	 * Does {placeholder} substitution on a string. The object passed as the
	 * second parameter provides values to replace the {placeholder}s.
	 * {placeholder} token names must match property names of the object. For
	 * example
	 * 
	 * <pre>
	 * var greeting = Y.substitute("Hello, {who}!", { who: "World" });
	 * </pre>
	 * 
	 * <p>
	 * {placeholder} tokens that are undefined on the object mapJavaToJs will be
	 * left in tact (leaving unsightly "{placeholder}"s in the output string).
	 * If your replacement strings should include curly braces, use {LBRACE} and
	 * {RBRACE} in your object mapJavaToJs string value.
	 * </p>
	 * 
	 * <p>
	 * If a function is passed as a third argument, it will be called for each
	 * {placeholder} found. The {placeholder} name is passed as the first value
	 * and the value from the object mapJavaToJs is passed as the second. If the
	 * {placeholder} contains a space, the first token will be used to identify
	 * the object mapJavaToJs property and the remainder will be passed as a
	 * third argument to the function. See below for an example.
	 * </p>
	 * 
	 * <p>
	 * If the value in the object mapJavaToJs for a given {placeholder} is an
	 * object and the dump module is loaded, the replacement value will be the
	 * string result of calling Y.dump(...) with the object as input. Include a
	 * numeric second token in the {placeholder} to configure the depth of the
	 * call to Y.dump(...), e.g. "{someObject 2}". See the dump method for
	 * details.
	 * </p>
	 * 
	 * @param s
	 *            The input string
	 * @param o
	 *            An object containing the replacement values.
	 * @return
	 */
	public native final String substitute(String s, JavaScriptObject o)/*-{
		return this.substitute(s, o);
	}-*/;

	/**
	 * Executes the supplied function in the context of the supplied object 'when' milliseconds later. Executes the function a single time unless periodic is set to true.
	 * @param when the number of milliseconds to wait until the fn is executed.
	 * @param fn
	 * @param data [Array] data that is provided to the function. This accepts either a single item or an array. If an array is provided, the function is executed with one parameter for each array item. If you need to pass a single array parameter, it needs to be wrapped in an array [myarray]. ote: native methods in IE may not have the call and apply methods. In this case, it will work, but you are limited to four arguments. 
	 * @param periodic if true, executes continuously at supplied interval until canceled.
	 * @return a timer object. Call the cancel() method on this object to stop the timer. 
	 */
	public native final Timer later(int when, Callback fn, JavaScriptObject data, boolean periodic)/*-{
		var f = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/Callback;)(fn);  
		return this.later(when, null, f, data, periodic);
	}-*/;
	
	/**
	 * Does {placeholder} substitution on a string. The object passed as the
	 * second parameter provides values to replace the {placeholder}s.
	 * {placeholder} token names must match property names of the object. For
	 * example
	 * 
	 * <pre>
	 * var greeting = Y.substitute("Hello, {who}!", { who: "World" });
	 * </pre>
	 * 
	 * <p>
	 * {placeholder} tokens that are undefined on the object mapJavaToJs will be
	 * left in tact (leaving unsightly "{placeholder}"s in the output string).
	 * If your replacement strings should include curly braces, use {LBRACE} and
	 * {RBRACE} in your object mapJavaToJs string value.
	 * </p>
	 * 
	 * <p>
	 * If a function is passed as a third argument, it will be called for each
	 * {placeholder} found. The {placeholder} name is passed as the first value
	 * and the value from the object mapJavaToJs is passed as the second. If the
	 * {placeholder} contains a space, the first token will be used to identify
	 * the object mapJavaToJs property and the remainder will be passed as a
	 * third argument to the function. See below for an example.
	 * </p>
	 * 
	 * <p>
	 * If the value in the object mapJavaToJs for a given {placeholder} is an
	 * object and the dump module is loaded, the replacement value will be the
	 * string result of calling Y.dump(...) with the object as input. Include a
	 * numeric second token in the {placeholder} to configure the depth of the
	 * call to Y.dump(...), e.g. "{someObject 2}". See the dump method for
	 * details.
	 * </p>
	 * 
	 * @param s
	 *            The input string
	 * @param o
	 *            An object containing the replacement values.
	 * @return
	 */
	public native final String substitute(String s, JavaScriptObject o, SubstituteCallback c)/*-{
		var f = $entry(function(key, value, data) {
			return c.@org.sgx.yuigwt.yui.yui.SubstituteCallback::call(*)(key, value, data);
		});
		return this.substitute(s, o, c ? f : null);
	}-*/;

	/**
	 * Does {placeholder} substitution on a string. The object passed as the
	 * second parameter provides values to replace the {placeholder}s.
	 * {placeholder} token names must match property names of the object. For
	 * example
	 * 
	 * <pre>
	 * var greeting = Y.substitute("Hello, {who}!", { who: "World" });
	 * </pre>
	 * 
	 * <p>
	 * {placeholder} tokens that are undefined on the object mapJavaToJs will be
	 * left in tact (leaving unsightly "{placeholder}"s in the output string).
	 * If your replacement strings should include curly braces, use {LBRACE} and
	 * {RBRACE} in your object mapJavaToJs string value.
	 * </p>
	 * 
	 * <p>
	 * If a function is passed as a third argument, it will be called for each
	 * {placeholder} found. The {placeholder} name is passed as the first value
	 * and the value from the object mapJavaToJs is passed as the second. If the
	 * {placeholder} contains a space, the first token will be used to identify
	 * the object mapJavaToJs property and the remainder will be passed as a
	 * third argument to the function. See below for an example.
	 * </p>
	 * 
	 * <p>
	 * If the value in the object mapJavaToJs for a given {placeholder} is an
	 * object and the dump module is loaded, the replacement value will be the
	 * string result of calling Y.dump(...) with the object as input. Include a
	 * numeric second token in the {placeholder} to configure the depth of the
	 * call to Y.dump(...), e.g. "{someObject 2}". See the dump method for
	 * details.
	 * </p>
	 * 
	 * @param s
	 *            The input string
	 * @param o
	 *            An object containing the replacement values.
	 * 
	 * @param recurse
	 *            if true, the replacement will be recursive, letting you have
	 *            replacement tokens in replacement text. The default is false.
	 * @return
	 */
	public native final String substitute(String s, JavaScriptObject o, SubstituteCallback c, boolean recurse)/*-{
		var f = $entry(function(key, value, data) {
			return c.@org.sgx.yuigwt.yui.yui.SubstituteCallback::call(*)(key, value, data);
		});
		return this.substitute(s, o, c ? f : null, recurse);
	}-*/;

	/**
	 * Does {placeholder} substitution on a string. The object passed as the
	 * second parameter provides values to replace the {placeholder}s.
	 * {placeholder} token names must match property names of the object. For
	 * example
	 * 
	 * <pre>
	 * var greeting = Y.substitute("Hello, {who}!", { who: "World" });
	 * </pre>
	 * 
	 * <p>
	 * {placeholder} tokens that are undefined on the object mapJavaToJs will be
	 * left in tact (leaving unsightly "{placeholder}"s in the output string).
	 * If your replacement strings should include curly braces, use {LBRACE} and
	 * {RBRACE} in your object mapJavaToJs string value.
	 * </p>
	 * 
	 * <p>
	 * If a function is passed as a third argument, it will be called for each
	 * {placeholder} found. The {placeholder} name is passed as the first value
	 * and the value from the object mapJavaToJs is passed as the second. If the
	 * {placeholder} contains a space, the first token will be used to identify
	 * the object mapJavaToJs property and the remainder will be passed as a
	 * third argument to the function. See below for an example.
	 * </p>
	 * 
	 * <p>
	 * If the value in the object mapJavaToJs for a given {placeholder} is an
	 * object and the dump module is loaded, the replacement value will be the
	 * string result of calling Y.dump(...) with the object as input. Include a
	 * numeric second token in the {placeholder} to configure the depth of the
	 * call to Y.dump(...), e.g. "{someObject 2}". See the dump method for
	 * details.
	 * </p>
	 * 
	 * @param s
	 *            The input string
	 * @param o
	 *            An object containing the replacement values.
	 * 
	 * @param recurse
	 *            if true, the replacement will be recursive, letting you have
	 *            replacement tokens in replacement text. The default is false.
	 * @return
	 */
	public native final String substitute(String s, JavaScriptObject o, boolean recurse)/*-{
		return this.substitute(s, o, null, recurse);
	}-*/;
	
	/**
	 * 
	 * @param url
	 * @param c
	 * @param args
	 * @return
	 */
	public native final String jsonp(String url, JsFunction c, JsArrayMixed args)/*-{
		return this.jsonp(url, c, args);
	}-*/;
	
	/**
	 * 
	 * @param url
	 * @param c
	 * @param args
	 * @return
	 */
	public native final String jsonp(String url, AbstractCallback c, JsArrayMixed args)/*-{
		var fn = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/AbstractCallback;)(c); 
		return this.jsonp(url, fn, args);
	}-*/;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// YUI static classes

	/**
	 * return a YUI Plugin home - an object that returns many YUI plugins
	 * 
	 * @return
	 */
	public native final YuiPluginHome Plugin()/*-{
		return this.Plugin;
	}-*/;

	/**
	 * return the Escape Utility
	 * 
	 * @return
	 */
	public native final Escape Escape()/*-{
		return this.Escape;
	}-*/;

	/**
	 * return the Get Utility
	 * 
	 * @return
	 */
	public native final Get Get()/*-{
		return this.Get;
	}-*/;

	/**
	 * return the Get Utility
	 * 
	 * @return
	 */
	public native final YuiEvent Event()/*-{
		return this.Event;
	}-*/;
	
	
	public native final RouterClass Router()/*-{
		return this.Router;
	}-*/;
		

	/**
	 * return the StyleSheet Utility
	 * 
	 * @return
	 */
	public native final StyleSheetClass StyleSheet()/*-{
		return this.StyleSheet;
	}-*/;

	// drag & drop
	public native final Drag DDDrag()/*-{
		return this.DD.Drag;
	}-*/;

	public native final Drop DDDrop()/*-{
		return this.DD.Drop;
	}-*/;

	/**
	 * return the Widget static properties
	 * 
	 * @return
	 */
	public native final WidgetClass Widget()/*-{
		return this.Widget;
	}-*/;

	/**
	 * the Y.Global event target , described here
	 * http://yuilibrary.com/yui/docs/
	 * event-custom/#broadcasting-events-to-y-or-between-yui-instances
	 * 
	 * @return
	 */
	public native final EventTarget Global()/*-{
		return this.DD;
	}-*/;

	/**
	 * the Y.Lang static properties
	 * 
	 * @return
	 */
	public native final YuiLang Lang()/*-{
		return this.Lang;
	}-*/;

	/**
	 * the Y.UA
	 * 
	 * @return
	 */
	public native final UAClass UA()/*-{
		return this.UA;
	}-*/;

	/**
	 * overlay Y.Cookie
	 * 
	 * @return
	 */
	public native final CookieClass Cookie()/*-{
		return this.Cookie;
	}-*/;

	public native final EditorBaseClass EditorBase()/*-{
		return this.EditorBase;
	}-*/;

	// file upload - file
	public native final FileHTML5Class FileHTML5()/*-{
		return this.FileHTML5;
	}-*/;
	
	public native final DOM DOM()/*-{
		return this.DOM;
	}-*/;
	
	/**
	 * overlay Y.Node
	 * 
	 * @return
	 */
	public native final NodeClass Node()/*-{
		return this.Node;
	}-*/;

	public native final WidgetExtClass WidgetStdMod()/*-{
		return this.WidgetStdMod;
	}-*/;

	public native final WidgetExtClass WidgetPositionAlign()/*-{
		return this.WidgetPositionAlign;
	}-*/;

	/**
	 * overlay for static Y.DataSchema.Array properties
	 * 
	 * @return
	 */
	public native final DataSchemaClass DataSchemaArray()/*-{
		return this.DataSchema.Array;
	}-*/;

	/**
	 * overlay for static Y.DataSchema.Base properties
	 * 
	 * @return
	 */
	public native final DataSchemaClass DataSchemaBase()/*-{
		return this.DataSchema.Base;
	}-*/;

	/**
	 * overlay for static Y.DataSchema.JSON properties
	 * 
	 * @return
	 */
	public native final DataSchemaClass DataSchemaJSON()/*-{
		return this.DataSchema.JSON;
	}-*/;

	/**
	 * overlay for static Y.DataSchema.Text properties
	 * 
	 * @return
	 */
	public native final DataSchemaClass DataSchemaText()/*-{
		return this.DataSchema.Text;
	}-*/;

	/**
	 * overlay for static Y.DataSchema.XML properties
	 * 
	 * @return
	 */
	public native final DataSchemaClass DataSchemaXML()/*-{
		return this.DataSchema.XML;
	}-*/;

	public native final DataTypeNumber DataTypeNumber()/*-{
		return this.DataType.Number;
	}-*/;

	public native final DataTypeDate DataTypeDate()/*-{
		return this.DataType.Date;
	}-*/;

	public native final DataTypeXML DataTypeXML()/*-{
		return this.DataType.XML;
	}-*/;

	public native final AsyncQueueClass AsyncQueue()/*-{
		return this.AsyncQueue;
	}-*/;

	public native final IOClass io()/*-{
		return this.io;
	}-*/;

	public native final HistoryClass History()/*-{
		return this.History;
	}-*/;

	public native final HistoryHashClass HistoryHash()/*-{
		return this.HistoryHash;
	}-*/;

	public native final HistoryClass HistoryHTML5()/*-{
		return this.HistoryHTML5;
	}-*/;

	public native final ScrollViewClass ScrollViewClass()/*-{
		return this.ScrollViewClass;
	}-*/;

	public native final JSONClass JSON()/*-{
		return this.JSON;
	}-*/;

	public native final HandlebarsClass Handlebars()/*-{
		return this.Handlebars;
	}-*/;

	public native final DataSourceClass DataSource()/*-{
		return this.DataSource;
	}-*/;

	public native final org.sgx.yuigwt.yui.intl.Intl Intl()/*-{
		return this.Intl;
	}-*/;

	public native final TestAssert TestAssert()/*-{
		return this.Test.Assert;
	}-*/;

	public native final TestRunner TestRunner()/*-{
		return this.Test.Runner;
	}-*/;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// creators - TODO: should I subclass YuiContext for each module and dad
	// these to those subclasses and the user cast to them.

	public native final Graphic newGraphic(GraphicConfig cfg)/*-{
		return new this.Graphic(cfg);
	}-*/;

	public native final NodeList newNodeList(Node[] nodes)/*-{
		return new this.NodeList(
				@org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(nodes));
	}-*/;

	public native final Anim newAnim(AnimConfig config)/*-{
		var a = new this.Anim(config);
		return a;
	}-*/;

	 public native final Button newButton(ButtonConfig cfg)/*-{
	 return new this.Button(cfg);
	 }-*/;
	public native final Button newButton(JavaScriptObject cfg)/*-{
		return new this.Button(cfg);
	}-*/;
	public native final ToggleButton newToggleButton(JavaScriptObject cfg)/*-{
		return new this.ToggleButton(cfg);
	}-*/;
	public native final ToggleButton newToggleButton(ButtonConfig cfg)/*-{
		return new this.ToggleButton(cfg);
	}-*/;
	public native final Button newButton()/*-{
		return new this.Button();
	}-*/;

	public native final StyleSheet newStyleSheet(String seed, String name)/*-{
		return new this.StyleSheet(seed, name);
	}-*/;

	public native final StyleSheet newStyleSheet(Node seed, String name)/*-{
		return new this.StyleSheet(seed, name);
	}-*/;


	public native final StyleSheet newStyleSheet(Element seed, String name)/*-{
		return new this.StyleSheet(seed, name);
	}-*/;
	public native final StyleSheet newStyleSheet(String seed)/*-{
		return new this.StyleSheet(seed);
	}-*/;

	public native final StyleSheet newStyleSheet()/*-{
		return new this.StyleSheet();
	}-*/;
	
	public native final StyleSheet newStyleSheet(Node seed)/*-{
		return new this.StyleSheet(seed);
	}-*/;

	public native final StyleSheet newStyleSheet(Element seed)/*-{
		return new this.StyleSheet(seed);
	}-*/;

	public native final Console newConsole(JavaScriptObject cfg)/*-{
		return new this.Console(cfg);
	}-*/;

	public native final Console newConsole(ConsoleConfig cfg)/*-{
		return new this.Console(cfg);
	}-*/;

	public native final Console newConsole()/*-{
		return new this.Console();
	}-*/;

	public native final Slider newSlider(SliderConfig cfg)/*-{
		return new this.Slider(cfg);
	}-*/;

	public native final Slider newSlider(JavaScriptObject cfg)/*-{
		return new this.Slider(cfg);
	}-*/;

	public native final Slider newSlider()/*-{
		return new this.Slider();
	}-*/;

	public native final Panel newPanel(PanelConfig config)/*-{
		return new this.Panel(config);
	}-*/;

	public native final Panel newPanel(AttributeConfig config)/*-{
		return new this.Panel(config);
	}-*/;

	public native final TabView newTabView(TabViewConfig config)/*-{
		return new this.TabView(config);
	}-*/;

	public native final TabView newTabView(JavaScriptObject config)/*-{
		return new this.TabView(config);
	}-*/;

	public native final ArrayList newArrayList(JsArray<JavaScriptObject> arr)/*-{
		return new this.ArrayList(arr);
	}-*/;

	public native final ArrayList newArrayList()/*-{
		return this.ArrayList([]);
	}-*/;

	public native final Overlay newOverlay(OverlayConfig config)/*-{
		return new this.Overlay(config);
	}-*/;

	public native final Queue newQueue()/*-{
		return new this.Queue();
	}-*/;

	public native final DataTable newDataTable(DataTableConfig config)/*-{
		return new this.DataTable(config);
	}-*/;

	public native final DataTable newDataTable(JavaScriptObject config)/*-{
		return new this.DataTable(config);
	}-*/;

	public native final Pjax newPjax(PjaxConfig config)/*-{
		return new this.Pjax(config);
	}-*/;

//	/**
//	 * Use DragConfig for parameters, example: 
//	 * <pre>Drag dd = Y.newDDDrag(DragConfig.one("node", ".state-panel .tabs")); </pre> 
//	 * @param config - use DragConfig
//	 * @return
//	 */
	public native final Drag newDDDrag(DragConfig config)/*-{
		return new this.DD.Drag(config);
	}-*/;

	public native final Cache newCache(CacheConfig config)/*-{
		return new this.Cache(config);
	}-*/;

	public native final Cache newCache(JavaScriptObject config)/*-{
		return new this.Cache(config);
	}-*/;

	public native final CacheOffline newCacheOffline(CacheOfflineConfig config)/*-{
		return new this.CacheOffline(config);
	}-*/;

	public native final CacheOffline newCacheOffline(JavaScriptObject config)/*-{
		return new this.CacheOffline(config);
	}-*/;

	public native final ImgLoadGroup newImgLoadGroup(ImgLoadGroupConfig config)/*-{
		return new this.ImgLoadGroup(config);
	}-*/;

	public native final ImgLoadGroup newImgLoadGroup(JavaScriptObject config)/*-{
		return new this.ImgLoadGroup(config);
	}-*/;

	// calendar
	public native final Calendar newCalendar(CalendarConfig config)/*-{
		return new this.Calendar(config);
	}-*/;

	public native final Calendar newCalendar(JavaScriptObject config)/*-{
		return new this.Calendar(config);
	}-*/;

	// autocomplete
	public native final AutoComplete newAutoComplete(AutoCompleteConfig config)/*-{
		return new this.AutoComplete(config);
	}-*/;

	public native final AutoComplete newAutoComplete(JavaScriptObject config)/*-{
		return new this.AutoComplete(config);
	}-*/;

	public native final EditorBase newEditorBase(EditorBaseConfig config)/*-{
		return new this.EditorBase(config);
	}-*/;

	// AsyncQueue
	public native final AsyncQueue newAsyncQueue()/*-{
		return new this.AsyncQueue();
	}-*/;

	// public AsyncQueue newAsyncQueue(SimpleCallback[] c) {
	// AsyncQueue aq = newAsyncQueue();
	// for (int i = 0; i < c.length; i++) {
	// aq.add(c[i]);
	// }
	// return aq;
	// }
	// public AsyncQueue newAsyncQueue(AsyncQueueItem[] c) {
	// AsyncQueue aq = newAsyncQueue();
	// for (int i = 0; i < c.length; i++) {
	// aq.add(c[i]);
	// }
	// return aq;
	// }

	// IO
	public native final JavaScriptObject io(String uri, JavaScriptObject c)/*-{
		return this.io(uri, c || {
			"emitFacade" : true
		});
	}-*/;

	public native final JavaScriptObject io(String uri)/*-{
		return this.io(uri, {
			"emitFacade" : true
		});
	}-*/;

	public native final IO newIO(JavaScriptObject c)/*-{
		return new this.IO(c);
	}-*/;

	public native final IO newIO()/*-{
		return new this.IO({
			"emitFacade" : true
		});
	}-*/;

	// Hisotry
	public native final HistoryBase newHistory()/*-{
		return new this.History();
	}-*/;

	public native final HistoryBase newHistory(HistoryBaseConfig config)/*-{
		return new this.History(config);
	}-*/;

	public native final HistoryBase newHistoryHash()/*-{
		return new this.HistoryHash();
	}-*/;

	public native final HistoryBase newHistoryHash(HistoryBaseConfig config)/*-{
		return new this.HistoryHash(config);
	}-*/;

	public native final HistoryBase newHistoryHTML5()/*-{
		return new this.HistoryHTML5();
	}-*/;

	public native final HistoryBase newHistoryHTML5(HistoryBaseConfig config)/*-{
		return new this.HistoryHTML5(config);
	}-*/;

	public native final ScrollView newScrollView(ScrollViewConfig config)/*-{
		return new this.ScrollView(config);
	}-*/;

	public native final ScrollView newScrollView(JavaScriptObject config)/*-{
		return new this.ScrollView(config);
	}-*/;

	// ChartBase
	public native final ChartBase newChart(ChartBaseConfig config)/*-{
		return new this.Chart(config);
	}-*/;

	public native final ChartBase newChart(JavaScriptObject config)/*-{
		return new this.Chart(config);
	}-*/;

	public native final PieChart newPieChart(PieChartConfig config)/*-{
		return new this.Chart(config);
	}-*/;

	public native final PieChart newPieChart(JavaScriptObject config)/*-{
		return new this.Chart(config);
	}-*/;

	// Resize
//	/**
//	 * Please use config ResizeConfig, example: 
//	 * <pre>Resize r = Y.newResize(ResizeConfig.one("node", ".main-tools-panel")); </pre>
//	 * @param config Please use config ResizeConfig
//	 * @return
//	 */
	public native final Resize newResize(ResizeConfig config)/*-{
		return new this.Resize(config);
	}-*/;

	// YQL
	public native final YQL newYQL(String q)/*-{
		return new this.YQL(q);
	}-*/;

	public native final YQL newYQL(String q, YQLCallback c)/*-{
		var f = $entry(function(r) {
			return c.@org.sgx.yuigwt.yui.yql.YQLCallback::call(*)(r);
		});
		return new this.YQL(q, f);
	}-*/;

	public native final YQL newYQL(String q, YQLCallback c, YQLParams params, YQLOpts opts)/*-{
		var f = $entry(function(r) {
			return c.@org.sgx.yuigwt.yui.yql.YQLCallback::call(*)(r);
		});
		return new this.YQL(q, f, params, opts);
	}-*/;

	public native final YQL newYQL(String q, YQLCallback c, YQLParams params)/*-{
		var f = $entry(function(r) {
			return c.@org.sgx.yuigwt.yui.yql.YQLCallback::call(*)(r);
		});
		return new this.YQL(q, f, params);
	}-*/;

	// datasource
	/**
	 * <pre>
	 * var myDataSource = new Y.DataSource.Local({source:["a", "b", "c"]});
	 * </pre>
	 * 
	 * @param config
	 * @return
	 */
	public native final org.sgx.yuigwt.yui.datasource.DataSource newDataSourceLocal(DataSourceConfig config)/*-{
		return new this.DataSource.Local(config);
	}-*/;

	public native final org.sgx.yuigwt.yui.datasource.DataSource newDataSourceGet(DataSourceConfig config)/*-{
		return new this.DataSource.Get(config);
	}-*/;

	public native final org.sgx.yuigwt.yui.datasource.DataSource newDataSourceFunction(DataSourceConfig config)/*-{
		return new this.DataSource.Function(config);
	}-*/;

	public native final org.sgx.yuigwt.yui.datasource.DataSource newDataSourceIO(DataSourceConfig config)/*-{
		return new this.DataSource.IO(config);
	}-*/;

	public native final Sortable newSortable(SortableConfig config)/*-{
		return new this.Sortable(config);
	}-*/;

	public native final TestCase newTestCase(TestCaseConfig config)/*-{
		return new this.Test.Case(config);
	}-*/;

	public native final TestCase newTestCase(TestCaseJsClass config)/*-{
		config.@org.sgx.yuigwt.yui.test.TestCaseJsClass::setY(Lorg/sgx/yuigwt/yui/YuiContext;)(this);
		var jso = config.@org.sgx.yuigwt.yui.test.TestCaseJsClass::toJSO()();
		return new this.Test.Case(jso);
	}-*/;

	public native final TestSuite newTestSuite(String testSuiteName)/*-{
		return new this.Test.Suite(testSuiteName);
	}-*/;

	public native final org.sgx.yuigwt.yui.widget.Widget newWidget()/*-{
		return new this.Widget();
	}-*/;

	// dial

	public native final Dial newDial(DialConfig config)/*-{
		return new this.Dial(config);
	}-*/;

	
	
	
	// uploader
	public native final Uploader newUploader(JavaScriptObject config)/*-{
		return new this.Uploader(config);
	}-*/;

	public native final UploaderClass Uploader()/*-{
		return this.Uploader;
	}-*/;

	public native final UploaderHTML5 newUploaderHTML5(JavaScriptObject config)/*-{
		return new this.UploaderHTML5(config);
	}-*/;

	public native final UploaderHTML5 newUploader5(JavaScriptObject config)/*-{
		return new this.UploaderHTML5(config);
	}-*/;
	
	
	//router
	public native final org.sgx.yuigwt.yui.router.Router newRouter(RouterConfig config)/*-{
		return new this.Router(config);
	}-*/;
	public native final org.sgx.yuigwt.yui.router.Router newRouter(JavaScriptObject config)/*-{
		return new this.Router(config);
	}-*/;

}
