package learningsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_GetAttrib {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com/");
		driver.manage().window().maximize();
		
		 driver.findElement(By.linkText("Create Account")).click();
		
	    WebElement fname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	    fname.sendKeys("hhkjhh");
	    fname.clear();
	    
	   String actualFNameLength = fname.getAttribute("maxlength");                    //get attribute
	   System.out.println("actualFNameLength = " + actualFNameLength);
	   String expectedFNameLength = "61";
	   
	   if(actualFNameLength.equals(expectedFNameLength))
	   {
		   System.out.println("actualFNameLength equals expectedFNameLength = pass");
	   }else
	   {
		   System.out.println("actualFNameLength equals expectedFNameLength = fail");
	   }

	}

}
