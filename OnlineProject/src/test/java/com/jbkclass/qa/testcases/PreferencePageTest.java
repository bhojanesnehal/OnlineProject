package com.jbkclass.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbkclass.qa.base.TestBase;
import com.jbkclass.qa.pages.PreferencePage;
import com.jbkclass.qa.pages.SalesPage;
import com.jbkclass.qa.pages.SetupPage;

public class PreferencePageTest extends TestBase{
  
	com.jbkclass.qa.pages.LoginPage logpg;	
	SalesPage salepg;
	SetupPage setPg;
	PreferencePage prefPg;	
	public PreferencePageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
  {
	  initialization();
	   logpg=new com.jbkclass.qa.pages.LoginPage();
	   salepg=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 
	    prefPg=salepg.clickOnPreferencesLink();
  }
	
	@Test
  public void checkUrlOfPreferencesPageTest () {
		String url=prefPg.checkUrlOfPreferencesPage();
		Assert.assertEquals(url, "https://javaclassesinpune.com/projects/frontaccounting/admin/display_prefs.php?", "does not match URL");

	}

	 @AfterMethod
	 public void closeBrowser()
	  {
		  driver.quit();
	  }
}
