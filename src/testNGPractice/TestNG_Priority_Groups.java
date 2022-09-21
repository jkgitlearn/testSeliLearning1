package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Priority_Groups {
  
	private static final int priority = 0;
	WebDriver driver;
	
	//1 //4 //7
	@BeforeMethod
	public void setUp(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
   // driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.google.com/");
	}
	
	//2
   @Test(priority=1, groups="TitleTest")
   public void googleTitleTest() {
	String title =  driver.getTitle();
	  System.out.println(title);
   }
   
    
   //5
   @Test(priority=3, groups= {"LogoTest"})
   public void googleLogoTest() {
	WebElement d =  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
	 boolean display = d.isDisplayed();
	 System.out.println(display);	  
  }
   
   //8
   @Test(priority=2, groups="LinkTest")                                   
   public void mailLinkTest() {                         
	   WebElement M = driver.findElement(By.linkText("Gmail"));        
	   boolean mail = M.isEnabled();
	   System.out.println(mail);
	 }
   
   @Test(priority=4, groups="Test")
   public void test1() {
	   System.out.println("test1");
   }
   
   @Test(priority=5, groups="Test")
   public void test2() {
	   System.out.println("test2");
   }
   
   @Test(priority=6, groups="Test")
   public void test3() {
	   System.out.println("test3");
   }
   
   //3 //6 //9
   @AfterMethod
   public void close() {
	  driver.quit();
  }
  
  
}
	
	
//If there are multiple @Test cases, TestNG runs the test cases in the alphabetical order
//TestNG annotation hierarchy is followed first and then priority-based execution. The larger the priority number, the lower is its priority. So a method with priority 1 will run after the test with priority 0



