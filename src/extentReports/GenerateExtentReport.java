package extentReports;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class GenerateExtentReport 
{
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;                               //specify the location of the report
    ExtentTest test;                                      //what details should be populated in the report
    
    
    @BeforeTest
    public void startReport() 
    {
       
    	extent = new ExtentReports(); 
    	htmlReporter = new ExtentHtmlReporter("./test-output/extentReport2.html");     //. is very important it shows the path of the file
		extent.attachReporter(htmlReporter);
		
//    	extent.setSystemInfo("environment", "environment name");
    	extent.setSystemInfo("Host Name", "LocalHost");
    	extent.setSystemInfo("Environment", "QA");
    	extent.setSystemInfo("User Name", "Shilpa");
    	
      
    	htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
    	
    	
//      htmlReporter.config().setDocumentTitle("First Extentreport");  // either ways u can give file name in the base directory extent-config.xml or just write like the following to change the theme, report name etc
        // Name of the report
//      htmlReporter.config().setReportName("build"); 
        // Dark Theme
//      htmlReporter.config().setTheme(Theme.DARK);	
		
			
    }
       @Test
       public void demoReportPass()
       {
    	   test=extent.createTest("demoReportPass");
    	   Assert.assertTrue(true);
    	   test.log(Status.PASS, "assert pass as condition is true");
       }   
    	
       
       
       @Test
       public void demoReportFail()
       {
    	   test=extent.createTest("demoReportFail");
    	   Assert.assertFalse(true);
    	   test.log(Status.FAIL, "assert pass as condition is false");
    	//   test.createNode("assert fail as condition is false");
       }
       
       @AfterMethod
       public void getResult(ITestResult result)
       {
    	   if(result.getStatus() == ITestResult.FAILURE)
    	   {
    		   test.log(Status.FAIL, result.getThrowable());
    	   }
    	 //  extent.removeTest(test);
       }
       
       @AfterTest
   	public void endReport() {
  		extent.flush();
   	}
       
      

}