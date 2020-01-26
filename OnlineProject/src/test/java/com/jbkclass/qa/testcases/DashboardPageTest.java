package com.jbkclass.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbkclass.qa.base.TestBase;
import com.jbkclass.qa.pages.DashboardPage;
import com.jbkclass.qa.pages.LoginPage;
import com.jbkclass.qa.pages.SalesPage;
import com.jbkclass.qa.pages.SetupPage;

public class DashboardPageTest extends TestBase {

	LoginPage logpg;	
	SetupPage setPg;
	  DashboardPage dashPg;
		SalesPage salepg;

	public DashboardPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
  {
	  initialization();
	   logpg=new LoginPage();
	   salepg=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 
	    dashPg=salepg.clickOnDashboardLink();
  }
	
	@Test
  public void checklabelsOfDashboardPage()
	{
		String label=dashPg.checklabelsOfDashboardPage();
		Assert.assertEquals(label, "Top 10 customers in fiscal year", "does not match label");
	}

	 @AfterMethod
	 public void closeBrowser()
	  {
		  driver.quit();
	  }
}

