package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CareerPg1 {
	WebDriver driver;
	
	@BeforeSuite
	public void driversetup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	}
	@BeforeMethod
	 public void before() {
	    driver=new ChromeDriver();
	    driver.get("https://www.roicians.com/career/");
	}
	@Test
	public void applynow() {
	driver.findElement(By.id("text-248418663108")).sendKeys("Vaish");
	driver.findElement(By.id("text-58969147196")).sendKeys("abcd");
	driver.findElement(By.id("text-25931186823")).sendKeys("abcd@gmail.com");
	driver.findElement(By.id("field-LfRVhp7sisH0kRP")).sendKeys("000111111");
	Select obj=new Select(driver.findElement(By.id("field-jHhehcNamzHL47m")));
	obj.selectByIndex(7);
 
     driver.findElement(By.id("field-U7H2lPxWxSPqWeq")).sendKeys("C:\\Users\\navin.NLT-Navin-01\\Desktop.txt");
     driver.findElement(By.id("textarea-27447478041")).sendKeys("Hello");   
     driver.findElement(By.id("button-23567600038")).click();
	}
	
	@AfterMethod
	public void aftermethod() {
     driver.close();
	}
  

}
