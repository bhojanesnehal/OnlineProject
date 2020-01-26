package com.jbkclass.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbkclass.qa.base.TestBase;
import com.jbkclass.qa.pages.ChangePswrdPage;
import com.jbkclass.qa.pages.DashboardPage;
//import com.jbkclass.qa.pages.FixedAssetsPage;
import com.jbkclass.qa.pages.HelpPage;
import com.jbkclass.qa.pages.ItemInventoryPage;
import com.jbkclass.qa.pages.LoginPage;
import com.jbkclass.qa.pages.LogoutPage;
import com.jbkclass.qa.pages.ManufacturingPage;
import com.jbkclass.qa.pages.PreferencePage;
import com.jbkclass.qa.pages.PurchasePage;
import com.jbkclass.qa.pages.SalesPage;

public class SalesPageTest extends TestBase 
{
LoginPage logpg;	
	SalesPage salepg;
	PurchasePage purchasePg;
	ItemInventoryPage itmPg;
	ManufacturingPage manufPg;
	/*//FixedAssetsPage fixedPg;
	DimensionPage dimenPg;
	BankingPage bankPg;
*/	DashboardPage dashPg;
	PreferencePage preferPg;
	ChangePswrdPage pswrdPg;
	HelpPage helpPg;
	 LogoutPage logoutPg;
		public SalesPageTest()
		{
			super();
		}

		@BeforeMethod
		public void setUp()
	  {
		  initialization();
		   logpg=new LoginPage();
		   salepg=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 
	  }
		
		@Test
		 public void clickOnPurchaseLinkTest()
		  {
			 purchasePg=salepg.clickOnPurchaseLink();
		  }
		@Test
		 public void clickOnItemInventoryLinkTest()
		 {
			 itmPg=salepg.clickOnItemInventoryLink();
		  }
		@Test
		 public void clickOnManufacturingLinkTest()
		  {
			 manufPg=salepg.clickOnManufacturingLink();
		  }
		/*@Test
		 public void clickOnFixedAssetsLinkTest()
		  {
			 fixedPg=salepg.clickOnFixedAssetsLink();
		  }*/
	/*	@Test
		 public void clickOnDimensionsLinkTest()
		  {
			 dimenPg=salepg.clickOnDimensionsLink();
		  }
		@Test
		 public void clickOnBankingLinkTest()
		  {
			  bankPg=salepg.clickOnBankingLink();
		  }*/
		@Test
		 public void clickOnDashboardLinkTest()
		  {
			 dashPg=salepg.clickOnDashboardLink();
		  }
		@Test
		 public void clickOnPreferencesLinkTest()
		  {
			  preferPg=salepg.clickOnPreferencesLink();
		  }
		@Test
		 public void clickOnChangePswrdLinkTest()
		  {
			  pswrdPg=salepg.clickOnChangePswrdLink();
		  }
		
		@Test
		 public void clickOnHelpLinkTests()
		  {
			 // helpPg=salepg.clickOnHelpLink();
		  }
		@Test
		 public void clickOnLogutLinkTest()
		  {
			  logoutPg=salepg.clickOnLogutLink();
		  }
		 @AfterMethod
		 public void closeBrowser()
		  {
			  driver.quit();
		  }
}
