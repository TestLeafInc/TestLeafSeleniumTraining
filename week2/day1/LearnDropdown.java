package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {
	
	public static void main(String[] args) {
		
		// Step 0) Setup the chromedriver using webdrivermanager software
		WebDriverManager.chromedriver().setup(); // .exe or binary
		
		// Step 1) Launch the chrome browser (Class Name -> ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2) Load the URL (http://leaftaps.com/opentaps/control/main) -> get
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		// Step 3) Maximize the chrome browser
		driver.manage().window().maximize();
		
		// First find the drop down
		WebElement eleProgram = driver.findElement(By.id("dropdown1"));
		
		// Convert the element to Dropdown -> Select
		Select dd = new Select(eleProgram);
		
		// Then select the value (3 ways)
		// Approach 1: Using Visible (text) -> Working in english language, choose based on test data
		dd.selectByVisibleText("Selenium");
		// Approach 2: Using the value (attribute) -> Multi lingual -> Value is the best choice
		// dd.selectByValue("2");
		// Approach 3: Using the index (count) -> Choose randomly 
		// dd.selectByIndex(2);

	}

}







