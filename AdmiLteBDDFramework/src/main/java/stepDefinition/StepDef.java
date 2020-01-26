package stepDefinition;

import java.util.List;
import java.util.Map;



import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef

{
	public static WebDriver driver;
	
	@Before   //global hook
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vayuva/Desktop/oooOffline%20Website%20_%20new/index.html");
	}
	
	@After
	public void closeBrowser()
	{
		driver.quit();	
	}


	//\"(.*)\"

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\" and clicks on login button$")
	public void user_enter_username_and_password_and_clicks_on_login_button(String username, String password) 
	{
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^user login should successful and user enter on Home page$")
	public void user_login_should_successful_and_user_enter_on_Home_page()  {
		String title=driver.getTitle();
		Assert.assertEquals("AdminLTE 2 | Dashboard", title);
	}
	
	


@When("^user clicks on Users link and clicks on Add user button$")
public void user_clicks_on_Users_link_and_clicks_on_Add_user_button() {
	driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.xpath("//button[text()='Add User']")).click();
   
}
@Then("^users fills the content as \"([^\"]*)\" ,\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
public void users_fills_the_content_as_and(String username, String mobile, String email, String gender, String state, String password)
{
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("mobile")).sendKeys(mobile);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id(gender)).click();
	WebElement statee=driver.findElement(By.xpath("//select[@class='form-control']"));
	Select select=new Select(statee);
	select.selectByVisibleText(state);
	driver.findElement(By.id("password")).sendKeys(password);
}

@Then("^clicks on submit button$")
public void clicks_on_submit_button()  {
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("^the pop up should popped up with successful user added message$")
public void the_pop_up_should_popped_up_with_successful_user_added_message() {
	Alert alert=driver.switchTo().alert();
	
	System.out.println(alert.getText());
}

@When("^user clicks on opertors link$")
public void user_clicks_on_opertors_link()
{
	driver.findElement(By.linkText("Operators")).click();	
}

@Then("^verify operators page$")
public void verify_operators_page() 
{
	String oprTitle=driver.getTitle();
	String title="AdminLTE 2 | Operators";
	  Assert.assertEquals(title,oprTitle);
}

@When("^user clicks on Logout$")
public void user_clicks_on_Logout() {
	driver.findElement(By.linkText("Logout")).click();

}

@Then("^user should land on Login page$")
public void user_should_land_on_Login_page(){
	String msg=driver.findElement(By.xpath("//p[text()='Logout successfully']")).getText();
	  Assert.assertEquals(msg,"Logout successfully");
	  Assert.assertEquals(driver.getTitle() ,"AdminLTE 2 | Log in");


	
}



	
/*
//data driven by using data tables

@When("^user enter username and password and clicks on login button$")
public void user_enter_username_and_password_and_clicks_on_login_button(DataTable credential)  {
	Map<String, String> data= (Map<String, String>) credential.asMaps(String.class, String.class);
	driver.findElement(By.id("email")).sendKeys(data.get("username"));
	driver.findElement(By.id("password")).sendKeys(data.get("password"));
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}*/
}


