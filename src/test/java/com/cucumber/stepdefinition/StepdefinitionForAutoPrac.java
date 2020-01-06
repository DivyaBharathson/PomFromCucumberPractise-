package com.cucumber.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.SeleniumBaseClass;
import com.cucumber.helper.POM_Manager;
import com.cucumber.pom.AutomationPracticeSiteHomePOM;
import com.cucumber.pom.AutomationSiteProductPurchasePOM;
import com.cucumber.pom.FacebookLoginPOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefinitionForAutoPrac extends SeleniumBaseClass {
	
	public static WebDriver driver;
	public static POM_Manager po = new POM_Manager();
	
	@Given("^User launch the Automation practise application$")
	public void user_launch_the_Automation_practise_application() throws Throwable {
		driver = browserLaunch("chrome");
		getUrl("http://automationpractice.com/index.php");
	}
	
	@When("^User click on the SignIn button$")
	public void user_click_on_the_SignIn_button() throws Throwable {
		clickOnTheElement(po.getHomePage().getSignIn());
	}

	@And("^User enter the username in the username field$")
	public void user_enter_the_username_in_the_username_field() throws Throwable {
		AutomationSiteProductPurchasePOM ap=new AutomationSiteProductPurchasePOM();
		inputValuesInElement(ap.getEmailToSignIn(), "divya.madvem@gmail.com");
	}

	@And("^User enter the password in the password field$")
	public void user_enter_the_password_in_the_password_field() throws Throwable {
		AutomationSiteProductPurchasePOM ap=new AutomationSiteProductPurchasePOM();
		inputValuesInElement(ap.getPassToSignIn(), "qwerty");
	}

	@And("^User click on the login button in the signin page$")
	public void user_click_on_the_login_button() throws Throwable {
		AutomationSiteProductPurchasePOM ap=new AutomationSiteProductPurchasePOM();
		clickOnTheElement(ap.getSignIn());
	}
	
	@Then("^User validate logged in or not$")
	public void user_validate_logged_in_or_not() throws Throwable {

		AutomationPracticeSiteHomePOM ah=new AutomationPracticeSiteHomePOM();
		Assert.assertTrue(ah.getToValidateLogin().isDisplayed());
	}

	
}



