package week2.day2;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundTable {
	
	public static void main(String[] args) {
		
		// Step 0) Setup the chromedriver using webdrivermanager software
		WebDriverManager.chromedriver().setup(); // .exe or binary
		
		// Step 1) Launch the chrome browser (Class Name -> ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2) Load the URL (http://leaftaps.com/opentaps/control/main) -> get
		driver.get("http://leafground.com/pages/table.html");
		
		// Step 2b) Add common time to wait for all/any elements to load (Write once)
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// Step 3) Maximize the chrome browser
		driver.manage().window().maximize();
		
		// Find the count of rows
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println(allRows.size());
		

	}

}







