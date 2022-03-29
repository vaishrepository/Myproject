package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestN1 {
	WebDriver driver;
	SoftAssert obj;
	
	
	@BeforeSuite
	public void driversetup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		}
	/*@BeforeTest
	public void initialsetup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
	    }*/
	@BeforeMethod
	 public void before() {
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		obj=new SoftAssert();	
	    }
	
	@Test (priority=1, groups="title")
	public void gettitle() {
	String Title= driver.getTitle();
	System.out.println(Title);
    obj.assertEquals(Title, "yahoo");
    driver.close();
    obj.assertAll();
	}
	
    @Test (priority=2, groups="verification", dependsOnMethods= {"gettitle"})
    public void Display() {
    boolean a=	driver.findElement(By.linkText("Gmail")).isDisplayed();
    	System.out.println(a);
    }
   @AfterMethod
    public void after() {
    	driver.close();  
    }
   
   
		
		
	
	}

