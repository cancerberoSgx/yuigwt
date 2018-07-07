package org.sgx.yuigwt.editors.basetypes;

/**
 * 
 * @author sg
 * 
 */
public class InRangeDouble extends InRange<Double> {

	public InRangeDouble(Double min, Double max, Double def) {
		super(min, max, def);
	}

	public InRangeDouble(int min, int max, int def) {
		super((double) min, (double) max, (double) def);
	}

}
