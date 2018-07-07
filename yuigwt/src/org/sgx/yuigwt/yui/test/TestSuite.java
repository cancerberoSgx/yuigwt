package org.sgx.yuigwt.yui.test;

import org.sgx.yuigwt.yui.util.JsObject;
/**
 * http://yuilibrary.com/yui/docs/api/classes/Test.TestSuite.html
 * @author sg
 *
 */
public class TestSuite extends JsObject {
protected TestSuite(){}
/**
 * 
 * @return the attribute
 */
public final native String name()/*-{
return this["name"];
}-*/;

/**
 * 
 * @param val
 * @return self for method chaining
 */
public final native TestSuite name(String val)/*-{
this["name"] = val; 
return this; 
}-*/;

/**
 * Adds a test suite or test case to the test suite.
 * @param val The test suite or test case to add.
 * @return self for method chaining
 */
public final native TestSuite add(TestCase test)/*-{
this.add(test); 
return this; 
}-*/;
/**
 * Adds a test suite or test case to the test suite.
 * @param val The test suite or test case to add.
 * @return self for method chaining
 */
public final native TestSuite add(TestSuite test)/*-{
this.add(test); 
return this; 
}-*/;
}

