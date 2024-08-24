package com.seleniumApplications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\\\WebDrivers\\\\geckodriver-v0.33.0-win64\\\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("//*[@class='gLFyf']")).sendKeys("sports");
		

	}

}
