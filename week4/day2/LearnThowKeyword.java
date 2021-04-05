package week4.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnThowKeyword {
	
	public int divide(int x, int y) {
		int z = 0;
		
		if(x > y) {
			z = x / y ;
		}
		else {
			throw new ArithmeticException("Invalid input");
		}
		
		
		return z;

	}

	public static void main(String[] args) {
		LearnThowKeyword ltk = new LearnThowKeyword();
		
		try {
			System.out.println(ltk.divide(5, 10));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("End of the program");
		
	}
}
