package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(ChromeDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public LoginPage enterUsername(String username) throws InterruptedException, IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(username);
			reportStep("username "+username+" is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("username "+username+" is not entered successfully", "fail");

		}
		return this;
	}

	public LoginPage enterPassword(String password) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(password);
			reportStep("password "+password+" is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("password "+password+" is not entered successfully", "fail");

		}
		return this;

	}

	public HomePage clickLoginButton() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("login button clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("login buttonn is not clicked successfully", "fail");
		}
		return new HomePage(driver,node);
	}

	public LoginPage clickLoginForNegativeData() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}

}
