package org.sgx.madrenecesidad.client.trash.ui_old.crud;

import org.sgx.madrenecesidad.client.trash.ui_old.AbstractUi;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;

public abstract class AbstractCrudUi<T> extends AbstractUi implements Crud<T> {

	public AbstractCrudUi(YuiContext y) {
		super(y);
	}
	
	@Override
	public void render(Node parent) {
		super.render(parent);
	}

}
