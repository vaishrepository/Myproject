package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitevent {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.roicians.com/contact-us/");
    
    //Dynamic or Soft wait
    
    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    
    //to give wait event for all elements on the page (Implicit wait)
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    
  //to give wait event for a particular element(Explicit wait)
    WebDriverWait wait=new WebDriverWait(driver,100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text-77525447616")));
    
    //Static or Hard wait
    Thread.sleep(5000);
    
    
    
    
	}

}
