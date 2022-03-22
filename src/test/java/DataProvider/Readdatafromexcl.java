package DataProvider;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import utilities.ExcelReader;

public class Readdatafromexcl {
	
	@DataProvider()
	public Object[][]  getdatacrae() throws IOException{
		ExcelReader ER= new ExcelReader();		
		Object[][] ob= ER.readdata("C:\\Users\\Acer\\Desktop\\Selenium project\\Testdata.xlsx","Createaccountdata");
		return ob;
	}

	
	@DataProvider(name="FormData")
	public Object[][]  getdataregorm() throws IOException{
		ExcelReader ER= new ExcelReader();		
		Object[][] ob= ER.readdata("C:\\Users\\Acer\\Desktop\\Selenium project\\Testdata.xlsx","registerdata");
		return ob;
	}
	
	@DataProvider(name="regparttimetest")
	public Object[][]  regptestLogin() throws IOException{
		ExcelReader ER= new ExcelReader();		
		Object[][] ob= ER.readdata("C:\\Users\\Acer\\Desktop\\Selenium project\\Testdata.xlsx","regparttimetest");
		return ob;
	}
	@DataProvider(name="UserData")
	public Object[][]  UserLogin() throws IOException{
		ExcelReader ER= new ExcelReader();		
		Object[][] ob= ER.readdata("C:\\Users\\Acer\\Desktop\\Selenium project\\Testdata.xlsx","UserLogin");
		return ob;
	}
}
