package com.seleniumProject.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumProject.pages.commonPage.Page;

public class OrangeHRMBase  implements Page{
	 public static WebDriver driver;
	 public static Properties prop =new Properties();
	
		
	@BeforeMethod
	public void intializeBrowser() throws Exception {
		if(driver ==null) {
			 FileInputStream input =new FileInputStream("D:\\Projects\\AutomationCatalog\\src\\main\\java\\config\\config.properties");
			 prop.load(input);
		}
		//String driverPath="D:\\WebDrivers\\geckodriver-v0.33.0-win64\\geckodriver.exe";
		//String driverKey="webdriver.gecko.driver";
		System.setProperty(prop.getProperty("driverKeyGecko"), prop.getProperty("driverPathGecko"));
		

		driver = new FirefoxDriver();
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
		
		
		
		
	}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
