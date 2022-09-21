package learningsel;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_WindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fhelp%2Faccount%2Fsigning-ebay-account%2Fsigning-ebay-account%3Fid%3D4191");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));    //using implicity wait
		
		//getwindowHandle()
		
		String windowId = driver.getWindowHandle();                // return ID of the single browser window that is parent/original window
	//	System.out.println("parent id---> " + windowId);
		
		WebElement userAgree = driver.findElement(By.xpath("//*[@id='legalTextId']/div/div/p/a[1]"));
		userAgree.click();                                          //opens another browser window ---child window		
		
		//getWindowHandles() 
		
		Set<String> windowIds = driver.getWindowHandles();            //return id's of multiple browser windows
	//	System.out.println("parent and child ids " + windowIds);     // duplicates are not allowed stores the data in any particular order
		
		
		for(String winId : windowIds)
		{
			String titles =driver.switchTo().window(winId).getTitle();
			String urls = driver.switchTo().window(winId).getCurrentUrl();
			System.out.println("title---> " + titles + " ---url---> " +  urls);
			
			
			//either ways we can write
			if(!(driver.switchTo().window(winId).getWindowHandle().equals(windowId)))   //using logical operator !--->true means false false means true
			{
				WebElement tex = driver.findElement(By.xpath("//*[@id=\"T2_article\"]/div/div/header/div/h1"));
				System.out.println(tex.getText());                                  // u get the particular window title that you want if u use, if in the for loop
				driver.close();
			}
			
			
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
