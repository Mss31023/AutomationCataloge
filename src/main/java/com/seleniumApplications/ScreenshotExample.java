package com.seleniumApplications;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotExample {
	WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\Downloads");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
	}
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sharmavarma");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("spl@234");
		driver.findElement(By.xpath("//*[@name='Login']")).click();
		Thread.sleep(3000);
		

	}
	public void screenshot() throws Exception {
		TakesScreenshot src=((TakesScreenshot)driver);
		File srcfile=src.getScreenshotAs(OutputType.FILE);
		File destifile=new File("C:\\Users\\lenovo\\Desktop\\seleniumscr.jpg");
		FileHandler.copy(srcfile, destifile);
	}

	public static void main(String[] args) throws Exception {
		ScreenshotExample obj =new ScreenshotExample();
		obj.launchBrowser();
		obj.login();
		obj.screenshot();

	}

}
