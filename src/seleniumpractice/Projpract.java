package seleniumpractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Projpract {
	WebDriver driver;
	
	@BeforeSuite
	public void driversetup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
		driver.get("https://www.google.com");
	}
	@BeforeTest
	public void initialsetup() throws InterruptedException {
	    driver.findElement(By.name("q")).sendKeys("amazon.ca");  
	    Thread.sleep(1000);
	    driver.findElement(By.name("btnK")).click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
	    
	}
	@BeforeClass
	public void screenshot() throws IOException {
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(srcfile, new File("C:\\Users\\navin.NLT-Navin-01\\Pictures\\Saved Pictures.jpg"));
		boolean display=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
	    System.out.println(display);
	}
	
	@BeforeMethod
	public void signin() throws InterruptedException {
		Actions hello=new Actions(driver);
		hello.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.linkText("Start here.")).click();
		Thread.sleep(1000);
	}
	@Test
	public void createaccount() {
		ProjPOM amz=new ProjPOM(driver);
		amz.typename("vaishu");
		amz.typeemail("vaishu.navin@gmail.com");
		amz.typepassword("abcdefg");
		amz.typepasswordag("abcdefg");
		amz.clickcontinue();
	
	}
	@AfterMethod
	public void after() {
		driver.quit();
	}
	

	}
	

	
	
	


