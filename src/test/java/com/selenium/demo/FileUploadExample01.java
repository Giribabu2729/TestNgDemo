package com.selenium.demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadExample01 {
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Actions a = new Actions(driver);
		WebElement element =driver.findElement(By.id("file-submit"));
		a.moveToElement(element).click().perform();
		
		Runtime.getRuntime().exec("C:\\Users\\gurub\\madhuri\\myupload2.exe");
		
	}

}
