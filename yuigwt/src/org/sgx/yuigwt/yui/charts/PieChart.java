package org.sgx.yuigwt.yui.charts;

public class PieChart extends ChartBase{
protected PieChart(){}

/**
 * @param series Reference to a series.
 * @param index Index of the specified item within a series.
 * @return Returns an object literal containing a categoryItem and a valueItem for a given series index. Below is the structure of each:
 */
public native final PieSeriesItem getSeriesItem(PieSeries series, int index) /*-{
return this.getSeriesItem(series, index);
}-*/;


}
