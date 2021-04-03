package week4.day1;

import java.time.Duration;
import java.util.Set;

import org.testng.annotations.Test;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTab {

	public static void main(String[] args) {
		
		// Steps to launch driver, app,maximize, set timeout 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://leaftaps.com/opentaps");
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());

	}
}
