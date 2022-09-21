package learningsel;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test_ScreenShot1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		 
		   Timestamp ts = new Timestamp(System.currentTimeMillis());
		   long ts2 = ts.getTime();
		   
		   
		   //full screenshot
		   File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileHandler.copy(scrfile, new File ("C:\\Users\\sihik\\Desktop\\ScreenshotJava\\screen" + ts2 + ".png"));
		  
		   //screenshot of section/portion of the page
		   WebElement section = driver.findElement(By.xpath("//*[@id=\"items_list1\"]"));  // path of the portion section of the xpath
		   File scrfile1 = (section.getScreenshotAs(OutputType.FILE));                     // use section., instead takesscreenshot driver.
		   FileHandler.copy(scrfile1, new File ("C:\\Users\\sihik\\Desktop\\ScreenshotJava\\portion" + ts2 + ".png"));

		
	}

}
