package testNGPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_InvocationCount {           //if u want to repeat and execute the same test case u dont have to write 5 times just use keyword invocationcount how many times u want to get repeated 
	                                            //if u want to execute multiple times or dump the data use invocationCount 
  @Test(invocationCount=5)
  public void sum() {
	  int a= 10;
	  int b= 20;
	  int c= a+b;
	  System.out.println("sum is--->" + c);
	  Reporter.log("repeated test case");
  }
}
