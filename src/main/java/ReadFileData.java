import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFileData {

	public static void main(String[] args) {
		
		 final String propFile =  null;
		
		/*
		 * final String propFile = System.getProperty("user.dir") +
		 * "\resources\datafile.properties";
		 */
		
		
		 
		File file = new File(propFile);
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		WebDriver driver = new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(
				prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(
				prop.getProperty("password"));
		driver.findElement(By.className("loginbtn")).click();

		System.out.println("URL ::" + prop.getProperty("url"));
		System.out.println("User name::" + prop.getProperty("username"));
		System.out.println("Password::" + prop.getProperty("password"));

	}

}
