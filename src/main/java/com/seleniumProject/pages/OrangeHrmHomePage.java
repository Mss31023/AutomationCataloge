package com.seleniumProject.pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class OrangeHrmHomePage extends OrangeHRMBase {
	Actions actobj = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public static By BtnPimPage = By
			.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='PIM']"); //// *[@href='/web/index.php/pim/viewPimModule']
	public static By BtnEmployeeList = By.xpath("//*[text()='Employee List']");
	public static By BtnAddPimPage = By
			.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary' and text()=' Add ']");
	public static By txtBoxfirstName = By.xpath("//*[@name='firstName']");
	public static By txtBoxMiddleName = By.xpath("//*[@name='middleName']");
	public static By txtBoxLastName = By.xpath("//*[@name='lastName']");
	public static By BtnSave = By.xpath(
			"//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' and @type='submit']");
	public static By expiryDate = By.xpath("(//*[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]");

	public static By CalDate = By.xpath("//*[@class='oxd-calendar-date']");
	public static By CalTodayDate = By.xpath("//*[@class='oxd-calendar-date --selected --today']");
	public static By CalDDMonth = By.xpath("//*[@class='oxd-calendar-selector-month']");
	public static By CalDDYear = By.xpath("//*[@class='oxd-calendar-selector-year']");
	public static By CalDDOptions = By
			.xpath("//*[@class='oxd-calendar-dropdown']/[@class='oxd-calendar-dropdown--option']");

	public static By txtBoxEmpName = By
			.xpath("//*[text()='Employee Name']/../..//input");
	public static By BtnSearch = By.xpath(
			"//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' and @type='submit']");
	public static By TxtNorecord = By.xpath(
			"//*[@class='orangehrm-horizontal-padding orangehrm-vertical-padding' or contains(text(),'No Records Found')]");

	private static OrangeHrmHomePage instance = null;
	static Logger Log = Logger.getLogger(OrangeHrmHomePage.class.getName());

	public static OrangeHrmHomePage getInstance() {

		if (null == instance) {
			instance = new OrangeHrmHomePage();
		}
		return instance;
	}

	public void PIMPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(BtnPimPage).click();
		System.out.println("PimPage is clicked");

		driver.findElement(BtnEmployeeList).click();
		System.out.println("BtnEmployeeList is clicked");
		Thread.sleep(3000);
	}

	public void searchRecordsByEmpName(String empname) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Entered in search");
		driver.findElement(txtBoxEmpName).sendKeys(empname);
		actobj.moveToElement(driver.findElement(BtnSearch)).click().perform();
		System.out.println("Search is done");
		boolean flag = driver.findElement(TxtNorecord).isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("Norecord found verified");

	}

	public void AddemployeeDetails1() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actobj.moveToElement(driver.findElement(BtnAddPimPage)).click().perform();
		System.out.println("BtnAddPimPage is clicked");

		driver.findElement(txtBoxfirstName).sendKeys("Richel");
		driver.findElement(txtBoxMiddleName).sendKeys("Shyam");
		driver.findElement(txtBoxLastName).sendKeys("Wangu");
		System.out.println("Full name entered");
		js.executeScript("arguments[0].click();", driver.findElement(BtnSave));
		System.out.println("Save button clicked");

		// actobj.moveToElement(driver.findElement(BtnSave)).click().perform();
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(15));
		wt.until(ExpectedConditions.elementToBeClickable(expiryDate));
		driver.findElement(expiryDate).click();
		// actobj.moveToElement(driver.findElement(expiryDate)).click().perform();
		// js.executeScript("arguments[0].scrollIntoView();",
		// driver.findElement(expiryDate));
		System.out.println("License expdate calender is clicked");
		String expectedDate = "1998-10-20";

		String[] date = expectedDate.split("-");
		String expyear = date[0];
		String expmonth = date[1];
		String expdate = date[0];
		List<WebElement> allyears = driver.findElements(CalDDYear);
		System.out.println("year ddown is clicked");
		for (WebElement year : allyears) {
			String yr = year.getText();
			if (yr.equalsIgnoreCase(expyear)) {
				year.click();
				break;
			}
		}
		System.out.println("Expected year is selected");

		List<WebElement> allMonths = driver.findElements(CalDDMonth);
		System.out.println("month ddown is clicked");
		for (WebElement month : allMonths) {
			String mon = month.getText();
			if (mon.equalsIgnoreCase(expmonth)) {
				month.click();
				break;
			}
		}
		System.out.println("Expected month  is selected");

	}

}
