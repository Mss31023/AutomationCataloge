package com.seleniumApplications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\Downloads");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
	}
	public void ddownHandle() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Varma");
		WebElement ddown=driver.findElement(By.name("UserTitle"));
		
		Select slcobj=new Select(ddown);
		Thread.sleep(3000);

		slcobj.selectByIndex(2);
		Thread.sleep(3000);
		slcobj.selectByVisibleText("Operations Manager");
		Thread.sleep(3000);
		slcobj.selectByValue("Sales_Manager_ANZ");

		driver.close();

	}
	public static void main(String[] args) throws InterruptedException {
		DropDownExample obj =new DropDownExample();
		obj.launchBrowser();
		obj.ddownHandle();

	}

}
