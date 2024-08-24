package com.seleniumProject.TestCases;

import org.testng.annotations.Test;

import com.seleniumProject.pages.OrangeHRMBase;

public class OrangeHRMLoginTest extends OrangeHRMBase{
	
	
	@Test
	public  void verifyLoginOrangehrm() throws Exception {
		loginPage.loginToOrangeHrm();
		
	}

}
