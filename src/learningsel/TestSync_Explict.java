package learningsel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSync_Explict {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com/");
		
		WebElement ca = driver.findElement(By.linkText("Create Account"));
		ca.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));  //explicit
		wait.until(ExpectedConditions.urlContains("http://register.rediff.com/register/register.php?FormName=user_details"));
        //http://register.rediff.com/register/register.php?FormName=user_details
		
		
	}

}
