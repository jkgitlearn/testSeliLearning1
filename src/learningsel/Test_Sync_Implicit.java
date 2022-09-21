package learningsel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Sync_Implicit {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   // synch using implicit to find an element
	
		WebElement ca = driver.findElement(By.linkText("Create Account"));
		ca.click();
		 
		WebElement fn =driver.findElement(By.tagName("input"));
		 fn.sendKeys("Sameer Bhagwat");	
			
		
	}

}
