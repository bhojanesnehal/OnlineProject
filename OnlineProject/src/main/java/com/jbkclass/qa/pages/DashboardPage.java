package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbkclass.qa.base.TestBase;

public class DashboardPage  extends TestBase
{
	
	@FindBy(xpath="//span[text()='Top 10 customers in fiscal year']")
	WebElement customersLabel;
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String checklabelsOfDashboardPage ()
	{
		return customersLabel.getText();
	}
}
