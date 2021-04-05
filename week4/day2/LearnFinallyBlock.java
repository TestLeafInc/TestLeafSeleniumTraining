package week4.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFinallyBlock {

	public static void main(String[] args) throws InterruptedException, IOException {
		int x = 10;
		int y = 0;
		int z;

		try {
			z = x / y;
			System.out.println(z);
		} finally {
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
		}

		System.out.println("End of the program");
	}

}
