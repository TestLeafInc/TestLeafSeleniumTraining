package week4.day1;

import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart {

	public static void main(String[] args) {
		
		// Steps to launch driver, app,maximize, set timeout 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Close login button that opens up !! -> UTF-16
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		// Find the fashion menu
		WebElement eleFashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		
		// Mouse Over
		Actions builder = new Actions(driver);
		builder.moveToElement(eleFashion).pause(Duration.ofSeconds(2)).perform();
		
		WebElement eleEthnic = driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
		builder.moveToElement(eleEthnic).pause(Duration.ofSeconds(2)).perform();
		
		driver.findElement(By.xpath("//a[text()='Women Sarees']")).click();
		System.out.println(driver.getTitle());
		
		/*Actions builder = new Actions(driver);
		builder
			.moveToElement(eleFashion)
			.moveToElement(driver.findElement(By.xpath("//a[text()='Women Ethnic']")))
			.click(driver.findElement(By.xpath("//a[text()='Women Sarees']")))
			.perform(); */
		
		
		
		
		
		
		

	}
}
