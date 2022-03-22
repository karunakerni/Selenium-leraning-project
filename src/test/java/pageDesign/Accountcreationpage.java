package pageDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountcreationpage {
	
	public WebDriver driver;
	
	public Accountcreationpage(WebDriver driver) {
		this.driver= driver;
PageFactory.initElements(driver, this);	
}

	@FindBy(xpath="//div[@class='form-group']//input[@id='email_create']")
	WebElement Createaccountemail;
	
	@FindBy(xpath="//div[@class='alert alert-danger']//li")
	WebElement errormsg;
	
	@FindBy(xpath="//button[@id='SubmitCreate']/span")
	WebElement createacttab;
	
	public WebElement Createaccountemail() {
	return Createaccountemail;
	
	}

	public WebElement errormsg() {
		return errormsg;
	}
	
	public WebElement createacttab() {
		return createacttab;
	}
}
