package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectUsingActions {

	public static void main(String[] args) {
		// Steps to launch driver, app,maximize, set timeout 
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leafground.com/pages/Dropdown.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Got the web element
				WebElement selenium = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='Selenium']"));
				WebElement loadrunner = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='Loadrunner']"));
			
							
				// Step 1 ) Create reference for the Actions class
				Actions builder = new Actions(driver);
				
				// Step 2 ) Call appropriate method in Actions class -> always end with perform method
				builder.keyDown(Keys.CONTROL).click(selenium).click(loadrunner).keyUp(Keys.CONTROL).perform();
				
				
	}
}
