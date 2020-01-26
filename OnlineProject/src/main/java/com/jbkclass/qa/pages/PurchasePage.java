package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbkclass.qa.base.TestBase;

public class PurchasePage  extends TestBase {
	
	
	@FindBy(xpath="//a[contains(text(),'ayments to Suppliers')]")
	WebElement paymentToSuppliers;
	
	public PurchasePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public PaymentPage clickOnPaymnetToSupplierLink()
	{
		paymentToSuppliers.click();
		
		return new PaymentPage();
		
	}
}
