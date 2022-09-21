package testNGPractice;

import org.testng.annotations.Test;

public class TestNG_Depend_failed {
  
	@Test
	  public void loginTest() {      
		int i =9/0;                                       //if u dont write 9/0 all will execute as login page is passed if u write its failed
		  System.out.println("login test");
	  }
	  
	  @Test(dependsOnMethods= {"loginTest"})
	  public void homePageTest() {                       //for ex: in application login test is important if login is failed what is the need of testing other features if we cannot login how will we go to home page
		  System.out.println("homePageTest");           //so for that we have a keyword depencesOnMethods if we use that keyword if that login test passes only it will execute the homepage test
	  }                                                // its failed bcoz 9/0 cannt be done u get arthemetic exception and aslo it skipped homepage test as login test got failed because homepage depends on login page
	  
	  @Test(dependsOnMethods= {"loginTest"})
	  public void searchPageTest() {      
		  System.out.println("login test");
	  }
	  
}
