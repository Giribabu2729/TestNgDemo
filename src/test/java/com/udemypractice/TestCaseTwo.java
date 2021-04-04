package com.udemypractice;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestCaseTwo {
	
	@Test(priority=1)
	public void doUserReg() {
		System.out.println("user reg");
		//Assert.fail("user not registered");
	}
	
	
	@Test(priority=2,dependsOnMethods="doUserReg")
	public void login() {
		System.out.println("excute login");
	}
	
	@Test(priority=3,dependsOnMethods="doUserReg", alwaysRun=true)
	public void  thirdTest() {
		System.out.println("third test");
	}
	@Test(priority=3,dependsOnMethods="doUserReg")
	public void fourthTest() {
		System.out.println("fourth test");
	}
	

	
	

}
