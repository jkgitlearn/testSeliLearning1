package testNGlearn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test_NG_MixedMthod {
	
  @Test
  public void f() {
	  System.out.println("This is from class mixed method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will execute before every Method-->from class mixed method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute after every Method-->from class mixed method");
  }

  @BeforeClass
  public void beforeClass() {
	   System.out.println("This will execute before the Class");
  }

  @AfterClass
  public void afterClass() {
	   System.out.println("This will execute after the Class");
  }

  @BeforeTest
  public void beforeTest() {
	   System.out.println("This will execute before the Test");
  }

  @AfterTest
  public void afterTest() {
	   System.out.println("This will execute after the Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	   System.out.println("This will execute before the Test Suite");
  }

  @AfterSuite
  public void afterSuite() {
	   System.out.println("This will execute after the Test Suite");
  }

}
