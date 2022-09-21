package learningsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Pg_Source {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // it opens the empty browser
		driver.manage().window().maximize();        
		
		driver.get("https://www.amazon.com");    //  launch the browser/ type on the url
		
		
		String actualPageSource = driver.getPageSource();  // get the page source of a page
		
	    String expectedKeywordsInPageSource =  "Amazon Basics ";   // it has to be something from the pagesource when u inspect if not it fails
	    System.out.println(actualPageSource);
	    
	    if (actualPageSource.contains(expectedKeywordsInPageSource)) 
	    {
	    	System.out.println("pass");
	    }
	    else
	    {
	    	System.out.println("fail");
	    }
		
            driver.close();
	}

}
