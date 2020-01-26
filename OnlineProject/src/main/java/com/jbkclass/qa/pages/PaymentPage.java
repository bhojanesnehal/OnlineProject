package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbkclass.qa.base.TestBase;

public class PaymentPage extends TestBase	 {

	@FindBy(xpath="//select[@id='supplier_id']")
	WebElement paymentToLabel;	
	@FindBy(xpath="//select[@id='bank_account']")
	WebElement bankAccLabel;
	@FindBy(xpath="//input[@name='charge']")
	WebElement bankchrgLabel;
	@FindBy(xpath="//input[@name='discount']")
	WebElement discountLabel;
	@FindBy(xpath="//input[@name='amount']")
	WebElement amountOfPaymentLabel;
	@FindBy(xpath="//textarea[@name='memo_']")
	WebElement memoLabel;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement enterPaymnetBtn;
	public PaymentPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fillSupplierPaymentEntryForm(String at, String fromBnk, String bnkChrge, String discount, 
			String amountOfPayment,	String memo)
	{
		Select select=new Select(paymentToLabel);
		select.selectByVisibleText(at);
		Select bnk=new Select(bankAccLabel);
		bnk.selectByVisibleText(fromBnk);
		
		bankchrgLabel.sendKeys(bnkChrge);
		discountLabel.sendKeys(discount);
		amountOfPaymentLabel.sendKeys(amountOfPayment);
		memoLabel.sendKeys(memo);
		
		enterPaymnetBtn.click();
		//return new PaymentSuccessPage();
		
	}
	
}
