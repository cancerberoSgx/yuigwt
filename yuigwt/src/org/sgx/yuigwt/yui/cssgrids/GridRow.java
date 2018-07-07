package org.sgx.yuigwt.yui.cssgrids;

import java.util.LinkedList;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.renderable.YuiNodeRenderable;

/**
 * 
 * @author sg
 *
 */
public class GridRow extends LinkedList<GridEntry> implements YuiNodeRenderable {

	private static final long serialVersionUID = 1L;
	
	private Node srcNode;
//	private List<GridEntry> entries; 

	
	public void render(YuiContext Y, Node parent) {
		srcNode = parent.appendChild("<div class=\"yui3-g\"></div>");
		for(GridEntry entry : this) {
			entry.render(Y, srcNode); 
		}
	}

	
	public Node getSource() {
		return srcNode; 
	}

	
}
