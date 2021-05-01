package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(ChromeDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public LoginPage clickLogoutButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

		return new LoginPage(driver,node);
	}

	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage(driver,node);
	}
	
	public HomePage verifyHomePage() throws IOException {
		try {
			driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
			reportStep("crmsfa link is displayed", "pass");
		} catch (Exception e) {
			reportStep("crmsfa link is not displayed", "fail");
		}
		
		return this;
	}

}
