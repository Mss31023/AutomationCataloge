package com.seleniumApplications;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\Downloads");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}
	public void alertHandle() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Welcome to  alert Automation");;
		driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		driver.close();
		
	}

	public static void main(String[] args) {
		Alerts obj=new Alerts();
		obj.launchBrowser();
		obj.alertHandle();
	}

}
