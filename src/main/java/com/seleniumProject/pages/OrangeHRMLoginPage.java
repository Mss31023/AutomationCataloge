package com.seleniumProject.pages;


import org.apache.log4j.Logger;
import org.apache.logging.log4j.core.tools.Generate.CustomLogger;
import org.openqa.selenium.By;

public class OrangeHRMLoginPage extends OrangeHRMBase {
	
	private static OrangeHRMLoginPage instance = null;
	static Logger Log = Logger.getLogger(OrangeHRMLoginPage.class.getName());
	//static CustomLogger Log = CustomLogger.getLogger(OrangeHRMLoginPage.class.getName());


    public static OrangeHRMLoginPage getInstance() {

        if (null==instance)
        {
            instance =new OrangeHRMLoginPage();
        }
        return instance;
    }

    public static By txtBoxUserName=By.xpath("//*[@name='username']");
    public static By txtBoxPassword=By.xpath("//*[@name='password']");
    public static By BtnLogin=By.xpath("//*[@type='submit']");
    
    
    
    
    
    public void loginToOrangeHrm() throws Exception {
    	Thread.sleep(10000);
    	driver.findElement(txtBoxUserName).sendKeys(prop.getProperty("userName"));
    	driver.findElement(txtBoxPassword).sendKeys(prop.getProperty("password"));
    	driver.findElement(BtnLogin).click();
    	Thread.sleep(5000);


    	
    	
    }
    

	
	
	
	
	
	
}
