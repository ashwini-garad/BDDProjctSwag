package com.SwagLab.Steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.SwagLab.Pages.InventoryPage;
import com.SwagLab.Pages.LoginPage;
import com.SwagLab.Pages.checkoutPage;
import com.SwagLab.Utility.BrowerProvider;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkoutStep {
	LoginPage lp = new LoginPage(BrowerProvider.getDriver());
	InventoryPage ip = new InventoryPage(BrowerProvider.getDriver());
	checkoutPage cp = new checkoutPage(BrowerProvider.getDriver());

	@When("user click on checkout button")
	public void user_click_on_checkout_button() {
		System.out.println("checkout page is open....!");

		ip.ClickOnCartOption();
		System.out.println("####");

	}

	@Then("checkout page is visible")
	public void checkout_page_is_visible() {
		Assert.assertTrue(lp.getAppUrl().contains("cart"));
		System.out.println("user is on cart page");

	}

	@When("user click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		cp.clickoncheckoutButton();
	}

	@Then("cart page is visible")
	public void cart_page_is_visible() {
		Assert.assertTrue(lp.getAppUrl().contains("cart"));
		System.out.println("user is on cart page");
	}

	@When("user enter first name {string},last name {string} and address {string}")
	public void user_enter_first_name_last_name_and_address(String fname, String lname, String address) throws InterruptedException {
		cp.clickoncheckoutButton();
		System.out.println("******");
	    cp.clickcartBag();
	    cp.clickoncheckout();
		cp.checkoutYourInformation();
		System.out.println("user information filled correct...");

	}

	@When("user click on continue button")
	public void user_click_on_continue_button() {
		cp.clickoncountinue();

	}

	@Then("checkout display page should be display")
	public void checkout_display_page_should_be_display() {
		Assert.assertTrue(lp.getAppUrl().contains("checkout"));
		System.out.println("user is on checkout page");
	}

	
	}


