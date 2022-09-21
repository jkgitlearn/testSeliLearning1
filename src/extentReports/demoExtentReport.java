package extentReports;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class demoExtentReport {
	
	

	@Test
	public void logintest() throws IOException 
	{
        // Create object of ExtentReports class- This is main class which will create report
		ExtentReports extent = new ExtentReports();
		
		// Create Object of ExtentHtmlReporter and provide the path where you want to generate the report 
        // I used (.) in path where represent the current working directory
		ExtentHtmlReporter sparkReporter = new ExtentHtmlReporter("./reports/extentReport1.html");
		
		// attach the reporter which we created in Step 1
		extent.attachReporter(sparkReporter);
		
        // call createTest method and pass the name of TestCase- Based on your requirement
		ExtentTest logger = extent.createTest("loginTest");
		
		//by using this external xml file [extent-config.xml] we could change the details such as report theme,report tiltle, document title and more
    	sparkReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
		
        // log method will add logs in report and provide the log steps which will come in report
		logger.log(Status.INFO, "login to amazon");
		logger.log(Status.PASS, "Title verified");
		
        // Flush method will write the test in report- This is mandatory step  
		extent.flush();		
		
		//environment variables in the report
		extent.setSystemInfo("Host Name", "LocalHost");
    	extent.setSystemInfo("Environment", "QA");
    	extent.setSystemInfo("User Name", "Shilpa");
		
        // You can call createTest method multiple times depends on your requirement
        // In our case we are calling twice which will add 2 testcases in our report
		ExtentTest logger2 = extent.createTest("logoff test");
		logger2.log(Status.INFO, "login to amazon");
		logger2.log(Status.FAIL, "Title verified");
		
		//test with snapshot		
		logger2.fail("failed bcoz of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/sihik/Desktop/ScreenshotJava/portion1657599611482.png").build());
		logger2.pass("failed bcoz of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/sihik/Desktop/ScreenshotJava/form.png").build());

//		logger2.addScreenCaptureFromPath("C:/Users/sihik/Desktop/ScreenshotJava.png");   // this is not used much, above one is used for screenshot
		
		// This will add another test in report
		extent.flush();
				
		
	}
	
}



//Above code will generate the report in specific directory.

