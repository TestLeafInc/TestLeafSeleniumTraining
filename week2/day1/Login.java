package week2.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public static void main(String[] args) {
		/*
		 * Selenium Internal Architecture:
		 * 
		 * Selenium (Java) -> REST API -> ChromeDriver (binary) -> Chrome
		 * ChromeDriver -> Local Server which is built on Js, Python -> Google
		 * GeckoDriver -> Local Server Js, C++ -> Mozilla
		 * Selenium (Java) -> REST API -> GeckoDriver (binary) -> Firefox
		 * 
		 * Selenium (C#) -> REST API -> ChromeDriver (binary) -> Chrome\
		 * 
		 * Selenium Java + REST API is bundled inside the Jar File
		 * ChromeDriver -> Automate the download -> webdrivermanager 
		 * Chrome 89 -> Chrome 89 driver
		 * Chrome 89 + Mac -> Different DRIVER
		 * 
		 */
		
		/*
		 * Preconditions:
		 * 1) Selenium Java Software (
		 * 2) Browser Driver
		 * 
		 * 
		 * 
		 * Create a new package 
		 * Create a new class -> Login
		 * 
		 */
		
		// Step 0) Setup the chromedriver using webdrivermanager software
		WebDriverManager.chromedriver().setup(); // .exe or binary
		
		// Step 1) Launch the chrome browser (Class Name -> ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2) Load the URL (http://leaftaps.com/opentaps/control/main) -> get
		driver.get("http://leaftaps.com/opentaps");
		
		// Step 2b) Add common time to wait for all/any elements to load (Write once)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Step 3) Maximize the chrome browser
		driver.manage().window().maximize();
		
		// Step 4) Find the username and type the value (DemoSalesManager)
		driver.findElement(By.id("username1")).sendKeys("DemoSalesManager");
		
		// Step 5) Find the password and type the value (crmsfa)
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		
		// Step 6) Find the login button and click
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Step 7) Verify the title 
		String title = driver.getTitle();
		System.out.println(title);

	}

}
