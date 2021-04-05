package week4.day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnThows {
	
	

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\hp\\Desktop\\NewData.csv");
		
		FileInputStream fis = new FileInputStream(file);
		
		
		System.out.println("end of the program");
		
	}
}
