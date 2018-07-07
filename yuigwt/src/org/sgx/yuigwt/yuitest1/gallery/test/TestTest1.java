package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.asyncqueue.AsyncQueue;
import org.sgx.yuigwt.yui.asyncqueue.AsyncQueueEvent;
import org.sgx.yuigwt.yui.asyncqueue.AsyncQueueItem;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.test.TestCase;
import org.sgx.yuigwt.yui.test.TestCaseJsClass;
import org.sgx.yuigwt.yui.test.TestEvent;
import org.sgx.yuigwt.yui.test.TestRunner;
import org.sgx.yuigwt.yui.test.TestSuite;
import org.sgx.yuigwt.yui.util.JsFunction;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.SimpleCallback;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.util.jsclass.JsClass;
import org.sgx.yuigwt.yui.util.jsclass.Test1.Apple;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Window;

/**
 * test
 * 
 * @author sg
 * 
 */
public class TestTest1 extends AbstractTest {

	protected Console console;

	public TestTest1() {
		super("TestTest1", "TestTest1", new String[] { GalleryConstants.TAG_ASYNCQUEUE, GalleryConstants.TAG_UTILS }, TestResources.instance.AyncQueueTest1());
	}

	public static class TestCase1 extends TestCaseJsClass {
		public void testSomething() {
			y.TestAssert().fail("fail1");
		}
	}

	public static class TestCase2 extends TestCaseJsClass {
		public void testSomethingElse() {
			y.TestAssert().areEqual(123, 234);
		}
	}

	
	public void test(final Node parent) {
		YUI.Use(new String[] { "test", "dump", "console" }, new YUICallback() {

			
			public void ready(final YuiContext Y) {
				console = Y.newConsole();
				console.render();

				TestCase1 test1Config = GWT.create(TestCase1.class);
				test1Config.setName("testcase1");
				TestCase testCase1 = Y.newTestCase(test1Config);

				TestCase2 test2Config = GWT.create(TestCase2.class);
				test2Config.setName("testcase2");
				TestCase testCase2 = Y.newTestCase(test2Config);

				TestSuite testSuite1 = Y.newTestSuite("testsute1");
				testSuite1.add(testCase1);
				testSuite1.add(testCase2);

				Y.TestRunner().on(TestRunner.EVENT_TESTCASECOMPLETE, new EventCallback<TestEvent>() {
					
					public void call(TestEvent e) {
						console.log("AAAAAAA JAJAJAJA: "+"name: "+e.resultsTestSuite().name()+", failed: "+e.resultsTestSuite().failed());
					}
				});
				Y.TestRunner().add(testSuite1);
				Y.TestRunner().run();
			}
		});
	}

}
