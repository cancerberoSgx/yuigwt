package org.sgx.yuigwt.yui.test;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JsArrayString;

/**
 * For TEST_CASE_COMPLETE_EVENT, an additional property called results is included. The results property is an object containing the aggregated results for all tests in the test case (it does not include information about tests that were ignored). Each test that was run has an entry in the result object where the property name is the name of the test method and the value is an object with two properties: result, which is either "pass" or "fail", and message, which is a text description of the result (simply "Test passed" when a test passed or the error message when a test fails). Additionally, the failed property indicates the number of tests that failed in the test case, the passed property indicates the number of tests that passed, and the total property indicates the total number of tests executed. A typical results object looks like this:
 * 
 * @see http://yuilibrary.com/yui/docs/test/#testcase-level-events
 * @author sg
 *
 */
public class TestCaseResult extends JsObject{
protected TestCaseResult(){}
/**
 * 
 * @return
 */
public native final int failed() /*-{
return this.failed; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TestCaseResult failed(int val) /*-{
this.failed = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final int passed() /*-{
return this.passed; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TestCaseResult passed(int val) /*-{
this.passed = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final int ignored() /*-{
return this.ignored; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TestCaseResult ignored(int val) /*-{
this.ignored = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final int total() /*-{
return this.total; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TestCaseResult total(int val) /*-{
this.total = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final String type() /*-{
return this.type; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TestCaseResult type(String val) /*-{
this.type = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final String name() /*-{
return this.name; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TestCaseResult name(String val) /*-{
this.name = val; 
return this; 
}-*/;
public native final JsArrayString getTestMethodNames() /*-{
var arr = []; 
for(var i in this) {
	var propName = i+""; 
	if(propName.indexOf("test")==0) {
		arr.push(propName); 
	}
	return arr; 
}
}-*/;
public native final TestMethodResult getTestMethodResult(String testMethodName) /*-{
return this[testMethodName] || null; 
}-*/;
}
