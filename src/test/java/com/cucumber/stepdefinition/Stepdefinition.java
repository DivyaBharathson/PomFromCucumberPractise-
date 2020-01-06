package com.cucumber.stepdefinition;

import org.junit.Assert;
import org.junit.rules.TestRule;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.SeleniumBaseClass;
import com.cucumber.helper.POM_Manager;
import com.cucumber.pom.FacebookLoginPOM;
import com.cucumber.testrunner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends SeleniumBaseClass {

	public static WebDriver driver =TestRunner.driver;
	public static POM_Manager po = new POM_Manager();
	
	@Given("^User launch the facebook application$")
	public void user_launch_the_facebook_application() throws Throwable {
		getUrl("https://www.facebook.com");
	}
	

	@Given("^User enter the \"([^\"]*)\" in the username feild$")
	public void user_enter_the_in_the_username_feild(String arg1) throws Throwable {
		inputValuesInElement(po.getLoginPage().getEmail(), arg1);
	}

	@Given("^User enter the \"([^\"]*)\" in the password feild$")
	public void user_enter_the_in_the_password_feild(String arg1) throws Throwable {
		inputValuesInElement(po.getLoginPage().getPass(), arg1);
	}

	
	@When("^User enter the username in the username feild$")
	public void user_enter_the_username_in_the_username_feild() throws Throwable {
		inputValuesInElement(po.getLoginPage().getEmail(), "test@gmail.com");
	}

	@When("^User enter the password in the password feild$")
	public void user_enter_the_password_in_the_password_feild() throws Throwable {
		inputValuesInElement(po.getLoginPage().getPass(), "2345tgfdsdf");
	}

	@When("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		clickOnTheElement(po.getLoginPage().getLogIn());
	}

	@Then("^User validate the username present in the header$")
	public void user_validate_the_username_present_in_the_header() throws Throwable {

	}

	@Then("^User close the browser$")
	public void user_close_the_browser() throws Throwable {
		driver.quit();
	}

	@Then("^User validate the fb logo present in the page$")
	public void user_validate_the_fb_logo_present_in_the_page() throws Throwable {

		FacebookLoginPOM fb = new FacebookLoginPOM();
		Assert.assertTrue(fb.getGotoFB().isDisplayed());
	}

	@Then("^User validate page title$")
	public void user_validate_page_title() throws Throwable {

		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
	}

	@Then("^User click on forget password link$")
	public void user_click_on_forget_password_link() throws Throwable {
		FacebookLoginPOM fb = new FacebookLoginPOM();
		clickOnTheElement(fb.getForgetAcc());
	}
}
