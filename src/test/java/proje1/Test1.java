package proje1;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataProvider.Readdatafromexcl;
import pageDesign.Accountcreationpage;
import pageDesign.FormregistrPage;
import pageDesign.RegistrationwelcomePage;
import pageDesign.SigninPD1;
import utilities.BaseFile;
import utilities.Brokenlinks;
import utilities.Linkfile;

public class Test1 extends BaseFile {
	public WebDriver driver;
	Linkfile LF = new Linkfile();

	@BeforeTest
	public void initati() throws IOException {
		System.out.println("Driver has been initated");
		driver = Driverinitation();
	}

	@Test(priority = 0, enabled = false)
	public void broken() throws MalformedURLException, IOException {
		Brokenlinks BR = new Brokenlinks(driver);
		BR.links();
		System.out.println("All links got verified");
	}

	@Test(priority = 1)
	public void signin() {
		LF.tittle(driver);
		SigninPD1 sign = new SigninPD1(driver);
		sign.signintab().click();
		System.out.println("Signin Tab has been clicked");
	}

	@Test(priority = 2, dataProviderClass = Readdatafromexcl.class, dataProvider = "getdatacrae")
	public void Acctcreat(String Email) throws InterruptedException {
		Accountcreationpage ACT = new Accountcreationpage(driver);
		System.out.println("We are in Create Account Page");
		ACT.Createaccountemail().clear();
		System.out.println("Test Cases TCA01-TCA04");
		ACT.Createaccountemail().sendKeys(Email);
		ACT.createacttab().click();
		LF.Elemtvisi(driver, 10, ACT.errormsg());

		try {
			ACT.errormsg().isDisplayed();
			System.out.println(ACT.errormsg().getText());
		} catch (Exception e) {

		}

	}

	@Test(priority = 3, dataProvider = "regptestLogin", dataProviderClass = Readdatafromexcl.class)
	public void FormregistrPagetest(String Fname, String Lname, String Email, String Pswd, String Company,
			String Address, String City, String ZIP, String Addinfo, String Homephone, String mobphone, String Note) {
		FormregistrPage FP = new FormregistrPage(driver);
		System.out.println("we are in Registration Form");
//	LF.text(FP.Pageheadtext());

		LF.pageld(driver,20);
		
		FP.gender().click();
		FP.Fname().clear();
		FP.Fname().sendKeys(Fname);

		FP.Lname().clear();
		FP.Lname().sendKeys(Lname);

		FP.email().clear();
		FP.email().sendKeys(Email);

		FP.Password().clear();
		FP.Password().sendKeys(Pswd);

		FP.day().click();

		LF.chkboxbyvalwithnotext(FP.day(), "10");

		LF.chkboxbyvalwithnotext(FP.month(), "5");

		LF.chkboxbyvalwithnotext(FP.year(), "2020");

		FP.Newsletter().click();
		FP.sploffer().click();

		FP.Company().clear();
		FP.Company().sendKeys(Company);

		FP.AddressFir().clear();
		FP.AddressFir().sendKeys(Address);

		FP.City().clear();
		FP.City().sendKeys(City);
		LF.chkboxbyvalwithnotext(FP.State(), "2");

		FP.Postcode().clear();
		FP.Postcode().sendKeys(ZIP);
		LF.chkboxbyvalwithnotext(FP.country(), "21");

		FP.Addinfo().clear();
		FP.Addinfo().sendKeys(Addinfo);

		FP.Homephone().clear();
		FP.Homephone().sendKeys(Homephone);

		FP.Mobphone().clear();
		FP.Mobphone().sendKeys(mobphone);

		FP.futref().clear();
		FP.futref().sendKeys(Note);
		FP.Registertab().click();
		LF.impwait(driver, 10);
		try {
			LF.textcap(FP.Fnameerror());
			LF.textcap(FP.Lnameerror());
			LF.textcap(FP.emailerror());
			LF.textcap(FP.Passworderror());
			LF.textcap(FP.pswdminlengtherror());
			LF.textcap(FP.Dateofbirtherror());
			LF.textcap(FP.Address1error());
			LF.textcap(FP.Postcoderror());
			LF.textcap(FP.phoneregistererror());
		} catch (Exception e) {

		}

	}

	@Test(priority = 4)
	public void WelcomePagetest() {

		RegistrationwelcomePage RWP = new RegistrationwelcomePage(driver);
		try {
			LF.textcap(RWP.Welcomemsg());
		} catch (Exception e) {

		}
		LF.impwait(driver, 10);
		RWP.Hometab().click();

	}

//	@AfterTest
//	public void close() {
//		LF.closcurrpage(driver);
//
//	}

}