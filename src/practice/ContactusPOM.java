package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPOM {
	WebDriver driver;
    //referencevariable.findelement(by.id("value"))
	@FindBy (id="text-77525447616") WebElement FName;
	@FindBy (id="text-95374915097") WebElement LName;
	@FindBy (id="text-27022866830") WebElement Email;
	@FindBy (id="field-tIgxvmTMez6ibt1") WebElement Phoneno;
	@FindBy (id="field-kJfKGbPLNi5yFI7") WebElement Msg;
	@FindBy (id="button-18782068913") WebElement Send;

	
	
	public ContactusPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void typefname(String name) {
		FName.sendKeys(name);
	}
	public void typelname(String name) {
		LName.sendKeys(name);
	}
    public void typeemail(String name) {
    	Email.sendKeys(name);
    }
     public void typephoneno(String name) {
        Phoneno.sendKeys(name);
     }
     public void typemsg(String name) {
    	 Msg.sendKeys(name);
     }
     public void clicksend() {
    	 Send.click(); 
     }

}




	
	

