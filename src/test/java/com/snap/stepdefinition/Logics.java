package com.snap.stepdefinition;

import java.util.List;
import java.util.Set;

import com.snap.objectrepository.Pojo;
import com.snap.objectrepository.Pojo1;
import com.snap.resource.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Logics extends Base {

	@Given("launch the browser and go to snapdeal website")
	public void launch_the_browser_and_go_to_snapdeal_website() {
		url("https://www.snapdeal.com/");

	}

	@When("search for hair dryer and click on it then click on add to cart option")
	public void search_for_hair_dryer_and_click_on_it_then_click_on_add_to_cart_option() {

		Pojo p = new Pojo();
		fill(p.getSrcbox(), "philip hair dryer");
		
	}

	@Then("check url contains addToCart")
	public void check_url_contains_addToCart() {
		
		String url=driver.getCurrentUrl();
		boolean b=url.contains("snapdeal");
		Assert.assertTrue(b);

	}

}
