package testNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_HardAssert {
	
	WebDriver driver;
	
	
  @Test
  public void OpenBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
      driver.get("https://www.drchrono.com/");
      
      Reporter.log("The website used was DemoQA for this test", true);
      String expectedTitle = "Free QA Automation Tools For Everyone";
      String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
      System.out.println("doesnt execute this");
   }
  
}
// hard assert doesnt execute the further code if it fails and also used parameters by giving message to the other team member
//so they can understand easily, Titles of the website do not match" as the message parameter which is expected to be seen on the console if the assertion fails.
//Assert.Method(actual, expected, message)



