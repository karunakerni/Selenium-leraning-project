package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportscds {
public static ExtentReports extent;
public static ExtentSparkReporter reporter;
	
	public static ExtentReports reports() {
		Timem tm= new Timem();
		String td = tm.time();
		
		String path= System.getProperty("user.dir")+"\\Reports//reportextent.html"+td;
		System.out.println(path);
 reporter= new ExtentSparkReporter(path);
reporter.config().setDocumentTitle("Test report");

 extent= new ExtentReports();
extent.attachReporter(reporter);
return extent;


	}

}
