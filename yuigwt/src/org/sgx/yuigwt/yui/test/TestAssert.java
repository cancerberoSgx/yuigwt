package org.sgx.yuigwt.yui.test;

import com.google.gwt.core.client.JavaScriptObject;

/**static utilities Y.Test.Assert and Y.Assert
 * http://yuilibrary.com/yui/docs/api/classes/Test.Assert.html
 * TODO: All
 * @author sg
 *
 */
public class TestAssert extends JavaScriptObject{
protected TestAssert(){}

	
//fail
	
/**
 * Forces an assertion error to occur.
 * @param message  (Optional) The message to display with the failure.
 */
public native final void fail(String message) /*-{
this.fail(message); 
}-*/;
/**
 * Forces an assertion error to occur.
 */
public native final void fail() /*-{
this.fail(); 
}-*/;
	







	
	
	
//areEqual
	
/**
 * Asserts that a value is equal to another. This uses the double equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 */
public native final void areEqual(String expected, String actual) /*-{
this.areEqual(expected, actual); 
}-*/;
/**
 * Asserts that a value is equal to another. This uses the double equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 * @param message (Optional) The message to display if the assertion fails.
 */
public native final void areEqual(String expected, String actual, String message) /*-{
this.areEqual(expected, actual, message); 
}-*/;

/**
 * Asserts that a value is equal to another. This uses the double equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 */
public native final void areEqual(double expected, double actual) /*-{
this.areEqual(expected, actual); 
}-*/;
/**
 * Asserts that a value is equal to another. This uses the double equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 * @param message (Optional) The message to display if the assertion fails.
 */
public native final void areEqual(double expected, double actual, String message) /*-{
this.areEqual(expected, actual, message); 
}-*/;

/**
 * Asserts that a value is equal to another. This uses the int equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 */
public native final void areEqual(int expected, int actual) /*-{
this.areEqual(expected, actual);
}-*/;
/**
 * Asserts that a value is equal to another. This uses the int equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 * @param message (Optional) The message to display if the assertion fails.
 */
public native final void areEqual(int expected, int actual, String message) /*-{
this.areEqual(expected, actual, message); 
}-*/;

/**
 * Asserts that a value is equal to another. This uses the boolean equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 */
public native final void areEqual(boolean expected, boolean actual) /*-{
this.areEqual(expected, actual); 
}-*/;
/**
 * Asserts that a value is equal to another. This uses the boolean equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 * @param message (Optional) The message to display if the assertion fails.
 */
public native final void areEqual(boolean expected, boolean actual, String message) /*-{
this.areEqual(expected, actual, message); 
}-*/;

/**
 * Asserts that a value is equal to another. This uses the Object equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 */
public native final void areEqual(Object expected, Object actual) /*-{
this.areEqual(expected, actual); 
}-*/;
/**
 * Asserts that a value is equal to another. This uses the Object equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 * @param message (Optional) The message to display if the assertion fails.
 */
public native final void areEqual(Object expected, Object actual, String message) /*-{
this.areEqual(expected, actual, message); 
}-*/;









//areNotEqual

/**
 * Asserts that a value is not equal to another. This uses the double equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 */
public native final void areNotEqual(String expected, String actual) /*-{
this.areNotEqual(expected, actual); 
}-*/;
/**
 * Asserts that a value is not equal to another. This uses the double equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 * @param message (Optional) The message to display if the assertion fails.
 */
public native final void areNotEqual(String expected, String actual, String message) /*-{
this.areNotEqual(expected, actual, message); 
}-*/;

/**
 * Asserts that a value is not equal to another. This uses the double equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 */
public native final void areNotEqual(double expected, double actual) /*-{
this.areNotEqual(expected, actual); 
}-*/;
/**
 * Asserts that a value is not equal to another. This uses the double equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 * @param message (Optional) The message to display if the assertion fails.
 */
public native final void areNotEqual(double expected, double actual, String message) /*-{
this.areNotEqual(expected, actual, message); 
}-*/;

/**
 * Asserts that a value is not equal to another. This uses the int equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 */
public native final void areNotEqual(int expected, int actual) /*-{
this.areNotEqual(expected, actual); 
}-*/;
/**
 * Asserts that a value is not equal to another. This uses the int equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 * @param message (Optional) The message to display if the assertion fails.
 */
public native final void areNotEqual(int expected, int actual, String message) /*-{
this.areNotEqual(expected, actual, message); 
}-*/;

/**
 * Asserts that a value is not equal to another. This uses the boolean equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 */
public native final void areNotEqual(boolean expected, boolean actual) /*-{
this.areNotEqual(expected, actual); 
}-*/;
/**
 * Asserts that a value is not equal to another. This uses the boolean equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 * @param message (Optional) The message to display if the assertion fails.
 */
public native final void areNotEqual(boolean expected, boolean actual, String message) /*-{
this.areNotEqual(expected, actual, message); 
}-*/;

/**
 * Asserts that a value is not equal to another. This uses the Object equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 */
public native final void areNotEqual(Object expected, Object actual) /*-{
this.areNotEqual(expected, actual); 
}-*/;
/**
 * Asserts that a value is not equal to another. This uses the Object equals sign so type coercion may occur.
 * @param expected The expected value.
 * @param actual The actual value to test.
 * @param message (Optional) The message to display if the assertion fails.
 */
public native final void areNotEqual(Object expected, Object actual, String message) /*-{
this.areNotEqual(expected, actual, message); 
}-*/;
}
