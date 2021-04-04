package com.w2a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AalertExample01 {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// driver.findElement(By.xpath("//button[text()='Click for JS
		// Alert']")).click();

		/*
		 * Alert a1 = driver.switchTo().alert(); String alert = a1.getText();
		 * System.out.println("alert"); a1.accept();
		 * driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).
		 * click();
		 * 
		 * System.out.println(a1.getText()); a1.dismiss();
		 */
		
		Thread.sleep(10000);
		driver.close();

	}

}
