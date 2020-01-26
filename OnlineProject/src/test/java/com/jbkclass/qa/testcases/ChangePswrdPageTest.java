package com.jbkclass.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbkclass.qa.base.TestBase;
import com.jbkclass.qa.pages.ChangePswrdPage;
import com.jbkclass.qa.pages.DashboardPage;
import com.jbkclass.qa.pages.SalesPage;
import com.jbkclass.qa.pages.SetupPage;

public class ChangePswrdPageTest extends TestBase {
	com.jbkclass.qa.pages.LoginPage logpg;	
	SetupPage setPg;
	  DashboardPage dashPg;
		SalesPage salepg;
		ChangePswrdPage paswrdPg;
	public ChangePswrdPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
  {
	  initialization();
	   logpg=new com.jbkclass.qa.pages.LoginPage();
	   salepg=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 
	    paswrdPg=salepg.clickOnChangePswrdLink();
  }
	
	@Test
  public void chnagePasswordTest()
	{
		String UpdatePawrdMsg=paswrdPg.chnagePassword("password", "password");
		System.out.println("message"+UpdatePawrdMsg);
		Assert.assertEquals(UpdatePawrdMsg, "Your password has been updated.", "does not match msg");
	}

	 @AfterMethod
	 public void closeBrowser()
	  {
		  driver.quit();
	  }
}
