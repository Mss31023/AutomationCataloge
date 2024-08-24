package com.seleniumApplications;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionsInSeleniium {
	WebDriver driver;
	Actions actobj;
	public void intialiseBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\Downloads");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}
	public void mouseactions() throws InterruptedException {
		 actobj=new Actions(driver);
		 Thread.sleep(3000);
		 //to escape from sign in pop up
		 WebElement signin=driver.findElement(By.xpath("//*[@id='nav-signin-tooltip']"));
		 actobj.sendKeys(Keys.ESCAPE).perform();
		 WebElement target=driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
		 //mouse hover to a particular element
		 actobj.moveToElement(target).build().perform();
		 Thread.sleep(3000);
		//double click on element
		 WebElement ele=driver.findElement(By.xpath("//*[text()='Music Library']"));
		 actobj.doubleClick(ele).build().perform();
		 driver.navigate().back();
		 Thread.sleep(3000);
		 //right click on element
		 actobj.moveToElement(target).contextClick(target).build().perform();
		 
		 
		
		
	}
	public void sendData() {
	WebElement searchbox=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	//command for text in uppercase
	actobj.click(searchbox).keyDown(Keys.SHIFT).sendKeys("sarees").build().perform();
	}
	

	public static void main(String[] args) throws InterruptedException {
		ActionsInSeleniium obj=new ActionsInSeleniium();
		obj.intialiseBrowser();
		obj.mouseactions();
		obj.sendData();

	}

}
