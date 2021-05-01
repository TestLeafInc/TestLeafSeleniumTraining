package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead  extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setDetails() {
		excelFileName ="CreateLead";
		testName = "Create Lead";
		testDescription = "Create lead with mandatory data";
		testCategory = "functional";
		testAuthor = "Hari";

	}
	
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String username,String password,String company,String fName, String lName) throws InterruptedException, IOException {
		new LoginPage(driver,node)
		.enterUsername(username)
		.enterPassword(password)
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
