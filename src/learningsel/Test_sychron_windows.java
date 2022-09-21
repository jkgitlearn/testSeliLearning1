package learningsel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_sychron_windows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create Account")).click();
		
			//Store the ID of the original window
		String originalWindow = driver.getWindowHandle();
		System.out.println(originalWindow);  //      in console it gives u the alpha numeric id which is dynamic
		
	  WebElement pPolicy = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[36]/td/a[2]")); //link button or privacy policy
	  pPolicy.click(); 
	
	  Set<String> whs= driver.getWindowHandles();     // how to open browsers in different window
	  
	  for(String wh : whs)
	  {
		  if(driver.switchTo().window(wh).getCurrentUrl().contains("http://www.rediff.com/w3c/policy.html")) // if u remove html or just one letter in it it will execute else 
		  {
		  WebElement priPolPgHdr = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/font/b"));
		  System.out.println(priPolPgHdr.getText());
		  driver.close();
		  }
		  /*else
		  {
			  System.out.println("fun trying new things");
		  }
		  break; */
	  }	
	  driver.switchTo().window(originalWindow);           //to switch to the main original window
	  System.out.println(driver.getCurrentUrl());
	
	  
	}
	
	
     
}
