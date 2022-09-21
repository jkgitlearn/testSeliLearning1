package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegistrationPage_2 {
  
	WebDriver driver;
	
	@FindBy(how = How.LINK_TEXT, using= "REGISTER")             //how-->variable  HOW-->class 
	WebElement regLink;
	
	@FindBy(how = How.NAME, using = "firstName")          //syntax 1
	WebElement firstName;
	
//	@FindBy(name = "firstName")                           //syntax 2
//	WebElement firstName;
	
	@FindBy(name = "lastName")                         
	WebElement lastName;
	
	@FindBy(name = "phone")                         
	WebElement phone;
	
	@FindBy(name = "userName")                         
	WebElement email;
	
	@FindBy(name = "address1")                         
	WebElement address1;
	
	@FindBy(name = "city")                         
	WebElement city;
	
	@FindBy(name = "state")                         
	WebElement  state;
	
	@FindBy(name = "postalCode")                         
	WebElement postalCode;
	
	@FindBy(name = "country")                         
	WebElement country;
	
	@FindBy(name = "email")                         
	WebElement userName;
	
	@FindBy(name = "password")                         
	WebElement password;
	
	@FindBy(name = "confirmPassword")                         
	WebElement confirmPassword;
	
	@FindBy(name = "submit")WebElement submitBtn;  //u can also write like this in one line either ways
	
	
	RegistrationPage_2(WebDriver d)
	{
		driver =d;
		PageFactory.initElements(d, this);     // if u dont write this additional method driver will not initiate so we have to add pagefactory method we have to write because we used @findBy method thats why we use page factory
	}
	
	
	public void clickRegLink() 
	{
		regLink.click();
	}
	
	public void setFirstName(String fName) 
	{
		firstName.sendKeys(fName);
	}
	
	public void setLastName(String lName) 
	{
		lastName.sendKeys(lName);
	}
	
	public void setPhone(String ph) 
	{
		phone.sendKeys(ph);
	}
	
	public void setEmail(String mail) 
	{
		email.sendKeys(mail);
	}
	
	public void setAddress1(String addr1) 
	{
		address1.sendKeys(addr1);
	}
	
	public void setCity(String ci) 
	{
		city.sendKeys(ci);
	}
	
	public void setState(String st) 
	{
		state.sendKeys(st);
	}
	
	public void setPostalCode(String code) 
	{
		postalCode.sendKeys(code);
	}
	
	public void setCountry(String ctry) 
	{
		WebElement con = country;
		Select drop = new Select(con);
		drop.selectByVisibleText(ctry);
	}
	
	public void setUserName(String uname) 
	{
		userName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) 
	{
		password.sendKeys(pwd);
	}
	
	
	public void setCPassword(String confirmPwd) 
	{
		confirmPassword.sendKeys(confirmPwd);
	}
	
	
	public void clickSubmit()
	{
		submitBtn.click();
	}
		
	
	
	
	
	
	
	
}
