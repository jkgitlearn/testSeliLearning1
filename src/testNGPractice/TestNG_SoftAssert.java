package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAssert {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
//      driver.get("https://www.drchrono.com/");
	}
	
	@Test (priority = 2)
	public void CloseBrowser() 
	{
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test (priority = 1)
	public void OpenBrowser() 
	{
			Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver version ...for this test"); 
	        
	        driver.get("https://www.drchrono.com/");
	        SoftAssert softassert = new SoftAssert();
	        Reporter.log("The website used was drchrono for this test", true);
	      
	        
	        String expectedTitle = "EHR, Practice Management, Medical Billing, & RCM | DrChrono";
	        String originalTitle = driver.getTitle();
	        softassert.assertEquals(originalTitle, expectedTitle);
	        
	        System.out.println("*** Checking For The second Title ***");
	        
	     // the asserts used till now will not throw any exception if they fail. The @Test will not fail either. 
	    // If you need the test method to fail at the end, showing all exceptions, you need to use assertAll()
	        
           // Checking title for drchrono – 
	        softassert.assertEquals(originalTitle, "Drchrono" );
	        softassert.assertAll();
	}
 
}

//soft asserts execution does not stop but it shows what failed with summary
//hard asserts stop the execution if it fails and doesnt execute the further code
//Using assertAll() at the end it will check if any of the asserts during the test failed, and will fail your test with proper summary.

//important points to remember concerning soft assert that we can notice in the above code are:

//Soft assert requires the external import of the package import org.testng.asserts.SoftAssert;.
//An object of the SoftAssert runs the assert statements.
//The object should have a life within the same test method in which we declared it.
//object.assertAll() statement is required to see the exceptions; otherwise, the tester won't know what passed and what failed.
//It shows that our assertions executed and which ones failed. But the test execution did not stop.

