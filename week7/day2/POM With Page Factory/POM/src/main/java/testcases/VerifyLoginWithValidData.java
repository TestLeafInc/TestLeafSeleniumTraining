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
	
	@Test(dataProvider = "fetchData")
	public void loginLogout(String username, String password) throws InterruptedException {
		
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyHomePage();
		
	}

}
