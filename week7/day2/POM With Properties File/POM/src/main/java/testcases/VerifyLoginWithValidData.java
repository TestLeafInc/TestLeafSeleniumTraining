package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLoginWithValidData extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setFileName() {
		excelFileName ="Login";

	}
	
	@Test
	public void loginLogout() throws InterruptedException {
		
		new LoginPage(driver,prop)
		.enterUsername(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton()
		.verifyHomePage();
		
	}

}
