package com.seleniumApplications;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	WebDriver driver;
	
	public void intialiseBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\Downloads");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//ImplicitWait
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
	}
	public void explicitly() throws InterruptedException{
		WebElement radioBtn=driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5) );
		wait.until(ExpectedConditions.elementToBeClickable(radioBtn));
		radioBtn.click();
		
	}
	public void fluent() {
		WebElement dropDown=driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select sc=new Select(dropDown);
		Wait fwait= new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);
		dropDown.click();
		sc.selectByVisibleText("Option2");
		
		
	}
	public void quitbrowser() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SeleniumWaits obj = new SeleniumWaits();
		obj.intialiseBrowser();
		obj.explicitly();
		obj.fluent();
		obj.quitbrowser();
	}

}
