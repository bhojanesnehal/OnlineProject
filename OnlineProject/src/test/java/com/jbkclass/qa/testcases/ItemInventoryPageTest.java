package com.jbkclass.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbkclass.qa.base.TestBase;
import com.jbkclass.qa.pages.InventoryItemMovementsPage;
import com.jbkclass.qa.pages.ItemInventoryPage;
import com.jbkclass.qa.pages.PurchasePage;
import com.jbkclass.qa.pages.SalesPage;

public class ItemInventoryPageTest extends TestBase
{
	com.jbkclass.qa.pages.LoginPage logpg;	
	SalesPage salepg;
	PurchasePage purchasePg;	
	ItemInventoryPage itm;
	  InventoryItemMovementsPage Iimp;
	public ItemInventoryPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
  {
	  initialization();
	   logpg=new com.jbkclass.qa.pages.LoginPage();
	   salepg=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 
	    itm=salepg.clickOnItemInventoryLink();
  }
	
  @Test
  public void clickOnInventoryItemMovementsLinkTest()
{
	   Iimp=itm.clickOnInventoryItemMovementsLink();
  }
  @AfterMethod
	 public void closeBrowser()
	  {
		  driver.quit();
	  }
}
