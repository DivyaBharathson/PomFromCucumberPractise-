package com.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.SeleniumBaseClass;

public class AutomationPracticeSiteHomePOM extends SeleniumBaseClass{
	
	@FindBy (xpath="//a[@class='login']")
	private WebElement signIn;
	
	
	
	@FindBy (id="search_query_top")
	private WebElement search;
	
	@FindBy (xpath="//button[@name='submit_search']")
	private WebElement searchButton;
	
	@FindBy (xpath="//a[@title='Women']")
	private WebElement womenMenu;
	
	@FindBy (xpath="//a[@title='Blouses']")
	private WebElement blousesSubMenu;
	
	@FindBy (xpath="//a[@title='Contact Us']")
	private WebElement contactUs;
	
	@FindBy (xpath="//span[contains(text(),'Divya')]")
	private WebElement toValidateLogin;
	
	
	public WebElement getToValidateLogin() {
		return toValidateLogin;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public void setSignIn(WebElement signIn) {
		this.signIn = signIn;
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public WebElement getWomenMenu() {
		return womenMenu;
	}

	public void setWomenMenu(WebElement womenMenu) {
		this.womenMenu = womenMenu;
	}

	public WebElement getBlousesSubMenu() {
		return blousesSubMenu;
	}

	public void setBlousesSubMenu(WebElement blousesSubMenu) {
		this.blousesSubMenu = blousesSubMenu;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public void setContactUs(WebElement contactUs) {
		this.contactUs = contactUs;
	}

	public AutomationPracticeSiteHomePOM() {
		PageFactory.initElements(driver, this);
	}

}
