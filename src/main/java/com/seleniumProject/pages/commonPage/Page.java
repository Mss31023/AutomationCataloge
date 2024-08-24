package com.seleniumProject.pages.commonPage;

import com.seleniumProject.pages.AutomationExerciseSignupPage;
import com.seleniumProject.pages.EcommerceHomePage;
import com.seleniumProject.pages.OrangeHRMBase;
import com.seleniumProject.pages.OrangeHRMLoginPage;
import com.seleniumProject.pages.OrangeHrmAdminPage;
import com.seleniumProject.pages.OrangeHrmHomePage;

public interface Page {
	
	
	OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
	OrangeHrmHomePage homePage=new OrangeHrmHomePage();
	OrangeHrmAdminPage adminPage=new OrangeHrmAdminPage();
	EcommerceHomePage ehomePage=new EcommerceHomePage();
	AutomationExerciseSignupPage AEsignupPage=new AutomationExerciseSignupPage();
	
	
}
