package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbkclass.qa.base.TestBase;

public class PreferencePage extends TestBase	{
	
	@FindBy(xpath="//td[text()='Display Setup']")
	WebElement displaySetupLabel;
	
	public PreferencePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String checkUrlOfPreferencesPage ()
	{
return driver.getCurrentUrl();	
	} 
}
