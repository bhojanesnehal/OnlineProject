package com.jbkclass.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbkclass.qa.base.TestBase;
import com.jbkclass.qa.pages.DashboardPage;
import com.jbkclass.qa.pages.HelpPage;
import com.jbkclass.qa.pages.LoginPage;
import com.jbkclass.qa.pages.SalesPage;
import com.jbkclass.qa.pages.SetupPage;

public class HelpPageTest extends TestBase{
 
	LoginPage logpg;	
	SetupPage setPg;
	  DashboardPage dashPg;
		SalesPage salepg;
		 HelpPage helpPg;
	public HelpPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
  {
	  initialization();
	   logpg=new LoginPage();
	   salepg=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 
	    helpPg=salepg.clickOnHelpLink();
  }
	
	@Test
  public void getNewWindowTitleTest()  
	{
String title=helpPg.getNewWindowUrl();
		//.out.println("window title"+title);
		Assert.assertEquals(title,"FrontAccounting Wiki - Help - Sales");
		System.out.println("********After Assert*************");
	}

	 @AfterMethod
	 public void closeBrowser()
	  {
		  driver.quit();
	  }

}
