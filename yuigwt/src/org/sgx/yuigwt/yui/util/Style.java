package org.sgx.yuigwt.yui.util;

/**
 * overlay for style objects Node.setStyles(), Node.transition, etc
 * @author sg
 *
 */
public class Style extends JsObject {
	protected Style(){}
	public static final native  Style create()/*-{
		return {}; 
	}-*/;
	public final native Style set(String property, String val)/*-{
		this[property]=val; return this; 
	}-*/;
	public final native String backgroundRepeat()/*-{
		return this.backgroundRepeat;
	}-*/;
	public final native Style backgroundRepeat(String val)/*-{
		this.backgroundRepeat = val; return this; 
	}-*/;
	public final native String font()/*-{
		return this.font;
	}-*/;
	public final native Style font(String val)/*-{
		this.font = val; return this; 
	}-*/;
	public final native String width()/*-{
		return this.width;
	}-*/;
	public final native Style width(String val)/*-{
		this.width = val; return this; 
	}-*/;
	public final native String letterSpacing()/*-{
		return this.letterSpacing;
	}-*/;
	public final native Style letterSpacing(String val)/*-{
		this.letterSpacing = val; return this; 
	}-*/;
	public final native String marginTop()/*-{
		return this.marginTop;
	}-*/;
	public final native Style marginTop(String val)/*-{
		this.marginTop = val; return this; 
	}-*/;
	public final native String paddingTop()/*-{
		return this.paddingTop;
	}-*/;
	public final native Style paddingTop(String val)/*-{
		this.paddingTop = val; return this; 
	}-*/;
	public final native String listStylePosition()/*-{
		return this.listStylePosition;
	}-*/;
	public final native Style listStylePosition(String val)/*-{
		this.listStylePosition = val; return this; 
	}-*/;
	public final native String paddingLeft()/*-{
		return this.paddingLeft;
	}-*/;
	public final native Style paddingLeft(String val)/*-{
		this.paddingLeft = val; return this; 
	}-*/;
	public final native String fontSize()/*-{
		return this.fontSize;
	}-*/;
	public final native Style fontSize(String val)/*-{
		this.fontSize = val; return this; 
	}-*/;
	public final native String borderBottom()/*-{
		return this.borderBottom;
	}-*/;
	public final native Style borderBottom(String val)/*-{
		this.borderBottom = val; return this; 
	}-*/;
	public final native String display()/*-{
		return this.display;
	}-*/;
	public final native Style display(String val)/*-{
		this.display = val; return this; 
	}-*/;
	public final native String backgroundImage()/*-{
		return this.backgroundImage;
	}-*/;
	public final native Style backgroundImage(String val)/*-{
		this.backgroundImage = val; return this; 
	}-*/;
	public final native String borderWidth()/*-{
		return this.borderWidth;
	}-*/;
	public final native Style borderWidth(String val)/*-{
		this.borderWidth = val; return this; 
	}-*/;
	public final native String borderLeftColor()/*-{
		return this.borderLeftColor;
	}-*/;
	public final native Style borderLeftColor(String val)/*-{
		this.borderLeftColor = val; return this; 
	}-*/;
	public final native String overflow()/*-{
		return this.overflow;
	}-*/;
	public final native Style overflow(String val)/*-{
		this.overflow = val; return this; 
	}-*/;
	public final native String borderTop()/*-{
		return this.borderTop;
	}-*/;
	public final native Style borderTop(String val)/*-{
		this.borderTop = val; return this; 
	}-*/;
	public final native String fontWeight()/*-{
		return this.fontWeight;
	}-*/;
	public final native Style fontWeight(String val)/*-{
		this.fontWeight = val; return this; 
	}-*/;
	public final native String filter()/*-{
		return this.filter;
	}-*/;
	public final native Style filter(String val)/*-{
		this.filter = val; return this; 
	}-*/;
	public final native String listStyleType()/*-{
		return this.listStyleType;
	}-*/;
	public final native Style listStyleType(String val)/*-{
		this.listStyleType = val; return this; 
	}-*/;
	public final native String borderLeftStyle()/*-{
		return this.borderLeftStyle;
	}-*/;
	public final native Style borderLeftStyle(String val)/*-{
		this.borderLeftStyle = val; return this; 
	}-*/;
	public final native String borderTopStyle()/*-{
		return this.borderTopStyle;
	}-*/;
	public final native Style borderTopStyle(String val)/*-{
		this.borderTopStyle = val; return this; 
	}-*/;
	public final native String visibility()/*-{
		return this.visibility;
	}-*/;
	public final native Style visibility(String val)/*-{
		this.visibility = val; return this; 
	}-*/;
	public final native String backgroundColor()/*-{
		return this.backgroundColor;
	}-*/;
	public final native Style backgroundColor(String val)/*-{
		this.backgroundColor = val; return this; 
	}-*/;
	public final native String marginLeft()/*-{
		return this.marginLeft;
	}-*/;
	public final native Style marginLeft(String val)/*-{
		this.marginLeft = val; return this; 
	}-*/;
	public final native String borderBottomStyle()/*-{
		return this.borderBottomStyle;
	}-*/;
	public final native Style borderBottomStyle(String val)/*-{
		this.borderBottomStyle = val; return this; 
	}-*/;
	public final native String lineHeight()/*-{
		return this.lineHeight;
	}-*/;
	public final native Style lineHeight(String val)/*-{
		this.lineHeight = val; return this; 
	}-*/;
	public final native String cursor()/*-{
		return this.cursor;
	}-*/;
	public final native Style cursor(String val)/*-{
		this.cursor = val; return this; 
	}-*/;
	public final native String borderLeft()/*-{
		return this.borderLeft;
	}-*/;
	public final native Style borderLeft(String val)/*-{
		this.borderLeft = val; return this; 
	}-*/;
	public final native String padding()/*-{
		return this.padding;
	}-*/;
	public final native Style padding(String val)/*-{
		this.padding = val; return this; 
	}-*/;
	public final native String backgroundAttachment()/*-{
		return this.backgroundAttachment;
	}-*/;
	public final native Style backgroundAttachment(String val)/*-{
		this.backgroundAttachment = val; return this; 
	}-*/;
	public final native String fontVariant()/*-{
		return this.fontVariant;
	}-*/;
	public final native Style fontVariant(String val)/*-{
		this.fontVariant = val; return this; 
	}-*/;
	public final native String textDecorationOverline()/*-{
		return this.textDecorationOverline;
	}-*/;
	public final native Style textDecorationOverline(String val)/*-{
		this.textDecorationOverline = val; return this; 
	}-*/;
	public final native String textDecoration()/*-{
		return this.textDecoration;
	}-*/;
	public final native Style textDecoration(String val)/*-{
		this.textDecoration = val; return this; 
	}-*/;
	public final native String height()/*-{
		return this.height;
	}-*/;
	public final native Style height(String val)/*-{
		this.height = val; return this; 
	}-*/;
	public final native String border()/*-{
		return this.border;
	}-*/;
	public final native Style border(String val)/*-{
		this.border = val; return this; 
	}-*/;
	public final native String margin()/*-{
		return this.margin;
	}-*/;
	public final native Style margin(String val)/*-{
		this.margin = val; return this; 
	}-*/;
	public final native String textDecorationLineThrough()/*-{
		return this.textDecorationLineThrough;
	}-*/;
	public final native Style textDecorationLineThrough(String val)/*-{
		this.textDecorationLineThrough = val; return this; 
	}-*/;
	public final native String marginRight()/*-{
		return this.marginRight;
	}-*/;
	public final native Style marginRight(String val)/*-{
		this.marginRight = val; return this; 
	}-*/;
	public final native String textDecorationUnderline()/*-{
		return this.textDecorationUnderline;
	}-*/;
	public final native Style textDecorationUnderline(String val)/*-{
		this.textDecorationUnderline = val; return this; 
	}-*/;
	public final native String clip()/*-{
		return this.clip;
	}-*/;
	public final native Style clip(String val)/*-{
		this.clip = val; return this; 
	}-*/;
	public final native String listStyle()/*-{
		return this.listStyle;
	}-*/;
	public final native Style listStyle(String val)/*-{
		this.listStyle = val; return this; 
	}-*/;
	public final native String paddingRight()/*-{
		return this.paddingRight;
	}-*/;
	public final native Style paddingRight(String val)/*-{
		this.paddingRight = val; return this; 
	}-*/;
	public final native String pageBreakBefore()/*-{
		return this.pageBreakBefore;
	}-*/;
	public final native Style pageBreakBefore(String val)/*-{
		this.pageBreakBefore = val; return this; 
	}-*/;
	public final native String borderTopColor()/*-{
		return this.borderTopColor;
	}-*/;
	public final native Style borderTopColor(String val)/*-{
		this.borderTopColor = val; return this; 
	}-*/;
	public final native String background()/*-{
		return this.background;
	}-*/;
	public final native Style background(String val)/*-{
		this.background = val; return this; 
	}-*/;
	public final native String color()/*-{
		return this.color;
	}-*/;
	public final native Style color(String val)/*-{
		this.color = val; return this; 
	}-*/;
	public final native String styleFloat()/*-{
		return this.styleFloat;
	}-*/;
	public final native Style styleFloat(String val)/*-{
		this.styleFloat = val; return this; 
	}-*/;
	public final native String marginBottom()/*-{
		return this.marginBottom;
	}-*/;
	public final native Style marginBottom(String val)/*-{
		this.marginBottom = val; return this; 
	}-*/;
	public final native String listStyleImage()/*-{
		return this.listStyleImage;
	}-*/;
	public final native Style listStyleImage(String val)/*-{
		this.listStyleImage = val; return this; 
	}-*/;
	public final native String pageBreakAfter()/*-{
		return this.pageBreakAfter;
	}-*/;
	public final native Style pageBreakAfter(String val)/*-{
		this.pageBreakAfter = val; return this; 
	}-*/;
	public final native String textDecorationBlink()/*-{
		return this.textDecorationBlink;
	}-*/;
	public final native Style textDecorationBlink(String val)/*-{
		this.textDecorationBlink = val; return this; 
	}-*/;
	public final native String borderBottomWidth()/*-{
		return this.borderBottomWidth;
	}-*/;
	public final native Style borderBottomWidth(String val)/*-{
		this.borderBottomWidth = val; return this; 
	}-*/;
	public final native String borderStyle()/*-{
		return this.borderStyle;
	}-*/;
	public final native Style borderStyle(String val)/*-{
		this.borderStyle = val; return this; 
	}-*/;
	public final native String zIndex()/*-{
		return this.zIndex;
	}-*/;
	public final native Style zIndex(String val)/*-{
		this.zIndex = val; return this; 
	}-*/;
	public final native String borderBottomColor()/*-{
		return this.borderBottomColor;
	}-*/;
	public final native Style borderBottomColor(String val)/*-{
		this.borderBottomColor = val; return this; 
	}-*/;
	public final native String borderColor()/*-{
		return this.borderColor;
	}-*/;
	public final native Style borderColor(String val)/*-{
		this.borderColor = val; return this; 
	}-*/;
	public final native String position()/*-{
		return this.position;
	}-*/;
	public final native Style position(String val)/*-{
		this.position = val; return this; 
	}-*/;
	public final native String verticalAlign()/*-{
		return this.verticalAlign;
	}-*/;
	public final native Style verticalAlign(String val)/*-{
		this.verticalAlign = val; return this; 
	}-*/;
	public final native String textIndent()/*-{
		return this.textIndent;
	}-*/;
	public final native Style textIndent(String val)/*-{
		this.textIndent = val; return this; 
	}-*/;
	public final native String backgroundPosition()/*-{
		return this.backgroundPosition;
	}-*/;
	public final native Style backgroundPosition(String val)/*-{
		this.backgroundPosition = val; return this; 
	}-*/;
	public final native String clear()/*-{
		return this.clear;
	}-*/;
	public final native Style clear(String val)/*-{
		this.clear = val; return this; 
	}-*/;
	public final native String borderTopWidth()/*-{
		return this.borderTopWidth;
	}-*/;
	public final native Style borderTopWidth(String val)/*-{
		this.borderTopWidth = val; return this; 
	}-*/;
	public final native String paddingBottom()/*-{
		return this.paddingBottom;
	}-*/;
	public final native Style paddingBottom(String val)/*-{
		this.paddingBottom = val; return this; 
	}-*/;
	public final native String top()/*-{
		return this.top;
	}-*/;
	public final native Style top(String val)/*-{
		this.top = val; return this; 
	}-*/;
	public final native String textAlign()/*-{
		return this.textAlign;
	}-*/;
	public final native Style textAlign(String val)/*-{
		this.textAlign = val; return this; 
	}-*/;
	public final native String left()/*-{
		return this.left;
	}-*/;
	public final native Style left(String val)/*-{
		this.left = val; return this; 
	}-*/;
	public final native String right()/*-{
		return this.right;
	}-*/;
	public final native Style right(String val)/*-{
		this.right = val; return this; 
	}-*/;
	public final native String fontFamily()/*-{
		return this.fontFamily;
	}-*/;
	public final native Style fontFamily(String val)/*-{
		this.fontFamily = val; return this; 
	}-*/;
	public final native String borderLeftWidth()/*-{
		return this.borderLeftWidth;
	}-*/;
	public final native Style borderLeftWidth(String val)/*-{
		this.borderLeftWidth = val; return this; 
	}-*/;
	public final native String textTransform()/*-{
		return this.textTransform;
	}-*/;
	public final native Style textTransform(String val)/*-{
		this.textTransform = val; return this; 
	}-*/;
	
	
	
	//some css 3
	public final native Style columnCount(int val)/*-{
		this.columnCount = val; return this; 
	}-*/;
	public final native Style columnGap(String val)/*-{
		this.columnGap = val; return this; 
	}-*/;
}

