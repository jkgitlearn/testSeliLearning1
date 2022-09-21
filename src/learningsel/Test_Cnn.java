package learningsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Cnn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // it opens the empty browser
		//driver.manage().window().maximize();        
		
		                                       
		  driver.get("https://www.cnn.com/");    //  launch the browser/ type on the url

		  String expectedPageTitle = "CNN - Breaking News, Latest News and Videos";  // if u just give the space also it fails and it has to match the exact title that is executed in the console so copy that only
		
		
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
