package testNGlearn;

import org.testng.annotations.Test;

public class Group_LoginPageTest {
	
  @Test
  public void f() {
  }
  
  @Test(groups= {"smoke"})               //groups can be 
  public void verifyLogInLables() {
	  System.out.println("smoke---loginPage");
	  
  }
  
  @Test(groups= {"validations"})
  public void verifyLogInValidations() {
	  System.out.println("validations--loginPage");	  
  } 
  
}


//if u refresh particular project u will see testoutput file in that go to index.html right click on that and click on properties
// and copy the location and paste it in browser it will show the complete clear details about that testNG report  details and u can easily
// send those report to ur manager in case any bugs or any other problems u have

// TO SEE THE LAST EXECUTION OF THE REPORT:
// GO TO TestNG particular PROJECT right click then click on PROPERTIES then in that click on location link it will take u 
// to files in that u see ur project name then double click in that us see  TEST OUTPUT double click in that u see EMAILABLE REPORT
// if u click that it opens in a browser and u see the last exexution report

//ANOTHER WAY TO SEE THE LAST EXECUTION OF THE REPORT:
//IF U REFRESH UR PARTICULAR PROJECT u see test-output IN THAT U SEE emailable-report u can right click on it AND SAY open with web browser
// it will open in the broswer and u can see the reports







