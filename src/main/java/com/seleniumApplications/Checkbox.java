package com.seleniumApplications;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\\\WebDrivers\\\\geckodriver-v0.33.0-win64\\\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		driver.findElement(By.xpath("//input[@type='checkbox' and @id='c_bs_1']"));
	}

}
