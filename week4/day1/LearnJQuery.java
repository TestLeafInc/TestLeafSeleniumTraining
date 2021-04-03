package week4.day1;

import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnJQuery {

	public static void main(String[] args) {
		
		// Steps to launch driver, app,maximize, set timeout 
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// I found a frame, hence switch to it !!
		driver.switchTo().frame(0); // using the index
		//WebElement frameElement = driver.findElement(By.className("demo-frame"));
		//driver.switchTo().frame(frameElement);
		
		// index (int), id or name (String), find the webelement for the frame 
		
		// find out if the element draggable exist !!
		boolean displayed = driver.findElement(By.id("draggable")).isDisplayed();
		System.out.println("Displayed :"+displayed);
		
		// Come out of the frame
		driver.switchTo().defaultContent();
		
		// Will it work?
		driver.findElement(By.linkText("Demos")).click();
		

	}
}
