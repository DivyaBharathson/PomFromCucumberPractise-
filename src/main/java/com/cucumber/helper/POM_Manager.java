package com.cucumber.helper;

import org.apache.commons.collections4.PredicateUtils;

import com.cucumber.pom.AutomationPracticeSiteHomePOM;
import com.cucumber.pom.AutomationSiteProductPurchasePOM;
import com.cucumber.pom.FacebookLoginPOM;

public class POM_Manager {
	
	private AutomationPracticeSiteHomePOM homePage;
	
	private AutomationSiteProductPurchasePOM purchasePage;
	
	private FacebookLoginPOM loginPage;

	public AutomationPracticeSiteHomePOM getHomePage() {
		if (homePage==null) {
			homePage = new AutomationPracticeSiteHomePOM();
		}
		return homePage;
	}

	public AutomationSiteProductPurchasePOM getPurchasePage() {
		if (purchasePage==null) {
			purchasePage = new AutomationSiteProductPurchasePOM();
		}
		return purchasePage;
	}

	public FacebookLoginPOM getLoginPage() {
		if (loginPage==null) {
			loginPage = new FacebookLoginPOM();
		}
		return loginPage;
	}
	
	

}
