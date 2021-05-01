package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	public MyLeadsPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
		
	}

	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadsPage.CreateLead.LinkText"))).click();

		return new CreateLeadPage(driver,prop);
	}

}
