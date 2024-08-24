package com.seleniumProject.TestCases;

import org.testng.annotations.Test;

import com.seleniumProject.pages.OrangeHRMBase;
import com.seleniumProject.pages.commonPage.Page;

public class OrangeHrmAdminPageTest extends OrangeHRMBase implements Page{
	
	@Test
	public void admin() throws Exception {
		loginPage.loginToOrangeHrm();
		adminPage.adminPagemethod();
	}

}
