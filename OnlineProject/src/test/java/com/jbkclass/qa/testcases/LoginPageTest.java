package com.jbkclass.qa.testcases;
/*Snehal bhojane*/
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbkclass.qa.base.TestBase;
import com.jbkclass.qa.pages.SalesPage;

public class LoginPageTest extends TestBase
{
com.jbkclass.qa.pages.LoginPage logpg;	
SalesPage salepg;

	public LoginPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
  {
	  initialization();
	   logpg=new com.jbkclass.qa.pages.LoginPage();
  }
	
	@Test
	 public void loginTest()
	  {
		//System.out.println("prop"+prop.getProperty("username")+ prop.getProperty("password"));
	 salepg=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 

	  }
	
	 @AfterMethod
	 public void closeBrowser()
	  {
		  driver.quit();
	  }
}
