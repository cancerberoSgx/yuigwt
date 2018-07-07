package org.sgx.yuigwt.editors.basetypes;

/**
 * I represent a range in some domain. For example, subclass InRangeInteger
 * represent an integer value inside some range. Normally InRange values are
 * edited with Slider based editors
 * 
 * @author sg
 * 
 * @param <T>
 */
public abstract class InRange<T> {
	T min, max, def, value;

	public InRange(T min, T max, T def) {
		super();
		this.min = min;
		this.max = max;
		this.def = def;
		this.value = def;
	}

	public T getMin() {
		return min;
	}

	public void setMin(T min) {
		this.min = min;
	}

	public T getMax() {
		return max;
	}

	public void setMax(T max) {
		this.max = max;
	}

	public T getDef() {
		return def;
	}

	public void setDef(T def) {
		this.def = def;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	
	public String toString() {
		return this.getClass() + "(" + getMin() + ", " + getMax() + ", value: " + getValue();
	}
}
