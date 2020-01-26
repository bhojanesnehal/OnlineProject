package com.jbkclass.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbkclass.qa.base.TestBase;
import com.jbkclass.qa.pages.DashboardPage;
import com.jbkclass.qa.pages.LogoutPage;
import com.jbkclass.qa.pages.SalesPage;
import com.jbkclass.qa.pages.SetupPage;

public class LogoutPageTest extends TestBase 
{
	com.jbkclass.qa.pages.LoginPage logpg;	
	SetupPage setPg;
	  DashboardPage dashPg;
		SalesPage salepg;
		LogoutPage logoutPg;
	public LogoutPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
  {
	  initialization();
	   logpg=new com.jbkclass.qa.pages.LoginPage();
	   salepg=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 
	   logoutPg=salepg.clickOnLogutLink();
  }
	
	@Test
  public void logOutMsgTest()
	{
		String logmsg=logoutPg.logOutMsg();
		//System.out.println(logmsg);
		Assert.assertEquals(logmsg, "Thank you for using FrontAccounting 2.4.5", "does not match msg");
	}

	@Test
  public void loginAgainLinkTest()
	{
		logoutPg.loginAgainLink();
	}
	 @AfterMethod
	 public void closeBrowser()
	  {
		  driver.quit();
	  }  

}
