package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActions {

	public static void main(String[] args) {
		// Steps to launch driver, app,maximize, set timeout 
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leafground.com/pages/selectable.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Got the web element
				WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
				WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
				WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
				WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
				
				
				// Step 1 ) Create reference for the Actions class
				Actions builder = new Actions(driver);
				
				// Step 2 ) Call appropriate method in Actions class -> always end with perform method
				//builder.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).click(item4).keyUp(Keys.CONTROL).perform();
				
				builder.clickAndHold(item1).moveToElement(item4).release().perform();
				
				driver.close();
	}
}
