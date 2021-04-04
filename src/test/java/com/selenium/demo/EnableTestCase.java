package com.selenium.demo;

import org.testng.annotations.Test;

public class EnableTestCase {
	
	@Test(enabled=false)
public void test1() {
		System.out.println("testcase 1");
	}
}
