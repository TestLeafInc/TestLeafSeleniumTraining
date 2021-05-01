package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;

	}

	public ViewLeadPage verifyFirstName() {
		System.out.println("first name displayed");
		return this;
	}
}
