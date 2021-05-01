package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class ProjectSpecificMethods {
	public ChromeDriver driver;
	public String excelFileName;
	public static String leadId;
	public Properties prop;

	@DataProvider(name="fetchData", indices=0)
	public String[][] sendData() throws IOException {
		return ReadExcel.excelRead(excelFileName);
	}

	@Parameters({"language"})
	@BeforeMethod
	public void startApp(String lang) throws IOException {
		//load properties file
		FileInputStream fis = new FileInputStream("./src/main/resources/"+lang+".properties");
		prop = new Properties();
		prop.load(fis);
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void closeBrowser() {

		driver.close();
	}

}
