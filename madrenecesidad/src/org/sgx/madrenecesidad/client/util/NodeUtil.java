package org.sgx.madrenecesidad.client.util;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;

public class NodeUtil {
	public static void hide(Node n) {
		n.setStyles(Style.create().display("none"));
	}

	public static void show(Node n) {
		n.setStyles(Style.create().display("block"));
	}
}
