package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLoginWithValidData extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setDetails() {
		excelFileName ="Login";
		testName = "LoginWithValidData";
		testDescription = "Verify login for valid data";
		testCategory = "functional";
		testAuthor = "Hari";
		

	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogout(String username, String password) throws InterruptedException, IOException {
		
		new LoginPage(driver,node)
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyHomePage();
		
	}

}
