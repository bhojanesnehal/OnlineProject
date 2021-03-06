package com.jbkclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbkclass.qa.base.TestBase;

public class SalesPage  extends TestBase
{
	
	@FindBy(xpath="//a[contains(text(),'urchases')]	")
	WebElement PurchasesLink;
	
	@FindBy(xpath="//a[contains(text(),'anufacturing')]	")
	WebElement manufacturingLink;

	@FindBy(xpath="//a[contains(text(),'tems and Inventory')]	")
	WebElement itemInventoryLink;
	
	@FindBy(xpath="//a[contains(text(),'ixed Assets')]	")
	WebElement fixedAssetsLink;
	
	@FindBy(xpath="//a[contains(text(),'imensions')]	")
	WebElement dimensionsLink;
	
	@FindBy(xpath="//a[contains(text(),'anking')]	")
	WebElement bankingLink;
	
	@FindBy(xpath="//u[text()='e']//parent::a")
	WebElement setupLink;
	
	@FindBy(xpath="//a[contains(text(),'Dashboard')]	")
	WebElement dashBoardLink;
	
	@FindBy(xpath="//a[contains(text(),'Help')]	")
	WebElement helpLink;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]	")
	WebElement logOutLink;
	
	@FindBy(xpath="//a[contains(text(),'Change')]	")
	WebElement chngPswrdLink;
	
	@FindBy(xpath="//a[contains(text(),'Preferences')]	")
	WebElement preferLink;
	
	public SalesPage()
	{
		PageFactory.initElements(driver, this);
	}

	public PurchasePage clickOnPurchaseLink() 
	{
		PurchasesLink.click();
		return new PurchasePage();
	}	
	
public ItemInventoryPage clickOnItemInventoryLink(){
		itemInventoryLink.click();
		return new ItemInventoryPage();
	}
public ManufacturingPage clickOnManufacturingLink(){
	manufacturingLink.click();
	
	return new ManufacturingPage();
}

public SetupPage clickOnSetupLink(){
	setupLink.click();
	return new SetupPage();
}
public DashboardPage clickOnDashboardLink(){
	dashBoardLink.click();
return new DashboardPage();
}
public PreferencePage clickOnPreferencesLink(){
	preferLink.click();
	return new PreferencePage();
}
public ChangePswrdPage clickOnChangePswrdLink(){
	chngPswrdLink.click();
	return new ChangePswrdPage();
}
public HelpPage clickOnHelpLink(){          //CHCEK THIS TOMORROW
	helpLink.click();
	return new HelpPage();
}
public LogoutPage clickOnLogutLink(){
	logOutLink.click();
	return new LogoutPage();
}
/*public FixedAssetsPage clickOnFixedAssetsLink(){
fixedAssetsLink.click();
return new FixedAssetsPage();
}
public DimensionPage clickOnDimensionsLink(){
dimensionsLink.click();
return new DimensionPage();
}
public BankingPage clickOnBankingLink(){
bankingLink.click();
return new BankingPage();
}*/

}
