package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {
	
	private static final int priority = 0;
	WebDriver driver;
	@Parameters("browser")                         // using cross browser testing
	                                               // if u want to use parallel testing just write parallel="test" in testng.xml in the line suite 
	
	//1 //4 //7
	@BeforeMethod
	public void setUp(String browser){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
    System.setProperty("webdriver.edge.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\edgedriver_win64\\msedgedriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	
	if(browser.equalsIgnoreCase("chrome"))
	{
	    driver = new ChromeDriver();
	}
	if(browser.equalsIgnoreCase("edge")) 
	{
	    driver = new EdgeDriver();
	}
	if(browser.equalsIgnoreCase("firefox"))
	{
	    driver = new FirefoxDriver();
	}    
    
    driver.manage().window().maximize();
   // driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.google.com/");
	}
	
	//2
   @Test()
   public void googleTitleTest() {
	String title =  driver.getTitle();
	  System.out.println(title);
   }
   
    
   //5
   @Test()
   public void googleLogoTest() {
	WebElement d =  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
	 boolean display = d.isDisplayed();
	 System.out.println(display);	  
  }
   
   //8
   @Test                                    
   public void mailLinkTest() {                         
	   WebElement M = driver.findElement(By.linkText("Gmail"));        
	   boolean mail = M.isEnabled();
	   System.out.println(mail);
	 }
   
   //3 //6 //9
   @AfterMethod
   public void close() {
	  driver.quit();
  }
  
  
}

//It might happen (intentionally or unintentionally) that the tester decides to provide the same priorities for different methods under TestNG annotations. In that case, TestNG runs the test cases in the alphabetical order
// If there are multiple @Test cases, TestNG runs the test cases in the alphabetical order
//TestNG annotation hierarchy is followed first and then priority-based execution. The larger the priority number, the lower is its priority. So a method with priority 1 will run after the test with priority 0




