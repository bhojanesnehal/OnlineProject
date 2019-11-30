package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbkclass.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//td[text()='User name']")
	WebElement userNm;
	
	@FindBy(xpath="//td[text()='Password:']")
	WebElement Password;
	
	@FindBy(name="SubmitUser")
	WebElement submitBtn;
	
	public LoginPage()
	{
	PageFactory.initElements(driver, this);	
	}
	 
	public SalesPage login(String un, String pass)
	{
		userNm.sendKeys(un);	
		Password.sendKeys(prop.getProperty(pass));	
		submitBtn.click();
		
		return new SalesPage();
	
	}
}
