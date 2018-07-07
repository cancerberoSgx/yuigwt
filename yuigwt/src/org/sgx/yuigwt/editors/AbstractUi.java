package org.sgx.yuigwt.editors;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
/**
 * 
 * @author sg
 *
 */
public abstract class AbstractUi implements Ui {
	protected YuiContext y;
	private Node parent;
	protected Node srcNode;
	private boolean rendered;

	public AbstractUi(YuiContext y) {
		this.y = y;
	}

	
	public void render(Node parent) {
		this.parent = parent;
		this.rendered = true;
	}

	public Node getParent() {
		return parent;
	}

	public Node getSrcNode() {
		return srcNode;
	}

	/**
	 * only intended to be called by subclasses.
	 * 
	 * @param n
	 * @return
	 */
	protected void setSrcNode(Node n) {
		this.srcNode = n;
	}

	public boolean isRendered() {
		return rendered;
	}

	public YuiContext getContext() {
		return y;
	}

	public YuiGalleryContext getGalleryContext() {
		return y.cast();
	}
}
