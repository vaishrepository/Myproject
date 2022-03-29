package seleniumpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestN {
	
    //step 1 system.setproperty (location of driver)
	//step 2 Type URL
	//step 3 Perform action of particular element 
	//step 4 Close browser
	
	//STLC Write test cases, execute test cases, log defects
	
	@BeforeSuite //only once System.setproperty
	public void beforesuite() {
		System.out.println("Before suite");
	}
	
	@BeforeTest //Webdriver driver=new Chromedriver(),implicitwait, pageloadtimeout,maximize,minimize
	public void beforetest() {
		System.out.println("Before test");
	}
	@BeforeClass //login details
	public void beforeclass() {
		System.out.println("Before class");
	}
	@BeforeMethod//url
	public void beforemethod() {
		System.out.println("Before method");
	}
	
	@Test (priority=1)
	public void writetestcase() {
		System.out.println("First write test case");
	}
		
	@Test (priority=2)
	public void executetest() {
		System.out.println("Then execute test case");
	}
	@Test (priority=3)
	public void defectlog() {
		System.out.println("defect must be logged");
	}
	@AfterMethod  //close browser 
	public void aftermethod() {
		System.out.println("After method");
	}
	@AfterClass //only once after all test cases are executed - logout
	public void afterclass() {
		System.out.println("After class");
	}
	@AfterTest //this will be executed only once but after class condition
	public void aftertest() {
		System.out.println("After test");
	}
	@AfterSuite //at last when all other annotations are executed according to sequence
	public void aftersuite() {
		System.out.println("After suite");
	}
}
