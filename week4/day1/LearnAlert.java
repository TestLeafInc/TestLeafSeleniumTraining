package week4.day1;

import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		
		// Steps to launch driver, app,maximize, set timeout 
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		// switch the control to Alert
		Alert alert = driver.switchTo().alert();
		
		// get the text
		System.out.println(alert.getText());
		
		// Type the name (Clear is not required in the alert -> it will be auto cleared)
		alert.sendKeys("TestLeaf");
		
		// Snapshot -> UnhandledAlertException 
		// Webdriver cannot take the snapshot of the alert 
		// Selenium cannot take full screenshot or cannot take alert screenshot !! 
		// driver.getScreenshotAs(OutputType.FILE);
		// accept the alert
		alert.accept();
		
		// This is from the DOM
		String text = driver.findElement(By.id("result1")).getText();
		System.out.println(text);

	}
}
