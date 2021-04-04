package com.udemypractice;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCaseOne {
	
	
	@Test
	public void validatesTitles() {
		
		System.out.println("Beggining");
		
		String expected_title = "Yahoo.com";
		
		String actual_title = "Gmail.com";
	//	Assert.assertEquals(Actual_title , Expected_title );
		
		SoftAssert softassert = new SoftAssert();
		
		System.out.println("validatimg title");
		
		softassert.assertEquals(actual_title, expected_title);
		System.out.println("Validating image");
		
		softassert.assertEquals(true, true);
		
		
		System.out.println("Ending");
		
	}

}
