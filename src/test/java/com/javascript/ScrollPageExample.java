package com.javascript;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPageExample {
  @Test
  public void scroll() {
	  
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		
		ex.executeScript("window.scrollBy(0,500)");
		
		
		ex.executeScript("window.scrollBy(0,-500)");
		
  }
}
