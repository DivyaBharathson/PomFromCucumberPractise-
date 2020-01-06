package com.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.SeleniumBaseClass;

public class AutomationSiteProductPurchasePOM extends SeleniumBaseClass{
	
	@FindBy (xpath="(//a[contains(text(),'Sign out')])[2]")
	private WebElement signOut;

	@FindBy (id="email")
	private WebElement emailToSignIn;
	
	@FindBy (id="passwd")
	private WebElement passToSignIn;
	
	@FindBy (xpath="//i[@class='icon-lock left']")
	private WebElement SignIn;
	
	@FindBy (xpath="(//li[@class='address_title'])[1]")
	private WebElement tocheckAddress;
	
	@FindBy (xpath="//span[text()='Proceed to checkout']")
	private WebElement toCheckOut;
	
	@FindBy (xpath="(//span[contains(text(),'Proceed to checkout')])[2]")
	private WebElement finalCheckout;
	@FindBy (xpath="//a[@title='Pay by bank wire']")
	private WebElement payByWire;
	
	@FindBy (xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement placeOrder;
	
	public WebElement getSignOut() {
		return signOut;
	}

	public void setSignOut(WebElement signOut) {
		this.signOut = signOut;
	}

	public WebElement getEmailToSignIn() {
		return emailToSignIn;
	}

	public void setEmailToSignIn(WebElement emailToSignIn) {
		this.emailToSignIn = emailToSignIn;
	}

	public WebElement getPassToSignIn() {
		return passToSignIn;
	}

	public void setPassToSignIn(WebElement passToSignIn) {
		this.passToSignIn = passToSignIn;
	}

	public WebElement getSignIn() {
		return SignIn;
	}

	public void setSignIn(WebElement signIn) {
		SignIn = signIn;
	}

	public WebElement getTocheckAddress() {
		return tocheckAddress;
	}

	public void setTocheckAddress(WebElement tocheckAddress) {
		this.tocheckAddress = tocheckAddress;
	}

	public WebElement getToCheckOut() {
		return toCheckOut;
	}

	public void setToCheckOut(WebElement toCheckOut) {
		this.toCheckOut = toCheckOut;
	}

	public WebElement getFinalCheckout() {
		return finalCheckout;
	}

	public void setFinalCheckout(WebElement finalCheckout) {
		this.finalCheckout = finalCheckout;
	}

	public WebElement getPayByWire() {
		return payByWire;
	}

	public void setPayByWire(WebElement payByWire) {
		this.payByWire = payByWire;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	public void setPlaceOrder(WebElement placeOrder) {
		this.placeOrder = placeOrder;
	}

	public AutomationSiteProductPurchasePOM() {

		PageFactory.initElements(driver, this);
	}

}
