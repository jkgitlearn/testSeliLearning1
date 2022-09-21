package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Asserts {
 
WebDriver driver;
	

	@BeforeMethod
	public void setUp(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
   // driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.google.com/");
	}
	
	
   @Test()
   public void googleTitleTest() {
	String title =  driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "Google");          //instead if else, we can just write asserts which it tells its true or not and expected and actual will match or not
   }                                                // to validate whehter actual result matching expected result or not, we write assert otherwise no use of writing code if we dont validate
                                                    //validation is very important
    
   
   @Test()
   public void googleLogoTest() {
	WebElement d =  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
	 boolean display = d.isDisplayed();
	 System.out.println(display);
	 Assert.assertEquals(display, true);
	 
  }
   
  
   @Test                                    
   public void mailLinkTest() {                         
	  boolean M = driver.findElement(By.linkText("Gmail")).isEnabled();        
	   System.out.println(M);
	   Assert.assertTrue(M);
   } 
 
   @AfterMethod
   public void close() {
	  driver.quit();
  }
  
  
}

