package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbkclass.qa.base.TestBase;

public class ItemInventoryPage  extends TestBase
{

	@FindBy(xpath="//u[text()='M'] //parent::a[contains(text(),'Inventory Item ')]")
	WebElement InventoryItemMovementsLink;
	
	public ItemInventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public InventoryItemMovementsPage clickOnInventoryItemMovementsLink()
	{
		InventoryItemMovementsLink.click();
		return new InventoryItemMovementsPage();
	}
}
