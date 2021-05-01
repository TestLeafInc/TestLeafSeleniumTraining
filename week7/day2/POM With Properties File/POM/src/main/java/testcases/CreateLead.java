package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead  extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setFileName() {
		excelFileName ="CreateLead";

	}
	
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String username,String password,String company,String fName, String lName) throws InterruptedException {
		new LoginPage(driver,prop)
		.enterUsername(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(company)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()
		.verifyFirstName();

	}

}
