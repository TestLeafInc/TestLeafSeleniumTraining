package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
		
	}

	public ViewLeadPage verifyFirstName() {
		System.out.println("first name displayed");
		return this;
	}
	
	public ViewLeadPage getLeadId() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		leadId = text.replaceAll("\\D", "");
		
		return this;
	}
}
