package learningsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Url = "http://only-testing-blog.blogspot.com/";
		driver.get(Url);
		String mainPageHandle = driver.getWindowHandle();   // this is very handy u need to have practice of writing even though u dont use it will help anytime
		                                                    // this is to switch from frame to window
		driver.manage().window().maximize();
		
	 // driver.switchTo().frame(0);        //the check box is inside the frame so we have to switch from window to frame
		                                   // we used  switch to frame---> using index it always start with 0 and if u have many frames the first frame is considered 0
		
	 // driver.switchTo().frame("frame1"); // we used  switch to frame---> using string with name or id	
		
		WebElement iFrame = driver.findElement(By.xpath("//*[@id='frame1']"));
		driver.switchTo().frame(iFrame);                                     // we used switch to frame using---> webelement---> for this we write a separate driver findelement and check the frame only and get xpaath carefully by making sure its correct frame within that
		                                                                    // eithr one switchto frame we can use
		WebElement catFrameChkBox = driver.findElement(By.xpath("//*[@id='post-body-3107268830657760720']/div[1]/table/tbody/tr[1]/td[1]/input"));
		catFrameChkBox.click();
		
		
	    WebElement dogframeChkBox = driver.findElement(By.xpath("//*[@id='post-body-3107268830657760720']/div[1]/table/tbody/tr[2]/td[2]/input"));
	    dogframeChkBox.click();
	    
	   driver.switchTo().window(mainPageHandle);            // to change form frame to window use switch to method with window mainpage handle that we used ddriver . get widow handle on the top
	   
	   WebElement fbLink = driver.findElement(By.xpath("//*[@id='LinkList1']/div/ul/li/a"));
	   fbLink.click();
	   
	   driver.navigate().back();
	   		
	   driver.switchTo().frame(1);
		
	   WebElement bikeCheckBox = driver.findElement(By.id("check1"));
	   bikeCheckBox.click();
	
	}

}
