package org.sgx.yuigwt.jyui.cssgrids;

import java.util.*;
import org.sgx.yuigwt.jyui.widget.*;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.cssgrids.*;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.Widget;

/**
 * a custom widget that try to be a widget container laying out its childs using cssgrids
 * @author: sg
 */
public class GridPanel extends YWidget {
	private GridRow gridRow;
	List<Object> childs;

	public GridPanel(YuiContext y) {
		super(y);
		gridRow = new GridRow();
		childs = new LinkedList<Object>();
		setWrapped(y.newWidget());
	}

	
	public void afterRender() {
		gridRow.render(getContext(), srcNode());
		int i = 0;
		for (Object child : childs) {
			if (child instanceof Widget) {
				((Widget) child).render(gridRow.get(i).getSource());
			} else if (child instanceof YWidget) {
				((YWidget) child).render(gridRow.get(i).getSource());
			} else if (child instanceof Node) {
				gridRow.get(i).getSource().append(((Node) child));
			}
			i++;
		}
	}

	/**
	 * @param unitSize
	 *            cssgrids unitsizes for this grid entry @see
	 *            http://yuilibrary.com/yui/docs/cssgrids/#unit-sizes
	 * @param child
	 *            could be a Widget, an YWidget or a Node
	 */
	public void addChild(String unitSize, Object child) {
		childs.add(child);
		GridEntry gridEntry = new GridEntry(unitSize, null);
		gridRow.add(gridEntry);
	}
}