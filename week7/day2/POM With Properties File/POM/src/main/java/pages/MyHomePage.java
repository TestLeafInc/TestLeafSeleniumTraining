package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
		
	}

	public MyLeadsPage clickLeadsLink() {
		driver.findElement(By.linkText(prop.getProperty("MyHomePage.LeadsLink.LinkText"))).click();

		return new MyLeadsPage(driver,prop);
	}

}
