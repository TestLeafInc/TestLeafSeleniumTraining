package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	public MyLeadsPage(ChromeDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();

		return new CreateLeadPage(driver,node);
	}

}
