package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
		
	}

	public LoginPage clickLogoutButton() {
		driver.findElement(By.xpath(prop.getProperty("HomePage.Logout.Xpath"))).click();

		return new LoginPage(driver,prop);
	}

	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText(prop.getProperty("HomePage.Crmsfa.LinkText"))).click();

		return new MyHomePage(driver,prop);
	}
	
	public HomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText(prop.getProperty("HomePage.Crmsfa.LinkText"))).isDisplayed();
		
		if (displayed) {
			System.out.println("Home Page is loaded");
		}
		return this;
	}

}
