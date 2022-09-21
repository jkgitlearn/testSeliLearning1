package learningsel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Url = "https://javascript.info/alert-prompt-confirm";
		driver.get(Url);
		
		driver.manage().window().maximize();
		
		WebElement salertTrigger = driver.findElement(By.xpath("//*[@id='k25dnwec3g']/div/div[1]/div[1]/a"));
		salertTrigger.click();
		
		Alert alert = driver.switchTo().alert();             //simple alert or alert
		String actualsAlertmsg = alert.getText();
		System.out.println(actualsAlertmsg);
		alert.accept();
		
		WebElement  palertTrigger = driver.findElement(By.xpath("//*[@id='yjmyjrwme5']/div/div[1]/div[1]/a"));
		palertTrigger.click();                                 // prompt alert
		alert.sendKeys("150");
		alert.dismiss();                   //accept --->it will take the number and prints u r 150 yrs old
		                                   //dismiss--->it will not accept the number
		
		String actualTextAfterDismissofpalert = alert.getText();
		System.out.println(actualTextAfterDismissofpalert);
		alert.accept();
		
		
        WebElement cAlertTrigger = driver.findElement(By.xpath("//*[@id='csv1y7me47']/div/div[1]/div[1]/a"));
        cAlertTrigger.click();                       //confirm alert
        alert.accept();
        
        String actualTextAfterAccept = alert.getText();
        System.out.println(actualTextAfterAccept);
        alert.dismiss();
        
        

	}

}
