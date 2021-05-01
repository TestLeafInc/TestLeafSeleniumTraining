package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	  @CacheLookup
	  
	  @FindBy(how=How.CLASS_NAME, using="inputLogin") List<WebElement> eleUsername;
	  
	  @CacheLookup
		@FindBy(how=How.ID, using="password") WebElement elePassword;
		
		//@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLoginButton;
		@FindBy(how=How.XPATH, using="//input[@class='decorativeSubmit']") WebElement eleLoginButton;
		
	public LoginPage enterUsername(String username) throws InterruptedException {
		
		eleUsername.get(0).sendKeys(username);
		
		//eleUsername.sendKeys(username);
		
		//driver.findElement(By.id("username")).sendKeys(username);
		
		//Thread.sleep(5000);
		return this;
	}

	public LoginPage enterPassword(String password) {
		elePassword.sendKeys(password);
		//driver.findElement(By.id("password")).sendKeys(password);
		
		return this;

	}

	
	public HomePage clickLoginButton() {
		eleLoginButton.click();
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		return new HomePage(driver);
	}
	
	public LoginPage clickLoginForNegativeData() {
		eleLoginButton.click();
		return this;
	}
	
	//AND condition
		/*
		 * @FindBys( {
		 * 
		 * @FindBy(how=How.CLASS_NAME, using="inputLogin"),
		 * 
		 * @FindBy(how=How.XPATH, using="//input[@id='username']") }
		 * 
		 * ) WebElement eleUsername;
		 */
		
		
		//OR condition
		/*
		 * @FindAll( {
		 * 
		 * @FindBy(how=How.CLASS_NAME, using="inputLogin"),
		 * 
		 * @FindBy(how=How.XPATH, using="//input[@id='username123']") }
		 * 
		 * ) WebElement eleUsername;
		 */
		
	
	
	
	
	
	
	
}
