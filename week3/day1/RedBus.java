package week3.day1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("src")).sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElement(By.id("src")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("dest")).sendKeys("Bengaluru");
		Thread.sleep(5000);
		driver.findElement(By.id("dest")).sendKeys(Keys.TAB);
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//table[contains(@class,'rb-monthTable')]//tr/td[text()='31']")).click();
		driver.findElement(By.id("search_btn")).click();

	}

}
