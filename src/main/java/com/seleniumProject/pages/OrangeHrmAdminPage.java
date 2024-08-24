package com.seleniumProject.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utility.BaseUtil;

public class OrangeHrmAdminPage extends OrangeHRMBase {

	private static OrangeHrmAdminPage instance = null;
	static Logger Log = Logger.getLogger(OrangeHrmAdminPage.class.getName());

	public static OrangeHrmAdminPage getInstance() {

		if (null == instance) {
			instance = new OrangeHrmAdminPage();
		}
		return instance;
	}

	public static By BtnAdminPage = By.xpath("//*[@href='/web/index.php/admin/viewAdminModule']");
	public static By txtBoxUserName = By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]");
	public static By txtBoxEmployeeName = By.xpath("//*[@placeholder='Type for hints...']");
	public static By userRoleDropdown = By.xpath("(//*[@class='oxd-select-text--after'])[1]");
	public static By userRoleDDValueAdmin = By.xpath("//*[@role='option' ]/..//*[text()='Admin']");
	public static By statusDropdown = By.xpath("(//*[@class ='oxd-select-text--after'])[2]");
	public static By statusDDValue = By.xpath("(//*[@class ='oxd-select-text-input'])[2]");
	public static By BtnSearch1 = By
			.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	public static By BtnaddAdminPage = By.xpath("//* [@class='oxd-button oxd-button--medium oxd-button--secondary']");

	public static By userRoleAddUserAdminDD = By
			.xpath("(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	public static By userRoleAddUserAdminDDvalue = By.xpath("(//*[@class ='oxd-select-text-input'])[1]");
	public static By invalidMsgOfSearch = By
			.xpath("//*[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']");
	public static By AddUserEmployeeName = By.xpath("//*[@placeholder='Type for hints...']");
	public static By AddUserStatusDD = By
			.xpath("(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow' ])[2]");
	public static By AddUserStatusDDvalue = By.xpath("//*[@class='oxd-select-option']//*[text()='Enabled']");
	public static By AddUsertxtBoxUsername = By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]");
	public static By AddUsertxtBoxPassword = By
			.xpath("//*[text()='Password']/../..//input[@type='password']");
	public static By AddUsertxtBoxConfrmPass = By
			.xpath("//*[text()='Confirm Password']/../..//input[@type='password']");
	public static By AddUserBtnSave = By.xpath(
			"//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' and text()=' Save ']");

	public void clickOnStatusDD(String Value) {
		// Enabled,Disabled
		By AddUserStatusDDval = By.xpath("//*[@class='oxd-select-option']//*[text()='" + Value + "']");
		driver.findElement(AddUserStatusDDval).click();

	}

	public void enterUserNameOnAdminPage(String userName)

	{
		driver.findElement(txtBoxUserName).sendKeys(userName);

	}

	public void enterEmpNameOnAdminPage(String empName)

	{
		driver.findElement(txtBoxEmployeeName).sendKeys(empName);

	}
	
	public void enterPasswordOnAddUserPage(String Password)

	{
		driver.findElement(AddUsertxtBoxPassword).sendKeys(Password);

	}
	public void enterConfirmPasswordOnAddUserPage(String ConfirmPassword)

	{
		driver.findElement(AddUsertxtBoxConfrmPass).sendKeys(ConfirmPassword);

	}
	
	public void enterEmpNameOnAddUserPage(String EmpName)

	{
		driver.findElement(AddUserEmployeeName).sendKeys(EmpName);

	}

	public void adminPagemethod() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(BtnAdminPage).click();

		enterUserNameOnAdminPage("Admin");
		enterEmpNameOnAdminPage("Paul Collings");
		driver.findElement(userRoleDropdown).click();

		driver.findElement(userRoleDDValueAdmin).click();
		driver.findElement(statusDropdown).click();

		// driver.findElement(statusDDValue).click();
		clickOnStatusDD("Enabled");
		driver.findElement(BtnSearch1).click();
		driver.findElement(invalidMsgOfSearch).isDisplayed();

		driver.findElement(BtnaddAdminPage).click();

		driver.findElement(userRoleAddUserAdminDD).click();
		driver.findElement(userRoleAddUserAdminDDvalue).click();
		// driver.findElement(invalidMsgOfSearch).isDisplayed();
		driver.findElement(AddUserEmployeeName).sendKeys("Paul Collings");
		driver.findElement(AddUserStatusDD).click();
		driver.findElement(AddUserStatusDDvalue).click();
		String un=BaseUtil.randomAlphanumericString(4);
		System.out.println("User Name " + un);

		driver.findElement(AddUsertxtBoxUsername).sendKeys(un);
		String pass=BaseUtil.randomNumberString(8);
		System.out.println("Password " + pass);
		driver.findElement(AddUsertxtBoxPassword).sendKeys(pass);
		driver.findElement(AddUsertxtBoxConfrmPass).sendKeys(pass);
		driver.findElement(AddUserBtnSave).click();

	}

}
