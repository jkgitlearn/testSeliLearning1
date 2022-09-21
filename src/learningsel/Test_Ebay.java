package learningsel;

// learning elements
import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Ebay {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

		WebElement searchBox = driver.findElement(By.id("gh-ac"));   // if u add any other letter to gh-acc it shows nosuchelement exception because its not in the inspect element it has to be from exactly from pagesource info
		searchBox.sendKeys("jljlj");
		
		WebElement link = driver.findElement(By.linkText("Electronics"));
		link.click();
		
		driver.navigate().back();
		
		WebElement plink = driver.findElement(By.partialLinkText("Sporting"));  // it was sporting and goods i took partial link text sporting
		plink.click();
		
		driver.close();

	}

}
