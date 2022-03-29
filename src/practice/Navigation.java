package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		
		//open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//step 2 type url 
		driver.get("https://www.roicians.com/contact-us/");
		driver.navigate().to("https://www.google.com/"); //to navigate from one page to another page
		
		driver.navigate().back(); //to navigate back to the previous page
		
		driver.navigate().forward(); //to go forward 
		driver.navigate().refresh(); //to refresh the page
		
		driver.close(); // to close the current tab
		driver.quit(); //to close all the tabs open in the browser

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
