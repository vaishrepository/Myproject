package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		//open browser
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				
		//step 2 type url
				driver.get("https://www.roicians.com/");
				
				File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //take screenshot and store it in srcfile variable
				FileUtils.copyFile(srcfile, new File("C:\\Users\\navin.NLT-Navin-01\\Pictures\\Saved Pictures.jpg"));
				

	}

}

