package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {

	public static void main(String[] args) {
		
		// Steps to launch driver, app,maximize, set timeout 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String windowHandle = driver.getWindowHandle();
		System.out.println("The Initial window "+windowHandle);
		
		// This should open another window
		driver.findElement(By.id("home")).click();
		
		// I need to find out how many total windows are there?
		Set<String> allWindows = driver.getWindowHandles();
		
		// How to get the numbers?
		System.out.println(allWindows.size());
		
		// I like to move to the second window !!
		System.out.println("I am in the window "+driver.getWindowHandle());
		
		// I am still in the first window
		
		// How to get the window handle from Set based on index 
		// Do we have method get(index) in List? The answer is yes !!
		// Can I convert my Set to List ? Yes 
		// How to do that?
		List<String> lstWindows = new ArrayList<String>(allWindows);
		String secondWindow = lstWindows.get(1); // We do not have get method in Set !! 
		driver.switchTo().window(secondWindow); // Control will move to Second window
		
		// Let me get the title
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		// Close the window
		//driver.close(); // active window will get closed
		driver.quit();
		
		// How to get the numbers?
		//System.out.println(driver.getWindowHandles().size());
		
		//System.out.println(driver.getTitle());
		
		// How to come back
		//driver.switchTo().window(lstWindows.get(0));
		
		// Let me get the title
		//System.out.println(driver.getTitle());
		
		System.out.println(driver.getSessionId());
		
		
		
		
	}
}
