package org.sgx.yuigwt.yui.widget.button;

/**
 * 
 * @author sg
 * 
 */
public class ToggleButton extends Button {
	protected ToggleButton() {
	}

	/**
	 * Toggles the selected/pressed/checked state of a ToggleButton
	 * 
	 * @return
	 */
	public native final ToggleButton toggle()/*-{
		this.toggle();
		return this;
	}-*/;

}
