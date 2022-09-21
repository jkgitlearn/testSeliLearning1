package testNGlearn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test_NG_BA_Mthod {
	
  @Test
  public void f() {                                    // if we have two test cases or more and it always execute alphabatecally
	  System.out.println("This is simple test case"); //beforemethod ,test, aftermethod again  beforemethod, another-testcase, aftermethod
  }
  
  @Test
  public void testCase1() {
    System.out.println("This is the A Normal Test Case"); 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will execute before every Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute after every Method");
  }

}
