package com.seleniumProject.pages;

import org.openqa.selenium.By;

public class AutomationExerciseSignupPage extends OrangeHRMBase {

	public static By SignupLoginBtn = By.xpath("//*[@href='/login']");
	public static By txtLogintoYourAccount = By.xpath("//*[contains(text(),'Login to your account')]");
	public static By txtNewUserSignup = By.xpath("//*[contains(text(),'New User Signup!')]");
	public static By txtBoxName = By.xpath("//*[@data-qa='signup-name']");
	public static By txtBoxEmailAdderss1 = By.xpath("//*[@data-qa='signup-email']");
	public static By BtnSignup = By.xpath("//*[@data-qa='signup-button' and @type='submit']");
	public static By txtEnterAccountInformation = By.xpath("//*[contains(text(),'Enter Account Information')]");
	public static By LblTitle = By.xpath("//*[contains(text(),'Title')]");
	public static By BtnRadioMr = By.xpath("//*[@id='id_gender1']");
	public static By LblName = By.xpath("//*[@for='name']");
	public static By LblEmail = By.xpath("//*[@for='email']");
	public static By lblPassword = By.xpath("//*[@for='password']");
	public static By LblDOB = By.xpath("//*[contains(text(),'Date of Birth')]");
	public static By txtAddressInformation = By.xpath("//*[contains(text(),'Address Information')]");
	public static By LblFirstName = By.xpath("//*[@for='first_name']");
	public static By LblLastName = By.xpath("//*[@for='last_name']");
	public static By LblAddress1 = By.xpath("//*[@for='address1']");
	public static By LblAddress2 = By.xpath("//*[@for='address2']");
	public static By LblCountry = By.xpath("//*[@for='country']");
	public static By LblState = By.xpath("//*[@for='state']");
	public static By LblCity = By.xpath("//*[@for='city']");
	public static By LblZipcode = By.xpath("//*[contains(text(),'Zipcode ')]");
	public static By LblMobilenumber = By.xpath("//*[@for='mobile_number']");

	public void NewuserSignup() {
		driver.findElement(SignupLoginBtn).click();
		driver.findElement(txtLogintoYourAccount).isDisplayed();
		System.out.println("Login to your account is displayed");
		driver.findElement(txtNewUserSignup).isDisplayed();
		System.out.println("New User Signup  is displayed");
		driver.findElement(txtBoxName).sendKeys("klm");
		driver.findElement(txtBoxEmailAdderss1).sendKeys("lmn123@gmail.com");
		driver.findElement(BtnSignup).click();
		System.out.println("New user signup successful");

	}

	public void AccountInfoLabelValidation() {
		driver.findElement(txtEnterAccountInformation).isDisplayed();
		System.out.println("Enter account information is displayed");
		driver.findElement(LblTitle).isDisplayed();
		driver.findElement(LblName).isDisplayed();
		driver.findElement(LblEmail).isDisplayed();
		driver.findElement(lblPassword).isDisplayed();
		driver.findElement(LblDOB).isDisplayed();
		driver.findElement(txtAddressInformation).isDisplayed();
		driver.findElement(LblFirstName).isDisplayed();
		driver.findElement(LblLastName).isDisplayed();
		driver.findElement(LblAddress1).isDisplayed();
		driver.findElement(LblAddress2).isDisplayed();
		driver.findElement(LblCountry).isDisplayed();
		driver.findElement(LblState).isDisplayed();
		driver.findElement(LblCity).isDisplayed();
		driver.findElement(LblZipcode).isDisplayed();
		driver.findElement(LblMobilenumber).isDisplayed();
		System.out.println("Label validation successful");

	}

}
