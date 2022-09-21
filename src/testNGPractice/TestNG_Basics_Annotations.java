package testNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Basics_Annotations {
	
	//Pre-conditions annotations --Starting with @before
	@BeforeSuite//1
	public void setup() {
		System.out.println("setup system property for chrome--BeforeSuite");
	}
	
	@BeforeTest//2
	public void launchBrowser() {
		System.out.println("launch browser----BeforeTest");
	}
	
	@BeforeClass//3
	public void login() {
		System.out.println("login to app----BeforeClass");
	}
	
	@BeforeMethod//4
	public void enterURL() {
		System.out.println("enter URL....BeforeMethod");
	}
	
	
	//test cases---Staring With @Test
	@Test//5
	public void googleTitleTest() {
		System.out.println("Google Title Test.....Test");
	}
	
	@Test
	public void searchTest(){
		System.out.println("searchTest....Test");
	}	
	//post conditions---Starting with @after
	@AfterMethod//6
	public void logOut() {
		System.out.println("logout from app.....AfterMethod");
	}
	
	@AfterClass//7
	public void deleteAllCookies() {
		System.out.println("delete all cookies....Afterclass");
	}
	
	@AfterTest//8
	public void closeBrowser() {
		System.out.println("close Browser...AfterTest");
	}
	
	@AfterSuite//9
	public void generateTestReport() {
		System.out.println("generate test report....AfterSuite");
	}
	
}
//aftersuite will be displayed in console once all the test cases have been showed
// even though u write in any order(if u jumble them like beforemethod first and beforesuite next) it will still execute step by step as shown above code








