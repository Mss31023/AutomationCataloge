package com.seleniumApplications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	WebDriver driver;
//To launch any browser for automation testing
	
	public void intialiseBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\Downloads");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	}

	public void getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String exp = "flipkart.com";
		if (url.equalsIgnoreCase(exp)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public static void main(String[] args) {
		LaunchBrowser obj = new LaunchBrowser();
		obj.intialiseBrowser();
		obj.getCurrentUrl();

	}

}
