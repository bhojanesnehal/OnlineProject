package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbkclass.qa.base.TestBase;

public class SetupPage  extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Pa')]")
	WebElement paymentTermsLink;
	
	public SetupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public PaymentTermsPage clickOnpaymentTermsLink ()
	{
		paymentTermsLink.click();
		return new PaymentTermsPage();
	}
}
