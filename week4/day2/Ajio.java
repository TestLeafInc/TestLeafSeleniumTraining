package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// Steps to launch driver, app,maximize, set timeout
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.ajio.com/shop/sale");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Search Bags
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags", Keys.ENTER);

		// Check Women
		// Thread.sleep(2000);
		WebElement womenHandBag = driver.findElement(By.xpath("//label[@for='Women']"));
		Actions builder = new Actions(driver);
		builder.click(womenHandBag).perform();

		// click five grid
		driver.findElement(By.xpath("//div[@class='five-grid']")).click();

		// select what's new
		WebElement webDropDown = driver.findElement(By.xpath("//div[@class='filter-dropdown']/select"));
		Select sortBy = new Select(webDropDown);
		sortBy.selectByValue("newn");

		// Click Price on the side menu and Enter Price Range Min as 2000 and Max as
		// 5000
		driver.findElement(By.xpath("//span[text()='price']")).click();
		driver.findElement(By.id("minPrice")).sendKeys("2000");
		driver.findElement(By.id("maxPrice")).sendKeys("5000", Keys.ENTER);

		// click on the first product
		driver.findElement(By.xpath("(//div[@class='name'])[1]")).click();

		// Switch to new window
		Set<String> winSet = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winSet);
		driver.switchTo().window(winList.get(1));

		// get actual price
		String strActualPrice = driver.findElement(By.xpath("//div[@class='prod-sp']")).getText();
		int intActualPrice = Integer.parseInt(strActualPrice.replaceAll("\\D", ""));
		// System.out.println(intActualPrice);

		// get Discount price
		String strDiscountPrice = driver.findElement(By.xpath("//div[@class='promo-discounted-price']/span")).getText();
		int intDiscountPrice = Integer.parseInt(strDiscountPrice.replaceAll("\\D", ""));
		// System.out.println(intDiscountPrice);

		// get coupon code
		String fullText = driver.findElement(By.xpath("//div[@class='promo-title']")).getText();
		String[] split = fullText.split("Code");
		String couponCode = (split[split.length - 1]).replaceAll("[^a-zA-Z]", "");
		System.out.println(couponCode);

		// verify the availability
		driver.findElement(By.xpath("//span[text()='Enter Pin-code To Know Estimated Delivery Date']")).click();
		driver.findElement(By.name("pincode")).sendKeys("560043");
		driver.findElement(By.xpath("//button[text()='CONFIRM PINCODE']")).click();

		// get the expected deliver date
		String deliveryDate = driver.findElement(By.xpath("//li[text()='Expected Delivery: ']/span")).getText();
		System.out.println(deliveryDate);

		// Click on Other information
		driver.findElement(By.xpath("//div[@class='other-info-toggle']")).click();

		// get the customer care details
		String cc = driver
				.findElement(By.xpath("(//div[text()='Customer Care Address']/following::div[@class='title'])[1]"))
				.getText();
		System.out.println(cc);

		// click on Add to bag
		WebElement addToBag = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
		builder.moveToElement(addToBag).click().perform();

		// click Proceed to bag
		driver.findElement(By.xpath("//div[text()='PROCEED TO BAG']")).click();

		// enter the coupon code
		driver.findElement(By.id("couponCodeInput")).sendKeys(couponCode);

		// click apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();

		//Validate discount price
		boolean voucherInvalid = driver.findElement(By.xpath("//span[@class='voucher-error error-message info']"))
				.isDisplayed();

		if (voucherInvalid) {
			System.out.println("voucher is invalid");
		} else {
			String strNetPrice = driver.findElement(By.xpath("//div[@class='net-price best-price-strip']")).getText();
			int intNetPrice = Integer.parseInt(strNetPrice.replaceAll("\\D", ""));
			if (intNetPrice == intDiscountPrice) {
				System.out.println("Verification is passed");
			} else {
				System.out.println("Verification is failed");
			}
		}

	}

}
