package module1_login;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {

	@BeforeClass
	public void OpenBrowser() 
	{
		
		
		Reporter.log("Open Browser", true);
		
	}
	@BeforeMethod
	public void LoginToApp() 
	{
		
		
		Reporter.log("Login To App", true);
		
	}
	@Test
	public void TC1() //Test Method /Test case
	{
		
		
		Reporter.log("Running TC1", true);
		
	}
	@Test
	public void TC2() //Test method/Test case
	{
		
		
		Reporter.log("Running TC2", true);
		
	}

	@AfterMethod
	public void LogoutFromApp() 
	{
		
		
		Reporter.log("Logout from App", true);
		
	}
	@AfterClass
	public void closeBrowser() 
	{
		
		
		Reporter.log("close Browser", true);
		
	}
	

	
	
	
	
	
	
	

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
