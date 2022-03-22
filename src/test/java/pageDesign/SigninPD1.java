package pageDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPD1 {

	public WebDriver driver;

	public SigninPD1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a.login")
	WebElement signintab;

	public WebElement signintab() {
		return signintab;
	}

	
}
