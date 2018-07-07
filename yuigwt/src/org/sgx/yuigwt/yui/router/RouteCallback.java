package org.sgx.yuigwt.yui.router;

import org.sgx.yuigwt.yui.util.SimpleCallback;

public interface RouteCallback {
	void call(RouteRequest req, RouteResponse res, SimpleCallback next);
}
