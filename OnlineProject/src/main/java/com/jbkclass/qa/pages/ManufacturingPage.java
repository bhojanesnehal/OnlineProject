package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbkclass.qa.base.TestBase;

public class ManufacturingPage  extends TestBase{

	@FindBy(xpath="//u[text()='B'] //parent::a[contains(text(),'ills Of Material')]")
	WebElement billsOfMaterialLInk;
	
	public ManufacturingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public BillOfMaterialsPage clickOnBillsOfMaterialLink()
	{
		billsOfMaterialLInk.click();
		return new BillOfMaterialsPage();
	}
}
