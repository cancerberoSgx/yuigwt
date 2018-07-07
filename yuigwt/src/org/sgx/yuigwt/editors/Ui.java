package org.sgx.yuigwt.editors;

import org.sgx.yuigwt.yui.YuiConfig.Module;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeBase;
/**
 * a very simple Ui class   
 * @author sg
 *
 */
public interface Ui {
	void render(Node parent); 
	Node getParent(); 
	Node getSrcNode(); 
	boolean isRendered(); 
//	String[] requiredYuiModules(); 
//	Module[] requiredYuiModulesConfig(); 
}
