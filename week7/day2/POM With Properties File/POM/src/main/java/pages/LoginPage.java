package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
		
	}
	
	public LoginPage enterUsername(String username) throws InterruptedException {
		driver.findElement(By.id(prop.getProperty("LoginPage.Username.Id"))).sendKeys(username);
		
		//Thread.sleep(5000);
		return this;
	}

	public LoginPage enterPassword(String password) {

		driver.findElement(By.id(prop.getProperty("LoginPage.Password.Id"))).sendKeys(password);
		
		return this;

	}

	public HomePage clickLoginButton() {
		driver.findElement(By.className(prop.getProperty("LoginPage.LoginButton.ClassName"))).click();
		
		return new HomePage(driver,prop);
	}
}
