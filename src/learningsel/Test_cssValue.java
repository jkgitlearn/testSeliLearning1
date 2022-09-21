package learningsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_cssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com/");
		driver.manage().window().maximize();
		
		 driver.findElement(By.linkText("Create Account")).click();
		 
		 WebElement rId = driver.findElement(By.cssSelector("input[name*='login']"));  // css selector locator
		 rId.sendKeys("jklmnop");
		 
		 String actualRId = rId.getCssValue("font-style");  //      get css value
		 String expectedRId = "normal";
		 
		 if(actualRId.equals(expectedRId))
		 {
			 System.out.println("pass");
		 }else
		 {
			 System.out.println("fail");
		 }

	}

}
