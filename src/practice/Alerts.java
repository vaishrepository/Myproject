package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		//step 1 open browser google chrome
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 
				ChromeDriver driver=new ChromeDriver();
	    //type url
			   driver.get("https://demoqa.com/alerts");
			   driver.findElement(By.id("alertButton")).click();
			Alert al=driver.switchTo().alert(); //we use switchTo because the alert is not in current page
			Thread.sleep(2000); //hard wait
			al.accept();
			    
		
	}

}
