package learningsel;

import java.util.List;

import org.openqa.selenium.By;                          //imports when findelement  by....
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;                 //imports while using webelement
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;          // imports when using--> select dropdown value for dropdown

public class Test_redif {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	String Url = "https://rediff.com/";
	//	driver.get(Url);
		driver.get("https://rediff.com/");                  // u can write directly or use string and write driver.get
		driver.manage().window().maximize();
		
		// getting the url of the website
		String S = driver.getCurrentUrl();
			System.out.println(S);
			
	    // link to open an create account/register page
        driver.findElement(By.linkText("Create Account")).click();
        
        //enter full name using one of the locator tagname
		driver.findElement(By.tagName("input")).sendKeys("Sameer Bhagwat");
	//	driver.findElement(By.id("Register")).click();                     // clicks on create my account button
	//    driver.findElement(By.tagName("input")).clear();
				
		//enter id
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("sameer22.22");	
		
		//checking availability
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		
		//enter id clear
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).clear();
		
		// enter id that is already taken
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("sameer22");
		
		//checking availability
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		
		//selecting one of the options id 
		
		//enter password
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("Learning@22");
		
		//enter retype password
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("Learning@22");
		
		//enter email address
		driver.findElement(By.xpath("//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("test22@gmail.com");
		
		//enter phone number
		driver.findElement(By.id("mobno")).sendKeys("1234567899");
		
		//enter date of birth
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]/option[9]")).click();
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]/option[44]")).click();
		
		//selecting gender
		WebElement radio1 = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]")); //for driver findelement use webelemnt for html
		radio1.click();
		System.out.println(radio1.isSelected());                //  is selected,is displayed is enabled using one of these to know they are selected and more
		
		//select country and city if applicable
	//	driver.findElement(By.xpath("//*[@id=\"country\"]/option[1]")).click();
	//	driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select/option[10]")).click();
		
	//	select country and city in different code using select class for selecting value from dropdown by locating its id
		
	    Select dropdown = new Select(driver.findElement(By.id("country")));
	//	dropdown.selectByVisibleText("United States");                       // u can write just this or u can write the following one for to print in console
	    
	    // Printing the options of the drop down                             //Get list of web elements
        List<WebElement> lst =dropdown.getOptions();                         // list the element in drop down in console to print write the following code
        

        //Looping through the options and printing dropdown options
        System.out.println("The dropdown options are:");
        for(WebElement options: lst)
            System.out.println(options.getText());
        
        // Selecting the option as 'united states'-- selectByIndex---> u can write byindex,byvalue or byvisible text
        System.out.println("Select the Option by Index 219");
       dropdown.selectByIndex(219);
        System.out.println("Select value is: " + dropdown.getFirstSelectedOption().getText());
			
      //  create my a/c button
	  //  driver.findElement(By.id("Register")).click();		
		
		 driver.navigate().back();
        
        // close
    	 driver.quit();	
		
        
		}

}
