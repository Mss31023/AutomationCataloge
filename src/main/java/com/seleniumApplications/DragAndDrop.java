package com.seleniumApplications;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\Downloads");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	}
	public void dragAnddrop() {
		Actions a=new Actions(driver);
		WebElement w=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(w);
		WebElement src=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath("//*[@id='droppable']"));
		a.dragAndDrop(src, dest).build().perform();
		driver.close();

	}

	public static void main(String[] args) {
		DragAndDrop obj=new DragAndDrop();
		obj.launchBrowser();
		obj.dragAnddrop();
		
	}

}
