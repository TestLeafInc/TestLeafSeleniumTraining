package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) {
		
		
		// Step 0) Setup the chromedriver using webdrivermanager software
		WebDriverManager.chromedriver().setup();
		
		// Step 1) Launch the chrome browser (Class Name -> ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2) Load the URL (http://leaftaps.com/opentaps/control/main) -> get
		driver.get("http://leaftaps.com/opentaps");
		
		// Step 3) Maximize the chrome browser
		driver.manage().window().maximize();
		
		// Step 4) Find the username and type the value (DemoSalesManager)
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		// Step 5) Find the password and type the value (crmsfa)
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		
		// Step 6) Find the login button and click
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Step 7) Verify the title 
		String title = driver.getTitle();
		System.out.println(title);
		
		// Step 8) Click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Step 9) Click Create Lead Link
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Step 10) Find the company name and type the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		// Step 11) Find the first name and type your name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Babu");

		// Step 12) Find the last name and type your name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manickam");
		
		// Step 12 b) Select the Source dropdown with one of the visible text
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(source);
		dd1.selectByVisibleText("Employee");
		
		// Step 12 c) Select the marketing campaign with one of the value
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 = new Select(marketing);
		dd2.selectByValue("9001");

		// Step 13) Click Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		
		// Step 14) Print the new title
		title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
