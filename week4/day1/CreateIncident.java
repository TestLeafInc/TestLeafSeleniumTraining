package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIncident {

	public static void main(String[] args) throws InterruptedException {
		// Steps to launch driver, app,maximize, set timeout 
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://dev68594.service-now.com/navpage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Login
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElement(By.id("sysverb_login")).click();
		
		// Select Incident and Click Create New
		wait.until(
				ExpectedConditions.elementToBeClickable(
						driver.findElement(By.id("filter"))));
		driver.findElement(By.id("filter")).sendKeys("Incident");
		
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//span[text()='Incident']/following::div[text()='Create New']")).click();
		
		// Switch to the frame
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("lookup.incident.caller_id")).click();
		
		// This should open another window
		Set<String> allWindows = driver.getWindowHandles();
		
		// Print - how many
		System.out.println(allWindows.size());
		
		// We have to move to the second window
		List<String> lstWindows = new ArrayList<String>(allWindows);
		driver.switchTo().window(lstWindows.get(1)); 
		
		// Type the last name
		driver.findElement(
				By.xpath("//input[@aria-label='Search column: last name']"))
					.sendKeys("Manickam", Keys.ENTER);
		
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(
						"//b[text()='Last name starts with Manickam']"))));
		
		// Click on the first match
		driver.findElement(By.xpath("//tr[@data-list_id='sys_user']//a")).click();
		
		// Confirm second window is closed
		System.out.println(driver.getWindowHandles().size());
		
		// Switch back to the first window
		driver.switchTo().window(lstWindows.get(0));
		
		// Type on the short description
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("incident.short_description")).sendKeys("This is automated");
		
		
		
		
	}
}
