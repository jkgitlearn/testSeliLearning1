package testNGlearn;

import org.testng.annotations.Test;

public class Group_HomePageTest {
	
  @Test(groups= {"validations"})
  public void f() {
	  System.out.println("validations---homePage");
  }
}





/* TestNG allows you to perform sophisticated groupings of test methods. Not only can you declare that methods belong to groups, but you can also specify groups that contain other groups. Then TestNG can be invoked and asked to include a certain set of groups (or regular expressions) while excluding another set.  This gives you maximum flexibility in how you partition your tests and doesn't require you to recompile anything if you want to run two different sets of tests back to back.
Groups are specified in your testng.xml file and can be found either under the <test> or <suite> tag. Groups specified in the <suite> tag apply to all the <test> tags underneath. Note that groups are accumulative in these tags: if you specify group "a" in <suite> and "b" in <test>, then both "a" and "b" will be included.
For example, it is quite common to have at least two categories of tests
Check-in tests.  These tests should be run before you submit new code.  They should typically be fast and just make sure no basic functionality was broken. 
Functional tests.  These tests should cover all the functionalities of your software and be run at least once a day, although ideally you would want to run them continuously. */

//in testNG.xml u can also use word, include and exclude, that u want, so include helps only to execute that and exclude will execute except that.






