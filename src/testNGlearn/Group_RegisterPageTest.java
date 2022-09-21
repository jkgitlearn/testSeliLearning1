package testNGlearn;

import org.testng.annotations.Test;

public class Group_RegisterPageTest {
	
  @Test
  public void f() {
  }
  
  @Test(groups={"smoke"})
  public void verifyRegisterPageLables() {
	  System.out.println("smoke---Registerpage");
	  
  }
  
  @Test(groups= {"smoke", "validations"})
  public void verifyRegisterPageValidations() {
	  System.out.println("smoke/validations---registerPage");
	  
  }
  
}
