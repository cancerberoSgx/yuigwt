package org.sgx.yuigwt.yui.charts;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * Properties used to display and style the ChartLegend
 * 
 * @author sg
 *
 */
public class LegendStyle extends JavaScriptObject {
protected LegendStyle(){}

public static final native LegendStyle create()/*-{
return {}; 
}-*/;


/**
 * Distance, in pixels, between the ChartLegend instance and the chart's content. When ChartLegend is rendered within a Chart instance this value is applied.
 * @return
 */
public native final int gap() /*-{
return this.gap; 
}-*/;

/**
 * Distance, in pixels, between the ChartLegend instance and the chart's content. When ChartLegend is rendered within a Chart instance this value is applied.
 * @param val
 * @return this - for setter chaining
 */
public native final LegendStyle gap(int val) /*-{
this.gap = val; 
return this; 
}-*/;

/**
 * Defines the horizontal alignment of the items in a ChartLegend rendered in a horizontal direction. This value is applied when the instance's position is set to top or bottom. This attribute can be set to left, center or right. The default value is center.
 * @return
 */
public native final String hAlign() /*-{
return this.hAlign; 
}-*/;

/**
 * Defines the horizontal alignment of the items in a ChartLegend rendered in a horizontal direction. This value is applied when the instance's position is set to top or bottom. This attribute can be set to left, center or right. The default value is center.
 * @param val
 * @return this - for setter chaining
 */
public native final LegendStyle hAlign(String val) /*-{
this.hAlign = val; 
return this; 
}-*/;
/**
 * Defines the vertical alignment of the items in a ChartLegend rendered in vertical direction. This value is applied when the instance's position is set to left or right. The attribute can be set to top, middle or bottom. The default value is middle.
 * @return
 */
public native final String vAlign() /*-{
return this.vAlign; 
}-*/;

/**
 * Defines the vertical alignment of the items in a ChartLegend rendered in vertical direction. This value is applied when the instance's position is set to left or right. The attribute can be set to top, middle or bottom. The default value is middle.
 * @param val
 * @return this - for setter chaining
 */
public native final LegendStyle vAlign(String val) /*-{
this.vAlign = val; 
return this; 
}-*/;

/**
 * Set of style properties applied to the items of the ChartLegend. 
 * @return
 */
public native final ItemStyle item() /*-{
return this.item; 
}-*/;

/**
 * Set of style properties applied to the items of the ChartLegend. 
 * @param val
 * @return this - for setter chaining
 */
public native final LegendStyle item(ItemStyle val) /*-{
this.item = val; 
return this; 
}-*/;

/**
 * Properties for the ChartLegend background. 
 * @return
 */
public native final Background background() /*-{
return this.background; 
}-*/;

/**
 * Properties for the ChartLegend background. 
 * @param val
 * @return this - for setter chaining
 */
public native final LegendStyle background(Background val) /*-{
this.background = val; 
return this; 
}-*/;


/**
 * Set of style properties applied to the items of the ChartLegend
 * @author sg
 *
 */
public static class ItemStyle extends JavaScriptObject {
	protected ItemStyle(){}
	public static final native ItemStyle create()/*-{
		return {}; 
	}-*/;
	/**
	 * Horizontal distance, in pixels, between legend items.
	 * @return
	 */
	public native final int hSpacing() /*-{
	return this.hSpacing; 
	}-*/;
	
	/**
	 * Horizontal distance, in pixels, between legend items.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final LegendStyle.ItemStyle hSpacing(int val) /*-{
	this.hSpacing = val; 
	return this; 
	}-*/;
	
	/**
	 * Vertical distance, in pixels, between legend items.
	 * @return
	 */
	public native final int vSpacing() /*-{
	return this.vSpacing; 
	}-*/;
	
	/**
	 * Vertical distance, in pixels, between legend items.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final LegendStyle.ItemStyle vSpacing(int val) /*-{
	this.vSpacing = val; 
	return this; 
	}-*/;
}



/**
 * Style poroperties for the text of a legend item.
 * @author sg
 *
 */
public static class ItemLabel extends JavaScriptObject {
	protected ItemLabel(){}
	public static final native ItemLabel create()/*-{
		return {}; 
	}-*/;
	
	/**
	 * Color of the text. The default values is "#808080".
	 * @return
	 */
	public native final String color() /*-{
	return this.color; 
	}-*/;
	
	/**
	 * Color of the text. The default values is "#808080".
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final LegendStyle.ItemLabel color(String val) /*-{
	this.color = val; 
	return this; 
	}-*/;
	
	/**
	 * Font size for the text. The default value is "85%".
	 * @return
	 */
	public native final String fontSize() /*-{
	return this.fontSize; 
	}-*/;
	
	/**
	 * Font size for the text. The default value is "85%".
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final LegendStyle.ItemLabel fontSize(String val) /*-{
	this.fontSize = val; 
	return this; 
	}-*/;
}


/**
 * Properties for the legend item markers
 * @author sg
 *
 */
public static class ItemMarker extends JavaScriptObject {
	protected ItemMarker(){}
	public static final native ItemMarker create()/*-{
		return {}; 
	}-*/;	
	/**
	 * Specifies the width of the markers.
	 * @return
	 */
	public native final int width() /*-{
	return this.width; 
	}-*/;	
	/**
	 * Specifies the width of the markers.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final LegendStyle.ItemMarker width(int val) /*-{
	this.width = val; 
	return this; 
	}-*/;
	/**
	 * Specifies the height of the markers.
	 * @return
	 */
	public native final int height() /*-{
	return this.height; 
	}-*/;
	
	/**
	 * Specifies the height of the markers.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final LegendStyle.ItemMarker height(int val) /*-{
	this.height = val; 
	return this; 
	}-*/;
}

/**
 * Properties for the ChartLegend background.
 * @author sebastian
 *
 */
public static class Background extends JavaScriptObject {
	protected Background(){}
	public static final native Background create()/*-{
		return {}; 
	}-*/;	
	/**
	 * Properties for the background fill. Color for the fill. The default value is "#faf9f2".
	 * @return
	 */
	public native final String fillColor() /*-{
	return this.fill ? this.fill.color : null;  
	}-*/;
	
	/**
	 * Properties for the background fill. Color for the fill. The default value is "#faf9f2".
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final LegendStyle.Background fillColor(String val) /*-{
	if(!this.fill)
		this.fill={}; 
	this.fill["color"] = val;  
	return this; 
	}-*/;
	/**
	 * 
	 * @return
	 */
	public native final BackgroundBorder border() /*-{
	return this.border; 
	}-*/;
	
	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final LegendStyle.Background border(BackgroundBorder val) /*-{
	this.border = val; 
	return this; 
	}-*/;
}

/**
 * Properties for the background border. 
 * @author sg
 *
 */
public static class BackgroundBorder extends JavaScriptObject {
	protected BackgroundBorder(){}
	public static final native BackgroundBorder create()/*-{
		return {}; 
	}-*/;
	/**
	 * Color for the border. The default value is "#dad8c9"
	 * @return
	 */
	public native final String color() /*-{
	return this.color; 
	}-*/;	
	/**
	 * Color for the border. The default value is "#dad8c9"
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final LegendStyle.BackgroundBorder color(String val) /*-{
	this.color = val; 
	return this; 
	}-*/;
	/**
	 * Weight of the border. The default values is 1.
	 * @return
	 */
	public native final int weight() /*-{
	return this.weight; 
	}-*/;	
	/**
	 * Weight of the border. The default values is 1.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final LegendStyle.BackgroundBorder weight(int val) /*-{
	this.weight = val; 
	return this; 
	}-*/;
}

}
