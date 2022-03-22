package pageDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationwelcomePage {

	
	public WebDriver driver;
	public RegistrationwelcomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
			}

	@FindBy(css="p.info-account")
		WebElement Welcomemsg;
	
	@FindBy(css="i.icon-chevron-left")
	WebElement Hometab;
	
	public WebElement Welcomemsg() {
			return Welcomemsg;
	}
	
	public WebElement Hometab() {
		return Hometab;
	}
	
	




}
