package com.cucumber.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeHook() {
		System.out.println("Before Hook");
	}
	
	
	@After
	public void afterHook() {
		System.out.println("After Hook");

	}
}
