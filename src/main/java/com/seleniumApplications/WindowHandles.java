package com.seleniumApplications;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\Downloads");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String pwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Admin area']")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String handles : windows) {
			if (!handles.equalsIgnoreCase(pwindow)) {
				driver.switchTo().window(handles);
				driver.findElement(By.id("Email")).clear();
				Thread.sleep(2000);
				driver.findElement(By.id("Email")).sendKeys("abc@gamil.com");
				driver.findElement(By.id("Password")).clear();
				Thread.sleep(2000);

				driver.findElement(By.id("Email")).sendKeys("mjl123");
				Thread.sleep(2000);

				driver.findElement(By.xpath("//*[text()='Log in']")).click();
				Thread.sleep(2000);

			}
		}

		driver.close();

	}

}
