package learningsel;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com/");
		
		WebElement ca = driver.findElement(By.linkText("Create Account"));
		ca.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));  //explicit
		wait.until(ExpectedConditions.urlContains("http://register.rediff.com/register/register.php?FormName=user_details"));
        //http://register.rediff.com/register/register.php?FormName=user_details
		
		WebElement fName =  driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
		   fName.sendKeys("dhdhdhd"); 
		   
		   Timestamp ts = new Timestamp(System.currentTimeMillis());
		   long ts1 = ts.getTime();
		   
		   File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   
		   FileHandler.copy(scrfile, new File ("C:\\Users\\sihik\\Desktop\\ScreenshotJava\\screen" + ts1 + ".png"));
		   

	}

}
