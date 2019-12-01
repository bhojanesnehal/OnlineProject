package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.jbkclass.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(name="user_name_entry_field")
	WebElement userNm;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="SubmitUser")
	WebElement submitBtn;
	
	public LoginPage()
	{
	PageFactory.initElements(driver, this);	
	}
	 
	public SalesPage login(String un, String pass)
	{
		//System.out.println("data"+un+pass);
		userNm.sendKeys(un);	
		Password.sendKeys(pass);
		submitBtn.click();
		
		return new SalesPage();
	
	}
}
