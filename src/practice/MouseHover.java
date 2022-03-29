package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.roicians.com/");
		
		//Actions
		 Actions action=new Actions(driver);
		 action.moveToElement(driver.findElement(By.cssSelector("#menu-item-65 > a"))).build().perform();
		 driver.findElement(By.partialLinkText("SOFTWARE T")).click();
		 driver.close();
		 
	}
	
	

}
