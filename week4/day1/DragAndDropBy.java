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

public class DragAndDropBy {

	public static void main(String[] args) {
		
		// Steps to launch driver, app,maximize, set timeout 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// I found a frame, hence switch to it !!
		driver.switchTo().frame(0); // using the index
		
		// Got the web element
		WebElement eleDraggable = driver.findElement(By.id("draggable"));
		System.out.println(eleDraggable.getLocation());
		
		// Step 1 ) Create reference for the Actions class
		Actions builder = new Actions(driver);
		
		// Step 2 ) Call appropriate method in Actions class -> always end with perform method
		builder.dragAndDropBy(eleDraggable, 50, 50).perform();
		
		// Actions class does not throw any exception, in that case
		// Add your own verification to confirm it worked !!
		System.out.println(eleDraggable.getLocation());


	}
}
