package org.sgx.yuigwt.yui.test;

import org.sgx.yuigwt.yui.sortable.SortableConfig;
import org.sgx.yuigwt.yui.util.Callback;
import org.sgx.yuigwt.yui.util.JsFunction;
import org.sgx.yuigwt.yui.util.JsObject;

/**
 * new Y.Test.Case({});
 * @see http://yuilibrary.com/yui/docs/api/classes/Test.TestCase.html 
 * @author sg
 *
 */
public class TestCaseConfig extends JsObject {
protected TestCaseConfig(){}
public static final native TestCaseConfig create()/*-{
return {};
}-*/;
/**
 * 
 * @return self for method chaining
 */
public native final TestCaseConfig method(String methodName, Callback callback) /*-{
this[methodName] = @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/Callback;)(callback); 
return this; 
}-*/;

/**
 * 
 * @return self for method chaining
 */
public native final TestCaseConfig method(String methodName, JsFunction callback) /*-{
this[methodName] = callback; //@org.sgx.yuigwt.yui.util.JsUtil::toJsFunction(Lorg/sgx/yuigwt/yui/util/Callback;)(callback); 
return this; 
}-*/;
}
