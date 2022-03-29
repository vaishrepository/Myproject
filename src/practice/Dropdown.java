package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		//step 1 open browser google chrome
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
		//step 2 type url 
		driver.get("https://www.roicians.com/career/");
		
		//to find location of parent element 
		Select obj=new Select(driver.findElement(By.id("field-jHhehcNamzHL47m")));  
		//obj.selectByVisibleText("Automation Testing Trainer");
		//obj.selectByValue("Automation Testing Trainer");
		   obj.selectByIndex(3);
		
		
		

	}

}
