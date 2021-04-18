package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
			
	@When("Click on crmsfa link")
	public void clickOnCrmsfaLink() {
	  driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Then("MyHomePage should be displayed")
	public void myHomePageShouldBeDisplayed() {
	    System.out.println("My Home page is displayed");
	}
	@When("Click on Leads link")
	public void clickOnLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();
	}

}
