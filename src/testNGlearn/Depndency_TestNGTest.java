package testNGlearn;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depndency_TestNGTest {
	
  @Test
  public void f() {
  }
  
  @Test
  public void verifyRegisterPageLables() {
	  
  }
  
  @Test
  public void verifyRegisterPageValidations() {
	  
  }
    
  @Test
  public void verifyHeader() {
	  
  }
  
  @Test
  public void verifyInfotext() {
	  
  }
  
  @Test
  public void verifyDropDownFields() {
	  
  }
  
  @Test(dependsOnMethods= {"verifyDropDownFields"})
  public void verifyLinks() {
	  Reporter.log("TC1 of link pass");                     // this statement will show u in the report when u open the testoutput
  }
  
  @Test(dependsOnMethods= {"verifyLinks"})
  public void verifyPositiveRegisterActCreation() {
	  
  }
  
} 





 // dependscy means one method dependent on another method for ex:  verifyPositiveRegisterActCreation depends on 2 methods
 //Verifylink method and verfydropdownfields method
 //another ex: verify links method depend on verifydropdownfields method
 // if verifylinks passes only verifydropdownfields will execute, if verifylinks fail it doesnt execute dropdownfields, it ignores the
  //dropdownfields bcoz it dependent on verifylink
  
  //REporter.log is kind of it prints the senetence in report wjere we open in other browsers
//syso also prints but in only in console but this one helps in the reports  
 // to see the message in report  u need to execute first then check in testoutput emailable-report
  
  
  
  

