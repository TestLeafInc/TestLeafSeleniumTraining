package week2.day2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Start your wonderful journey")).click();
		driver.findElement(By.xpath("//div[text()='Popular Pick-up points']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		driver.findElement(
				By.xpath("//div[text()='Start date ']/following::div[contains(@class,'day picked')]/following-sibling::div[1]")).click();;
		
		File s1 = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s1, new File("./snaps/startDate.jpg"));		
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		// Add a wait time
		Thread.sleep(5000);
		
		driver.findElement(
				By.xpath("//div[text()='Select a month']/following::div[@class='month picked']/following-sibling::div[1]")).click();
		
		File s2 = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s2, new File("./snaps/endDate.jpg"));
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		List<WebElement> allCars = driver.findElements(By.xpath("//div[@class='car-listing']"));
		System.out.println(allCars.size());
		File s3 = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s3, new File("./snaps/List.jpg"));
		
		
		
		
		

		
	}

}
