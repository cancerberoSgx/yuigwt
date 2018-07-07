package org.sgx.yuigwt.yui.test;

import org.sgx.yuigwt.yui.event.EventFacade;

/**
 * @see http://yuilibrary.com/yui/docs/test/#testrunner-events
 * @author sg
 *
 */
public class TestEvent extends EventFacade {
	protected TestEvent(){}
/**
 * the test case that is currently being run. 
 * @return
 */
public native final TestCase testCase() /*-{
return this.testCase; 
}-*/;

/**
 * the test case that is currently being run.
 * @param val
 * @return this - for setter chaining
 */
public native final TestEvent testCase(TestCase val) /*-{
this.testCase = val; 
return this; 
}-*/;

/**
 * the test suite that is currently being run. 
 * @return
 */
public native final TestSuite testSuite() /*-{
return this.testSuite; 
}-*/;

/**
 * the test suite that is currently being run.
 * @param val
 * @return this - for setter chaining
 */
public native final TestEvent testSuite(TestSuite val) /*-{
this.testSuite = val; 
return this; 
}-*/;

///**
// * the name of the test that was just executed or ignored.
// * @return
// */
//public native final String name() /*-{
//return this.name; 
//}-*/;

///**
// * the name of the test that was just executed or ignored.
// * @param val
// * @return this - for setter chaining
// */
//public native final TestEvent name(String val) /*-{
//this.name = val; 
//return this; 
//}-*/;

public native final TestCaseResult resultsTestCase() /*-{
return this.results; 
}-*/;

public native final TestSuiteResult resultsTestSuite() /*-{
return this.results; 
}-*/;
}
