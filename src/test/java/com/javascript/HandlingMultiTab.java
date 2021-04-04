package com.javascript;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultiTab {
	@Test
	public void handlingTabs() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
	    driver.findElement(By.linkText("Click Here")).click();
	    
	    String windowHandler  = driver.getWindowHandle();
	    ArrayList tabs  = new ArrayList(driver.getWindowHandles());
	    System.out.println(tabs.size());
	    
	    driver.switchTo().window((String) tabs.get(0));
	    
	    WebElement element2  = driver.findElement(By.xpath("/html/body/div/h3"));
	    System.out.println(element2.getText());
	    Thread.sleep(1000);
	    driver.switchTo().window(windowHandler);
	    
	    driver.close();
		
	}

}
