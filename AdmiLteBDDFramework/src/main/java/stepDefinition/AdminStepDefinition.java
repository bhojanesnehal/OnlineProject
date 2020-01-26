package stepDefinition;


import org.testng.Assert;

import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStepDefinition extends TestBase{

	LoginPage loginPg;
	DashboardPage Dash;
	
	@Given("^user opens the browser and enters the AdminLtE url in browser$")
	public void user_opens_the_browser_and_enters_the_AdminLtE_url_in_browser() {
		TestBase.initialization();
		  
	}

	@Then("^login page opens$")
	public void login_page_opens(){
		loginPg=new LoginPage();
		String title=loginPg.validateLoginPageTitle();
		Assert.assertEquals("AdminLTE 2 | Log in", title);

	}

	@When("^user enter username and password and clicks on login button$")
	public void user_enter_username_and_password_and_clicks_on_login_button() {
		   Dash=loginPg.login(prop.getProperty("username"), prop.getProperty("password")); 

	}
	@Then("^user login should successful and user enter on dashboard page$")
	public void user_login_should_successful_and_user_enter_on_dashboard_page() {
		String dasTitle=Dash.verifydashboardPageTitle();
		Assert.assertEquals("AdminLTE 2 | Dashboard", dasTitle);

	}

	@Then("^verify dashboard user name$")
	public void verify_dashboard_user_name() {
		String usernm=Dash.verifydashboardUserName();
		Assert.assertEquals("Kiran", usernm);

	}

	@Then("^verify Dashborad User Status$")
	public void verify_Dashborad_User_Status(){
		Assert.assertEquals("Online", Dash.verifyDashboradUserStatus()
);

	}

}
