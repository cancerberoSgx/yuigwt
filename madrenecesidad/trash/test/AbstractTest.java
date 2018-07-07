package org.sgx.madrenecesidad.client.trash.test;

import java.util.LinkedList;
import java.util.List;

import org.sgx.madrenecesidad.client.trash.ui_old.Main;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;

public abstract class AbstractTest {
protected YuiContext y;

public AbstractTest (YuiContext y) {
	this.y=y; 
	asserts=new LinkedList<TestAssert>(); 
}
public abstract void test(); 
protected List<TestAssert> asserts; 
public boolean assertTrue(boolean b, String msg) {
//	getConsole().log("asserttrue"); 
	asserts.add(new TestAssert(msg, !b)); 
	return b; 
}

protected  Console getConsole() {
	return Main.getInstance().getConsole(); 
}
public void fail(String msg) {
	asserts.add(new TestAssert(msg, true)); 
}

protected String printTestResults() {
	String s = "Test Results: ", s2 = "";
	int ok = 0, failed = 0; 
	for(TestAssert t : asserts) {
		if(t.isFail()) {
			failed++;
			s2+="\nFAILED #"+failed+" msg == \""+t.getMsg()+"\"."; 
		}
		else
			ok++; 
	}
	return s+"total: "+asserts.size()+", ok: "+ok+", failed: "+failed+". Failures: "+s2; 
}

}
