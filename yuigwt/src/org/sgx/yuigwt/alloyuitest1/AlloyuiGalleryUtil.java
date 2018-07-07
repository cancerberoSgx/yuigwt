package org.sgx.yuigwt.alloyuitest1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.sgx.yuigwt.alloyui.AUI;
import org.sgx.yuigwt.alloyui.AUICallback;
import org.sgx.yuigwt.alloyuitest1.test.ButtonItemTest1;
import org.sgx.yuigwt.alloyuitest1.test.ColorPickerTest1;
import org.sgx.yuigwt.alloyuitest1.test.Test;
import org.sgx.yuigwt.yui.util.Util;

public class AlloyuiGalleryUtil {
	Set<Test> tests; 
	Test currentTest;
	private AlloyuiGallery g; 

	public AlloyuiGalleryUtil(AlloyuiGallery g) {
		this.g = g; 
		tests=new HashSet<Test>();
		
		tests.add(new ButtonItemTest1());
		tests.add(new ColorPickerTest1());
		
	}
	/**
	 * return a mapJavaToJs tagName -> Set of test Test - test grouped by tag.
	 * @return
	 */
	public Map<String, Set<Test>> getTestsByTag() {
		Map<String, Set<Test>> m = new HashMap<String, Set<Test>>(); 
		for (Test test : tests) {
			for (int i = 0; i < test.getTags().length; i++) {
				String tag = test.getTags()[i];
				if(!m.containsKey(tag))
					m.put(tag, new HashSet<Test>()); 
				m.get(tag).add(test); 
			}
		}
		return m; 
	}

	public Set<Test> getTests() {
		return tests;
	}
	public Test getCurrentTest() {
		return currentTest;
	}
	public void setCurrentTest(Test currentTest) {
		this.currentTest = currentTest;
	}
	public void setTests(Set<Test> tests) {
		this.tests = tests;
	}
	/**
	 * check for a test=testName paraemter passed in the url
	 * and show that test if that is the case.
	 */
	public void checkUrl() {
		Map<String, String> urlParams = Util.parseUrlParams(Util.getCurrentAddressUrl());
		if(urlParams.containsKey("test")) {
			for(Test t : tests) {
				if(t.getName().equals(urlParams.get("test"))) {
					g.setCurrentTest(t);
				}
			}
		}
	}
	public void loadAui(AUICallback c) {
		
		AUI.AUI(
//			YuiConfig.create().
//			base(AlloyuiGalleryConstants.YUI_BUILD_PATH).
//			gallery("gallery-2011.03.23-22-20")).
			).ready(AlloyuiGalleryConstants.GALLERY_MODULES, c);
		
//		YUI.YUI(YuiConfig.create().base(AlloyuiGalleryConstants.YUI_BUILD_PATH)).
//		use(AlloyuiGalleryConstants.GALLERY_MODULES, c);

	}
	public Test getTestByName(String name) {
		for(Test t : tests) {
			if(t.getName().equals(name))
				return t; 
		}
		return null; 
	}
}
