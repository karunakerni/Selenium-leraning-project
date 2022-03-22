package pageDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormregistrPage {
public WebDriver driver;

public FormregistrPage(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver,this);
}

@FindBy(css="//h1[contains(text(),'Create')]")
WebElement Pageheadtext;

@FindBy(id="id_gender2")
WebElement gender;

@FindBy(name="customer_firstname")
WebElement Fname;

@FindBy(xpath="//div[@class='alert alert-danger']//li/b[contains(text(),'firstname')]")
WebElement Fnameerror;

@FindBy(name="customer_lastname")
WebElement Lname;

//@FindBy(xpath="//div[@class='alert alert-danger']//li/b[contains(text(),'lastname')]")
@FindBy(xpath="//div[@class='alert alert-danger']//li/b[contains(text(),'lastname')] //ancestor:: li[contains(text(),' is required.')]")
WebElement Lnameerror;

@FindBy(xpath="//div[@class='account_creation']//input[@id='email']")
WebElement Email;

@FindBy(xpath="//div[@class='alert alert-danger']//li/b[contains(text(),'email')]")
WebElement emailerror;


@FindBy(xpath="//div[@class='account_creation']//input[@id='passwd']")
WebElement Password;

@FindBy(xpath="//div[@class='alert alert-danger']//li/b[contains(text(),'passwd')]")
WebElement Passworderror;

@FindBy(xpath="//div[@class='required password form-group form-error']//span[contains(text(),'minimum')]")
WebElement pswdminlengtherror;

@FindBy(xpath="//select[@id='days']")
WebElement day;

@FindBy(xpath="//select[@id='months']")
WebElement month;

@FindBy(xpath="//select[@id='years']")
WebElement year;

@FindBy(xpath="//div[@class='alert alert-danger']//li[contains(text(),'birth')]")
WebElement Dateofbirtherror;

@FindBy(id="newsletter")
WebElement Newsletter;

@FindBy(id="optin")
WebElement sploffer;


@FindBy(id="company")
WebElement Company;

@FindBy(id="address1")
WebElement Address1;

@FindBy(xpath="//div[@class='alert alert-danger']//li/b[contains(text(),'address1')]")
WebElement Address1error;


@FindBy(id="address2")
WebElement Address2;

@FindBy(id="city")
WebElement City;

@FindBy(xpath="//div[@class='alert alert-danger']//li/b[contains(text(),'city')]")
	WebElement Cityerror;

@FindBy(xpath="//select[@id='id_state']")
WebElement State;

@FindBy(id="postcode")
WebElement Postcode;

@FindBy(xpath="//div[@class='alert alert-danger']//li[contains(text(),'Zip/Postal')]")
WebElement Postcoderror;

@FindBy(xpath="//select[@id='id_country']")
WebElement country;

@FindBy(id="other")
WebElement Addinfo;

@FindBy(id="phone")
WebElement Homephone;

@FindBy(id="phone_mobile")
WebElement Mobphone;


@FindBy(xpath="//div[@class='account_creation']//p[contains(text(),'register ')]")
WebElement phoneregistererror;

@FindBy(id="alias")
WebElement futref;

@FindBy(xpath="//button[@id='submitAccount']/span")
WebElement Registertab;

public WebElement Pageheadtext() {
	return Pageheadtext;
	}

public WebElement gender() {
	return gender;
}

public WebElement Fname() {
	return Fname;
}

public WebElement Fnameerror() {
	return Fnameerror;
}
 
public WebElement Lname() {
	return Lname;
}

public WebElement Lnameerror() {
	return Lnameerror;
}
public WebElement email() {
	return Email;
	
}
public WebElement emailerror() {
	return emailerror;
}

public WebElement Password() {
	return Password;
}

public WebElement Passworderror() {
	return Passworderror;
}

public WebElement pswdminlengtherror() {
	return pswdminlengtherror;
}


public WebElement day() {
	return day;
}

public WebElement month() {
	return month;
}
public WebElement year() {
	return year;
}

public WebElement Dateofbirtherror() {
	return Dateofbirtherror;
}


public WebElement Newsletter() {
	return Newsletter;
}

public WebElement sploffer() {
	return sploffer;
}

public WebElement Company() {
	return Company;
}

public WebElement AddressFir() {
	return Address1;
}

public WebElement Address1error() {
	return Address1error;
}

public WebElement Addresssec() {
	return Address2;
}

public WebElement City() {
	return City;
	}

public WebElement Cityerror() {
	return Cityerror;
	}
public WebElement State() {
	return State;
	}

public WebElement Postcode() {
	return Postcode;
	}

public WebElement Postcoderror() {
	return Postcoderror;
	}

public WebElement country() {
	return country;
	}

public WebElement Addinfo() {
	return Addinfo;
	}

public WebElement Homephone() {
	return Homephone;
	}
public WebElement Mobphone() {
	return Mobphone;
	}


public WebElement phoneregistererror() {
	return phoneregistererror;
	}


public WebElement futref() {
	return futref;
	}


public WebElement Registertab() {
	return Registertab;
	}


}

