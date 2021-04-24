package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;

	}

	public LoginPage clickLogoutButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

		return new LoginPage(driver);
	}

	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage(driver);
	}
	
	public HomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		if (displayed) {
			System.out.println("Home Page is loaded");
		}
		return this;
	}

}
