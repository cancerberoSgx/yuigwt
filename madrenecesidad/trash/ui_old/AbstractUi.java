package org.sgx.madrenecesidad.client.trash.ui_old;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.node.Node;

public abstract class AbstractUi implements Ui {
	private static final String DEFAULT_SOURCENODETAG = "div";
	protected YuiContext y;
	private Node parent, srcNode;
	String srcNodeTag = DEFAULT_SOURCENODETAG;
	private boolean rendered; 
	
	public AbstractUi(YuiContext y) {
		this.y=y; 
	}

	public Console getConsole() {
		return Main.getInstance().getConsole(); 
	}
	public String getSrcNodeTag() {
		return srcNodeTag;
	}
	public void setSrcNodeTag(String srcNodeTag) {
		this.srcNodeTag = srcNodeTag;
	}
	@Override
	public void render(Node parent) {
		this.parent = parent; 
		srcNode = parent.appendChild("<"+getSrcNodeTag()+"></"+getSrcNodeTag()+">"); 
		this.rendered = true; 
	}

	public Node getParent() {
		return parent;
	}
	public Node getSrcNode() {
		return srcNode;
	}
	public boolean isRendered() {
		return rendered;
	}
}
