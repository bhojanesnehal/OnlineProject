package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbkclass.qa.base.TestBase;

public class ChangePswrdPage  extends TestBase 
{
	@FindBy(name="cur_password")
	WebElement cur_password;
	
	@FindBy(name="password")
	WebElement newPassword;
	
	@FindBy(name="passwordConfirm")
	WebElement passwordConfirm;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement chnagePassBtn;
	@FindBy(xpath="//div[text()='Your password has been updated.']")
	WebElement msg;
	public ChangePswrdPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
		public String chnagePassword (String currentPass, String newPass)
		{
		cur_password.sendKeys(currentPass);
		newPassword.sendKeys(newPass);
		passwordConfirm.sendKeys(newPass);
		 chnagePassBtn.click();
		 return msg.getText();
		
		 
		
	}
}
