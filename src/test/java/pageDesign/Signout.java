package pageDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout {

	public WebDriver driver;
	
	public Signout(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@title='Log me out']")
	WebElement SignoutTab;
	
	public WebElement SignoutTab() {
		return SignoutTab;
	}
	
	
}
