package com.seleniumProject.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class EcommerceHomePage extends OrangeHRMBase {
	Actions actobj= new Actions(driver);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	public static By logo=By.xpath("//*[@id='nav-logo']");
	public static By searchbtn=By.xpath("//*[@id='twotabsearchtextbox']");
	public static By newbtn=By.xpath("//*[text()='New']");
	public static By filter=By.xpath("//*[text()='4 to 5.9 GB']");
	public static By osfilter=By.xpath("//*[text()='iOS']");
	public static By target=By.xpath("//*[contains(text(),'Apple iPhone SE 5G')]");
	public static By cartBtn=By.xpath("//*[@id='add-to-cart-button']");
	public static By confirmMsgCartAdded=By.xpath("//*[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']");
	public static By goToCart=By.xpath("//*[@id='nav-cart-count']");
	public static By addedProductInCart=By.xpath("//*[contains(text(),'Tracfone Apple iPhone SE 5G')]");

	
	
	
	
	
	public void verifyTitle() {
		String actTitle=driver.getTitle();
		String expTitle="Amazon.com. Spend less. Smile more.";
		Assert.assertEquals(actTitle, expTitle);
	}
	public void verifyLogo() throws InterruptedException {
		Thread.sleep(9000);

		boolean flag=driver.findElement(logo).isDisplayed();
		

		Assert.assertTrue(flag);
	}
	public void findElement() throws Exception {
		driver.findElement(searchbtn).click();
		Thread.sleep(3000);

		actobj.keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();
		Thread.sleep(3000);

		actobj.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(newbtn).click();
		Thread.sleep(3000);

		actobj.keyDown(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);

		driver.findElement(osfilter).click();
		
		Thread.sleep(8000);
		
		//actobj.keyDown(Keys.ARROW_DOWN).build().perform();
		//Thread.sleep(3000);

		//driver.findElement(filter).click();
		//Thread.sleep(3000);

		driver.findElement(target).click();
		Thread.sleep(3000);


		
		
	}
	public void addToCart() throws InterruptedException {
		driver.findElement(cartBtn).click();
		Thread.sleep(3000);

		boolean add=driver.findElement(confirmMsgCartAdded).isDisplayed();
		Thread.sleep(5000);
		Assert.assertTrue(add);
		driver.findElement(goToCart).click();
		Thread.sleep(3000);

		boolean x=driver.findElement(target).isDisplayed();
		Thread.sleep(3000);

		//Assert.assertTrue(x);
	}
	

}
