package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.RegisterPage;
import Resources.Base;


public class Register extends Base {
	
	
@BeforeTest
public void initialize() throws IOException
{
	driver=initializedriver();
	
	
}
	
	
	@Test
	public void Register()
	{
		driver.get(pr.getProperty("url"));	
		RegisterPage reg=new RegisterPage(driver);
		reg.register().click();
		reg.fullname().sendKeys("Ram Bhanuse");
		reg.email().sendKeys("rambhanuse@gmail.com");
		reg.password().sendKeys("123456");
		reg.confirmpassword().sendKeys("123456");
		reg.iagreeinstr().click();
		reg.iagreeterm().click();
		reg.signup().click();
		System.out.println("Testing Git functionality");
		System.out.println("changes done by master");
	}

@AfterTest
public void close()
{
	System.out.println("closing driver");
	driver.close();
}
	
}
