package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjPOM {

	WebDriver driver;
	
	@FindBy (id="ap_customer_name") WebElement Name;
	@FindBy (id="ap_email") WebElement Email;
	@FindBy (id="ap_password") WebElement Password;
	@FindBy (id="ap_password_check") WebElement Passwordag;
	@FindBy (id="auth-continue") WebElement Continue;
	
	
	public ProjPOM(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}
	public void typename(String name) {
		Name.sendKeys(name);
	}
	public void typeemail(String name) {
		Email.sendKeys(name);
	}
	public void typepassword(String name) {
		Password.sendKeys(name);
	}
	public void typepasswordag(String name) {
		Passwordag.sendKeys(name);
	}
	public void clickcontinue() {
		Continue.click();
	}
}
 