package learningsel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Rediff1 {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Url = "https://rediff.com/";
		driver.get(Url);
		
		driver.manage().window().maximize();
		
		// link to open an create account/register page-->using one of the locator
        driver.findElement(By.linkText("Create Account")).click();
        
        //check availability button is enabled or not
        boolean isEnbled = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).isEnabled();
        
        if(isEnbled) 
        {
        	System.out.println("check avlblity button is enabled");
        }else
        {
        	System.out.println("check avlblity button is not enabled");
        }
        
        //check chk_altemailID() button isselected      
        WebElement alteMailId = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
        System.out.println(alteMailId.isSelected() +  " --->before selecting altMailId --->false");
        
        alteMailId.click();
        System.out.println(alteMailId.isSelected() + " --->after selecting altMailId--->true ");
        
        //checking when page loaded default mobile id +1 displayed
        WebElement mId = driver.findElement(By.xpath("//*[@id='lbl_txt']"));
        String cCDefaultText = mId.getText();
        boolean display = mId.isDisplayed();
        System.out.println(cCDefaultText);
        System.out.println(display  + " default +1 is displayed");
        
        
       // checking default male radio button is selected/checked
        WebElement maleRadio = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]"));
        boolean radioBtn = maleRadio.isSelected();
        System.out.println(radioBtn + " default maleRadio is selected");
        
        //checking female radio btn gets selected if user checks
        WebElement femaleRadio = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]"));
        boolean fRadio = femaleRadio.isSelected();
        System.out.println(fRadio + " --->before selecting the femaleRadio btn---> false");
        
        femaleRadio.click();
        System.out.println(femaleRadio.isSelected() + " --->after selecting the femaleRadio btn--->true");
        
        
       // using x-path locator---> copy x-path
       WebElement fName =  driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
	   fName.sendKeys("12345"); 
	   
	   WebElement R = driver.findElement(By.id("Register"));
	   R.click();
	   
	   Alert alert = driver.switchTo().alert();
	   String actualErrorTxt =alert.getText();
	   System.out.println(actualErrorTxt);
	 
	   alert.accept();
	   fName.clear();
	 
	   fName.sendKeys("Sameera Bhagwat");
	   R.click();
	   alert.accept();
	   
	   //enter id
	   WebElement id = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]"));
	   id.sendKeys("sameer22.22");
		 
	  //check availability
	   WebElement ca = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
	   ca.click();
	  
	  
	  
	  
	  
	  
	}

}
