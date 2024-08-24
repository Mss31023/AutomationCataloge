package com.seleniumProject.TestCases;

import org.testng.annotations.Test;

import com.seleniumProject.pages.OrangeHRMBase;

public class EcommerceHomePageTest extends OrangeHRMBase{
	@Test
	public void searching() throws Exception {
		ehomePage.verifyTitle();
		ehomePage.verifyLogo();
		ehomePage.findElement();
		ehomePage.addToCart();

	}
	
	

}
