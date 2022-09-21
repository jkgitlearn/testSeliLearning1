package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test()                           //if u give a parameter in test (enabled="false") -->this login by email doesnt execute as u told false it will ignore
	void loginByEmail()               // another way to ignore is in listener.xml u can just write down include and exclude
	{
		System.out.println("Login by email");
		Assert.assertEquals("shilpa", "shilpa");        //true
	}
	
	@Test()
	void loginByFacebook()
	{
		System.out.println("Login by facebook");
		Assert.assertEquals("shilpa", "shilpi");        //false
	}

}
//u need to mention this listners in .xml so it can listen just like testng.xml 