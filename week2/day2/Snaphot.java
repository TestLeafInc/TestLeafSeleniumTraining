package week2.day2;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snaphot {
	
	public static void main(String[] args) throws IOException  {
		
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
		
		// When you take snaphot -> .jpg, .png (File)
		
		// Take a snapshot -> Selenium by default cannot full screen shot !!
		// WebDriver can only take the visible portion of the page !! 
		File memory = driver.getScreenshotAs(OutputType.FILE);
		
		// Copy to a local file
		FileUtils.copyFile(memory, new File("./snaps/snap1.jpg"));
		WebElement eleUserName = driver.findElement(By.id("username"));
		
		File eleSnap = eleUserName.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(eleSnap, new File("./snaps/snap2.jpg"));
		
		driver.get("http://leafground.com");
		File leaf = driver.getScreenshotAs(OutputType.FILE);
		
		// Copy to a local file
		FileUtils.copyFile(leaf, new File("./snaps/snap3.jpg"));

		
		
		
		
		
		
		
		
		

	}

}
