package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verificationcommands {

	public static void main(String[] args) {
		
		//open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		

      //  driver.get("https://www.google.com/");
		//to see if gmail is displayed or not
	//	boolean result=driver.findElement(By.cssSelector(".gb_d")).isDisplayed();
	//	System.out.println(result);

		driver.get("https://www.roicians.com/services/");
		WebElement result1=driver.findElement(By.id("field-Vqid3FHYKdxwYHZ-1"));
		result1.click();
		
		if (result1.isSelected()) {
			System.out.println("Checkbox is on");
		}
			
			else {
				System.out.println("Checkbox is off");
			}
				
		/*result1.click();
				
		if(!result1.isSelected()) {
			System.out.println("Checkbox is off");
		}*/
		
		
		
		
		
		
		
		
		

	}

}
