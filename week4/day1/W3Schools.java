package week4.day1;

import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class W3Schools {

	public static void main(String[] args) {
		
		// Steps to launch driver, app,maximize, set timeout 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Switch to the frame
		driver.switchTo().frame("iframeResult");
		
		// Click on the Try It
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		// Switch to the alert and accept
		driver.switchTo().alert().accept();
		
		// Confirm the accept works !!
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);

	}
}
