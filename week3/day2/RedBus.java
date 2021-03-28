package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Type Source 
		driver.findElement(By.id("src")).sendKeys("C");
		// Wait for the options to load
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath("//*[contains(text(),'All Locations')]")));
		
		//  Choose the second option
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN, Keys.ENTER);
		
		driver.findElement(By.id("dest")).sendKeys("B");
		wait.until(ExpectedConditions.
				presenceOfElementLocated(
						By.xpath("//*[contains(text(),'All Locations')]")));
		
		driver.findElement(By.id("dest")).sendKeys(Keys.DOWN, Keys.ENTER);
		
		// Click on the field to open the calendar
		driver.findElement(By.id("onward_cal")).click();
		
		// Store the next button of the calendar
		WebElement next = driver.findElement(By.xpath("//td[@class='next']"));
		
		// Wait for the calendar to appear
		wait.until(ExpectedConditions.visibilityOf(next));
		
		// Click on next month
		next.click();
		
		// Select the day 1 of the month
		driver.findElement(By.xpath("//table[contains(@class,'rb-monthTable')]//tr/td[text()='1']")).click();
		
		// Search button
		driver.findElement(By.id("search_btn")).click();
		
		// Close the icon loaded
		driver.findElement(By.className("close")).click();
		
		// Check Sleeper
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
		
		// Get the number of buses found
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@title='SLEEPER']")));
		driver.findElement(By.className("busFound")).getText();

		// Check AC
		driver.findElement(By.xpath("//label[@for='bt_AC']")).click();
		
		// Get the number of buses found
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@title='AC']")));
		driver.findElement(By.className("busFound")).getText();
		
		// Get All the fares
		List<WebElement> allFares = driver.findElements(By.className("fare"));
		System.out.println(allFares.size());
		
		for (int i = 0; i < allFares.size(); i++) {
			System.out.println(allFares.get(i).getText());
		}
		

	}

}
