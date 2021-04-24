package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	
	public LoginPage enterUsername(String username) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		
		//Thread.sleep(5000);
		return this;
	}

	public LoginPage enterPassword(String password) {

		driver.findElement(By.id("password")).sendKeys(password);
		
		return this;

	}

	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new HomePage(driver);
	}
}
