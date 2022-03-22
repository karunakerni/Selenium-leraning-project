package proje1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class rerun implements IRetryAnalyzer{
	int reqtry=3;
	int acttry=0;
	@Override
	public boolean retry(ITestResult result) {
		
		if(acttry<reqtry) {
			acttry++;


return true;			
			}
		
		
		return false;
	}
	
	
		
	

}
