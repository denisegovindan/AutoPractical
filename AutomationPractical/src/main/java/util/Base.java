package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path + "\\src\\main\\resources\\chromedriver.exe");
		 //driver = new ChromeDriver();//default config for chromedriver
		 driver = new Waits();//Overide execute ChromeDriver 		
         driver.get("http://automationpractice.com/");
         driver.manage().window().maximize();
		return driver;

	}

}
