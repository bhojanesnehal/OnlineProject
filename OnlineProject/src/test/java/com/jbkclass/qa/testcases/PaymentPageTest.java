package com.jbkclass.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jbkclass.qa.base.TestBase;
import com.jbkclass.qa.pages.PaymentPage;
import com.jbkclass.qa.pages.PaymentSuccessPage;
import com.jbkclass.qa.pages.PurchasePage;
import com.jbkclass.qa.pages.SalesPage;
import com.jbkclass.qa.utility.TestUtil;

public class PaymentPageTest extends TestBase
{
	com.jbkclass.qa.pages.LoginPage logpg;	
	SalesPage salepg;
	PurchasePage purchasePg;
	PaymentPage paymnePg;
	PaymentSuccessPage successPg;
	
	public PaymentPageTest()
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
	   paymnePg= purchasePg.clickOnPaymnetToSupplierLink();
	   
  }
	
/*	@Test
	public void fillForm()
	{
		   paymnePg.fillSupplierPaymentEntryForm("AT", "Current account", "10", "2", "101", "done",);

	}*/
	@Test(dataProvider="paymentExceldata")
		public void fillForm(String at, String fromBnk, String bnkChrge, 
				  String discount,String  amountOfPayment,String  memo)	  {
		//System.out.println("whereeeee");
			   paymnePg.fillSupplierPaymentEntryForm( at,  fromBnk,  bnkChrge, 
						   discount,  amountOfPayment,  memo);
		  }	


  
  @DataProvider
    public Object[][] paymentExceldata()
  {
	  Object  info[][]=TestUtil.getTestdata("Payment");
	  System.out.println("Array size :"+info.length);
	  return info;
  }
  
  @AfterMethod
	 public void closeBrowser()
	  {
		  driver.quit();
	  }
}
