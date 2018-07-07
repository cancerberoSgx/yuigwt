package org.sgx.yuigwt.yui.test;

import org.sgx.yuigwt.yui.event.EventTarget;
import org.sgx.yuigwt.yui.util.JsObject;

/**
 * @see http://yuilibrary.com/yui/docs/api/classes/Test.Runner.html
 * TODO: all
 * @author sg
 *
 */
public class TestRunner extends EventTarget {
protected TestRunner(){}

//event names
public static final String EVENT_TESTPASS="pass", TEST_PASS_EVENT="pass", 
	EVENT_TESTFAIL="fail", TEST_PASS_FAIL="fail", 
	EVENT_TESTIGNORE="ignore", TEST_IGNORE="ignore", 
	
	EVENT_TESTCASEBEGIN="testcasebegin", TEST_CASE_BEGIN="testcasebegin",
	EVENT_TESTCASECOMPLETE="testcasecomplete", TEST_CASE_COMPLETE="testcasecomplete",

	EVENT_TESTSUITEBEGIN="testsuitebegin", TEST_SUITE_BEGIN="testsuitebegin",
	EVENT_TESTSUITECOMPLETE="testsuitecomplete", TEST_SUITE_COMPLETE="testsuitecomplete"; 

/**
 * Adds a test suite or test case to the list of test objects to run.
 * @param test Either a TestCase or a TestSuite that should be run.
 */
public native final void add(TestCase test) /*-{
this.add(test); 
}-*/;
/**
 * Adds a test suite or test case to the list of test objects to run.
 * @param test Either a TestCase or a TestSuite that should be run.
 */
public native final void add(TestSuite test) /*-{
this.add(test); 
}-*/;
/**
 * Removes all test objects from the runner.
 */
public native final void clear() /*-{
this.clear(); 
}-*/;
/**
 * Indicates if the TestRunner is waiting for a test to resume
 * @return True if the TestRunner is waiting, false if not. 
 */
public native final boolean isWaiting() /*-{
return this.isWaiting(); 
}-*/;

/**
 * Indicates if the TestRunner is waiting for a test to resume
 * @return True if the TestRunner is waiting, false if not. 
 */
public native final boolean isRunning() /*-{
return this.isRunning(); 
}-*/;

//TODO: run(options), resume(), setName, etc
/** 
 * Runs the test suite.
 */
public native final void run() /*-{
this.run(); 
}-*/;
}
