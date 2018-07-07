package org.sgx.madrenecesidad.client.trash.ui_old;

import org.sgx.yuigwt.yui.node.Node;
/**
 * my "widget" main class - artificiality for working / extending GUI hierarchy class with yui widgets.  
 * @author sg
 *
 */
public interface Ui {
	void render(Node parent); 
	Node getParent(); 
	Node getSrcNode(); 
	boolean isRendered(); 
}
