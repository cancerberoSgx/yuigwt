package org.sgx.yuigwt.yui.handlebars;

import org.sgx.yuigwt.yui.util.CallbackString;
import org.sgx.yuigwt.yui.util.JsFunction;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * HandlebarsClass is a simple template language inspired by Mustache. This is a
 * YUI port of the original HandlebarsClass project, which can be found at
 * https://github.com/wycats/handlebars.js.
 * 
 * @see http://yuilibrary.com/yui/docs/handlebars/
 * @see http://yuilibrary.com/yui/docs/api/classes/HandlebarsClass.html
 * @author sg
 * 
 */
public class HandlebarsClass extends JavaScriptObject {
	protected HandlebarsClass() {
	}

	/**
	 * Compiles a Handlebars template string into a function. To render the
	 * template, call the function and pass in a context object.
	 * 
	 * @param string
	 *            Handlebars template string to compile.
	 * @return template function ready to render
	 */
	public native final Template compile(String string) /*-{
		return this.compile(string);
	}-*/;

	/**
	 * Compiles a Handlebars template string into a function. To render the
	 * template, call the function and pass in a context object.
	 * 
	 * @param string
	 *            Handlebars template string to compile.
	 * @return template function ready to render
	 */
	public native final Template compile(String string, CompilerOptions compilerOptions) /*-{
		return this.compile(string, compilerOptions);
	}-*/;

	/**
	 * @param level
	 *            Log level for this message. Supported levels are "debug",
	 *            "info", "warn", and "error".
	 * @param msg
	 *            Message to log.
	 * @return self for method chaining
	 */
	public native final Template log(String level, String msg) /*-{
		this.log(level, msg);
		return this;
	}-*/;

	/**
	 * Precompiles a Handlebars template string into a string of JavaScript
	 * code. This can be used to precompile a template at build time or on the
	 * server, and the resulting template can then be rendered at runtime or on
	 * the client without needing to go through a compile step. To render a
	 * precompiled template, evaluate the code and then pass the resulting
	 * function to Y.Handlebars.template() to get back an executable template
	 * function.
	 * 
	 * @param string
	 *            Handlebars template string to compile.
	 * @return Precompiled template code.
	 */
	public native final String precompile(String string) /*-{
		return this.precompile(string);
	}-*/;

	/**
	 * Precompiles a Handlebars template string into a string of JavaScript
	 * code. This can be used to precompile a template at build time or on the
	 * server, and the resulting template can then be rendered at runtime or on
	 * the client without needing to go through a compile step. To render a
	 * precompiled template, evaluate the code and then pass the resulting
	 * function to Y.Handlebars.template() to get back an executable template
	 * function.
	 * 
	 * @param string
	 *            Handlebars template string to compile.
	 * @return Precompiled template code.
	 */
	public native final String precompile(String string, CompilerOptions compilerOptions) /*-{
		return this.precompile(string, compilerOptions);
	}-*/;

	/**
	 * Registers a helper function that will be made available to all templates.
	 * Helper functions receive the current template context as the this object,
	 * and can also receive arguments passed by the template.
	 * 
	 * <pre>
	 * Y.Handlebars.registerHelper('linkify', function () {
	 *     return '<a href="' + Y.Escape.html(this.url) + '">' +
	 *         Y.Escape.html(this.text) + '</a>';
	 * });
	 * 
	 * var source = '<ul></ul>';
	 * 
	 * Y.Handlebars.render(source, {
	 *     links: [
	 *         {url: '/foo', text: 'Foo'},
	 *         {url: '/bar', text: 'Bar'},
	 *         {url: '/baz', text: 'Baz'}
	 *     ]
	 * });
	 * </pre>
	 * 
	 * @param name
	 *            Name of this helper.
	 * @param fn
	 *            Helper function.
	 * @return
	 */
	public native final String registerHelper(String name, JsFunction fn) /*-{
		return this.registerHelper(name, fn);
	}-*/;

	/**
	 * Registers a helper function that will be made available to all templates.
	 * Helper functions receive the current template context as the this object,
	 * and can also receive arguments passed by the template. Example:
	 * 
	 * <pre>
	 * Y.Handlebars.registerHelper('linkify', function () {
	 *     return '<a href="' + Y.Escape.html(this.url) + '">' +
	 *         Y.Escape.html(this.text) + '</a>';
	 * });
	 * 
	 * var source = '<ul></ul>';
	 * 
	 * Y.Handlebars.render(source, {
	 *     links: [
	 *         {url: '/foo', text: 'Foo'},
	 *         {url: '/bar', text: 'Bar'},
	 *         {url: '/baz', text: 'Baz'}
	 *     ]
	 * });
	 * </pre>
	 * 
	 * @param name
	 *            Name of this helper.
	 * @param fn
	 *            Helper function.
	 * @param inverse
	 *            If true, this helper will be considered an "inverse" helper,
	 *            like "unless". This means it will only be called if the
	 *            expression given in the template evaluates to a false or empty
	 *            value.
	 * @return
	 */
	public native final String registerHelper(String name, JsFunction fn, boolean inverse) /*-{
		return this.registerHelper(name, fn, inverse);
	}-*/;

	/**
	 * Registers a helper function that will be made available to all templates.
	 * Helper functions receive the current template context as the this object,
	 * and can also receive arguments passed by the template.
	 * 
	 * <pre>
	 * Y.Handlebars.registerHelper('linkify', function () {
	 *     return '<a href="' + Y.Escape.html(this.url) + '">' +
	 *         Y.Escape.html(this.text) + '</a>';
	 * });
	 * 
	 * var source = '<ul></ul>';
	 * 
	 * Y.Handlebars.render(source, {
	 *     links: [
	 *         {url: '/foo', text: 'Foo'},
	 *         {url: '/bar', text: 'Bar'},
	 *         {url: '/baz', text: 'Baz'}
	 *     ]
	 * });
	 * </pre>
	 * 
	 * @param name
	 *            Name of this helper.
	 * @param fn
	 *            Helper function.
	 * @return
	 */
	public native final String registerHelper(String name, CallbackString fn) /*-{
		var f = $entry(function() {
			return fn.@org.sgx.yuigwt.yui.util.CallbackString::call(Lcom/google/gwt/core/client/JsArrayMixed;)(arguments);
		});
		return this.registerHelper(name, f);
	}-*/;

	/**
	 * Registers a helper function that will be made available to all templates.
	 * Helper functions receive the current template context as the this object,
	 * and can also receive arguments passed by the template. Example:
	 * 
	 * <pre>
	 * Y.Handlebars.registerHelper('linkify', function () {
	 *     return '<a href="' + Y.Escape.html(this.url) + '">' +
	 *         Y.Escape.html(this.text) + '</a>';
	 * });
	 * 
	 * var source = '<ul></ul>';
	 * 
	 * Y.Handlebars.render(source, {
	 *     links: [
	 *         {url: '/foo', text: 'Foo'},
	 *         {url: '/bar', text: 'Bar'},
	 *         {url: '/baz', text: 'Baz'}
	 *     ]
	 * });
	 * </pre>
	 * 
	 * @param name
	 *            Name of this helper.
	 * @param fn
	 *            Helper function.
	 * @param inverse
	 *            If true, this helper will be considered an "inverse" helper,
	 *            like "unless". This means it will only be called if the
	 *            expression given in the template evaluates to a false or empty
	 *            value.
	 * @return
	 */
	public native final String registerHelper(String name, CallbackString fn, boolean inverse) /*-{
		var f = $entry(function() {
			return fn.@org.sgx.yuigwt.yui.util.CallbackString::call(Lcom/google/gwt/core/client/JsArrayMixed;)(arguments);
		});
		return this.registerHelper(name, f, inverse);
	}-*/;

	/**
	 * Registers a partial that will be made available to all templates. A
	 * partial is another template that can be used to render part of a larger
	 * template. For example, a website with a common header and footer across
	 * all its pages might use a template for each page, which would call shared
	 * partials to render the headers and footers. Partials may be specified as
	 * uncompiled template strings or as compiled template functions.
	 * 
	 * Example:
	 * 
	 * <pre>
	 * Y.Handlebars.registerPartial('header', '<h1>{{title}}</h1>');
	 * Y.Handlebars.registerPartial('footer', 'Copyright (c) 2011 by Me.');
	 * 
	 * var source = '{{> header}} <p>Mustaches are awesome!</p> {{> footer}}';
	 * 
	 * Y.Handlebars.render(source, {title: 'My Page About Mustaches'});
	 * </pre>
	 * 
	 * 
	 * @param name
	 * @param partial
	 * @return
	 */
	public native final String registerPartial(String name, String partial) /*-{
		return this.registerPartial(name, partial);
	}-*/;

	/**
	 * Registers a partial that will be made available to all templates. A
	 * partial is another template that can be used to render part of a larger
	 * template. For example, a website with a common header and footer across
	 * all its pages might use a template for each page, which would call shared
	 * partials to render the headers and footers. Partials may be specified as
	 * uncompiled template strings or as compiled template functions.
	 * 
	 * 
	 * Example:
	 * 
	 * <pre>
	 * Y.Handlebars.registerPartial('header', '<h1>{{title}}</h1>');
	 * Y.Handlebars.registerPartial('footer', 'Copyright (c) 2011 by Me.');
	 * 
	 * var source = '{{> header}} <p>Mustaches are awesome!</p> {{> footer}}';
	 * 
	 * Y.Handlebars.render(source, {title: 'My Page About Mustaches'});
	 * </pre>
	 * 
	 * 
	 * 
	 * @param name
	 * @param partial
	 * @return
	 */
	public native final String registerPartial(String name, JsFunction partial) /*-{
		return this.registerPartial(name, partial);
	}-*/;

	/**
	 * 
	 * Compiles and renders a Handlebars template string in a single step.
	 * 
	 * If you'll be using a template more than once, it's more efficient to
	 * compile it into a function once using compile(), and then render it
	 * whenever you need to by simply executing the compiled function. However,
	 * if you only need to compile and render a template once, render() is a
	 * handy shortcut for doing both in a single step. Example:
	 * 
	 * <pre>
	 * Y.Handlebars.render('The pie of the day is {{pie}}!', {
	 *     pie: 'Maple Custard'
	 * });
	 * // => "The pie of the day is Maple Custard!"
	 * </pre>
	 * 
	 * 
	 * @param string
	 *            Handlebars template string to render.
	 * @param context
	 *            Context object to pass to the template.
	 * @param opts
	 *            Compile/render options.
	 * @return Rendered template string.
	 */
	public native final String render(String string, JavaScriptObject context, CompilerOptions opts) /*-{
		return this.render(string, context, opts);
	}-*/;

	/**
	 * 
	 * Compiles and renders a Handlebars template string in a single step.
	 * 
	 * If you'll be using a template more than once, it's more efficient to
	 * compile it into a function once using compile(), and then render it
	 * whenever you need to by simply executing the compiled function. However,
	 * if you only need to compile and render a template once, render() is a
	 * handy shortcut for doing both in a single step. Example:
	 * 
	 * <pre>
	 * Y.Handlebars.render('The pie of the day is {{pie}}!', {
	 *     pie: 'Maple Custard'
	 * });
	 * // => "The pie of the day is Maple Custard!"
	 * </pre>
	 * 
	 * 
	 * @param string
	 *            Handlebars template string to render.
	 * @param context
	 *            Context object to pass to the template.
	 * @param opts
	 *            Compile/render options.
	 * @return Rendered template string.
	 */
	public native final String render(String string, JavaScriptObject context) /*-{
		return this.render(string, context);
	}-*/;

	/**
	 * Converts a precompiled template into a renderable template function.
	 * Example
	 * 
	 * 
	 * <pre>
	 * &lt;script src="precompiled-template.js">&lt;/script>
	 * &lt;script>
	 * YUI().use('handlebars-base', function (Y) {
	 *     // Convert the precompiled template function into a renderable template
	 *     // function.
	 *     var template = Y.Handlebars.template(precompiledTemplate);
	 * 
	 *     // Render it.
	 *     template({pie: 'Pumpkin'});
	 * });
	 * &lt;/script>
	 * </pre>
	 * 
	 * 
	 * @param precompiledTemplateFn
	 *            Precompiled Handlebars template function.
	 * @return Compiled template function.
	 */
	public native final Template template(JavaScriptObject precompiledTemplateFn) /*-{
		return this.template(precompiledTemplateFn);
	}-*/;
}
