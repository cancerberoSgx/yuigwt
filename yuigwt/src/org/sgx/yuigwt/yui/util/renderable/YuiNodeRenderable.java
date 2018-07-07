package org.sgx.yuigwt.yui.util.renderable;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;

/**
 * 
 * @author sg
 *
 */
public interface YuiNodeRenderable {
void render(YuiContext Y, Node parent); 
Node getSource(); 
}
