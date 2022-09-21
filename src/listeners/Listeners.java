package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter        // this is just a simple class u cannot run or execute it is supported method to login test page
{                                                         // whenever it starts execute it will say test passed,failed,skiiped or started based on ur methods u have written
	public void onTestStart(ITestResult tr)	
	{
		System.out.println("Test Started");
	}
	
	public void onTestSuccess(ITestResult tr)	
	{
		System.out.println("Test Passed");
	}
	
	public void onTestFailure(ITestResult tr)	
	{
		System.out.println("Test Failed");
	}
	
	public void onTestSkipped(ITestResult tr)	
	{
		System.out.println("Test Skipped");
	}

}
