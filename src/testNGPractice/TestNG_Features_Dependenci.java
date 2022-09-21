package testNGPractice;

import org.testng.annotations.Test;

public class TestNG_Features_Dependenci {
	
  @Test
  public void loginTest() {                     
	  System.out.println("login test");
  }
  
  @Test(dependsOnMethods= {"loginTest"})
  public void homePageTest() {                       //for ex: in application login test is important if login is failed what is the need of testing other features if we cannot login how will we go to home page
	  System.out.println("homePageTest");           //so for that we have a keyword depencesOnMethods if we use that keyword if that login test passes only it will execute the homepage test
  }                                                //homepage test dependence on the login test
  
  
  
  
  
}
