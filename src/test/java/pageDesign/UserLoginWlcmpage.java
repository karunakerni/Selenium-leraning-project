package pageDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginWlcmpage {
public WebDriver driver;
 public UserLoginWlcmpage(WebDriver driver) {
	 this.driver= driver;
	 PageFactory.initElements(driver, this);
 }
	
 @FindBy(xpath = "//div[@class='nav']//div[@class='header_user_info']//span")
	WebElement username;
 
	public WebElement usernametxt() {
		return username;
	}
}
