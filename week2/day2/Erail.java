package week2.day2;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
	
	public static void main(String[] args) {
		
		// Step 0) Setup the chromedriver using webdrivermanager software
		WebDriverManager.chromedriver().setup(); // .exe or binary
		
		// Step 1) Launch the chrome browser (Class Name -> ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2) Load the URL (http://leaftaps.com/opentaps/control/main) -> get
		driver.get("https://erail.in/");
		
		// Step 2b) Add common time to wait for all/any elements to load (Write once)
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// Step 3) Maximize the chrome browser
		driver.manage().window().maximize();
		
		// Step 4) Enter the from city and do Tab
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS", Keys.TAB);
		
		// Step 5) Enter the to city and do Tab
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("SBC", Keys.TAB);
		
		// Step 6) Check Sort on Date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		// Find the count of trains
		List<WebElement> tableRows = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		
		// List -> Dynamic Array
		// Array -> Size is fixed !! 
		System.out.println(tableRows.size());
		
		// findElement -> NoSuchElementException -> It will throw after 15 seconds (implicitwait) 
		// findElements -> It will not throw ANY Exception -> List with size 0 -> Empty List
		
		// Find all the train numbers
		List<WebElement> allTrainNumbers = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[1]"));
		
		// Traverse through -> for, foreach
		for (WebElement eachTrain : allTrainNumbers) {
			System.out.println(eachTrain.getText());
		}
		
		
		// Find all train names 
		List<WebElement> allTrainNames = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
		
		// Print all
		for (WebElement eachTrain : allTrainNames) {
			System.out.println(eachTrain.getText());
		}
		
		
		
		
		
		
		
		
		

	}

}
