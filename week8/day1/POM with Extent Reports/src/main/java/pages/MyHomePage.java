package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage(ChromeDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public MyLeadsPage clickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();

		return new MyLeadsPage(driver,node);
	}

}
