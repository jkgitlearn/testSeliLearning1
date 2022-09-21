package learningsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_getText {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com/");
		driver.manage().window().maximize();
		
		 driver.findElement(By.linkText("Create Account")).click();
		 
		 //verigy the label is full name so use gettext method
		 
		 WebElement fName = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[1]"));
		 String actualFNameLabelText = fName.getText();
		 System.out.println(actualFNameLabelText);
		 
		 // is displayed method
		 if(fName.isDisplayed())
		 {
			 System.out.println("pass");
		 }else
		 {
			 System.out.println("fail");
		 }
		 
		 
		 
		 }

}
