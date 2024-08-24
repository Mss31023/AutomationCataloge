package com.seleniumProject.TestCases;

import org.testng.annotations.Test;

import com.seleniumProject.pages.OrangeHRMBase;

public class AutomationExercisesSignupPageTest extends OrangeHRMBase {
	@Test
	public void TestSignupProcess() {
		AEsignupPage.NewuserSignup();
		AEsignupPage.AccountInfoLabelValidation();
	}

}
