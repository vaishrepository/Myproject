package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNParameterization {
	
	WebDriver driver;
	
	
	@BeforeSuite
	public void driversetup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		}
	
	@BeforeMethod
	 public void before() {
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	@DataProvider(name="getdata")
	public Object[][] search() {
		return new Object[][] {{"Roicians"},{"Roicians Automation Testing"},{"Roicians QA"}};
		
	}
	@Test(dataProvider="getdata")
	public void Display(String Keyword) {
		driver.findElement(By.name("q")).sendKeys(Keyword);
		
		
	}
	
	
	

}
