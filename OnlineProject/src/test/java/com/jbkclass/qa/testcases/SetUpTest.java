package com.jbkclass.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbkclass.qa.base.TestBase;
import com.jbkclass.qa.pages.SalesPage;
import com.jbkclass.qa.pages.SetupPage;

public class SetUpTest extends TestBase{
	com.jbkclass.qa.pages.LoginPage logpg;	
	SalesPage salepg;
	SetupPage setPg;

	public SetUpTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
  {
	  initialization();
	   logpg=new com.jbkclass.qa.pages.LoginPage();
	   salepg=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 
	   setPg=salepg.clickOnSetupLink();
  }
	
	@Test
  public void clickOnpaymentTermsLinkTest() {
		setPg.clickOnpaymentTermsLink();
		
	}

	 @AfterMethod
	 public void closeBrowser()
	  {
		  driver.quit();
	  }
}
