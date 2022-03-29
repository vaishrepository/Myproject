package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactus {
	public static void main(String[] args) {
		//open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//step 2 type url 
		driver.get("https://www.roicians.com/contact-us/");
		
		ContactusPOM abc=new ContactusPOM(driver);
		abc.typefname("Vaish");
	
		abc.typelname("Navin");
		
		abc.typeemail("abc@gmail.com");
		
		abc.typephoneno("0001111");
		
		abc.typemsg("Hello");
		
		abc.clicksend();
		
			}
		}
		
			

		
		
		

	


