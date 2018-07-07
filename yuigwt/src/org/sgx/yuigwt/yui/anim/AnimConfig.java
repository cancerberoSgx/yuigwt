package org.sgx.yuigwt.yui.anim;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A class for constructing animation instances.
 * 
 * @author sg
 * 
 */
public class AnimConfig extends JavaScriptObject {
	protected AnimConfig() {
	}

	public static final native AnimConfig create()/*-{
		return {};
	}-*/;

	/**
	 * 
	 The starting values for the animated properties. <br/>
	 * Fields may be strings, numbers, or functions. If a function is used, the
	 * return value becomes the from value. If no from value is specified, the
	 * DEFAULT_GETTER will be used. Supports any unit, provided it matches the
	 * "to" (or default) unit (e.g. {width: '10em', color: 'rgb(0, 0, 0)',
	 * borderColor: '#ccc'}). <br/>
	 * If using the default ('px' for length-based units), the unit may be
	 * omitted (e.g. {width: 100}, borderColor: 'ccc'}, which defaults to pixels
	 * and hex, respectively).
	 * 
	 * @return
	 */
	public native final Style from() /*-{
		return this.from;
	}-*/;

	/**
	 * 
	 The starting values for the animated properties. <br/>
	 * Fields may be strings, numbers, or functions. If a function is used, the
	 * return value becomes the from value. If no from value is specified, the
	 * DEFAULT_GETTER will be used. Supports any unit, provided it matches the
	 * "to" (or default) unit (e.g. {width: '10em', color: 'rgb(0, 0, 0)',
	 * borderColor: '#ccc'}). <br/>
	 * If using the default ('px' for length-based units), the unit may be
	 * omitted (e.g. {width: 100}, borderColor: 'ccc'}, which defaults to pixels
	 * and hex, respectively).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AnimConfig from(Style val) /*-{
		this.from = val;
		return this;
	}-*/;

	/**
	 * The ending values for the animated properties. Fields may be strings,
	 * numbers, or functions. Supports any unit, provided it matches the "from"
	 * (or default) unit (e.g. {width: '50%', color: 'red', borderColor:
	 * '#ccc'}). If using the default ('px' for length-based units), the unit
	 * may be omitted (e.g. {width: 100, borderColor: 'ccc'}, which defaults to
	 * pixels and hex, respectively).
	 * 
	 * @return
	 */
	public native final Style to() /*-{
		return this.to;
	}-*/;

	/**
	 * The ending values for the animated properties. Fields may be strings,
	 * numbers, or functions. Supports any unit, provided it matches the "from"
	 * (or default) unit (e.g. {width: '50%', color: 'red', borderColor:
	 * '#ccc'}). If using the default ('px' for length-based units), the unit
	 * may be omitted (e.g. {width: 100, borderColor: 'ccc'}, which defaults to
	 * pixels and hex, respectively).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AnimConfig to(Style val) /*-{
		this.to = val;
		return this;
	}-*/;

	/**
	 * The length of the animation. Defaults to "1" (second).
	 * 
	 * @return
	 */
	public native final double duration() /*-{
		return this.duration;
	}-*/;

	/**
	 * The length of the animation. Defaults to "1" (second).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AnimConfig duration(double val) /*-{
		this.duration = val;
		return this;
	}-*/;

	/**
	 * The object to be animated.
	 * 
	 * @return
	 */
	public native final Node node() /*-{
		return this.node;
	}-*/;

	/**
	 * The object to be animated.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AnimConfig node(Node val) /*-{
this.node = val; 
return this; 
}-*/;

}
