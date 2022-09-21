package learningsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // it opens the empty browser
		driver.get("https://www.amazon.com");    //  launch the browser/ type in the url
		 
		String expectedPageTitle = "Amazon.com. Spend less. Smile more.";
		  
		String actualPageTitle = driver.getTitle();   // get page title
		System.out.println(actualPageTitle);
		
		if(expectedPageTitle.equals(actualPageTitle))
		{
			System.out.println("TC1 is pass");
		}
		else
		{
			System.out.println("TC1 is fail");
		}
		
		
	
	}
}
