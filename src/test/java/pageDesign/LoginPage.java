package pageDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="//div[@class='form-group']//input[@id='email']")
	WebElement Emailaddrestab;
	
	@FindBy(css="//div[@class='form-group']//input[@id='passwd']")
	WebElement Passwordtab;
	

	@FindBy(xpath = "//li[contains(text(),'Invalid ')]")
	WebElement Emilerrormsg;

	@FindBy(xpath = "//li[contains(text(),'Password')]")
	WebElement msgmisspswd;

	@FindBy(xpath = "//li[contains(text(),'email ')]")
	WebElement emailmissmsg;

	@FindBy(xpath = "//li[contains(text(),'Authentication ')]")
	WebElement Authnticationerror;

	public WebElement Emailerrmsg() {

		return Emilerrormsg;
	}

	

	public WebElement msgmisspswd() {
		return msgmisspswd;
	}

	public WebElement emailmissmsg() {
		return emailmissmsg;
	}
public WebElement Authnticationerror() {
	return Authnticationerror;
}
	
public WebElement Emailaddrestab() {
	
	return Emailaddrestab;
}

public WebElement Passwordtab() {
return Passwordtab;	
	
}
}
