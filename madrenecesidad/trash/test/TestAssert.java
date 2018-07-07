package org.sgx.madrenecesidad.client.trash.test;
public class TestAssert {
	String msg; 
	boolean fail;
	
	public TestAssert(String msg, boolean fail) {
		super();
		this.msg = msg;
		this.fail = fail;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isFail() {
		return fail;
	}
	public void setFail(boolean fail) {
		this.fail = fail;
	} 
	
}