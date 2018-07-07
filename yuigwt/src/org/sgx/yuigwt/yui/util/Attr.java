package org.sgx.yuigwt.yui.util;
/**
 * this class is an overlay type for overlaying HTML attribute objects attribute name -> attribute value. 
 * @author sg
 *
 */
public class Attr extends com.google.gwt.core.client.JavaScriptObject {
	protected Attr(){}
	public static native final Attr create()/*-{
		return {}; 
	}-*/;
	public static native final Attr create(String tagName)/*-{
		return {tag: tagName}; 
	}-*/;

	/**
	 * this is non html attribute, it is special for working with YUIUtil.NODE
	 * @return
	 */
	public native final String tag() /*-{
	return this.tag; 
	}-*/;

	/**
	 * this is non html attribute, it is special for working with YUIUtil.NODE
	 * @param val
	 * @return
	 */
	public native final Attr tag(String val) /*-{
	this.tag = val; 
	return this; 
	}-*/;
	/**
	 * this is non html attribute, it is special for working with YUIUtil.NODE
	 * @return
	 */
	public native final String cdata() /*-{
	return this.cdata; 
	}-*/;

	/**
	 * this is non html attribute, it is special for working with YUIUtil.NODE
	 * @param val
	 * @return
	 */
	public native final Attr cdata(String val) /*-{
	this.cdata = val; 
	return this; 
	}-*/;
	public final native String nohref()/*-{
		return this.nohref;
	}-*/;
	public final native Attr nohref(String val)/*-{
		this.nohref = val; return this; 
	}-*/;
	public final native String vlink()/*-{
		return this.vlink;
	}-*/;
	public final native Attr vlink(String val)/*-{
		this.vlink = val; return this; 
	}-*/;
	public final native String language()/*-{
		return this.language;
	}-*/;
	public final native Attr language(String val)/*-{
		this.language = val; return this; 
	}-*/;
	public final native String standby()/*-{
		return this.standby;
	}-*/;
	public final native Attr standby(String val)/*-{
		this.standby = val; return this; 
	}-*/;
	public final native String start()/*-{
		return this.start;
	}-*/;
	public final native Attr start(String val)/*-{
		this.start = val; return this; 
	}-*/;
	public final native String Class()/*-{
		return this["class"];
	}-*/;
	public final native Attr Class(String val)/*-{
		this["class"] = val; return this; 
	}-*/;
	public final native String content()/*-{
		return this.content;
	}-*/;
	public final native Attr content(String val)/*-{
		this.content = val; return this; 
	}-*/;
	public final native String cite()/*-{
		return this.cite;
	}-*/;
	public final native Attr cite(String val)/*-{
		this.cite = val; return this; 
	}-*/;
	public final native String longdesc()/*-{
		return this.longdesc;
	}-*/;
	public final native Attr longdesc(String val)/*-{
		this.longdesc = val; return this; 
	}-*/;
	public final native String noshade()/*-{
		return this.noshade;
	}-*/;
	public final native Attr noshade(String val)/*-{
		this.noshade = val; return this; 
	}-*/;
	public final native String declare()/*-{
		return this.declare;
	}-*/;
	public final native Attr declare(String val)/*-{
		this.declare = val; return this; 
	}-*/;
	public final native String Char()/*-{
		return this["char"]; 
	}-*/;
	public final native Attr Char(String val)/*-{
		this["char"] = val; return this; 
	}-*/;
	public final native String charset()/*-{
		return this.charset;
	}-*/;
	public final native Attr charset(String val)/*-{
		this.charset = val; return this; 
	}-*/;
	public final native String border()/*-{
		return this.border;
	}-*/;
	public final native Attr border(String val)/*-{
		this.border = val; return this; 
	}-*/;
	public final native String vspace()/*-{
		return this.vspace;
	}-*/;
	public final native Attr vspace(String val)/*-{
		this.vspace = val; return this; 
	}-*/;
	public final native String href()/*-{
		return this.href;
	}-*/;
	public final native Attr href(String val)/*-{
		this.href = val; return this; 
	}-*/;
	public final native String scheme()/*-{
		return this.scheme;
	}-*/;
	public final native Attr scheme(String val)/*-{
		this.scheme = val; return this; 
	}-*/;
	public final native String bgcolor()/*-{
		return this.bgcolor;
	}-*/;
	public final native Attr bgcolor(String val)/*-{
		this.bgcolor = val; return this; 
	}-*/;
	public final native String accept()/*-{
		return this.accept;
	}-*/;
	public final native Attr accept(String val)/*-{
		this.accept = val; return this; 
	}-*/;
	public final native String summary()/*-{
		return this.summary;
	}-*/;
	public final native Attr summary(String val)/*-{
		this.summary = val; return this; 
	}-*/;
	public final native String marginheight()/*-{
		return this.marginheight;
	}-*/;
	public final native Attr marginheight(String val)/*-{
		this.marginheight = val; return this; 
	}-*/;
	public final native String checked()/*-{
		return this.checked;
	}-*/;
	public final native Attr checked(String val)/*-{
		this.checked = val; return this; 
	}-*/;
	public final native String readonly()/*-{
		return this.readonly;
	}-*/;
	public final native Attr readonly(String val)/*-{
		this.readonly = val; return this; 
	}-*/;
	public final native String method()/*-{
		return this.method;
	}-*/;
	public final native Attr method(String val)/*-{
		this.method = val; return this; 
	}-*/;
	public final native String archive()/*-{
		return this.archive;
	}-*/;
	public final native Attr archive(String val)/*-{
		this.archive = val; return this; 
	}-*/;
	public final native String prompt()/*-{
		return this.prompt;
	}-*/;
	public final native Attr prompt(String val)/*-{
		this.prompt = val; return this; 
	}-*/;
	public final native String rel()/*-{
		return this.rel;
	}-*/;
	public final native Attr rel(String val)/*-{
		this.rel = val; return this; 
	}-*/;
	public final native String alink()/*-{
		return this.alink;
	}-*/;
	public final native Attr alink(String val)/*-{
		this.alink = val; return this; 
	}-*/;
	public final native String background()/*-{
		return this.background;
	}-*/;
	public final native Attr background(String val)/*-{
		this.background = val; return this; 
	}-*/;
	public final native String charoff()/*-{
		return this.charoff;
	}-*/;
	public final native Attr charoff(String val)/*-{
		this.charoff = val; return this; 
	}-*/;
	public final native String datetime()/*-{
		return this.datetime;
	}-*/;
	public final native Attr datetime(String val)/*-{
		this.datetime = val; return this; 
	}-*/;
	public final native String codetype()/*-{
		return this.codetype;
	}-*/;
	public final native Attr codetype(String val)/*-{
		this.codetype = val; return this; 
	}-*/;
	public final native String acceptCharset()/*-{
		return this.acceptCharset;
	}-*/;
	public final native Attr acceptCharset(String val)/*-{
		this.acceptCharset = val; return this; 
	}-*/;
	public final native String enctype()/*-{
		return this.enctype;
	}-*/;
	public final native Attr enctype(String val)/*-{
		this.enctype = val; return this; 
	}-*/;
	public final native String clear()/*-{
		return this.clear;
	}-*/;
	public final native Attr clear(String val)/*-{
		this.clear = val; return this; 
	}-*/;
	public final native String defer()/*-{
		return this.defer;
	}-*/;
	public final native Attr defer(String val)/*-{
		this.defer = val; return this; 
	}-*/;
	public final native String valuetype()/*-{
		return this.valuetype;
	}-*/;
	public final native Attr valuetype(String val)/*-{
		this.valuetype = val; return this; 
	}-*/;
	public final native String title()/*-{
		return this.title;
	}-*/;
	public final native Attr title(String val)/*-{
		this.title = val; return this; 
	}-*/;
	public final native String accesskey()/*-{
		return this["access-key"];
	}-*/;
	public final native Attr accesskey(String val)/*-{
		this["access-key"] = val; return this; 
	}-*/;
	public final native String version()/*-{
		return this.version;
	}-*/;
	public final native Attr version(String val)/*-{
		this.version = val; return this; 
	}-*/;
	public final native String data()/*-{
		return this.data;
	}-*/;
	public final native Attr data(String val)/*-{
		this.data = val; return this; 
	}-*/;
	public final native String marginwidth()/*-{
		return this.marginwidth;
	}-*/;
	public final native Attr marginwidth(String val)/*-{
		this.marginwidth = val; return this; 
	}-*/;
	public final native String hspace()/*-{
		return this.hspace;
	}-*/;
	public final native Attr hspace(String val)/*-{
		this.hspace = val; return this; 
	}-*/;
	public final native String link()/*-{
		return this.link;
	}-*/;
	public final native Attr link(String val)/*-{
		this.link = val; return this; 
	}-*/;
	public final native String face()/*-{
		return this.face;
	}-*/;
	public final native Attr face(String val)/*-{
		this.face = val; return this; 
	}-*/;
	public final native String rev()/*-{
		return this.rev;
	}-*/;
	public final native Attr rev(String val)/*-{
		this.rev = val; return this; 
	}-*/;
	public final native String media()/*-{
		return this.media;
	}-*/;
	public final native Attr media(String val)/*-{
		this.media = val; return this; 
	}-*/;
	public final native String span()/*-{
		return this.span;
	}-*/;
	public final native Attr span(String val)/*-{
		this.span = val; return this; 
	}-*/;
	public final native String httpEquiv()/*-{
		return this["http-equiv"];
	}-*/;
	public final native Attr httpEquiv(String val)/*-{
		this["http-equiv"] = val; return this; 
	}-*/;
	public final native String scrolling()/*-{
		return this.scrolling;
	}-*/;
	public final native Attr scrolling(String val)/*-{
		this.scrolling = val; return this; 
	}-*/;
	public final native String frame()/*-{
		return this.frame;
	}-*/;
	public final native Attr frame(String val)/*-{
		this.frame = val; return this; 
	}-*/;
	public final native String noresize()/*-{
		return this.noresize;
	}-*/;
	public final native Attr noresize(String val)/*-{
		this.noresize = val; return this; 
	}-*/;
	public final native String rows()/*-{
		return this.rows;
	}-*/;
	public final native Attr rows(String val)/*-{
		this.rows = val; return this; 
	}-*/;
	public final native String size()/*-{
		return this.size;
	}-*/;
	public final native Attr size(String val)/*-{
		this.size = val; return this; 
	}-*/;
	public final native String abbr()/*-{
		return this.abbr;
	}-*/;
	public final native Attr abbr(String val)/*-{
		this.abbr = val; return this; 
	}-*/;
	public final native String label()/*-{
		return this.label;
	}-*/;
	public final native Attr label(String val)/*-{
		this.label = val; return this; 
	}-*/;
	public final native String code()/*-{
		return this.code;
	}-*/;
	public final native Attr code(String val)/*-{
		this.code = val; return this; 
	}-*/;
	public final native String rowspan()/*-{
		return this.rowspan;
	}-*/;
	public final native Attr rowspan(String val)/*-{
		this.rowspan = val; return this; 
	}-*/;
	public final native String shape()/*-{
		return this.shape;
	}-*/;
	public final native Attr shape(String val)/*-{
		this.shape = val; return this; 
	}-*/;
	public final native String width()/*-{
		return this.width;
	}-*/;
	public final native Attr width(String val)/*-{
		this.width = val; return this; 
	}-*/;
	public final native String align()/*-{
		return this.align;
	}-*/;
	public final native Attr align(String val)/*-{
		this.align = val; return this; 
	}-*/;
	public final native String text()/*-{
		return this.text;
	}-*/;
	public final native Attr text(String val)/*-{
		this.text = val; return this; 
	}-*/;
	public final native String colspan()/*-{
		return this.colspan;
	}-*/;
	public final native Attr colspan(String val)/*-{
		this.colspan = val; return this; 
	}-*/;
	public final native String action()/*-{
		return this.action;
	}-*/;
	public final native Attr action(String val)/*-{
		this.action = val; return this; 
	}-*/;
	public final native String value()/*-{
		return this.value;
	}-*/;
	public final native Attr value(String val)/*-{
		this.value = val; return this; 
	}-*/;
	public final native String hreflang()/*-{
		return this.hreflang;
	}-*/;
	public final native Attr hreflang(String val)/*-{
		this.hreflang = val; return this; 
	}-*/;
	public final native String frameborder()/*-{
		return this.frameborder;
	}-*/;
	public final native Attr frameborder(String val)/*-{
		this.frameborder = val; return this; 
	}-*/;
	public final native String compact()/*-{
		return this.compact;
	}-*/;
	public final native Attr compact(String val)/*-{
		this.compact = val; return this; 
	}-*/;
	public final native String height()/*-{
		return this.height;
	}-*/;
	public final native Attr height(String val)/*-{
		this.height = val; return this; 
	}-*/;
	public final native String maxlength()/*-{
		return this.maxlength;
	}-*/;
	public final native Attr maxlength(String val)/*-{
		this.maxlength = val; return this; 
	}-*/;
	public final native String type()/*-{
		return this.type;
	}-*/;
	public final native Attr type(String val)/*-{
		this.type = val; return this; 
	}-*/;
	public final native String cellspacing()/*-{
		return this.cellspacing;
	}-*/;
	public final native Attr cellspacing(String val)/*-{
		this.cellspacing = val; return this; 
	}-*/;
	public final native String cellpadding()/*-{
		return this.cellpadding;
	}-*/;
	public final native Attr cellpadding(String val)/*-{
		this.cellpadding = val; return this; 
	}-*/;
	public final native String headers()/*-{
		return this.headers;
	}-*/;
	public final native Attr headers(String val)/*-{
		this.headers = val; return this; 
	}-*/;
	public final native String cols()/*-{
		return this.cols;
	}-*/;
	public final native Attr cols(String val)/*-{
		this.cols = val; return this; 
	}-*/;
	public final native String idmap()/*-{
		return this.idmap;
	}-*/;
	public final native Attr idmap(String val)/*-{
		this.idmap = val; return this; 
	}-*/;
	public final native String valign()/*-{
		return this.valign;
	}-*/;
	public final native Attr valign(String val)/*-{
		this.valign = val; return this; 
	}-*/;
	public final native String disabled()/*-{
		return this.disabled;
	}-*/;
	public final native Attr disabled(String val)/*-{
		this.disabled = val; return this; 
	}-*/;
	public final native String codebase()/*-{
		return this.codebase;
	}-*/;
	public final native Attr codebase(String val)/*-{
		this.codebase = val; return this; 
	}-*/;
	public final native String target()/*-{
		return this.target;
	}-*/;
	public final native Attr target(String val)/*-{
		this.target = val; return this; 
	}-*/;
	public final native String source()/*-{
		return this.source;
	}-*/;
	public final native Attr source(String val)/*-{
		this.source = val; return this; 
	}-*/;
	public final native String color()/*-{
		return this.color;
	}-*/;
	public final native Attr color(String val)/*-{
		this.color = val; return this; 
	}-*/;
	public final native String coords()/*-{
		return this.coords;
	}-*/;
	public final native Attr coords(String val)/*-{
		this.coords = val; return this; 
	}-*/;
	public final native String rules()/*-{
		return this.rules;
	}-*/;
	public final native Attr rules(String val)/*-{
		this.rules = val; return this; 
	}-*/;
	public final native String tabindex()/*-{
		return this.tabindex;
	}-*/;
	public final native Attr tabindex(String val)/*-{
		this.tabindex = val; return this; 
	}-*/;
	public final native String axis()/*-{
		return this.axis;
	}-*/;
	public final native Attr axis(String val)/*-{
		this.axis = val; return this; 
	}-*/;
	public final native String multiple()/*-{
		return this.multiple;
	}-*/;
	public final native Attr multiple(String val)/*-{
		this.multiple = val; return this; 
	}-*/;
	public final native String classid()/*-{
		return this.classid;
	}-*/;
	public final native Attr classid(String val)/*-{
		this.classid = val; return this; 
	}-*/;
	public final native String profile()/*-{
		return this.profile;
	}-*/;
	public final native Attr profile(String val)/*-{
		this.profile = val; return this; 
	}-*/;
	public final native String For()/*-{
		return this["for"]; 
	}-*/;
	public final native Attr For(String val)/*-{
		this["for"] = val; return this; 
	}-*/;
	public final native String nowrap()/*-{
		return this.nowrap;
	}-*/;
	public final native Attr nowrap(String val)/*-{
		this.nowrap = val; return this; 
	}-*/;
	public final native String style()/*-{
		return this.style;
	}-*/;
	public final native Attr style(String val)/*-{
		this.style = val; return this; 
	}-*/;
	public final native String dir()/*-{
		return this.dir;
	}-*/;
	public final native Attr dir(String val)/*-{
		this.dir = val; return this; 
	}-*/;
	public final native String alt()/*-{
		return this.alt;
	}-*/;
	public final native Attr alt(String val)/*-{
		this.alt = val; return this; 
	}-*/;
	public final native String name()/*-{
		return this.name;
	}-*/;
	public final native Attr name(String val)/*-{
		this.name = val; return this; 
	}-*/;
	public final native String id()/*-{
		return this.id;
	}-*/;
	public final native Attr id(String val)/*-{
		this.id = val; return this; 
	}-*/;
	public final native String selected()/*-{
		return this.selected;
	}-*/;
	public final native Attr selected(String val)/*-{
		this.selected = val; return this; 
	}-*/;
	public final native String lang()/*-{
		return this.lang;
	}-*/;
	public final native Attr lang(String val)/*-{
		this.lang = val; return this; 
	}-*/;
	public final native String object()/*-{
		return this.object;
	}-*/;
	public final native Attr object(String val)/*-{
		this.object = val; return this; 
	}-*/;
	public final native String usemap()/*-{
		return this.usemap;
	}-*/;
	public final native Attr usemap(String val)/*-{
		this.usemap = val; return this; 
	}-*/;
	public final native String scope()/*-{
		return this.scope;
	}-*/;
	public final native Attr scope(String val)/*-{
		this.scope = val; return this; 
	}-*/;
}

