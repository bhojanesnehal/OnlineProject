package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbkclass.qa.base.TestBase;

public class LogoutPage  extends TestBase{
	
	@FindBy(xpath="//font[contains(text(),'Thank you for using ')]")
	WebElement logOutMsg;
	@FindBy(xpath="//b[contains(text(),'Click here to Login Again.')]")
	WebElement loginAgainLink;
	
	public LogoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
		public String logOutMsg ()
		{
			return logOutMsg.getText();
		}

		public LoginPage loginAgainLink ()
		{
			loginAgainLink.click();
		return new LoginPage();	
		}
}
