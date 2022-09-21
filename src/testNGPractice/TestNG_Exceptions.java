package testNGPractice;

import org.testng.annotations.Test;

public class TestNG_Exceptions {
	
	
  @Test//(expectedExceptions=NumberFormatException.class)  // if we take the // out then it passes because we wrote expectedExceptin as we know that string 100A cannot convert into integer
  public void Test1() {                                    // we r telling testNG that we are expecting numberformat exception
	 String x= "100A";                                     // we handle exception--> try catch in java, instead try catch, we handle expectedException in tstNG
	  Integer.parseInt(x); 
  }
  
  
}
