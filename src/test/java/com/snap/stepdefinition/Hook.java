package com.snap.stepdefinition;

import com.snap.resource.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Base{
	
	@Before
	
	public void browser() {
   launch();
	}

	
	@After
	
	public void end() {

		
	}
}
