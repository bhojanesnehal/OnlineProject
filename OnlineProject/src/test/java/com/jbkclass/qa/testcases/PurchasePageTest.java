package com.jbkclass.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbkclass.qa.base.TestBase;
import com.jbkclass.qa.pages.PurchasePage;
import com.jbkclass.qa.pages.SalesPage;

public class PurchasePageTest extends TestBase {
	com.jbkclass.qa.pages.LoginPage logpg;	
	SalesPage salepg;
	PurchasePage purchasePg;

	public PurchasePageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
  {
	  initialization();
	   logpg=new com.jbkclass.qa.pages.LoginPage();
	   salepg=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 
	   purchasePg=salepg.clickOnPurchaseLink();
  }
	
	@Test
  public void clickOnPaymnetToSupplierLinkTest() {
		purchasePg.clickOnPaymnetToSupplierLink();
  }

	 @AfterMethod
	 public void closeBrowser()
	  {
		  driver.quit();
	  }
}
