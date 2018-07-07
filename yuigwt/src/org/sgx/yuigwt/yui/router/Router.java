package org.sgx.yuigwt.yui.router;

import org.sgx.yuigwt.yui.base.Base;

import com.google.gwt.core.client.JsArray;

/**
 * Provides URL-based routing using HTML5 pushState() or the location hash.This makes it easy to wire up route handlers for different application states while providing full
 * back/forward navigation support and bookmarkable, shareable URLs.
 * 
 * @see http://yuilibrary.com/yui/docs/router/#to-dispatch-or-not-to-dispatch
 * @see http://yuilibrary.com/yui/docs/api/classes/Router.html
 * @author sg
 * 
 */
public class Router extends Base {
	protected Router() {
	}

	/**
	 * Dispatches to the first route handler that matches the specified path for all active router instances. This provides a mechanism to cause all active router instances to
	 * dispatch to their route handlers without needing to change the URL or fire the history:change or hashchange event.
	 * 
	 * @return self for method chaining
	 */
	public native final Router dispatch() /*-{
		this.dispatch();
		return this;
	}-*/;

	/**
	 * Gets the current route path, relative to the root (if any).
	 * 
	 * @return Current route path.
	 */
	public native final String getPath() /*-{
		return this.getPath();
	}-*/;

	/**
	 * Returns true if this router has at least one route that matches the specified URL, false otherwise.This method enforces the same-origin security constraint on the specified
	 * url; any URL which is not from the same origin as the current URL will always return false.
	 * 
	 * @param url
	 *            URL to match.
	 * @return true if there's at least one matching route, false otherwise.
	 */
	public native final boolean hasRoute(String url) /*-{
		return this.hasRoute(url);
	}-*/;

	/**
	 * Returns an array of route objects that match the specified URL path.
	 * 
	 * This method is called internally to determine which routes match the current path whenever the URL changes. You may override it if you want to customize the route matching
	 * logic, although this usually shouldn't be necessary. Example:
	 * 
	 * <pre>
	 * router.route('/foo', function () {});
	 * router.match('/foo');
	 * // => [{callback: ..., keys: [], path: '/foo', regex: ...}]
	 * </pre>
	 * 
	 * @param path
	 *            URL path to match.
	 * @return Array of route objects that match the specified path.
	 */
	public native final JsArray<Route> match(String path)/*-{
		return this.match(path);
	}-*/;

	/**
	 * Removes a query string from the end of the url (if one exists) and returns the result.
	 * 
	 * @param url
	 * @return Queryless path.
	 */
	public native final String removeQuery(String url)/*-{
		return this.removeQuery(path);
	}-*/;

	/**
	 * Removes the root URL from the front of url (if it's there) and returns the result. The returned path will always have a leading /.
	 * 
	 * @param url
	 * @return Rootless path.
	 */
	public native final String removeRoot(String url)/*-{
		return this.removeRoot(path);
	}-*/;

	/**
	 * <p>
	 * Replaces the current browser history entry with a new one, and dispatches to the first matching route handler, if any.
	 * </p>
	 * 
	 * <p>
	 * Behind the scenes, this method uses HTML5 pushState() in browsers that support it (or the location hash in older browsers and IE) to change the URL.
	 * </p>
	 * 
	 * <p>
	 * The specified URL must share the same origin (i.e., protocol, host, and port) as the current page, or an error will occur.
	 * </p>
	 * 
	 * Example
	 * 
	 * <pre>
	 * // Starting URL: http://example.com/
	 * 
	 * router.replace('/path/');
	 * // New URL: http://example.com/path/
	 * 
	 * router.replace('/path?foo=bar');
	 * // New URL: http://example.com/path?foo=bar
	 * 
	 * router.replace('/');
	 * // New URL: http://example.com/
	 * </pre>
	 * 
	 * @param url
	 *            URL to set. This URL needs to be of the same origin as the current URL. This can be a URL relative to the router's root attribute. If no URL is specified, the
	 *            page's current URL will be used.
	 */
	public native final void replace(String url)/*-{
		this.replace(url);
	}-*/;

	/**
	 * <p>
	 * Replaces the current browser history entry with a new one, and dispatches to the first matching route handler, if any.
	 * </p>
	 * 
	 * <p>
	 * Behind the scenes, this method uses HTML5 pushState() in browsers that support it (or the location hash in older browsers and IE) to change the URL.
	 * </p>
	 * 
	 * <p>
	 * The specified URL must share the same origin (i.e., protocol, host, and port) as the current page, or an error will occur.
	 * </p>
	 * 
	 * Example
	 * 
	 * <pre>
	 * // Starting URL: http://example.com/
	 * 
	 * router.replace('/path/');
	 * // New URL: http://example.com/path/
	 * 
	 * router.replace('/path?foo=bar');
	 * // New URL: http://example.com/path?foo=bar
	 * 
	 * router.replace('/');
	 * // New URL: http://example.com/
	 * </pre>
	 * 
	 * 
	 */
	public native final void replace()/*-{
		this.replace();
	}-*/;

	/**
	 * Adds a route handler for the specified URL <em>path</em>.</p>
	 * 
	 * <p>
	 * The <em>path</em> parameter may be either a string or a regular expression. If it's a string, it may contain named parameters: <code>:param</code> will match any single part
	 * of a URL path (not including <code>/</code> characters), and <code>*param</code> will match any number of parts of a URL path (including <code>/</code> characters). These
	 * named parameters will be made available as keys on the <code>req.params</code> object that's passed to route handlers.
	 * </p>
	 * 
	 * <p>
	 * If the <em>path</em> parameter is a regex, all pattern matches will be made available as numbered keys on <code>req.params</code>, starting with <code>0</code> for the full
	 * match, then <code>1</code> for the first subpattern match, and so on.
	 * </p>
	 * 
	 * <p>
	 * Here's a set of sample routes along with URL paths that they match:
	 * </p>
	 * 
	 * <ul>
	 * <li>
	 * <p>
	 * Route: <code>/photos/:tag/:page</code>
	 * </p>
	 * 
	 * <ul>
	 * <li>URL: <code>/photos/kittens/1</code>, params: <code>{tag: 'kittens', page: '1'}</code></li>
	 * <li>URL: <code>/photos/puppies/2</code>, params: <code>{tag: 'puppies', page: '2'}</code></li>
	 * </ul>
	 * </li>
	 * <li>
	 * <p>
	 * Route: <code>/file/*path</code>
	 * </p>
	 * 
	 * <ul>
	 * <li>URL: <code>/file/foo/bar/baz.txt</code>, params: <code>{path: 'foo/bar/baz.txt'}</code></li>
	 * <li>URL: <code>/file/foo</code>, params: <code>{path: 'foo'}</code></li>
	 * </ul>
	 * </li>
	 * </ul>
	 * 
	 * <p>
	 * <strong>Middleware</strong>: Routes also support an arbitrary number of callback functions. This allows you to easily reuse parts of your route-handling code with different
	 * route. This method is liberal in how it processes the specified <code>callbacks</code>, you can specify them as separate arguments, or as arrays, or both.
	 * </p>
	 * 
	 * <p>
	 * If multiple route match a given URL, they will be executed in the order they were added. The first route that was added will be the first to be executed.
	 * </p>
	 * 
	 * <p id="yui_3_7_3_1_1354373805711_145">
	 * <strong>Passing Control</strong>: Invoking the <code>next()</code> function within a route callback will pass control to the next callback function (if any) or route handler
	 * (if any). If a value is passed to <code>next()</code>, it's assumed to be an error, therefore stopping the dispatch chain, unless that value is: <code>"route"</code>, which
	 * is special case and dispatching will skip to the next route handler. This allows middleware to skip any remaining middleware for a particular route.
	 * </p>
	 * 
	 * 
	 * <p>
	 * <b>Middleware</b>: Routes also support an arbitrary number of callback functions. This allows you to easily reuse parts of your route-handling code with different route.
	 * This method is liberal in how it processes the specified callbacks, you can specify them as separate arguments, or as arrays, or both.
	 * </p>
	 * 
	 * <p>
	 * If multiple route match a given URL, they will be executed in the order they were added. The first route that was added will be the first to be executed.
	 * </p>
	 * 
	 * <p>
	 * <b>Passing Control</b>: Invoking the next() function within a route callback will pass control to the next callback function (if any) or route handler (if any). If a value
	 * is passed to next(), it's assumed to be an error, therefore stopping the dispatch chain, unless that value is: "route", which is special case and dispatching will skip to
	 * the next route handler. This allows middleware to skip any remaining middleware for a particular route.
	 * </p>
	 * 
	 * Example:
	 * 
	 * <pre>
	 * router.route('/photos/:tag/:page', function (req, res, next) {
	 *   Y.log('Current tag: ' + req.params.tag);
	 *   Y.log('Current page number: ' + req.params.page);
	 * });
	 * 
	 * // Using middleware.
	 * 
	 * 	 <p>	 * router.findUser = function (req, res, next) {
	 *     req.user = this.get('users').findById(req.params.user);
	 *     next();
	 * };
	 * 
	 * router.route('/users/:user', 'findUser', function (req, res, next) {
	 *     // The findUser middleware puts the user object on the req.
	 *     Y.log('Current user:' req.user.get('name'));
	 * });
	 * </pre>
	 * 
	 * 
	 * 
	 * @param path
	 * @param callback
	 */
	public native final void route(String path, RouteCallback callback)/*-{
		var f = $entry(function(req, res, next) {
			return callback.@org.sgx.yuigwt.yui.router.RouteCallback::call(Lorg/sgx/yuigwt/yui/router/RouteRequest;Lorg/sgx/yuigwt/yui/router/RouteResponse;Lorg/sgx/yuigwt/yui/util/SimpleCallback;)(req, res, null);
		});
		this.route(path, f);
	}-*/;

	// TODO: route(path, RouteCallback[]callback)

	/**
	 * 
	 <p>
	 * Saves a new browser history entry and dispatches to the first matching route handler, if any.
	 * </p>
	 * 
	 * <p>
	 * Behind the scenes, this method uses HTML5 pushState() in browsers that support it (or the location hash in older browsers and IE) to change the URL and create a history
	 * entry.
	 * </p>
	 * 
	 * The specified URL must share the same origin (i.e., protocol, host, and port) as the current page, or an error will occur.</p> Example:
	 * 
	 * <pre>
	 * // Starting URL: http://example.com/
	 * 
	 * router.save('/path/');
	 * // New URL: http://example.com/path/
	 * 
	 * router.save('/path?foo=bar');
	 * // New URL: http://example.com/path?foo=bar
	 * 
	 * router.save('/');
	 * // New URL: http://example.com/
	 * </pre>
	 * 
	 * @param url
	 *            URL to set. This URL needs to be of the same origin as the current URL. This can be a URL relative to the router's root attribute. If no URL is specified, the
	 *            page's current URL will be used.
	 */
	public native final Router save(String url)/*-{
		this.save(url);
		return this;
	}-*/;

	/**
	 * <p>
	 * Saves a new browser history entry and dispatches to the first matching route handler, if any.
	 * </p>
	 * 
	 * <p>
	 * Behind the scenes, this method uses HTML5 pushState() in browsers that support it (or the location hash in older browsers and IE) to change the URL and create a history
	 * entry.
	 * </p>
	 * 
	 * The specified URL must share the same origin (i.e., protocol, host, and port) as the current page, or an error will occur.</p> Example:
	 * 
	 * <pre>
	 * // Starting URL: http://example.com/
	 * 
	 * router.save('/path/');
	 * // New URL: http://example.com/path/
	 * 
	 * router.save('/path?foo=bar');
	 * // New URL: http://example.com/path?foo=bar
	 * 
	 * router.save('/');
	 * // New URL: http://example.com/
	 * </pre>
	 * 
	 */
	public native final Router save()/*-{
		this.save();
		return this;
	}-*/;

	/**
	 * Upgrades a hash-based URL to an HTML5 URL if necessary. In non-HTML5 browsers, this method is a noop.
	 * 
	 * @return true if the URL was upgraded, false otherwise.
	 */
	public native final boolean update()/*-{
		return this.update();
	}-*/;

	
	//attribtues
/**
 * Array of route objects.This attribute is intended to be used to set routes at init time, or to completely reset all routes after init. To add routes after init without resetting all existing routes, use the route() method.
 * @return
 */
public native final JsArray<Route> routes() /*-{
return this.get("routes"); 
}-*/;

/**
 * Array of route objects.This attribute is intended to be used to set routes at init time, or to completely reset all routes after init. To add routes after init without resetting all existing routes, use the route() method.
 * @param val
 * @return this - for method chaining
 */
public native final Router routes(JsArray<Route> val) /*-{
this.set("routes", val); 
return this; 
}-*/;
}
