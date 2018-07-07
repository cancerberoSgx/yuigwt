package org.sgx.yuigwt.yui.widget.autocomplete;

import java.util.Collection;

import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsFunction;
import org.sgx.yuigwt.yui.widget.ext.WidgetExt;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * this class overlays both AutoCompleteList and AutocompleteBase
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/AutoCompleteBase.html
 * @see http://yuilibrary.com/yui/docs/api/classes/AutoCompleteList.html
 * @author sg
 * 
 */
public class AutoComplete extends WidgetExt {
	protected AutoComplete() {
	}

	// event names
	/**
	 * Fires after the query has been completely cleared or no longer meets the minimum query length requirement.
	 */
	public static final String EVENT_CLEAR = "clear";
	/**
	 * Fires when the contents of the input field have changed and the input value meets the criteria necessary to generate an autocomplete query.
	 */
	public static final String EVENT_QUERY = "clear";

	/**
	 * Fires after query results are received from the source. If no source has been set, this event will not fire.
	 */
	public static final String EVENT_RESULTS = "results";

	/**
	 * The active list item (the item currently pre-selected via the keyboard) changes. When the user presses enter, this is the item that will become selected.
	 */
	public static final String EVENT_ACTIVEITEMCHANGE = "activeItemChange";

	/**
	 * A result is selected from the autocomplete list, typically via a keyboard action or a mouse click.
	 */
	public static final String EVENT_SELECT = "select";

	/**
	 * Highlights individual query characters that occur anywhere in the result, in any order (not necessarily consecutive).
	 */
	public static final String HIGHLIGHTER_CHARMATCH = "charMatch";

	/**
	 * Highlights the complete query as a phrase anywhere in the result.
	 */
	public static final String HIGHLIGHTER_PHRASEMATCH = "phraseMatch";

	/**
	 * Highlights the complete query as a phrase at the start of the result.
	 */
	public static final String HIGHLIGHTER_STARTSWITH = "startsWith";

	/**
	 * Highlights results in which all the words of the query match either whole words or parts of words in the result. Non-word characters like whitespace and certain punctuation
	 * are ignored.
	 */
	public static final String HIGHLIGHTER_SUBWORDMATCH = "subWordMatch";

	/**
	 * Highlights individual words in the result that are also in the query, in any order (not necessarily consecutive). Non-word characters like punctuation are ignored.
	 */
	public static final String HIGHLIGHTER_WORDMATCH = "wordMatch";

	/**
	 * Returns results that contain all of the individual characters in the query, in any order (not necessarily consecutive).
	 */
	public static final String FILTER_CHARMATCH = "charMatch";

	/**
	 * Returns results that contain the complete query as a phrase.
	 */
	public static final String FILTER_PHRASEMATCH = "phraseMatch";

	/**
	 * Returns results that start with the complete query as a phrase.
	 */
	public static final String FILTER_STARTSWITH = "startsWith";

	/**
	 * Returns results in which all the words of the query match either whole words or parts of words in the result. Non-word characters like whitespace and certain punctuation are
	 * ignored.
	 */
	public static final String FILTER_SUBWORDMATCH = "subWordMatch";

	/**
	 * Returns results that contain all the individual words in the query, in any order (not necessarily consecutive).
	 */
	public static final String FILTER_WORDMATCH = "wordMatch";

	/**
	 * Clears the result cache.
	 * 
	 * @return self for method chaining
	 */
	public native final AutoComplete clearCache() /*-{
		this.clearCache();
		return this;
	}-*/;

	// TODO: sendRequest

	// AutocompleteList methods

	/**
	 * Selects the specified itemNode, or the current activeItem if itemNode is not specified.
	 * 
	 * @param itemNode
	 *            Item node to select.
	 * @param originEvent
	 *            Event that triggered the selection, if any.
	 * @return self for method chaining
	 */
	public native final AutoComplete selectItem(Node itemNode, EventFacade originEvent) /*-{
		this.selectItem(itemNode, originEvent);
		return this;
	}-*/;

	/**
	 * Selects the specified itemNode, or the current activeItem if itemNode is not specified.
	 * 
	 * @param itemNode
	 *            Item node to select.
	 * @return self for method chaining
	 */
	public native final AutoComplete selectItem(Node itemNode) /*-{
		this.selectItem(itemNode);
		return this;
	}-*/;

	/**
	 * Selects the specified itemNode, or the current activeItem if itemNode is not specified.
	 * 
	 * @param itemNode
	 *            Item node to select.
	 * @return self for method chaining
	 */
	public native final AutoComplete selectItem() /*-{
		this.selectItem();
		return this;
	}-*/;

	// autocompletelist attributes

	/**
	 * If true, the first item in the list will be activated by default when the list is initially displayed and when results change.Default: false
	 * 
	 * @return the attribute
	 */
	public final native boolean activateFirstItem()/*-{
		return this.get("activateFirstItem");
	}-*/;

	/**
	 * If true, the first item in the list will be activated by default when the list is initially displayed and when results change.Default: false
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete activateFirstItem(boolean val)/*-{
		this.set("activateFirstItem", val);
		return this;
	}-*/;

	/**
	 * Item that's currently active, if any. When the user presses enter, this is the item that will be selected.
	 * 
	 * @return the attribute
	 */
	public final native Node activeItem()/*-{
		return this.get("activeItem");
	}-*/;

	/**
	 * Item that's currently active, if any. When the user presses enter, this is the item that will be selected.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete activeItem(Node val)/*-{
		this.set("activeItem", val);
		return this;
	}-*/;

	/**
	 * If true, the list will remain visible even when there are no results to display.Default: false
	 * 
	 * @return the attribute
	 */
	public final native boolean alwaysShowList()/*-{
		return this.get("alwaysShowList");
	}-*/;

	/**
	 * If true, the list will remain visible even when there are no results to display.Default: false
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete alwaysShowList(boolean val)/*-{
		this.set("alwaysShowList", val);
		return this;
	}-*/;

	/**
	 * If true, keyboard navigation will wrap around to the opposite end of the list when navigating past the first or last item.Default: true
	 * 
	 * @return the attribute
	 */
	public final native boolean circular()/*-{
		return this.get("circular");
	}-*/;

	/**
	 * If true, keyboard navigation will wrap around to the opposite end of the list when navigating past the first or last item.Default: true
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete circular(boolean val)/*-{
		this.set("circular", val);
		return this;
	}-*/;

	/**
	 * Item currently being hovered over by the mouse, if any.
	 * 
	 * @return the attribute
	 */
	public final native Node hoveredItem()/*-{
		return this.get("hoveredItem");
	}-*/;

	/**
	 * Item currently being hovered over by the mouse, if any.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete hoveredItem(Node val)/*-{
		this.set("hoveredItem", val);
		return this;
	}-*/;

	/**
	 * Node that will contain result items.
	 * 
	 * @return the attribute
	 */
	public final native Node listNode()/*-{
		return this.get("listNode");
	}-*/;

	/**
	 * Node that will contain result items.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete listNode(Node val)/*-{
		this.set("listNode", val);
		return this;
	}-*/;

	/**
	 * If true, the viewport will be scrolled to ensure that the active list item is visible when necessary. default: false
	 * 
	 * @return the attribute
	 */
	public final native boolean scrollIntoView()/*-{
		return this.get("scrollIntoView");
	}-*/;

	/**
	 * If true, the viewport will be scrolled to ensure that the active list item is visible when necessary. default: false
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete scrollIntoView(boolean val)/*-{
		this.set("scrollIntoView", val);
		return this;
	}-*/;

	/**
	 * If true, pressing the tab key while the list is visible will select the active item, if any.Default: true
	 * 
	 * @return the attribute
	 */
	public final native boolean tabSelect()/*-{
		return this.get("tabSelect");
	}-*/;

	/**
	 * If true, pressing the tab key while the list is visible will select the active item, if any.Default: true
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete tabSelect(boolean val)/*-{
		this.set("tabSelect", val);
		return this;
	}-*/;

	/**
	 * Whether or not to enable the browser's built-in autocomplete functionality for input fields.
	 * 
	 * @return the attribute
	 */
	public final native boolean allowBrowserAutocomplete()/*-{
		return this.get("allowBrowserAutocomplete");
	}-*/;

	/**
	 * Whether or not to enable the browser's built-in autocomplete functionality for input fields.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete allowBrowserAutocomplete(boolean val)/*-{
		this.set("allowBrowserAutocomplete", val);
		return this;
	}-*/;

	/**
	 * When a queryDelimiter is set, trailing delimiters will automatically be stripped from the input value by default when the input node loses focus. Set this to true to allow
	 * trailing delimiters.
	 * 
	 * @return the attribute
	 */
	public final native boolean allowTrailingDelimiter()/*-{
		return this.get("allowTrailingDelimiter");
	}-*/;

	/**
	 * When a queryDelimiter is set, trailing delimiters will automatically be stripped from the input value by default when the input node loses focus. Set this to true to allow
	 * trailing delimiters.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete allowTrailingDelimiter(boolean val)/*-{
		this.set("allowTrailingDelimiter", val);
		return this;
	}-*/;

	/**
	 * Whether or not to enable in-memory caching in result sources that support it.
	 * 
	 * @return the attribute
	 */
	public final native boolean enableCache()/*-{
		return this.get("enableCache");
	}-*/;

	/**
	 * Whether or not to enable in-memory caching in result sources that support it.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete enableCache(boolean val)/*-{
		this.set("enableCache", val);
		return this;
	}-*/;

	/**
	 * Node to monitor for changes, which will generate query events when appropriate. May be either an <input> or a <textarea>
	 * 
	 * @return the attribute
	 */
	public final native Node inputNode()/*-{
		return this.get("inputNode");
	}-*/;

	/**
	 * Node to monitor for changes, which will generate query events when appropriate. May be either an <input> or a <textarea>
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete inputNode(Node val)/*-{
		this.set("inputNode", val);
		return this;
	}-*/;

	/**
	 * Maximum number of results to return. A value of 0 or less will allow an unlimited number of results.
	 * 
	 * @return the attribute
	 */
	public final native int maxResults()/*-{
		return this.get("maxResults");
	}-*/;

	/**
	 * Maximum number of results to return. A value of 0 or less will allow an unlimited number of results.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete maxResults(int val)/*-{
		this.set("maxResults", val);
		return this;
	}-*/;

	/**
	 * Minimum number of characters that must be entered before a query event will be fired. A value of 0 allows empty queries; a negative value will effectively disable all query
	 * events.Default: 1
	 * 
	 * @return the attribute
	 */
	public final native int minQueryLength()/*-{
		return this.get("minQueryLength");
	}-*/;

	/**
	 * Minimum number of characters that must be entered before a query event will be fired. A value of 0 allows empty queries; a negative value will effectively disable all query
	 * events.Default: 1
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete minQueryLength(int val)/*-{
		this.set("minQueryLength", val);
		return this;
	}-*/;

	/**
	 * Current query, or null if there is no current query.The query might not be the same as the current value of the input node, both for timing reasons (due to queryDelay) and
	 * because when one or more queryDelimiter separators are in use, only the last portion of the delimited input string will be used as the query value.Default: null
	 * 
	 * @return the attribute
	 */
	public final native String query()/*-{
		return this.get("query");
	}-*/;

	/**
	 * Current query, or null if there is no current query.The query might not be the same as the current value of the input node, both for timing reasons (due to queryDelay) and
	 * because when one or more queryDelimiter separators are in use, only the last portion of the delimited input string will be used as the query value.Default: null
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete query(String val)/*-{
		this.set("query", val);
		return this;
	}-*/;

	/**
	 * DataTypeNumber of milliseconds to delay after input before triggering a query event. If new input occurs before this delay is over, the previous input event will be ignored
	 * and a new delay will begin.This can be useful both to throttle queries to a remote data source and to avoid distracting the user by showing them less relevant results before
	 * they've paused their typing.Default: 100
	 * 
	 * @return the attribute
	 */
	public final native int queryDelay()/*-{
		return this.get("queryDelay");
	}-*/;

	/**
	 * DataTypeNumber of milliseconds to delay after input before triggering a query event. If new input occurs before this delay is over, the previous input event will be ignored
	 * and a new delay will begin.This can be useful both to throttle queries to a remote data source and to avoid distracting the user by showing them less relevant results before
	 * they've paused their typing.Default: 100
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete queryDelay(int val)/*-{
		this.set("queryDelay", val);
		return this;
	}-*/;

	/**
	 * Query delimiter string. When a delimiter is configured, the input value will be split on the delimiter, and only the last portion will be used in autocomplete queries and
	 * updated when the query attribute is modified.
	 * 
	 * @return the attribute
	 */
	public final native String queryDelimiter()/*-{
		return this.get("queryDelimiter");
	}-*/;

	/**
	 * Query delimiter string. When a delimiter is configured, the input value will be split on the delimiter, and only the last portion will be used in autocomplete queries and
	 * updated when the query attribute is modified.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete queryDelimiter(String val)/*-{
		this.set("queryDelimiter", val);
		return this;
	}-*/;

	/**
	 * Source request template. This can be a function that accepts a query as a parameter and returns a request string, or it can be a string containing the placeholder "{query}",
	 * which will be replaced with the actual URI-encoded query. In either case, the resulting string will be appended to the request URL when the source attribute is set to a
	 * remote DataSource, JSONP URL, or XHR URL (it will not be appended to YQL URLs).While requestTemplate may be set to either a function or a string, it will always be returned
	 * as a function that accepts a query argument and returns a string. Default: null
	 * 
	 * @param val
	 * @return
	 */
	public final native AutoComplete requestTemplate(String val)/*-{
		this.set("requestTemplate", val);
		return this;
	}-*/;

	// TODO: resultFilter, tokenInput, requestTemplate(function), resultFormatter, resultHighlighter, resultListLocator, resultTextLocator, source

	public final native JsArray<AutoCompleteResult> results()/*-{
		return this.get("results");
	}-*/;

	/**
	 * May be used to force a specific source type, overriding the automatic source type detection. It should almost never be necessary to do this, but as they taught us in the Boy
	 * Scouts, one should always be prepared, so it's here if you need it. Be warned that if you set this attribute and something breaks, it's your own fault.Supported sourceType
	 * values are: 'array', 'datasource', 'function', and 'object'.If the autocomplete-sources module is loaded, the following additional source types are supported: 'io', 'jsonp',
	 * 'select', 'string', 'yql'
	 * 
	 * @return the attribute
	 */
	public final native String sourceType()/*-{
		return this.get("sourceType");
	}-*/;

	/**
	 * May be used to force a specific source type, overriding the automatic source type detection. It should almost never be necessary to do this, but as they taught us in the Boy
	 * Scouts, one should always be prepared, so it's here if you need it. Be warned that if you set this attribute and something breaks, it's your own fault.Supported sourceType
	 * values are: 'array', 'datasource', 'function', and 'object'.If the autocomplete-sources module is loaded, the following additional source types are supported: 'io', 'jsonp',
	 * 'select', 'string', 'yql'
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete sourceType(String val)/*-{
		this.set("sourceType", val);
		return this;
	}-*/;

	/**
	 * Current value of the input node.
	 * 
	 * @return the attribute
	 */
	public final native String value()/*-{
		return this.get("value");
	}-*/;

	/**
	 * Current value of the input node.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete value(String val)/*-{
		this.set("value", val);
		return this;
	}-*/;

	/**
	 * YQL environment file URL to load when the source is set to a YQL query. Set this to null to use the default Open Data Tables environment file
	 * (http://datatables.org/alltables.env)
	 * 
	 * @return the attribute
	 */
	public final native String yqlEnv()/*-{
		return this.get("yqlEnv");
	}-*/;

	/**
	 * YQL environment file URL to load when the source is set to a YQL query. Set this to null to use the default Open Data Tables environment file
	 * (http://datatables.org/alltables.env)
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete yqlEnv(String val)/*-{
		this.set("yqlEnv", val);
		return this;
	}-*/;

	/**
	 * URL protocol to use when the source is set to a YQL query. Default: 'http'
	 * 
	 * @return the attribute
	 */
	public final native String yqlProtocol()/*-{
		return this.get("yqlProtocol");
	}-*/;

	/**
	 * URL protocol to use when the source is set to a YQL query. Default: 'http'
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native AutoComplete yqlProtocol(String val)/*-{
		this.set("yqlProtocol", val);
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final JsArray source() /*-{
		return this.get("source");
	}-*/;

	/**
	 * Source for autocomplete results. An object will be treated as a query hashmap. If a property on the object matches the current query, the value of that property will be used
	 * as the response. The response is assumed to be an array of results by default. If the response is not an array, provide a resultListLocator to process the response and
	 * return an array. Example:
	 * 
	 * <pre>
	 * {foo: ['foo result 1', 'foo result 2'], bar: ['bar result']}
	 * </pre>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AutoComplete source(JsArray val) /*-{
		this.set("source", val);
		return this;
	}-*/;

	/**
	 * Source for autocomplete results. An object will be treated as a query hashmap. If a property on the object matches the current query, the value of that property will be used
	 * as the response. The response is assumed to be an array of results by default. If the response is not an array, provide a resultListLocator to process the response and
	 * return an array. Example:
	 * 
	 * <pre>
	 * {foo: ['foo result 1', 'foo result 2'], bar: ['bar result']}
	 * </pre>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AutoComplete source(Collection<String> val) /*-{
		this
				.set("source",
						@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString(Ljava/util/Collection;)(val));
		return this;
	}-*/;

	/**
	 * Source for autocomplete results. An object will be treated as a query hashmap. If a property on the object matches the current query, the value of that property will be used
	 * as the response. The response is assumed to be an array of results by default. If the response is not an array, provide a resultListLocator to process the response and
	 * return an array. Example:
	 * 
	 * <pre>
	 * {foo: ['foo result 1', 'foo result 2'], bar: ['bar result']}
	 * </pre>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AutoComplete source(JavaScriptObject val) /*-{
		this.set("source", val);
		return this;
	}-*/;

	/**
	 * Source for autocomplete results. The full array will be provided to any configured filters for each query. This is an easy way to create a fully client-side autocomplete
	 * implementation. Example:
	 * 
	 * <pre>
	 * ['first result', 'second result', 'etc']
	 * </pre>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AutoComplete source(String[] val) /*-{
		this
				.set("source",
						@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val));
		return this;
	}-*/;

	/**
	 * <b>String (JSONP URL)</b><br/>
	 * <br/>
	 * If a URL with a {callback} placeholder is provided, it will be used to make a JSONP request. The {query} placeholder will be replaced with the current query, and the
	 * {callback} placeholder will be replaced with an internally-generated JSONP callback name. Both placeholders must appear in the URL, or the request will fail. An optional
	 * {maxResults} placeholder may also be provided, and will be replaced with the value of the maxResults attribute (or 1000 if the maxResults attribute is 0 or less). <br/>
	 * <br/>
	 * The response is assumed to be an array of results by default. If the response is not an array, provide a resultListLocator to process the response and return an array. <br/>
	 * <br/>
	 * The jsonp module must be loaded in order for JSONP URL sources to work. If the jsonp module is not already loaded, it will be loaded on demand if possible. <br/>
	 * <br/>
	 * Example: 'http://example.com/search?q={query}&callback={callback}' String (XHR URL) <br/>
	 * <br/>
	 * If a URL without a {callback} placeholder is provided, it will be used to make a same-origin XHR request. The {query} placeholder will be replaced with the current query. An
	 * optional {maxResults} placeholder may also be provided, and will be replaced with the value of the maxResults attribute (or 1000 if the maxResults attribute is 0 or less). <br/>
	 * <br/>
	 * The response is assumed to be a JSON array of results by default. If the response is a JSON object and not an array, provide a resultListLocator to process the response and
	 * return an array. If the response is in some form other than JSON, you will need to use a custom DataSource instance as the source. <br/>
	 * <br/>
	 * The io-base and json-parse modules must be loaded in order for XHR URL sources to work. If these modules are not already loaded, they will be loaded on demand if possible. <br/>
	 * <br/>
	 * Example: 'http://example.com/search?q={query}' <br/>
	 * <br/>
	 * <b>String (YQL query)</b> <br/>
	 * <br/>
	 * If a YQL query is provided, it will be used to make a YQL request. The {query} placeholder will be replaced with the current autocomplete query. This placeholder must appear
	 * in the YQL query, or the request will fail. An optional {maxResults} placeholder may also be provided, and will be replaced with the value of the maxResults attribute (or
	 * 1000 if the maxResults attribute is 0 or less). <br/>
	 * <br/>
	 * The yql module must be loaded in order for YQL sources to work. If the yql module is not already loaded, it will be loaded on demand if possible. <br/>
	 * <br/>
	 * Example: 'select * from search.suggest where query="{query}"'
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AutoComplete source(String val) /*-{
		this.set("source", val);
		return this;
	}-*/;

	/**
	 * 
	 <p>
	 * Locator that should be used to extract a plain text string from a non-string result item. The resulting text value will typically be the value that ends up being inserted
	 * into an input field or textarea when the user of an autocomplete implementation selects a result.
	 * </p>
	 * 
	 * <p>
	 * By default, no locator is applied, and all results are assumed to be plain text strings. If all results are already plain text strings, you don't need to define a locator.
	 * </p>
	 * 
	 * <p>
	 * The locator may be either a function (which will receive the raw result as an argument and must return a string) or a string representing an object path, such as
	 * "foo.bar.baz" (which would return the value of result.foo.bar.baz if the result is an object).
	 * </p>
	 * 
	 * <p>
	 * While resultTextLocator may be set to either a function or a string, it will always be returned as a function that accepts a result argument and returns a string.
	 * </p>
	 * 
	 * @return
	 */
	public native final String resultTextLocatorString() /*-{
		return this.get("resultTextLocator");
	}-*/;

	/**
	 * 
	 <p>
	 * Locator that should be used to extract a plain text string from a non-string result item. The resulting text value will typically be the value that ends up being inserted
	 * into an input field or textarea when the user of an autocomplete implementation selects a result.
	 * </p>
	 * 
	 * <p>
	 * By default, no locator is applied, and all results are assumed to be plain text strings. If all results are already plain text strings, you don't need to define a locator.
	 * </p>
	 * 
	 * <p>
	 * The locator may be either a function (which will receive the raw result as an argument and must return a string) or a string representing an object path, such as
	 * "foo.bar.baz" (which would return the value of result.foo.bar.baz if the result is an object).
	 * </p>
	 * 
	 * <p>
	 * While resultTextLocator may be set to either a function or a string, it will always be returned as a function that accepts a result argument and returns a string.
	 * </p>
	 * 
	 * @return
	 */
	public native final JsFunction resultTextLocatorFn() /*-{
		return this.get("resultTextLocator");
	}-*/;

	/**
	 * 
	 <p>
	 * Locator that should be used to extract a plain text string from a non-string result item. The resulting text value will typically be the value that ends up being inserted
	 * into an input field or textarea when the user of an autocomplete implementation selects a result.
	 * </p>
	 * 
	 * <p>
	 * By default, no locator is applied, and all results are assumed to be plain text strings. If all results are already plain text strings, you don't need to define a locator.
	 * </p>
	 * 
	 * <p>
	 * The locator may be either a function (which will receive the raw result as an argument and must return a string) or a string representing an object path, such as
	 * "foo.bar.baz" (which would return the value of result.foo.bar.baz if the result is an object).
	 * </p>
	 * 
	 * <p>
	 * While resultTextLocator may be set to either a function or a string, it will always be returned as a function that accepts a result argument and returns a string.
	 * </p>
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final AutoComplete resultTextLocator(String val) /*-{
		this.set("resultTextLocator", val);
		return this;
	}-*/;

	/**
	 * 
	 <p>
	 * Locator that should be used to extract a plain text string from a non-string result item. The resulting text value will typically be the value that ends up being inserted
	 * into an input field or textarea when the user of an autocomplete implementation selects a result.
	 * </p>
	 * 
	 * <p>
	 * By default, no locator is applied, and all results are assumed to be plain text strings. If all results are already plain text strings, you don't need to define a locator.
	 * </p>
	 * 
	 * <p>
	 * The locator may be either a function (which will receive the raw result as an argument and must return a string) or a string representing an object path, such as
	 * "foo.bar.baz" (which would return the value of result.foo.bar.baz if the result is an object).
	 * </p>
	 * 
	 * <p>
	 * While resultTextLocator may be set to either a function or a string, it will always be returned as a function that accepts a result argument and returns a string.
	 * </p>
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final AutoComplete resultTextLocator(JsFunction val) /*-{
		this.set("resultTextLocator", val);
		return this;
	}-*/;
	
/**
 * <p>Function which will be used to highlight results. If provided, this function will be called with two arguments after results have been received and filtered: the query and an array of filtered result objects. The highlighter is expected to return an array of highlighted result text in the form of HTML strings.</p>

<p>See the documentation for the results event for a list of the properties available on each result object.</p>

<p>If no source is set, the highlighter will not be called.</p>

 * @return
 */
public native final JsFunction resultHighlighter() /*-{
return this.get("resultHighlighter"); 
}-*/;

/**
 * 
<p>Function which will be used to highlight results. If provided, this function will be called with two arguments after results have been received and filtered: the query and an array of filtered result objects. The highlighter is expected to return an array of highlighted result text in the form of HTML strings.</p>

<p>See the documentation for the results event for a list of the properties available on each result object.</p>

<p>If no source is set, the highlighter will not be called.</p>

 * @param val
 * @return this - for method chaining
 */
public native final AutoComplete resultHighlighter(JsFunction val) /*-{
this.set("resultHighlighter", val); 
return this; 
}-*/;

/**
 * 

<p>Locator that should be used to extract an array of results from a non-array response.</p>

<p>By default, no locator is applied, and all responses are assumed to be arrays by default. If all responses are already arrays, you don't need to define a locator.</p>

<p>The locator may be either a function (which will receive the raw response as an argument and must return an array) or a string representing an object path, such as "foo.bar.baz" (which would return the value of result.foo.bar.baz if the response is an object).</p>

<p>While resultListLocator may be set to either a function or a string, it will always be returned as a function that accepts a response argument and returns an array.</p>

 * @return
 */
public native final String resultListLocatorString() /*-{
return this.get("resultListLocator"); 
}-*/;

/**
 * <p>Locator that should be used to extract an array of results from a non-array response.</p>

<p>By default, no locator is applied, and all responses are assumed to be arrays by default. If all responses are already arrays, you don't need to define a locator.</p>

<p>The locator may be either a function (which will receive the raw response as an argument and must return an array) or a string representing an object path, such as "foo.bar.baz" (which would return the value of result.foo.bar.baz if the response is an object).</p>

<p>While resultListLocator may be set to either a function or a string, it will always be returned as a function that accepts a response argument and returns an array.</p>

 * @param val
 * @return this - for method chaining
 */
public native final AutoComplete resultListLocator(String val) /*-{
this.set("resultListLocator", val); 
return this; 
}-*/;
}
