package com.seleniumProject.TestCases;

import org.testng.annotations.Test;

import com.seleniumProject.pages.OrangeHRMBase;
import com.seleniumProject.pages.OrangeHRMLoginPage;
import com.seleniumProject.pages.commonPage.Page;

public class OrangeHrmHomePageTest extends OrangeHRMBase {
	@Test(groups= {"Regression Tests"})
	public  void pimPage() throws Exception {
		loginPage.loginToOrangeHrm();
		homePage.PIMPage();
		homePage.searchRecordsByEmpName("chew");
		homePage.AddemployeeDetails1();

		
		
		
		//adminPage.adminPagemethod();

		
	}

	

}
