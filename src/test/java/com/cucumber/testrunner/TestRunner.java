package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.SeleniumBaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty",
			"html:src\\test\\resource\\com\\cucumber\\reports\\",
			"json:src\\test\\resource\\com\\cucumber\\reports\\cucumber.json",
			"junit:src\\test\\resource\\com\\cucumber\\reports\\cucumber.xml"
		
		},
		features = "src\\test\\java\\com\\cucumber\\feature", glue = "com.cucumber.stepdefinition", tags = {
				"@fb" ,"~@Ignore"}, dryRun = false, monochrome=true, strict=true)

public class TestRunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void driverInitilization() throws Throwable {
		driver = SeleniumBaseClass.browserLaunch("chrome");
	}
	
	@AfterClass
	public static void driverQuit() {
		driver.quit();
	}
}
