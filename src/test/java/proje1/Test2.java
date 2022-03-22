package proje1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataProvider.Readdatafromexcl;
import pageDesign.LoginPage;
import pageDesign.SigninPD1;
import pageDesign.Signout;
import pageDesign.UserLoginWlcmpage;
import utilities.BaseFile;
import utilities.Linkfile;

public class Test2 extends BaseFile{
	
	public WebDriver driver;
	Linkfile LF= new Linkfile();
	
@BeforeTest
public void initation() throws IOException {
	System.out.println("Driver for Test2 has been initated");
	driver= Driverinitation();
}

//@Test(priority=0)
//public void  signouttest() {
//	
//	Signout SO= new Signout(driver);
//SO.SignoutTab().click();
//	
//}

@Test(priority=1)
public void  signintest() {
	
	SigninPD1 SI= new SigninPD1(driver);
SI.signintab().click();

	
}
@Test(priority=2, dataProvider="UserData", dataProviderClass=Readdatafromexcl.class)
public void  LoginPageTest(String Email, String Pswd) {	

	LoginPage LP= new LoginPage(driver);
	
	//LP.Emailaddrestab().clear();
	LP.Emailaddrestab().sendKeys(Email);
	LP.Passwordtab().clear();
	LP.Passwordtab().sendKeys(Pswd);
	SigninPD1 SI= new SigninPD1(driver);
	SI.signintab().click();
	LF.impwait(driver, 10);
try{
	LF.textcap(LP.Emailerrmsg());
		LF.textcap(LP.Emailerrmsg());
	LF.textcap(LP.emailmissmsg());
	LF.textcap(LP.msgmisspswd());
	LF.textcap(LP.Authnticationerror());
	}
catch(Exception e) {
}
}
@Test(priority=3)
public void loggedin() {
	
	UserLoginWlcmpage ULWP= new UserLoginWlcmpage(driver);
	
	LF.textcap(ULWP.usernametxt());

}

}