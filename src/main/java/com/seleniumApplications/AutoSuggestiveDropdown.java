package com.seleniumApplications;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestiveDropdown {


	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\\\WebDrivers\\\\geckodriver-v0.33.0-win64\\\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ho");
		List<WebElement> options=driver.findElements(By.xpath("//*[@class='s-suggestion-container']/div"));
		for(WebElement opt:options) {
			String name=opt.getText();
			if(name.equalsIgnoreCase("home decor items")){
				opt.click();
				break;
			}
		}
		
		
		driver.close();
		
	}

}
