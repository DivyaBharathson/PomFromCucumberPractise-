package com.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.SeleniumBaseClass;

public class FacebookLoginPOM extends SeleniumBaseClass {

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "pass")
	private WebElement pass;

	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement logIn;

	@FindBy(linkText = "Forgotten account?")
	private WebElement forgetAcc;

	@FindBy(xpath = "//a[@title='Go to Facebook home']")
	private WebElement gotoFB;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getForgetAcc() {
		return forgetAcc;
	}

	public WebElement getGotoFB() {
		return gotoFB;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public void setLogIn(WebElement logIn) {
		this.logIn = logIn;
	}

	public FacebookLoginPOM() {
		PageFactory.initElements(driver, this);
	}

}
