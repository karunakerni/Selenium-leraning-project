package proje1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utilities.BaseFile;
import utilities.Extentreportscds;
public class list extends BaseFile implements ITestListener {
	public static ExtentReports extent=Extentreportscds.reports();
	public ExtentTest test;
	ThreadLocal <ExtentTest>TL;
	@Override
	public void onTestStart(ITestResult result) {
		String Name=result.getMethod().getMethodName();
	test= extent.createTest(Name);
	TL= new ThreadLocal<ExtentTest>();
	TL.set(test);
	TL.get().log(Status.INFO,"Test Initated"+Name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String	Name=result.getMethod().getMethodName();
		TL.get().log(Status.PASS,"Test passed"+Name);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String Name = null;
		WebDriver driver = null;
  try {
		driver  = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	try {
		String photo = screenshot(driver,Name);
	TL.get().log(Status.FAIL,Name);
		TL.get().addScreenCaptureFromPath(photo);
	
			WebElement popuoerror = driver.findElement(By.xpath("//a[@title='Close']"));
			popuoerror.click();}
			catch(Exception e)
	{}}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();}
	

}
