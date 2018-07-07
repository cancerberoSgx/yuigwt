package org.sgx.yuigwt.yui.widget.autocomplete;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.ext.WidgetExtConfig;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;

public class AutoCompleteConfig extends WidgetExtConfig {
protected AutoCompleteConfig(){}
public static final native AutoCompleteConfig create()/*-{
	return {}; 
}-*/;

/**
 * Whether or not to enable the browser's built-in autocomplete functionality for input fields. Default: false
 * @return
 */
public native final boolean allowBrowserAutocomplete() /*-{
return this.allowBrowserAutocomplete; 
}-*/;

/**
 * Whether or not to enable the browser's built-in autocomplete functionality for input fields. Default: false
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig allowBrowserAutocomplete(boolean val) /*-{
this.allowBrowserAutocomplete = val; 
return this; 
}-*/;

/**
 * When a queryDelimiter is set, trailing delimiters will automatically be stripped from the input value by default when the input node loses focus. Set this to true to allow trailing delimiters.Default: false
 * @return
 */
public native final boolean allowTrailingDelimiter() /*-{
return this.allowTrailingDelimiter; 
}-*/;

/**
 * When a queryDelimiter is set, trailing delimiters will automatically be stripped from the input value by default when the input node loses focus. Set this to true to allow trailing delimiters.Default: false
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig allowTrailingDelimiter(boolean val) /*-{
this.allowTrailingDelimiter = val; 
return this; 
}-*/;

/**
 * Whether or not to enable in-memory caching in result sources that support it. Default: true
 * @return
 */
public native final boolean enableCache() /*-{
return this.enableCache; 
}-*/;

/**
 * Whether or not to enable in-memory caching in result sources that support it. Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig enableCache(boolean val) /*-{
this.enableCache = val; 
return this; 
}-*/;

/**
 * Node to monitor for changes, which will generate query events when appropriate. May be either an <input> or a <textarea>.
 * @return
 */
public native final Node inputNode() /*-{
return this.inputNode; 
}-*/;

/**
 * Node to monitor for changes, which will generate query events when appropriate. May be either an <input> or a <textarea>.
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig inputNode(Node val) /*-{
this.inputNode = val; 
return this; 
}-*/;
/**
 * Node to monitor for changes, which will generate query events when appropriate. May be either an <input> or a <textarea>.
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig inputNode(String val) /*-{
this.inputNode = val; 
return this; 
}-*/;
/**
 * Node to monitor for changes, which will generate query events when appropriate. May be either an <input> or a <textarea>.
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig inputNode(Element val) /*-{
this.inputNode = val; 
return this; 
}-*/;

/**
 * Maximum number of results to return. A value of 0 or less will allow an unlimited number of results.Default: 0
 * @return
 */
public native final int maxResults() /*-{
return this.maxResults; 
}-*/;

/**
 * Maximum number of results to return. A value of 0 or less will allow an unlimited number of results.Default: 0
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig maxResults(int val) /*-{
this.maxResults = val; 
return this; 
}-*/;

/**
 * Minimum number of characters that must be entered before a query event will be fired. A value of 0 allows empty queries; a negative value will effectively disable all query events.Default: 1
 * @return
 */
public native final int minQueryLength() /*-{
return this.minQueryLength; 
}-*/;

/**
 * Minimum number of characters that must be entered before a query event will be fired. A value of 0 allows empty queries; a negative value will effectively disable all query events.Default: 1
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig minQueryLength(int val) /*-{
this.minQueryLength = val; 
return this; 
}-*/;

/**
 * Current query, or null if there is no current query. The query might not be the same as the current value of the input node, both for timing reasons (due to queryDelay) and because when one or more queryDelimiter separators are in use, only the last portion of the delimited input string will be used as the query value.Default: null
 * @return
 */
public native final String query() /*-{
return this.query; 
}-*/;

/**
 * Current query, or null if there is no current query. The query might not be the same as the current value of the input node, both for timing reasons (due to queryDelay) and because when one or more queryDelimiter separators are in use, only the last portion of the delimited input string will be used as the query value.Default: null
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig query(String val) /*-{
this.query = val; 
return this; 
}-*/;

/**
 * DataTypeNumber of milliseconds to delay after input before triggering a query event. If new input occurs before this delay is over, the previous input event will be ignored and a new delay will begin.This can be useful both to throttle queries to a remote data source and to avoid distracting the user by showing them less relevant results before they've paused their typing.Default: 100
 * @return
 */
public native final int queryDelay() /*-{
return this.queryDelay; 
}-*/;

/**
 * DataTypeNumber of milliseconds to delay after input before triggering a query event. If new input occurs before this delay is over, the previous input event will be ignored and a new delay will begin.This can be useful both to throttle queries to a remote data source and to avoid distracting the user by showing them less relevant results before they've paused their typing.Default: 100
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig queryDelay(int val) /*-{
this.queryDelay = val; 
return this; 
}-*/;

/**
 * Query delimiter string. When a delimiter is configured, the input value will be split on the delimiter, and only the last portion will be used in autocomplete queries and updated when the query attribute is modified.Default: null
 * @return
 */
public native final String queryDelimiter() /*-{
return this.queryDelimiter; 
}-*/;

/**
 * Query delimiter string. When a delimiter is configured, the input value will be split on the delimiter, and only the last portion will be used in autocomplete queries and updated when the query attribute is modified.Default: null
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig queryDelimiter(String val) /*-{
this.queryDelimiter = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String requestTemplate() /*-{
return this.requestTemplate; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig requestTemplate(String val) /*-{
this.requestTemplate = val; 
return this; 
}-*/;

//TODO requestTemplate passing a function

//, resultFormatter, resultHighlighter,, resultListLocator, resultTextLocator
/**
 * Function which will be used to highlight results. If provided, this function will be called with two arguments after results have been received and filtered: the query and an array of filtered result objects. The highlighter is expected to return an array of highlighted result text in the form of HTML strings.See the documentation for the results event for a list of the properties available on each result object.If no source is set, the highlighter will not be called.
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig resultHighlighter(String val) /*-{
this.resultHighlighter = val; 
return this; 
}-*/;
public native final AutoCompleteConfig resultFilters(String val) /*-{
this.resultFilters = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final JsArray results() /*-{
return this.results; 
}-*/;

/**
 * Source for autocomplete results.
 *    The full array will be provided to any configured filters for each query. This is an easy way to create a fully client-side autocomplete implementation.    Example: <pre>['first result', 'second result', 'etc']</pre>
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig source(JsArray val) /*-{
this.source = val; 
return this; 
}-*/;

/**
 * Source for autocomplete results.
 *    The full array will be provided to any configured filters for each query. This is an easy way to create a fully client-side autocomplete implementation.    Example: <pre>['first result', 'second result', 'etc']</pre>
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig source(String[] val) /*-{
this.source = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val); 
return this; 
}-*/;


/**
 * Source for autocomplete results.    An object will be treated as a query hashmap. If a property on the object matches the current query, the value of that property will be used as the response.    The response is assumed to be an array of results by default. If the response is not an array, provide a resultListLocator to process the response and return an array.
 * Example: <pre>{foo: ['foo result 1', 'foo result 2'], bar: ['bar result']}</pre>
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig source(JavaScriptObject val) /*-{
this.source = val; 
return this; 
}-*/;
/**
 * <b>String (JSONP URL)</b><br/><br/>
    If a URL with a {callback} placeholder is provided, it will be used to make a JSONP request. The {query} placeholder will be replaced with the current query, and the {callback} placeholder will be replaced with an internally-generated JSONP callback name. Both placeholders must appear in the URL, or the request will fail. An optional {maxResults} placeholder may also be provided, and will be replaced with the value of the maxResults attribute (or 1000 if the maxResults attribute is 0 or less).
<br/><br/>
    The response is assumed to be an array of results by default. If the response is not an array, provide a resultListLocator to process the response and return an array.
<br/><br/>
    The jsonp module must be loaded in order for JSONP URL sources to work. If the jsonp module is not already loaded, it will be loaded on demand if possible.
<br/><br/>
    Example: 'http://example.com/search?q={query}&callback={callback}'
String (XHR URL)
<br/><br/>
    If a URL without a {callback} placeholder is provided, it will be used to make a same-origin XHR request. The {query} placeholder will be replaced with the current query. An optional {maxResults} placeholder may also be provided, and will be replaced with the value of the maxResults attribute (or 1000 if the maxResults attribute is 0 or less).
<br/><br/>
    The response is assumed to be a JSON array of results by default. If the response is a JSON object and not an array, provide a resultListLocator to process the response and return an array. If the response is in some form other than JSON, you will need to use a custom DataSource instance as the source.
<br/><br/>
    The io-base and json-parse modules must be loaded in order for XHR URL sources to work. If these modules are not already loaded, they will be loaded on demand if possible.
<br/><br/>
    Example: 'http://example.com/search?q={query}'
<br/><br/>
<b>String (YQL query)</b>
<br/><br/>
    If a YQL query is provided, it will be used to make a YQL request. The {query} placeholder will be replaced with the current autocomplete query. This placeholder must appear in the YQL query, or the request will fail. An optional {maxResults} placeholder may also be provided, and will be replaced with the value of the maxResults attribute (or 1000 if the maxResults attribute is 0 or less).
<br/><br/>
    The yql module must be loaded in order for YQL sources to work. If the yql module is not already loaded, it will be loaded on demand if possible.
<br/><br/>
    Example: 'select * from search.suggest where query="{query}"'

@param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig source(String val) /*-{
this.source = val; 
return this; 
}-*/;

public native final AutoCompleteConfig source(Node val) /*-{
this.source = val; 
return this; 
}-*/;
//TODO: source function and datasource

/**
 * May be used to force a specific source type, overriding the automatic source type detection. It should almost never be necessary to do this, but as they taught us in the Boy Scouts, one should always be prepared, so it's here if you need it. Be warned that if you set this attribute and something breaks, it's your own fault. Supported sourceType values are: 'array', 'datasource', 'function', and 'object'.If the autocomplete-sources module is loaded, the following additional source types are supported: 'io', 'jsonp', 'select', 'string', 'yql'
 * @return
 */
public native final String sourceType() /*-{
return this.sourceType; 
}-*/;

/**
 * May be used to force a specific source type, overriding the automatic source type detection. It should almost never be necessary to do this, but as they taught us in the Boy Scouts, one should always be prepared, so it's here if you need it. Be warned that if you set this attribute and something breaks, it's your own fault. Supported sourceType values are: 'array', 'datasource', 'function', and 'object'.If the autocomplete-sources module is loaded, the following additional source types are supported: 'io', 'jsonp', 'select', 'string', 'yql'
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig sourceType(String val) /*-{
this.sourceType = val; 
return this; 
}-*/;

//TODO tokenInput

/**
 * Current value of the input node.
 * @return
 */
public native final String value() /*-{
return this.value; 
}-*/;

/**
 * Current value of the input node.
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig value(String val) /*-{
this.value = val; 
return this; 
}-*/;

/**
 * YQL environment file URL to load when the source is set to a YQL query. Set this to null to use the default Open Data Tables environment file (http://datatables.org/alltables.env).
 * @return
 */
public native final String yqlEnv() /*-{
return this.yqlEnv; 
}-*/;

/**
 * YQL environment file URL to load when the source is set to a YQL query. Set this to null to use the default Open Data Tables environment file (http://datatables.org/alltables.env).
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig yqlEnv(String val) /*-{
this.yqlEnv = val; 
return this; 
}-*/;

/**
 * URL protocol to use when the source is set to a YQL query.
 * @return
 */
public native final String yqlProtocol() /*-{
return this.yqlProtocol; 
}-*/;

/**
 * URL protocol to use when the source is set to a YQL query.	
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig yqlProtocol(String val) /*-{
this.yqlProtocol = val; 
return this; 
}-*/;





//NOW AutoCompleteList attributes
/**
 * 
 * @return
 */
public native final boolean activateFirstItem() /*-{
return this.activateFirstItem; 
}-*/;

/**
 * If true, the first item in the list will be activated by default when the list is initially displayed and when results change.Default: false
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig activateFirstItem(boolean val) /*-{
this.activateFirstItem = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final Node activeItem() /*-{
return this.activeItem; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig activeItem(Node val) /*-{
this.activeItem = val; 
return this; 
}-*/;

/**
 * If true, the list will remain visible even when there are no results to display.Default: false
 * @return
 */
public native final boolean alwaysShowList() /*-{
return this.alwaysShowList; 
}-*/;

/**
 * If true, the list will remain visible even when there are no results to display.Default: false

 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig alwaysShowList(boolean val) /*-{
this.alwaysShowList = val; 
return this; 
}-*/;

/**
 * If true, keyboard navigation will wrap around to the opposite end of the list when navigating past the first or last item.Default: true
 * @return
 */
public native final boolean circular() /*-{
return this.circular; 
}-*/;

/**
 * If true, keyboard navigation will wrap around to the opposite end of the list when navigating past the first or last item.Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig circular(boolean val) /*-{
this.circular = val; 
return this; 
}-*/;

/**
 * Item currently being hovered over by the mouse, if any.
 * @return
 */
public native final Node hoveredItem() /*-{
return this.hoveredItem; 
}-*/;

/**
 * Item currently being hovered over by the mouse, if any.
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig hoveredItem(Node val) /*-{
this.hoveredItem = val; 
return this; 
}-*/;

/**
 * Node that will contain result items.
 * @return
 */
public native final Node listNode() /*-{
return this.listNode; 
}-*/;

/**
 * Node that will contain result items.
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig listNode(Node val) /*-{
this.listNode = val; 
return this; 
}-*/;

/**
 * If true, the viewport will be scrolled to ensure that the active list item is visible when necessary.Default: false
 * @return
 */
public native final boolean scrollIntoView() /*-{
return this.scrollIntoView; 
}-*/;

/**
 * If true, the viewport will be scrolled to ensure that the active list item is visible when necessary.Default: false
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig scrollIntoView(boolean val) /*-{
this.scrollIntoView = val; 
return this; 
}-*/;

///**
// * Translatable strings used by the AutoCompleteList widge
// * @return
// */
//public native final JavaScriptObject strings() /*-{
//return this.strings; 
//}-*/;
//
///**
// * Translatable strings used by the AutoCompleteList widge
// * @param val
// * @return this - for setter chaining
// */
//public native final AutoCompleteConfig strings(JavaScriptObject val) /*-{
//this.strings = val; 
//return this; 
//}-*/;

/**
 * If true, pressing the tab key while the list is visible will select the active item, if any.Default: true
 * @return
 */
public native final boolean tabSelect() /*-{
return this.tabSelect; 
}-*/;

/**
 * If true, pressing the tab key while the list is visible will select the active item, if any.Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final AutoCompleteConfig tabSelect(boolean val) /*-{
this.tabSelect = val; 
return this; 
}-*/;
}
