package org.sgx.yuigwt.jyui;

import org.sgx.yuigwt.yui.YuiContext;
/**
 * 
 * @author sg
 *
 */
public class AbstractYObjectWithContext extends AbstractYObject {

	public AbstractYObjectWithContext(YuiContext y) {
		super();
		_yuiContext = y;
	}

	protected YuiContext _yuiContext;

	public YuiContext getContext() {
		return _yuiContext;
	}
}
